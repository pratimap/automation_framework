package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectrepository.HomePage;
import objectrepository.LoginPage;
import objectrepository.WelcomePage;

public class BaseClass {
	
	public static ExtentReports extReport;
	public static WebDriver driver;
	public static ExtentTest test;
	
	public JavaUtility jUtil= new JavaUtility();
	public FileUtility fUtil= new FileUtility();
	public WebDriverUtility wUtil= new WebDriverUtility();
	
	@BeforeSuite
	public void reportConfig()
	{
		
		ExtentSparkReporter spark= new ExtentSparkReporter("./HTML_Reports/extentReport_"+jUtil.getSystemTime()+".html");
		
		extReport=new ExtentReports();
		
		extReport.attachReporter(spark);
		
	}
	
	@BeforeClass
	public void openBrowser() throws IOException
	{
	    driver= new ChromeDriver();
		wUtil.maximize(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(fUtil.getDatafromProperty("url"));
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		WelcomePage wp= new WelcomePage(driver);
		
		wp.getLoginLink().click();
		
		LoginPage lp= new LoginPage(driver);
		lp.getEmailId().sendKeys(fUtil.getDatafromProperty("email"));
		lp.getPassword().sendKeys(fUtil.getDatafromProperty("password"));
		lp.getLogin().click();
	}
	
	@AfterMethod
	
	public void logout()
	{
		HomePage hp= new HomePage(driver);
		hp.getLogoutLink().click();
	}
	
	@AfterSuite
	public void reportBackUp()
	{
		extReport.flush();
	}

}

package apparelandshoes;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import objectrepository.HomePage;


public class ClickOnApparelAndShoesTest extends BaseClass{
	
	@Test
	public void clickOnApparelAndshoes()
	{
		ExtentTest test = extReport.createTest("clickOnApparelAndshoes");
		
		HomePage hp= new HomePage(driver);
		hp.getApparelAndShoesLink().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Apparel & Shoes", "Apparel & Shoes page is not displayed");
		test.log(Status.PASS, "Apparel & Shoes page is displayed");
	}

}

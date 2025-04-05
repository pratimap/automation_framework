package books;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListernerUtility;
import objectrepository.HomePage;

@Listeners(ListernerUtility.class)
public class TC_DWS_001_Test extends BaseClass {
	@Test
	public void clickOnBooks() {
		ExtentTest test = extReport.createTest("clickOnBooks");

		HomePage hp = new HomePage(driver);
		hp.getBooksLink().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books", "Book Page is not displayed");
		test.log(Status.PASS, "Book page is displayed");
		test.log(Status.PASS, "Book page is displayed");

	}
}

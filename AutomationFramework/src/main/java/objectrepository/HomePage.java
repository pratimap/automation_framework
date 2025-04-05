package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(linkText="Log out")
	private WebElement logoutLink;
	
	@FindBy(linkText="BOOKS")
	private WebElement booksLink;
	
	@FindBy(linkText="Apparel & Shoes")
	private WebElement apparelAndShoesLink;
	
	@FindBy(linkText="Digital downloads")
	private WebElement digitalDownloadLink;
	
	@FindBy(linkText="Jewelry")
	private WebElement JewelryLink;
	
	@FindBy(linkText="Gift Cards")
	private WebElement giftCardsLink;
	
	@FindBy(linkText="Computers")
	private WebElement computersLink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getApparelAndShoesLink() {
		return apparelAndShoesLink;
	}

	public WebElement getDigitalDownloadLink() {
		return digitalDownloadLink;
	}

	public WebElement getJewelryLink() {
		return JewelryLink;
	}

	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}


	
	
}

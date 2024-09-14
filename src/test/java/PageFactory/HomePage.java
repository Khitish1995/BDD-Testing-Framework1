package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(text(),'Products')]")
	WebElement txt_ProductLogo;
	
	public void verifyUserLandedOnHomePage() throws InterruptedException {
		Thread.sleep(2000);
		txt_ProductLogo.isDisplayed();
	}

}

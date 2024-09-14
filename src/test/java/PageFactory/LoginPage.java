package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='user-name']")
	WebElement txt_userName;

	@FindBy(xpath = "//input[@id='password']")
	WebElement txt_password;

	@FindBy(xpath = "//input[@id='login-button']")
	WebElement btn_Login;

	public void enterUsername(String username) {

		txt_userName.sendKeys(username);
	}

	public void enterPassword(String password) {

		txt_password.sendKeys(password);
	}

	public void clickLoginBttn() {

		btn_Login.click();
	}
}

/**package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	//ctrl+shift+o --> to download the packages for the given when then at a time
	
	
	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	    
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/v1/");
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
	    
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}
	@And("clicks on login button")
	public void clicks_on_login_button() {
	    // //input[@id='login-button']
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}

	@Then("User is navigated to Homepage")
	public void user_is_navigated_to_homepage() {
	    
		Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0, "User is navigated to Homepage");
	}

	@And("close the browser")
	public void close_the_browser() {
		
	    driver.close();
	}

} **/

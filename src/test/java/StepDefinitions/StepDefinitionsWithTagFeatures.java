package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsWithTagFeatures {
	WebDriver driver;
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	   System.out.println("Precondition");
	}
	@Given("some other precondition")
	public void some_other_precondition() {
		System.out.println("Precondition 2");
	}
	@When("I complete action")
	public void i_complete_action() {
		System.out.println("User Action");
	}
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("Final Output");
	}

}

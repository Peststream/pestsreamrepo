package com.infocrats.stepdefs;

import com.infocrats.steps.SignInSteps;
import com.infocrats.utils.Log;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefs {
	@Steps
	SignInSteps signinSteps;

	@Given("^User successfully logged into system with valid credentials$")
	public void i_have_navigated_to_the_peststream_page() {
		signinSteps.openURL();
		Log.info("I'm on peststream page");
	}

	
	@When("^I enter a credentials for \"([^\"]*)\"$")
	public void i_enter_a_credentials_for(String arg1) {
		signinSteps.loginToPeststream(arg1);
	}

	

	@When("^I can click sign in$")
	public void i_can_click_sign_in() {
		Log.info("Clicking signin button");
		signinSteps.clickLoginBtnStep();
		
	}

	@Then("^I am granted access to the system$")
	public void i_am_granted_access_to_the_system() {
		signinSteps.validateMAindashBoardPage();
	}

	@Then("^I am notified Incorrect username or password$")
	public void i_am_notified_Incorrect_username_or_password() {
		signinSteps.validateErrorMessage();
	}
	@When("^I logout from peststream application$")
	public void i_logout_from_peststream_application() {
	    
	}
	
}

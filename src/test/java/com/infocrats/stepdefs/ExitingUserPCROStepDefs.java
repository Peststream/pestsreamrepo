package com.infocrats.stepdefs;

import com.infocrats.steps.ExitingUserPCROSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ExitingUserPCROStepDefs {
	
	@Steps
	ExitingUserPCROSteps exitinguserpcrosteps;
	

	@Then("^i choose an existing account \"([^\"]*)\"$")
	public void i_choose_an_existing_account(String arg1) {
		exitinguserpcrosteps.exitAcct(arg1);
	}
	
	@Then("^i chose service and sounce from respective DDL$")
	public void i_chose_service_and_sounce_from_respective_DDL() {
		exitinguserpcrosteps.serviceAndSource();
	}
	
	//2
	
	@When("^user clicked on customer tab in left panel$")
	public void user_clicked_on_customer_tab_in_left_panel() {
		
		exitinguserpcrosteps.customerTab();
	}

	@Then("^user clicked on opportunity subtab$")
	public void user_clicked_on_opportunity_subtab() {
		exitinguserpcrosteps.opportunityTab();
	}

	@Then("^user click on advance search button$")
	public void user_click_on_advance_search_button() {
		exitinguserpcrosteps.advSrchBtn();
	}

	@Then("^user click on open tap$")
	public void user_click_on_open_tap() {
		exitinguserpcrosteps.openTab();
	}

	@Then("^select opportunity$")
	public void select_opportunity() {
		exitinguserpcrosteps.selectOpp();
	}

	@Then("^user write a note$")
	public void user_write_a_note() {
		exitinguserpcrosteps.writeNote();
	}
	
	@Then("^package details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" on phone sales$")
	public void package_details_on_phone_sales(String arg1, String arg2, String arg3, String arg4, String arg5) {
	    // Write code here that turns the phrase above into concrete actions
		exitinguserpcrosteps.packageDetailsOnPhnSales();
	}

//	@Then("^click on save button on open opportunity action page$")
//	public void click_on_save_button_on_open_opportunity_action_page() {
//		exitinguserpcrosteps.svBtn();
//	}
	

}

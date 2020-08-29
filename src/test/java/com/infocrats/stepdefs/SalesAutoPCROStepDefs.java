package com.infocrats.stepdefs;

import com.infocrats.steps.SalesAutoPCROSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SalesAutoPCROStepDefs {

	@Steps
	SalesAutoPCROSteps salesautopcrosteps;

	@When("^i click on Appoinment tab$")
	public void i_click_on_Appoinment_tab() {
		salesautopcrosteps.appoinmentTab();
	}

	@Then("^i click on Sales Appoinment subtab$")
	public void i_click_on_Sales_Appoinment_subtab() {
		salesautopcrosteps.salesAppTab();
	}

	/*
	 * @Then("^select opportunity from scheduled$") public void
	 * select_opportunity_from_scheduled() { salesautopcrosteps.se }
	 */

	@Then("^package details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" on sales Appointment select service$")
	public void package_details_on_sales_Appointment_select_service(String arg1, String arg2, String arg3, String arg4,
			String arg5) {

		salesautopcrosteps.packageDetails();

	}

	@Then("^click on Add button$")
	public void click_on_Add_button() {
		salesautopcrosteps.addBtn();
	}

	@Then("^click on Add to agreement check buttonon sales Appointment select service$")
	public void click_on_Add_to_agreement_check_buttonon_sales_Appointment_select_service() {
		salesautopcrosteps.addToAgreement();
	}

	@Then("^click on save & sign agreement button on sales Appointment select service$")
	public void click_on_save_sign_agreement_button_on_sales_Appointment_select_service() throws Exception {
		salesautopcrosteps.svAndSignAgreementBtn();
	}

	@Then("^click on save and continue button on sales Appointment select service$")
	public void click_on_save_and_continue_button_on_sales_Appointment_select_service() {
		salesautopcrosteps.savContOnsalesApp();
	}

	@Then("^click on save and continue on Agreement tab on sales Appointment select service$")
	public void click_on_save_and_continue_on_Agreement_tab_on_sales_Appointment_select_service() {
		salesautopcrosteps.savContOnAgreementTab();
	}

	@Then("^click on send Agreement list on Agreement tab on sales Appointment select service$")
	public void click_on_send_Agreement_list_on_Agreement_tab_on_sales_Appointment_select_service() {
		salesautopcrosteps.sendAgreement();
	}

	@Then("^click on intial setup$")
	public void click_on_intial_setup() {
		salesautopcrosteps.intialSetup();
	}

}

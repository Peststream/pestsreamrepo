package com.infocrats.stepdefs;

import com.infocrats.steps.salesAppointmentStep;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class salesAppointmentStepDefs {

	@Steps
	salesAppointmentStep salessppointmentstep;

	/*
	 * @When("^i click on Appoinment tab$") public void i_click_on_Appoinment_tab()
	 * { salessppointmentstep.appoinmentTab(); }
	 */

	@When("^user click on Appointments tab$")
	public void user_click_on_Appointments_tab() {
		salessppointmentstep.appoinmentTab();
	}

	@Then("^user click on SalesApp$")
	public void user_click_on_SalesApp() {
		salessppointmentstep.SalesApp();
	}

	@Then("^user click on Opportunity$")
	public void user_click_on_Opportunity() {
		salessppointmentstep.Opportunity();
	}

	@Then("^user click on Save&Continue of generalInfo$")
	public void user_click_on_Save_Continue_of_generalInfo() {
		salessppointmentstep.ContgeneralInfo();
	}

	@Then("^user click on Continue of inspection$")
	public void user_click_on_Continue_of_inspection() {
		salessppointmentstep.Continueinspection();
	}

	@Then("^user click on DDCatSalesApp$")
	public void user_click_on_DDCatSalesApp() {
		salessppointmentstep.DDCatSalesApp();
	}

	@Then("^user click on DDServiceSalesApp$")
	public void user_click_on_DDServiceSalesApp() {
		salessppointmentstep.DDServiceSalesApp();
	}

	@Then("^user click on DDFrequencySalesApp$")
	public void user_click_on_DDFrequencySalesApp() {
		salessppointmentstep.DDFrequencySalesApp();
	}

	@Then("^user click on InternalNotes$")
	public void user_click_on_InternalNotes() {
		salessppointmentstep.InternalNotes();
	}

	@Then("^user click on saveBttn$")
	public void user_click_on_saveBttn() {
		salessppointmentstep.saveBttn();
	}

	@Then("^user click on Save&Continue of Service$")
	public void user_click_on_Save_Continue_of_Service() {
		salessppointmentstep.SaveContinueService();
	}

	@Then("^user click on NonStdRadioBttn$")
	public void user_click_on_NonStdRadioBttn() {
		salessppointmentstep.NonStdRadioBttn();
	}

	@Then("^user click on DDDepartment$")
	public void user_click_on_DDDepartment() {
		salessppointmentstep.DDDepartment();
	}

	@Then("^user click on Service$")
	public void user_click_on_Service() {
		salessppointmentstep.Service();
	}

	@Then("^user click on DDFreq$")
	public void user_click_on_DDFreq() {
		salessppointmentstep.DDFreq();
	}

	@Then("^user click on saveBttnNonStd$")
	public void user_click_on_saveBttnNonStd() {
		salessppointmentstep.saveBttnNonStd();
	}

	@Then("^user click on MarkAsLost$")
	public void user_click_on_MarkAsLost() {
		salessppointmentstep.MarkAsLost();
	}

	@Then("^user click on DDReason$")
	public void user_click_on_DDReason() {
		salessppointmentstep.DDReason();
	}

	@Then("^user click on SaveML$")
	public void user_click_on_SaveML() {
		salessppointmentstep.SaveML();
	}

}

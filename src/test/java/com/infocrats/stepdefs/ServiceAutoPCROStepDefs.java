package com.infocrats.stepdefs;

import com.infocrats.steps.ServiceAutoPCROSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ServiceAutoPCROStepDefs {

	@Steps
	ServiceAutoPCROSteps serviceautopcrosteps;

	@When("^user clicked on Appointment Tab$")
	public void user_clicked_on_Appointment_Tab() {
		serviceautopcrosteps.appointmentTab();
	}

	@Then("^user clicked on Service Appoinment Tab$")
	public void user_clicked_on_Service_Appoinment_Tab() {
		serviceautopcrosteps.serviceAppoinmentTab();
	}

}

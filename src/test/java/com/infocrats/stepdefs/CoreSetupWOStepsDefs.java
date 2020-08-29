package com.infocrats.stepdefs;

import com.infocrats.steps.CoreSetupWOSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CoreSetupWOStepsDefs {

	@Steps
	CoreSetupWOSteps coresetupwosteps;

	@When("^user clicked on Setups tab in left panel$")
	public void user_clicked_on_Setups_tab_in_left_panel() {
		coresetupwosteps.setupTab();
	}

	@Then("^user clicked on Advance Search Button$")
	public void user_clicked_on_Advance_Search_Button() throws Exception {
		coresetupwosteps.advSearchBtn();
	}

	@Then("^user clicked on Action Button$")
	public void user_clicked_on_Action_Button() throws Exception {
		coresetupwosteps.acionBtn();
	}

	@When("^user clicked on Service tab in left panel$")
	public void user_clicked_on_Service_tab_in_left_panel() throws Exception {
		coresetupwosteps.serviceTab();
	}

	@Then("^user clicked on Work Order$")
	public void user_clicked_on_Work_Order() throws Exception {

		coresetupwosteps.workOrderTab();
	}

	@Then("^user clicked on Advance Search Button on save work order$")
	public void advance_search_button() throws Exception {

		coresetupwosteps.advsearchBtn();
	}

	@Then("^click on save Button on save work order$")
	public void click_on_save_Button_on_save_work_order() throws Exception {

		coresetupwosteps.svWorkOrder();
	}

	@Then("^user clicked on Pending Setup tab$")
	public void user_clicked_on_Pending_Setup_tab() throws Exception {
		coresetupwosteps.pendingTab();
	}

	@Then("^Select Account from add icon$")
	public void select_Account_from_add_icon() throws Exception {

		coresetupwosteps.addIcon();
	}

	@Then("^check service from account$")
	public void check_service_from_account() throws Exception {
		coresetupwosteps.checkService();
	}

	@Then("^click on view setup icon$")
	public void click_on_view_setup_icon() throws Exception {
		coresetupwosteps.viewSetup();
	}

	@Then("^click on save Button on pending setups$")
	public void click_on_save_Button_on_pending_setups() throws Exception {
		coresetupwosteps.svBtn();
	}

}

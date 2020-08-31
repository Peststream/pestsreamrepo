package com.infocrats.stepdefs;

import com.infocrats.steps.batchManagementSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BatchManagementStepDefs {
	@Steps
	batchManagementSteps batchmanagementsteps;
	
	@When("^user clicked on batch management tab in left panel$")
	public void user_clicked_on_batch_management_tab_in_left_panel() throws Exception {
		batchmanagementsteps.BatchManagementBtn();
	}

	@Then("^User clicks on Add Batch Button$")
	public void user_clicks_on_Add_Batch_Button() throws Exception {
		batchmanagementsteps.AddBatchBtn();
	}

	@Then("^user Selects batch Type Work Order$")
	public void user_Selects_batch_Type_Work_Order() throws Exception {
		batchmanagementsteps.batchTypreRadio();
	}

	@Then("^User inputs New Batch Name and Batch Date$")
	public void user_inputs_New_Batch_Name_and_Batch_Date() throws Exception {
		batchmanagementsteps.batchNameDate();
	}

	@Then("^User selects the required number of work order to form a batch$")
	public void user_selects_the_required_number_of_work_order_to_form_a_batch() throws Exception {
		batchmanagementsteps.WorkOrderCheckBox();
	}

	@Then("^Clicks on Save Button$")
	public void clicks_on_Save_Button() throws Exception {
		batchmanagementsteps.SaveButtonBatch();
	}
	
	@Then("^User selects the desired Batch to be released$")
	public void clickOnBactchReleaseAction() throws Exception {
		batchmanagementsteps.batchRelease();
	}
	
	@Then("^User moves to Released Batch Tab$")
	public void releasedBatchTab() throws Exception {
		batchmanagementsteps.batchReleaseTab();
	}


}
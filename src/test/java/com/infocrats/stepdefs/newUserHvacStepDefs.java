package com.infocrats.stepdefs;

import com.infocrats.steps.newUserHvacSteps;
import com.infocrats.utils.Log;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class newUserHvacStepDefs {

	@Steps
	newUserHvacSteps newuserhvacsteps;

	@When("^user clicked on call tab btn$")
	public void user_clicked_on_call_tab_btn() throws InterruptedException {

		newuserhvacsteps.clickOnCallTab();
		Log.info("Clicked on Call Tab");
	}

	@Then("^verify page tittle of call Page$")

	public void i_am_able_to_verify_call_page_tittle() {
		newuserhvacsteps.verifyCallPageTittle();
		Log.info("Validated call page tittle");
	}

	@When("^enters lead info \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" details$")
	public void enters_lead_info(String CompanyName, String ContactName, String PrimaryEmail, String PrimaryPhone,
			String Cell, String SecondaryPhone) {
		newuserhvacsteps.enterLeadInfo();
	}

	@When("^select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details$")
	public void select_lead_branch() {
		newuserhvacsteps.selectBranch();
	}

	@Then("^User Add Account Alert and Account Description$")
	public void user_AddAcc_AlertAndDescription() {

		newuserhvacsteps.alertDesc();

	}

	@Then("^User Clicks On Continue$")
	public void userClicksContinue() {

		newuserhvacsteps.ContinueBtn();

	}

	@Then("^User Clicks on Schedule Estimation Radio$")
	public void scheduleEstimation() {

		newuserhvacsteps.scheduleEstimation();

	}

	@Then("^User select Opp type$")
	public void OppType() {

		newuserhvacsteps.OppType();

	}

	@Then("^User Add address line,zip and Select address sub type$")
	public void addressAndSubType() {

		newuserhvacsteps.addressLine();

	}

	@Then("^User selects the assigned employee$")
	public void assignedEmployee() {

		newuserhvacsteps.assignedTo();

	}

	@Then("^User clicks on save button$")
	public void saveButton() {

		newuserhvacsteps.SaveBtn();

	}

	@Then("^User selects the required Opp from Appointment Sales$")
	public void user_selects_the_required_Opp_from_Appointment_Sales() {
		newuserhvacsteps.reqAppointment();
	}

	@Then("^User Clicks on Save and Continue button and Continue Button$")
	public void user_Clicks_on_Save_and_Continue_button_and_Continue_Button() {
		newuserhvacsteps.SaveAndContSave();
	}

	@Then("^User clicks on Non Std repair and Add Repair name$")
	public void user_clicks_on_Non_Std_repair_and_Add_Repair_name() {
		newuserhvacsteps.NonStdRadioRepairName();
	}

	@Then("^User add Repair Cost and Clicks on Save Button$")
	public void user_add_Repair_Cost_and_Clicks_on_Save_Button() {
		newuserhvacsteps.CostSaveBtn();
	}

	@Then("^User clicks on Save and continue Button twice$")
	public void user_clicks_on_Save_and_continue_Button_twice() {
		newuserhvacsteps.saveContBtnTWICE();
	}

	@Then("^User agree terms and Condition and Enter Name$")
	public void user_agree_terms_and_Condition_and_Enter_Name() {
		newuserhvacsteps.agreeChckBoxName();
	}

	@Then("^User sign Sale Representative Sign$")
	public void user_sign_Sale_Representative_Sign() {
		newuserhvacsteps.sign();
	}

	@Then("^User clicks on Save And Continue$")
	public void user_clicks_on_Save_And_Continue() {
		newuserhvacsteps.saveContBtn();
	}

	@Then("^User send Mails$")
	public void user_send_Mails() {
		newuserhvacsteps.sendMail();
	}

	@Then("^User clicks on Range Time Radio and Select desired Range$")
	public void rangeTimeRadioDesiredRange() {
		newuserhvacsteps.rangeTimeRadioDesiredRange();
	}

	@Then("^User clicks on Field Radio Button$")
	public void fieldRadioButton() {
		newuserhvacsteps.fieldRadioButton();
	}

	@Then("^User clicks on Flat Rate Radio$")
	public void user_clicks_on_Flat_Rate_Radio() {
		newuserhvacsteps.flatRateRadioButton();
	}

	@Then("^User Add Job Description and Click on Add Button$")
	public void user_Add_Job_Description_and_Click_on_Add_Button() {
		newuserhvacsteps.jobDescAddButton();
	}

	@Then("^User selects Primary Route$")
	public void user_selects_Primary_Route() {
		newuserhvacsteps.primaryRoute();
	}

	@Then("^User clicks on Save button$")
	public void user_clicks_on_Save_button() {
		newuserhvacsteps.saveButton();
	}

	@Then("^User clicks on Advance Search in Work Order and Click on the desired Opportunity$")
	public void user_clicks_on_Advance_Search_in_Work_Order_and_Click_on_the_desired_Opportunity() {
		newuserhvacsteps.advanceSearchWorkOrderDesiredOpportunity();
	}

	@Then("^User Clicks on Save Button for HVAC SSC$")
	public void user_Clicks_on_Save_Button_for_HVAC_SSC() {
		newuserhvacsteps.saveBtnHVACSSC();
	}

	@Then("^user navigates to Service Appointments in the Appointment Tab$")
	public void user_navigates_to_Service_Appointments_in_the_Appointment_Tab() {
		newuserhvacsteps.serviceAppointment();
	}

	@Then("^User clicks on the desired Opportunity in Service Appointment Incomplete Tab$")
	public void user_clicks_on_the_desired_Opportunity_in_Service_Appointment_Incomplete_Tab() {
		newuserhvacsteps.desiredOpportunityServiceAppointment();
	}

	@Then("^User Clicks on Recieve, On my Way, Arrived, Start Repair$")
	public void user_Clicks_on_Recieve_On_my_Way_Arrived_Start_Repair() {
		newuserhvacsteps.Recieve_OnMyWay_Arrived_StartRepair();
	}

	@Then("^User clicks on Complete Sub Order$")
	public void user_clicks_on_Complete_Sub_Order() {
		newuserhvacsteps.completeSubOrder();
	}

	@Then("^User selects Payment Mode$")
	public void user_selects_Payment_Mode() {
		newuserhvacsteps.paymentMode();
	}

	@Then("^Customer Technician signature are provided$")
	public void customer_Technician_signature_are_provided() {
		newuserhvacsteps.customerTechnicianSign();
	}

	@Then("^User clicks on Complete Work Order$")
	public void user_clicks_on_Complete_Work_Order() {
		newuserhvacsteps.completeWorkOrder();
	}

	@Then("^User Add address line,zip$")
	public void Address_zip() {
		newuserhvacsteps.addressZip();
	}

	@Then("^User clicks on After Hour Radio$")
	public void afterHourRadio() {
		newuserhvacsteps.afterHourRadio();
	}

	@Then("^User selects Helper Radio$")
	public void HelperRadio() {
		newuserhvacsteps.HelperRadioBtn();
	}

	@Then("^User clicks on Time and Material$")
	public void TimeMaterial() {
		newuserhvacsteps.TimeMaterial();
	}

}

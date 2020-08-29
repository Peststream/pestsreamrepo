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
			String Cell, String SecondaryPhone) throws Exception {
		newuserhvacsteps.enterLeadInfo();
	}

	@When("^select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details$")
	public void select_lead_branch() throws Exception{
		newuserhvacsteps.selectBranch();
	}

	@Then("^User Add Account Alert and Account Description$")
	public void user_AddAcc_AlertAndDescription() throws Exception{

		newuserhvacsteps.alertDesc();

	}

	@Then("^User Clicks On Continue$")
	public void userClicksContinue()throws Exception {

		newuserhvacsteps.ContinueBtn();

	}

	@Then("^User Clicks on Schedule Estimation Radio$")
	public void scheduleEstimation()throws Exception {

		newuserhvacsteps.scheduleEstimation();

	}

	@Then("^User select Opp type$")
	public void OppType() throws Exception{

		newuserhvacsteps.OppType();

	}

	@Then("^User Add address line,zip and Select address sub type$")
	public void addressAndSubType() throws Exception{

		newuserhvacsteps.addressLine();

	}

	@Then("^User selects the assigned employee$")
	public void assignedEmployee() throws Exception{

		newuserhvacsteps.assignedTo();

	}

	@Then("^User clicks on save button$")
	public void saveButton() throws Exception{

		newuserhvacsteps.SaveBtn();

	}

	@Then("^User selects the required Opp from Appointment Sales$")
	public void user_selects_the_required_Opp_from_Appointment_Sales()throws Exception {
		newuserhvacsteps.reqAppointment();
	}

	@Then("^User Clicks on Save and Continue button and Continue Button$")
	public void user_Clicks_on_Save_and_Continue_button_and_Continue_Button() throws Exception{
		newuserhvacsteps.SaveAndContSave();
	}

	@Then("^User clicks on Non Std repair and Add Repair name$")
	public void user_clicks_on_Non_Std_repair_and_Add_Repair_name() throws Exception{
		newuserhvacsteps.NonStdRadioRepairName();
	}

	@Then("^User add Repair Cost and Clicks on Save Button$")
	public void user_add_Repair_Cost_and_Clicks_on_Save_Button() throws Exception{
		newuserhvacsteps.CostSaveBtn();
	}

	@Then("^User clicks on Save and continue Button twice$")
	public void user_clicks_on_Save_and_continue_Button_twice() throws Exception{
		newuserhvacsteps.saveContBtnTWICE();
	}

	@Then("^User agree terms and Condition and Enter Name$")
	public void user_agree_terms_and_Condition_and_Enter_Name() throws Exception{
		newuserhvacsteps.agreeChckBoxName();
	}

	@Then("^User sign Sale Representative Sign$")
	public void user_sign_Sale_Representative_Sign() throws Exception{
		newuserhvacsteps.sign();
	}

	@Then("^User clicks on Save And Continue$")
	public void user_clicks_on_Save_And_Continue() throws Exception{
		newuserhvacsteps.saveContBtn();
	}

	@Then("^User send Mails$")
	public void user_send_Mails() throws Exception{
		newuserhvacsteps.sendMail();
	}

	@Then("^User clicks on Range Time Radio and Select desired Range$")
	public void rangeTimeRadioDesiredRange()throws Exception {
		newuserhvacsteps.rangeTimeRadioDesiredRange();
	}

	@Then("^User clicks on Field Radio Button$")
	public void fieldRadioButton()throws Exception {
		newuserhvacsteps.fieldRadioButton();
	}

	@Then("^User clicks on Flat Rate Radio$")
	public void user_clicks_on_Flat_Rate_Radio() throws Exception{
		newuserhvacsteps.flatRateRadioButton();
	}

	@Then("^User Add Job Description and Click on Add Button$")
	public void user_Add_Job_Description_and_Click_on_Add_Button() throws Exception{
		newuserhvacsteps.jobDescAddButton();
	}

	@Then("^User selects Primary Route$")
	public void user_selects_Primary_Route() throws Exception{
		newuserhvacsteps.primaryRoute();
	}

	@Then("^User clicks on Save button$")
	public void user_clicks_on_Save_button() throws Exception{
		newuserhvacsteps.saveButton();
	}

	@Then("^User clicks on Advance Search in Work Order and Click on the desired Opportunity$")
	public void user_clicks_on_Advance_Search_in_Work_Order_and_Click_on_the_desired_Opportunity() throws Exception{
		newuserhvacsteps.advanceSearchWorkOrderDesiredOpportunity();
	}

	@Then("^User Clicks on Save Button for HVAC SSC$")
	public void user_Clicks_on_Save_Button_for_HVAC_SSC() throws Exception{
		newuserhvacsteps.saveBtnHVACSSC();
	}

	@Then("^user navigates to Service Appointments in the Appointment Tab$")
	public void user_navigates_to_Service_Appointments_in_the_Appointment_Tab() throws Exception{
		newuserhvacsteps.serviceAppointment();
	}

	@Then("^User clicks on the desired Opportunity in Service Appointment Incomplete Tab$")
	public void user_clicks_on_the_desired_Opportunity_in_Service_Appointment_Incomplete_Tab() throws Exception{
		newuserhvacsteps.desiredOpportunityServiceAppointment();
	}

	@Then("^User Clicks on Recieve, On my Way, Arrived, Start Repair$")
	public void user_Clicks_on_Recieve_On_my_Way_Arrived_Start_Repair() throws Exception{
		newuserhvacsteps.Recieve_OnMyWay_Arrived_StartRepair();
	}

	@Then("^User clicks on Complete Sub Order$")
	public void user_clicks_on_Complete_Sub_Order()throws Exception {
		newuserhvacsteps.completeSubOrder();
	}

	@Then("^User selects Payment Mode$")
	public void user_selects_Payment_Mode() throws Exception{
		newuserhvacsteps.paymentMode();
	}

	@Then("^Customer Technician signature are provided$")
	public void customer_Technician_signature_are_provided() throws Exception{
		newuserhvacsteps.customerTechnicianSign();
	}

	@Then("^User clicks on Complete Work Order$")
	public void user_clicks_on_Complete_Work_Order() throws Exception{
		newuserhvacsteps.completeWorkOrder();
	}

	@Then("^User Add address line,zip$")
	public void Address_zip() throws Exception{
		newuserhvacsteps.addressZip();
	}

	@Then("^User clicks on After Hour Radio$")
	public void afterHourRadio() throws Exception {
		newuserhvacsteps.afterHourRadio();
	}

	@Then("^User selects Helper Radio$")
	public void HelperRadio() throws Exception {
		newuserhvacsteps.HelperRadioBtn();
	}

	@Then("^User clicks on Time and Material$")
	public void TimeMaterial() throws Exception {
		newuserhvacsteps.TimeMaterial();
	}

}

package com.infocrats.stepdefs;

import com.infocrats.steps.newUserPCROSteps;
import com.infocrats.utils.Log;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class newUserPCROStepDefs {

	@Steps
	newUserPCROSteps newuserpcrosteps;

	@When("^user clicked on call tab in left panel$")
	public void click_on_call_button() throws InterruptedException {
		newuserpcrosteps.clickOnCallTab();
		Log.info("Clicked on Call Tab");
	}

	@Then("^verify page tittle of call page$")
	public void i_am_able_to_verify_call_page_tittle() {
		newuserpcrosteps.verifyCallPageTittle();
		Log.info("Validated call page tittle");
	}

	@When("^enters lead info \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void enters_lead_info(String CompanyName, String ContactName, String PrimaryEmail, String PrimaryPhone,
			String Cell, String SecondaryPhone) throws Exception {
		newuserpcrosteps.enterLeadInfo();
	}

	@When("^select lead branch \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void select_lead_branch(String BranchName, String Department, String PrimaryResonCall, String Service,
			String Source) {
		newuserpcrosteps.selectBranch();
	}

	@When("^I create lead$")
	public void i_create_lead() {
		newuserpcrosteps.leadBtn();
	}

	@When("^enters \"([^\"]*)\", \"([^\"]*)\"$")
	public void enters(String AccountAlert, String AccountDescription) throws Exception {
		newuserpcrosteps.enterAccountDescription();
	}

	@Then("^I click on Residential Radio button$")
	public void i_click_on_Residential_Radio_button() {

		newuserpcrosteps.residentialBtn();
	}

	@When("^click on continue button$")
	public void click_on_Continue_button() throws InterruptedException {
		newuserpcrosteps.continueBtn();
	}

	@When("^Enter account Id \"([^\"]*)\",$")
	public void enter_account_Id(String arg1) {
		newuserpcrosteps.accountId();
	}

	// save opportunity

	@Then("^Service address \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void service_address(String arg1, String arg2, String arg3, String arg4, String arg5) throws Exception {
		newuserpcrosteps.serviceAddress();
	}

	@Then("^check Is Tax Exempt$")
	public void check_Is_Tax_Exempt() {
		newuserpcrosteps.checkTaxExapt();

	}

	@Then("^Enter Tax Exemption$")
	public void enter_Tax_Exemption() throws Exception {
		newuserpcrosteps.enterTaxExemtion();
	}

	@Then("^IS Billing Address Different Than Service Address$")
	public void is_Billing_Address_Different_Than_Service_Address() {

		newuserpcrosteps.addressCheckBtn();
	}

	@Then("^Billing addess \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void billing_addess(String arg1, String arg2, String arg3, String arg4, String arg5) throws Exception {
		newuserpcrosteps.enterBillingAddress();
	}

	@When("^select package as \"([^\"]*)\"$")
	public void select_package_as(String arg1) {
		newuserpcrosteps.selectPackage();
	}

	@When("^package details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void package_details(String arg1, String arg2, String arg3, String arg4, String arg5) {
		newuserpcrosteps.packageDetails();
	}

	@Then("^click on Add Button$")
	public void click_on_Add_Button() {
		newuserpcrosteps.clickOnAddButton();
	}

	@Then("^click On Save Button$")
	public void click_On_Save_Button() {

		newuserpcrosteps.clickOnSave();
	}

	@Then("^click On Save & Proposal$")
	public void click_On_Save_Proposal() throws InterruptedException {

		newuserpcrosteps.saveAndProposal();
	}

	@Then("^enter proposal note$")
	public void enter_proposal_note() throws Exception {

		newuserpcrosteps.enterProposalNote();
	}

	@Then("^click on Send proposal button On review page$")
	public void click_on_Send_proposal_button_On_review_page() {

		newuserpcrosteps.sendProposalOnreview();
	}

	@Then("^add more email$")
	public void add_more_email() throws Exception {
		newuserpcrosteps.addMoreEmail();
	}

	@Then("^click add more email button$")
	public void click_add_more_email_button() {
		newuserpcrosteps.addMoreMailBtn();
	}

	@Then("^click send proposal button$")
	public void click_send_proposal_button() {
		newuserpcrosteps.sendProposalBtn();
	}

	@Then("^click on Add to agreement check button$")
	public void click_on_Add_to_agreement_check_button() {
		newuserpcrosteps.addToAgreementCheck_Btn();
	}

	@Then("^click on save & sign agreement button$")
	public void click_on_save_sign_agreement_button() {
		newuserpcrosteps.signAgreementBtn();
	}

	@Then("^enter additional note$")
	public void enter_additional_note() throws Exception {
		newuserpcrosteps.enterNotes();
	}

	@Then("^click on send agreement for customer signature$")
	public void click_on_send_agreement_for_customer_signature() {
		newuserpcrosteps.sendAgreementForSignature();
	}

	@Then("^choose mail address$")
	public void choose_mail_address() {
		newuserpcrosteps.mailAddressCheck_Btn();
	}

	@Then("^click on send Agreement list$")
	public void click_on_send_Agreement_list() {
		newuserpcrosteps.clickOnSendAgreement_Btn();
	}

	@Then("^click on service bundle radio button$")
	public void click_on_service_bundle_radio_button() throws Exception {
		newuserpcrosteps.serviceBundleRadio_Btn();
	}

	@Then("^Select service bundle$")
	public void select_service_bundle() {
		newuserpcrosteps.serviceBundle();
	}

	@Then("^click on billing Frequency DDl$")
	public void click_on_billing_Frequency_DDl() {
		newuserpcrosteps.billingFrequency_DDL();
	}

	@Then("^choose monthly frequency from DDL$")
	public void choose_monthly_frequency_from_DDL() {
		newuserpcrosteps.chooseFromFrequency_DDL();
	}

	@Then("^click on Add Bundle button$")
	public void click_on_Add_Bundle_button() {
		newuserpcrosteps.addBundle_Btn();
	}

	@Then("^check Add to agreement$")
	public void check_add_to_agreement() {
		newuserpcrosteps.bundleCheckBtn();
	}

	@Then("^click on non-standard service tab$")
	public void click_on_non_standard_service_tab() {
		newuserpcrosteps.nonStandardTab();
	}

	@Then("^click on department DDL$")
	public void click_on_department_DDL() {

		newuserpcrosteps.departmentDDl();
	}

	@Then("^choose department value$")
	public void choose_department_value() {

		newuserpcrosteps.departmentValue();
	}

	@Then("^enter service name$")
	public void enter_service_name() throws Exception {
		newuserpcrosteps.ServiceName();
	}

	@Then("^click billing frequency DDL$")
	public void click_billing_frequency_DDL() {
		newuserpcrosteps.nonStandardBillingFreqDDL();

	}

	@Then("^Choose billing frequency value$")
	public void choose_billing_frequency_value() {

		newuserpcrosteps.chooseBillingFrequencyValue();
	}

	@Then("^click on Add non standard service Add Button$")
	public void click_on_Add_non_standard_service_Add_Button() {

		newuserpcrosteps.nonStandardAddBtn();
	}

	@Then("^click on schedule estimation tab$")
	public void click_on_schedule_estimation_tab() {
		newuserpcrosteps.scheduleEstimationTab();

	}

	@Then("^click on save$")
	public void click_on_save() {

		newuserpcrosteps.saveInScheduleEstimation();
	}

	@Then("^click on assignedTo DDL and choose Value$")
	public void click_on_assignedTo_DDL_and_choose_Value() {
		newuserpcrosteps.getAssignedTOVaule();
	}

	@Then("^click on field radio button$")
	public void click_on_field_radio_button() {
		newuserpcrosteps.fieldRadioBtn();
	}

	@Then("^click on range time radio button$")
	public void click_on_range_time_radio_button() {
		newuserpcrosteps.rangeTimeRadioBtn();
	}

	@Then("^click on time range DDL and Choose value$")
	public void click_on_time_range_DDL_and_Choose_value() {
		newuserpcrosteps.getTimeRangeValue();
	}

	@Then("^click on second time range DDL and choose value$")
	public void click_on_second_time_range_DDL_and_choose_value() {
		newuserpcrosteps.getSecondTimeRangeValue();
	}

	@Then("^click On mark as lost button$")
	public void click_On_mark_as_lost_button() {
		newuserpcrosteps.markAsLostBtn();
	}

	@Then("^click on Reason DDL and choose reason$")
	public void get_Reason() {
		newuserpcrosteps.getReason();
	}

	@Then("^enter reason description$")
	public void reason_Description() throws Exception {
		newuserpcrosteps.reasonDescription();
	}

	@Then("^click on Save button$")
	public void click_on_Save_button() {
		newuserpcrosteps.saveInMarkAsLost();
	}

	@Then("^click on save & continue to setup button$")
	public void click_on_save_continue_to_setup_button() {
		newuserpcrosteps.saveContinueSetupBtn();
	}

	@Then("^choose service from service DDL in setups tab$")
	public void choose_service_from_service_DDL_in_setups_tab() {
		newuserpcrosteps.chooseServiceFromDDL();
	}

	@Then("^click on Add button in setups$")
	public void click_on_Add_button_in_setups() {
		newuserpcrosteps.addServiceBtn();
	}

	@Then("^choose frequency from DDL in setups$")
	public void choose_frequency_from_DDL_in_setups() {
		newuserpcrosteps.chooseFrequencyFromDDL();
	}

	@Then("^choose schedule from DDL in setups$")
	public void choose_schedule_from_DDL_in_setups() {
		newuserpcrosteps.chooseScheduleFromDDL();
	}

	@Then("^click on Save & Generate button in setups$")
	public void click_on_Save_Generate_button_in_setups() {
		newuserpcrosteps.saveGenerateBtn();
	}

	@Then("^choose primary route$")
	public void choose_primary_route() {
		newuserpcrosteps.choosePrimaryRoute();
	}

	@Then("^select start date and end date$")
	public void select_start_date_and_end_date() {
		newuserpcrosteps.startAndEndDate();
	}

	@Then("^click on genrate online work order$")
	public void click_on_genrate_online_work_order() {
		newuserpcrosteps.generateOnlineWO();
	}

	@Then("^Check all work order$")
	public void check_all_work_order() {
		newuserpcrosteps.checkAllWO();
	}

	@Then("^Click on publish online$")
	public void click_on_publish_online() {
		newuserpcrosteps.publishOnline();
	}

	@Then("^click on appointment and get into service appointment$")
	public void get_service_appointment() {
		newuserpcrosteps.getServiceAppointment();
	}

	@Then("^click on action button of work order$")
	public void click_on_action_button_of_work_order() {
		newuserpcrosteps.actionBtn();
	}

	@Then("^click Enter Current Time$")
	public void click_Enter_Current_Time() {
		newuserpcrosteps.currentTime();
	}

	@Then("^click save and continue button$")
	public void click_save_and_continue_button() {
		newuserpcrosteps.saveAndContinueBtn();
	}

	@Then("^choose payment mode$")
	public void choose_payment_mode() {
		newuserpcrosteps.paymentMode();
	}

	@Then("^enter Amount$")
	public void enter_Amount() {
		newuserpcrosteps.enterAmount();
	}

	@Then("^click save and continue on service details$")
	public void click_save_and_continue_button_service_details() {
		newuserpcrosteps.svContOnServiceDetails();
	}

	@Then("^take Technician and Customer signature$")
	public void take_Technician_and_Customer_signature() {
		newuserpcrosteps.takeSignature();
	}

	@Then("^press Submit button$")
	public void press_Submit_button() {
		newuserpcrosteps.invoiceSubmitBtn();
	}

	// PCCO code removed
	@Then("^Choose Range Time Radio Button$")
	public void choose_Range_Time_Radio_Button() {
		newuserpcrosteps.rangeTimeRadioBtn();
	}

	@Then("^Choose first Time Range$")
	public void choose_first_Time_Range() {
		newuserpcrosteps.getTimeRangeValue();
	}

	@Then("^Choose Second Time Range$")
	public void choose_Second_Time_Range() {
		newuserpcrosteps.getSecondTimeRangeValue();
	}

	@Then("^click on save more$")
	public void click_on_save_more() {
		newuserpcrosteps.SaveforMoreSDetails();
	}

	@Then("^Navigate to open and Select the required opportunity$")
	public void navigate_to_open_and_Select_the_required_opportunity() {
		newuserpcrosteps.OpenRequired();
	}

	@Then("^User Clicks on More Details$")
	public void user_Clicks_on_More_Details() {
		newuserpcrosteps.MoreDetails();
	}

	@Then("^User Set Urgency Schedule Date and Clicks on Schedule Opportunity$")
	public void user_Set_Urgency_Schedule_Date_and_Clicks_on_Schedule_Opportunity() {
		newuserpcrosteps.UrgencyScheduleDateOpportunityBtn();
	}

	@Then("^User Clicks on Cont Sale Process$")
	public void user_Clicks_on_Cont_Sale_Process() {
		newuserpcrosteps.ContSalesProcess();
	}

	@Then("^User Enter Notes and Click on save$")
	public void enterNotesClicksOnSave() throws Exception {
		newuserpcrosteps.enterNotesClickSave();
	}

	@Then("^User clicks on Save and Sign agreement$")
	public void user_clicks_on_Save_and_Sign_agreement() {
		newuserpcrosteps.SaveAndSign();
	}

	@Then("^User selects the Bundle$")
	public void chckbox_ServiceBundle() {
		newuserpcrosteps.ServiceBundleChckBox();
	}

	@Then("^click on OutLook_LogIn_Bttn$")
	public void click_on_OutLook_LogIn_Bttn() {
		newuserpcrosteps.OutLook_LogIn_Bttn();
	}

	@Then("^user click on ViewAction_CompanyCustomer$")
	public void user_click_on_ViewAction_CompanyCustomer() {
		newuserpcrosteps.ViewAction_CompanyCustomer();
	}

	@Then("^user click on EnterNote_CompanyCustomer$")
	public void user_click_on_EnterNote_CompanyCustomer() throws Exception {
		newuserpcrosteps.EnterNote_CompanyCustomer();
	}

	@Then("^user click on save_CompanyCustomer$")
	public void user_click_on_save_CompanyCustomer() {
		newuserpcrosteps.save_CompanyCustomer();
	}
	
	

@Then("^user click on addToAgreement_ServiceBundleSelectPackagesOpportunity$")
public void user_click_on_addToAgreement_ServiceBundleSelectPackagesOpportunity() {
	newuserpcrosteps.addToAgreement_ServiceBundleSelectPackagesOpportunity();
}

}

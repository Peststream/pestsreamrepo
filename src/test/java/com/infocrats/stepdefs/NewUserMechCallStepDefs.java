package com.infocrats.stepdefs;

import com.infocrats.steps.NewUserMechCallSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class NewUserMechCallStepDefs {

	@Steps
	NewUserMechCallSteps newusermechcallsteps;

	@When("^user clicked on CallTab$")
	public void user_clicked_on_CallTab() throws Exception {
		newusermechcallsteps.clickOnCallTab();
	}

	@Then("^user enters Company$")
	public void user_enters_Company() throws Exception {
		newusermechcallsteps.enterCompany();
	}

	@Then("^user click on contact$")
	public void user_click_on_contact() throws Exception {
		newusermechcallsteps.clickOnContact();
	}

	@Then("^user click on search$")
	public void user_click_on_search() throws Exception {
		newusermechcallsteps.clickOnSearch();

	}

	@Then("^user click on Primary Email$")
	public void user_click_on_Primary_Email() throws Exception {

		newusermechcallsteps.enterPrimaryEmail();
	}

	@Then("^user click on cell$")
	public void user_click_on_cell() throws Exception {
		newusermechcallsteps.clickOnCell();

	}

	@Then("^user click on branch Mech$")
	public void user_click_on_branch_Mech() throws Exception {
		newusermechcallsteps.clickOnBranch();

	}

	@Then("^user click on department$")
	public void user_click_on_department() throws Exception {

		newusermechcallsteps.clickOnDept();
	}

	@Then("^user click on service$")
	public void user_click_on_service() {

		newusermechcallsteps.clickOnService();
	}

	@Then("^user click on source$")
	public void user_click_on_source() throws Exception {

		newusermechcallsteps.clickOnSource();
	}

	@Then("^user enters Alert$")
	public void user_enters_Alert() throws Exception {
		newusermechcallsteps.Acc_Alert();
	}

	@Then("^user enters Problem Description$")
	public void user_enters_Problem_Description() throws Exception {
		newusermechcallsteps.Problem_Description();
	}

	@Then("^user click on Opportunity Type$")
	public void user_click_on_Opportunity_Type() throws Exception {

		newusermechcallsteps.selectOppType();
	}

	@Then("^user click on continue$")
	public void user_click_on_continue() throws Exception {

		newusermechcallsteps.clickOnContinue();
	}

	// *************************CSSO_JobtypeAdd_Mech*******************************//

	@Then("^user enters Contact$")
	public void user_enters_Contact() throws Exception {
		newusermechcallsteps.clickOnContact();
	}

	@Then("^user enters Primary Email$")
	public void user_enters_Primary_Email() throws Exception {
		newusermechcallsteps.enterPrimaryEmail();
	}

	@Then("^user enters Cell$")
	public void user_enters_Cell() throws Exception {
		newusermechcallsteps.clickOnCell();
	}

	@Then("^user selects Branch Mech$")
	public void user_selects_Branch_Mech() throws Exception {
		newusermechcallsteps.clickOnBranch();
	}

	@Then("^user selects Service$")
	public void user_selects_Service() {
		newusermechcallsteps.clickOnService();
	}

	@Then("^user selects Source$")
	public void user_selects_Source() throws Exception {
		newusermechcallsteps.clickOnSource();
	}

	@Then("^user selects ScheduleType$")
	public void user_selects_ScheduleType() throws Exception {
		newusermechcallsteps.ScheduleType();
	}

	@Then("^user enters Account Alert$")
	public void user_enters_Account_Alert() throws Exception {
		newusermechcallsteps.Acc_Alert();
	}

	@Then("^user selects on job type$")
	public void user_selects_on_job_type() throws Exception {
		newusermechcallsteps.Job_Type();
	}

	@Then("^user click on Service Repair Rate$")
	public void user_click_on_Service_Repair_Rate() throws Exception {
		newusermechcallsteps.Service_Repair_Rate();
	}

	@Then("^user enters Job Description$")
	public void user_enters_Job_Description() throws Exception {

		newusermechcallsteps.Job_Description();
	}

	@Then("^user click on Add$")
	public void user_click_on_Add() throws Exception {
		newusermechcallsteps.clickOnAdd();
	}

	@Then("^user click on Continue$")
	public void user_click_on_Continue() throws Exception {
		newusermechcallsteps.clickOnContinue();
	}

	@Then("^user enters Address$")
	public void user_enters_Address() throws Exception {
		newusermechcallsteps.enter_Address();
	}

	@Then("^user enters Zip$")
	public void user_enters_Zip() throws Exception {
		newusermechcallsteps.enter_Zip();
	}

	@Then("^user selects State$")
	public void user_selects_State() throws Exception {
		newusermechcallsteps.select_State();
	}

	@Then("^user enters City$")
	public void user_enters_City() throws Exception {
		newusermechcallsteps.enter_City();
	}

	@Then("^user selects Country$")
	public void user_selects_Country() throws Exception {
		newusermechcallsteps.select_Country();
	}

	@Then("^user click on Schedule Time$")
	public void user_click_on_Schedule_Time() throws Exception {
		newusermechcallsteps.clickOnSchedule_Time();
	}

	@Then("^user selects Primary Route$")
	public void user_selects_Primary_Route() throws Exception {
		newusermechcallsteps.select_Primary_Route();
	}

	@Then("^user click on Flat Rate$")
	public void user_click_on_Flat_Rate() throws Exception {
		newusermechcallsteps.clickOnFlateRate();
	}

	@Then("^user clicks on Save Button Mech$")
	public void user_clicks_on_Save_Button_Mech() throws Exception {
		newusermechcallsteps.clickOnSaveButton_Mech();
	}

	@Then("^user click on Advance Search Mech$")
	public void user_click_on_Advance_Search_Mech() throws Exception {
		newusermechcallsteps.clickOnAdvanceSearch_Mech();
	}

	@Then("^user selects Work order$")
	public void user_selects_Work_order() throws Exception {
		newusermechcallsteps.select_Work_Order();
	}

	@Then("^user checks the details and Save$")
	public void user_checks_the_details_and_Save() throws Exception {
		newusermechcallsteps.checkDetails_Save();
	}

	/*************************
	 * CSSO_WorkOrder_Save_Appointment_SendMail_Mech
	 ****************************/

	@Then("^user click on Appointments Tab$")
	public void user_click_on_Appointments_Tab() throws Exception {
		newusermechcallsteps.clickOn_Appointment_Tab();
	}

	@Then("^user click on service appointments$")
	public void user_click_on_service_appointments() throws Exception {
		newusermechcallsteps.clickOn_Service_Appointment();
	}

	@Then("^user click on name$")
	public void user_click_on_name() throws Exception {
		newusermechcallsteps.clickOn_Name();
	}

	@Then("^user click on sub work order,action$")
	public void user_click_on_sub_work_order_action() throws Exception {
		newusermechcallsteps.subWorkOrder_Action();
	}

	@Then("^user click on start repair$")
	public void user_click_on_start_repair() throws Exception {
		newusermechcallsteps.clickOnStart_Repair();
	}

	@Then("^user click on complete sub work order$")
	public void user_click_on_complete_sub_work_order() throws Exception {
		newusermechcallsteps.completeSub_Work_Order();
	}

	@Then("^user click on payment mode$")
	public void user_click_on_payment_mode() throws Exception {
		newusermechcallsteps.clickOnPayment_Mode();
	}

	@Then("^user enter the amount$")
	public void user_enter_the_amount() throws Exception {
		newusermechcallsteps.enter_Amount();
	}

	@Then("^user click on Technician Signature$")
	public void user_click_on_Technician_Signature() throws Exception {
		newusermechcallsteps.clickOn_Technicican_Signature();
	}

	@Then("^user click on Customer not present$")
	public void user_click_on_Customer_not_present() throws Exception {
		newusermechcallsteps.clickOnCustomer_NotPresent();
	}

	@Then("^user click on Customer Signature$")
	public void user_click_on_Customer_Signature() throws Exception {
		newusermechcallsteps.clickOn_Customer_Signature();
	}

	@Then("^user click on complete work order$")
	public void user_click_on_complete_work_order() throws Exception {
		newusermechcallsteps.clickOnComplete_WorkOrder();
	}

	@Then("^user click on Service Report, Invoice$")
	public void user_click_on_Service_Report_Invoice() throws Exception {
		newusermechcallsteps.clickOnService_Report_Invoice();
	}

	@Then("^user click on send email$")
	public void user_click_on_send_email() throws Exception {
		newusermechcallsteps.clickOnSend_Mail();
	}

	@Then("^user click on schedule Type\\(schedule estimation\\)$")
	public void user_click_on_schedule_Type_schedule_estimation() throws Exception {
		newusermechcallsteps.clickOnScheduleEstimation();
	}

	@Then("^user click on Address Sub Type\\(residential\\)$")
	public void user_click_on_Address_Sub_Type_residential() throws Exception {
		newusermechcallsteps.clickOnaddSubType_Residential();
	}

	@Then("^user click on sales type \\(field\\)$")
	public void user_click_on_sales_type_field() throws Exception {
		newusermechcallsteps.clickOnSalesType_Field();
	}

	@Then("^user click on Schedule Time\\(specific\\)$")
	public void user_click_on_Schedule_Time_specific() throws Exception {
		newusermechcallsteps.clickOnScheduleTime_Specific();
	}

	@Then("^user click on Assigned,Estimated Duration$")
	public void user_click_on_Assigned_Estimated_Duration() throws Exception {
		newusermechcallsteps.click_on_Assigned_Estimated_Duration();
	}

	@Then("^user click on Commercial$")
	public void user_click_on_Commercial() throws Exception {
		newusermechcallsteps.clickOn_Commercial();
	}

	@Then("^user click on saveInfo Button$")
	public void user_click_on_saveInfo_Button() throws Exception {
		newusermechcallsteps.clickOnSaveInfo_Button();
	}

	/***********************
	 * CSSO_ScheduleEstimation_Residential_Field_NonStd_Agreement1_Mech
	 ************************/

	@Then("^user click on Opportunity_Mech$")
	public void user_click_on_Opportunity_Mech() throws Exception {
		newusermechcallsteps.clickOnOpportunity_Mech();
	}

	@Then("^user click on Save & Continue General Info$")
	public void user_click_on_Save_Continue_General_Info() throws Exception {
		newusermechcallsteps.clickOnSaveandContinue_GenralInfo();

	}

	@Then("^user click on continue Inspection$")
	public void user_click_on_continue_Inspection() throws Exception {
		newusermechcallsteps.clickOnContinue_Inspection();
	}

	@Then("^user click on Non Standard Equipment subTab$")
	public void user_click_on_Non_Standard_Equipment_subTab() throws Exception {
		newusermechcallsteps.clickOnNonStdEquipmentSubTab();
	}

	@Then("^user click on Service Repair Rate\\(non standard\\)$")
	public void user_click_on_Service_Repair_Rate_non_standard() throws Exception {
		newusermechcallsteps.clickOnServiceRepairRate_NonStd();
	}

	@Then("^user click on Save Equipment$")
	public void user_click_on_Save_Equipment() throws Exception {
		newusermechcallsteps.clickOnSaveEquipment();
	}

	@Then("^user click on Save & Continue Equipment$")
	public void user_click_on_Save_Continue_Equipment() throws Exception {
		newusermechcallsteps.clickOnSaveandContinue_Equipment();
	}

	@Then("^user click on Save & Continue Customer Review$")
	public void user_click_on_Save_Continue_Customer_Review() throws Exception {
		newusermechcallsteps.clickOnSaveandContinueCust_Review();

	}

	@Then("^user click on Payment type$")
	public void user_click_on_Payment_type() throws Exception {
		newusermechcallsteps.clickOnPayment_Type();
	}

	@Then("^user Enters Amount paid$")
	public void user_Enters_Amount_paid() throws Exception {
		newusermechcallsteps.clickOnAmountPaid();
	}

	@Then("^user click on I Agree Terms & Condition$")
	public void user_click_on_I_Agree_Terms_Condition() throws Exception {
		newusermechcallsteps.clickOnIAgree();
	}

	@Then("^user click on Electronic Signature$")
	public void user_click_on_Electronic_Signature() throws Exception {
		newusermechcallsteps.clickOnElectronic_Signature();
	}
	

	@Then("^user click on Sales Representative Signature$")
	public void user_click_on_Sales_Representative_Signature() throws Exception {
		newusermechcallsteps.clickOnSalesRep_Signature();
	}

	@Then("^user click on Save & Continue Signatures$")
	public void user_click_on_Save_Continue_Signatures() throws Exception {
		newusermechcallsteps.clickOnSaveandContinue_Signature();
	}

	@Then("^user click on Send email	Agreement(\\d+)$")
	public void user_click_on_Send_email_Agreement(int arg1) throws Exception {
		newusermechcallsteps.clickOnSendEmailAgreement();
	}

	@Then("^user click on Schedule Service Order$")
	public void user_click_on_Schedule_Service_Order() {
		newusermechcallsteps.clickOnSSO();
	}

	@Then("^user click on Time and Material$")
	public void user_click_on_Time_and_Material() throws Exception {
		newusermechcallsteps.clickOnTime_Material();
	}

	@Then("^user click on Range 	Time$")
	public void user_click_on_Range_Time() throws Exception {
		newusermechcallsteps.clickOnRange_Time();
	}

	@Then("^select Time Range$")
	public void select_Time_Range() throws Exception {
		newusermechcallsteps.Time_Range();
	}

	@Then("^select Second Time Range$")
	public void select_Second_Time_Range() throws Exception {
		newusermechcallsteps.SecondTime_Range();
	}

	@Then("^user click on Opportunity Type\\(Residential\\)$")
	public void user_click_on_Opportunity_Type_Residential() throws Exception {
		newusermechcallsteps.clickOnOppType_Residential();
	}

	@Then("^user click on Send Agreement Link$")
	public void user_click_on_Send_Agreement_Link() throws Exception {
		newusermechcallsteps.clickOnSendAgreement_Link();
	}

	@Then("^user enters Repair to Search$")
	public void user_enters_Repair_to_Search() throws Exception {
		newusermechcallsteps.repairToSearch();
	}

	@Then("^user click on Opportunity Type\\(Commercial\\)$")
	public void user_click_on_Opportunity_Type_Commercial() throws Exception {
		newusermechcallsteps.clickOnOppType_Commercial();
	}

	@Then("^user click on Address Sub Type\\(Commercial\\)$")
	public void user_click_on_Address_Sub_Type_Commercial() throws Exception {
		newusermechcallsteps.clickOnaddSubType_Commercial();
	}

	@Then("^user click on sales type \\(Inside\\)$")
	public void user_click_on_sales_type_Inside() throws Exception {
		newusermechcallsteps.clickOnSalesType_Inside();
	}

	@Then("^user click on Send email	Agreement$")
	public void user_click_on_Send_email_Agreement() throws Exception {
		newusermechcallsteps.clickOnSendEmailAgreement();
	}

	@Then("^user click on Send Email$")
	public void user_click_on_Send_Email() throws Exception {
		newusermechcallsteps.clickOnSend_Mail();
	}

	@Then("^user click on Service Address$")
	public void user_click_on_Service_Address() throws Exception {
		newusermechcallsteps.clickOnService_Address();
	}

	@Then("^user Enters Last Name$")
	public void user_Enters_Last_Name() throws Exception {
		newusermechcallsteps.enterLast_Name();
	}

	@Then("^user enters Price not Exceed$")
	public void user_enters_Price_not_Exceed() throws Exception {
		newusermechcallsteps.priceNot_Exceed();
	}

	@Then("^user click on Service Repair rate\\(After\\)$")
	public void user_click_on_Service_Repair_rate_After() throws Exception {
		newusermechcallsteps.clickOnServiceRR_After();
	}

	@Then("^user click on Specific Hour$")
	public void user_click_on_Specific_Hour() throws Exception {
		newusermechcallsteps.clickOnSpecific_Hour();
	}

	@Then("^user click on Split Price$")
	public void user_click_on_Split_Price() throws Exception {
		newusermechcallsteps.clickOnSplit_Price();
	}

	@Then("^user click on LabourType\\(Helper\\)$")
	public void user_click_on_LabourType_Helper() throws Exception {
		newusermechcallsteps.clickOnLabourType_Helper();
	}

	@Then("^user selects on job type \\(New Construction\\)$")
	public void user_selects_on_job_type_New_Construction() throws Exception {
		newusermechcallsteps.jTNew_Construction();
	}

	@Then("^user click on send email\\(Cust Present\\)$")
	public void user_click_on_send_email_Cust_Present() throws Exception {
		newusermechcallsteps.sendEmail_CustPresent();
	}

	// *******************WorkOrder in Progress*************************/
	@Then("^user click on Create Quote$")
	public void user_click_on_Create_Quote() throws Exception {
		newusermechcallsteps.clickOnCreate_Quote();
	}

	@Then("^user selects Service and Meachanic$")
	public void user_selects_Service_and_Meachanic() throws Exception {
		newusermechcallsteps.service_Meachanic();
	}

	@Then("^user click on Submit$")
	public void user_click_on_Submit() throws Exception {
		newusermechcallsteps.clickOn_Submit();
	}

	@Then("^user click on Purchase Order$")
	public void user_click_on_Purchase_Order() throws Exception {
		newusermechcallsteps.clickOnPurchase_Order();
	}

	@Then("^user click on Add Purchase Order$")
	public void user_click_on_Add_Purchase_Order() throws Exception {
		newusermechcallsteps.clickOnAddPurchase_Order();
	}

	@Then("^user selects Vendor and Vendor Location$")
	public void user_selects_Vendor_and_Vendor_Location() throws Exception {
		newusermechcallsteps.vendor_VendorLocation();
	}

	@Then("^user click on Submit Request$")
	public void user_click_on_Submit_Request() throws Exception {
		newusermechcallsteps.clickOnSubmit_Request();
	}

	@Then("^user navigates Back twice$")
	public void user_navigates_Back_twice() throws Exception {
		newusermechcallsteps.navigate_Back();
	}

	@Then("^user click on Stop Job$")
	public void user_click_on_Stop_Job() throws Exception {
		newusermechcallsteps.clickOnStop_Job();
	}

	@Then("^user selects Reason$")
	public void user_selects_Reason() throws Exception {
		newusermechcallsteps.select_Reason();
	}

	@Then("^user click on Save Reason$")
	public void user_click_on_Save_Reason() throws Exception {
		newusermechcallsteps.clickOnSave_Reason();
	}

	@Then("^user click on Save and Continue$")
	public void user_click_on_Save_and_Continue() throws Exception {
		newusermechcallsteps.clickOnSaveandContinue_Job();
	}

}

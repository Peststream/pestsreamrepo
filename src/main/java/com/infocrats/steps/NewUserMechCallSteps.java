package com.infocrats.steps;

import java.util.Map;

import com.infocrats.pageObjects.newUserMechCallPage;
import com.infocrats.utils.JsonHelper;

public class NewUserMechCallSteps extends pestreamSteps {

	private Map<String, String> jsonData;
	newUserMechCallPage newusermechcallpage;

	public void clickOnCallTab() throws Exception {

		newusermechcallpage.clickOnCallTab();
	}

	public void enterCompany() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.enterCompany(jsonData);
	}

	public void clickOnContact() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.clickOnContact(jsonData);
	}

	public void clickOnSearch() throws Exception {
		newusermechcallpage.clickOnSearch();

	}

	public void enterPrimaryEmail() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.enterPrimaryEmail(jsonData);
	}

	public void clickOnCell() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.enterCell(jsonData);
	}

	public void clickOnBranch() throws Exception {
		newusermechcallpage.clickOnBranch();
	}

	public void clickOnDept() throws Exception {
		newusermechcallpage.clickOnDept();

	}

	public void clickOnService() {
		newusermechcallpage.clickOnService();
	}

	public void clickOnSource() throws Exception {
		newusermechcallpage.clickOnSource();

	}

	public void selectOppType() throws Exception {
		newusermechcallpage.selectOppType();
	}

	public void clickOnContinue() throws Exception {
		newusermechcallpage.clickOnContinue();
	}

	public void Acc_Alert() throws Exception {

		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");

		newusermechcallpage.enterAcc_Alert(jsonData);
	}

	public void Problem_Description() throws Exception {

		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");

		newusermechcallpage.enterProblemDescription(jsonData);
	}

	public void ScheduleType() throws Exception {

		newusermechcallpage.ScheduleType();
	}

	public void Job_Type() throws Exception {

		newusermechcallpage.Job_Type();
	}

//	public void clickOnFlatRate() {
//		
//		newusermechcallpage.clickOnFlatRate();
//	}

	public void Service_Repair_Rate() throws Exception {

		newusermechcallpage.Ser_Repair_Rate();
	}

	public void Job_Description() throws Exception {

		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.Job_Description(jsonData);
	}

	public void clickOnAdd() throws Exception {
		// TODO Auto-generated method stub
		newusermechcallpage.ClickOnAdd();
	}

	public void enter_Address() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.enter_Address(jsonData);

	}

	public void enter_Zip() throws Exception {

		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.enter_Zip(jsonData);
	}

	public void select_State() throws Exception {
		newusermechcallpage.select_State();
	}

	public void enter_City() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.enter_City(jsonData);
	}

	public void select_Country() throws Exception {
		newusermechcallpage.select_Country();

	}

	public void clickOnSchedule_Time() throws Exception {

		newusermechcallpage.clickOnSchedule_Time();
	}

	public void select_Primary_Route() throws Exception {

		newusermechcallpage.select_Primary_Route();
	}

	public void clickOnFlateRate() throws Exception {
		newusermechcallpage.clickOnFlatRate();
	}

	public void clickOnSaveButton_Mech() throws Exception {
		newusermechcallpage.clickOnSaveButton_Mech();

	}

	public void clickOnAdvanceSearch_Mech() throws Exception {
		newusermechcallpage.clickOnAdvanceSearch_Mech();
	}

	public void select_Work_Order() throws Exception {
		newusermechcallpage.select_Work_Order();

	}

	public void checkDetails_Save() throws Exception {
		newusermechcallpage.checkDetails_Save();

	}

	public void clickOn_Appointment_Tab() throws Exception {
		newusermechcallpage.clickOn_Appointment_Tab();

	}

	public void clickOn_Service_Appointment() throws Exception {
		newusermechcallpage.clickOn_Service_Appointment();

	}

	public void clickOn_Name() throws Exception {
		newusermechcallpage.clickOn_Name();
	}

	public void subWorkOrder_Action() throws Exception {
		newusermechcallpage.subWorkOrder_Action();
	}

	public void clickOnStart_Repair() throws Exception {

		newusermechcallpage.clickOnStart_Repair();
	}

	public void completeSub_Work_Order() throws Exception {

		newusermechcallpage.completeSub_Work_Order();
	}

	public void clickOnPayment_Mode() throws Exception {
		newusermechcallpage.clickOnPayment_Mode();
	}

	public void enter_Amount() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.enter_Amount(jsonData);
	}

	public void clickOn_Technicican_Signature() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.clickOn_Technicican_Signature(jsonData);
	}

	public void clickOn_Customer_Signature() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.clickOn_Customer_Signature(jsonData);
	}

	public void clickOnComplete_WorkOrder() throws Exception {
		newusermechcallpage.clickOnComplete_WorkOrder();
	}

	public void clickOnService_Report_Invoice() throws Exception {
		newusermechcallpage.clickOnService_Report_Invoice();
	}

	public void clickOnSend_Mail() throws Exception {
		newusermechcallpage.clickOnSend_Mail();
	}

	public void clickOnScheduleEstimation() throws Exception {

		newusermechcallpage.clickOnScheduleEstimation();
	}

	public void clickOnaddSubType_Residential() throws Exception {

		newusermechcallpage.clickOnaddSubType_Residential();
	}

	public void clickOnSalesType_Field() throws Exception {
		newusermechcallpage.clickOnSalesType_Field();
	}

	public void clickOnScheduleTime_Specific() throws Exception {

		newusermechcallpage.clickOnScheduleTime_Specific();
	}

	public void click_on_Assigned_Estimated_Duration() throws Exception {

		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.click_on_Assigned_Estimated_Duration(jsonData);
	}

	public void clickOn_Commercial() throws Exception {
		newusermechcallpage.clickOn_Commercial();
	}

	public void clickOnSaveInfo_Button() throws Exception {
		newusermechcallpage.clickOnSaveInfo_Button();
	}

	public void clickOnOpportunity_Mech() throws Exception {
		newusermechcallpage.clickOnOpportunity_Mech();
	}

	public void clickOnSaveandContinue_GenralInfo() throws Exception {

		newusermechcallpage.clickOnSaveandContinue_GenralInfo();
	}

	public void clickOnContinue_Inspection() throws Exception {

		newusermechcallpage.clickOnContinue_Inspection();
	}

	public void clickOnNonStdEquipmentSubTab() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.clickOnNonStdEquipmentSubTab(jsonData);
	}

	public void clickOnServiceRepairRate_NonStd() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.clickOnServiceRepairRate_NonStd(jsonData);
	}

	public void clickOnSaveEquipment() throws Exception {

		newusermechcallpage.clickOnSaveEquipment();
	}

	public void clickOnSaveandContinue_Equipment() throws Exception {

		newusermechcallpage.clickOnSaveandContinue_Equipment();
	}

	public void clickOnSaveandContinueCust_Review() throws Exception {
		newusermechcallpage.clickOnSaveandContinueCust_Review();

	}

	public void clickOnPayment_Type() throws Exception {

		newusermechcallpage.clickOnPayment_Type();
	}

	public void clickOnAmountPaid() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.clickOnAmountPaid(jsonData);
	}

	public void clickOnIAgree() throws Exception {

		newusermechcallpage.clickOnIAgree();
	}

	public void clickOnElectronic_Signature() throws Exception {
		newusermechcallpage.clickOnElectronic_Signature();
	}

	public void clickOnSalesRep_Signature() throws Exception {

		newusermechcallpage.clickOnSalesRep_Signature();
	}

	public void clickOnSaveandContinue_Signature() throws Exception {

		newusermechcallpage.clickOnSaveandContinue_Signature();
	}

	public void clickOnSendEmailAgreement() throws Exception {

		newusermechcallpage.clickOnSendEmailAgreement();
	}

	public void clickOnSSO() {

		newusermechcallpage.clickOnSSO();
	}

	public void clickOnTime_Material() throws Exception {
		newusermechcallpage.clickOnTime_Material();
	}

	public void clickOnRange_Time() throws Exception {
		newusermechcallpage.clickOnRange_Time();
	}

	public void Time_Range() throws Exception {
		newusermechcallpage.Time_Range();

	}

	public void SecondTime_Range() throws Exception {
		newusermechcallpage.SecondTime_Range();

	}

	public void clickOnCustomer_NotPresent() throws Exception {
		newusermechcallpage.clickOnCustomer_NotPresent();
	}

	public void clickOnOppType_Residential() throws Exception {
		newusermechcallpage.clickOnOppType_Residential();
	}

	public void clickOnSendAgreement_Link() throws Exception {
		newusermechcallpage.clickOnSendAgreement_Link();
	}

	public void repairToSearch() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.repairToSearch(jsonData);
	}

	public void clickOnOppType_Commercial() throws Exception {
		newusermechcallpage.clickOnOppType_Commercial();
	}

	public void clickOnaddSubType_Commercial() throws Exception {
		newusermechcallpage.clickOnaddSubType_Commercial();
	}

	public void clickOnSalesType_Inside() throws Exception {
		newusermechcallpage.clickOnSalesType_Inside();
	}

	public void clickOnService_Address() throws Exception {
		newusermechcallpage.clickOnService_Address();
	}

	public void enterLast_Name() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.enterLast_Name(jsonData);

	}

	public void priceNot_Exceed() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.priceNot_Exceed(jsonData);
	}

	public void clickOnServiceRR_After() throws Exception {
		newusermechcallpage.clickOnServiceRR_After();
	}

	public void clickOnSpecific_Hour() throws Exception {
		newusermechcallpage.clickOnSpecific_Hour();
	}

	public void clickOnSplit_Price() throws Exception {
		newusermechcallpage.clickOnSplit_Price();
	}

	public void clickOnLabourType_Helper() throws Exception {
		newusermechcallpage.clickOnLabourType_Helper();
	}

	public void jTNew_Construction() throws Exception {
		newusermechcallpage.jTNew_Construction();
	}

	public void sendEmail_CustPresent() throws Exception {
		newusermechcallpage.sendEmail_CustPresent();
	}

	public void clickOnCreate_Quote() throws Exception {
		newusermechcallpage.clickOnCreate_Quote();

	}

	public void service_Meachanic() throws Exception {
		newusermechcallpage.service_Meachanic();

	}

	public void clickOn_Submit() throws Exception {
		newusermechcallpage.clickOn_Submit();

	}

	public void clickOnPurchase_Order() throws Exception {
		newusermechcallpage.clickOnPurchase_Order();

	}

	public void clickOnAddPurchase_Order() throws Exception {
		newusermechcallpage.clickOnAddPurchase_Order();
	}

	public void vendor_VendorLocation() throws Exception {
		newusermechcallpage.vendor_VendorLocation();
	}

	public void clickOnSubmit_Request() throws Exception {
		newusermechcallpage.clickOnSubmit_Request();
	}

	public void navigate_Back() throws Exception {
		newusermechcallpage.navigate_Back();
	}

	public void clickOnStop_Job() throws Exception {
		newusermechcallpage.clickOnStop_Job();
	}

	public void select_Reason() throws Exception {
		newusermechcallpage.select_Reason();
	}

	public void clickOnSave_Reason() throws Exception {
		newusermechcallpage.clickOnSave_Reason();
	}

	public void clickOnSaveandContinue_Job() throws Exception {
		newusermechcallpage.clickOnSaveandContinue_Job();
	}

}

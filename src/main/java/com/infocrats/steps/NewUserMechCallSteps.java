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

	public void clickOnSearch() {
		newusermechcallpage.clickOnSearch();
		
	}

	public void enterPrimaryEmail() throws Exception{
		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.enterPrimaryEmail(jsonData);
	}

	public void clickOnCell()throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.enterCell(jsonData);
	}

	public void clickOnBranch() {
		newusermechcallpage.clickOnBranch();
	}

	public void clickOnDept() {
		newusermechcallpage.clickOnDept();
		
	}

	public void clickOnService() {
		newusermechcallpage.clickOnService();
	}

	public void clickOnSource() {
		newusermechcallpage.clickOnSource();
		
	}

	public void selectOppType() {
		newusermechcallpage.selectOppType();
	}

	public void clickOnContinue() {
		newusermechcallpage.clickOnContinue();
	}

	public void Acc_Alert() throws Exception {
		
		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		
		newusermechcallpage.enterAcc_Alert(jsonData);
	}

	public void Problem_Description()  throws Exception{
		
		jsonData = JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		
		newusermechcallpage.enterProblemDescription(jsonData);
	}

	public void ScheduleType() {
		
		newusermechcallpage.ScheduleType();
	}

	public void Job_Type() {
		
		newusermechcallpage.Job_Type();
	}
	
//	public void clickOnFlatRate() {
//		
//		newusermechcallpage.clickOnFlatRate();
//	}


	public void Service_Repair_Rate() {
		
		newusermechcallpage.Ser_Repair_Rate();
	}

	public void Job_Description() throws Exception {
		
		jsonData= JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.Job_Description(jsonData);
	}

	public void clickOnAdd() {
		// TODO Auto-generated method stub
		newusermechcallpage.ClickOnAdd();
	}

	public void enter_Address()throws Exception {
		jsonData= JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.enter_Address(jsonData);
		
	}

	public void enter_Zip()throws Exception {
		
		jsonData= JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.enter_Zip(jsonData);
	}

	public void select_State() {
		newusermechcallpage.select_State();
	}

	public void enter_City() throws Exception {
		jsonData= JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.enter_City(jsonData);
	}

	public void select_Country() {
		newusermechcallpage.select_Country();
		
	}

	public void clickOnSchedule_Time() {
		
		newusermechcallpage.clickOnSchedule_Time();
	}

	
	public void select_Primary_Route() {
		
		newusermechcallpage.select_Primary_Route();
	}

	public void clickOnFlateRate() {
		newusermechcallpage.clickOnFlatRate();
	}

	public void clickOnSaveButton_Mech() {
		newusermechcallpage.clickOnSaveButton_Mech();
		
	}


	public void clickOnAdvanceSearch_Mech() {
		newusermechcallpage.clickOnAdvanceSearch_Mech();
	}


	public void select_Work_Order() {
		newusermechcallpage.select_Work_Order();
		
	}


	public void checkDetails_Save() {
		newusermechcallpage.checkDetails_Save();
		
	}


	public void clickOn_Appointment_Tab() {
		newusermechcallpage.clickOn_Appointment_Tab();
		
	}


	public void clickOn_Service_Appointment() {
		newusermechcallpage.clickOn_Service_Appointment();
		
	}


	public void clickOn_Name() {
		newusermechcallpage.clickOn_Name();
	}


	public void subWorkOrder_Action() {
		newusermechcallpage.subWorkOrder_Action();
	}


	public void clickOnStart_Repair() {
		
		newusermechcallpage.clickOnStart_Repair();
	}


	public void completeSub_Work_Order() {
		
		newusermechcallpage.completeSub_Work_Order();
	}


	public void clickOnPayment_Mode() {
		newusermechcallpage.clickOnPayment_Mode();
	}


	public void enter_Amount() throws Exception{
		jsonData= JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.enter_Amount(jsonData);
	}


	public void clickOn_Technicican_Signature() throws Exception {
		jsonData= JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.clickOn_Technicican_Signature(jsonData);
	}


	public void clickOn_Customer_Signature() throws Exception {
		jsonData= JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.clickOn_Customer_Signature(jsonData);
	}


	public void clickOnComplete_WorkOrder() {
		newusermechcallpage.clickOnComplete_WorkOrder();
	}


	public void clickOnService_Report_Invoice() {
		newusermechcallpage.clickOnService_Report_Invoice();
	}


	public void clickOnSend_Mail() {
		newusermechcallpage.clickOnSend_Mail();
	}
	
	public void clickOnScheduleEstimation() {
		
		newusermechcallpage.clickOnScheduleEstimation();
	}


	public void clickOnaddSubType_Residential() {
		
		newusermechcallpage.clickOnaddSubType_Residential();
	}


	public void clickOnSalesType_Field() {
		newusermechcallpage.clickOnSalesType_Field();
	}


	public void clickOnScheduleTime_Specific() {
		
		newusermechcallpage.clickOnScheduleTime_Specific();
	}

	public void click_on_Assigned_Estimated_Duration() throws Exception{
		
		
		jsonData= JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.click_on_Assigned_Estimated_Duration(jsonData);
	}


	public void clickOn_Commercial() {
		newusermechcallpage.clickOn_Commercial();
	}


	public void clickOnSaveInfo_Button() {
		newusermechcallpage.clickOnSaveInfo_Button();
	}

	public void clickOnOpportunity_Mech() {
		newusermechcallpage.clickOnOpportunity_Mech();
	}


	public void clickOnSaveandContinue_GenralInfo() {
	
		newusermechcallpage.clickOnSaveandContinue_GenralInfo();
	}


	public void clickOnContinue_Inspection() {
		
		newusermechcallpage.clickOnContinue_Inspection();
	}


	public void clickOnNonStdEquipmentSubTab() throws Exception {
	    jsonData= JsonHelper.readJsonElement("call_Mech.json","CallDataForMechanical");
		newusermechcallpage.clickOnNonStdEquipmentSubTab(jsonData);
	}


	public void clickOnServiceRepairRate_NonStd() throws Exception {
		jsonData= JsonHelper.readJsonElement("call_Mech.json","CallDataForMechanical");
		newusermechcallpage.clickOnServiceRepairRate_NonStd(jsonData);
	}


	public void clickOnSaveEquipment() {
		
		newusermechcallpage.clickOnSaveEquipment();
	}


	public void clickOnSaveandContinue_Equipment() {
	
		newusermechcallpage.clickOnSaveandContinue_Equipment();
	}


	public void clickOnSaveandContinueCust_Review() {
		newusermechcallpage.clickOnSaveandContinueCust_Review();
		
	}


	public void clickOnPayment_Type() {
		
		newusermechcallpage.clickOnPayment_Type();
	}


	public void clickOnAmountPaid() throws Exception {
		jsonData= JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.clickOnAmountPaid(jsonData);
	}


	public void clickOnIAgree() {
		
		newusermechcallpage.clickOnIAgree();
	}

	public void clickOnElectronic_Signature() {
		newusermechcallpage.clickOnElectronic_Signature();
	}

	public void clickOnSalesRep_Signature() {
		
		newusermechcallpage.clickOnSalesRep_Signature();
	}


	public void clickOnSaveandContinue_Signature() {
		
		newusermechcallpage.clickOnSaveandContinue_Signature();
	}


	public void clickOnSendEmailAgreement() {
		
		newusermechcallpage.clickOnSendEmailAgreement();
	}


	public void clickOnSSO() {
		
		newusermechcallpage.clickOnSSO();
	}


	public void clickOnTime_Material() {
		newusermechcallpage.clickOnTime_Material();
	}


	public void clickOnRange_Time() {
		newusermechcallpage.clickOnRange_Time();
	}


	public void Time_Range() {
		newusermechcallpage.Time_Range();
		
	}


	public void SecondTime_Range() {
		newusermechcallpage.SecondTime_Range();

	}


	public void clickOnCustomer_NotPresent() {
		newusermechcallpage.clickOnCustomer_NotPresent();
	}


	public void clickOnOppType_Residential() {
		newusermechcallpage.clickOnOppType_Residential();
	}


	public void clickOnSendAgreement_Link() {
		newusermechcallpage.clickOnSendAgreement_Link();
	}


	public void repairToSearch() throws Exception{
		jsonData= JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.repairToSearch(jsonData);
	}


	public void clickOnOppType_Commercial() {
		newusermechcallpage.clickOnOppType_Commercial();
	}


	public void clickOnaddSubType_Commercial() {
		newusermechcallpage.clickOnaddSubType_Commercial();
	}


	public void clickOnSalesType_Inside() {
		newusermechcallpage.clickOnSalesType_Inside();
	}


	public void clickOnService_Address() {
		newusermechcallpage.clickOnService_Address();
	}


	public void enterLast_Name() throws Exception {
		jsonData= JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.enterLast_Name(jsonData);
		
	}


	public void priceNot_Exceed() throws Exception{
		jsonData= JsonHelper.readJsonElement("call_Mech.json", "CallDataForMechanical");
		newusermechcallpage.priceNot_Exceed(jsonData);
	}


	public void clickOnServiceRR_After() {
		newusermechcallpage.clickOnServiceRR_After();
	}


	public void clickOnSpecific_Hour() {
		newusermechcallpage.clickOnSpecific_Hour();
	}


	public void clickOnSplit_Price() {
		newusermechcallpage.clickOnSplit_Price();
	}


	public void clickOnLabourType_Helper() {
		newusermechcallpage.clickOnLabourType_Helper();
	}


	public void jTNew_Construction() {
		newusermechcallpage.jTNew_Construction();
	}


	public void sendEmail_CustPresent() {
		newusermechcallpage.sendEmail_CustPresent();
	}


	public void clickOnCreate_Quote() {
		newusermechcallpage.clickOnCreate_Quote();
		
	}


	public void service_Meachanic() {
		newusermechcallpage.service_Meachanic();
		
	}


	public void clickOn_Submit() {
		newusermechcallpage.clickOn_Submit();
		
	}


	public void clickOnPurchase_Order() {
		newusermechcallpage.clickOnPurchase_Order();
		
	}


	public void clickOnAddPurchase_Order() {
		newusermechcallpage.clickOnAddPurchase_Order();
	}


	public void vendor_VendorLocation() {
		newusermechcallpage.vendor_VendorLocation();
	}


	public void clickOnSubmit_Request() {
		newusermechcallpage.clickOnSubmit_Request();
	}


	public void navigate_Back() {
		newusermechcallpage.navigate_Back();
}


	public void clickOnStop_Job() {
		newusermechcallpage.clickOnStop_Job();
	}


	public void select_Reason() {
		newusermechcallpage.select_Reason();
	}


	public void clickOnSave_Reason() {
		newusermechcallpage.clickOnSave_Reason();
	}


	public void clickOnSaveandContinue_Job() {
		newusermechcallpage.clickOnSaveandContinue_Job();
	}


	

	


}

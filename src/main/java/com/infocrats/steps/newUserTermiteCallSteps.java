package com.infocrats.steps;

import java.util.Map;

import com.infocrats.pageObjects.newUserTermiteCallPage;
import com.infocrats.utils.JsonHelper;

public class newUserTermiteCallSteps extends pestreamSteps {

	private Map<String, String> jsonData;
	newUserTermiteCallPage newusertermitecallpage;

	public void clickOnCallTab() {
		newusertermitecallpage.clickOnCallTab();
	}

	public void clickOnCompany() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "CallData");
		newusertermitecallpage.clickOnCompany(jsonData);

	}

	public void clickOnContact() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "CallData");
		newusertermitecallpage.clickOnContact(jsonData);

	}

	public void clickOnSearch() {
		newusertermitecallpage.clickOnSearch();

	}

	public void clickOnPrimaryEmail() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "CallData");
		newusertermitecallpage.clickOnPrimaryEmail(jsonData);
	}

	public void clickOnCell() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "CallData");
		newusertermitecallpage.clickOnCell(jsonData);
	}

	public void clickOnBranch() {
		newusertermitecallpage.clickOnBranch();
	}

	public void clickOnSource() {
		newusertermitecallpage.clickOnSource();
	}

	public void clickOnAlert() {
		newusertermitecallpage.clickOnAlert();
	}

	public void clickOnOppType() {
		newusertermitecallpage.clickOnOppType();
	}

	public void clickOnContinue_Termi() {
		newusertermitecallpage.clickOnContinue_Termi();
	}

	// *******************************

	public void clickOncompany() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "CallData");
		newusertermitecallpage.clickOncompany(jsonData);
	}

	public void clickOncontact() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "CallData");
		newusertermitecallpage.clickOncontact(jsonData);
	}

	public void clickOnMName() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "CallData");
		newusertermitecallpage.clickOnMName(jsonData);
	}

	public void clickOnLName() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "CallData");
		newusertermitecallpage.clickOnLName(jsonData);
	}

	public void clickOnPEmail() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "CallData");
		newusertermitecallpage.clickOnPEmail(jsonData);
	}

	public void cell() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "CallData");
		newusertermitecallpage.clickOncell(jsonData);
	}

	public void clickOnlead() {
		newusertermitecallpage.clickOnlead();

	}

	public void clickOnaddressLine() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "OpportunityAddress");
		newusertermitecallpage.clickOnaddressLine(jsonData);
	}

	public void clickOnzip() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "OpportunityAddress");
		newusertermitecallpage.clickOnzip(jsonData);
	}

	public void clickOncity() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "OpportunityAddress");
		newusertermitecallpage.clickOncity(jsonData);
	}

	public void clickOnaddNote() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "OpportunityAddress");
		newusertermitecallpage.clickOnaddNote(jsonData);
	}

	public void clickOnDDserviceStdServic() {
		newusertermitecallpage.clickOnDDserviceStdServic();
	}

	public void clickOnDDpackageStdServices() {
		newusertermitecallpage.clickOnDDpackageStdServices();
	}

	public void clickOnDDfrequencyStdServices() {
		newusertermitecallpage.clickOnDDfrequencyStdServices();
	}

	// public void clickOnDDbillingFrequency() {
	// newusertermitecallpage.clickOnDDbillingFrequency();
	// }

	public void clickOnaddStdServices() {
		newusertermitecallpage.clickOnaddStdServices();
	}

	public void clickOnradioButtionAddToAgreement() {
		newusertermitecallpage.clickOnradioButtionAddToAgreement();
	}

	public void clickOnsaveAddToAgreement() {
		newusertermitecallpage.clickOnsaveAddToAgreement();
	}

	public void clickOnOppTypeComm() {
		newusertermitecallpage.clickOnOppTypeComm();

	}

	public void clickOnopportunity() {
		newusertermitecallpage.clickOnopportunity();
	}

	public void clickOnsaveAndCont() {
		newusertermitecallpage.clickOnsaveAndCont();
	}

	public void clickOncontinue_Insp() {
		newusertermitecallpage.clickOncontinue_Insp();
	}

	public void clickOnOppmarkAsLost() {
		newusertermitecallpage.clickOnOppmarkAsLost();
	}

	public void clickOnOppDDReason() {
		newusertermitecallpage.clickOnOppDDReason();
	}

	public void clickOndes() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "AppointmentsResidential");
		newusertermitecallpage.clickOndes(jsonData);
	}

	public void clickOnsave() {
		newusertermitecallpage.clickOnsave();
	}

	public void clickOnServiceBundle() {
		newusertermitecallpage.clickOnBundle();
	}

	public void clickOnDDBundle() {
		newusertermitecallpage.clickOnDDBundle();
	}

	public void clickOnAddBundle() {
		newusertermitecallpage.clickOnAddBundle();
	}

	public void clickOnradioBttnAddToAgreement() {
		newusertermitecallpage.clickOnradioBttnAddToAgreement();
	}

	public void clickOnSave_BundleServices() {
		newusertermitecallpage.clickOnSave_BundleServices();
	}

	public void clickOnScheduleEstimation() {
		newusertermitecallpage.clickOnScheduleEstimations();
		
	}

	public void clickOnDDAssignedTo() {
		newusertermitecallpage.clickOnDDAssignedTo();
		
	}

	public void saveScheduleEstimation() {
		newusertermitecallpage.saveScheduleEstimation();
		
	}

	public void MarkLScheduleEstimation() {
		newusertermitecallpage.MarkLScheduleEstimation();
		
	}

	public void DDReason_ScheduleEstimation() {
		newusertermitecallpage.DDReason_ScheduleEstimation();
	}

	public void des_ScheduleEstimation() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "AppointmentsResidential");
		newusertermitecallpage.des_ScheduleEstimation(jsonData);
	}

	public void save_ScheduleEstimation() {
		newusertermitecallpage.save_ScheduleEstimation();
	}

	public void RangeTime_InsideScheduleEstimation() {
		newusertermitecallpage.RangeTime_InsideScheduleEstimation();
	}

	public void DDTimeRange_InsideScheduleEstimation() {
		newusertermitecallpage.DDTimeRange_InsideScheduleEstimation();
	}

	public void fieldRadioBttn_FieldScheduleEstimation() {
		newusertermitecallpage.fieldRadioBttn_FieldScheduleEstimation();
		
	}

	public void click_on_InsideRadioBttn_Comm() {
		newusertermitecallpage.click_on_InsideRadioBttn_Comm();
		
	}

	
	
	
	
	
	
	
	
	
	public void generatedOpportunity_FieldSTSaveComm() {
		newusertermitecallpage.generatedOpportunity_FieldSTSaveComm();
	}

	public void saveAndcontGI_FieldSTSaveComm() {
		newusertermitecallpage.saveAndcontGI_FieldSTSaveComm();
	}

	public void continueInspection_FieldSTSaveComm() {
		newusertermitecallpage.continueInspection_FieldSTSaveComm();
	}

	public void DDCat_StdService_FieldSTSaveComm() {
		newusertermitecallpage.DDCat_StdService_FieldSTSaveComm();
	}

	public void DDService_StdService_FieldSTSaveComm() {
		newusertermitecallpage.DDService_StdService_FieldSTSaveComm();
	}

	public void DDFrequency_StdService_FieldSTSaveComm() {
		newusertermitecallpage.DDFrequency_StdService_FieldSTSaveComm();
	}

	public void Save_StdService_FieldSTSaveComm() {
		newusertermitecallpage.Save_StdService_FieldSTSaveComm();
	}

	public void saveAndcontSelectService_FieldSTSaveComm() {
		newusertermitecallpage.saveAndcontSelectService_FieldSTSaveComm();
	}

	public void radioBttn_Service_FieldSTSaveComm() {
		newusertermitecallpage.radioBttn_Service_FieldSTSaveComm();
	}

	public void saveAndcontConfigureProposal_FieldSTSaveComm() {
		newusertermitecallpage.saveAndcontConfigureProposal_FieldSTSaveComm();
	}

	public void radioBttncashAgreement_FieldSTSaveComm() {
		newusertermitecallpage.radioBttncashAgreement_FieldSTSaveComm();
	}

	public void valuepaidamountAgreement_FieldSTSaveComm() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "CallData");
		newusertermitecallpage.valuepaidamountAgreement_FieldSTSaveComm(jsonData);
	}

	public void radioBttnTANDCAgreement_FieldSTSaveComm() {
		newusertermitecallpage.radioBttnTANDCAgreement_FieldSTSaveComm();
	}

	public void salesrepresentativesignAgreement_FieldSTSaveComm() {
		newusertermitecallpage.salesrepresentativesignAgreement_FieldSTSaveComm();
	}

	public void saveandcontAgreement_FieldSTSaveComm() {
		newusertermitecallpage.saveandcontAgreement_FieldSTSaveComm();
	}

	public void sendemail_FieldSTSaveComm() {
		newusertermitecallpage.sendemail_FieldSTSaveComm();
	}

	public void typenameagreement_FieldSTSaveComm() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "CallData");
		newusertermitecallpage.typenameagreement_FieldSTSaveComm(jsonData);
		
	}

	public void markaslost_InsideSTSaveComm() {
		newusertermitecallpage.markaslost_InsideSTSaveComm();
	}

	public void DDReasonML_InsideSTSaveComm() {
		newusertermitecallpage.DDReasonML_InsideSTSaveComm();
	}

	public void saveML_InsideSTSaveComm() {
		newusertermitecallpage.saveML_InsideSTSaveComm();
	}
}

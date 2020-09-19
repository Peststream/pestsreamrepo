package com.infocrats.steps;

import java.util.Map;

import com.infocrats.pageObjects.newUserTermiteCallPage;
import com.infocrats.utils.JsonHelper;

public class newUserTermiteCallSteps extends pestreamSteps {

	private Map<String, String> jsonData;
	newUserTermiteCallPage newusertermitecallpage;

	public void clickOnCallTab() throws Exception {
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

	public void clickOnSearch() throws Exception {
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

	public void clickOnBranch() throws Exception {
		newusertermitecallpage.clickOnBranch();
	}

	public void clickOnSource() throws Exception {
		newusertermitecallpage.clickOnSource();
	}

	public void clickOnAlert() {
		newusertermitecallpage.clickOnAlert();
	}

	public void clickOnOppType() throws Exception {
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

	public void clickOnlead() throws Exception {
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

	public void clickOnDDserviceStdServic() throws Exception {
		newusertermitecallpage.clickOnDDserviceStdServic();
	}

	public void clickOnDDpackageStdServices() throws Exception {
		newusertermitecallpage.clickOnDDpackageStdServices();
	}

	public void clickOnDDfrequencyStdServices() throws Exception {
		newusertermitecallpage.clickOnDDfrequencyStdServices();
	}

	// public void clickOnDDbillingFrequency() {
	// newusertermitecallpage.clickOnDDbillingFrequency();
	// }

	public void clickOnaddStdServices() throws Exception {
		newusertermitecallpage.clickOnaddStdServices();
	}

	public void clickOnradioButtionAddToAgreement() throws Exception {
		newusertermitecallpage.clickOnradioButtionAddToAgreement();
	}

	public void clickOnsaveAddToAgreement() throws Exception {
		newusertermitecallpage.clickOnsaveAddToAgreement();
	}

	public void clickOnOppTypeComm() throws Exception {
		newusertermitecallpage.clickOnOppTypeComm();

	}

	public void clickOnopportunity() throws Exception {
		newusertermitecallpage.clickOnopportunity();
	}

	public void clickOnsaveAndCont() throws Exception {
		newusertermitecallpage.clickOnsaveAndCont();
	}

	public void clickOncontinue_Insp() throws Exception {
		newusertermitecallpage.clickOncontinue_Insp();
	}

	public void clickOnOppmarkAsLost() throws Exception {
		newusertermitecallpage.clickOnOppmarkAsLost();
	}

	public void clickOnOppDDReason() throws Exception {
		newusertermitecallpage.clickOnOppDDReason();
	}

	public void clickOndes() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "AppointmentsResidential");
		newusertermitecallpage.clickOndes(jsonData);
	}

	public void clickOnsave() throws Exception {
		newusertermitecallpage.clickOnsave();
	}

	public void clickOnServiceBundle() throws Exception {
		newusertermitecallpage.clickOnBundle();
	}

	public void clickOnDDBundle() throws Exception {
		newusertermitecallpage.clickOnDDBundle();
	}

	public void clickOnAddBundle() throws Exception {
		newusertermitecallpage.clickOnAddBundle();
	}

	public void clickOnradioBttnAddToAgreement() throws Exception {
		newusertermitecallpage.clickOnradioBttnAddToAgreement();
	}

	public void clickOnSave_BundleServices() throws Exception {
		newusertermitecallpage.clickOnSave_BundleServices();
	}

	public void clickOnScheduleEstimation() throws Exception {
		newusertermitecallpage.clickOnScheduleEstimations();
		
	}

	public void clickOnDDAssignedTo() throws Exception {
		newusertermitecallpage.clickOnDDAssignedTo();
		
	}

	public void saveScheduleEstimation() throws Exception {
		newusertermitecallpage.saveScheduleEstimation();
		
	}

	public void MarkLScheduleEstimation() throws Exception {
		newusertermitecallpage.MarkLScheduleEstimation();
		
	}

	public void DDReason_ScheduleEstimation() throws Exception {
		newusertermitecallpage.DDReason_ScheduleEstimation();
	}

	public void des_ScheduleEstimation() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "AppointmentsResidential");
		newusertermitecallpage.des_ScheduleEstimation(jsonData);
	}

	public void save_ScheduleEstimation() throws Exception {
		newusertermitecallpage.save_ScheduleEstimation();
	}

	public void RangeTime_InsideScheduleEstimation() throws Exception {
		newusertermitecallpage.RangeTime_InsideScheduleEstimation();
	}

	public void DDTimeRange_InsideScheduleEstimation() throws Exception {
		newusertermitecallpage.DDTimeRange_InsideScheduleEstimation();
	}

	public void fieldRadioBttn_FieldScheduleEstimation() throws Exception {
		newusertermitecallpage.fieldRadioBttn_FieldScheduleEstimation();
		
	}

	public void click_on_InsideRadioBttn_Comm() throws Exception {
		newusertermitecallpage.click_on_InsideRadioBttn_Comm();
		
	}

	
	
	
	
	
	
	
	
	
	public void generatedOpportunity_FieldSTSaveComm() throws Exception {
		newusertermitecallpage.generatedOpportunity_FieldSTSaveComm();
	}

	public void saveAndcontGI_FieldSTSaveComm() throws Exception {
		newusertermitecallpage.saveAndcontGI_FieldSTSaveComm();
	}

	public void continueInspection_FieldSTSaveComm() throws Exception {
		newusertermitecallpage.continueInspection_FieldSTSaveComm();
	}

	public void DDCat_StdService_FieldSTSaveComm() throws Exception {
		newusertermitecallpage.DDCat_StdService_FieldSTSaveComm();
	}

	public void DDService_StdService_FieldSTSaveComm() throws Exception {
		newusertermitecallpage.DDService_StdService_FieldSTSaveComm();
	}

	public void DDFrequency_StdService_FieldSTSaveComm() throws Exception {
		newusertermitecallpage.DDFrequency_StdService_FieldSTSaveComm();
	}

	public void Save_StdService_FieldSTSaveComm() throws Exception {
		newusertermitecallpage.Save_StdService_FieldSTSaveComm();
	}

	public void saveAndcontSelectService_FieldSTSaveComm() throws Exception {
		newusertermitecallpage.saveAndcontSelectService_FieldSTSaveComm();
	}

	public void radioBttn_Service_FieldSTSaveComm() throws Exception {
		newusertermitecallpage.radioBttn_Service_FieldSTSaveComm();
	}

	public void saveAndcontConfigureProposal_FieldSTSaveComm() throws Exception {
		newusertermitecallpage.saveAndcontConfigureProposal_FieldSTSaveComm();
	}

	public void radioBttncashAgreement_FieldSTSaveComm() throws Exception {
		newusertermitecallpage.radioBttncashAgreement_FieldSTSaveComm();
	}

	public void valuepaidamountAgreement_FieldSTSaveComm() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "CallData");
		newusertermitecallpage.valuepaidamountAgreement_FieldSTSaveComm(jsonData);
	}

	public void radioBttnTANDCAgreement_FieldSTSaveComm() throws Exception {
		newusertermitecallpage.radioBttnTANDCAgreement_FieldSTSaveComm();
	}

	public void salesrepresentativesignAgreement_FieldSTSaveComm() throws Exception {
		newusertermitecallpage.salesrepresentativesignAgreement_FieldSTSaveComm();
	}

	public void saveandcontAgreement_FieldSTSaveComm() throws Exception {
		newusertermitecallpage.saveandcontAgreement_FieldSTSaveComm();
	}

	public void sendemail_FieldSTSaveComm() throws Exception {
		newusertermitecallpage.sendemail_FieldSTSaveComm();
	}

	public void typenameagreement_FieldSTSaveComm() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "CallData");
		newusertermitecallpage.typenameagreement_FieldSTSaveComm(jsonData);
		
	}

	public void markaslost_InsideSTSaveComm() throws Exception {
		newusertermitecallpage.markaslost_InsideSTSaveComm();
	}

	public void DDReasonML_InsideSTSaveComm() throws Exception {
		newusertermitecallpage.DDReasonML_InsideSTSaveComm();
	}

	public void saveML_InsideSTSaveComm() throws Exception {
		newusertermitecallpage.saveML_InsideSTSaveComm();
	}

	public void LastNameGI() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "CallData");
		newusertermitecallpage.user_enters_LastNameGI(jsonData);
		
	}
}

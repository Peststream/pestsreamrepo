package com.infocrats.stepdefs;

import com.infocrats.steps.newUserTermiteCallSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class newUserTermiteCallStepDefs {

	@Steps
	newUserTermiteCallSteps newusertermitecallsteps;

	@When("^user click on CallTab$")
	public void user_click_on_CallTab() throws Exception {
		newusertermitecallsteps.clickOnCallTab();
	}

	@Then("^user enter Company$")
	public void user_enter_Company() throws Exception {
		newusertermitecallsteps.clickOnCompany();
	}

	@Then("^user click on Contact$")
	public void user_click_on_Contact() throws Exception {
		newusertermitecallsteps.clickOnContact();
	}

	@Then("^user click on Search$")
	public void user_click_on_Search() {
		newusertermitecallsteps.clickOnSearch();
	}

	@Then("^user click on PrimaryEmail$")
	public void user_click_on_PrimaryEmail() throws Exception {
		newusertermitecallsteps.clickOnPrimaryEmail();
	}

	@Then("^user click on Cell$")
	public void user_click_on_Cell() throws Exception {
		newusertermitecallsteps.clickOnCell();
	}

	@Then("^user click on Branch$")
	public void user_click_on_Branch() throws Exception {
		newusertermitecallsteps.clickOnBranch();
	}

	@Then("^user click on Source$")
	public void user_click_on_Source() throws Exception {
		newusertermitecallsteps.clickOnSource();
	}

	@Then("^user enters alert$")
	public void user_enters_alert() throws Exception {
		newusertermitecallsteps.clickOnCallTab();
	}

	@Then("^user enters probDesc$")
	public void user_enters_probDesc() {
		newusertermitecallsteps.clickOnAlert();
	}

	@Then("^user click on OppType$")
	public void user_click_on_OppType() {
		newusertermitecallsteps.clickOnOppType();
	}

	@Then("^user click on Continue_Termi$")
	public void user_click_on_Continue_Termi() {
		newusertermitecallsteps.clickOnContinue_Termi();
	}

	// **********************************

	@Then("^user enters company$")
	public void user_enters_company() throws Exception {
		newusertermitecallsteps.clickOncompany();
	}

	@Then("^user enters contact$")
	public void user_enters_contact() throws Exception {
		newusertermitecallsteps.clickOncontact();
	}

	@Then("^user enters MName$")
	public void user_enters_MName() throws Exception {
		newusertermitecallsteps.clickOnMName();
	}

	@Then("^user enters LName$")
	public void user_enters_LName() throws Exception {
		newusertermitecallsteps.clickOnLName();
	}

	@Then("^user enters PEmail$")
	public void user_enters_PEmail() throws Exception {
		newusertermitecallsteps.clickOnPEmail();
	}

	@Then("^user enters cell$")
	public void user_enters_cell() throws Exception {
		newusertermitecallsteps.cell();
	}

	@Then("^user click on lead$")
	public void user_click_on_lead() throws Exception {
		newusertermitecallsteps.clickOnlead();
	}

	@Then("^user click on addressLine(\\d+)$")
	public void user_click_on_addressLine(int arg1) throws Exception {
		newusertermitecallsteps.clickOnaddressLine();
	}

	@Then("^user click on zip$")
	public void user_click_on_zip() throws Exception {
		newusertermitecallsteps.clickOnzip();
	}

	@Then("^user click on city$")
	public void user_click_on_city() throws Exception {
		newusertermitecallsteps.clickOncity();
	}

	@Then("^user click on addNote$")
	public void user_click_on_addNote() throws Exception {
		newusertermitecallsteps.clickOnaddNote();
	}

	@Then("^user click on DDserviceStdServices$")
	public void user_click_on_DDserviceStdServices() throws Exception {
		newusertermitecallsteps.clickOnDDserviceStdServic();
	}

	@Then("^user click on DDpackageStdServices$")
	public void user_click_on_DDpackageStdServices() throws Exception {
		newusertermitecallsteps.clickOnDDpackageStdServices();
	}

	@Then("^user click on DDfrequencyStdServices$")
	public void user_click_on_DDfrequencyStdServices() throws Exception {
		newusertermitecallsteps.clickOnDDfrequencyStdServices();
	}
	//
	// @Then("^user click on DDbillingFrequency$")
	// public void user_click_on_DDbillingFrequency() {
	// newusertermitecallsteps.clickOnDDbillingFrequency();
	// }

	@Then("^user click on addStdServices$")
	public void user_click_on_addStdServices() throws Exception {
		newusertermitecallsteps.clickOnaddStdServices();
	}

	@Then("^user click on radioButtionAddToAgreement$")
	public void user_click_on_radioButtionAddToAgreement() throws Exception {
		newusertermitecallsteps.clickOnradioButtionAddToAgreement();
	}

	@Then("^user click on saveAddToAgreement$")
	public void user_click_on_saveAddToAgreement() throws Exception {
		newusertermitecallsteps.clickOnsaveAddToAgreement();
	}

	@Then("^user click on OppTypeComm$")
	public void user_click_on_OppTypeComm() throws Exception {
		newusertermitecallsteps.clickOnOppTypeComm();
	}

	@When("^user click on opportunity$")
	public void user_click_on_opportunity() throws Exception {
		newusertermitecallsteps.clickOnopportunity();
	}

	@Then("^user click on saveAndCont_GI_SalesApp_Appointments$")
	public void user_click_on_saveAndCont_GI_SalesApp_Appointments() throws Exception {
		newusertermitecallsteps.clickOnsaveAndCont();
	}

	@Then("^user click on continue_Inspection_SalesApp_Appointments$")
	public void user_click_on_continue_Inspection_SalesApp_Appointments() throws Exception {
		newusertermitecallsteps.clickOncontinue_Insp();
	}

	@Then("^user click on markAsLost_SelectService_SalesApp_Appointments$")
	public void user_click_on_markAsLost_SelectService_SalesApp_Appointments() throws Exception {
		newusertermitecallsteps.clickOnOppmarkAsLost();
	}

	@Then("^user click on DDReason_OppLostReason$")
	public void user_click_on_DDReason_OppLostReason() throws Exception {
		newusertermitecallsteps.clickOnOppDDReason();
	}

	@Then("^user click on des_OppLostReason$")
	public void user_click_on_des_OppLostReason() throws Exception {
		newusertermitecallsteps.clickOndes();
	}

	@Then("^user click on save_OppLostReason$")
	public void user_click_on_save_OppLostReason() throws Exception {
		newusertermitecallsteps.clickOnsave();
	}

	@Then("^user click on ServiceBundle$")
	public void user_click_on_ServiceBundle() throws Exception {
		newusertermitecallsteps.clickOnServiceBundle();
	}

	@Then("^user click on DDBundle$")
	public void user_click_on_DDBundle() throws Exception {
		newusertermitecallsteps.clickOnDDBundle();
	}

	@Then("^user click on AddBundle$")
	public void user_click_on_AddBundle() throws Exception {
		newusertermitecallsteps.clickOnAddBundle();
	}

	@Then("^user click on radioBttnAddToAgreement$")
	public void user_click_on_radioBttnAddToAgreement() throws Exception {
		newusertermitecallsteps.clickOnradioBttnAddToAgreement();
	}

	@Then("^user click on Save_BundleServices$")
	public void user_click_on_Save_BundleServices() throws Exception {
		newusertermitecallsteps.clickOnSave_BundleServices();
	}

	@Then("^user click on ScheduleEstimation$")
	public void user_click_on_ScheduleEstimation() throws Exception {
		newusertermitecallsteps.clickOnScheduleEstimation();
	}

	@Then("^user click on DDAssignedTo$")
	public void user_click_on_DDAssignedTo() throws Exception {
		newusertermitecallsteps.clickOnDDAssignedTo();
	}

	@Then("^user click on saveScheduleEstimation$")
	public void user_click_on_saveScheduleEstimation() throws Exception {
		newusertermitecallsteps.saveScheduleEstimation();
	}

	@Then("^user click on MarkLost_ScheduleEstimation$")
	public void user_click_on_MarkLost_ScheduleEstimation() throws Exception {
		newusertermitecallsteps.MarkLScheduleEstimation();
	}

	@Then("^user click on DDReason_ScheduleEstimation$")
	public void user_click_on_DDReason_ScheduleEstimation() throws Exception {
		newusertermitecallsteps.DDReason_ScheduleEstimation();
	}

	@Then("^user click on des_ScheduleEstimation$")
	public void user_click_on_des_ScheduleEstimation() throws Exception {
		newusertermitecallsteps.des_ScheduleEstimation();
	}

	@Then("^user click on save_ScheduleEstimation$")
	public void user_click_on_save_ScheduleEstimation() throws Exception {
		newusertermitecallsteps.save_ScheduleEstimation();
	}

	@Then("^user click on RangeTime_InsideScheduleEstimation$")
	public void user_click_on_RangeTime_InsideScheduleEstimation() throws Exception {
		newusertermitecallsteps.RangeTime_InsideScheduleEstimation();
	}

	@Then("^user click on DDTimeRange_InsideScheduleEstimation$")
	public void user_click_on_DDTimeRange_InsideScheduleEstimation() throws Exception {
		newusertermitecallsteps.DDTimeRange_InsideScheduleEstimation();
	}

	@Then("^user click on fieldRadioBttn_FieldScheduleEstimation$")
	public void user_click_on_fieldRadioBttn_FieldScheduleEstimation() throws Exception {
		newusertermitecallsteps.fieldRadioBttn_FieldScheduleEstimation();
	}

	@Then("^user click on InsideRadioBttn_Comm$")
	public void user_click_on_InsideRadioBttn_Comm() throws Exception {
		newusertermitecallsteps.click_on_InsideRadioBttn_Comm();
	}

	@Then("^user click on generatedOpportunity_FieldSTSaveComm$")
	public void user_click_on_generatedOpportunity_FieldSTSaveComm() {
		newusertermitecallsteps.generatedOpportunity_FieldSTSaveComm();
	}

	@Then("^user click on saveAndcontGI_FieldSTSaveComm$")
	public void user_click_on_saveAndcontGI_FieldSTSaveComm() {
		newusertermitecallsteps.saveAndcontGI_FieldSTSaveComm();
	}

	@Then("^user click on continueInspection_FieldSTSaveComm$")
	public void user_click_on_continueInspection_FieldSTSaveComm() {
		newusertermitecallsteps.continueInspection_FieldSTSaveComm();
	}

	@Then("^user click on DDCat_StdService_FieldSTSaveComm$")
	public void user_click_on_DDCat_StdService_FieldSTSaveComm() {
		newusertermitecallsteps.DDCat_StdService_FieldSTSaveComm();
	}

	@Then("^user click on DDService_StdService_FieldSTSaveComm$")
	public void user_click_on_DDService_StdService_FieldSTSaveComm() {
		newusertermitecallsteps.DDService_StdService_FieldSTSaveComm();
	}

	@Then("^user click on DDFrequency_StdService_FieldSTSaveComm$")
	public void user_click_on_DDFrequency_StdService_FieldSTSaveComm() {
		newusertermitecallsteps.DDFrequency_StdService_FieldSTSaveComm();
	}

	@Then("^user click on Save_StdService_FieldSTSaveComm$")
	public void user_click_on_Save_StdService_FieldSTSaveComm() {
		newusertermitecallsteps.Save_StdService_FieldSTSaveComm();
	}

	@Then("^user click on saveAndcontSelectService_FieldSTSaveComm$")
	public void user_click_on_saveAndcontSelectService_FieldSTSaveComm() {
		newusertermitecallsteps.saveAndcontSelectService_FieldSTSaveComm();
	}

	@Then("^user click on radioBttn_Service_FieldSTSaveComm$")
	public void user_click_on_radioBttn_Service_FieldSTSaveComm() {
		newusertermitecallsteps.radioBttn_Service_FieldSTSaveComm();
	}

	@Then("^user click on saveAndcontConfigureProposal_FieldSTSaveComm$")
	public void user_click_on_saveAndcontConfigureProposal_FieldSTSaveComm() {
		newusertermitecallsteps.saveAndcontConfigureProposal_FieldSTSaveComm();
	}

	@Then("^user click on radioBttncashAgreement_FieldSTSaveComm$")
	public void user_click_on_radioBttncashAgreement_FieldSTSaveComm() {
		newusertermitecallsteps.radioBttncashAgreement_FieldSTSaveComm();
	}

	@Then("^user click on valuepaidamountAgreement_FieldSTSaveComm$")
	public void user_click_on_valuepaidamountAgreement_FieldSTSaveComm() throws Exception {
		newusertermitecallsteps.valuepaidamountAgreement_FieldSTSaveComm();
	}

	@Then("^user click on radioBttnTANDCAgreement_FieldSTSaveComm$")
	public void user_click_on_radioBttnTANDCAgreement_FieldSTSaveComm() {
		newusertermitecallsteps.radioBttnTANDCAgreement_FieldSTSaveComm();
	}

	@Then("^user click on 	salesrepresentativesignAgreement_FieldSTSaveComm$")
	public void user_click_on_salesrepresentativesignAgreement_FieldSTSaveComm() {
		newusertermitecallsteps.salesrepresentativesignAgreement_FieldSTSaveComm();
	}

	@Then("^user click on saveandcontAgreement_FieldSTSaveComm$")
	public void user_click_on_saveandcontAgreement_FieldSTSaveComm() {
		newusertermitecallsteps.saveandcontAgreement_FieldSTSaveComm();
	}

	@Then("^user click on sendemail_FieldSTSaveComm$")
	public void user_click_on_sendemail_FieldSTSaveComm() {
		newusertermitecallsteps.sendemail_FieldSTSaveComm();
	}

	@Then("^user click on typenameagreement_FieldSTSaveComm$")
	public void user_click_on_typenameagreement_FieldSTSaveComm() throws Exception {
		newusertermitecallsteps.typenameagreement_FieldSTSaveComm();
	}

	@Then("^user click on markaslost_InsideSTSaveComm$")
	public void user_click_on_markaslost_InsideSTSaveComm() {
		newusertermitecallsteps.markaslost_InsideSTSaveComm();
	}

	@Then("^user click on DDReasonML_InsideSTSaveComm$")
	public void user_click_on_DDReasonML_InsideSTSaveComm() {
		newusertermitecallsteps.DDReasonML_InsideSTSaveComm();
	}

	@Then("^user click on saveML_InsideSTSaveComm$")
	public void user_click_on_saveML_InsideSTSaveComm() {
		newusertermitecallsteps.saveML_InsideSTSaveComm();
	}
	
	
}

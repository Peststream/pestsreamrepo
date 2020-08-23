package com.infocrats.pageObjects;

import java.util.Map;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.JsonHelper;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class newUserTermiteCallPage extends peststreamPage {
	BaseUtills utills = new BaseUtills();
	private Map<String, Integer> jsonData;

	@FindBy(xpath = "//span[contains(text(),'Call')]")
	private WebElementFacade CallTab;

	@FindBy(xpath = "//*[@id='crmCompanySaleshead']")
	private WebElementFacade Company_CSSO;

	@FindBy(xpath = "//*[@id='btngocrmCompanySaleshead']/i")
	private WebElementFacade companySearch;

	@FindBy(xpath = "//*[@id='frmGeneralInfo']/div/div/div[3]/div[1]/div[2]/div/div/span[1]/span/div[2]/div/a")
	private WebElementFacade companySearchCreate;

	@FindBy(xpath = "//input[@id='crmContactSaleshead']")
	private WebElementFacade Contact_CSSO;

	@FindBy(xpath = "//*[@id='btngocrmContactSaleshead']/i")
	private WebElementFacade contactSearch;

	@FindBy(xpath = "/html//form[@id='frmGeneralInfo']/div[@class='divPhoneSales']//div[@class='col-md-3 divSalesContact']/div[@class='form-group']/div[@class='input-group']/span[@class='twitter-typeahead']/span[@class='tt-dropdown-menu']/div[@class='tt-dataset-list2']/span[@class='tt-suggestions']/div/div")
	private WebElementFacade contactSearchValue;

	@FindBy(xpath = "//input[@id='PrimaryEmail']")
	private WebElementFacade PrimaryEmail;

	@FindBy(xpath = "//input[@id='CellNo']")
	private WebElementFacade Cell;

	@FindBy(xpath = "//div[@id='s2id_BranchId']//b")
	private WebElementFacade DDBranch;

	@FindBy(xpath = "//*[@id=\"select2-result-label-15\"]")
	private WebElementFacade ValueBranch;

	@FindBy(xpath = "//*[@id=\"frmGeneralInfo\"]/div/div/div[3]/div[5]/div[2]/div/div/button/span[1]")
	private WebElementFacade DDSource;

	@FindBy(xpath = "//span[contains(text(),'CustomerPortal App')]")
	private WebElementFacade ValueSource;

	@FindBy(xpath = "//input[@id='CrmContactMiddleName']")
	private WebElementFacade MiddleName;

	@FindBy(xpath = "//input[@id='CrmContactLastName']")
	private WebElementFacade LastName;

	@FindBy(xpath = "//input[@id='crmCompanySaleshead']")
	private WebElementFacade company;

	@FindBy(xpath = "//input[@id='crmContactSaleshead']")
	private WebElementFacade contact;

	@FindBy(xpath = "//input[@id='CrmContactMiddleName']")
	private WebElementFacade MName;

	@FindBy(xpath = "//input[@id='CrmContactLastName']")
	private WebElementFacade LName;

	@FindBy(xpath = "//input[@id='PrimaryEmail']")
	private WebElementFacade PEmail;

	@FindBy(xpath = "//*[@id=\"uniform-rdoResidential\"]")
	private WebElementFacade OppType;

	@FindBy(xpath = "//input[@id='CreateWebLead']")
	private WebElementFacade Lead;

	@FindBy(xpath = "//input[@id='SpRequiredServiceAddressControl_ServiceAddressLine1']")
	private WebElementFacade AddressLine;

	@FindBy(xpath = "//input[@id='SpRequiredServiceAddressControl_ServiceZipCode']")
	private WebElementFacade Zip;

	@FindBy(xpath = "//input[@id='SpRequiredServiceAddressControl_ServiceCityName']")
	private WebElementFacade City;

	@FindBy(xpath = "//textarea[@id='Notes']")
	private WebElementFacade AddNote;

	@FindBy(xpath = "//div[@id='s2id_SelectServicePackageVm_ServiceMasterId']//b")
	private WebElementFacade DDService;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade valueService;

	@FindBy(xpath = "//div[@id='s2id_SelectServicePackageVm_PackageId']//b")
	private WebElementFacade DDPackage;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade valuePackage;

	@FindBy(xpath = "//div[@id='s2id_SelectServicePackageVm_FrequencyId']//b")
	private WebElementFacade DDFrequency;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade valueFrequency;

	@FindBy(xpath = "//button[@id='addService']")
	private WebElementFacade AddStdService;

	@FindBy(xpath = "//input[@id='StandardServices_0_IsSold']")
	private WebElementFacade RadioBtnAddToAgreement;

	@FindBy(xpath = "(//span[contains(.,'Save')])[6]")
	private WebElementFacade SaveAddToAgreement;

	@FindBy(xpath = "//*[@id='uniform-rdoCommercial']")
	private WebElementFacade OppTypeComm;

	@FindBy(xpath = "//*[@id=\"sample_1\"]/tbody/tr[1]/td[2]/a")
	private WebElementFacade Opportunity;

	@FindBy(xpath = "//div[@class='row pull-right']//span[@class='ladda-label'][contains(text(),'Save & Continue')]")
	private WebElementFacade saveAndCont;

	@FindBy(xpath = "//button[@id='submit2']//span[@class='ladda-label'][contains(text(),'Continue')]")
	private WebElementFacade continue_Insp;

	@FindBy(xpath = "//button[@id='submitlost']//span[@class='ladda-label'][contains(text(),'Mark as Lost')]")
	private WebElementFacade OppmarkAsLost;

	@FindBy(xpath = "//span[@class='select2-arrow']//b")
	private WebElementFacade OppDDReason;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade OppValueReason;

	@FindBy(xpath = "//textarea[@id='txtCancelReasonDescription']")
	private WebElementFacade des;

	@FindBy(xpath = "//button[@class='btn blue ladda-button formSaveButton']")
	private WebElementFacade save;
	
	@FindBy(xpath = "(//*[@id=\"uniform-SelectServicePackageVm_SelectServiceType\"])[2]")
	private WebElementFacade Bundle;
	
	@FindBy(xpath = "//*[@id=\"divbundle\"]/div[1]/div/div/button/span[1]")
	private WebElementFacade DDBundle;
	
	@FindBy(xpath = "//span[contains(text(),'service')]")
	private WebElementFacade ValueDDBundle;
	
	@FindBy(xpath = "//button[@id='addBundle']")
	private WebElementFacade AddBundle;
	
	@FindBy(xpath = "//input[@id='10125_Monthly']")
	private WebElementFacade RadioBttnAddToAgreement;
	
	@FindBy(xpath = "//div[7]//div[2]//span[1]//button[2]//span[1]")
	private WebElementFacade Save_BundleServices;
	
	@FindBy(xpath = "//a[contains(text(),'Schedule Estimation')]")
	private WebElementFacade ScheduleEstimations;
	
	@FindBy(xpath = "//div[@id='s2id_FieldSalesPerson']//b")
	private WebElementFacade DDAssignedTo;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[3]")
	private WebElementFacade ValueDDAssignedTo;
	
	@FindBy(xpath = "(//*[@id=\"btnSave\"]/span)[2]")
	private WebElementFacade saveScheduleEstimation;
	
	@FindBy(xpath = "(//*[@id=\"submitlost\"]/span)[2]")
	private WebElementFacade MarkLScheduleEstimation;
	
	@FindBy(xpath = "//div[@id='s2id_SelCancelReasonMasterId']//b")
	private WebElementFacade DDReason_ScheduleEstimation;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade ValueDDReason_ScheduleEstimation;
	
	@FindBy(xpath = "//textarea[@id='txtCancelReasonDescription']")
	private WebElementFacade des_ScheduleEstimation;
	
	@FindBy(xpath = "(//span[contains(.,'Save')])[9]")
	private WebElementFacade save_ScheduleEstimation;
	
	@FindBy(xpath = "//*[@id='uniform-RangeTimeType']")
	private WebElementFacade RangeTime_InsideScheduleEstimation;
	
	@FindBy(xpath = "//select[@id='InitialPreferedId']")
	private WebElementFacade DDTimeRange_InsideScheduleEstimation;
	
	@FindBy(xpath = "//*[@id=\"InitialPreferedId\"]/option[2]")
	private WebElementFacade ValueDDTimeRange_InsideScheduleEstimation;
	
	@FindBy(xpath = "(//*[@id=\"uniform-SalesType\"])[2]")
	private WebElementFacade fieldRadioBttn_FieldScheduleEstimation;
	
	@FindBy(xpath = "(//*[@id=\"uniform-SalesType\"])[1]")
	private WebElementFacade InsideRadioBttn_Comm;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
	private WebElementFacade generatedOpportunity_FieldSTSaveComm;
	
	@FindBy(xpath = "(//span[contains(.,'Save & Continue')])[1]")
	private WebElementFacade saveAndcontGI_FieldSTSaveComm;
	
	@FindBy(xpath = "(//span[contains(.,'Continue')])[3]")
	private WebElementFacade continueInspection_FieldSTSaveComm;
	
	@FindBy(xpath = "(//span[contains(.,'--Select--')])[5]")
	private WebElementFacade DDCat_StdService_FieldSTSaveComm;
	
	@FindBy(xpath = "//span[contains(text(),'Termite Service Category')]")
	private WebElementFacade ValueDDCat_StdService_FieldSTSaveComm;
	
	@FindBy(xpath = "(//span[contains(.,'Select Service...')])[1]")
	private WebElementFacade DDService_StdService_FieldSTSaveComm;
	
	@FindBy(xpath = "(//span[contains(.,'Termite Service')])[3]")
	private WebElementFacade ValueDDService_StdService_FieldSTSaveComm;
	
	@FindBy(xpath = "(//span[contains(.,'Select Frequency...')])[1]")
	private WebElementFacade DDFrequency_StdService_FieldSTSaveComm;
	
	@FindBy(xpath = "(//span[contains(.,'EOM')])[1]")
	private WebElementFacade ValueDDFrequency_StdService_FieldSTSaveComm;
	
	@FindBy(xpath = "(//button[contains(.,'Save')])[5]")
	private WebElementFacade Save_StdService_FieldSTSaveComm;
	
	@FindBy(xpath = "(//span[contains(.,'Save & Continue')])[4]")
	private WebElementFacade saveAndcontSelectService_FieldSTSaveComm;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElementFacade radioBttn_Service_FieldSTSaveComm;
	
	@FindBy(xpath = "(//span[contains(.,'Save & Continue')])[6]")
	private WebElementFacade saveAndcontConfigureProposal_FieldSTSaveComm;
	
	@FindBy(xpath = "(//input[contains(@type,'radio')])[5]")
	private WebElementFacade radioBttncashAgreement_FieldSTSaveComm;
	
	@FindBy(xpath = "//input[@id='txtTotalPaidPrice']")
	private WebElementFacade valuepaidamountAgreement_FieldSTSaveComm;
	
	@FindBy(xpath = "//input[@id='IAgreeTerms']")
	private WebElementFacade radioBttnTANDCAgreement_FieldSTSaveComm;
	
	@FindBy(xpath = "//canvas[@id='ctlSignatureT']")
	private WebElementFacade salesrepresentativesignAgreement_FieldSTSaveComm;
	
	@FindBy(xpath = "(//span[contains(.,'Save & Continue')])[9]")
	private WebElementFacade saveandcontAgreement_FieldSTSaveComm;
	
	@FindBy(xpath = "//span[contains(text(),'Send Email')]")
	private WebElementFacade sendemail_FieldSTSaveComm;
	
	@FindBy(xpath = "//input[@id='txtCusomerSignName']")
	private WebElementFacade typenameagreement_FieldSTSaveComm;
	
	@FindBy(xpath = "(//span[contains(.,'Mark as Lost')])[1]")
	private WebElementFacade markaslost_InsideSTSaveComm;
	
	@FindBy(xpath = "//span[@id='select2-chosen-1']")
	private WebElementFacade DDReasonML_InsideSTSaveComm;
	
	@FindBy(xpath = " (//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade ValueDDReasonML_InsideSTSaveComm;
	
	@FindBy(xpath = "(//span[contains(.,'Save')])[32]")
	private WebElementFacade saveML_InsideSTSaveComm;
	
	@FindBy(xpath = "//select[@id='SpServiceAddressControl_ServiceStateSysName']")
	private WebElementFacade DDselectstate;
	
	@FindBy(xpath = "//select[@id='SpServiceAddressControl_ServiceStateSysName']//option[contains(text(),'New York')]")
	private WebElementFacade DDselectstatevalue;
	
	
	
	@Override
	public WebElementFacade getUniqueElement() {
		return null;
	}

	public void clickOnCallTab() throws Exception {
		CallTab.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));

	}

	public void clickOnCompany(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
		Company_CSSO.sendKeys(testData.get("CompName"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
		companySearch.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
		companySearchCreate.click();

	}

	public void clickOnContact(Map<String, String> testData) throws Exception {
		Contact_CSSO.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		Contact_CSSO.sendKeys(testData.get("ContName"));
		contactSearch.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		contactSearchValue.click();

		// MiddleName.click();
		// waitABit(2000);
		// MiddleName.sendKeys(testData.get("MName"));
		// waitABit(2000);
		//
		// LastName.click();
		// waitABit(2000);
		// LastName.sendKeys(testData.get("LName"));
		// waitABit(2000);

	}

	public void clickOnSearch() {
		companySearch.click();
	}

	public void clickOnPrimaryEmail(Map<String, String> testData) throws Exception {
		PrimaryEmail.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
		PrimaryEmail.sendKeys(testData.get("PrimaryEmail"));
	}

	public void clickOnCell(Map<String, String> testData) throws Exception {
		Cell.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
		Cell.sendKeys(testData.get("CellNumber"));

	}

	public void clickOnBranch() throws Exception {
		DDBranch.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));

		ValueBranch.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));

	}

	public void clickOnSource() throws Exception {
		DDSource.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));

		ValueSource.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));

	}

	public void clickOnAlert() {
		// TODO Auto-generated method stub

	}

	public void clickOnOppType() {
		OppType.click();

	}

	public void clickOnContinue_Termi() {
		// TODO Auto-generated method stub

	}

	// ************************

	public void clickOncompany(Map<String, String> testData) throws Exception {
		company.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		company.sendKeys(testData.get("CompName"));

		companySearch.click();
		companySearchCreate.click();
	}

	public void clickOncontact(Map<String, String> testData) throws Exception {
		contact.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		contact.sendKeys(testData.get("ContName"));

		contactSearch.click();
		contactSearchValue.click();

	}

	public void clickOnMName(Map<String, String> testData) throws Exception {
		MName.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		MName.sendKeys(testData.get("MName"));
	}

	public void clickOnLName(Map<String, String> testData) throws Exception {
		LName.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		LName.sendKeys(testData.get("LName"));
	}

	public void clickOnPEmail(Map<String, String> testData) throws Exception {
		PEmail.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		PEmail.sendKeys(testData.get("PEmail"));
	}

	public void clickOncell(Map<String, String> testData) throws Exception {
		Cell.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		Cell.sendKeys(testData.get("CNumber"));
	}

	public void clickOnlead() throws Exception {
		Lead.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));

	}

	public void clickOnaddressLine(Map<String, String> testData) throws Exception {
		AddressLine.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
		AddressLine.sendKeys(testData.get("AddressLine1"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOnzip(Map<String, String> testData) throws Exception {
		Zip.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
		Zip.sendKeys(testData.get("Zip"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOncity(Map<String, String> testData) throws Exception {
		City.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
		City.sendKeys(testData.get("City"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOnaddNote(Map<String, String> testData) throws Exception {
		AddNote.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
		AddNote.sendKeys(testData.get("AddNote"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOnDDserviceStdServic() throws Exception {
		scrollDown(DDService);
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
		DDService.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));

		valueService.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOnDDpackageStdServices() throws Exception {
		DDPackage.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));

		valuePackage.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOnDDfrequencyStdServices() throws Exception {
		DDFrequency.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));

		valueFrequency.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	// public void clickOnDDbillingFrequency() {
	// DDBilling.click();
	// waitABit(1000);
	// }

	public void clickOnaddStdServices() throws Exception {
		AddStdService.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOnradioButtionAddToAgreement() throws Exception {
		RadioBtnAddToAgreement.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOnsaveAddToAgreement() throws Exception {
		scrollDown(SaveAddToAgreement);
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
		SaveAddToAgreement.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOnOppTypeComm() throws Exception {
		scrollDown(OppTypeComm);
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
		OppTypeComm.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));

	}

	public void clickOnopportunity() throws Exception {
		Opportunity.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOnsaveAndCont() throws Exception {
		scrollUP(saveAndCont);
		saveAndCont.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOncontinue_Insp() throws Exception {
		continue_Insp.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOnOppmarkAsLost() throws Exception {
		OppmarkAsLost.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOnOppDDReason() throws Exception {
		OppDDReason.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));

		OppValueReason.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOndes(Map<String, String> testData) throws Exception {
		des.sendKeys(testData.get("Description"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOnsave() throws Exception {
		save.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOnBundle() throws Exception {
		scrollDownLarge(Bundle);
		Bundle.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOnDDBundle() throws Exception {
		DDBundle.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
		
		ValueDDBundle.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOnAddBundle() throws Exception {
		AddBundle.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOnradioBttnAddToAgreement() throws Exception {
		RadioBttnAddToAgreement.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOnSave_BundleServices() throws Exception {
		Save_BundleServices.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOnScheduleEstimations() throws Exception {
		scrollDownLarge(ScheduleEstimations);
		ScheduleEstimations.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

	public void clickOnDDAssignedTo() throws Exception {
		scrollDownLarge(DDAssignedTo);
		DDAssignedTo.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
		
		ValueDDAssignedTo.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

		public void saveScheduleEstimation() throws Exception {
		saveScheduleEstimation.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
	}

		public void MarkLScheduleEstimation() throws Exception {
			MarkLScheduleEstimation.click();
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			waitABit(jsonData.get("Time3"));
			
		}

		public void DDReason_ScheduleEstimation() throws Exception {
			DDReason_ScheduleEstimation.click();
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			waitABit(jsonData.get("Time3"));
			
			ValueDDReason_ScheduleEstimation.click();
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			waitABit(jsonData.get("Time3"));
		}

		public void des_ScheduleEstimation(Map<String, String> testData) throws Exception {
			des_ScheduleEstimation.sendKeys(testData.get("Description"));
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			waitABit(jsonData.get("Time3"));
		}

		public void save_ScheduleEstimation() throws Exception {
			save_ScheduleEstimation.click();
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			waitABit(jsonData.get("Time3"));
		}

		public void RangeTime_InsideScheduleEstimation() throws Exception {
			RangeTime_InsideScheduleEstimation.click();
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			waitABit(jsonData.get("Time3"));
		}

		public void DDTimeRange_InsideScheduleEstimation() throws Exception {
			DDTimeRange_InsideScheduleEstimation.click();
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			waitABit(jsonData.get("Time3"));
			
			ValueDDTimeRange_InsideScheduleEstimation.click();
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			waitABit(jsonData.get("Time3"));
		}

		public void fieldRadioBttn_FieldScheduleEstimation() throws Exception {
			fieldRadioBttn_FieldScheduleEstimation.click();
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			waitABit(jsonData.get("Time3"));
			
		}

		public void click_on_InsideRadioBttn_Comm() throws Exception {
			InsideRadioBttn_Comm.click();
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			waitABit(jsonData.get("Time3"));
		}

		
		
		
		
		
		
		
		
	public void generatedOpportunity_FieldSTSaveComm() {
		generatedOpportunity_FieldSTSaveComm.click();
		waitABit(2000);

		scrollDown(DDselectstate);
		waitABit(2000);
		DDselectstate.click();
		waitABit(3000);

		DDselectstatevalue.click();
		waitABit(3000);

	}

		public void saveAndcontGI_FieldSTSaveComm() {
			scrollUP(saveAndcontGI_FieldSTSaveComm);
			saveAndcontGI_FieldSTSaveComm.click();
			waitABit(1000);
		}

		public void continueInspection_FieldSTSaveComm() {
			waitABit(1000);
			continueInspection_FieldSTSaveComm.click();
			waitABit(1000);
		}

		public void DDCat_StdService_FieldSTSaveComm() {
			DDCat_StdService_FieldSTSaveComm.click();
			waitABit(3000);
			
			ValueDDCat_StdService_FieldSTSaveComm.click();
			waitABit(1000);
		}

		public void DDService_StdService_FieldSTSaveComm() {
			DDService_StdService_FieldSTSaveComm.click();
			waitABit(1000);
			
			ValueDDService_StdService_FieldSTSaveComm.click();
			waitABit(1000);
		}

		public void DDFrequency_StdService_FieldSTSaveComm() {
			DDFrequency_StdService_FieldSTSaveComm.click();
			waitABit(1000);
			
			ValueDDFrequency_StdService_FieldSTSaveComm.click();
			waitABit(1000);
		}

		public void Save_StdService_FieldSTSaveComm() {
			waitABit(2000);
			Save_StdService_FieldSTSaveComm.click();
			waitABit(3000);
		}

		public void saveAndcontSelectService_FieldSTSaveComm() {
			waitABit(2000);
			saveAndcontSelectService_FieldSTSaveComm.click();
			waitABit(3000);
		}

		public void radioBttn_Service_FieldSTSaveComm() {
			waitABit(2000);
			scrollUP(radioBttn_Service_FieldSTSaveComm);
			radioBttn_Service_FieldSTSaveComm.click();
			waitABit(3000);
		}

		public void saveAndcontConfigureProposal_FieldSTSaveComm() {
			waitABit(2000);
			saveAndcontConfigureProposal_FieldSTSaveComm.click();
			waitABit(1000);
			
		}

		public void radioBttncashAgreement_FieldSTSaveComm() {
			waitABit(2000);
			radioBttncashAgreement_FieldSTSaveComm.click();
			waitABit(3000);
		}

		public void valuepaidamountAgreement_FieldSTSaveComm(Map<String, String> testData) {
			waitABit(2000);
			valuepaidamountAgreement_FieldSTSaveComm.sendKeys(testData.get("PaidAmount"));
			waitABit(3000);
		}

		public void radioBttnTANDCAgreement_FieldSTSaveComm() {
			radioBttnTANDCAgreement_FieldSTSaveComm.click();
			waitABit(3000);
		}

		public void salesrepresentativesignAgreement_FieldSTSaveComm() {
			salesrepresentativesignAgreement_FieldSTSaveComm.click();
			waitABit(3000);
		}

		public void saveandcontAgreement_FieldSTSaveComm() {
			saveandcontAgreement_FieldSTSaveComm.click();
			waitABit(3000);
		}

		public void sendemail_FieldSTSaveComm() {
			waitABit(8000);
			sendemail_FieldSTSaveComm.click();
			waitABit(1000);
		}

		public void typenameagreement_FieldSTSaveComm(Map<String, String> testData) {
			typenameagreement_FieldSTSaveComm.sendKeys(testData.get("TypeName"));
			waitABit(1000);
			
		}

		public void markaslost_InsideSTSaveComm() {
			markaslost_InsideSTSaveComm.click();
			waitABit(1000);
		}

		public void DDReasonML_InsideSTSaveComm() {
			DDReasonML_InsideSTSaveComm.click();
			ValueDDReasonML_InsideSTSaveComm.click();
			waitABit(1000);
		}

		public void saveML_InsideSTSaveComm() {
			saveML_InsideSTSaveComm.click();
			waitABit(1000);
		}
		
		public void saveML() {
			saveML_InsideSTSaveComm.click();
			waitABit(1000);
		}

}

package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(CallTab));
		CallTab.click();
	}

	public void clickOnCompany(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Company_CSSO));
		Company_CSSO.click();
		Company_CSSO.sendKeys(testData.get("CompName"));
		
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(companySearch));
		companySearch.click();
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(companySearchCreate));
		companySearchCreate.click();

	}

	public void clickOnContact(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Contact_CSSO));
		Contact_CSSO.click();
		Contact_CSSO.sendKeys(testData.get("ContName"));
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(contactSearch));
		contactSearch.click();
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(contactSearchValue));
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

	public void clickOnSearch() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(companySearch));
		companySearch.click();
	}

	public void clickOnPrimaryEmail(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(PrimaryEmail));
		PrimaryEmail.click();
		PrimaryEmail.sendKeys(testData.get("PrimaryEmail"));
	}

	public void clickOnCell(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Cell));
		Cell.click();
		Cell.sendKeys(testData.get("CellNumber"));

	}

	public void clickOnBranch() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDBranch));
		DDBranch.click();
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(ValueBranch));		
		ValueBranch.click();

	}

	public void clickOnSource() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDSource));
		DDSource.click();
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(ValueSource));		
		ValueSource.click();
	}

	public void clickOnAlert() {
		// TODO Auto-generated method stub

	}

	public void clickOnOppType() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(OppType));
		OppType.click();

	}

	public void clickOnContinue_Termi() {
		// TODO Auto-generated method stub

	}

	// ************************

	public void clickOncompany(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(company));
		company.click();
		company.sendKeys(testData.get("CompName"));

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(companySearch));
		companySearch.click();
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(companySearchCreate));
		companySearchCreate.click();
	}

	public void clickOncontact(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(contact));
		contact.click();
		contact.sendKeys(testData.get("ContName"));

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(contactSearch));
		contactSearch.click();
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(contactSearchValue));
		contactSearchValue.click();

	}

	public void clickOnMName(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(MName));
		MName.click();
		MName.sendKeys(testData.get("MName"));
	}

	public void clickOnLName(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(LName));
		LName.click();
		LName.sendKeys(testData.get("LName"));
	}

	public void clickOnPEmail(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(PEmail));
		PEmail.click();
		PEmail.sendKeys(testData.get("PEmail"));
	}

	public void clickOncell(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Cell));
		Cell.click();
		Cell.sendKeys(testData.get("CNumber"));
	}

	public void clickOnlead() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Lead));
		Lead.click();
	}

	public void clickOnaddressLine(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddressLine));
		AddressLine.click();
		AddressLine.sendKeys(testData.get("AddressLine1"));
	}

	public void clickOnzip(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Zip));
		Zip.click();
		Zip.sendKeys(testData.get("Zip"));
	}

	public void clickOncity(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(City));
		City.click();
		City.sendKeys(testData.get("City"));
	}

	public void clickOnaddNote(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddNote));
		AddNote.click();
		AddNote.sendKeys(testData.get("AddNote"));
	}

	public void clickOnDDserviceStdServic() throws Exception {
		scrollDown(DDService);
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDService));
		DDService.click();
	
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(valueService));
		valueService.click();
	}

	public void clickOnDDpackageStdServices() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDPackage));
		DDPackage.click();

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(valuePackage));	
		valuePackage.click();
	}

	public void clickOnDDfrequencyStdServices() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDFrequency));
		DDFrequency.click();
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(valueFrequency));		
		valueFrequency.click();
		
	}

	// public void clickOnDDbillingFrequency() {
	// DDBilling.click();
	// waitABit(1000);
	// }

	public void clickOnaddStdServices() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddStdService));		
		AddStdService.click();
		
	}

	public void clickOnradioButtionAddToAgreement() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(RadioBtnAddToAgreement));		
		RadioBtnAddToAgreement.click();
	}

	public void clickOnsaveAddToAgreement() throws Exception {
		scrollDown(SaveAddToAgreement);
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveAddToAgreement));
		SaveAddToAgreement.click();
		
	}

	public void clickOnOppTypeComm() throws Exception {
		scrollDown(OppTypeComm);
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(OppTypeComm));
		OppTypeComm.click();
	}

	public void clickOnopportunity() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Opportunity));
		Opportunity.click();
	}

	public void clickOnsaveAndCont() throws Exception {
		scrollUP(saveAndCont);
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveAndCont));
		saveAndCont.click();
	}

	public void clickOncontinue_Insp() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(continue_Insp));
		continue_Insp.click();
		
	}

	public void clickOnOppmarkAsLost() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(OppmarkAsLost));
		OppmarkAsLost.click();
	}

	public void clickOnOppDDReason() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(OppDDReason));
		OppDDReason.click();

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(OppValueReason));
		OppValueReason.click();
	}

	public void clickOndes(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(des));
		des.click();
		des.sendKeys(testData.get("Description"));
		
	}

	public void clickOnsave() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(save));
		save.click();
	}

	public void clickOnBundle() throws Exception {
		scrollDownLarge(Bundle);
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Bundle));
		Bundle.click();
		
	}

	public void clickOnDDBundle() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDBundle));
		DDBundle.click();
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(ValueDDBundle));
		ValueDDBundle.click();
	}

	public void clickOnAddBundle() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddBundle));
		AddBundle.click();
		
	}

	public void clickOnradioBttnAddToAgreement() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(RadioBttnAddToAgreement));
		RadioBttnAddToAgreement.click();
	}

	public void clickOnSave_BundleServices() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Save_BundleServices));
		Save_BundleServices.click();
	}

	public void clickOnScheduleEstimations() throws Exception {
		scrollDownLarge(ScheduleEstimations);
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ScheduleEstimations));
		ScheduleEstimations.click();
		
	}

	public void clickOnDDAssignedTo() throws Exception {
		scrollDownLarge(DDAssignedTo);

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDAssignedTo));
		ValueDDAssignedTo.click();
	}

		public void saveScheduleEstimation() throws Exception {
		
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(saveScheduleEstimation));
			saveScheduleEstimation.click();

	}

		public void MarkLScheduleEstimation() throws Exception {
			
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(MarkLScheduleEstimation));
			MarkLScheduleEstimation.click();
			
		}

		public void DDReason_ScheduleEstimation() throws Exception {
			
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(DDReason_ScheduleEstimation));
			DDReason_ScheduleEstimation.click();
			
			
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait1.until(ExpectedConditions.elementToBeClickable(ValueDDReason_ScheduleEstimation));
			ValueDDReason_ScheduleEstimation.click();
		}

		public void des_ScheduleEstimation(Map<String, String> testData) throws Exception {
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait1.until(ExpectedConditions.elementToBeClickable(des_ScheduleEstimation));
			des_ScheduleEstimation.click();
			des_ScheduleEstimation.sendKeys(testData.get("Description"));
		
		}

		public void save_ScheduleEstimation() throws Exception {
			
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(save_ScheduleEstimation));
			save_ScheduleEstimation.click();
		}

		public void RangeTime_InsideScheduleEstimation() throws Exception {
			
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(RangeTime_InsideScheduleEstimation));
			RangeTime_InsideScheduleEstimation.click();
		
		}

		public void DDTimeRange_InsideScheduleEstimation() throws Exception {
			
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(DDTimeRange_InsideScheduleEstimation));
			DDTimeRange_InsideScheduleEstimation.click();
		
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait1.until(ExpectedConditions.elementToBeClickable(ValueDDTimeRange_InsideScheduleEstimation));
			ValueDDTimeRange_InsideScheduleEstimation.click();
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			waitABit(jsonData.get("Time3"));
		}

		public void fieldRadioBttn_FieldScheduleEstimation() throws Exception {
			
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(fieldRadioBttn_FieldScheduleEstimation));
			fieldRadioBttn_FieldScheduleEstimation.click();
			
		}

		public void click_on_InsideRadioBttn_Comm() throws Exception {
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(InsideRadioBttn_Comm));
			InsideRadioBttn_Comm.click();
		}

		
		
		
		
		
		
		
		
	public void generatedOpportunity_FieldSTSaveComm() throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(generatedOpportunity_FieldSTSaveComm));
		generatedOpportunity_FieldSTSaveComm.click();
	
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(DDselectstate));
		scrollDown(DDselectstate);
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(DDselectstate));
		DDselectstate.click();
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait3 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait3.until(ExpectedConditions.elementToBeClickable(DDselectstatevalue));
		DDselectstatevalue.click();

	}

		public void saveAndcontGI_FieldSTSaveComm() throws Exception {
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait3 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait3.until(ExpectedConditions.elementToBeClickable(saveAndcontGI_FieldSTSaveComm));
			scrollUP(saveAndcontGI_FieldSTSaveComm);
			saveAndcontGI_FieldSTSaveComm.click();
		}

		public void continueInspection_FieldSTSaveComm() throws Exception {

			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(continueInspection_FieldSTSaveComm));
			continueInspection_FieldSTSaveComm.click();
			
		}

		public void DDCat_StdService_FieldSTSaveComm() throws Exception {
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(DDCat_StdService_FieldSTSaveComm));
			DDCat_StdService_FieldSTSaveComm.click();
			
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait1.until(ExpectedConditions.elementToBeClickable(ValueDDCat_StdService_FieldSTSaveComm));
			ValueDDCat_StdService_FieldSTSaveComm.click();
			
		}

		public void DDService_StdService_FieldSTSaveComm() throws Exception {
			
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(DDService_StdService_FieldSTSaveComm));
			DDService_StdService_FieldSTSaveComm.click();
			
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait1.until(ExpectedConditions.elementToBeClickable(ValueDDService_StdService_FieldSTSaveComm));
			ValueDDService_StdService_FieldSTSaveComm.click();
		
		}

		public void DDFrequency_StdService_FieldSTSaveComm() throws Exception {
			
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(DDFrequency_StdService_FieldSTSaveComm));
			DDFrequency_StdService_FieldSTSaveComm.click();

			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait1.until(ExpectedConditions.elementToBeClickable(ValueDDFrequency_StdService_FieldSTSaveComm));
			ValueDDFrequency_StdService_FieldSTSaveComm.click();
			
		}

		public void Save_StdService_FieldSTSaveComm() throws Exception {
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(Save_StdService_FieldSTSaveComm));
			Save_StdService_FieldSTSaveComm.click();
		}

		public void saveAndcontSelectService_FieldSTSaveComm() throws Exception {
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(saveAndcontSelectService_FieldSTSaveComm));
			saveAndcontSelectService_FieldSTSaveComm.click();

		}

		public void radioBttn_Service_FieldSTSaveComm() throws Exception {
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(radioBttn_Service_FieldSTSaveComm));
			scrollUP(radioBttn_Service_FieldSTSaveComm);
			radioBttn_Service_FieldSTSaveComm.click();
		}

		public void saveAndcontConfigureProposal_FieldSTSaveComm() throws Exception {
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(saveAndcontConfigureProposal_FieldSTSaveComm));
			saveAndcontConfigureProposal_FieldSTSaveComm.click();		
		}

		public void radioBttncashAgreement_FieldSTSaveComm() throws Exception {
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(radioBttncashAgreement_FieldSTSaveComm));
			radioBttncashAgreement_FieldSTSaveComm.click();
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		}

		public void valuepaidamountAgreement_FieldSTSaveComm(Map<String, String> testData) throws Exception {
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(valuepaidamountAgreement_FieldSTSaveComm));
			valuepaidamountAgreement_FieldSTSaveComm.click();
			valuepaidamountAgreement_FieldSTSaveComm.sendKeys(testData.get("PaidAmount"));
			
		}

		public void radioBttnTANDCAgreement_FieldSTSaveComm() throws Exception {
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(radioBttnTANDCAgreement_FieldSTSaveComm));
			radioBttnTANDCAgreement_FieldSTSaveComm.click();
			
		}

		public void salesrepresentativesignAgreement_FieldSTSaveComm() throws Exception {
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(salesrepresentativesignAgreement_FieldSTSaveComm));
			salesrepresentativesignAgreement_FieldSTSaveComm.click();
			
		}

		public void saveandcontAgreement_FieldSTSaveComm() throws Exception {
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(saveandcontAgreement_FieldSTSaveComm));
			saveandcontAgreement_FieldSTSaveComm.click();
		}

		public void sendemail_FieldSTSaveComm() throws Exception {
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(sendemail_FieldSTSaveComm));
			sendemail_FieldSTSaveComm.click();
		}

		public void typenameagreement_FieldSTSaveComm(Map<String, String> testData) throws Exception {
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(typenameagreement_FieldSTSaveComm));
			typenameagreement_FieldSTSaveComm.click();
			typenameagreement_FieldSTSaveComm.sendKeys(testData.get("TypeName"));
			
		}

		public void markaslost_InsideSTSaveComm() throws Exception {
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(markaslost_InsideSTSaveComm));
			markaslost_InsideSTSaveComm.click();
			waitABit(1000);
		}

		public void DDReasonML_InsideSTSaveComm() throws Exception {
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(DDReasonML_InsideSTSaveComm));
			DDReasonML_InsideSTSaveComm.click();
			
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait1.until(ExpectedConditions.elementToBeClickable(ValueDDReasonML_InsideSTSaveComm));
			ValueDDReasonML_InsideSTSaveComm.click();
		}

		public void saveML_InsideSTSaveComm() throws Exception {
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(saveML_InsideSTSaveComm));
			saveML_InsideSTSaveComm.click();
		}
		
		public void saveML() throws Exception {
			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(saveML_InsideSTSaveComm));
			saveML_InsideSTSaveComm.click();
		}

}

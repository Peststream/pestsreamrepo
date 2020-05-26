package com.infocrats.pageObjects;

import java.util.Map;

import com.infocrats.utils.BaseUtills;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class newUserTermiteCallPage extends peststreamPage {
	BaseUtills utills = new BaseUtills();

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
	
	@FindBy(xpath = "//select[@id='Services']")
	private WebElementFacade DDService_StdService_FieldSTSaveComm;
	
	@FindBy(xpath = "//option[contains(text(),'Termite 2')]")
	private WebElementFacade ValueDDService_StdService_FieldSTSaveComm;
	
	@FindBy(xpath = "//select[@id='ServiceFrequency']")
	private WebElementFacade DDFrequency_StdService_FieldSTSaveComm;
	
	@FindBy(xpath = "//*[@id=\"ServiceFrequency\"]/option[4]")
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

	public void clickOnCallTab() {
		CallTab.click();

	}

	public void clickOnCompany(Map<String, String> testData) {
		waitABit(3000);
		Company_CSSO.sendKeys(testData.get("CompName"));
		waitABit(3000);
		companySearch.click();
		waitABit(3000);
		companySearchCreate.click();

	}

	public void clickOnContact(Map<String, String> testData) {
		Contact_CSSO.click();
		waitABit(2000);
		Contact_CSSO.sendKeys(testData.get("ContName"));
		contactSearch.click();
		waitABit(2000);
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

	public void clickOnPrimaryEmail(Map<String, String> testData) {
		PrimaryEmail.click();
		waitABit(1000);
		PrimaryEmail.sendKeys(testData.get("PrimaryEmail"));
	}

	public void clickOnCell(Map<String, String> testData) {
		Cell.click();
		waitABit(1000);
		Cell.sendKeys(testData.get("CellNumber"));

	}

	public void clickOnBranch() {
		DDBranch.click();
		waitABit(1000);

		ValueBranch.click();
		waitABit(1000);

	}

	public void clickOnSource() {
		DDSource.click();
		waitABit(1000);

		ValueSource.click();
		waitABit(1000);

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

	public void clickOncompany(Map<String, String> testData) {
		company.click();
		waitABit(1000);
		company.sendKeys(testData.get("CompName"));

		companySearch.click();
		companySearchCreate.click();
	}

	public void clickOncontact(Map<String, String> testData) {
		contact.click();
		waitABit(1000);
		contact.sendKeys(testData.get("ContName"));

		contactSearch.click();
		contactSearchValue.click();

	}

	public void clickOnMName(Map<String, String> testData) {
		MName.click();
		waitABit(1000);
		MName.sendKeys(testData.get("MName"));
	}

	public void clickOnLName(Map<String, String> testData) {
		LName.click();
		waitABit(1000);
		LName.sendKeys(testData.get("LName"));
	}

	public void clickOnPEmail(Map<String, String> testData) {
		PEmail.click();
		waitABit(1000);
		PEmail.sendKeys(testData.get("PEmail"));
	}

	public void clickOncell(Map<String, String> testData) {
		Cell.click();
		waitABit(1000);
		Cell.sendKeys(testData.get("CNumber"));
	}

	public void clickOnlead() {
		Lead.click();
		waitABit(1000);

	}

	public void clickOnaddressLine(Map<String, String> testData) {
		AddressLine.click();
		AddressLine.sendKeys(testData.get("AddressLine1"));
		waitABit(1000);
	}

	public void clickOnzip(Map<String, String> testData) {
		Zip.click();
		Zip.sendKeys(testData.get("Zip"));
		waitABit(1000);
	}

	public void clickOncity(Map<String, String> testData) {
		City.click();
		City.sendKeys(testData.get("City"));
		waitABit(1000);
	}

	public void clickOnaddNote(Map<String, String> testData) {
		AddNote.click();
		AddNote.sendKeys(testData.get("AddNote"));
		waitABit(1000);
	}

	public void clickOnDDserviceStdServic() {
		scrollDown(DDService);
		DDService.click();
		waitABit(1000);

		valueService.click();
		waitABit(1000);
	}

	public void clickOnDDpackageStdServices() {
		DDPackage.click();
		waitABit(1000);

		valuePackage.click();
		waitABit(1000);
	}

	public void clickOnDDfrequencyStdServices() {
		DDFrequency.click();
		waitABit(1000);

		valueFrequency.click();
		waitABit(1000);
	}

	// public void clickOnDDbillingFrequency() {
	// DDBilling.click();
	// waitABit(1000);
	// }

	public void clickOnaddStdServices() {
		AddStdService.click();
		waitABit(1000);
	}

	public void clickOnradioButtionAddToAgreement() {
		RadioBtnAddToAgreement.click();
		waitABit(1000);
	}

	public void clickOnsaveAddToAgreement() {
		scrollDown(SaveAddToAgreement);
		SaveAddToAgreement.click();
		waitABit(6000);
	}

	public void clickOnOppTypeComm() {
		scrollDown(OppTypeComm);
		OppTypeComm.click();
		waitABit(1000);

	}

	public void clickOnopportunity() {
		Opportunity.click();
		waitABit(1000);
	}

	public void clickOnsaveAndCont() {
		scrollUP(saveAndCont);
		saveAndCont.click();
		waitABit(1000);
	}

	public void clickOncontinue_Insp() {
		continue_Insp.click();
		waitABit(1000);
	}

	public void clickOnOppmarkAsLost() {
		OppmarkAsLost.click();
		waitABit(1000);
	}

	public void clickOnOppDDReason() {
		OppDDReason.click();
		waitABit(1000);

		OppValueReason.click();
		waitABit(1000);
	}

	public void clickOndes(Map<String, String> testData) {
		des.sendKeys(testData.get("Description"));
		waitABit(1000);
	}

	public void clickOnsave() {
		save.click();
		waitABit(1000);
	}

	public void clickOnBundle() {
		scrollDownLarge(Bundle);
		Bundle.click();
		waitABit(1000);
	}

	public void clickOnDDBundle() {
		DDBundle.click();
		waitABit(1000);
		
		ValueDDBundle.click();
		waitABit(1000);
	}

	public void clickOnAddBundle() {
		AddBundle.click();
		waitABit(1000);
	}

	public void clickOnradioBttnAddToAgreement() {
		RadioBttnAddToAgreement.click();
		waitABit(1000);
	}

	public void clickOnSave_BundleServices() {
		Save_BundleServices.click();
		waitABit(1000);
	}

	public void clickOnScheduleEstimations() {
		scrollDownLarge(ScheduleEstimations);
		ScheduleEstimations.click();
		waitABit(1000);
	}

	public void clickOnDDAssignedTo() {
		scrollDownLarge(DDAssignedTo);
		DDAssignedTo.click();
		waitABit(1000);
		
		ValueDDAssignedTo.click();
		waitABit(1000);
	}

		public void saveScheduleEstimation() {
		saveScheduleEstimation.click();
		waitABit(1000);
	}

		public void MarkLScheduleEstimation() {
			MarkLScheduleEstimation.click();
			waitABit(1000);
			
		}

		public void DDReason_ScheduleEstimation() {
			DDReason_ScheduleEstimation.click();
			waitABit(1000);
			
			ValueDDReason_ScheduleEstimation.click();
			waitABit(1000);
		}

		public void des_ScheduleEstimation(Map<String, String> testData) {
			des_ScheduleEstimation.sendKeys(testData.get("Description"));
			waitABit(1000);
		}

		public void save_ScheduleEstimation() {
			save_ScheduleEstimation.click();
			waitABit(1000);
		}

		public void RangeTime_InsideScheduleEstimation() {
			RangeTime_InsideScheduleEstimation.click();
			waitABit(1000);
		}

		public void DDTimeRange_InsideScheduleEstimation() {
			DDTimeRange_InsideScheduleEstimation.click();
			waitABit(1000);
			
			ValueDDTimeRange_InsideScheduleEstimation.click();
			waitABit(1000);
		}

		public void fieldRadioBttn_FieldScheduleEstimation() {
			fieldRadioBttn_FieldScheduleEstimation.click();
			waitABit(1000);
			
		}

		public void click_on_InsideRadioBttn_Comm() {
			InsideRadioBttn_Comm.click();
			waitABit(1000);
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
			waitABit(1000);
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
			waitABit(1000);
		}

		public void saveAndcontConfigureProposal_FieldSTSaveComm() {
			waitABit(2000);
			saveAndcontConfigureProposal_FieldSTSaveComm.click();
			waitABit(1000);
			
		}

		public void radioBttncashAgreement_FieldSTSaveComm() {
			waitABit(2000);
			radioBttncashAgreement_FieldSTSaveComm.click();
			waitABit(1000);
		}

		public void valuepaidamountAgreement_FieldSTSaveComm(Map<String, String> testData) {
			waitABit(2000);
			valuepaidamountAgreement_FieldSTSaveComm.sendKeys(testData.get("PaidAmount"));
			waitABit(1000);
		}

		public void radioBttnTANDCAgreement_FieldSTSaveComm() {
			radioBttnTANDCAgreement_FieldSTSaveComm.click();
			waitABit(1000);
		}

		public void salesrepresentativesignAgreement_FieldSTSaveComm() {
			salesrepresentativesignAgreement_FieldSTSaveComm.click();
			waitABit(1000);
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

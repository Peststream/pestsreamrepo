package com.infocrats.pageObjects;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.Log;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class newUserPCROPage extends peststreamPage {
	BaseUtills utills = new BaseUtills();

	@FindBy(xpath = "//*[@id=\"frmGeneralInfo\"]/div/div/div[3]/h4")
	private WebElementFacade call_page_tittle;

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade callTab;

	@FindBy(xpath = "//*[@id=\"crmCompanySaleshead\"]")
	private WebElementFacade companyName;

	@FindBy(xpath = "//a[@id='btngocrmCompanySaleshead']")
	private WebElementFacade salesSearchButton;

	@FindBy(xpath = "//div[@class='col-md-3 divSalesCompany']//a[@class='btn typeHeadSuggestedCreateLink'][contains(text(),'Create')]")
	private WebElementFacade create_new_company;

	@FindBy(xpath = "//div[@class='col-md-3 divSalesContact']//a[@class='btn typeHeadSuggestedCreateLink'][contains(text(),'Create')]")
	WebElementFacade create_new_contact;

	@FindBy(xpath = "//a[@id='btngocrmContactSaleshead']")
	private WebElementFacade contactSearchButton;

	@FindBy(xpath = "//*[@id=\"crmContactSaleshead\"]")
	private WebElementFacade contactName;

	@FindBy(xpath = "//*[@id=\"CrmContactMiddleName\"]")
	private WebElementFacade middleName;

	@FindBy(xpath = "//*[@id=\"CrmContactLastName\"]")
	private WebElementFacade lastName;

	@FindBy(xpath = "//*[@id=\"PrimaryEmail\"]")
	private WebElementFacade primaryEmail;

	@FindBy(xpath = "//*[@id=\"CellNo\"]")
	private WebElementFacade cellNo;

	@FindBy(xpath = "//*[@id=\"SecondaryPhone\"]")
	private WebElementFacade secondaryPhone;

	@FindBy(xpath = "//*[@id=\"s2id_BranchId\"]")
	private WebElementFacade branch_ddl;

	@FindBy(xpath = "//*[@id=\"s2id_DepartmentSysName\"]")
	private WebElementFacade department_ddl;

	@FindBy(xpath = "//*[@id=\"s2id_ServiceCategoryId\"]")
	private WebElementFacade primary_reason_ddl;

	@FindBy(xpath = "//*[@id='s2id_PrimaryServiceId']")
	private WebElementFacade service_ddl;

	@FindBy(xpath = "//*[@id=\"select2-results-9\"]/li[2]/ul/li")
	private WebElementFacade newPortService;

	@FindBy(xpath = "//*[@id=\"frmGeneralInfo\"]/div/div/div[3]/div[5]/div[2]/div/div")
	private WebElementFacade source_ddl;

	@FindBy(xpath = " //*[@id=\"frmGeneralInfo\"]/div/div/div[3]/div[5]/div[2]/div/div/div/ul/li[2]/a")
	private WebElementFacade customerPortalApp;

	@FindBy(xpath = "//*[@id=\"frmGeneralInfo\"]/div/div/div[3]/div[5]/div[2]/div/div/div/ul/li[3]/a")
	private WebElementFacade leadNowApp;

	@FindBy(xpath = "//*[@id=\"frmGeneralInfo\"]/div/div/div[3]/div[5]/div[2]/div/div/div/ul/li[4]/a")
	private WebElementFacade salesAuto;

	@FindBy(xpath = "//*[@id=\"CreateWebLead\"]")
	private WebElementFacade create_lead;

	@FindBy(xpath = "//*[@id=\"AccountDescription\"]")
	private WebElementFacade accountAlert;

	@FindBy(xpath = "//*[@id=\"ProblemDescription\"]")
	private WebElementFacade accountDes;

	@FindBy(xpath = "//*[@id=\"uniform-rdoResidential\"]/span")
	private WebElementFacade Residential_RadioBtn;

	@FindBy(xpath = "//*[@id=\"view_container\"]/div/div/div[2]/div/div/div/form/span/section/div/span/div/div/ul/li[2]/div")
	private WebElementFacade accountName;

	@FindBy(xpath = "//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div/ul/li[2]/div/div/div[2]")
	private WebElementFacade gmailAccount;

	@FindBy(xpath = "//*[@id=\"uniform-rdoCommercial\"]/span")
	private WebElementFacade Commercial_RadioBtn;

	@FindBy(xpath = "//*[@id=\"btnGenerateLead\"]")
	private WebElementFacade continueBtn;

	@FindBy(xpath = "//*[@id=\"accountSaleshead\"]")
	private WebElementFacade exiting_account;

	@FindBy(xpath = "//*[@id=\"accountTags_tagsinput\"]")
	private WebElementFacade addTag;

	@FindBy(xpath = "//*[@id=\"SpRequiredServiceAddressControl_ServiceAddressLine1\"]")
	private WebElementFacade serviceAddressLine1;

	@FindBy(xpath = "//*[@id=\"SpRequiredServiceAddressControl_ServiceAddressLine2\"]")
	private WebElementFacade serviceAddressLine2;

	@FindBy(xpath = "//*[@id=\"SpRequiredServiceAddressControl_ServiceZipCode\"]")
	private WebElementFacade serviceZip;

	@FindBy(xpath = "//*[@id=\"SpRequiredServiceAddressControl_ServiceCityName\"]")
	private WebElementFacade serviceCity;

	@FindBy(xpath = "//*[@id=\"SpRequiredServiceAddressControl_ServiceStateId\"]")
	private WebElementFacade serviceState;

	@FindBy(xpath = "//*[@id=\"SpRequiredServiceAddressControl_IsTaxExempt\"]")
	private WebElementFacade taxExapt;

	@FindBy(xpath = "//*[@id=\"SpRequiredServiceAddressControl_TaxExemptionNo\"]")
	private WebElementFacade enterTaxExapt;

	@FindBy(xpath = "//*[@id=\"uniform-BillingDifferentFromServiceAddress\"]/span")
	private WebElementFacade isBothAddressSame;

	@FindBy(xpath = "//*[@id=\"SpRequiredBillingAddressControl_BillingAddressLine1\"]")
	private WebElementFacade billingAddress1;

	@FindBy(xpath = "//*[@id=\"SpRequiredBillingAddressControl_BillingAddressLine2\"]")
	private WebElementFacade billingAddress2;

	@FindBy(xpath = "//*[@id=\"SpRequiredBillingAddressControl_BillingZipCode\"]")
	private WebElementFacade billingZip;

	@FindBy(xpath = "//*[@id=\"SpRequiredBillingAddressControl_BillingCityName\"]")
	private WebElementFacade billingCity;

	@FindBy(xpath = "//div[@id='s2id_SelectServicePackageVm_PackageId']//b")
	private WebElementFacade package_ddl;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label')])[2]")
	private WebElementFacade newPortPackage;

	@FindBy(xpath = "//div[@id='s2id_SelectServicePackageVm_FrequencyId']//b")
	private WebElementFacade frequency_ddl;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label')])[2]")
	private WebElementFacade quarterly;

	@FindBy(xpath = "//*[@id=\"divpackage\"]/div[5]/div/div/button/span[1]")
	private WebElementFacade billingFrequency_ddl;

	@FindBy(xpath = "//*[@id=\"divpackage\"]/div[5]/div/div/div/ul/li[2]/a/span[1]")
	private WebElementFacade everyOtherWeek;

	@FindBy(xpath = "//button[@id='addService']")
	private WebElementFacade add_btn;

	@FindBy(xpath = "(//span[contains(.,'Save')])[7]")
	private WebElementFacade save_btn;

	@FindBy(xpath = "(//button[@id='btnSaveProposal'])[2]")
	private WebElementFacade saveProposal_btn;

	@FindBy(xpath = "//*[@id=\"txtProposalNotes\"]")
	private WebElementFacade proposalNotes;

	@FindBy(xpath = "(//*[@id='btnSendProposal'])[2]")
	private WebElementFacade sendProposalOnReview;

	@FindBy(xpath = "//*[@id=\"EmailId\"]")
	private WebElementFacade addMoreEmail;

	@FindBy(xpath = "(//button[@id='submit'])[1]")
	private WebElementFacade addMoreEmailBtn;

	@FindBy(xpath = "//*[@id=\"submit2\"]")
	private WebElementFacade sendProposal;

	@FindBy(xpath = "(//input[@type='checkbox'])[6]")
	private WebElementFacade addToagreementCheckBtn;

	@FindBy(xpath = "(//button[@id='btnSaveAgreement'])[2]")
	private WebElementFacade saveAndsignAgreement_btn;

	@FindBy(xpath = "//*[@id=\"LeadPaymentDetailVm_SpecialInstructions\"]")
	private WebElementFacade additionalNote;

	@FindBy(xpath = "(//*[@id='btnSendEmail'])[2]")
	private WebElementFacade sendAgreementforSignature;

	@FindBy(xpath = "//span[contains(text(),'Send Agreement Link')]")
	private WebElementFacade sendAgreementforSignature1;

	@FindBy(xpath = "//*[@id=\"chk_719543\"]")
	private WebElementFacade selectMailCheckBtn;

	@FindBy(xpath = "//*[@id=\"submit2\"]")
	private WebElementFacade clickOnSendAgreementLink;

	@FindBy(xpath = "(//*[@id=\"uniform-SelectServicePackageVm_SelectServiceType\"])[2]")
	private WebElementFacade serviceBundle;

	@FindBy(xpath = "(//span[contains(.,'--Select--')])[13]")
	private WebElementFacade serviceBundeDDL;

	@FindBy(xpath = "//span[contains(text(),'QABundle')]")
	private WebElementFacade serviceBundeDDLValue;

	@FindBy(xpath = "(//span[contains(.,'Monthly')])[4]")
	private WebElementFacade frequencyDDL;

	@FindBy(xpath = "(//span[contains(.,'Bi-Monthly')])[2]")
	private WebElementFacade frequencyValue;

	@FindBy(xpath = "//button[@id='addBundle']")
	private WebElementFacade addBunldeButton;

	@FindBy(xpath = "//*[@id=\"tab3\"]/ul/li[2]")
	private WebElementFacade nonStandardTab;

	@FindBy(xpath = "//*[@id=\"s2id_SelectServicePackageVm_DepartmentSysname\"]")
	private WebElementFacade departmentDDL;

	@FindBy(xpath = "//*[@id=\"select2-results-10\"]/li[2]")
	private WebElementFacade departmentValue;

	@FindBy(xpath = "//*[@id=\"SelectServicePackageVm_NonStandardServiceName\"]")
	private WebElementFacade serviceName;

	@FindBy(xpath = "//*[@id=\"tab_2_2\"]/div[1]/div[3]/div/div")
	private WebElementFacade billingFrequencyDDL;

	@FindBy(xpath = "//*[@id=\"tab_2_2\"]/div[1]/div[3]/div/div/div/ul/li[4]")
	private WebElementFacade billingFrequencyValue;

	@FindBy(xpath = "//*[@id=\"addNonStdService\"]")
	private WebElementFacade addButton;

	@FindBy(xpath = "//*[@id=\"scheduleLead\"]")
	private WebElementFacade scheduleEstimation;

	@FindBy(xpath = "(//button[@id='btnSave'])[2]")
	private WebElementFacade saveOnScheduleEstimation;

	@FindBy(xpath = "//*[@id=\"s2id_FieldSalesPerson\"]")
	private WebElementFacade openAssignedToDDL;

	@FindBy(xpath = "//*[@id=\"select2-results-3\"]/li[2]/ul/li[1]")
	private WebElementFacade assignedTovalue;

	@FindBy(xpath = "(//*[@id=\"uniform-SalesType\"]/span)[2]")
	private WebElementFacade fieldRadioBtn;

	@FindBy(xpath = "//*[@id=\"uniform-RangeTimeType\"]/span")
	private WebElementFacade rangeTimeRadioBtn;

	@FindBy(xpath = "//*[@id=\"InitialPreferedId\"]")
	private WebElementFacade timeRangeDDL;

	@FindBy(xpath = "//*[@id=\"InitialPreferedId\"]/option[2]")
	private WebElementFacade timeRangeValue;

	@FindBy(xpath = "//*[@id=\"SecondRangeofTimeIdOpen\"]")
	private WebElementFacade secondTimeRangeDDL;

	@FindBy(xpath = "//*[@id=\"SecondRangeofTimeIdOpen\"]/option[1]")
	private WebElementFacade secondTimeRangeValue;

	@FindBy(xpath = "(//button[@id='submitlost'])[2]")
	private WebElementFacade mark_As_Lost_btn;

	@FindBy(xpath = "//*[@id=\"s2id_SelCancelReasonMasterId\"]/a/span[2]/b")
	private WebElementFacade reasonDDL;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade reasonFromDDL;

	@FindBy(xpath = "//textarea[@id='txtCancelReasonDescription']")
	private WebElementFacade enterDescription;

	@FindBy(xpath = "(//span[contains(.,'Save')])[10]")
	private WebElementFacade clickOnSaveInLost;

	@FindBy(xpath = "(//button[@id='btnContinuetoSetup'])[2]")
	private WebElementFacade saveContinueToSetup;

	@FindBy(xpath = "//*[@id=\"ddlServices\"]")
	private WebElementFacade serviceDDlInSetups;

	@FindBy(xpath = "//*[@id=\"ddlServices\"]/optgroup[1]/option")
	private WebElementFacade serviceNameFromDDL;

	@FindBy(xpath = "//*[@id=\"manageSetupForm\"]/div/div[4]/div/div/div[1]/div/div[1]/div[3]/div/a")
	private WebElementFacade addServiceBtn;

	@FindBy(xpath = "//*[@id=\"ManageFrequencyId\"]")
	private WebElementFacade frequencyDDLInSetups;

	@FindBy(xpath = "//*[@id=\"ManageFrequencyId\"]/option[10]")
	private WebElementFacade frequencyNameFromDDL;

	@FindBy(xpath = "//*[@id=\"ManageFrequencyScheduleId\"]")
	private WebElementFacade scheduleDDLInSetups;

	@FindBy(xpath = "//*[@id=\"ManageFrequencyScheduleId\"]/option[2]")
	private WebElementFacade scheduleNameFromDDL;

	@FindBy(xpath = "//*[@id=\"btnSubmitSave\"]")
	private WebElementFacade saveAndGenerateBtn;

	@FindBy(xpath = "//*[@id=\"SelectServiceValidation\"]/div/div/div[2]/div[2]/button[2]")
	private WebElementFacade yesBtn;

	@FindBy(xpath = "//*[@id=\"PrimaryTechEmployeeNo\"]")
	private WebElementFacade primaryRouteDDL;

	@FindBy(xpath = "//*[@id=\"PrimaryTechEmployeeNo\"]/optgroup[2]/option")
	private WebElementFacade primaryRouteValue;

	@FindBy(xpath = "//*[@id=\"StartDate\"]")
	private WebElementFacade firstDateDDL;

	@FindBy(xpath = "/html[1]/body[1]/div[12]/div[1]/table[1]/tbody[1]/tr[3]/td[3]")
	private WebElementFacade firstDate;

	@FindBy(xpath = "//*[@id=\"EndDate\"]")
	private WebElementFacade lastDateDDL;

	@FindBy(xpath = "/html[1]/body[1]/div[12]/div[1]/table[1]/tbody[1]/tr[4]/td[3]")
	private WebElementFacade lastDate;

	@FindBy(xpath = "//*[@id=\"btnSaveData\"]")
	private WebElementFacade generateOnlineWorkOrder;

	@FindBy(xpath = "//*[@id=\"sample_1\"]/thead/tr/th[1]/input")
	private WebElementFacade checkAllWorkOrder;

	@FindBy(xpath = "//*[@id=\"btnPublish\"]")
	private WebElementFacade publishOnline;

	@FindBy(xpath = "/html/body/div[12]/div[1]/table/thead/tr[1]/th[3]")
	private WebElementFacade nextbtnOnCal;

	@FindBy(xpath = " /html/body/div[3]/div[1]/div/ul/li[9]/a")
	private WebElementFacade appointmentTab;

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[9]/ul/li[2]/a")
	private WebElementFacade serviceAppointmentTab;

	@FindBy(xpath = "//*[@id=\"sample_1\"]/tbody/tr[1]/td[17]/a")
	private WebElementFacade actionBtn;

	@FindBy(xpath = "//*[@id=\"btnTimeIn\"]")
	private WebElementFacade enterCurrentTime;

	@FindBy(xpath = "//*[@id=\"submit41\"]")
	private WebElementFacade saveAndContinue;

	@FindBy(xpath = "(//*[@id=\"PaymentInfoVm_PaymentMode\"])[1]")
	private WebElementFacade paymentMode;

	@FindBy(xpath = "//*[@id=\"PaymentInfoVm_PaidAmount\"]")
	private WebElementFacade enterAmount;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[6]/div[1]/div[1]/button[2]/span[1]")
	private WebElementFacade saveAndContinueOnServiceDetails;

	@FindBy(xpath = "//*[@id=\"ctlSignatureT\"]")
	private WebElementFacade technicianSignature;

	@FindBy(xpath = "//*[@id=\"ctlSignature\"]")
	private WebElementFacade customerSignature;

	@FindBy(xpath = "//*[@id=\"submit\"]")
	private WebElementFacade invoiceSubmitBtn;

	@FindBy(xpath = "(//*[@id=\"submit2\"])[2]")
	private WebElementFacade sendEmailOnServiceAppointment;

	@FindBy(xpath = "//*[@id=\"10121_Monthly\"]")
	private WebElementFacade bundleCheckBtn;

	@FindBy(xpath = "(//*[@id=\"btnSave\"]/span)[2]")
	private WebElementFacade saveMoreDetail;

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[4]/a/span[1]")
	private WebElementFacade Customer;

	@FindBy(xpath = "//li[contains(@class,'open')]//li[4]//a[1]")
	private WebElementFacade opportunityy;

	@FindBy(xpath = "//input[@id='btnAdvanceSearch']")
	private WebElementFacade AdvanceSearch;

	@FindBy(xpath = "//a[contains(text(),'Open')]")
	private WebElementFacade openTab;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
	private WebElementFacade requiredOpportunity;

	@FindBy(xpath = "//h4[contains(text(),'More Details')]")
	private WebElementFacade moreDetail;

	@FindBy(xpath = "//span[@id='select2-chosen-1']")
	private WebElementFacade urgency1;

	@FindBy(xpath = "/html[1]/body[1]/div[13]/ul[1]/li[2]/div[1]")
	private WebElementFacade highUrgency;

	@FindBy(xpath = "//input[@id='Lead_ServiceDateStr']")
	private WebElementFacade scheduleDate;

	@FindBy(xpath = "//div[@class='datepicker-days']//th[@class='next']")
	private WebElementFacade nextMonth;

	@FindBy(xpath = "/html[1]/body[1]/div[14]/div[1]/table[1]/tbody[1]/tr[3]/td[4]")
	private WebElementFacade date;

	@FindBy(xpath = "//button[@class='btn blue btnScheduleLead']")
	private WebElementFacade ScheduleOpportunityBtn;

	@FindBy(xpath = "//span[contains(text(),'Continue Sales Process')]")
	private WebElementFacade contSaleProcess;

	@FindBy(xpath = "//div[@class='row']//div[2]//div[2]//span[1]//button[4]//span[1]")
	private WebElementFacade saveSignOpportunity;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[3]/div[1]/button[2]/span[1]")
	private WebElementFacade SaveCont;

	@FindBy(xpath = "//textarea[@id='Note']")
	private WebElementFacade NotesMore;

	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade SaveMoreNotes;

	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[4]")
	private WebElementFacade chckBoxServiceBundle;

	@FindBy(xpath = "//div[@class='signinbutton']")
	private WebElementFacade OutLook_LogIn_Bttn;

	@FindBy(xpath = "(//a[@class='btn btn-icon-only small-btn-icon red'])[1]")
	private WebElementFacade ViewAction_CompanyCustomer;

	@FindBy(xpath = "//textarea[@id='Note']")
	private WebElementFacade EnterNote_CompanyCustomer;

	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade save_CompanyCustomer;

	@FindBy(xpath = "/html//table[@id='tblBundle']//input[@name='IsSold_10121_Monthly']")
	private WebElementFacade addToAgreement_ServiceBundleSelectPackagesOpportunity;

	@FindBy(xpath = "(//span[contains(.,'Save and Sign Agreement')])[2]")
	private WebElementFacade validateThePage;

	@Override
	public WebElementFacade getUniqueElement() {
		return call_page_tittle;
	}

	public void clickedOnCallTab() {

		try {

			callTab.click();

		} catch (Exception e) {
			Log.error("Unable to click Assessment Tab " + e.getMessage());
		}
	}

	public Object getOpportunityPageTittle() {

		return call_page_tittle.getText().trim();
	}

	public void enterLeadDetails(Map<String, String> testData) {
		companyName.sendKeys(testData.get("CompanyName"));
		salesSearchButton.click();
		waitABit(1500);
		scrollToClickAnelement(create_new_company);

		contactName.sendKeys(testData.get("ContactName"));
		contactSearchButton.click();
		waitABit(1500);
		scrollToClickAnelement(create_new_contact);

		middleName.sendKeys(testData.get("MiddleName"));
		waitABit(300);
		lastName.sendKeys(testData.get("LastName"));
		waitABit(300);
		primaryEmail.sendKeys(testData.get("PrimaryEmail"));
		waitABit(300);
		cellNo.sendKeys(testData.get("CellNumber"));
		waitABit(300);
		secondaryPhone.sendKeys(testData.get("SecondaryNumber"));
	}

	public void selectBranchDetils() {

		service_ddl.click();
		waitABit(2000);
		newPortService.click();

		source_ddl.click();
		customerPortalApp.click();
		// leadNowApp.click();
		// salesAuto.click();

	}

	public void leadCheckBtn() {

		create_lead.click();

	}

	public void AccountDescription(Map<String, String> testData) {
		waitABit(300);
		accountAlert.sendKeys(testData.get("AccountAlert"));
		waitABit(300);
		accountDes.sendKeys(testData.get("ProblemDescription"));

	}

	public void residentialCheckBtn() {

		Residential_RadioBtn.click();

		/*
		 * ((JavascriptExecutor)getDriver()).executeScript("window.open()");
		 * ArrayList<String> tabs = new
		 * ArrayList<String>(getDriver().getWindowHandles());
		 * getDriver().switchTo().window(tabs.get(1));
		 * getDriver().get("http://google.com"); waitABit(2000); googleText.sendKeys(
		 * "https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin"
		 * ); googleText.sendKeys(Keys.ENTER);
		 */

		waitABit(2000);

	}

	public void clickedOnContinue() {

		try {
			continueBtn.click();
		} catch (Exception e) {
			Log.error("unable to click on Continue Button " + e.getMessage());
		}
		waitABit(3000);

	}

	public void service_Address(Map<String, String> testData) {
		waitABit(300);
		serviceAddressLine1.sendKeys(testData.get("Address"));
		waitABit(300);
		serviceAddressLine2.sendKeys(testData.get("Address"));
		waitABit(300);
		serviceZip.sendKeys(testData.get("ServiceZip"));
		waitABit(300);
		serviceCity.sendKeys(testData.get("ServiceCity"));

	}

	public void checkExaptBtn() {

		taxExapt.click();

	}

	public void enterTaxExamp(Map<String, String> testData) {
		waitABit(3000);
		enterTaxExapt.sendKeys(testData.get("TaxExemption"));

	}

	public void isBothAddressSame() {
		isBothAddressSame.click();

	}

	public void enterBilling_Address(Map<String, String> testData) {
		waitABit(300);
		billingAddress1.sendKeys(testData.get("Address"));
		waitABit(300);
		billingAddress2.sendKeys(testData.get("Address"));
		waitABit(300);
		billingZip.sendKeys(testData.get("ServiceZip"));
		waitABit(300);
		billingCity.sendKeys(testData.get("ServiceCity"));
		waitABit(4000);

	}

	public void selectPackageAs() {

	}

	public void enterPackageDetails() {

		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", add_btn);

		add_btn.click();
		package_ddl.click();
		newPortPackage.click();
		waitABit(1000);

		// add_btn.click();
		frequency_ddl.click();
		quarterly.click();
		waitABit(1000);

		// billingFrequency_ddl.click();
		// everyOtherWeek.click();
		// waitABit(1000);

	}

	public void clickOnAddBtn() {
		waitABit(300);
		add_btn.click();

	}

	// mark as lost opportunity
	public void markAsLost_btn() {
		mark_As_Lost_btn.click();
		waitABit(300);

	}

	public void get_Reason() {
		reasonDDL.click();
		waitABit(3000);
		reasonFromDDL.click();
	}

	public void reason_Description(Map<String, String> testData) {
		waitABit(300);
		enterDescription.sendKeys(testData.get("ProblemDescription"));

	}

	public void saveInMarkAsLostBtn() {

		clickOnSaveInLost.click();
		waitABit(5000);
	}

	// opportunity saved

	public void clickOnSaveBtn() {
		scrollDownLarge(save_btn);
		save_btn.click();
		waitABit(5000);

		// opportunity save and proposal

	}

	public void saveAndProposal_Btn() throws InterruptedException {
		saveProposal_btn.click();
		Thread.sleep(2000);
	}

	public void enterProposalNotes(Map<String, String> testData) {
		waitABit(2000);
		proposalNotes.sendKeys(testData.get("ProposalNotes"));
	}

	public void sendProposalOnReview() {

		try {
			sendProposalOnReview.click();
		} catch (Exception e) {
			System.out.println("exception occoured");
		}

		waitABit(3000);
	}

	public void addMoreEmail(Map<String, String> testData) {
		addMoreEmail.sendKeys(testData.get("AddEmail"));

	}

	public void addMoreEmail_Btn() {
		try {
			addMoreEmail.submit();
		} catch (Exception e) {
			addMoreEmail.click();
		}

	}

	public void sendProposal_Btn() {
		try {
			sendProposal.click();
		} catch (Exception e) {
			sendProposal.submit();
		}
		waitABit(5000);

	}

	// opportunity save and sign agreement

	public void addToAgreementBtn() {

		waitABit(3000);
		scrollDown(addToagreementCheckBtn);
		addToagreementCheckBtn.click();

	}

	public void saveAndSignAgreement_btn() {
		saveAndsignAgreement_btn.click();
		waitABit(300);
	}

	public void enterAdditionalNote(Map<String, String> testData) {
		additionalNote.sendKeys(testData.get("AdditionalNote"));
		waitABit(2000);

	}

	public void sendAgreementForSignature_btn() {
		try {
			waitABit(5000);
			sendAgreementforSignature.click();
			waitABit(5000);
			sendAgreementforSignature1.click();
		} catch (Exception e) {
			sendAgreementforSignature.submit();
			waitABit(5000);
			sendAgreementforSignature1.submit();
		}

	}

	public void mailAddressCheckBtn() {
		// selectMailCheckBtn.click();

	}

	public void clickOnSendAgreementBtn() {

		try {
			waitABit(3000);

			clickOnSendAgreementLink.click();
		} catch (Exception e) {
			waitABit(300);
			clickOnSendAgreementLink.submit();
		}
	}

	public void account_Id() {

		exiting_account.sendKeys("Info");
		waitABit(3000);

		for (int i = 1; i <= 3; i++) {
			exiting_account.sendKeys(Keys.DOWN);
		}
		waitABit(2000);
		exiting_account.sendKeys(Keys.ENTER);

	}

	@FindBy(xpath = "//*[@id=\"Notes\"]")
	private WebElementFacade enterElement;

	public void serviceBundleRadioBtn(Map<String, String> testData) {

		enterElement.sendKeys(testData.get("AddNote"));
		waitABit(300);

		serviceBundle.click();
		waitABit(2000);

	}

	public void service_bundle() {
		serviceBundeDDL.click();
		waitABit(300);
		serviceBundeDDLValue.click();

	}

	public void billingFrequencyDDL() {
		waitABit(300);
		frequencyDDL.click();
	}

	public void chooseFromFrequencyDDL() {
		frequencyValue.click();

	}

	public void addBundleBtn() {
		waitABit(300);
		addBunldeButton.click();
		waitABit(300);
		scrollDown(addToAgreement_ServiceBundleSelectPackagesOpportunity);

	}

	public void bundleCheck_btn() {
		waitABit(300);
		bundleCheckBtn.click();

	}

	// for non standard service
	public void nonStandard_tab() {
		waitABit(300);
		nonStandardTab.click();
	}

	public void department_DDL() {
		waitABit(300);
		departmentDDL.click();

	}

	public void department_value() {
		waitABit(300);
		departmentValue.click();

	}

	public void serviceName(Map<String, String> testData) {
		waitABit(300);
		serviceName.sendKeys(testData.get("ServiceName"));

	}

	public void nonStandardBillingFreq_DDL() {
		waitABit(300);
		billingFrequencyDDL.click();
	}

	public void chooseBillingFrequency_Value() {
		waitABit(300);
		billingFrequencyValue.click();

	}

	public void nonStandardAdd_Btn() {
		waitABit(300);
		addButton.click();
		waitABit(2000);
	}

	public void scheduleEstimationTab() {
		waitABit(300);
		scheduleEstimation.click();

	}

	public void saveInSchedule_Estimation() {
		waitABit(300);
		saveOnScheduleEstimation.click();
		waitABit(5000);
	}

	public void getAssignedTo_value() {
		waitABit(300);
		openAssignedToDDL.click();

		waitABit(3000);
		assignedTovalue.click();

	}

	public void fieldRadio_btn() {
		waitABit(300);
		fieldRadioBtn.click();

	}

	public void rangeTimeRadio_btn() {
		waitABit(300);
		rangeTimeRadioBtn.click();
		waitABit(1000);

	}

	public void getTimeRange_Value() {
		waitABit(300);
		timeRangeDDL.click();
		waitABit(3000);
		timeRangeValue.click();

	}

	public void getSecondTimeRangeValue() {
		waitABit(300);
		secondTimeRangeDDL.click();
		waitABit(3000);
		secondTimeRangeValue.click();

	}

	public void saveContinueSetup_btn() {
		saveContinueToSetup.click();
		waitABit(3000);

	}

	public void chooseServiceFrom_DDL() {
		waitABit(300);
		serviceDDlInSetups.click();
		waitABit(2000);
		serviceNameFromDDL.click();

	}

	public void addService_btn() {
		waitABit(300);
		addServiceBtn.click();

	}

	public void chooseFrequencyFrom_DDL() {
		waitABit(300);
		frequencyDDLInSetups.click();
		waitABit(3000);
		frequencyNameFromDDL.click();
		waitABit(300);
		yesBtn.click();

	}

	public void chooseScheduleFrom_DDL() {
		waitABit(300);
		scheduleDDLInSetups.click();
		waitABit(3000);
		scheduleNameFromDDL.click();

	}

	public void saveGenerate_btn() {
		waitABit(300);
		saveAndGenerateBtn.click();
		waitABit(3000);

	}

	public void choosePrimary_Route() {
		waitABit(300);
		primaryRouteDDL.click();
		waitABit(300);
		primaryRouteValue.click();

	}

	public void startAndEnd_Date() {
		waitABit(300);
		firstDateDDL.click();
		waitABit(300);
		nextMonth.click();
		waitABit(300);
		firstDate.click();

		waitABit(3000);

		lastDateDDL.click();
		waitABit(300);
		nextbtnOnCal.click();
		waitABit(300);
		nextbtnOnCal.click();
		waitABit(300);
		lastDate.click();

	}

	public void generateOnline_WO() {
		scrollToClickAnelement(generateOnlineWorkOrder);
		waitABit(5000);

	}

	public void checkAll_WO() {
		waitABit(3000);
		checkAllWorkOrder.click();

	}

	public void publishOnlineBtn() {
		scrollToClickAnelement(publishOnline);
		waitABit(5000);

	}

	public void getServiceAppointment() {
		waitABit(300);
		scrollToClickAnelement(appointmentTab);
		waitABit(300);
		System.out.println("service appointment btn clicked..................................");
		waitABit(1000);

		scrollToClickAnelement(serviceAppointmentTab);
		System.out.println("service appointment btn clicked..................................");

	}

	public void action_btn() {
		actionBtn.click();
		waitABit(3000);
	}

	public void current_time() {
		waitABit(300);
		enterCurrentTime.click();
		waitABit(3000);
	}

	public void saveAndContinue_btn() {
		waitABit(300);
		scrollUP(saveAndContinue);
		waitABit(300);
		saveAndContinue.click();
		waitABit(3000);

		scrollUP(SaveCont);
		SaveCont.click();
		waitABit(3000);
	}

	public void payment_mode() {

		// WebElement radioBtn1 = driver.findElement(By.id("radioButton1"));

		((JavascriptExecutor) getDriver()).executeScript("arguments[0].checked = true;", paymentMode);

	}

	public void enter_amount() {
		for (int i = 0; i < 4; i++) {
			enterAmount.sendKeys(Keys.BACK_SPACE);
		}
		enterAmount.sendKeys("111");

	}

	public void svContOnService_Details() {
		saveAndContinueOnServiceDetails.click();
		waitABit(3000);
	}

	public void take_Signature() {
		waitABit(3000);
		Actions builder = new Actions(getDriver());
		waitABit(1500);
		Action drawAction = builder.moveToElement(technicianSignature, 135, 15).click().moveByOffset(200, 60).click()
				.moveByOffset(100, 70).doubleClick().build();
		drawAction.perform();
		waitABit(1500);
		Action drawAction2 = builder.moveToElement(customerSignature, 135, 15).click().moveByOffset(200, 60).click()
				.moveByOffset(100, 70).doubleClick().build();
		drawAction2.perform();
	}

	public void invoiceSubmit_btn() {
		waitABit(300);
		invoiceSubmitBtn.click();
		waitABit(300);
		sendEmailOnServiceAppointment.click();
		waitABit(5000);
	}

	public void savebtn() {
		waitABit(300);
		saveMoreDetail.click();
		waitABit(5000);

	}

	public void customerOpp() {
		// scrollUP(Customer);
		waitABit(300);
		Customer.click();
		waitABit(2000);
		opportunityy.click();
		waitABit(2000);

	}

	public void advSearch() {
		AdvanceSearch.click();

		waitABit(2000);

	}

	public void openRequired() {
		waitABit(300);
		scrollUP(openTab);
		waitABit(300);
		openTab.click();
		waitABit(2000);

		requiredOpportunity.click();
		waitABit(2000);

	}

	public void moreDetails() {
		waitABit(300);
		moreDetail.click();
		waitABit(2000);

	}

	public void urgencyScheduleDateOpportunity() {
		urgency1.click();
		waitABit(300);
		highUrgency.click();
		waitABit(300);
		scheduleDate.click();
		waitABit(300);
		nextMonth.click();
		waitABit(300);
		date.click();
		waitABit(300);
		ScheduleOpportunityBtn.click();
		waitABit(300);

	}

	public void ContSalesProcess() {
		waitABit(300);
		scrollUP(contSaleProcess);
		waitABit(300);
		contSaleProcess.click();
		for (String agreement : getDriver().getWindowHandles()) // iterating on child windows
		{
			getDriver().switchTo().window(agreement);
		}
		waitABit(10000);
	}

	public void saveSignA() {
		waitABit(300);
		saveSignOpportunity.click();
		waitABit(5000);
	}

	public void enterNotesSave(Map<String, String> testData) {
		waitABit(300);
		NotesMore.sendKeys(testData.get("EnterNotes"));
		waitABit(300);
		SaveMoreNotes.click();
		waitABit(3000);

	}

	public void ChckBoxServiceBundle() {
		waitABit(300);
		chckBoxServiceBundle.click();
		waitABit(2000);

	}

	public void OutLook_LogIn_Bttn() {
		waitABit(300);
		OutLook_LogIn_Bttn.click();
		waitABit(2000);

	}

	public void ViewAction_CompanyCustomer() {
		waitABit(300);
		ViewAction_CompanyCustomer.click();
		waitABit(2000);
	}

	public void EnterNote_CompanyCustomer(Map<String, String> testData) {
		waitABit(300);
		EnterNote_CompanyCustomer.sendKeys(testData.get("EnterNotes"));
		waitABit(2000);
	}

	public void save_CompanyCustomer() {
		waitABit(300);
		save_CompanyCustomer.click();
		waitABit(2000);
	}

	public void addToAgreement_ServiceBundleSelectPackagesOpportunity() {
		waitABit(300);
		addToAgreement_ServiceBundleSelectPackagesOpportunity.click();
		waitABit(2000);
	}

	public void validateThePage() {
		waitABit(300);
		Assert.assertTrue("Save and Sign Agreement".equals(validateThePage.getText()));
	}

}
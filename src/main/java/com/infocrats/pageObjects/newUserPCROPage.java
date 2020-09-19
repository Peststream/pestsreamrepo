package com.infocrats.pageObjects;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.JsonHelper;
import com.infocrats.utils.Log;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class newUserPCROPage extends peststreamPage {
	BaseUtills utills = new BaseUtills();
	private Map<String, Integer> jsonData;

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

			callTab.click();
	}

	public Object getOpportunityPageTittle() {

		return call_page_tittle.getText().trim();
	}

	public void enterLeadDetails(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(companyName));

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

	public void selectBranchDetils() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(service_ddl));

		service_ddl.click();
		waitABit(2000);
		newPortService.click();

		source_ddl.click();
		customerPortalApp.click();
		// leadNowApp.click();
		// salesAuto.click();

	}

	public void leadCheckBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(create_lead));

		create_lead.click();

	}

	public void AccountDescription(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(accountAlert));

		accountAlert.sendKeys(testData.get("AccountAlert"));
		waitABit(300);
		accountDes.sendKeys(testData.get("ProblemDescription"));

	}

	public void residentialCheckBtn() {
		waitABit(2000);
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

	}

	public void clickedOnContinue() {

		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
			wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
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

	public void checkExaptBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(taxExapt));

		taxExapt.click();

	}

	public void enterTaxExamp(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(enterTaxExapt));
		enterTaxExapt.sendKeys(testData.get("TaxExemption"));

	}

	public void isBothAddressSame() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(isBothAddressSame));

		isBothAddressSame.click();

	}

	public void enterBilling_Address(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(billingAddress1));

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
		waitABit(1000);
		package_ddl.click();
		waitABit(1000);
		newPortPackage.click();
		waitABit(1000);

		// add_btn.click();
		frequency_ddl.click();
		waitABit(1000);
		quarterly.click();
		waitABit(1000);

		// billingFrequency_ddl.click();
		// everyOtherWeek.click();
		// waitABit(1000);

	}

	public void clickOnAddBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(add_btn));
		add_btn.click();

	}

	// mark as lost opportunity
	public void markAsLost_btn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(mark_As_Lost_btn));

		mark_As_Lost_btn.click();

	}

	public void get_Reason() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(reasonDDL));

		reasonDDL.click();
		wait.until(ExpectedConditions.elementToBeClickable(reasonFromDDL));
		reasonFromDDL.click();
	}

	public void reason_Description(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(enterDescription));

		enterDescription.sendKeys(testData.get("ProblemDescription"));

	}

	public void saveInMarkAsLostBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(clickOnSaveInLost));

		clickOnSaveInLost.click();
	}

	// opportunity saved

	public void clickOnSaveBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(save_btn));

		scrollDownLarge(save_btn);
		waitABit(500);
		save_btn.click();

		// opportunity save and proposal

	}

	public void saveAndProposal_Btn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time2"));
		wait.until(ExpectedConditions.elementToBeClickable(saveProposal_btn));

		saveProposal_btn.click();
		Thread.sleep(2000);
	}

	public void enterProposalNotes(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time2"));
		wait.until(ExpectedConditions.elementToBeClickable(proposalNotes));

		proposalNotes.sendKeys(testData.get("ProposalNotes"));
	}

	public void sendProposalOnReview() {

		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time2"));

			wait.until(ExpectedConditions.elementToBeClickable(sendProposalOnReview));
			sendProposalOnReview.click();
		} catch (Exception e) {
			System.out.println("exception occoured");
		}
	}

	public void addMoreEmail(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time2"));
		wait.until(ExpectedConditions.elementToBeClickable(addMoreEmail));

		addMoreEmail.sendKeys(testData.get("AddEmail"));

	}

	public void addMoreEmail_Btn() {
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time2"));
			wait.until(ExpectedConditions.elementToBeClickable(addMoreEmail));

			addMoreEmail.submit();
		} catch (Exception e) {
			addMoreEmail.click();
		}

	}

	public void sendProposal_Btn() {
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time2"));
			wait.until(ExpectedConditions.elementToBeClickable(sendProposal));

			sendProposal.click();
		} catch (Exception e) {
			sendProposal.submit();
		}

	}

	// opportunity save and sign agreement

	public void addToAgreementBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time2"));
		wait.until(ExpectedConditions.elementToBeClickable(addToagreementCheckBtn));

		scrollDown(addToagreementCheckBtn);
		waitABit(300);
		addToagreementCheckBtn.click();

	}

	public void saveAndSignAgreement_btn() {
		saveAndsignAgreement_btn.click();
		waitABit(300);
	}

	public void enterAdditionalNote(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(additionalNote));

		additionalNote.sendKeys(testData.get("AdditionalNote"));

	}

	public void sendAgreementForSignature_btn() {
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time2"));
			wait.until(ExpectedConditions.elementToBeClickable(sendAgreementforSignature));

			sendAgreementforSignature.click();
			wait.until(ExpectedConditions.elementToBeClickable(sendAgreementforSignature1));
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
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time2"));
			wait.until(ExpectedConditions.elementToBeClickable(clickOnSendAgreementLink));

			clickOnSendAgreementLink.click();
		} catch (Exception e) {
			waitABit(300);
			clickOnSendAgreementLink.submit();
		}
	}

	public void account_Id() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(exiting_account));

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

	public void serviceBundleRadioBtn(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(enterElement));

		enterElement.sendKeys(testData.get("AddNote"));
		wait.until(ExpectedConditions.elementToBeClickable(serviceBundle));

		serviceBundle.click();

	}

	public void service_bundle() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(serviceBundeDDL));

		serviceBundeDDL.click();
		waitABit(300);
		serviceBundeDDLValue.click();

	}

	public void billingFrequencyDDL() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(frequencyDDL));

		frequencyDDL.click();
	}

	public void chooseFromFrequencyDDL() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(frequencyValue));

		frequencyValue.click();

	}

	public void addBundleBtn() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(addBunldeButton));

		addBunldeButton.click();
		waitABit(300);
		scrollDown(addToAgreement_ServiceBundleSelectPackagesOpportunity);

	}

	public void bundleCheck_btn() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(bundleCheckBtn));

		bundleCheckBtn.click();

	}

	// for non standard service
	public void nonStandard_tab() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(nonStandardTab));

		nonStandardTab.click();
	}

	public void department_DDL() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(departmentDDL));

		departmentDDL.click();

	}

	public void department_value() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(departmentValue));

		departmentValue.click();

	}

	public void serviceName(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(serviceName));

		serviceName.sendKeys(testData.get("ServiceName"));

	}

	public void nonStandardBillingFreq_DDL() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(billingFrequencyDDL));

		billingFrequencyDDL.click();
	}

	public void chooseBillingFrequency_Value() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(billingFrequencyValue));

		billingFrequencyValue.click();

	}

	public void nonStandardAdd_Btn() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(addButton));

		addButton.click();
	}

	public void scheduleEstimationTab() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(scheduleEstimation));

		scheduleEstimation.click();

	}

	public void saveInSchedule_Estimation() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(saveOnScheduleEstimation));

		saveOnScheduleEstimation.click();
		waitABit(5000);
	}

	public void getAssignedTo_value() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(openAssignedToDDL));

		openAssignedToDDL.click();
		wait.until(ExpectedConditions.elementToBeClickable(assignedTovalue));

		assignedTovalue.click();

	}

	public void fieldRadio_btn() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(fieldRadioBtn));

		fieldRadioBtn.click();

	}

	public void rangeTimeRadio_btn() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(rangeTimeRadioBtn));

		rangeTimeRadioBtn.click();

	}

	public void getTimeRange_Value() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(timeRangeDDL));

		wait.until(ExpectedConditions.elementToBeClickable(timeRangeValue));
		timeRangeValue.click();

	}

	public void getSecondTimeRangeValue() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(secondTimeRangeDDL));

		secondTimeRangeDDL.click();
		wait.until(ExpectedConditions.elementToBeClickable(secondTimeRangeValue));
		secondTimeRangeValue.click();

	}

	public void saveContinueSetup_btn() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(saveContinueToSetup));

		saveContinueToSetup.click();

	}

	public void chooseServiceFrom_DDL() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(serviceDDlInSetups));

		serviceDDlInSetups.click();
		wait.until(ExpectedConditions.elementToBeClickable(serviceNameFromDDL));
		serviceNameFromDDL.click();

	}

	public void addService_btn() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(addServiceBtn));

		addServiceBtn.click();

	}

	public void chooseFrequencyFrom_DDL() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(frequencyDDLInSetups));

		frequencyDDLInSetups.click();
		wait.until(ExpectedConditions.elementToBeClickable(frequencyNameFromDDL));
		frequencyNameFromDDL.click();
		waitABit(2000);
		yesBtn.click();

	}

	public void chooseScheduleFrom_DDL() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(scheduleDDLInSetups));

		scheduleDDLInSetups.click();
		wait.until(ExpectedConditions.elementToBeClickable(scheduleNameFromDDL));
		scheduleNameFromDDL.click();

	}

	public void saveGenerate_btn() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(saveAndGenerateBtn));

		saveAndGenerateBtn.click();

	}

	public void choosePrimary_Route() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(primaryRouteDDL));

		primaryRouteDDL.click();
		wait.until(ExpectedConditions.elementToBeClickable(primaryRouteValue));
		primaryRouteValue.click();

	}

	public void startAndEnd_Date() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(firstDateDDL));
		firstDateDDL.click();
		waitABit(300);
		nextMonth.click();
		waitABit(300);
		firstDate.click();
		wait.until(ExpectedConditions.elementToBeClickable(lastDateDDL));

		lastDateDDL.click();
		waitABit(300);
		nextbtnOnCal.click();
		waitABit(300);
		nextbtnOnCal.click();
		waitABit(300);
		lastDate.click();

	}

	public void generateOnline_WO() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(generateOnlineWorkOrder));

		scrollToClickAnelement(generateOnlineWorkOrder);

	}

	public void checkAll_WO() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time2"));
		wait.until(ExpectedConditions.elementToBeClickable(checkAllWorkOrder));

		checkAllWorkOrder.click();

	}

	public void publishOnlineBtn() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(publishOnline));

		scrollToClickAnelement(publishOnline);

	}

	public void getServiceAppointment() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(appointmentTab));

		scrollToClickAnelement(appointmentTab);
		waitABit(300);
		System.out.println("service appointment btn clicked..................................");
		waitABit(1000);

		scrollToClickAnelement(serviceAppointmentTab);
		System.out.println("service appointment btn clicked..................................");

	}

	public void action_btn() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(actionBtn));

		actionBtn.click();
	}

	public void current_time() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(enterCurrentTime));

		enterCurrentTime.click();
		waitABit(3000);
	}

	public void saveAndContinue_btn() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(saveAndContinue));

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
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(saveAndContinueOnServiceDetails));

		saveAndContinueOnServiceDetails.click();
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
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(invoiceSubmitBtn));

		invoiceSubmitBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(sendEmailOnServiceAppointment));

		sendEmailOnServiceAppointment.click();
	}

	public void savebtn() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(saveMoreDetail));

		saveMoreDetail.click();
		waitABit(5000);

	}

	public void customerOpp() {
		// scrollUP(Customer);
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Customer));

		Customer.click();
		wait.until(ExpectedConditions.elementToBeClickable(opportunityy));

		opportunityy.click();

	}

	public void advSearch() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(AdvanceSearch));

		AdvanceSearch.click();

	}

	public void openRequired() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(openTab));

		scrollUP(openTab);
		waitABit(300);
		openTab.click();
		wait.until(ExpectedConditions.elementToBeClickable(requiredOpportunity));

		requiredOpportunity.click();

	}

	public void moreDetails() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(moreDetail));
		moreDetail.click();

	}

	public void urgencyScheduleDateOpportunity() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(urgency1));

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
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(contSaleProcess));

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
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(saveSignOpportunity));

		saveSignOpportunity.click();
	}

	public void enterNotesSave(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(NotesMore));

		NotesMore.sendKeys(testData.get("EnterNotes"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveMoreNotes));
		SaveMoreNotes.click();

	}

	public void ChckBoxServiceBundle() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(chckBoxServiceBundle));

		chckBoxServiceBundle.click();
		waitABit(2000);

	}

	public void OutLook_LogIn_Bttn() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(OutLook_LogIn_Bttn));

		OutLook_LogIn_Bttn.click();

	}

	public void ViewAction_CompanyCustomer() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(ViewAction_CompanyCustomer));

		ViewAction_CompanyCustomer.click();
	}

	public void EnterNote_CompanyCustomer(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(EnterNote_CompanyCustomer));

		EnterNote_CompanyCustomer.sendKeys(testData.get("EnterNotes"));
	}

	public void save_CompanyCustomer() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(save_CompanyCustomer));

		save_CompanyCustomer.click();
	}

	public void addToAgreement_ServiceBundleSelectPackagesOpportunity() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(addToAgreement_ServiceBundleSelectPackagesOpportunity));

		addToAgreement_ServiceBundleSelectPackagesOpportunity.click();
	}

	public void validateThePage() {

		waitABit(2000);
		Assert.assertTrue("Save and Sign Agreement".equals(validateThePage.getText()));
	}

}
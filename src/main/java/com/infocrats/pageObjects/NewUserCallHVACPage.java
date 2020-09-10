package com.infocrats.pageObjects;

import java.util.Map;

import org.codehaus.groovy.ast.stmt.ContinueStatement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.AcceptAlert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.JsonHelper;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class NewUserCallHVACPage extends peststreamPage {
	private static final Boolean True = null;

	BaseUtills utills = new BaseUtills();
	private Map<String, Integer> jsonData;

	@FindBy(xpath = "//*[@id=\"select2-chosen-5\"]")
	private WebElementFacade DDBranch;

	@FindBy(xpath = "//*[@id=\"select2-result-label-11\"]")
	private WebElementFacade valueDDBranch;

	@FindBy(xpath = "//*[@id=\"frmGeneralInfo\"]/div/div/div[3]/div[5]/div[2]/div/div/button/span[1]")
	private WebElementFacade DDSource;

	@FindBy(xpath = "//*[@id=\"frmGeneralInfo\"]/div/div/div[3]/div[5]/div[2]/div/div/div/ul/li[5]/a/span[1]")
	private WebElementFacade valueDDSource;

	@FindBy(xpath = "//*[@id='AccountDescription']")
	private WebElementFacade AccountAlert;

	@FindBy(css = "select#PrimaryServiceId")
	private WebElementFacade DDPrimaryRequestedService;

	@FindBy(css = "select#PrimaryServiceId  option[value='15036']")
	private WebElementFacade valueDDPrimaryRequestedService;

	@FindBy(xpath = "//*[@id='JobDesc']")
	private WebElementFacade JobDescTF;

	@FindBy(xpath = "//*[@id='ServiceLocationId']")
	private WebElementFacade PlusButtonSA;

	@FindBy(xpath = "//*[@id='SpRequiredServiceAddressControl_ServiceAddressLine1']")
	private WebElementFacade AddressLine1;

	@FindBy(xpath = "//*[@id='SpRequiredServiceAddressControl_ServiceZipCode']")
	private WebElementFacade ZipCode;

	@FindBy(xpath = "//*[@id='SpRequiredServiceAddressControl_ServiceCityName']")
	private WebElementFacade City;

	@FindBy(xpath = "//*[@id='uniform-rdoFR']/span")
	private WebElementFacade Flatrate;

	@FindBy(xpath = "//*[@id='btnSave']/span")
	private WebElementFacade SaveButton;

	@FindBy(xpath = "//*[@id='dynamicModal']/div/div/div[3]/span")
	private WebElementFacade OkButton;

	@FindBy(xpath = "//*[@id='btnAdvanceSearch']")
	private WebElementFacade AdvanceSearchBtn;

	@FindBy(xpath = "//table[@id='sample_1']/tbody/tr[1]/td[3]/a[@title='Edit Work Order']")
	private WebElementFacade FirstWorkOrderlbl;

	@FindBy(xpath = "//*[@id='select2-chosen-1']")
	private WebElementFacade LeadEmployeeDD;

	@FindBy(xpath = "//*[@id='select2-result-label-7']")
	private WebElementFacade LeadEmployeeValueDD;

	@FindBy(xpath = "//*[@id='btnSubmit']/span[1]")
	private WebElementFacade SaveBtnFromWorkOrder;

	@FindBy(xpath = "//*[@id='RouteMasterId']/optgroup[2]/option[1]")
	private WebElementFacade PrimaryRouteDD;

	@FindBy(xpath = "//table[@id='sample_1']/tbody/tr[1]/td[3]/a[@title='Edit Work Order']")
	private WebElementFacade WorkOrderNumber;

	@FindBy(xpath = "//*[@id='OrderType']")
	private WebElementFacade OrderTypeDD;

	@FindBy(xpath = "//*[@id='OrderType']/option[2]")
	private WebElementFacade OrderValueDD;

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[2]/a/span")
	private WebElementFacade CsrDashboardLbl;

	@FindBy(css = ".btnSubmitAdvanceSearch")
	private WebElementFacade AdvanceSearchButton;

	@FindBy(xpath = "//*[@id='sample_1']/tbody/tr[1]/td[10]/a[1]")
	private WebElementFacade CallIconFromAction;

	@FindBy(xpath = "//*[@id='EmployeeNo']/option[3]")
	private WebElementFacade CalledForDDValue;

	@FindBy(xpath = "//*[@id='form0']/div[1]/div[4]/div/div[1]/div/button/span[1]")
	private WebElementFacade SourceDD;

	@FindBy(xpath = "//*[@id='form0']/div[1]/div[4]/div/div[1]/div/div/ul/li[2]/a/span[1]")
	private WebElementFacade SourceDDValue;

	@FindBy(xpath = "//*[@id='form0']/div[1]/div[4]/div/div[2]/div/button/span[1]")
	private WebElementFacade TargetDD;

	@FindBy(xpath = "//*[@id='form0']/div[1]/div[4]/div/div[2]/div/div/ul/li[1]/a")
	private WebElementFacade TargetDDValue;

	@FindBy(xpath = "//*[@id='form0']/div[2]/button[1]")
	private WebElementFacade SaveBtnOnCall;

	@FindBy(xpath = "//*[@id='sample_1']/tbody/tr[1]/td[10]/a[2]")
	private WebElementFacade AddOpportunityIconFromAction;

	@FindBy(xpath = "//*[@id='s2id_PrimaryServiceId']")
	private WebElementFacade PrimaryRequestedServiceDD;

	@FindBy(xpath = "//*[@id='select2-result-label-12']")
	private WebElementFacade PrimaryRequestedServiceDDValue;

	@FindBy(xpath = "//*[@id='frmGeneralInfo']/div/div/div[3]/div[5]/div[2]/div/div/button/span[1]")
	private WebElementFacade SourceDropDown;

	@FindBy(xpath = "//*[@id='frmGeneralInfo']/div/div/div[3]/div[5]/div[2]/div/div/div/ul/li[5]/a/span[1]")
	private WebElementFacade SourceDropDownValue;

	@FindBy(xpath = "//*[@id='btnGenerateLead']/span")
	private WebElementFacade ContinueBtn;

	@FindBy(xpath = "//*[@id='sample_1']/tbody/tr[1]/td[10]/a[3]")
	private WebElementFacade AddTaskIconFromAction;

	@FindBy(xpath = "//*[@id='LeadTaskVm_TaskName']")
	private WebElementFacade TaskNameTextField;

	@FindBy(xpath = "//*[@id='LeadTaskVm_DueDateStr']")
	private WebElementFacade DueDateSelector;

	@FindBy(xpath = "//div[@class='datepicker-days']//th[@class='next']")
	private WebElementFacade DueDateRightArrow;

	@FindBy(xpath = "/html/body/div[12]/div[1]/table/tbody/tr[3]/td[4]")
	private WebElementFacade DueDateData;

	@FindBy(xpath = "/html/body/div[@class='page-container']/div[@class='page-content-wrapper']/form[@action='/Sales/Task/ManageTaskSetup']//div[@class='page-content']//button[@type='submit']")
	private WebElementFacade SaveBtnFromGeneralInfo;

	@FindBy(xpath = "//*[@id='sample_1']/tbody/tr[1]/td[10]/a[4]")
	private WebElementFacade AddNoteIconFromAction;

	@FindBy(xpath = "//*[@id='form0']/div/div[2]/div[6]/div/button[2]")
	private WebElementFacade SaveButtonFromAddNote;

	@FindBy(xpath = "//*[@id='LeadNoteVm_Note']")
	private WebElementFacade EnterNoteTextField;

	@FindBy(xpath = "//*[@id='form0']/div/div[2]/div[6]/div/button[1]")
	private WebElementFacade CloseButtonFromAddnote;

	@FindBy(xpath = "//*[@id='sample_1']/tbody/tr[1]/td[10]/a[5]")
	private WebElementFacade CreateWorkOrderIconFromAction;

	@FindBy(xpath = "//*[@id='select2-chosen-7']")
	private WebElementFacade ServiceCategoryDD;

	@FindBy(xpath = "//*[@id='select2-result-label-12']")
	private WebElementFacade ServiceCategoryDDValue;

	@FindBy(xpath = "//*[@id='serviceWohead']")
	private WebElementFacade ServicesDD;

	@FindBy(xpath = "//*[@id='formWorkOrder']/div[1]/div[2]/div[7]/div[3]/div/a")
	private WebElementFacade AddBtn;

	@FindBy(xpath = "//*[@id='ServiceDateStr']")
	private WebElementFacade ServiceDatePicker;

	@FindBy(xpath = "/html/body/div[14]/div[1]/table/tbody/tr[3]/td[4]")
	private WebElementFacade ServiceDateValue;

	@FindBy(xpath = "tr:nth-of-type(1)  a[title='Detail Page']")
	private WebElementFacade DetailPageIconfromAction;

	@FindBy(xpath = "//*[@id='Note']")
	private WebElementFacade EnterNoteTF;

	@FindBy(xpath = "//*[@id='form0']/div[2]/div/div[4]/div/button/span")
	private WebElementFacade SaveBtnFromDetailPage;

	@FindBy(xpath = "/html/body//ul[@class='page-sidebar-menu page-sidebar-menu-compact']/li[5]/a[@href='#']/span[@class='title']")
	private WebElementFacade CustomerDD;

	@FindBy(css = "[href='\\/Sales\\/CrmAccount']")
	private WebElementFacade AccountInCustomerDD;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div/button")
	private WebElementFacade AddAccountBtn;

	@FindBy(xpath = "//*[@id='ContactTypeId']")
	private WebElementFacade ContactTypeDD;

	@FindBy(xpath = "//*[@id='ContactTypeId']/option[2]")
	private WebElementFacade ContactTypeDDValue;

	@FindBy(xpath = "//*[@id='AccountNo']")
	private WebElementFacade AccountNo;

	@FindBy(xpath = "//*[@id='AccountName']")
	private WebElementFacade AccountName;

	@FindBy(xpath = "//*[@id='crmContactHead']")
	private WebElementFacade Contact;

	@FindBy(xpath = "//*[@id='form0']/div[1]/div[2]/div[3]/div/div/div/button/span[1]")
	private WebElementFacade SourceDDFromAddAccount;

	@FindBy(xpath = "//*[@id='form0']/div[1]/div[2]/div[3]/div/div/div/div/ul/li[5]/a/span[1]")
	private WebElementFacade SourceDDValueFromAddAccount;

	@FindBy(xpath = "//*[@id='form0']/div[2]/button[2]")
	private WebElementFacade SaveBtnFromAddAccount;

	@FindBy(xpath = "//*[@id='form0']/div/div/div/div[21]/div/div/div[1]/button")
	private WebElementFacade AdvanceSearchFromAccount;

	@FindBy(xpath = "//*[@id='sample_1']/tbody/tr[1]/td[10]/a[1]")
	private WebElementFacade AddOpportunityIconForAccount;

	@FindBy(xpath = "//*[@id='select2-chosen-3']")
	private WebElementFacade DepartmentDD;

	@FindBy(xpath = "//*[@id='sample_1']/tbody/tr[1]/td[10]/a[2]")
	private WebElementFacade ViewIconFromAction;

	@FindBy(xpath = "//*[@id='select2-result-label-10']")
	private WebElementFacade DepartmentDDValue;

	@FindBy(xpath = "//*[@id='form0']/div[1]/div[2]/div[5]/div[2]/div/div/button")
	private WebElementFacade SourceDDForAddOpportunity;

	@FindBy(xpath = "//*[@id='form0']/div[1]/div[2]/div[5]/div[2]/div/div/div/ul/li[5]/a/span[1]")
	private WebElementFacade SourceDDValueForAddOpportunity;

	@FindBy(xpath = "//*[@id='FlowType'] [2]")
	private WebElementFacade OpportunityTypeRadioButton;

	@FindBy(xpath = "//*[@id='uniform-rdoResidential']/span")
	private WebElementFacade OpportunityRadioButton;

	@FindBy(xpath = "//*[@id='ProblemDescription']")
	private WebElementFacade ProblemDescTF;

	@FindBy(css = "[href='\\/Sales\\/CrmCompany'] .title")
	private WebElementFacade CompanyFromCustomerDD;

	@FindBy(xpath = "//*[@id='Name']")
	private WebElementFacade EnterNameForAddCompany;

	@FindBy(xpath = "//*[@id='select2-chosen-2']")
	private WebElementFacade SourceDDForAddCompany;

	@FindBy(xpath = "//*[@id='select2-result-label-7']")
	private WebElementFacade SourceDDValueForAddCompany;

	@FindBy(xpath = "//*[@id='sample_1']/tbody/tr[1]/td[6]/a[1]")
	private WebElementFacade AddOpportunityForCompany;

	@FindBy(xpath = "//*[@id='ddlAccountId']")
	private WebElementFacade AccountForCompany;

	@FindBy(xpath = "//*[@id='ddlAccountId']/option[2]")
	private WebElementFacade AccountValueForCompany;

	@FindBy(xpath = "//*[@id='btnContinue']")
	private WebElementFacade ContinueButtonFromCreateOpportunity;

	@FindBy(xpath = "//*[@id='sample_1']/tbody/tr[1]/td[6]/a[2]")
	private WebElementFacade ViewIconFromActionForCompany;

	@FindBy(xpath = "//*[@id='sample_1']/tbody/tr[1]/td[6]/a[3]")
	private WebElementFacade DeleteIconFromActionForCompany;

	@FindBy(xpath = "//*[@id='DeleteCrmCompany']/div/div/div[2]/div[2]/button[2]")
	private WebElementFacade AcceptAlert;

	@FindBy(xpath = "//*[@id='DeleteCrmCompany']/div/div/div[2]/div[2]/button[1]")
	private WebElementFacade DeclineAlert;

	@FindBy(css = "[href='\\/Sales\\/CrmContact']")
	private WebElementFacade ContactFromCustomerDD;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div/button/span")
	private WebElementFacade AddContactbtn;

	@FindBy(xpath = "(//input[@name='FirstName'])[2]")
	private WebElementFacade FirstNameTFForContact;

	@FindBy(xpath = "//*[@id='form0']/div[2]/button[1]")
	private WebElementFacade CloseBtnFromAddContact;

	@FindBy(xpath = "//*[@class='btn green btnSaveLead ladda-button formSaveButton']")
	private WebElementFacade SaveBtnFromAddOpportunityForContact;

	@FindBy(xpath = "//table[@id='sample_1']/tbody/tr[1]//a[@title='Add Opportunity']")
	private WebElementFacade AddOpportunityForContactBtn;

	@FindBy(xpath = "//div[@id='s2id_AddLeadDepartmentSysname']//span[@class='select2-chosen']")
	private WebElementFacade DepartmentDDForAddOpportunityContact;

	@FindBy(xpath = "//div[@id='select2-drop']/ul[@role='listbox']/li[2]/ul/li[@role='presentation']/div[@role='option']")
	private WebElementFacade DepartmentDDValueForAddOpportunityContact;

	@FindBy(xpath = "//*[@id='form0']/div[1]/div[2]/div[5]/div[2]/div/div/button/span[1]")
	private WebElementFacade SourceDDForAddOpportunityContact;

	@FindBy(xpath = "//*[@id='form0']/div[1]/div[2]/div[5]/div[2]/div/div/div/ul/li[5]/a/span[1]")
	private WebElementFacade SourceDDValueForAddOpportunityContact;

	@FindBy(xpath = "//table[@id='sample_1']/tbody/tr[1]//a[@title='View']")
	private WebElementFacade ViewActionForContact;

	@FindBy(xpath = "//table[@id='sample_1']/tbody/tr[1]//a[@title='Delete']")
	private WebElementFacade DeleteIconForContact;

	@FindBy(xpath = "html//div[@id='DeleteCrmContact']/div[@class='modal-dialog']//div[@class='modal-footer']/button[2]")
	private WebElementFacade AcceptDeleteAlertForContact;

	@FindBy(xpath = "/html//div[@id='DeleteCrmContact']/div[@class='modal-dialog']//div[@class='modal-footer']/button[1]")
	private WebElementFacade DeclineDeleteAlertForContact;

	@FindBy(css = "[href='\\/Sales\\/Lead'] .title")
	private WebElementFacade OpportunityFromCustomerDd;

	@FindBy(xpath = "//*[@id='newAccount']/a")
	private WebElementFacade NewACcountBtnInAddOpportunity;

	@FindBy(css = "[href='\\/Sales\\/WebLead']")
	private WebElementFacade LeadFromCustomerDD;

	@FindBy(xpath = "/html/body/div[@class='page-container']/div[@class='page-content-wrapper']//div[@class='page-content']//div[@class='input-group']/button[@href='#']")
	private WebElementFacade AddLeadBtn;

	@FindBy(xpath = "/html//div[@id='AddWebLeadPopupDiv']/div[@class='vertical-alignment-helper']/div[@class='modal-dialog modal-lg vertical-align-center']/div[@class='modal-content']//form[@action='/Sales/WebLead/Manage']//input[@id='FirstName']")
	private WebElementFacade FirstNameTfFromAddLead;

	@FindBy(css = "[href='\\/Sales\\/CrmDatabase']")
	private WebElementFacade DatabaseFromCustomerDd;

	@FindBy(xpath = "/html/body/div[@class='page-container']/div[@class='page-content-wrapper']/div[@class='page-content-wrapper']/div[@class='page-content']//button[@href='#']")
	private WebElementFacade AddDatabaseEntryBtn;

	@FindBy(xpath = "/html//div[@id='AddCrmDatabase']/div[@class='vertical-alignment-helper']/div[@class='modal-dialog modal-lg vertical-align-center']/div[@class='modal-content']//form[@action='/Sales/CrmDatabase/Manage']//input[@id='FirstName']")
	private WebElementFacade EnterFirstNameTfForDatabase;

	@FindBy(xpath = "/html//div[@id='DivAccountAlertPopup']/div[@class='vertical-alignment-helper']/div[@class='modal-dialog vertical-align-center']//div[@class='modal-body']/div[@class='modal-body-footer']//button[@type='button']")
	private WebElementFacade CloseBtnForAlert;

	@FindBy(xpath = "//*[@id='form0']/div[2]/button[2]/span[1]")
	private WebElementFacade ContinueButtonFromCreateOpportunity1;

	@Override
	public WebElementFacade getUniqueElement() {

		return null;
	}

	public void DDBranch() throws Exception {

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		scrollDown(DDBranch);
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(DDBranch));
		DDBranch.click();

		wait.until(ExpectedConditions.elementToBeClickable(valueDDBranch));
		valueDDBranch.click();

	}

	public void DDSource() throws Exception {

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		scrollDown(DDSource);
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(DDSource));
		DDSource.click();
		wait.until(ExpectedConditions.elementToBeClickable(valueDDSource));
		valueDDSource.click();

	}

	public void PrimaryRequestedService() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(valueDDPrimaryRequestedService));
		valueDDPrimaryRequestedService.click();

	}

	public void ServiceAddress(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(PlusButtonSA));
		PlusButtonSA.click();

		wait.until(ExpectedConditions.elementToBeClickable(AddressLine1));
		AddressLine1.sendKeys(testData.get("Address line 1"));
		Thread.sleep(2000);
		ZipCode.sendKeys(testData.get("Zip"));
		Thread.sleep(2000);
		City.sendKeys(testData.get("City"));
		Thread.sleep(2000);

	}

	public void SaveFromOpportunity() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveButton));

		scrollUP(SaveButton);
		Thread.sleep(2000);
		scrollUP(SaveButton);
		Thread.sleep(2000);
		SaveButton.click();
		Thread.sleep(3000);
		OkButton.click();

	}

	public void JobDescription(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(JobDescTF));
		JobDescTF.click();
		JobDescTF.sendKeys(testData.get("Job Desc"));
		Thread.sleep(3000);

	}

	public void checkFlatRate() throws Exception {
		waitABit(2000);
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		scrollDown(Flatrate);
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Flatrate));
		Flatrate.click();

	}

	public void clickAdvanceSearch() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AdvanceSearchBtn));
		AdvanceSearchBtn.click();

	}

	public void selectOneWorkOrder() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(FirstWorkOrderlbl));

		FirstWorkOrderlbl.click();

	}

	public void selectLeadEmployee() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(LeadEmployeeDD));

		scrollDownLarge(LeadEmployeeDD);
		PrimaryRouteDD.click();
		Thread.sleep(2000);
		PrimaryRouteDD.click();
		Thread.sleep(2000);
		LeadEmployeeDD.click();
		Thread.sleep(2000);
		LeadEmployeeValueDD.click();
		Thread.sleep(2000);
	}

	public void clickSavefromWorkOrder() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveBtnFromWorkOrder));

		scrollDown(SaveBtnFromWorkOrder);

		wait.until(ExpectedConditions.elementToBeClickable(SaveBtnFromWorkOrder));
		SaveBtnFromWorkOrder.click();

	}

	public void clickOnAdvanceSearchBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AdvanceSearchBtn));

		AdvanceSearchBtn.click();

	}

	public void clickOnWorkOrderNumber() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(WorkOrderNumber));

		WorkOrderNumber.click();

	}

	public void selectOrderFromOrderTypeDD() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(OrderTypeDD));

		OrderTypeDD.click();
		Thread.sleep(1000);
		OrderValueDD.click();
		Thread.sleep(3000);

	}

	public void clickOnCsrDashboard() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(CsrDashboardLbl));

		scrollUPSmall(CsrDashboardLbl);
		CsrDashboardLbl.click();

	}

	public void ClickAdvanceSearchBTN() throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		scrollDown(AdvanceSearchButton);
		wait.until(ExpectedConditions.elementToBeClickable(AdvanceSearchButton));

		AdvanceSearchButton.click();

	}

	public void clickOnAddCall() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(CallIconFromAction));

		CallIconFromAction.click();

	}

	public void ClickSaveBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(SaveBtnOnCall));
		SaveBtnOnCall.click();

	}

	public void SelectcallInfo() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(CalledForDDValue));

		CalledForDDValue.click();
		Thread.sleep(1000);

		SourceDD.click();
		Thread.sleep(1000);
		SourceDDValue.click();
		Thread.sleep(1000);

		TargetDD.click();
		Thread.sleep(1000);
		TargetDDValue.click();
		Thread.sleep(1000);

	}

	public void clickOnAddOpportunityFromAction() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(AddOpportunityIconFromAction));
		AddOpportunityIconFromAction.click();

	}

	public void selectGeneralInfo() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(PrimaryRequestedServiceDD));

		PrimaryRequestedServiceDD.click();
		Thread.sleep(1000);
		PrimaryRequestedServiceDDValue.click();
		Thread.sleep(1000);
		SourceDropDown.click();
		Thread.sleep(500);
		SourceDropDownValue.click();
		Thread.sleep(500);

	}

	public void clickContinueFromGenralInfo() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(ContinueBtn));
		ContinueBtn.click();

	}

	public void ClickOnAddTaskActionFromAction() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(AddTaskIconFromAction));
		scrollDown(AddTaskIconFromAction);
		AddTaskIconFromAction.click();

	}

	public void SelectAddTaskAndDueDateFromGeneralInfo() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(TaskNameTextField));
		TaskNameTextField.click();
		waitABit(2000);
		TaskNameTextField.sendKeys("Task Name");
		Thread.sleep(1000);

		DueDateSelector.click();
		Thread.sleep(1000);

		DueDateRightArrow.click();
		Thread.sleep(1000);

		DueDateData.click();
		Thread.sleep(1000);

	}

	public void ClickSaveBtnGeneralInfo() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(SaveBtnFromGeneralInfo));
		scrollDown(SaveBtnFromGeneralInfo);
		SaveBtnFromGeneralInfo.click();

	}

	public void ClickOnAddNoteFromAction() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddNoteIconFromAction));
		scrollDown(AddNoteIconFromAction);
		AddNoteIconFromAction.click();

	}

	public void EnterNoteForAddNote() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(EnterNoteTextField));

		EnterNoteTextField.click();
		waitABit(2000);
		EnterNoteTextField.sendKeys("this is the note");
	}

	public void ClickSaveFromAddNote() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(SaveButtonFromAddNote));

		SaveButtonFromAddNote.click();
		Thread.sleep(2000);

	}

	public void ClickCloseBtnFromAddNote() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(CloseButtonFromAddnote));

		CloseButtonFromAddnote.click();
		waitABit(2000);
	}

	public void ClickCreateWorkorderFRomAction() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(CreateWorkOrderIconFromAction));
		scrollDown(CreateWorkOrderIconFromAction);

		CreateWorkOrderIconFromAction.click();

	}

	public void SelectServiceCategoryAndServices() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(ServiceCategoryDD));

		ServiceCategoryDD.click();
		Thread.sleep(2000);
		ServiceCategoryDDValue.click();
		Thread.sleep(2000);
		ServicesDD.click();
		Thread.sleep(2500);
		ServicesDD.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		ServicesDD.sendKeys(Keys.ENTER);
		Thread.sleep(2500);

	}

	public void ClickOnAddBTN() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(AddBtn));
		AddBtn.click();

	}

	public void EnterServiceDate() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(ServiceDatePicker));

		scrollDownLarge(ServiceDatePicker);
		Thread.sleep(1500);
		ServiceDatePicker.click();
		Thread.sleep(1500);
		DueDateRightArrow.click();
		Thread.sleep(1500);
		ServiceDateValue.click();
		Thread.sleep(3000);
	}

	public void ClickDetailPageFRomAction() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(DetailPageIconfromAction));

		scrollDown(DetailPageIconfromAction);
		Thread.sleep(1500);
		DetailPageIconfromAction.click();
		Thread.sleep(6000);

	}

	public void EnterNoteForDetailPage() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(EnterNoteTF));

		scrollDown(EnterNoteTF);
		Thread.sleep(1500);
		EnterNoteTF.click();
		Thread.sleep(1500);
		EnterNoteTF.sendKeys("This is the Note");
		Thread.sleep(1500);

	}

	public void ClickSaveOnDetailPage() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(SaveBtnFromDetailPage));

		SaveBtnFromDetailPage.click();

	}

	public void ClickOnCustomer() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));

		wait.until(ExpectedConditions.elementToBeClickable(CustomerDD));

		CustomerDD.click();

	}

	public void ClickOnAccountFromCustomer() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));

		wait.until(ExpectedConditions.elementToBeClickable(AccountInCustomerDD));

		AccountInCustomerDD.click();
	}

	public void EnterCustomerInfo(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(ContactTypeDD));

		ContactTypeDD.click();
		Thread.sleep(1000);
		ContactTypeDDValue.click();
		Thread.sleep(1000);
		Contact.sendKeys(testData.get("Contact"));
		Thread.sleep(1000);
		SourceDDFromAddAccount.click();
		Thread.sleep(1000);
		SourceDDValueFromAddAccount.click();

	}

	public void ClickOnAddAccount() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(AddAccountBtn));

		AddAccountBtn.click();
	}

	public void ClickSaveFromAddAccountddAccount() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(SaveBtnFromAddAccount));

		SaveBtnFromAddAccount.click();
	}

	public void CLickAdvanceSearchFromAccount() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(AdvanceSearchFromAccount));

		AdvanceSearchFromAccount.click();

	}

	public void ClickAddOpportunityFromAction() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(AddOpportunityIconForAccount));

		AddOpportunityIconForAccount.click();

	}

	public void EnterTestDataForOpportunity() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(DepartmentDD));

		DepartmentDD.click();
		Thread.sleep(1000);
		DepartmentDDValue.click();
		Thread.sleep(500);
		SourceDDForAddOpportunity.click();
		Thread.sleep(1000);
		SourceDDValueForAddOpportunity.click();
		Thread.sleep(1000);
		OpportunityTypeRadioButton.click();
		Thread.sleep(1000);

	}

	public void ClickViewIconFromAction() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(ViewIconFromAction));

		ViewIconFromAction.click();
		Thread.sleep(6000);

	}

	public void ClickOnPhoneSalesIconAndSelectgeneralInfo() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(AddTaskIconFromAction));

		AddTaskIconFromAction.click();
		wait.until(ExpectedConditions.elementToBeClickable(SourceDropDown));
		SourceDropDown.click();
		Thread.sleep(1000);
		SourceDropDownValue.click();
		Thread.sleep(1000);
		ProblemDescTF.sendKeys("This Is Problem Desc");
		Thread.sleep(1000);
		scrollDown(OpportunityRadioButton);
		Thread.sleep(1000);

	}

	public void ClickOnCompanyFromCustomer() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(CompanyFromCustomerDD));

		CompanyFromCustomerDD.click();

	}

	public void EnterTestDataForAddCompany() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(EnterNameForAddCompany));

		EnterNameForAddCompany.sendKeys("Nitesh");
		Thread.sleep(1000);
		SourceDDForAddCompany.click();
		Thread.sleep(1000);
		SourceDDValueForAddCompany.click();
		Thread.sleep(1000);

	}

	public void ClickOnAddOpportunityForCompany() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(AddOpportunityForCompany));

		AddOpportunityForCompany.click();

	}

	public void SelectAccountFromCompany() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(OpportunityTypeRadioButton));

		OpportunityTypeRadioButton.click();
		Thread.sleep(2000);

	}

	public void ClickContinueFromAddOpportunityForCompany() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(ContinueButtonFromCreateOpportunity1));

		ContinueButtonFromCreateOpportunity1.click();
	}

	public void ClickOnViewFromActionForCompany() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(ViewIconFromActionForCompany));

		ViewIconFromActionForCompany.click();
	}

	public void ClickOnDeleteFromActionForCompany() {
		waitABit(2000);

	}

	public void ConfirmTheDeleteAlert() {
		waitABit(2000);
		// AcceptAlert.click();
	}

	public void CancelTheDeleteAlert() {
		waitABit(2000);

	}

	public void ClickContactFromCustomerDD() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(ContactFromCustomerDD));
		ContactFromCustomerDD.click();

	}

	public void ClickOnAddContact() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(AddContactbtn));

		AddContactbtn.click();
	}

	public void EnterTestDataForAddContact() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(FirstNameTFForContact));

		FirstNameTFForContact.sendKeys("Test Data");
	}

	public void ClickCloseBtnFromAddContact() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(CloseBtnFromAddContact));
		CloseBtnFromAddContact.click();

	}

	public void EnterTestDataOfAddOpportunityForContact() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(DepartmentDDForAddOpportunityContact));

		DepartmentDDForAddOpportunityContact.click();
		Thread.sleep(1000);
		DepartmentDDValueForAddOpportunityContact.click();
		Thread.sleep(1000);
		SourceDDForAddOpportunityContact.click();
		Thread.sleep(1000);
		SourceDDValueForAddOpportunityContact.click();
		Thread.sleep(1000);
		OpportunityTypeRadioButton.click();
		Thread.sleep(1000);
	}

	public void ClickonAddOpportunityForContact() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(AddOpportunityForContactBtn));

		AddOpportunityForContactBtn.click();
	}

	public void ClickonSaveButtonForAddOpportunityContact() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(SaveBtnFromAddAccount));

		SaveBtnFromAddAccount.click();
	}

	public void CLickOnViewContactFromAction() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(ViewActionForContact));

		ViewActionForContact.click();
	}

	public void CLickOnDeleteContactFromAction() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(DeleteIconForContact));

		DeleteIconForContact.click();
	}

	public void ConfirmDeleteForContact() {
		waitABit(2000);
		// AcceptDeleteAlertForContact.click();
	}

	public void DeclineDeleteAlertForContact() throws Exception {

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(DeclineDeleteAlertForContact));

		DeclineDeleteAlertForContact.click();
	}

	public void SelectopportunityFromCustomerDD() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(OpportunityFromCustomerDd));

		OpportunityFromCustomerDd.click();
	}

	public void ClickNewACcountBtnInAddOpportunity() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 15);
		wait.until(ExpectedConditions.elementToBeClickable(NewACcountBtnInAddOpportunity));

		NewACcountBtnInAddOpportunity.click();
	}

	public void SelectLeadFromCustomerDD() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(LeadFromCustomerDD));

		LeadFromCustomerDD.click();
	}

	public void ClickAddLeadBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(AddLeadBtn));

		AddLeadBtn.click();
	}

	public void SelectOrEnterInfoForAddLead() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(FirstNameTfFromAddLead));

		FirstNameTfFromAddLead.sendKeys("Test");
		waitABit(1000);
		OpportunityTypeRadioButton.click();
	}

	public void selectDatabaseFromCustomerDD() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(DatabaseFromCustomerDd));

		DatabaseFromCustomerDd.click();
	}

	public void clickAddDatabaseEntryBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(AddDatabaseEntryBtn));

		AddDatabaseEntryBtn.click();
	}

	public void enterGeneralTestDataForAddDatabaseEntry() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		wait.until(ExpectedConditions.elementToBeClickable(EnterFirstNameTfForDatabase));

		EnterFirstNameTfForDatabase.sendKeys("test");
	}

	public void clickCloseForAlert() {
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait.until(ExpectedConditions.elementToBeClickable(CloseBtnForAlert));

			CloseBtnForAlert.click();

		} catch (Exception e) {
			waitABit(1000);

		}
	}
}

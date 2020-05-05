package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.AcceptAlert;

import com.infocrats.utils.BaseUtills;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class NewUserCallHVACPage extends peststreamPage {
	BaseUtills utills = new BaseUtills();

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

	@FindBy(xpath = "//*[@id='PrimaryServiceId']")
	private WebElementFacade DDPrimaryRequestedService;

	@FindBy(xpath = "//*[@id='PrimaryServiceId']/optgroup/option[1]")
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

	@FindBy(xpath = "//*[@id='form0']/div/div/div[19]/div/div/button")
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

	@FindBy(xpath = "/html/body/div[3]/div[2]/form/div[2]/div/div[2]/div/div/div[11]/div[2]/button")
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

	@FindBy(xpath = "//*[@id='sample_1']/tbody/tr[1]/td[10]/a[7]")
	private WebElementFacade DetailPageIconfromAction;

	@FindBy(xpath = "//*[@id='Note']")
	private WebElementFacade EnterNoteTF;

	@FindBy(xpath = "//*[@id='form0']/div[2]/div/div[4]/div/button/span")
	private WebElementFacade SaveBtnFromDetailPage;

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[4]/a")
	private WebElementFacade CustomerDD;

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[4]/ul/li[1]/a/span")
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

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[4]/ul/li[2]/a")
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

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[4]/ul/li[3]/a/span")
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

	@FindBy(xpath = "/html/body//ul[@class='page-sidebar-menu page-sidebar-menu-compact']/li[4]/ul[@class='sub-menu']//a[@href='/Sales/Lead']")
	private WebElementFacade OpportunityFromCustomerDd;

	@FindBy(xpath = "//*[@id='newAccount']/a")
	private WebElementFacade NewACcountBtnInAddOpportunity;

	@FindBy(xpath = "/html/body//ul[@class='page-sidebar-menu page-sidebar-menu-compact']/li[4]/ul[@class='sub-menu']//a[@href='/Sales/WebLead']")
	private WebElementFacade LeadFromCustomerDD;

	@FindBy(xpath = "/html/body/div[@class='page-container']/div[@class='page-content-wrapper']//div[@class='page-content']//div[@class='input-group']/button[@href='#']")
	private WebElementFacade AddLeadBtn;

	@FindBy(xpath = "/html//div[@id='AddWebLeadPopupDiv']/div[@class='vertical-alignment-helper']/div[@class='modal-dialog modal-lg vertical-align-center']/div[@class='modal-content']//form[@action='/Sales/WebLead/Manage']//input[@id='FirstName']")
	private WebElementFacade FirstNameTfFromAddLead;

	@FindBy(xpath = "/html/body//ul[@class='page-sidebar-menu page-sidebar-menu-compact']/li[4]/ul[@class='sub-menu']//a[@href='/Sales/CrmDatabase']")
	private WebElementFacade DatabaseFromCustomerDd;

	@FindBy(xpath = "/html/body/div[@class='page-container']/div[@class='page-content-wrapper']/div[@class='page-content-wrapper']/div[@class='page-content']//button[@href='#']")
	private WebElementFacade AddDatabaseEntryBtn;

	@FindBy(xpath = "/html//div[@id='AddCrmDatabase']/div[@class='vertical-alignment-helper']/div[@class='modal-dialog modal-lg vertical-align-center']/div[@class='modal-content']//form[@action='/Sales/CrmDatabase/Manage']//input[@id='FirstName']")
	private WebElementFacade EnterFirstNameTfForDatabase;
	
	@FindBy(xpath = "/html//div[@id='DivAccountAlertPopup']/div[@class='vertical-alignment-helper']/div[@class='modal-dialog vertical-align-center']//div[@class='modal-body']/div[@class='modal-body-footer']//button[@type='button']")
	private WebElementFacade CloseBtnForAlert;

	@Override
	public WebElementFacade getUniqueElement() {

		return null;
	}

	public void DDBranch() {
		DDBranch.click();
		waitABit(2000);

		valueDDBranch.click();
		waitABit(3000);

	}

	public void DDSource() {
		DDSource.click();
		waitABit(2000);

		valueDDSource.click();
		waitABit(1000);
		AccountAlert.click();
	}

	public void PrimaryRequestedService() throws InterruptedException {
		Thread.sleep(1000);
		DDPrimaryRequestedService.click();
		Thread.sleep(2000);
		valueDDPrimaryRequestedService.click();
		Thread.sleep(2000);

	}

	public void ServiceAddress(Map<String, String> testData) throws InterruptedException {
		Thread.sleep(1500);
		PlusButtonSA.click();
		Thread.sleep(1000);
		AddressLine1.sendKeys(testData.get("Address line 1"));
		Thread.sleep(1000);
		ZipCode.sendKeys(testData.get("Zip"));
		Thread.sleep(1000);
		City.sendKeys(testData.get("City"));
		Thread.sleep(1000);

	}

	public void SaveFromOpportunity() throws InterruptedException {
		Thread.sleep(3000);
		scrollUP(SaveButton);
		Thread.sleep(1000);
		scrollUP(SaveButton);
		Thread.sleep(1000);
		SaveButton.click();
		Thread.sleep(3000);
		OkButton.click();

	}

	public void JobDescription(Map<String, String> testData) throws InterruptedException {
		Thread.sleep(2000);
		JobDescTF.click();
		Thread.sleep(2000);
		JobDescTF.sendKeys(testData.get("Job Desc"));
		Thread.sleep(1500);

	}

	public void checkFlatRate() throws InterruptedException {
		Thread.sleep(1000);
		Flatrate.click();
		Thread.sleep(1000);
	}

	public void clickAdvanceSearch() throws InterruptedException {
		Thread.sleep(5000);
		AdvanceSearchBtn.click();
		Thread.sleep(3000);

	}

	public void selectOneWorkOrder() throws InterruptedException {
		FirstWorkOrderlbl.click();
		Thread.sleep(6000);
	}

	public void selectLeadEmployee() throws InterruptedException {
		scrollDownLarge(LeadEmployeeDD);
		PrimaryRouteDD.click();
		Thread.sleep(1000);
		PrimaryRouteDD.click();
		Thread.sleep(1000);
		LeadEmployeeDD.click();
		Thread.sleep(1000);
		LeadEmployeeValueDD.click();
		Thread.sleep(1000);
	}

	public void clickSavefromWorkOrder() throws InterruptedException {
		scrollDown(SaveBtnFromWorkOrder);
		SaveBtnFromWorkOrder.click();
		Thread.sleep(5000);

	}

	public void clickOnAdvanceSearchBtn() throws InterruptedException {
		AdvanceSearchBtn.click();
		Thread.sleep(3000);

	}

	public void clickOnWorkOrderNumber() throws InterruptedException {
		WorkOrderNumber.click();
		Thread.sleep(7000);

	}

	public void selectOrderFromOrderTypeDD() throws InterruptedException {
		OrderTypeDD.click();
		OrderValueDD.click();
		Thread.sleep(1000);

	}

	public void clickOnCsrDashboard() throws InterruptedException {
		scrollUPSmall(CsrDashboardLbl);
		CsrDashboardLbl.click();
		Thread.sleep(1000);

	}

	public void ClickAdvanceSearchBTN() throws InterruptedException {
		AdvanceSearchButton.click();
		Thread.sleep(4000);

	}

	public void clickOnAddCall() throws InterruptedException {
		CallIconFromAction.click();
		Thread.sleep(3000);
	}

	public void ClickSaveBtn() throws InterruptedException {
		SaveBtnOnCall.click();
		Thread.sleep(2000);

	}

	public void SelectcallInfo() throws InterruptedException {
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

	public void clickOnAddOpportunityFromAction() throws InterruptedException {
		AddOpportunityIconFromAction.click();
		Thread.sleep(4000);
	}

	public void selectGeneralInfo() throws InterruptedException {
		PrimaryRequestedServiceDD.click();
		Thread.sleep(1000);
		PrimaryRequestedServiceDDValue.click();
		Thread.sleep(1000);
		SourceDropDown.click();
		Thread.sleep(500);
		SourceDropDownValue.click();
		Thread.sleep(500);

	}

	public void clickContinueFromGenralInfo() throws InterruptedException {
		ContinueBtn.click();
		Thread.sleep(4000);

	}

	public void ClickOnAddTaskActionFromAction() throws InterruptedException {
		scrollDown(AddTaskIconFromAction);
		AddTaskIconFromAction.click();
		Thread.sleep(3000);

	}

	public void SelectAddTaskAndDueDateFromGeneralInfo() throws InterruptedException {
		TaskNameTextField.click();
		TaskNameTextField.sendKeys("Task Name");
		Thread.sleep(500);

		DueDateSelector.click();
		Thread.sleep(500);

		DueDateRightArrow.click();
		Thread.sleep(500);

		DueDateData.click();
		Thread.sleep(500);

	}

	public void ClickSaveBtnGeneralInfo() {
		scrollDown(SaveBtnFromGeneralInfo);
		SaveBtnFromGeneralInfo.click();
	}

	public void ClickOnAddNoteFromAction() throws InterruptedException {
		scrollDown(AddNoteIconFromAction);
		AddNoteIconFromAction.click();
		Thread.sleep(1000);
	}

	public void EnterNoteForAddNote() {
		EnterNoteTextField.click();
		EnterNoteTextField.sendKeys("this is the note");
	}

	public void ClickSaveFromAddNote() throws InterruptedException {
		SaveButtonFromAddNote.click();
		Thread.sleep(2000);

	}

	public void ClickCloseBtnFromAddNote() {
		CloseButtonFromAddnote.click();
	}

	public void ClickCreateWorkorderFRomAction() throws InterruptedException {
		scrollDown(CreateWorkOrderIconFromAction);
		CreateWorkOrderIconFromAction.click();
		Thread.sleep(1500);
	}

	public void SelectServiceCategoryAndServices() throws InterruptedException {
		Thread.sleep(500);
		ServiceCategoryDD.click();
		Thread.sleep(500);
		ServiceCategoryDDValue.click();
		Thread.sleep(500);
		ServicesDD.click();
		Thread.sleep(1500);
		ServicesDD.sendKeys(Keys.DOWN);
		ServicesDD.sendKeys(Keys.ENTER);
		Thread.sleep(1500);

	}

	public void ClickOnAddBTN() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(1000);

	}

	public void EnterServiceDate() throws InterruptedException {
		scrollDownLarge(ServiceDatePicker);
		ServiceDatePicker.click();
		DueDateRightArrow.click();
		ServiceDateValue.click();
		Thread.sleep(1500);
	}

	public void ClickDetailPageFRomAction() throws InterruptedException {
		scrollDown(DetailPageIconfromAction);
		DetailPageIconfromAction.click();
		Thread.sleep(3500);

	}

	public void EnterNoteForDetailPage() {
		scrollDown(EnterNoteTF);
		EnterNoteTF.click();
		EnterNoteTF.sendKeys("This is the Note");

	}

	public void ClickSaveOnDetailPage() throws InterruptedException {
		Thread.sleep(1000);
		SaveBtnFromDetailPage.click();

	}

	public void ClickOnCustomer() {
		CustomerDD.click();
	}

	public void ClickOnAccountFromCustomer() {
		AccountInCustomerDD.click();
	}

	public void EnterCustomerInfo(Map<String, String> testData) throws InterruptedException {
		Thread.sleep(1500);
		ContactTypeDD.click();
		ContactTypeDDValue.click();
		Thread.sleep(1000);
		Contact.sendKeys(testData.get("Contact"));
		Thread.sleep(1000);
		SourceDDFromAddAccount.click();
		SourceDDValueFromAddAccount.click();

	}

	public void ClickOnAddAccount() throws InterruptedException {
		AddAccountBtn.click();
		Thread.sleep(3000);
	}

	public void ClickSaveFromAddAccountddAccount() {
		SaveBtnFromAddAccount.click();

	}

	public void CLickAdvanceSearchFromAccount() throws InterruptedException {
		AdvanceSearchFromAccount.click();
		Thread.sleep(4000);

	}

	public void ClickAddOpportunityFromAction() {
		AddOpportunityIconForAccount.click();

	}

	public void EnterTestDataForOpportunity() throws InterruptedException {
		DepartmentDD.click();
		DepartmentDDValue.click();
		Thread.sleep(500);
		SourceDDForAddOpportunity.click();
		SourceDDValueForAddOpportunity.click();
		Thread.sleep(500);
		OpportunityTypeRadioButton.click();
		Thread.sleep(1000);

	}

	public void ClickViewIconFromAction() throws InterruptedException {
		ViewIconFromAction.click();
		Thread.sleep(4000);

	}

	public void ClickOnPhoneSalesIconAndSelectgeneralInfo() throws InterruptedException {
		AddTaskIconFromAction.click();
		Thread.sleep(5000);
		SourceDropDown.click();
		Thread.sleep(500);
		SourceDropDownValue.click();
		Thread.sleep(500);
		ProblemDescTF.sendKeys("This Is Problem Desc");
		Thread.sleep(500);
		scrollDown(OpportunityRadioButton);
		OpportunityRadioButton.click();
	}

	public void ClickOnCompanyFromCustomer() throws InterruptedException {
		CompanyFromCustomerDD.click();
		Thread.sleep(3000);

	}

	public void EnterTestDataForAddCompany() throws InterruptedException {
		EnterNameForAddCompany.sendKeys("Nitesh");
		Thread.sleep(500);
		SourceDDForAddCompany.click();
		SourceDDValueForAddCompany.click();
		Thread.sleep(500);

	}

	public void ClickOnAddOpportunityForCompany() {
		AddOpportunityForCompany.click();

	}

	public void SelectAccountFromCompany() {
		AccountForCompany.click();
		AccountValueForCompany.click();

	}

	public void ClickContinueFromAddOpportunityForCompany() {
		ContinueButtonFromCreateOpportunity.click();
	}

	public void ClickOnViewFromActionForCompany() throws InterruptedException {
		ViewIconFromActionForCompany.click();
		Thread.sleep(2000);
	}

	public void ClickOnDeleteFromActionForCompany() {
		DeleteIconFromActionForCompany.click();

	}

	public void ConfirmTheDeleteAlert() {
		AcceptAlert.click();
	}

	public void CancelTheDeleteAlert() {
		DeclineAlert.click();
	}

	public void ClickContactFromCustomerDD() {
		ContactFromCustomerDD.click();

	}

	public void ClickOnAddContact() {
		AddContactbtn.click();
	}

	public void EnterTestDataForAddContact() {
		FirstNameTFForContact.sendKeys("Test Data");
	}

	public void ClickCloseBtnFromAddContact() {
		CloseBtnFromAddContact.click();
	}

	public void EnterTestDataOfAddOpportunityForContact() throws InterruptedException {
		DepartmentDDForAddOpportunityContact.click();
		Thread.sleep(500);
		DepartmentDDValueForAddOpportunityContact.click();
		Thread.sleep(500);
		SourceDDForAddOpportunityContact.click();
		Thread.sleep(500);
		SourceDDValueForAddOpportunityContact.click();
		Thread.sleep(500);
		OpportunityTypeRadioButton.click();
		Thread.sleep(500);
	}

	public void ClickonAddOpportunityForContact() throws InterruptedException {
		AddOpportunityForContactBtn.click();
		Thread.sleep(2500);
	}

	public void ClickonSaveButtonForAddOpportunityContact() {
		SaveBtnFromAddAccount.click();
	}

	public void CLickOnViewContactFromAction() throws InterruptedException {
		ViewActionForContact.click();
		Thread.sleep(2500);
	}

	public void CLickOnDeleteContactFromAction() {
		DeleteIconForContact.click();
	}

	public void ConfirmDeleteForContact() {
		AcceptDeleteAlertForContact.click();
	}

	public void DeclineDeleteAlertForContact() {
		DeclineDeleteAlertForContact.click();
	}

	public void SelectopportunityFromCustomerDD() {
		OpportunityFromCustomerDd.click();
	}

	public void ClickNewACcountBtnInAddOpportunity() {
		NewACcountBtnInAddOpportunity.click();
	}

	public void SelectLeadFromCustomerDD() throws InterruptedException {
		LeadFromCustomerDD.click();
		Thread.sleep(2500);
	}

	public void ClickAddLeadBtn() {
		AddLeadBtn.click();
	}

	public void SelectOrEnterInfoForAddLead() {
		FirstNameTfFromAddLead.sendKeys("Test");
		waitABit(1000);
		OpportunityTypeRadioButton.click();
	}

	public void selectDatabaseFromCustomerDD() {
		DatabaseFromCustomerDd.click();
	}

	public void clickAddDatabaseEntryBtn() {
		AddDatabaseEntryBtn.click();
	}

	public void enterGeneralTestDataForAddDatabaseEntry() {
		EnterFirstNameTfForDatabase.sendKeys("test");
	}

	public void clickCloseForAlert() {
	CloseBtnForAlert.click();
		
	}
}

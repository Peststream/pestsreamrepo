package com.infocrats.steps;

import java.util.Map;

import com.infocrats.pageObjects.NewUserCallHVACPage;
import com.infocrats.utils.JsonHelper;

public class NewUserCallHVACSteps extends pestreamSteps {

	private Map<String, String> jsonData;

	NewUserCallHVACPage newusercallHVACpage;

	public void leadBranchInformation() throws Exception {
		newusercallHVACpage.DDBranch();
	}

	public void ClickOnSource() throws Exception {
		newusercallHVACpage.DDSource();

	}

	public void ClickOnPrimaryRequestedService() throws Exception {
		newusercallHVACpage.PrimaryRequestedService();
	}

	public void EnterServiceAddress() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_HVAC.json", "CallDataForHVAC");
		newusercallHVACpage.ServiceAddress(jsonData);

	}

	public void ClickOnSaveFromOpportunity() throws Exception {
		newusercallHVACpage.SaveFromOpportunity();

	}

	public void EnterJobDescription() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_HVAC.json", "CallDataForHVAC");
		newusercallHVACpage.JobDescription(jsonData);

	}

	public void CheckFlatRate() throws Exception {
		newusercallHVACpage.checkFlatRate();

	}

	public void ClickAdvanceSearch() throws Exception {
		newusercallHVACpage.clickAdvanceSearch();
	}

	public void SelectOneWorkOrder() throws Exception {
		newusercallHVACpage.selectOneWorkOrder();
	}

	public void SelectLeadEmployeeInDD() throws Exception {
		newusercallHVACpage.selectLeadEmployee();
	}

	public void ClickOnSaveFromWorkOrder() throws Exception {
		newusercallHVACpage.clickSavefromWorkOrder();
	}

	public void ClickOnAdvanceSearchBtn() throws Exception {
		newusercallHVACpage.clickOnAdvanceSearchBtn();

	}

	public void ClickOnFirstWorkOrderNumber() throws Exception {
		newusercallHVACpage.clickOnWorkOrderNumber();
	}

	public void SelectOrderFromOrderTypeDD() throws Exception {
		newusercallHVACpage.selectOrderFromOrderTypeDD();

	}

	public void ClickOnCsrDashboard() throws Exception {
		newusercallHVACpage.clickOnCsrDashboard();
	}

	public void ClickOnAddCall() throws Exception {
		newusercallHVACpage.clickOnAddCall();
	}

	public void ClickOnSaveBtn() throws InterruptedException {
		newusercallHVACpage.ClickSaveBtn();

	}

	public void clickOnAdvanceSearchBTN() throws Exception {
		newusercallHVACpage.ClickAdvanceSearchBTN();

	}

	public void SelectCallInfo() throws InterruptedException {
		newusercallHVACpage.SelectcallInfo();

	}

	public void ClickOnAddOpportunityFromAction() throws InterruptedException {
		newusercallHVACpage.clickOnAddOpportunityFromAction();
	}

	public void SelectGeneralInfo() throws InterruptedException {
		newusercallHVACpage.selectGeneralInfo();
	}

	public void ClickContinueFromGenralInfo() throws InterruptedException {
		newusercallHVACpage.clickContinueFromGenralInfo();
	}

	public void ClickOnAddTaskActionFromAction() throws InterruptedException {
		newusercallHVACpage.ClickOnAddTaskActionFromAction();
	}

	public void SelectAddTaskAndDueDateFromGeneralInfo() throws InterruptedException {
		newusercallHVACpage.SelectAddTaskAndDueDateFromGeneralInfo();
	}

	public void ClickSaveBtnGeneralInfo() {
		newusercallHVACpage.ClickSaveBtnGeneralInfo();
	}

	public void ClickOnAddNoteFromAction() throws InterruptedException {
		newusercallHVACpage.ClickOnAddNoteFromAction();
	}

	public void EnterNoteForAddNote() {
		newusercallHVACpage.EnterNoteForAddNote();
	}

	public void ClickSaveFromAddNote() throws InterruptedException {
		newusercallHVACpage.ClickSaveFromAddNote();
	}

	public void ClickCloseBtnFromAddNote() {
		newusercallHVACpage.ClickCloseBtnFromAddNote();
	}

	public void ClickCreateWorkorderFRomAction() throws InterruptedException {
		newusercallHVACpage.ClickCreateWorkorderFRomAction();
	}

	public void SelectServiceCategoryAndServices() throws InterruptedException {
		newusercallHVACpage.SelectServiceCategoryAndServices();
	}

	public void ClickOnAddBTN() throws InterruptedException {
		newusercallHVACpage.ClickOnAddBTN();
	}

	public void EnterServiceDate() throws InterruptedException {
		newusercallHVACpage.EnterServiceDate();
	}

	public void ClickDetailPageFRomAction() throws InterruptedException {
		newusercallHVACpage.ClickDetailPageFRomAction();
	}

	public void EnterNoteForDetailPage() throws InterruptedException {
		newusercallHVACpage.EnterNoteForDetailPage();

	}

	public void ClickSaveOnDetailPage() throws InterruptedException {
		newusercallHVACpage.ClickSaveOnDetailPage();
	}

	public void ClickOnCustomer() throws InterruptedException {
		newusercallHVACpage.ClickOnCustomer();
	}

	public void ClickOnAccountFromCustomer() throws InterruptedException {
		newusercallHVACpage.ClickOnAccountFromCustomer();
	}

	public void EnterCustomerInfo() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_HVAC.json", "CustomerInfo");
		newusercallHVACpage.EnterCustomerInfo(jsonData);
	}

	public void ClickOnAddAccount() throws InterruptedException {
		newusercallHVACpage.ClickOnAddAccount();

	}

	public void ClickSaveFromAddAccount() {
		newusercallHVACpage.ClickSaveFromAddAccountddAccount();
	}

	public void CLickAdvanceSearchFromAccount() throws InterruptedException {
		newusercallHVACpage.CLickAdvanceSearchFromAccount();

	}

	public void ClickAddOpportunityFromAction() {
		newusercallHVACpage.ClickAddOpportunityFromAction();
	}

	public void SelectTestDataForCustomerAddOpportunity() throws InterruptedException {
		newusercallHVACpage.EnterTestDataForOpportunity();
	}

	public void ClickViewIconFromAction() throws InterruptedException {
		newusercallHVACpage.ClickViewIconFromAction();

	}

	public void ClickOnPhoneSalesIconAndSelectgeneralInfo() throws InterruptedException {
		newusercallHVACpage.ClickOnPhoneSalesIconAndSelectgeneralInfo();
	}

	public void ClickOnCompanyFromCustomer() throws InterruptedException {
		newusercallHVACpage.ClickOnCompanyFromCustomer();
	}

	public void EnterTestDataForAddCompany() throws InterruptedException {
		newusercallHVACpage.EnterTestDataForAddCompany();
	}

	public void ClickOnAddOpportunityForCompany() throws InterruptedException {
		newusercallHVACpage.ClickOnAddOpportunityForCompany();
	}

	public void SelectAccountFromCompany() throws InterruptedException {
		newusercallHVACpage.SelectAccountFromCompany();
	}

	public void ClickContinueFromAddOpportunityForCompany() {
		newusercallHVACpage.ClickContinueFromAddOpportunityForCompany();
	}

	public void ClickOnViewFromActionForCompany() throws InterruptedException {
		newusercallHVACpage.ClickOnViewFromActionForCompany();
	}

	public void ClickOnDeleteFromActionForCompany() {
		newusercallHVACpage.ClickOnDeleteFromActionForCompany();
	}

	public void ConfirmTheDeleteAlert() {
		newusercallHVACpage.ConfirmTheDeleteAlert();

	}

	public void CancelTheDeleteAlert() {
		newusercallHVACpage.CancelTheDeleteAlert();

	}

	public void ClickContactFromCustomerDD() {
		newusercallHVACpage.ClickContactFromCustomerDD();
	}

	public void ClickOnAddContact() {
		newusercallHVACpage.ClickOnAddContact();
	}

	public void EnterTestDataForAddContact() {
		newusercallHVACpage.EnterTestDataForAddContact();
	}

	public void ClickCloseBtnFromAddContact() {
		newusercallHVACpage.ClickCloseBtnFromAddContact();
	}

	public void EnterTestDataOfAddOpportunityForContact() throws InterruptedException {
		newusercallHVACpage.EnterTestDataOfAddOpportunityForContact();
	}

	public void ClickonAddOpportunityForContact() throws InterruptedException {
		newusercallHVACpage.ClickonAddOpportunityForContact();

	}

	public void ClickonSaveButtonForAddOpportunityContact() {
		newusercallHVACpage.ClickonSaveButtonForAddOpportunityContact();

	}

	public void CLickOnViewContactFromAction() throws InterruptedException {
		newusercallHVACpage.CLickOnViewContactFromAction();
	}

	public void CLickOnDeleteContactFromAction() {
		newusercallHVACpage.CLickOnDeleteContactFromAction();
	}

	public void ConfirmDeleteForContact() {
		newusercallHVACpage.ConfirmDeleteForContact();
	}

	public void DeclineDeleteAlertForContact() {
		newusercallHVACpage.DeclineDeleteAlertForContact();
	}

	public void SelectopportunityFromCustomerDD() {
		newusercallHVACpage.SelectopportunityFromCustomerDD();
	}

	public void ClickNewACcountBtnInAddOpportunity() {
		newusercallHVACpage.ClickNewACcountBtnInAddOpportunity();
	}

	public void SelectLeadFromCustomerDD() throws InterruptedException {
		newusercallHVACpage.SelectLeadFromCustomerDD();
	}

	public void ClickAddLeadBtn() {
		newusercallHVACpage.ClickAddLeadBtn();
	}

	public void SelectOrEnterInfoForAddLead() {
		newusercallHVACpage.SelectOrEnterInfoForAddLead();
	}

	public void ClickSaveFromAddAccountddAccount() {
		newusercallHVACpage.ClickSaveFromAddAccountddAccount();
	}

	public void selectDatabaseFromCustomerDD() {
		newusercallHVACpage.selectDatabaseFromCustomerDD();
	}

	public void clickAddDatabaseEntryBtn() {
		newusercallHVACpage.clickAddDatabaseEntryBtn();
	}

	public void enterGeneralTestDataForAddDatabaseEntry() {
		newusercallHVACpage.enterGeneralTestDataForAddDatabaseEntry();
	}

	public void clickCloseForAlert() {
		newusercallHVACpage.clickCloseForAlert();		
	}

}

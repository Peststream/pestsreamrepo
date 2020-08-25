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

	public void ClickOnSaveBtn() throws Exception {
		newusercallHVACpage.ClickSaveBtn();

	}

	public void clickOnAdvanceSearchBTN() throws Exception {
		newusercallHVACpage.ClickAdvanceSearchBTN();

	}

	public void SelectCallInfo() throws Exception {
		newusercallHVACpage.SelectcallInfo();

	}

	public void ClickOnAddOpportunityFromAction() throws Exception {
		newusercallHVACpage.clickOnAddOpportunityFromAction();
	}

	public void SelectGeneralInfo() throws Exception {
		newusercallHVACpage.selectGeneralInfo();
	}

	public void ClickContinueFromGenralInfo() throws Exception {
		newusercallHVACpage.clickContinueFromGenralInfo();
	}

	public void ClickOnAddTaskActionFromAction() throws Exception {
		newusercallHVACpage.ClickOnAddTaskActionFromAction();
	}

	public void SelectAddTaskAndDueDateFromGeneralInfo() throws Exception {
		newusercallHVACpage.SelectAddTaskAndDueDateFromGeneralInfo();
	}

	public void ClickSaveBtnGeneralInfo() throws Exception {
		newusercallHVACpage.ClickSaveBtnGeneralInfo();
	}

	public void ClickOnAddNoteFromAction() throws Exception {
		newusercallHVACpage.ClickOnAddNoteFromAction();
	}

	public void EnterNoteForAddNote() throws Exception {
		newusercallHVACpage.EnterNoteForAddNote();
	}

	public void ClickSaveFromAddNote() throws Exception {
		newusercallHVACpage.ClickSaveFromAddNote();
	}

	public void ClickCloseBtnFromAddNote() throws Exception {
		newusercallHVACpage.ClickCloseBtnFromAddNote();
	}

	public void ClickCreateWorkorderFRomAction() throws Exception {
		newusercallHVACpage.ClickCreateWorkorderFRomAction();
	}

	public void SelectServiceCategoryAndServices() throws Exception {
		newusercallHVACpage.SelectServiceCategoryAndServices();
	}

	public void ClickOnAddBTN() throws Exception {
		newusercallHVACpage.ClickOnAddBTN();
	}

	public void EnterServiceDate() throws Exception {
		newusercallHVACpage.EnterServiceDate();
	}

	public void ClickDetailPageFRomAction() throws Exception {
		newusercallHVACpage.ClickDetailPageFRomAction();
	}

	public void EnterNoteForDetailPage() throws Exception {
		newusercallHVACpage.EnterNoteForDetailPage();

	}

	public void ClickSaveOnDetailPage() throws Exception {
		newusercallHVACpage.ClickSaveOnDetailPage();
	}

	public void ClickOnCustomer() throws Exception {
		newusercallHVACpage.ClickOnCustomer();
	}

	public void ClickOnAccountFromCustomer() throws Exception {
		newusercallHVACpage.ClickOnAccountFromCustomer();
	}

	public void EnterCustomerInfo() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_HVAC.json", "CustomerInfo");
		newusercallHVACpage.EnterCustomerInfo(jsonData);
	}

	public void ClickOnAddAccount() throws Exception {
		newusercallHVACpage.ClickOnAddAccount();

	}

	public void ClickSaveFromAddAccount() throws Exception {
		newusercallHVACpage.ClickSaveFromAddAccountddAccount();
	}

	public void CLickAdvanceSearchFromAccount() throws Exception {
		newusercallHVACpage.CLickAdvanceSearchFromAccount();

	}

	public void ClickAddOpportunityFromAction() throws Exception {
		newusercallHVACpage.ClickAddOpportunityFromAction();
	}

	public void SelectTestDataForCustomerAddOpportunity() throws Exception {
		newusercallHVACpage.EnterTestDataForOpportunity();
	}

	public void ClickViewIconFromAction() throws Exception {
		newusercallHVACpage.ClickViewIconFromAction();

	}

	public void ClickOnPhoneSalesIconAndSelectgeneralInfo() throws Exception {
		newusercallHVACpage.ClickOnPhoneSalesIconAndSelectgeneralInfo();
	}

	public void ClickOnCompanyFromCustomer() throws Exception {
		newusercallHVACpage.ClickOnCompanyFromCustomer();
	}

	public void EnterTestDataForAddCompany() throws Exception {
		newusercallHVACpage.EnterTestDataForAddCompany();
	}

	public void ClickOnAddOpportunityForCompany() throws Exception {
		newusercallHVACpage.ClickOnAddOpportunityForCompany();
	}

	public void SelectAccountFromCompany() throws Exception {
		newusercallHVACpage.SelectAccountFromCompany();
	}

	public void ClickContinueFromAddOpportunityForCompany() throws Exception {
		newusercallHVACpage.ClickContinueFromAddOpportunityForCompany();
	}

	public void ClickOnViewFromActionForCompany() throws Exception {
		newusercallHVACpage.ClickOnViewFromActionForCompany();
	}

	public void ClickOnDeleteFromActionForCompany() throws Exception {
		newusercallHVACpage.ClickOnDeleteFromActionForCompany();
	}

	public void ConfirmTheDeleteAlert() {
		newusercallHVACpage.ConfirmTheDeleteAlert();

	}

	public void CancelTheDeleteAlert() {
		newusercallHVACpage.CancelTheDeleteAlert();

	}

	public void ClickContactFromCustomerDD() throws Exception {
		newusercallHVACpage.ClickContactFromCustomerDD();
	}

	public void ClickOnAddContact() throws Exception {
		newusercallHVACpage.ClickOnAddContact();
	}

	public void EnterTestDataForAddContact() throws Exception {
		newusercallHVACpage.EnterTestDataForAddContact();
	}

	public void ClickCloseBtnFromAddContact() throws Exception {
		newusercallHVACpage.ClickCloseBtnFromAddContact();
	}

	public void EnterTestDataOfAddOpportunityForContact() throws Exception {
		newusercallHVACpage.EnterTestDataOfAddOpportunityForContact();
	}

	public void ClickonAddOpportunityForContact() throws Exception {
		newusercallHVACpage.ClickonAddOpportunityForContact();

	}

	public void ClickonSaveButtonForAddOpportunityContact() throws Exception {
		newusercallHVACpage.ClickonSaveButtonForAddOpportunityContact();

	}

	public void CLickOnViewContactFromAction() throws Exception {
		newusercallHVACpage.CLickOnViewContactFromAction();
	}

	public void CLickOnDeleteContactFromAction() throws Exception {
		newusercallHVACpage.CLickOnDeleteContactFromAction();
	}

	public void ConfirmDeleteForContact() {
		newusercallHVACpage.ConfirmDeleteForContact();
	}

	public void DeclineDeleteAlertForContact() throws Exception {
		newusercallHVACpage.DeclineDeleteAlertForContact();
	}

	public void SelectopportunityFromCustomerDD() throws Exception {
		newusercallHVACpage.SelectopportunityFromCustomerDD();
	}

	public void ClickNewACcountBtnInAddOpportunity() {
		newusercallHVACpage.ClickNewACcountBtnInAddOpportunity();
	}

	public void SelectLeadFromCustomerDD() throws Exception {
		newusercallHVACpage.SelectLeadFromCustomerDD();
	}

	public void ClickAddLeadBtn() throws Exception {
		newusercallHVACpage.ClickAddLeadBtn();
	}

	public void SelectOrEnterInfoForAddLead() throws Exception {
		newusercallHVACpage.SelectOrEnterInfoForAddLead();
	}

	public void ClickSaveFromAddAccountddAccount() throws Exception {
		newusercallHVACpage.ClickSaveFromAddAccountddAccount();
	}

	public void selectDatabaseFromCustomerDD() throws Exception {
		newusercallHVACpage.selectDatabaseFromCustomerDD();
	}

	public void clickAddDatabaseEntryBtn() throws Exception {
		newusercallHVACpage.clickAddDatabaseEntryBtn();
	}

	public void enterGeneralTestDataForAddDatabaseEntry() throws Exception {
		newusercallHVACpage.enterGeneralTestDataForAddDatabaseEntry();
	}

	public void clickCloseForAlert() {
		newusercallHVACpage.clickCloseForAlert();
	}

}

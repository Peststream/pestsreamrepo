package com.infocrats.steps;

import com.infocrats.pageObjects.newUserPCROPage;
import com.infocrats.utils.JsonHelper;

import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;

public class newUserPCROSteps extends pestreamSteps {

	private Map<String, String> jsonData;
	newUserPCROPage newuserpcropage;

	@Step
	public void clickOnCallTab() throws InterruptedException {
		Thread.sleep(3000);
		newuserpcropage.clickedOnCallTab();

	}

	@Step
	public void verifyCallPageTittle() {
		assertThat(newuserpcropage.getOpportunityPageTittle()).isEqualTo("General Info (Opportunity Info)");

	}

	@Step
	public void enterLeadInfo() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallData");
		newuserpcropage.enterLeadDetails(jsonData);

	}

	@Step
	public void selectBranch() {
		newuserpcropage.selectBranchDetils();
	}

	@Step
	public void enterAccountDescription() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallData");
		newuserpcropage.AccountDescription(jsonData);
	}

	@Step
	public void continueBtn() throws InterruptedException {

		newuserpcropage.clickedOnContinue();
	}

	@Step
	public void leadBtn() {
		newuserpcropage.leadCheckBtn();

	}

	@Step
	public void residentialBtn() {
		newuserpcropage.residentialCheckBtn();
		waitABit(1000);

	}

	@Step
	public void accountId() {

		newuserpcropage.account_Id();
	}

	@Step
	public void serviceAddress() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallData");
		newuserpcropage.service_Address(jsonData);
	}

	@Step
	public void checkTaxExapt() {

		newuserpcropage.checkExaptBtn();
	}

	@Step
	public void enterTaxExemtion() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallDataOfResidentialFlow");
		newuserpcropage.enterTaxExamp(jsonData);

	}

	@Step
	public void addressCheckBtn() {
		newuserpcropage.isBothAddressSame();

	}

	@Step
	public void enterBillingAddress() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallData");
		newuserpcropage.enterBilling_Address(jsonData);
	}

	@Step
	public void selectPackage() {
		newuserpcropage.selectPackageAs();

	}

	@Step
	public void packageDetails() {
		newuserpcropage.enterPackageDetails();

	}

	@Step
	public void clickOnAddButton() {
		newuserpcropage.clickOnAddBtn();

	}

	@Step
	public void clickOnSave() {

		newuserpcropage.clickOnSaveBtn();
	}

	@Step
	public void saveAndProposal() throws InterruptedException {
		newuserpcropage.saveAndProposal_Btn();

	}

	@Step
	public void enterProposalNote() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallDataOfResidentialFlow");
		newuserpcropage.enterProposalNotes(jsonData);
	}

	@Step
	public void sendProposalOnreview() {

		newuserpcropage.sendProposalOnReview();
	}

	@Step
	public void addMoreEmail() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallDataOfResidentialFlow");
		newuserpcropage.addMoreEmail(jsonData);
	}

	@Step
	public void addMoreMailBtn() {

		newuserpcropage.addMoreEmail_Btn();
	}

	@Step
	public void sendProposalBtn() {

		newuserpcropage.sendProposal_Btn();
	}

	@Step
	public void addToAgreementCheck_Btn() {
		newuserpcropage.addToAgreementBtn();
	}

	@Step
	public void signAgreementBtn() {
		newuserpcropage.saveAndSignAgreement_btn();

	}

	@Step
	public void enterNotes() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallDataOfResidentialFlow");
		newuserpcropage.enterAdditionalNote(jsonData);
	}

	@Step
	public void sendAgreementForSignature() {
		newuserpcropage.sendAgreementForSignature_btn();

	}

	@Step
	public void mailAddressCheck_Btn() {
		newuserpcropage.mailAddressCheckBtn();

	}

	@Step
	public void clickOnSendAgreement_Btn() {
		newuserpcropage.clickOnSendAgreementBtn();
	}

	@Step
	public void serviceBundleRadio_Btn() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallDataOfResidentialFlow");
		newuserpcropage.serviceBundleRadioBtn(jsonData);
	}

	@Step
	public void serviceBundle() {
		newuserpcropage.service_bundle();

	}

	@Step
	public void billingFrequency_DDL() {

		newuserpcropage.billingFrequencyDDL();
	}

	@Step
	public void chooseFromFrequency_DDL() {

		newuserpcropage.chooseFromFrequencyDDL();
	}

	@Step
	public void addBundle_Btn() {
		newuserpcropage.addBundleBtn();
	}

	@Step
	public void bundleCheckBtn() {
		newuserpcropage.bundleCheck_btn();

	}

	@Step
	public void nonStandardTab() {

		newuserpcropage.nonStandard_tab();
	}

	@Step
	public void departmentDDl() {

		newuserpcropage.department_DDL();
	}

	@Step
	public void departmentValue() {

		newuserpcropage.department_value();
	}

	@Step
	public void ServiceName() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallDataOfResidentialFlow");
		newuserpcropage.serviceName(jsonData);
	}

	@Step
	public void nonStandardBillingFreqDDL() {

		newuserpcropage.nonStandardBillingFreq_DDL();
	}

	@Step
	public void chooseBillingFrequencyValue() {

		newuserpcropage.chooseBillingFrequency_Value();
	}

	@Step
	public void nonStandardAddBtn() {

		newuserpcropage.nonStandardAdd_Btn();
	}

	@Step
	public void scheduleEstimationTab() {
		newuserpcropage.scheduleEstimationTab();

	}

	@Step
	public void saveInScheduleEstimation() {

		newuserpcropage.saveInSchedule_Estimation();
	}

	@Step
	public void getAssignedTOVaule() {
		newuserpcropage.getAssignedTo_value();
	}

	@Step
	public void fieldRadioBtn() {
		newuserpcropage.fieldRadio_btn();

	}

	@Step
	public void rangeTimeRadioBtn() {
		newuserpcropage.rangeTimeRadio_btn();

	}

	@Step
	public void getTimeRangeValue() {
		newuserpcropage.getTimeRange_Value();
	}

	@Step
	public void getSecondTimeRangeValue() {
		newuserpcropage.getSecondTimeRangeValue();

	}

	@Step
	public void markAsLostBtn() {

		newuserpcropage.markAsLost_btn();
	}

	@Step
	public void getReason() {
		newuserpcropage.get_Reason();
	}

	@Step
	public void saveInMarkAsLost() {
		newuserpcropage.saveInMarkAsLostBtn();
	}

	@Step
	public void reasonDescription() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallData");
		newuserpcropage.reason_Description(jsonData);
	}

	@Step
	public void saveContinueSetupBtn() {

		newuserpcropage.saveContinueSetup_btn();
	}

	@Step
	public void chooseServiceFromDDL() {

		newuserpcropage.chooseServiceFrom_DDL();
	}

	@Step
	public void addServiceBtn() {
		newuserpcropage.addService_btn();
	}

	@Step
	public void chooseFrequencyFromDDL() {

		newuserpcropage.chooseFrequencyFrom_DDL();
	}

	@Step
	public void chooseScheduleFromDDL() {

		newuserpcropage.chooseScheduleFrom_DDL();
	}

	@Step
	public void saveGenerateBtn() {

		newuserpcropage.saveGenerate_btn();
	}

	@Step
	public void choosePrimaryRoute() {
		newuserpcropage.choosePrimary_Route();

	}

	@Step
	public void startAndEndDate() {

		newuserpcropage.startAndEnd_Date();
	}

	@Step
	public void generateOnlineWO() {
		newuserpcropage.generateOnline_WO();

	}

	@Step
	public void checkAllWO() {
		newuserpcropage.checkAll_WO();

	}

	@Step
	public void publishOnline() {
		newuserpcropage.publishOnlineBtn();

	}

	@Step
	public void getServiceAppointment() {
		newuserpcropage.getServiceAppointment();

	}

	@Step
	public void actionBtn() {
		newuserpcropage.action_btn();

	}

	@Step
	public void currentTime() {

		newuserpcropage.current_time();
	}

	@Step
	public void saveAndContinueBtn() {

		newuserpcropage.saveAndContinue_btn();
	}

	@Step
	public void paymentMode() {

		newuserpcropage.payment_mode();
	}

	@Step
	public void enterAmount() {
		newuserpcropage.enter_amount();

	}

	@Step
	public void svContOnServiceDetails() {

		newuserpcropage.svContOnService_Details();
	}

	@Step
	public void takeSignature() {
		newuserpcropage.take_Signature();

	}

	@Step
	public void invoiceSubmitBtn() {
		newuserpcropage.invoiceSubmit_btn();

	}

	

	public void SaveforMoreSDetails() {
		newuserpcropage.savebtn();

	}

	public void OpenRequired() {
		newuserpcropage.openRequired();
	}

	public void MoreDetails() {
		newuserpcropage.moreDetails();
	}

	public void UrgencyScheduleDateOpportunityBtn() {
		newuserpcropage.urgencyScheduleDateOpportunity();
	}

	public void ContSalesProcess() {
		newuserpcropage.ContSalesProcess();

	}

	public void SaveAndSign() {
		newuserpcropage.saveSignA();

	}

	public void enterNotesClickSave() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallDataOfResidentialFlow");
		newuserpcropage.enterNotesSave(jsonData);
	}


	public void ServiceBundleChckBox() {
		newuserpcropage.ChckBoxServiceBundle();

	}



	public void OutLook_LogIn_Bttn() {
		newuserpcropage.OutLook_LogIn_Bttn();

	}

	public void ViewAction_CompanyCustomer() {
		 newuserpcropage.ViewAction_CompanyCustomer();
		
	}

	public void EnterNote_CompanyCustomer() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallDataOfResidentialFlow");
		newuserpcropage.EnterNote_CompanyCustomer(jsonData);
		
	}

	public void save_CompanyCustomer() {
		newuserpcropage.save_CompanyCustomer();
		
	}

	public void addToAgreement_ServiceBundleSelectPackagesOpportunity() {
		newuserpcropage.addToAgreement_ServiceBundleSelectPackagesOpportunity();
	}

}
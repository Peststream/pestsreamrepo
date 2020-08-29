package com.infocrats.steps;

import com.infocrats.pageObjects.newUserTermiteResidentialPage;

import net.thucydides.core.annotations.Step;

public class newUserTermiteResidentialSteps extends pestreamSteps {
	
	
	newUserTermiteResidentialPage newusertermiteresidentialpage;

	@Step
	public void clickOnCallTab() {
		newusertermiteresidentialpage.callTabBtn();
		
	}

	public void leadDetailsInfo() throws Exception {
		newusertermiteresidentialpage.enterLeadDetails();
		
	}

	public void branchDetails() throws Exception {
		newusertermiteresidentialpage.selectBranchDetils();
		
	}

	public void accAlertDescDetails() throws Exception {
		newusertermiteresidentialpage.accAlertDesc();
	}

	public void oppType() throws Exception {
		newusertermiteresidentialpage.oppTypeBtn();
		
	}

	public void continueBtn() throws Exception {
		newusertermiteresidentialpage.continueBtn();
	}

	public void createLeadBtn() throws Exception {
		newusertermiteresidentialpage.createLead();
		
	}

	public void addAddressContact() throws Exception {
		newusertermiteresidentialpage.addAdressZip();
		
	}

	public void PackageFreqBillDDL() throws Exception {
		newusertermiteresidentialpage.packageFreqBillDDLAddBtn();
		
	}

	public void PackageChckBoxAddBtn() throws Exception {
		newusertermiteresidentialpage.chckBoxBTN();
		
	}

	public void SaveSignAgreement() throws Exception {
		newusertermiteresidentialpage.saveSignAgree();
		
	}

	public void SaveContSetup() throws Exception {
		newusertermiteresidentialpage.ContSetup();
		
	}

	public void serviceDDLAddBtn() throws Exception {
		newusertermiteresidentialpage.serviceDDLADD();
		
	}

	public void freqDDLClicksOkSchedule() throws Exception {
		newusertermiteresidentialpage.freqokBtn();	
	}

	public void RouteSelectSaveAndGenerate() throws Exception {
		newusertermiteresidentialpage.routeSelectSaveAndGenerate();
		
	}

	public void StartDateGenerateOnlineWorkOrder() throws Exception {
		newusertermiteresidentialpage.StartDateEndDate();
		
	}

	public void generateWorkOrderPublishOnline() throws Exception {
		newusertermiteresidentialpage.GenerateOnlineWOSelectAllPublishOnline();
		
	}

	public void AppointmentTabServiceAppointment() throws Exception {
		newusertermiteresidentialpage.AppointmentTabServiceAppointment();
		
	}

	public void desiredAppointEnterCurTime() throws Exception {
		newusertermiteresidentialpage.desiredOppCurrentTime();
		
	}

	public void SaveContBtnConBtn() throws Exception {
		newusertermiteresidentialpage.SaveContBtnContBtn();
		
	}

	public void SignAGreementDateBtn() throws Exception {
		newusertermiteresidentialpage.SignAgreementDateBtn();
		
	}

	public void PaymentModeSaveAndCont() throws Exception {
		newusertermiteresidentialpage.PaymentModeSaveCont();
		
	}

	public void TechnicianCustomerSign() throws Exception {
		newusertermiteresidentialpage.TechnicianCustomerSignDate();
		
	}

	public void SubmitSendMail() throws Exception {
		newusertermiteresidentialpage.submitSendMail();
		
	}

	public void serviceBundleRadio() throws Exception {
		newusertermiteresidentialpage.serviceBundleRadio();
		
	}

	public void serviceBundleDDLBillingFreq() throws Exception {
		newusertermiteresidentialpage.serviceBundleDDLFreqBilling();
		
	}

	public void AddButtonBundle() throws Exception {
		newusertermiteresidentialpage.AddButtonBundle();
		
	}

	public void ChckboxBundle() throws Exception {
		newusertermiteresidentialpage.chckboxBundle();
		
	}

	public void serviceDDLBundleAddBtn() throws Exception {
		newusertermiteresidentialpage.serviceDDLbundleAddBtn();
		
	}

	public void generatePublish() throws Exception {
		newusertermiteresidentialpage.generatePublish();
		
	}

	public void advSearchCreateSetupDesiredOpportunity() throws Exception {
		newusertermiteresidentialpage.advcSearchCreateSetup();
		
	}

	public void SetupStartDate() throws Exception {
		newusertermiteresidentialpage.setupStartDate();
		
	}

	public void frerquencySchedule() throws Exception {
		newusertermiteresidentialpage.freqSchedule();
		
	}

	public void MarkAsLost() throws Exception {
		newusertermiteresidentialpage.MarkAsLost();
		
	}

	public void reasonDescSave() throws Exception {
		newusertermiteresidentialpage.DescSaveReason();
		
	}

	public void saveBtnOpportunity() throws Exception {
		newusertermiteresidentialpage.saveBtnOpp();
		
	}

	public void saveandProposal() throws Exception {
		newusertermiteresidentialpage.saveProposalBtn();
		
	}

	public void sendProposal() throws Exception {
		newusertermiteresidentialpage.sendProposal();
		
	}

	public void MarkAsLostsendProposal() throws Exception {
		newusertermiteresidentialpage.MarkAsLostSendProposal();
		
	}

	public void sendAgreementSendMail() throws Exception {
		newusertermiteresidentialpage.sendAgreementMailSend();
		
	}
	public void dashBoard() {
		newusertermiteresidentialpage.dashBoaRd();
		
	}

	public void Complete() throws Exception {
	
		newusertermiteresidentialpage.completeTab();
	}

	
	public void agreeChckBoxName() throws Exception {
		newusertermiteresidentialpage.agreeTermsChck();
		
	}

	@Step
	public void newChromeTab() throws Exception {
		newusertermiteresidentialpage.newChrome_tap();
		
	}

	@Step
	public void openGmail() throws Exception {
		newusertermiteresidentialpage.open_gmail();
		
	}

	@Step
	public void openMail() throws Exception {

		newusertermiteresidentialpage.open_mail();
	}

	@Step
	public void openAgreement() throws Exception {
		newusertermiteresidentialpage.open_agreement();
		
	}

	public void advanceSearch() throws Exception {
		newusertermiteresidentialpage.advanceSearch();
		
	}

	public void customerOpportunity() throws Exception {
		newusertermiteresidentialpage.customerOpportunity();
		
	}

	public void NonStdServices() throws Exception {
		newusertermiteresidentialpage.NonStdService();
		
	}

	public void deptServiceName() throws Exception {
		newusertermiteresidentialpage.deptServiceNames();
	}

	public void addButton() throws Exception {
		newusertermiteresidentialpage.addButtonclick();
		
	}

	public void selectServicePrice() throws Exception {
		newusertermiteresidentialpage.chckboxServicePrice();
		
	}

	public void nonStdserviceAdd() throws Exception {
		newusertermiteresidentialpage.NonStdServiceAddbtn();
		
	}

	public void serviceStartDate() throws Exception {
		newusertermiteresidentialpage.serviceStartDate();
		
	}

	public void RoutegeneratePublishBtn() throws Exception {
		newusertermiteresidentialpage.RouteGenerateBtn();
		
	}

	public void savecontToNext() throws Exception {
		newusertermiteresidentialpage.saveContNext();
		
	}

	public void saveContAgainn() throws Exception {
		newusertermiteresidentialpage.saveContinue();
	}

	public void PaymethodSaveCont() throws Exception {
		newusertermiteresidentialpage.paymentConyinue();
	}

	public void customerTechnicianSign() throws Exception {
		newusertermiteresidentialpage.signCustomerTechnician();
		
	}

	public void submitSendMail() throws Exception {
		newusertermiteresidentialpage.submitSendMailbtn();
		
	}

	public void ScheduleEstimation() throws Exception {
		newusertermiteresidentialpage.ScheduleEstimation();
		
	}

	public void AssignedToEmp() throws Exception {
		newusertermiteresidentialpage.AssignedToEmp();
		
	}

	public void saveBtnScheduleEst() throws Exception {
	newusertermiteresidentialpage.svaeBtnScheduleEst();
		
	}

	public void saveAndContBtn() throws Exception {
		newusertermiteresidentialpage.saveContBtn();
		
	}

	public void AddingdesiredService() throws Exception {
		newusertermiteresidentialpage.addingDesiredCountry();
		
	}

	public void selectTheServiceSaveViewAgreement() throws Exception {
		newusertermiteresidentialpage.SelectServiceViewAgreement();
		
	}

	public void saveContinue() throws Exception {
		newusertermiteresidentialpage.saveContBtnx2();
		
	}

	public void agreeTermsNameSign() throws Exception {
		newusertermiteresidentialpage.agreeTermsNameSign();
	}

	public void ContSaveBtnx() throws Exception {
		newusertermiteresidentialpage.saveContBtnX();
		
	}

	public void sendMailBtn() throws Exception {
			newusertermiteresidentialpage.sendMailBtn();
		
	}

	public void desiredOpp() throws Exception {
		newusertermiteresidentialpage.desiredOPP();
		
	}

	public void saveProposal() throws Exception {
		newusertermiteresidentialpage.savePropp();
		
	}

	public void sendpsll() throws Exception {
		newusertermiteresidentialpage.sebdProposall();
	}

	public void sendMailProposal() throws Exception {
		newusertermiteresidentialpage.sendProposal();
		
	}

	public void sendProposalMail() throws Exception {
		newusertermiteresidentialpage.senProposalMail();
	}

	public void markAsLostBtn() throws Exception {
		newusertermiteresidentialpage.markAsLostButton();
		
	}

	public void rangeTimeTimeRange() throws Exception {
		newusertermiteresidentialpage.rangeTimeTimeRange();
		
	}

	public void FieldradioBtn() {
		newusertermiteresidentialpage.fieldRadioButton();
		
	}

	public void markedAsLostbtnSE() {
		newusertermiteresidentialpage.markAsLostSE();
		
	}
}
package com.infocrats.steps;

import com.infocrats.pageObjects.newUserHvacPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class newUserHvacSteps extends pestreamSteps {

	newUserHvacPage newuserhvacpage;

	@Step
	public void clickOnCallTab() throws InterruptedException {
		Thread.sleep(3000);
		newuserhvacpage.clickedOnCallTab();
	}

	public void verifyCallPageTittle() {
		assertThat(newuserhvacpage.getOpportunityPageTittle()).isEqualTo("General Info (Opportunity Info)");

	}

	public void enterLeadInfo() throws Exception {
		newuserhvacpage.enterLeadDetails();

	}

	public void selectBranch() throws Exception {
		newuserhvacpage.selectBranchDetils();

	}

	public void alertDesc() throws Exception {
		newuserhvacpage.alertDesc();

	}

	public void ContinueBtn() throws Exception {
		newuserhvacpage.continueClick();

	}

	public void scheduleEstimation() throws Exception {
		newuserhvacpage.ScheduleEstimationBtnRadio();

	}

	public void OppType() throws Exception {
		newuserhvacpage.opportunityType();

	}

	public void addressLine() throws Exception {
		newuserhvacpage.addresslineDetails();
	}

	public void assignedTo() throws Exception {
		newuserhvacpage.assignedToPerson();

	}

	public void SaveBtn() throws Exception {
		newuserhvacpage.SaveClick();

	}

	public void reqAppointment() throws Exception {
		newuserhvacpage.reqAppointment();

	}

	public void SaveAndContSave() throws Exception {
		newuserhvacpage.saveContBtnSaveBtn();

	}

	public void NonStdRadioRepairName() throws Exception{
		newuserhvacpage.RadioRepairName();

	}

	public void CostSaveBtn() throws Exception{
		newuserhvacpage.CostSaveBtn();

	}

	public void saveContBtnTWICE()throws Exception {
		newuserhvacpage.ContSaveTwice();

	}

	public void agreeChckBoxName() throws Exception{
		newuserhvacpage.agreeChckBox();
	}

	public void sign() throws Exception{
		newuserhvacpage.signAgree();

	}

	public void saveContBtn() throws Exception{
		newuserhvacpage.saveContBtn();
	}

	public void sendMail() throws Exception{
		newuserhvacpage.sendMailBtn();
	}

	public void rangeTimeRadioDesiredRange() throws Exception{
		newuserhvacpage.rangeTimrDesiredRange();

	}

	public void fieldRadioButton()throws Exception {
		newuserhvacpage.fieldRadioButton();

	}

	public void flatRateRadioButton() throws Exception{
		newuserhvacpage.flatRateRadio();

	}

	public void jobDescAddButton() throws Exception{
		newuserhvacpage.jobDescriptionAddButton();

	}

	public void primaryRoute() throws Exception{
		newuserhvacpage.primaryRoute();

	}

	public void saveButton()throws Exception {
		newuserhvacpage.saveButton();

	}

	public void advanceSearchWorkOrderDesiredOpportunity() throws Exception{
		newuserhvacpage.advanceSearchDesiredOpportunity();

	}

	public void saveBtnHVACSSC() throws Exception{
		newuserhvacpage.savBtnHVACssc();
	}

	public void serviceAppointment() throws Exception{
		newuserhvacpage.serviceAppointment();
	}

	public void desiredOpportunityServiceAppointment() throws Exception{
		newuserhvacpage.desiredOpportunityServiceAppointment();

	}

	public void Recieve_OnMyWay_Arrived_StartRepair() throws Exception{
		newuserhvacpage.recievedOnmyWayArrivedStartRepair();

	}

	public void completeSubOrder() throws Exception{
		newuserhvacpage.completeSubOrder();

	}

	public void paymentMode() throws Exception{
		newuserhvacpage.paymentMode();

	}

	public void customerTechnicianSign() throws Exception{
		newuserhvacpage.customerTechnicianSign();

	}

	public void completeWorkOrder() throws Exception{
		newuserhvacpage.completeWorkOrder();

	}

	public void addressZip()throws Exception {
		newuserhvacpage.adressZip();

	}

	public void afterHourRadio() throws Exception{
		newuserhvacpage.afterHour();

	}

	public void HelperRadioBtn() throws Exception{
		newuserhvacpage.helperRadio();

	}

	public void TimeMaterial() throws Exception{
		newuserhvacpage.TimeMaterialRadio();

	}

}

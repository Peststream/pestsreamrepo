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

	public void enterLeadInfo() {
		newuserhvacpage.enterLeadDetails();
		
	}

	public void selectBranch() {
		newuserhvacpage.selectBranchDetils();
		
	}

	public void alertDesc() {
		newuserhvacpage.alertDesc();
		
	}

	

	public void ContinueBtn() {
		newuserhvacpage.continueClick();
		
	}

	public void scheduleEstimation() {
		newuserhvacpage.ScheduleEstimationBtnRadio();
		
	}

	public void OppType() {
		newuserhvacpage.opportunityType();
		
	}

	public void addressLine() {
		newuserhvacpage.addresslineDetails();
	}

	public void assignedTo() {
		newuserhvacpage.assignedToPerson();
		
	}

	public void SaveBtn() {
		newuserhvacpage.SaveClick();
		
	}

	public void reqAppointment() {
		newuserhvacpage.reqAppointment();
		
	}

	public void SaveAndContSave() {
		newuserhvacpage.saveContBtnSaveBtn();
		
	}

	public void NonStdRadioRepairName() {
		newuserhvacpage.RadioRepairName();
		
	}

	public void CostSaveBtn() {
		newuserhvacpage.CostSaveBtn();
		
	}

	public void saveContBtnTWICE() {
		newuserhvacpage.ContSaveTwice();
		
	}

	public void agreeChckBoxName() {
		newuserhvacpage.agreeChckBox();
	}

	public void sign() {
		newuserhvacpage.signAgree();
		
	}

	public void saveContBtn() {
		newuserhvacpage.saveContBtn();
	}

	public void sendMail() {
		newuserhvacpage.sendMailBtn();
	}

	public void rangeTimeRadioDesiredRange() {
		newuserhvacpage.rangeTimrDesiredRange();
		
	}

	public void fieldRadioButton() {
		newuserhvacpage.fieldRadioButton();
		
	}

	public void flatRateRadioButton() {
		newuserhvacpage.flatRateRadio();
		
	}

	public void jobDescAddButton() {
		newuserhvacpage.jobDescriptionAddButton();
		
	}

	public void primaryRoute() {
		newuserhvacpage.primaryRoute();
		
	}

	public void saveButton() {
		newuserhvacpage.saveButton();
		
	}

	public void advanceSearchWorkOrderDesiredOpportunity() {
		newuserhvacpage.advanceSearchDesiredOpportunity();
		
	}

	public void saveBtnHVACSSC() {
		newuserhvacpage.savBtnHVACssc();
	}

	public void serviceAppointment() {
		newuserhvacpage.serviceAppointment();
	}

	public void desiredOpportunityServiceAppointment() {
		newuserhvacpage.desiredOpportunityServiceAppointment();
		
	}

	public void Recieve_OnMyWay_Arrived_StartRepair() {
		newuserhvacpage.recievedOnmyWayArrivedStartRepair();
		
	}

	public void completeSubOrder() {
		newuserhvacpage.completeSubOrder();
		
	}

	public void paymentMode() {
		newuserhvacpage.paymentMode();
		
	}

	public void customerTechnicianSign() {
		newuserhvacpage.customerTechnicianSign();
		
	}

	public void completeWorkOrder() {
		newuserhvacpage.completeWorkOrder();
		
	}

	public void addressZip() {
		newuserhvacpage.adressZip();
		
	}

	public void afterHourRadio() {
		newuserhvacpage.afterHour();
		
	}

	public void HelperRadioBtn() {
		newuserhvacpage.helperRadio();
		
	}

	public void TimeMaterial() {
		newuserhvacpage.TimeMaterialRadio();
		
	}

}
	
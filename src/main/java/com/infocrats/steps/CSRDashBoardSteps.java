package com.infocrats.steps;

import java.util.Map;

import com.infocrats.pageObjects.CSRDashBoardPage;
import com.infocrats.utils.JsonHelper;
public class CSRDashBoardSteps extends pestreamSteps {
	
	private Map<String, String> jsonData;
	
	CSRDashBoardPage csrDashBoardpage;

	public void csrDashboardClick() {
		csrDashBoardpage.dashboardClick();
		
	}

	public void advanceButton() {
		csrDashBoardpage.advanceSearchbtn();
		
	}

	public void CallBtnAction() {
		csrDashBoardpage.callAction();
		
	}

	public void CalledSourceTarget() {
		csrDashBoardpage.CalledSourceTarget();
		
	}

	public void descNotes() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CSRDashBoard");
		csrDashBoardpage.descNotes(jsonData);
		
	}

	public void SaveBtn() {
		csrDashBoardpage.saveBtn();
		
	}

	public void newTaskactionbtn() {
		csrDashBoardpage.newTaskAxn();
		
	}

	public void taskTemplate() {
		csrDashBoardpage.tasktemplate();
		
	}

	public void dueDadte() {
		csrDashBoardpage.dueDate();
		
	}

	public void logBtnTypeDDL() {
		csrDashBoardpage.lobBtnDDL();
		
	}

	public void markAsDone() {
		csrDashBoardpage.markasDone();
		
	}

	public void followUpCreate() {
		csrDashBoardpage.followUpCreate();
		
	}

	public void recurringChckBox() {
		csrDashBoardpage.recuringChckBox();
		
	}

	public void recuringDDL() {
		csrDashBoardpage.recurringDDL();
		
	}

	public void addOpportunity() {
		csrDashBoardpage.addOportunity();
		
	}

	public void serviceSource() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CallData");
		csrDashBoardpage.serviceSource(jsonData);
		
	}

	public void OpportunityType() {
		csrDashBoardpage.OpportunityType();
		
	}

	public void Continue() {
		csrDashBoardpage.Continue();
		
	}

	public void noteButtonAxn() {
		csrDashBoardpage.noteBtnAxn();
		
	}

	public void adddingNote() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CSRDashBoard");
		csrDashBoardpage.addingNote(jsonData);
		
	}

	public void SavingNote() {
		csrDashBoardpage.savingNote();
		
	}

	public void WorkOrderBtn() {
		csrDashBoardpage.WorkOrderBtn();
		
	}

	public void ServiceCategorySubService() {
		csrDashBoardpage.ServiceCategorySubService();
	}

	public void addServiceBtn() {
		csrDashBoardpage.addServiceBtn();
		
	}

	public void serviceDate() {
		csrDashBoardpage.ServiceDate();
		
	}

	public void SavingWorkOrder() {
		csrDashBoardpage.SavingWorkOrder();
		
	}

	public void ViewDetailsActionTab() {
		csrDashBoardpage.ViewDetailBtn();
		
	}

	public void addOpportunityinDetails() {
		csrDashBoardpage.addOpportunityBtnDetails();
		
	}

	public void callButtonViewDetails() {
		csrDashBoardpage.callButtonViewDetails();
		
	}

	public void calledSourceTarget() {
		csrDashBoardpage.calledSourceTarget();
		
	}

	public void savebtnDetails() {
		csrDashBoardpage.savebtnDetail();
		
	}

	public void workOrderDetails() {
		csrDashBoardpage.detailsWorKOrder();
			
	}

	public void ComOpportunity() {
		csrDashBoardpage.ComOpportunity();
		
	}

	public void RangeTime() {
		csrDashBoardpage.RangeTime();
		
	}

	public void DDleadTech() {
		csrDashBoardpage.DDleadTech();
		
	}

	public void alertmessageCSRDashboard() {
		csrDashBoardpage.alertmessageCSRDashboard();
	}

	public void DDSourceAccountOpportunity() {
		csrDashBoardpage.DDSourceAccountOpportunity();
		
	}

	public void DDServiceCategoryWO() {
		csrDashBoardpage.DDServiceCategoryWO();
		
	}

	public void DDServicesWO() {
		csrDashBoardpage.DDServicesWO();
		
	}




}
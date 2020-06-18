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

	public void logBtnTypeDDL() throws Exception {
		
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

	public void TaskName_CSRDashboard() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CSRDashBoard");
		csrDashBoardpage.TaskName_CSRDashboard(jsonData);
		
	}

	public void DueDate_CSRDashboard() {
       csrDashBoardpage.DueDate_CSRDashboard();
   
	}

	public void Save_CSRDashboard() throws Exception {
		csrDashBoardpage.Save_CSRDashboard();
		
	}

	public void Activity_CSRDashboard() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CSRDashBoard");
		csrDashBoardpage.Activity_CSRDashboard(jsonData);
		
	}

	public void billingAddSame_WOCSRDashboard() {
		csrDashBoardpage.billingAddSame_WOCSRDashboard();
		
	}

	public void AddLine() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "OpportunityAddress");
		csrDashBoardpage.AddLine(jsonData);
		
	}

	public void zip_WOCSRDashboard() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "OpportunityAddress");
		csrDashBoardpage.zip_WOCSRDashboard(jsonData);
		
	}

	/*public void State_WOCSRDashboard() {
		csrDashBoardpage.State_WOCSRDashboard();
		
	}*/

	public void save_WOCSRDashboard() {
		csrDashBoardpage.save_WOCSRDashboard();
		
	}




}
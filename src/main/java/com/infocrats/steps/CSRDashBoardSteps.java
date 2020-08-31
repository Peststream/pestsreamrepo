package com.infocrats.steps;

import java.util.Map;

import com.infocrats.pageObjects.CSRDashBoardPage;
import com.infocrats.utils.JsonHelper;
public class CSRDashBoardSteps extends pestreamSteps {
	
	private Map<String, String> jsonData;
	
	CSRDashBoardPage csrDashBoardpage;

	public void csrDashboardClick() throws Exception {
		csrDashBoardpage.dashboardClick();
		
	}

	public void advanceButton() throws Exception {
		csrDashBoardpage.advanceSearchbtn();
		
	}

	public void CallBtnAction() throws Exception {
		csrDashBoardpage.callAction();
		
	}

	public void CalledSourceTarget() throws Exception {
		csrDashBoardpage.CalledSourceTarget();
		
	}

	public void descNotes() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CSRDashBoard");
		csrDashBoardpage.descNotes(jsonData);
		
	}

	public void SaveBtn() throws Exception {
		csrDashBoardpage.saveBtn();
		
	}

	public void newTaskactionbtn() throws Exception {
		csrDashBoardpage.newTaskAxn();
		
	}

	public void taskTemplate() throws Exception {
		csrDashBoardpage.tasktemplate();
		
	}

	public void dueDadte() throws Exception {
		csrDashBoardpage.dueDate();
		
	}

	public void logBtnTypeDDL() throws Exception {
		
		csrDashBoardpage.lobBtnDDL();
		
	}

	public void markAsDone() throws Exception {
		csrDashBoardpage.markasDone();
		
	}

	public void followUpCreate() throws Exception {
		csrDashBoardpage.followUpCreate();
		
	}

	public void recurringChckBox() throws Exception {
		csrDashBoardpage.recuringChckBox();
		
	}

	public void recuringDDL() throws Exception {
		csrDashBoardpage.recurringDDL();
		
	}

	public void addOpportunity() throws Exception {
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

	public void noteButtonAxn() throws Exception {
		csrDashBoardpage.noteBtnAxn();
		
	}

	public void adddingNote() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CSRDashBoard");
		csrDashBoardpage.addingNote(jsonData);
		
	}

	public void SavingNote() {
		csrDashBoardpage.savingNote();
		
	}

	public void WorkOrderBtn() throws Exception {
		csrDashBoardpage.WorkOrderBtn();
		
	}

	public void ServiceCategorySubService() throws Exception {
		csrDashBoardpage.ServiceCategorySubService();
	}

	public void addServiceBtn() throws Exception {
		csrDashBoardpage.addServiceBtn();
		
	}

	public void serviceDate() throws Exception {
		csrDashBoardpage.ServiceDate();
		
	}

	public void SavingWorkOrder() {
		csrDashBoardpage.SavingWorkOrder();
		
	}

	public void ViewDetailsActionTab() throws Exception {
		csrDashBoardpage.ViewDetailBtn();
		
	}

	public void addOpportunityinDetails() {
		csrDashBoardpage.addOpportunityBtnDetails();
		
	}

	public void callButtonViewDetails() {
		csrDashBoardpage.callButtonViewDetails();
		
	}

	public void calledSourceTarget() throws Exception {
		csrDashBoardpage.calledSourceTarget();
		
	}

	public void savebtnDetails() {
		csrDashBoardpage.savebtnDetail();
		
	}

	public void workOrderDetails() throws Exception {
		csrDashBoardpage.detailsWorKOrder();
			
	}

	public void ComOpportunity() throws Exception {
		csrDashBoardpage.ComOpportunity();
		
	}

	public void RangeTime() throws Exception {
		csrDashBoardpage.RangeTime();
		
	}

	public void DDleadTech() throws Exception {
		csrDashBoardpage.DDleadTech();
		
	}

	public void alertmessageCSRDashboard() {
		csrDashBoardpage.alertmessageCSRDashboard();
	}

	public void DDSourceAccountOpportunity() throws Exception {
		csrDashBoardpage.DDSourceAccountOpportunity();
		
	}

	public void DDServiceCategoryWO() throws Exception {
		csrDashBoardpage.DDServiceCategoryWO();
		
	}

	public void DDServicesWO() throws Exception {
		csrDashBoardpage.DDServicesWO();
		
	}

	public void TaskName_CSRDashboard() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CSRDashBoard");
		csrDashBoardpage.TaskName_CSRDashboard(jsonData);
		
	}

	public void DueDate_CSRDashboard() throws Exception {
       csrDashBoardpage.DueDate_CSRDashboard();
   
	}

	public void Save_CSRDashboard() throws Exception {
		csrDashBoardpage.Save_CSRDashboard();
		
	}

	public void Activity_CSRDashboard() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "CSRDashBoard");
		csrDashBoardpage.Activity_CSRDashboard(jsonData);
		
	}

	public void billingAddSame_WOCSRDashboard() throws Exception {
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

	public void save_WOCSRDashboard() throws Exception {
		csrDashBoardpage.save_WOCSRDashboard();
		
	}




}
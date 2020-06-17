package com.infocrats.stepdefs;

import com.infocrats.steps.CSRDashBoardSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CSRDashBoardStepDefs {

	@Steps
	CSRDashBoardSteps csrDashBoardssteps;

	@When("^User clicks on the CsrDashboard from the left tab$")
	public void user_clicks_on_the_CsrDashboard_from_the_left_tab() {
		csrDashBoardssteps.csrDashboardClick();
	}

	@Then("^User Clicks on Advvance Search Tab in CSR$")
	public void ClicksOnAdvanceSearch() {
		csrDashBoardssteps.advanceButton();
	}

	@Then("^User clicks on Call Button in the Action Section$")
	public void user_clicks_on_Call_Button_in_the_Action_Section() {
		csrDashBoardssteps.CallBtnAction();
	}

	@Then("^User enters CalledFor Source and Target DDL$")
	public void user_enters_CalledFor_Source_and_Target_DDL() {
		csrDashBoardssteps.CalledSourceTarget();
	}

	@Then("^User adds Description and Notes$")
	public void user_adds_Description_and_Notes() throws Exception {
		csrDashBoardssteps.descNotes();
	}

	@Then("^User Clicks on Save Button$")
	public void user_Clicks_on_Save_Button() {
		csrDashBoardssteps.SaveBtn();
	}

	@Then("^User clicks on new Task button in thr Action Section$")
	public void user_clicks_on_new_Task_button_in_thr_Action_Section() {
		csrDashBoardssteps.newTaskactionbtn();
	}

	@Then("^User Selects the task Template from the DDL$")
	public void user_Selects_the_task_Template_from_the_DDL() {
		csrDashBoardssteps.taskTemplate();
	}

	@Then("^User Selects Due Date from Calender$")
	public void user_Selects_Due_Date_from_Calender() {
		csrDashBoardssteps.dueDadte();
	}

	@Then("^User Checks the Log as Activity and Selects the activity Type log DDL$")
	public void UserChecksTheLogButton() throws Exception  {
		csrDashBoardssteps.logBtnTypeDDL();
	}

	@Then("^User Checks the Mark As Done$")
	public void UserChecksMarkAsDone() {
		csrDashBoardssteps.markAsDone();
	}

	@Then("^User Checks on Create Follow Up$")
	public void UserCheckCreateFollowUp() {
		csrDashBoardssteps.followUpCreate();
	}

	@Then("^User Clicks on Recurring$")
	public void UserClicksonRecurring() {
		csrDashBoardssteps.recurringChckBox();
	}

	@Then("^User selects the recurrence pattern$")
	public void recurringPattern() {
		csrDashBoardssteps.recuringDDL();
	}

	@Then("^User clicks on add Opportunity Button in Action Tab$")
	public void user_clicks_on_add_Opportunity_Button_in_Action_Tab() {
		csrDashBoardssteps.addOpportunity();
	}

	@Then("^User selects Service and Source$")
	public void user_selects_Service_and_Source() throws Exception {
		csrDashBoardssteps.serviceSource();
	}

	@Then("^User selects Opportunity Type$")
	public void user_selects_Opportunity_Type() {
		csrDashBoardssteps.OpportunityType();
	}

	@Then("^User clicks on Continue$")
	public void user_clicks_on_Continue() {
		csrDashBoardssteps.Continue();
	}

	@Then("^User clicks on add Notes Button in Action Tab$")
	public void user_clicks_on_add_Notes_Button_in_Action_Tab() {
		csrDashBoardssteps.noteButtonAxn();
	}

	@Then("^User add note$")
	public void user_add_note() throws Exception {
		csrDashBoardssteps.adddingNote();
	}

	@Then("^User Saves the note$")
	public void user_Saves_the_note() {
		csrDashBoardssteps.SavingNote();
	}

	@Then("^User Clicks on WorkOrder Button$")
	public void clickonWorkOrderBtn() {
		csrDashBoardssteps.WorkOrderBtn();
	}

	@Then("user Selects the Service category Services and Sub Service$")
	public void serviceCategoryandSubCategory() {
		csrDashBoardssteps.ServiceCategorySubService();
	}

	@Then("^User add the Service$")
	public void AddBtnServiceCategory() {
		csrDashBoardssteps.addServiceBtn();
	}

	@Then("^User Selects the Service date$")
	public void ServiceDate() {
		csrDashBoardssteps.serviceDate();
	}

	@Then("^User Save the WorkOrder$")
	public void SavingTheWorkOrder() {
		csrDashBoardssteps.SavingWorkOrder();
	}

	@Then("^User Clicks on the View Details from action tab$")
	public void UserClicksonActionTabViewDetails() {
		csrDashBoardssteps.ViewDetailsActionTab();
	}

	@Then("^User clicks on add opportunity$")
	public void clicksonAddOpportunity() {
		csrDashBoardssteps.addOpportunityinDetails();
	}

	@Then("^User clicks on the call button in view details$")
	public void newCallButtonViewDetails() {
		csrDashBoardssteps.callButtonViewDetails();
	}

	@Then("^User enters CalledFor Source and Target DDL again$")
	public void calledForSourceTarget() {
		csrDashBoardssteps.calledSourceTarget();
	}

	@Then("^User saves New Call for Details$")
	public void saveMoreDetails() {
		csrDashBoardssteps.savebtnDetails();
	}

	@Then("^User Clicks on Add Work Order$")
	public void clicksOnWorkOrderinDetails() {
		csrDashBoardssteps.workOrderDetails();
	}

	@Then("^User selects ComOpportunity Type$")
	public void user_selects_ComOpportunity_Type() {
		csrDashBoardssteps.ComOpportunity();
	}

	@Then("^User clicks on the RangeTime$")
	public void user_clicks_on_the_RangeTime() {
		csrDashBoardssteps.RangeTime();
	}

	@Then("^User clicks on the DDleadTech$")
	public void user_clicks_on_the_DDleadTech() {
		csrDashBoardssteps.DDleadTech();
	}

	@Then("^user click on alertmessageCSRDashboard$")
	public void user_click_on_alertmessageCSRDashboard() {
		csrDashBoardssteps.alertmessageCSRDashboard();
	}

	@Then("^user click on DDSourceAccountOpportunit$")
	public void user_click_on_DDSourceAccountOpportunit() {
		csrDashBoardssteps.DDSourceAccountOpportunity();
	}
	
	@Then("^user click on DDServiceCategoryWO$")
	public void user_click_on_DDServiceCategoryWO() {
		csrDashBoardssteps.DDServiceCategoryWO();
	}

	@Then("^user click on DDServicesWO$")
	public void user_click_on_DDServicesWO() {
		csrDashBoardssteps.DDServicesWO();
	}
	
	@Then("^user click on TaskName_CSRDashboard$")
	public void user_click_on_TaskName_CSRDashboard() throws Exception {
		csrDashBoardssteps.TaskName_CSRDashboard();
	}

	@Then("^user click on DueDate_CSRDashboard$")
	public void user_click_on_DueDate_CSRDashboard() {
		csrDashBoardssteps.DueDate_CSRDashboard();
	}

	@Then("^user click on Save_CSRDashboard$")
	public void user_click_on_Save_CSRDashboard() throws Exception {
		csrDashBoardssteps.Save_CSRDashboard();
	}
	
	@Then("^user click on Activity_CSRDashboard$")
	public void user_click_on_Activity_CSRDashboard() throws Exception {
		csrDashBoardssteps.Activity_CSRDashboard();
	}




}
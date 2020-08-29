package com.infocrats.stepdefs;

import com.infocrats.steps.CSRDashBoardSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CSRDashBoardStepDefs {

	@Steps
	CSRDashBoardSteps csrDashBoardssteps;

	@When("^User clicks on the CsrDashboard from the left tab$")
	public void user_clicks_on_the_CsrDashboard_from_the_left_tab() throws Exception {
		csrDashBoardssteps.csrDashboardClick();
	}

	@Then("^User Clicks on Advvance Search Tab in CSR$")
	public void ClicksOnAdvanceSearch() throws Exception {
		csrDashBoardssteps.advanceButton();
	}

	@Then("^User clicks on Call Button in the Action Section$")
	public void user_clicks_on_Call_Button_in_the_Action_Section() throws Exception {
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
	public void user_Clicks_on_Save_Button() throws Exception {
		csrDashBoardssteps.SaveBtn();
	}

	@Then("^User clicks on new Task button in thr Action Section$")
	public void user_clicks_on_new_Task_button_in_thr_Action_Section() throws Exception {
		csrDashBoardssteps.newTaskactionbtn();
	}

	@Then("^User Selects the task Template from the DDL$")
	public void user_Selects_the_task_Template_from_the_DDL() throws Exception {
		csrDashBoardssteps.taskTemplate();
	}

	@Then("^User Selects Due Date from Calender$")
	public void user_Selects_Due_Date_from_Calender() throws Exception {
		csrDashBoardssteps.dueDadte();
	}

	@Then("^User Checks the Log as Activity and Selects the activity Type log DDL$")
	public void UserChecksTheLogButton() throws Exception  {
		csrDashBoardssteps.logBtnTypeDDL();
	}

	@Then("^User Checks the Mark As Done$")
	public void UserChecksMarkAsDone() throws Exception {
		csrDashBoardssteps.markAsDone();
	}

	@Then("^User Checks on Create Follow Up$")
	public void UserCheckCreateFollowUp() throws Exception {
		csrDashBoardssteps.followUpCreate();
	}

	@Then("^User Clicks on Recurring$")
	public void UserClicksonRecurring() throws Exception {
		csrDashBoardssteps.recurringChckBox();
	}

	@Then("^User selects the recurrence pattern$")
	public void recurringPattern() throws Exception {
		csrDashBoardssteps.recuringDDL();
	}

	@Then("^User clicks on add Opportunity Button in Action Tab$")
	public void user_clicks_on_add_Opportunity_Button_in_Action_Tab() throws Exception {
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
	public void user_clicks_on_add_Notes_Button_in_Action_Tab() throws Exception {
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
	public void clickonWorkOrderBtn() throws Exception {
		csrDashBoardssteps.WorkOrderBtn();
	}

	@Then("user Selects the Service category Services and Sub Service$")
	public void serviceCategoryandSubCategory() throws Exception {
		csrDashBoardssteps.ServiceCategorySubService();
	}

	@Then("^User add the Service$")
	public void AddBtnServiceCategory() throws Exception {
		csrDashBoardssteps.addServiceBtn();
	}

	@Then("^User Selects the Service date$")
	public void ServiceDate() throws Exception {
		csrDashBoardssteps.serviceDate();
	}

	@Then("^User Save the WorkOrder$")
	public void SavingTheWorkOrder() {
		csrDashBoardssteps.SavingWorkOrder();
	}

	@Then("^User Clicks on the View Details from action tab$")
	public void UserClicksonActionTabViewDetails() throws Exception {
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
	public void calledForSourceTarget() throws Exception {
		csrDashBoardssteps.calledSourceTarget();
	}

	@Then("^User saves New Call for Details$")
	public void saveMoreDetails() {
		csrDashBoardssteps.savebtnDetails();
	}

	@Then("^User Clicks on Add Work Order$")
	public void clicksOnWorkOrderinDetails() throws Exception {
		csrDashBoardssteps.workOrderDetails();
	}

	@Then("^User selects ComOpportunity Type$")
	public void user_selects_ComOpportunity_Type() throws Exception {
		csrDashBoardssteps.ComOpportunity();
	}

	@Then("^User clicks on the RangeTime$")
	public void user_clicks_on_the_RangeTime() throws Exception {
		csrDashBoardssteps.RangeTime();
	}

	@Then("^User clicks on the DDleadTech$")
	public void user_clicks_on_the_DDleadTech() throws Exception {
		csrDashBoardssteps.DDleadTech();
	}

	@Then("^user click on alertmessageCSRDashboard$")
	public void user_click_on_alertmessageCSRDashboard() {
		csrDashBoardssteps.alertmessageCSRDashboard();
	}

	@Then("^user click on DDSourceAccountOpportunit$")
	public void user_click_on_DDSourceAccountOpportunit() throws Exception {
		csrDashBoardssteps.DDSourceAccountOpportunity();
	}
	
	@Then("^user click on DDServiceCategoryWO$")
	public void user_click_on_DDServiceCategoryWO() throws Exception {
		csrDashBoardssteps.DDServiceCategoryWO();
	}

	@Then("^user click on DDServicesWO$")
	public void user_click_on_DDServicesWO() throws Exception {
		csrDashBoardssteps.DDServicesWO();
	}
	
	@Then("^user click on TaskName_CSRDashboard$")
	public void user_click_on_TaskName_CSRDashboard() throws Exception {
		csrDashBoardssteps.TaskName_CSRDashboard();
	}

	@Then("^user click on DueDate_CSRDashboard$")
	public void user_click_on_DueDate_CSRDashboard() throws Exception {
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
	
	@Then("^user click on billingAddSame_WOCSRDashboard$")
	public void user_click_on_billingAddSame_WOCSRDashboard() throws Exception {
		csrDashBoardssteps.billingAddSame_WOCSRDashboard();
	}

	@Then("^user click on AddLine(\\d+)_WOCSRDashboard$")
	public void user_click_on_AddLine__WOCSRDashboard(int arg1) throws Exception {
		csrDashBoardssteps.AddLine();
	}

	@Then("^user click on zip_WOCSRDashboard$")
	public void user_click_on_zip_WOCSRDashboard() throws Exception {
		csrDashBoardssteps.zip_WOCSRDashboard();
	}

	/*@Then("^user click on State_WOCSRDashboard$")
	public void user_click_on_State_WOCSRDashboard() {
		csrDashBoardssteps.State_WOCSRDashboard();
	}*/

	@Then("^user click on save_WOCSRDashboard$")
	public void user_click_on_save_WOCSRDashboard() throws Exception {
		csrDashBoardssteps.save_WOCSRDashboard();
	}


}
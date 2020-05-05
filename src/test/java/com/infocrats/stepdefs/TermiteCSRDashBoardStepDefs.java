package com.infocrats.stepdefs;

import com.infocrats.steps.TermiteCSRDashBoardSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TermiteCSRDashBoardStepDefs {

	@Steps
	TermiteCSRDashBoardSteps termitecsrdashboardsteps;

	@When("^user click on 	CSRDashboard$")
	public void user_click_on_CSRDashboard() {
		termitecsrdashboardsteps.click_on_CSRDashboard();
	}

	@Then("^user click on AdvanceSearch_CSRDashboard$")
	public void user_click_on_AdvanceSearch_CSRDashboard() {
		termitecsrdashboardsteps.click_on_AdvanceSearch_CSRDashboard();
	}

	@Then("^user click on AddAction_CSRDashboard$")
	public void user_click_on_AddAction_CSRDashboard() {
		termitecsrdashboardsteps.click_on_AddAction_CSRDashboard();
	}

	@Then("^user click on DDSourceAddCAll_CSRDashboard$")
	public void user_click_on_DDSourceAddCAll_CSRDashboard() {
		termitecsrdashboardsteps.click_on_DDSourceAddCAll_CSRDashboard();
	}

	@Then("^user click on DDTargetAddCall_CSRDashboard$")
	public void user_click_on_DDTargetAddCall_CSRDashboard() {
		termitecsrdashboardsteps.click_on_DDTargetAddCall_CSRDashboard();
	}

	@Then("^user click on SaveAddCall_CSRDashboard$")
	public void user_click_on_SaveAddCall_CSRDashboard() {
		termitecsrdashboardsteps.click_on_SaveAddCall_CSRDashboard();
	}

	@Then("^user click on AddNote$")
	public void user_click_on_AddNote() {
		termitecsrdashboardsteps.clickonAddNote_CSRDashboard();
	}

	@Then("^user click on ExpirationDate_AddNote$")
	public void user_click_on_ExpirationDate_AddNote() {
		termitecsrdashboardsteps.click_on_ExpirationDate_AddNote_CSRDashboard();
	}

	@Then("^user click on EnterNote_AddNote$")
	public void user_click_on_EnterNote_AddNote() throws Exception {
		termitecsrdashboardsteps.click_on_EnterNote_AddNote_CSRDashboard();
	}

	@Then("^user click on Save_AddNote$")
	public void user_click_on_Save_AddNote() {
		termitecsrdashboardsteps.click_on_Save_AddNote_CSRDashboard();
	}
	
	

@Then("^user click on CreateWorkorder$")
public void user_click_on_CreateWorkorder() {
	termitecsrdashboardsteps.click_on_CreateWorkorder();
}

@Then("^user click on DDServiceCategory_CreateWorkorder$")
public void user_click_on_DDServiceCategory_CreateWorkorder() {
	termitecsrdashboardsteps.click_on_DDServiceCategory_CreateWorkorder();
}

@Then("^user click on Services_CreateWorkorder$")
public void user_click_on_Services_CreateWorkorder() {
	termitecsrdashboardsteps.click_on_Services_CreateWorkorder();
}

@Then("^user click on AddBtn_CreateWorkorder$")
public void user_click_on_AddBtn_CreateWorkorder() {
	termitecsrdashboardsteps.click_on_AddBtn_CreateWorkorder();
}

@Then("^user click on DDOrderType_CreateWorkorder$")
public void user_click_on_DDOrderType_CreateWorkorder() {
	termitecsrdashboardsteps.click_on_DDOrderType_CreateWorkorder();
}

@Then("^user click on KeepSameServiceAdd_CreateWorkorder$")
public void user_click_on_KeepSameServiceAdd_CreateWorkorder() {
	termitecsrdashboardsteps.click_on_KeepSameServiceAdd_CreateWorkorder();
}

@Then("^user click on ServiceDate_CreateWorkorder$")
public void user_click_on_ServiceDate_CreateWorkorder() {
	termitecsrdashboardsteps.click_on_ServiceDate_CreateWorkorder();
}

@Then("^user click on Save_CreateWorkorder$")
public void user_click_on_Save_CreateWorkorder() {
	termitecsrdashboardsteps.click_on_Save_CreateWorkorder();
}


@Then("^user click on YesCreateOpportunity_CreateWorkorder$")
public void user_click_on_YesCreateOpportunity_CreateWorkorder() {
	termitecsrdashboardsteps.click_on_YesCreateOpportunity_CreateWorkorder();
}

}

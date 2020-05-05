package com.infocrats.steps;

import java.util.Map;

import com.infocrats.pageObjects.TermiteCSRDashBoardPage;
import com.infocrats.utils.JsonHelper;

public class TermiteCSRDashBoardSteps extends pestreamSteps {
	
	private Map<String, String> jsonData;
	TermiteCSRDashBoardPage termitecsrdashboardpage;
	
	public void click_on_CSRDashboard() {
		termitecsrdashboardpage.click_on_CSRDashboard();

	}

	public void click_on_AdvanceSearch_CSRDashboard() {
		termitecsrdashboardpage.click_on_AdvanceSearch_CSRDashboard();
	}

	public void click_on_AddAction_CSRDashboard() {
		termitecsrdashboardpage.click_on_AddAction_CSRDashboard();
	}

	public void click_on_DDSourceAddCAll_CSRDashboard() {
		termitecsrdashboardpage.click_on_DDSourceAddCAll_CSRDashboard();
	}

	public void click_on_DDTargetAddCall_CSRDashboard() {
		termitecsrdashboardpage.click_on_DDTargetAddCall_CSRDashboard();
	}

	public void click_on_SaveAddCall_CSRDashboard() {
		termitecsrdashboardpage.click_on_SaveAddCall_CSRDashboard();
	}

	public void clickonAddNote_CSRDashboard() {
		termitecsrdashboardpage.click_on_AddNote_CSRDashboard();
		
	}

	public void click_on_ExpirationDate_AddNote_CSRDashboard() {
		termitecsrdashboardpage.click_on_ExpirationDate_AddNote_CSRDashboard();
		
	}

	public void click_on_EnterNote_AddNote_CSRDashboard() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "CSRDashBoard");
		termitecsrdashboardpage.click_on_EnterNote_AddNote_CSRDashboard(jsonData);
		
	}

	public void click_on_Save_AddNote_CSRDashboard() {
		termitecsrdashboardpage.click_on_Save_AddNote_CSRDashboard();
		
	}
	
	

	public void click_on_CreateWorkorder() {
		termitecsrdashboardpage.click_on_CreateWorkorder();
	}

	public void click_on_DDServiceCategory_CreateWorkorder() {
		termitecsrdashboardpage.click_on_DDServiceCategory_CreateWorkorder();
	}

	public void click_on_Services_CreateWorkorder() {
		termitecsrdashboardpage.click_on_Services_CreateWorkorder();
	}

	public void click_on_AddBtn_CreateWorkorder() {
		termitecsrdashboardpage.click_on_AddBtn_CreateWorkorder();
	}

	public void click_on_DDOrderType_CreateWorkorder() {
		termitecsrdashboardpage.click_on_DDOrderType_CreateWorkorder();
	}

	public void click_on_KeepSameServiceAdd_CreateWorkorder() {
		termitecsrdashboardpage.click_on_KeepSameServiceAdd_CreateWorkorder();
	}

	public void click_on_ServiceDate_CreateWorkorder() {
		termitecsrdashboardpage.click_on_ServiceDate_CreateWorkorder();
	}

	public void click_on_Save_CreateWorkorder() {
		termitecsrdashboardpage.click_on_Save_CreateWorkorder();
	}

	public void click_on_YesCreateOpportunity_CreateWorkorder() {
		termitecsrdashboardpage.click_on_YesCreateOpportunity_CreateWorkorder();
	}

	

	

	

}

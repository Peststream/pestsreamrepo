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

	public void click_on_AdvanceSearch_CSRDashboard() throws Exception {
		termitecsrdashboardpage.click_on_AdvanceSearch_CSRDashboard();
	}

	public void click_on_AddAction_CSRDashboard() {
		termitecsrdashboardpage.click_on_AddAction_CSRDashboard();
	}

	public void click_on_DDSourceAddCAll_CSRDashboard() throws Exception {
		termitecsrdashboardpage.click_on_DDSourceAddCAll_CSRDashboard();
	}

	public void click_on_DDTargetAddCall_CSRDashboard() throws Exception {
		termitecsrdashboardpage.click_on_DDTargetAddCall_CSRDashboard();
	}

	public void click_on_SaveAddCall_CSRDashboard() throws Exception {
		termitecsrdashboardpage.click_on_SaveAddCall_CSRDashboard();
	}

	public void clickonAddNote_CSRDashboard() throws Exception {
		termitecsrdashboardpage.click_on_AddNote_CSRDashboard();
		
	}

	public void click_on_ExpirationDate_AddNote_CSRDashboard() throws Exception {
		termitecsrdashboardpage.click_on_ExpirationDate_AddNote_CSRDashboard();
		
	}

	public void click_on_EnterNote_AddNote_CSRDashboard() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "CSRDashBoard");
		termitecsrdashboardpage.click_on_EnterNote_AddNote_CSRDashboard(jsonData);
		
	}

	public void click_on_Save_AddNote_CSRDashboard() throws Exception {
		termitecsrdashboardpage.click_on_Save_AddNote_CSRDashboard();
		
	}
	
	

	public void click_on_CreateWorkorder() throws Exception {
		termitecsrdashboardpage.click_on_CreateWorkorder();
	}

	public void click_on_DDServiceCategory_CreateWorkorder() throws Exception {
		termitecsrdashboardpage.click_on_DDServiceCategory_CreateWorkorder();
	}

	public void click_on_Services_CreateWorkorder() throws Exception {
		termitecsrdashboardpage.click_on_Services_CreateWorkorder();
	}

	public void click_on_AddBtn_CreateWorkorder() throws Exception {
		termitecsrdashboardpage.click_on_AddBtn_CreateWorkorder();
	}

	public void click_on_DDOrderType_CreateWorkorder() throws Exception {
		termitecsrdashboardpage.click_on_DDOrderType_CreateWorkorder();
	}

	public void click_on_KeepSameServiceAdd_CreateWorkorder() throws Exception {
		termitecsrdashboardpage.click_on_KeepSameServiceAdd_CreateWorkorder();
	}

	public void click_on_ServiceDate_CreateWorkorder() throws Exception {
		termitecsrdashboardpage.click_on_ServiceDate_CreateWorkorder();
	}

	public void click_on_Save_CreateWorkorder() throws Exception {
		termitecsrdashboardpage.click_on_Save_CreateWorkorder();
	}

	public void click_on_YesCreateOpportunity_CreateWorkorder() throws Exception {
		termitecsrdashboardpage.click_on_YesCreateOpportunity_CreateWorkorder();
	}

	

	

	

}

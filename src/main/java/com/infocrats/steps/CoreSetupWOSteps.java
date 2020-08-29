package com.infocrats.steps;

import com.infocrats.pageObjects.CoreSetupWOPage;

import net.thucydides.core.annotations.Step;

public class CoreSetupWOSteps extends pestreamSteps {
	
	CoreSetupWOPage coresetupwopage;

	@Step
	public void setupTab() {
		coresetupwopage.setup_tab();
		
	}

	@Step
	public void advSearchBtn() throws Exception {
		coresetupwopage.advSearch_btn();
		
	}

	@Step
	public void acionBtn() throws Exception {
		coresetupwopage.action_btn();
		
	}

	@Step
	public void serviceTab() throws Exception {
		coresetupwopage.service_tab();
		
	}

	@Step
	public void workOrderTab() throws Exception {
		coresetupwopage.workOrder_tab();
		
	}

	@Step
	public void svWorkOrder() throws Exception {
		coresetupwopage.svWork_order();
		
	}

	@Step
	public void advsearchBtn() throws Exception {
		coresetupwopage.advsearch_btn();
		
	}

	@Step
	public void pendingTab() throws Exception {
		coresetupwopage.pending_tab();
		
	}

	@Step
	public void addIcon() throws Exception {
		coresetupwopage.add_icon();
		
	}

	@Step
	public void checkService() throws Exception {
		coresetupwopage.check_service();
		
	}

	@Step
	public void viewSetup() throws Exception {
		coresetupwopage.view_setup();
		
	}

	@Step
	public void svBtn() throws Exception {

		coresetupwopage.sv_btn();
		
	}

}

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
	public void advSearchBtn() {
		coresetupwopage.advSearch_btn();
		
	}

	@Step
	public void acionBtn() {
		coresetupwopage.action_btn();
		
	}

	@Step
	public void serviceTab() {
		coresetupwopage.service_tab();
		
	}

	@Step
	public void workOrderTab() {
		coresetupwopage.workOrder_tab();
		
	}

	@Step
	public void svWorkOrder() {
		coresetupwopage.svWork_order();
		
	}

	@Step
	public void advsearchBtn() {
		coresetupwopage.advsearch_btn();
		
	}

	@Step
	public void pendingTab() {
		coresetupwopage.pending_tab();
		
	}

	@Step
	public void addIcon() {
		coresetupwopage.add_icon();
		
	}

	@Step
	public void checkService() {
		coresetupwopage.check_service();
		
	}

	@Step
	public void viewSetup() {
		coresetupwopage.view_setup();
		
	}

	@Step
	public void svBtn() {

		coresetupwopage.sv_btn();
		
	}

}

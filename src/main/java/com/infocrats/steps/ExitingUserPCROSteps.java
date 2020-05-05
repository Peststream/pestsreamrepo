package com.infocrats.steps;

import com.infocrats.pageObjects.ExitingUserPCROPage;

import net.thucydides.core.annotations.Step;

public class ExitingUserPCROSteps extends pestreamSteps {
	
	ExitingUserPCROPage exitinguserpcropage;

	@Step
	public void exitAcct(String acctDetails) {
		
		exitinguserpcropage.exit_acct(acctDetails);
	}

	@Step
	public void serviceAndSource() {
		exitinguserpcropage.serviceAnd_source();
		
	}

	@Step
	public void customerTab() {
		
		exitinguserpcropage.customer_tab();
		
	}

	@Step
	public void opportunityTab() {
		exitinguserpcropage.opportunity_tab();
		
	}

	@Step
	public void advSrchBtn() {
		exitinguserpcropage.advSrch_btn();
		
	}

	@Step
	public void openTab() {
		exitinguserpcropage.open_tab();
		
	}
	
	@Step
	public void selectOpp() {
		exitinguserpcropage.select_opp();
		
	}

	@Step
	public void writeNote() {
		exitinguserpcropage.write_note();
		
	}

//	@Step
//	public void svBtn() {
//		exitinguserpcropage.sv_btn();
//		
//	}

	@Step
	public void packageDetailsOnPhnSales() {
		exitinguserpcropage.packageDetailsOnPhn_sales();
		
	}

}

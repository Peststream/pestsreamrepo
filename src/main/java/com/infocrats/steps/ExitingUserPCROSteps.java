package com.infocrats.steps;

import com.infocrats.pageObjects.ExitingUserPCROPage;

import net.thucydides.core.annotations.Step;

public class ExitingUserPCROSteps extends pestreamSteps {
	
	ExitingUserPCROPage exitinguserpcropage;

	@Step
	public void exitAcct(String acctDetails) throws Exception {
		
		exitinguserpcropage.exit_acct(acctDetails);
	}

	@Step
	public void serviceAndSource() throws Exception {
		exitinguserpcropage.serviceAnd_source();
		
	}

	@Step
	public void customerTab() throws Exception {
		
		exitinguserpcropage.customer_tab();
		
	}

	@Step
	public void opportunityTab() throws Exception {
		exitinguserpcropage.opportunity_tab();
		
	}

	@Step
	public void advSrchBtn() throws Exception {
		exitinguserpcropage.advSrch_btn();
		
	}

	@Step
	public void openTab() throws Exception {
		exitinguserpcropage.open_tab();
		
	}
	
	@Step
	public void selectOpp() throws Exception {
		exitinguserpcropage.select_opp();
		
	}

	@Step
	public void writeNote() throws Exception {
		exitinguserpcropage.write_note();
		
	}

//	@Step
//	public void svBtn() {
//		exitinguserpcropage.sv_btn();
//		
//	}

	@Step
	public void packageDetailsOnPhnSales() throws Exception {
		exitinguserpcropage.packageDetailsOnPhn_sales();
		
	}

}

package com.infocrats.steps;

import com.infocrats.pageObjects.SalesAutoPCROPage;

import net.thucydides.core.annotations.Step;

public class SalesAutoPCROSteps extends pestreamSteps {
	
	
	SalesAutoPCROPage salesautopcropage;

	
	@Step
	public void appoinmentTab() {
		salesautopcropage.appoinment_tab();
		
	}

	@Step
	public void salesAppTab() {
		salesautopcropage.salesApp_tab();
		
	}

	@Step
	public void packageDetails() {
		salesautopcropage.package_details();
		
	}

	@Step
	public void addBtn() {
		salesautopcropage.add_btn();
		
	}

	@Step
	public void addToAgreement() {
		salesautopcropage.addTo_agreement();
		
	}

	@Step
	public void svAndSignAgreementBtn() {
		salesautopcropage.svAndsignAgreeBtn();
		
	}

	@Step
	public void savContOnsalesApp() {
		salesautopcropage.svContOnsales_app();
		
	}

	@Step
	public void savContOnAgreementTab() {
		salesautopcropage.svContOnAgree_tab();
		
	}

	@Step
	public void sendAgreement() {
		salesautopcropage.send_agreement();
		
	}

	@Step
	public void intialSetup() {
		salesautopcropage.intial_setup();
		
	}

}

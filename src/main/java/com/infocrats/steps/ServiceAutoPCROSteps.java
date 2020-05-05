package com.infocrats.steps;

import com.infocrats.pageObjects.ServiceAutoPCROPage;

import net.thucydides.core.annotations.Step;

public class ServiceAutoPCROSteps extends pestreamSteps {
	
	ServiceAutoPCROPage serviceautopcropage;

	@Step
	public void appointmentTab() {
		serviceautopcropage.appoinment_tab();
		
	}
	
	@Step
	public void serviceAppoinmentTab() {
		serviceautopcropage.serviceAppoinment_tab();
		
	}

	

}

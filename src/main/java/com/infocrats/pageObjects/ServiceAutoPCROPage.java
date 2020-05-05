package com.infocrats.pageObjects;

import com.infocrats.utils.BaseUtills;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ServiceAutoPCROPage extends peststreamPage {
	BaseUtills utills = new BaseUtills();
	
	
	@FindBy(xpath = "//span[contains(text(),'Appointments')]")
	private WebElementFacade appointmentTab;
	
	@FindBy(xpath = "//span[contains(text(),'Service Appointment')]")
	private WebElementFacade serviceTab;


	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}


	public void appoinment_tab() {
		appointmentTab.click();
		waitABit(1000);
		
	}


	public void serviceAppoinment_tab() {
		
		serviceTab.click();
		waitABit(2000);
	}

}

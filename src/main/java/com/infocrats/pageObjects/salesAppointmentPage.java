package com.infocrats.pageObjects;

import com.infocrats.utils.BaseUtills;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class salesAppointmentPage extends peststreamPage {
	
	BaseUtills utills = new BaseUtills();

	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade appoinment_tab;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade SalesApp;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade Opportunity;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade ContgeneralInfo;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade Continueinspection;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade DDCatSalesApp;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade DDServiceSalesApp;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade DDFrequencySalesApp;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade InternalNotes;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade saveBttn;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade SaveContinueService;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade NonStdRadioBttn;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade DDDepartment;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade Service;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade DDFreq;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade saveBttnNonStd;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade MarkAsLost;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade DDReason;
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade SaveML;
	
	
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}

	/*public void appoinment_tab() {
	saveOnCommOPP.click();
	waitABit(8000);
	
}*/
	
	public void appoinment_tab() {
		appoinment_tab.click();
		waitABit(2000);
		
	}


	public void SalesApp() {
		SalesApp.click();
		waitABit(2000);
	}


	public void Opportunity() {
		Opportunity.click();
		waitABit(2000);
	}


	public void ContgeneralInfo() {
		ContgeneralInfo.click();
		waitABit(2000);
		
	}


	public void Continueinspection() {
		Continueinspection.click();
		waitABit(2000);
		
	}


	public void DDCatSalesApp() {
		DDCatSalesApp.click();
		waitABit(2000);
		
	}


	public void DDServiceSalesApp() {
		DDServiceSalesApp.click();
		waitABit(2000);
	}


	public void DDFrequencySalesApp() {
		DDFrequencySalesApp.click();
		waitABit(2000);
	}


	public void InternalNotes() {
		InternalNotes.click();
		waitABit(2000);
		
	}


	public void saveBttn() {
		saveBttn.click();
		waitABit(2000);
		
	}


	public void SaveContinueService() {
		SaveContinueService.click();
		waitABit(2000);
		
	}


	public void NonStdRadioBttn() {
		NonStdRadioBttn.click();
		waitABit(2000);
		
	}


	public void DDDepartment() {
		DDDepartment.click();
		waitABit(2000);
	}


	public void Service() {
		Service.click();
		waitABit(2000);
		
	}


	public void DDFreq() {
		DDFreq.click();
		waitABit(2000);
		
	}


	public void saveBttnNonStd() {
		saveBttnNonStd.click();
		waitABit(2000);
		
	}


	public void MarkAsLost() {
		MarkAsLost.click();
		waitABit(2000);
		
	}


	public void DDReason() {
		DDReason.click();
		waitABit(2000);
		
	}


	public void SaveML() {
		SaveML.click();
		waitABit(2000);
	}

	
	
	
}

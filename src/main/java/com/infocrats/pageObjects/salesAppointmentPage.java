package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.JsonHelper;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class salesAppointmentPage extends peststreamPage {
	
	BaseUtills utills = new BaseUtills();
	private Map<String, Integer> jsonData;
	
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
	
	public void appoinment_tab() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(appoinment_tab));
		
		appoinment_tab.click();
		
	}


	public void SalesApp() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(SalesApp));
		
		SalesApp.click();
	}


	public void Opportunity() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Opportunity));
		
		Opportunity.click();
	}


	public void ContgeneralInfo() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(ContgeneralInfo));
		
		ContgeneralInfo.click();
		
	}


	public void Continueinspection() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Continueinspection));
		
		Continueinspection.click();
		
	}


	public void DDCatSalesApp() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(DDCatSalesApp));
		
		DDCatSalesApp.click();
		
	}


	public void DDServiceSalesApp() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(DDServiceSalesApp));
		
		DDServiceSalesApp.click();
	}


	public void DDFrequencySalesApp() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(DDFrequencySalesApp));
		
		DDFrequencySalesApp.click();
	}


	public void InternalNotes() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(InternalNotes));
		
		InternalNotes.click();
		
	}


	public void saveBttn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(saveBttn));
		
		saveBttn.click();
		
	}


	public void SaveContinueService() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveContinueService));
		
		SaveContinueService.click();
		waitABit(2000);
		
	}


	public void NonStdRadioBttn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(NonStdRadioBttn));
		
		NonStdRadioBttn.click();
		waitABit(2000);
		
	}


	public void DDDepartment() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(DDDepartment));
		
		DDDepartment.click();
		waitABit(2000);
	}


	public void Service() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Service));
		
		Service.click();
		
	}


	public void DDFreq() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(DDFreq));
		
		DDFreq.click();
		
	}


	public void saveBttnNonStd() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(saveBttnNonStd));
		
		saveBttnNonStd.click();
		
	}


	public void MarkAsLost() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(MarkAsLost));
		
		MarkAsLost.click();
		
	}


	public void DDReason() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(DDReason));
		
		DDReason.click();
		
	}


	public void SaveML() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveML));
		
		SaveML.click();
	}

	
	
	
}

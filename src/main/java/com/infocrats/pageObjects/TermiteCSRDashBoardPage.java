package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.Keys;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.JsonHelper;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TermiteCSRDashBoardPage extends peststreamPage {
	BaseUtills utills = new BaseUtills();
	private Map<String, Integer> jsonData;

	@FindBy(xpath = "//span[contains(text(),'CSR DashBoard')]")
	private WebElementFacade CSRDashboard;
	
	@FindBy(xpath = "//button[@class='btn green btnSubmitAdvanceSearch']")
	private WebElementFacade AdvanceSearch_CSRDashboard;
	
	@FindBy(xpath = "//table[@id='sample_1']/tbody/tr[1]//a[@title='Add Call']")
	private WebElementFacade AddCallAction_CSRDashboard;
	
	@FindBy(xpath = "(//span[contains(.,'Nothing selected')])[1]")
	private WebElementFacade DDSourceAddCAll_CSRDashboard;
	
	@FindBy(xpath = "//span[contains(text(),'CustomerPortal App')]")
	private WebElementFacade ValueDDSourceAddCAll_CSRDashboard;
	
	@FindBy(xpath = "//span[contains(text(),'Nothing selected')]")
	private WebElementFacade DDTargetAddCall_CSRDashboard;
	
	@FindBy(xpath = "//span[contains(text(),'New Target Abc')]")
	private WebElementFacade ValueDDTargetAddCall_CSRDashboard;
	
	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade SaveAddCall_CSRDashboard;
	
	@FindBy(xpath = "(//a[contains(@title,'Add Note')])[1]")
	private WebElementFacade AddNote_CSRDashboard;
	
	@FindBy(xpath = "//input[@id='LeadNoteVm_ExpiryDateStr']")
	private WebElementFacade ExpirationDate_CSRDashboard;
	
	@FindBy(xpath = "//div[@class='datepicker-days']//th[@class='next']")
	private WebElementFacade NextMonthExpirationDate_CSRDashboard;
	
	@FindBy(xpath = "//td[@class='day'][contains(text(),'30')]")
	private WebElementFacade ValueExpirationDate_CSRDashboard;
	
	@FindBy(xpath = "//textarea[@id='LeadNoteVm_Note']")
	private WebElementFacade EnterNote_CSRDashboard;
	
	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade SaveAddNote_CSRDashboard;
	
	@FindBy(xpath = "(//a[@title='Create Workorder'])[1]")
	private WebElementFacade CreateWorkorder;
	
	@FindBy(xpath = "//span[@id='select2-chosen-7']")
	private WebElementFacade DDServiceCategory_CreateWorkorder;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[11]")
	private WebElementFacade ValueDDServiceCategory_CreateWorkorder;
	
	@FindBy(xpath = "//input[@id='serviceWohead']")
	private WebElementFacade DDServices_CreateWorkorder;
	
	@FindBy(xpath = "//input[@id='serviceWohead']")
	private WebElementFacade ValueDDServices_CreateWorkorder;
	
	@FindBy(xpath = "//*[@id=\"formWorkOrder\"]/div[1]/div[2]/div[7]/div[3]/div/a")
	private WebElementFacade AddBtn_CreateWorkorder;
	
	@FindBy(xpath = "//select[@id='OrderType']")
	private WebElementFacade DDOrderType_CreateWorkorder;
	
	@FindBy(xpath = "//option[contains(text(),'Service Order')]")
	private WebElementFacade ValueDDOrderType_CreateWorkorder;
	
	@FindBy(xpath = "//input[@id='IsSameAsServiceAddress']")
	private WebElementFacade KeepSameServiceAdd_CreateWorkorder;
	
	@FindBy(xpath = "//input[@id='ServiceDateStr']")
	private WebElementFacade ServiceDate_CreateWorkorder;
	
	@FindBy(xpath = "//div[@class='datepicker-days']//th[@class='next']")
	private WebElementFacade NextMonthServiceDate_CreateWorkorder;
	
	@FindBy(xpath = "//td[@class='day'][contains(text(),'30')]")
	private WebElementFacade ValueServiceDate_CreateWorkorder;
	
	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade Save_CreateWorkorder;
	
	@FindBy(xpath = "//button[@class='btn green btnOpportunityAlertYes']")
	private WebElementFacade YesCreateOpportunity_CreateWorkorder;

	
	
	
	@Override
	public WebElementFacade getUniqueElement() {
		return null;
	}

	public void click_on_CSRDashboard() {
		scrollUPSmall(CSRDashboard);
		CSRDashboard.click();
	}

	public void click_on_AdvanceSearch_CSRDashboard() throws Exception {
		scrollDown(AdvanceSearch_CSRDashboard);
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time3"));
		AdvanceSearch_CSRDashboard.click();
	}

	public void click_on_AddAction_CSRDashboard() {
		AddCallAction_CSRDashboard.click();
	}

	public void click_on_DDSourceAddCAll_CSRDashboard() throws Exception {
		DDSourceAddCAll_CSRDashboard.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
		ValueDDSourceAddCAll_CSRDashboard.click();
	}

	public void click_on_DDTargetAddCall_CSRDashboard() throws Exception {
		DDTargetAddCall_CSRDashboard.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
		ValueDDTargetAddCall_CSRDashboard.click();
	}

	public void click_on_SaveAddCall_CSRDashboard() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
		SaveAddCall_CSRDashboard.click();
	}

	public void click_on_AddNote_CSRDashboard() throws Exception {
		AddNote_CSRDashboard.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
	}

	public void click_on_ExpirationDate_AddNote_CSRDashboard() throws Exception {
		ExpirationDate_CSRDashboard.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
		
		NextMonthExpirationDate_CSRDashboard.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
		
		ValueExpirationDate_CSRDashboard.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
	}

	public void click_on_EnterNote_AddNote_CSRDashboard(Map<String, String> testData) throws Exception {
		EnterNote_CSRDashboard.sendKeys(testData.get("EnterNote"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
	}

	public void click_on_Save_AddNote_CSRDashboard() throws Exception {
		SaveAddNote_CSRDashboard.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
	}

	
	
	public void click_on_CreateWorkorder() throws Exception {
		CreateWorkorder.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
	}

	public void click_on_DDServiceCategory_CreateWorkorder() throws Exception {
		DDServiceCategory_CreateWorkorder.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
		
		ValueDDServiceCategory_CreateWorkorder.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
	}

	public void click_on_Services_CreateWorkorder() throws Exception {
		DDServices_CreateWorkorder.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
		
		ValueDDServices_CreateWorkorder.sendKeys(Keys.DOWN);
		ValueDDServices_CreateWorkorder.sendKeys(Keys.ENTER);
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
	}

	public void click_on_AddBtn_CreateWorkorder() throws Exception {
		AddBtn_CreateWorkorder.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
	}

	public void click_on_DDOrderType_CreateWorkorder() throws Exception {
		DDOrderType_CreateWorkorder.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
		
		ValueDDOrderType_CreateWorkorder.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
	}

	public void click_on_KeepSameServiceAdd_CreateWorkorder() throws Exception {
		KeepSameServiceAdd_CreateWorkorder.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
	}

	public void click_on_ServiceDate_CreateWorkorder() throws Exception {
		ServiceDate_CreateWorkorder.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
		
		NextMonthServiceDate_CreateWorkorder.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
		
		ValueServiceDate_CreateWorkorder.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
	}

	public void click_on_Save_CreateWorkorder() throws Exception {
		scrollDownLarge(Save_CreateWorkorder);
		Save_CreateWorkorder.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
	}

	public void click_on_YesCreateOpportunity_CreateWorkorder() throws Exception {
		YesCreateOpportunity_CreateWorkorder.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
		
	}

	

}

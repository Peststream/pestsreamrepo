package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.Keys;

import com.infocrats.utils.BaseUtills;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TermiteCSRDashBoardPage extends peststreamPage {
	BaseUtills utills = new BaseUtills();

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

	public void click_on_AdvanceSearch_CSRDashboard() {
		scrollDown(AdvanceSearch_CSRDashboard);
		waitABit(2000);
		AdvanceSearch_CSRDashboard.click();
	}

	public void click_on_AddAction_CSRDashboard() {
		AddCallAction_CSRDashboard.click();
	}

	public void click_on_DDSourceAddCAll_CSRDashboard() {
		DDSourceAddCAll_CSRDashboard.click();
		waitABit(1000);
		ValueDDSourceAddCAll_CSRDashboard.click();
	}

	public void click_on_DDTargetAddCall_CSRDashboard() {
		DDTargetAddCall_CSRDashboard.click();
		waitABit(1000);
		ValueDDTargetAddCall_CSRDashboard.click();
	}

	public void click_on_SaveAddCall_CSRDashboard() {
		waitABit(1000);
		SaveAddCall_CSRDashboard.click();
	}

	public void click_on_AddNote_CSRDashboard() {
		AddNote_CSRDashboard.click();
		waitABit(1000);
	}

	public void click_on_ExpirationDate_AddNote_CSRDashboard() {
		ExpirationDate_CSRDashboard.click();
		waitABit(1000);
		
		NextMonthExpirationDate_CSRDashboard.click();
		waitABit(1000);
		
		ValueExpirationDate_CSRDashboard.click();
		waitABit(1000);
	}

	public void click_on_EnterNote_AddNote_CSRDashboard(Map<String, String> testData) {
		EnterNote_CSRDashboard.sendKeys(testData.get("EnterNote"));
		waitABit(1000);
	}

	public void click_on_Save_AddNote_CSRDashboard() {
		SaveAddNote_CSRDashboard.click();
		waitABit(1000);
	}

	
	
	public void click_on_CreateWorkorder() {
		CreateWorkorder.click();
		waitABit(1000);
	}

	public void click_on_DDServiceCategory_CreateWorkorder() {
		DDServiceCategory_CreateWorkorder.click();
		waitABit(1000);
		
		ValueDDServiceCategory_CreateWorkorder.click();
		waitABit(1000);
	}

	public void click_on_Services_CreateWorkorder() {
		DDServices_CreateWorkorder.click();
		waitABit(3000);
		
		ValueDDServices_CreateWorkorder.sendKeys(Keys.DOWN);
		ValueDDServices_CreateWorkorder.sendKeys(Keys.ENTER);
		waitABit(1000);
	}

	public void click_on_AddBtn_CreateWorkorder() {
		AddBtn_CreateWorkorder.click();
		waitABit(1000);
	}

	public void click_on_DDOrderType_CreateWorkorder() {
		DDOrderType_CreateWorkorder.click();
		waitABit(1000);
		
		ValueDDOrderType_CreateWorkorder.click();
		waitABit(1000);
	}

	public void click_on_KeepSameServiceAdd_CreateWorkorder() {
		KeepSameServiceAdd_CreateWorkorder.click();
		waitABit(1000);
	}

	public void click_on_ServiceDate_CreateWorkorder() {
		ServiceDate_CreateWorkorder.click();
		waitABit(1000);
		
		NextMonthServiceDate_CreateWorkorder.click();
		waitABit(1000);
		
		ValueServiceDate_CreateWorkorder.click();
		waitABit(1000);
	}

	public void click_on_Save_CreateWorkorder() {
		scrollDownLarge(Save_CreateWorkorder);
		Save_CreateWorkorder.click();
		waitABit(1000);
	}

	public void click_on_YesCreateOpportunity_CreateWorkorder() {
		YesCreateOpportunity_CreateWorkorder.click();
		waitABit(1000);
		
	}

	

}

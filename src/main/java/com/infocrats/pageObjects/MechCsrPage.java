package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.touch.DownAction;
import org.openqa.selenium.remote.server.handler.interactions.touch.Down;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.JsonHelper;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class MechCsrPage extends peststreamPage {
	BaseUtills utills = new BaseUtills();
	private Map<String, Integer> jsonData;

	@FindBy(xpath = "//span[contains(text(),'CSR DashBoard')]")
	private WebElementFacade CSRDashBoard_Mech;

	@FindBy(xpath = "//button[contains(text(),'Advance Search')]")
	private WebElementFacade AdvanceSearch_CSRDB_Mech;

	@FindBy(xpath = "//a[contains(text(),'1509')]")
	private WebElementFacade MechOpp_CSRDB_Mech;

	@FindBy(xpath = "//tr[7]//td[10]//a[1]")
	private WebElementFacade CallBttn_CSRDB_Mech;

	@FindBy(xpath = "//select[@id='EmployeeNo']")
	private WebElementFacade DDCalledFor_CallBttn_CSRDB_Mech;

	@FindBy(xpath = "//option[contains(text(),'Ayan Rathore')]")
	private WebElementFacade ValueDDCalledFor_CallBttn_CSRDB_Mech;

	@FindBy(xpath = "//textarea[@id='Description']")
	private WebElementFacade Des_CallBttn_CSRDB_Mech;

	@FindBy(xpath = "//div[@id='AddCallPopup']//div//div//div//div//form[@id='form0']//div//div//div//div//textarea[@id='Note']")
	private WebElementFacade Note_CallBttn_CSRDB_Mech;

	@FindBy(xpath = "//div[@id='AddCallPopup']//div//div//div//div//form[@id='form0']//div//span[contains(text(),'Save')]")
	private WebElementFacade Save_CallBttn_CSRDB_Mech;

	@FindBy(xpath = "//div[@id='sample_1_paginate']//a[contains(text(),'3')]")
	private WebElementFacade ThreeNext_CallBttn_CSRDB_Mech;

	@FindBy(xpath = "//*[@id='sample_1']/tbody/tr[1]/td[2]/a")
	private WebElementFacade AccountNo_CSRDB_Mech;

	@FindBy(xpath = "/html//div[@id='DivAccountAlertPopup']/div[@class='vertical-alignment-helper']/div[@class='modal-dialog vertical-align-center']//div[@class='modal-body']/div[@class='modal-body-footer']//button[@type='button']")
	private WebElementFacade OkAccountAlert_CSRDB_Mech;

	@FindBy(xpath = "//body/div/div/div/div/div/div/div/div/div/div[2]/button[1]")
	private WebElementFacade AddCallBttn_CSRDB_Mech;

	@FindBy(xpath = "//body//div[@id='AddCallPopup']//div//div//div//div//div[2]//div[1]//button[1]//span[1]")
	private WebElementFacade DDTarget_CSRDB_Mech;

	@FindBy(xpath = "//span[contains(text(),'NewTarget')]")
	private WebElementFacade ValueDDTarget_CSRDB_Mech;

	@FindBy(css = "a[target='_blank'] > .btn.btn-primary.ladda-button")
	private WebElementFacade AddOppBttn_CSRDB_Mech;

	@FindBy(xpath = "//input[@id='SecondaryPhone']")
	private WebElementFacade SecondaryPhoneNo_Opp_CSRDB_Mech;

	@FindBy(xpath = "//div[@id='s2id_DepartmentSysName']//a//span//b")
	private WebElementFacade DDDep_Opp_CSRDB_Mech;

	@FindBy(xpath = "//div[@id='select2-drop']/ul[@role='listbox']/li[2]/ul/li[@role='presentation']/div[@role='option']")
	private WebElementFacade ValueDDDep_Opp_CSRDB_Mech;

	@FindBy(xpath = "//div[@id='s2id_PrimaryServiceId']//a//span//b")
	private WebElementFacade DDService_Opp_CSRDB_Mech;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[3]")
	private WebElementFacade ValueDDService_Opp_CSRDB_Mech;

	@FindBy(xpath = "//button//span[contains(text(),'--Select--')]")
	private WebElementFacade DDSource_Opp_CSRDB_Mech;

	@FindBy(xpath = "//span[contains(text(),'CustomerPortal App')]")
	private WebElementFacade ValueDDSource_Opp_CSRDB_Mech;

	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	private WebElementFacade Cont_Opp_CSRDB_Mech;

	@FindBy(xpath = "//html//body//div//div//div//div//div//div//div//div//div//div//a//button//span[contains(text(),'Work Order')]")
	private WebElementFacade AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "//div[@id='uniform-IsSameAsServiceAddress']")
	private WebElementFacade KeepSameBillingAddress_AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "//textarea[@id='ServiceAddressControl_Notes']")
	private WebElementFacade Notes_AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "//textarea[@id='ServiceAddressControl_Direction']")
	private WebElementFacade Direction_AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "//input[@id='ServiceDateStr']")
	private WebElementFacade ServiceDatePOP_AddWOBttn_CSRDB_Mech;
	
	@FindBy(css = "[for='ServiceDateStr']")
	private WebElementFacade ServiceDateLbl;

	
	
	@FindBy(xpath = "//td[@class='day'][contains(.,'30')]")
	private WebElementFacade ServiceDateValue_AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "/html//form[@id='formWorkOrder']/div[@class='modal-body']/div[@class='form-body']//div[@class='col-md-4 margin-top-10 no_left_padding']/div[@class='form-group']/label[2]/div[@id='uniform-ServiceTimeTypes']/span")
	private WebElementFacade RangeTimeRdioBttn_AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "//select[@id='InitialPreferedId']")
	private WebElementFacade DDTimeRange_AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "//select[@id='InitialPreferedId']//option[contains(text(),'08:00 AM - 09:00 AM')]")
	private WebElementFacade ValueTimeRange_AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "//select[@id='SecondInitialPreferedId']")
	private WebElementFacade DDSecondTimeRange_AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "//select[@id='SecondInitialPreferedId']//option[contains(text(),'09:15 AM - 11:40 PM')]")
	private WebElementFacade ValueSecondTimeRange_AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "//select[@id='RouteMasterId']")
	private WebElementFacade DDPrimaryRoute_AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "//option[contains(text(),'Name Route (q q)')]")
	private WebElementFacade ValuePrimaryRoute_AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "//textarea[@id='SpecialInstruction']")
	private WebElementFacade SpecialInstruction_AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "//textarea[@id='ServiceInstruction']")
	private WebElementFacade ServiceInstruction_AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "//textarea[@id='InternalInstruction']")
	private WebElementFacade InternalInstruction_AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "//textarea[@id='SetupInstruction']")
	private WebElementFacade SetUpInstruction_AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "//button[@id='btnSubmit']//span[contains(text(),'Save')]")
	private WebElementFacade Save_AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "//div[@id='s2id_ddlServiceCategories']//span[@class='select2-chosen']")
	private WebElementFacade DDServiceCategory_AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "//div[@id='select2-drop']/ul[@role='listbox']/li[4]/ul/li[@role='presentation']/div[@role='option']")
	private WebElementFacade ValueDDServiceCategory_AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "//input[@id='serviceWohead']")
	private WebElementFacade Services_AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "//strong[contains(.,'Time and Material')]")
	private WebElementFacade ValueServices_AddWOBttn_CSRDB_Mech;

	@FindBy(xpath = "//body/div/div/div/div/div/div/div/div/form[@id='formWorkOrder']/div/div/div/div/div/a/span[1]")
	private WebElementFacade Add_AddWOBttn_CSRDB_Mech;

	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}

	public void CSRDashBoard_Mech() throws Exception {
		scrollUP(CSRDashBoard_Mech);
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(CSRDashBoard_Mech));
		CSRDashBoard_Mech.click();
		waitABit(jsonData.get("Time1"));

	}

	public void AdvanceSearch_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(AdvanceSearch_CSRDB_Mech));
		AdvanceSearch_CSRDB_Mech.click();
		waitABit(jsonData.get("Time1"));
	}

	public void MechOpp_CSRDB_Mech() {

		// MechOpp_CSRDB_Mech.click();
		// waitABit(3000);
	}

	public void CallBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(CallBttn_CSRDB_Mech));
		CallBttn_CSRDB_Mech.click();
		waitABit(jsonData.get("Time1"));

	}

	public void DDCalledFor_CallBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(DDCalledFor_CallBttn_CSRDB_Mech));
		DDCalledFor_CallBttn_CSRDB_Mech.click();
		waitABit(jsonData.get("Time1"));

	}

	public void ValueDDCalledFor_CallBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDCalledFor_CallBttn_CSRDB_Mech));
		ValueDDCalledFor_CallBttn_CSRDB_Mech.click();
		waitABit(jsonData.get("Time1"));
	}

	public void Des_CallBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait2.until(ExpectedConditions.elementToBeClickable(Des_CallBttn_CSRDB_Mech));
		Des_CallBttn_CSRDB_Mech.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Des_CallBttn_CSRDB_Mech));
		Des_CallBttn_CSRDB_Mech.sendKeys("Des regarding mechanical activity");
		waitABit(jsonData.get("Time1"));
	}

	public void Note_CallBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait2.until(ExpectedConditions.elementToBeClickable(Note_CallBttn_CSRDB_Mech));
		Note_CallBttn_CSRDB_Mech.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Note_CallBttn_CSRDB_Mech));
		Note_CallBttn_CSRDB_Mech.sendKeys("Note regardind mech activity");
		waitABit(jsonData.get("Time1"));
	}

	public void Save_CallBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Save_CallBttn_CSRDB_Mech));
		Save_CallBttn_CSRDB_Mech.click();
		waitABit(jsonData.get("Time1"));
	}

	public void ThreeNext_CallBttn_CSRDB_Mech() throws Exception {

		scrollDown(ThreeNext_CallBttn_CSRDB_Mech);
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(ThreeNext_CallBttn_CSRDB_Mech));
		ThreeNext_CallBttn_CSRDB_Mech.click();
		waitABit(jsonData.get("Time1"));

	}

	public void AccountNo_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(AccountNo_CSRDB_Mech));
		AccountNo_CSRDB_Mech.click();
		waitABit(jsonData.get("Time1"));

	}

	public void OkAccountAlert_CSRDB_Mech() {
		try {
			OkAccountAlert_CSRDB_Mech.click();
			waitABit(jsonData.get("Time1"));

		} catch (Exception e) {
			waitABit(jsonData.get("Time1"));
		}
	}

	public void AddCallBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(AddCallBttn_CSRDB_Mech));
		AddCallBttn_CSRDB_Mech.click();
		waitABit(jsonData.get("Time1"));
	}

	public void DDTarget_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(DDTarget_CSRDB_Mech));
		DDTarget_CSRDB_Mech.click();
		waitABit(jsonData.get("Time1"));
	}

	public void ValueDDTarget_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDTarget_CSRDB_Mech));
		ValueDDTarget_CSRDB_Mech.click();
		waitABit(jsonData.get("Time1"));
	}

	public void AddOppBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait2.until(ExpectedConditions.elementToBeClickable(AddOppBttn_CSRDB_Mech));
		AddOppBttn_CSRDB_Mech.click();
		waitABit(jsonData.get("Time1"));

		String allWindowHandle = getDriver().getWindowHandle();
		waitABit(jsonData.get("Time1"));
		getDriver().switchTo().window(allWindowHandle);
		getDriver().get(
				"https://pestream.com/Sale/PhoneSales?accountNo=4468&returnUrl=/Sales/CrmAccount/AccountDetail?accountId");
		waitABit(jsonData.get("Time1"));

	}

	public void SecondaryPhoneNo_Opp_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait2.until(ExpectedConditions.elementToBeClickable(SecondaryPhoneNo_Opp_CSRDB_Mech));
		SecondaryPhoneNo_Opp_CSRDB_Mech.click();
		waitABit(jsonData.get("Time1"));
		SecondaryPhoneNo_Opp_CSRDB_Mech.sendKeys("9636987452");
		waitABit(jsonData.get("Time1"));
	}

	public void DDDep_Opp_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait2.until(ExpectedConditions.elementToBeClickable(DDDep_Opp_CSRDB_Mech));
		DDDep_Opp_CSRDB_Mech.click();
	}

	public void ValueDDDep_Opp_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait2.until(ExpectedConditions.elementToBeClickable(ValueDDDep_Opp_CSRDB_Mech));
		ValueDDDep_Opp_CSRDB_Mech.click();
	}

	public void DDService_Opp_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait2.until(ExpectedConditions.elementToBeClickable(DDService_Opp_CSRDB_Mech));
		DDService_Opp_CSRDB_Mech.click();
	}

	public void ValueDDService_Opp_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait2.until(ExpectedConditions.elementToBeClickable(ValueDDService_Opp_CSRDB_Mech));
		ValueDDService_Opp_CSRDB_Mech.click();
	}

	public void DDSource_Opp_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait2.until(ExpectedConditions.elementToBeClickable(DDSource_Opp_CSRDB_Mech));
		DDSource_Opp_CSRDB_Mech.click();
	}

	public void ValueDDSource_Opp_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait2.until(ExpectedConditions.elementToBeClickable(ValueDDSource_Opp_CSRDB_Mech));
		ValueDDSource_Opp_CSRDB_Mech.click();
	}

	public void Cont_Opp_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait2.until(ExpectedConditions.elementToBeClickable(Cont_Opp_CSRDB_Mech));
		Cont_Opp_CSRDB_Mech.click();
	}

	public void AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait2.until(ExpectedConditions.elementToBeClickable(AddWOBttn_CSRDB_Mech));
		AddWOBttn_CSRDB_Mech.click();
		waitABit(jsonData.get("Time1"));

		String allWindowHandle = getDriver().getWindowHandle();
		waitABit(jsonData.get("Time1"));
		getDriver().switchTo().window(allWindowHandle);
		waitABit(jsonData.get("Time1"));
		getDriver().get(
				"https://pestream.com/Services/WorkOrder/Manage?accountNo=4731&returnUrl=/Sales/CrmAccount/AccountDetail?accountId");
		waitABit(jsonData.get("Time1"));
	}

	public void KeepSameBillingAddress_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait2.until(ExpectedConditions.elementToBeClickable(KeepSameBillingAddress_AddWOBttn_CSRDB_Mech));
		KeepSameBillingAddress_AddWOBttn_CSRDB_Mech.click();
	}

	public void Notes_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait2.until(ExpectedConditions.elementToBeClickable(Notes_AddWOBttn_CSRDB_Mech));
		Notes_AddWOBttn_CSRDB_Mech.click();
		waitABit(jsonData.get("Time1"));
		Notes_AddWOBttn_CSRDB_Mech.sendKeys("Notes");
		waitABit(jsonData.get("Time1"));
	}

	public void Direction_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait2.until(ExpectedConditions.elementToBeClickable(Direction_AddWOBttn_CSRDB_Mech));
		Direction_AddWOBttn_CSRDB_Mech.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Direction_AddWOBttn_CSRDB_Mech));
		Direction_AddWOBttn_CSRDB_Mech.sendKeys("Direction");
		waitABit(3000);
	}

	public void ServiceDatePOP_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		scrollDown(ServiceDatePOP_AddWOBttn_CSRDB_Mech);
		ServiceDateLbl.click();
		wait.until(ExpectedConditions.elementToBeClickable(ServiceDatePOP_AddWOBttn_CSRDB_Mech));
		ServiceDatePOP_AddWOBttn_CSRDB_Mech.click();
	}

	public void ServiceDateValue_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(ServiceDateValue_AddWOBttn_CSRDB_Mech));
		ServiceDateValue_AddWOBttn_CSRDB_Mech.click();
	}

	public void RangeTimeRdioBttn_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(RangeTimeRdioBttn_AddWOBttn_CSRDB_Mech));
		RangeTimeRdioBttn_AddWOBttn_CSRDB_Mech.click();
	}

	public void DDTimeRange_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(DDTimeRange_AddWOBttn_CSRDB_Mech));
		DDTimeRange_AddWOBttn_CSRDB_Mech.click();
	}

	public void ValueTimeRange_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(ValueTimeRange_AddWOBttn_CSRDB_Mech));
		ValueTimeRange_AddWOBttn_CSRDB_Mech.click();
	}

	public void DDSecondTimeRange_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(DDSecondTimeRange_AddWOBttn_CSRDB_Mech));
		DDSecondTimeRange_AddWOBttn_CSRDB_Mech.click();
	}

	public void ValueSecondTimeRange_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(ValueSecondTimeRange_AddWOBttn_CSRDB_Mech));
		ValueSecondTimeRange_AddWOBttn_CSRDB_Mech.click();
	}

	public void DDPrimaryRoute_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(DDPrimaryRoute_AddWOBttn_CSRDB_Mech));
		DDPrimaryRoute_AddWOBttn_CSRDB_Mech.click();
	}

	public void ValuePrimaryRoute_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(ValuePrimaryRoute_AddWOBttn_CSRDB_Mech));
		ValuePrimaryRoute_AddWOBttn_CSRDB_Mech.click();
	}

	public void SpecialInstruction_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(SpecialInstruction_AddWOBttn_CSRDB_Mech));
		SpecialInstruction_AddWOBttn_CSRDB_Mech.click();
		SpecialInstruction_AddWOBttn_CSRDB_Mech.sendKeys("this is Special Instruction");
		waitABit(jsonData.get("Time1"));
	}

	public void ServiceInstruction_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(ServiceInstruction_AddWOBttn_CSRDB_Mech));
		ServiceInstruction_AddWOBttn_CSRDB_Mech.click();
		waitABit(jsonData.get("Time1"));
		ServiceInstruction_AddWOBttn_CSRDB_Mech.sendKeys("This is Service Instruction");
		waitABit(jsonData.get("Time1"));
	}

	public void InternalInstruction_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(InternalInstruction_AddWOBttn_CSRDB_Mech));
		InternalInstruction_AddWOBttn_CSRDB_Mech.click();
		waitABit(jsonData.get("Time1"));
		InternalInstruction_AddWOBttn_CSRDB_Mech.sendKeys("This is Internal Instructions");
		waitABit(jsonData.get("Time1"));
	}

	public void SetUpInstruction_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(SetUpInstruction_AddWOBttn_CSRDB_Mech));
		SetUpInstruction_AddWOBttn_CSRDB_Mech.click();
		waitABit(jsonData.get("Time1"));
		SetUpInstruction_AddWOBttn_CSRDB_Mech.sendKeys("This is SetUp Instructions");
		waitABit(jsonData.get("Time1"));
	}

	public void Save_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Save_AddWOBttn_CSRDB_Mech));
		Save_AddWOBttn_CSRDB_Mech.click();
	}

	public void DDServiceCategory_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(DDServiceCategory_AddWOBttn_CSRDB_Mech));
		DDServiceCategory_AddWOBttn_CSRDB_Mech.click();

	}

	public void ValueDDServiceCategory_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDServiceCategory_AddWOBttn_CSRDB_Mech));
		ValueDDServiceCategory_AddWOBttn_CSRDB_Mech.click();

	}

	public void Services_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Services_AddWOBttn_CSRDB_Mech));
		Services_AddWOBttn_CSRDB_Mech.click();
	}

	public void ValueServices_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Services_AddWOBttn_CSRDB_Mech));
		Services_AddWOBttn_CSRDB_Mech.sendKeys(Keys.ARROW_DOWN.TAB);
	}

	public void Add_AddWOBttn_CSRDB_Mech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Add_AddWOBttn_CSRDB_Mech));
		Add_AddWOBttn_CSRDB_Mech.click();

	}
}
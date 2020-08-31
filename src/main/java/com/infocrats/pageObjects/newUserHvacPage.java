package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.JsonHelper;
import com.infocrats.utils.Log;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class newUserHvacPage extends peststreamPage {
	BaseUtills utills = new BaseUtills();
	private Map<String, Integer> jsonData;

	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@FindBy(xpath = "//*[@id=\"frmGeneralInfo\"]/div/div/div[3]/h4")
	private WebElementFacade call_page_tittle;

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/a")
	private WebElementFacade callTab;

	@FindBy(xpath = "//*[@id=\"crmCompanySaleshead\"]")
	private WebElementFacade companyName;

	@FindBy(xpath = "//a[@id='btngocrmCompanySaleshead']//i[@class='icon-magnifier']")
	private WebElementFacade companySearch;

	@FindBy(xpath = "//a[@class='btn typeHeadSuggestedCreateLink']")
	private WebElementFacade create_new_company;

	@FindBy(xpath = "//div[@class='col-md-3 divSalesContact']//a[@class='btn typeHeadSuggestedCreateLink'][contains(text(),'Create')]")
	WebElementFacade create_new_contact;

	@FindBy(xpath = "//*[@id=\"crmContactSaleshead\"]")
	private WebElementFacade contactName;
	@FindBy(xpath = "//a[@id='btngocrmContactSaleshead']//i[@class='icon-magnifier']")
	private WebElementFacade contactSearch;

	@FindBy(xpath = "//*[@id=\"CrmContactMiddleName\"]")
	private WebElementFacade middleName;

	@FindBy(xpath = "//*[@id=\"CrmContactLastName\"]")
	private WebElementFacade lastName;

	@FindBy(xpath = "//*[@id=\"PrimaryEmail\"]")
	private WebElementFacade primaryEmail;

	@FindBy(xpath = "//*[@id=\"CellNo\"]")
	private WebElementFacade cellNo;

	@FindBy(xpath = "//*[@id=\"SecondaryPhone\"]")
	private WebElementFacade secondaryPhone;

	@FindBy(xpath = "//span[@id='select2-chosen-5']")
	private WebElementFacade branchName;

	@FindBy(xpath = "//div[@class='select2-result-label'][contains(.,'QA Automation Branch1')]")
	private WebElementFacade branchName1;

	@FindBy(xpath = "//div[@id='s2id_PrimaryServiceId']")
	private WebElementFacade service1;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[3]")
	private WebElementFacade service2;

	@FindBy(xpath = "//*[@id=\"frmGeneralInfo\"]/div/div/div[3]/div[5]/div[2]/div/div")
	private WebElementFacade source_ddl;

	@FindBy(xpath = "//span[contains(text(),'CustomerPortal App')]")
	private WebElementFacade customerPortalApp;

	@FindBy(xpath = "//*[@id=\"AccountDescription\"]")
	private WebElementFacade accountAlert;

	@FindBy(xpath = "//*[@id=\"ProblemDescription\"]")
	private WebElementFacade accountDes;

	@FindBy(xpath = "//div[@id='uniform-rdoResidential']//span")
	private WebElementFacade resRadioBtn;

	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	private WebElementFacade continuebtn;

	@FindBy(xpath = "//a[contains(text(),'Schedule Estimation')]")
	private WebElementFacade ScheduleEstimationRadio;

	@FindBy(xpath = "//*[@id=\"uniform-rdoResidential\"]")
	private WebElementFacade residentialRadio;

	@FindBy(xpath = "//input[@id='SpRequiredServiceAddressControl_ServiceAddressLine1']")
	private WebElementFacade addressline1;

	@FindBy(xpath = "//input[@id='SpRequiredServiceAddressControl_ServiceZipCode']")
	private WebElementFacade zipCode;

	@FindBy(xpath = "//input[@id='SpRequiredServiceAddressControl_ServiceCityName']")
	private WebElementFacade city;

	@FindBy(xpath = "//select[@id='SpRequiredServiceAddressControl_AddressSubType']")
	private WebElementFacade addressSubType;

	@FindBy(xpath = "//option[contains(text(),'Residential')]")
	private WebElementFacade addressSubType1;

	@FindBy(xpath = "//*[@id=\"select2-chosen-3\"]")
	private WebElementFacade assignPerson;

	@FindBy(xpath = "/html[1]/body[1]/div[13]/ul[1]/li[2]/ul[1]/li[1]/div[1]")
	private WebElementFacade assignPerson1;

	@FindBy(xpath = "(//button[@id='btnSave'])[2]")
	private WebElementFacade savebtn;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
	private WebElementFacade reqAppointment;

	@FindBy(xpath = "(//span[contains(.,'Save & Continue')])[1]")
	private WebElementFacade saveAndCont1;

	@FindBy(xpath = "(//span[contains(.,'Continue')])[3]")
	private WebElementFacade continueBtn;

	@FindBy(xpath = "//a[contains(.,'Non-Standard Services')]")
	private WebElementFacade nonStdRadio;

	@FindBy(xpath = "//input[@name='Name']")
	private WebElementFacade repairName;

	@FindBy(xpath = "//input[@name='Price']")
	private WebElementFacade repairAmt;

	@FindBy(xpath = "//button[@type='button'][contains(.,'Add More')]")
	private WebElementFacade savebtnNonStd;

	@FindBy(xpath = "//input[contains(@class,'NonStandServiceChk')]")
	private WebElementFacade checkserv;

	@FindBy(xpath = "(//span[@class='ladda-label'][contains(.,'Save & View Agreement')])[2]")
	private WebElementFacade saveCont1;

	@FindBy(xpath = "(//span[@class='ladda-label'][contains(.,'Save & Continue')])[4]")
	private WebElementFacade saveCont2;

	@FindBy(xpath = "//input[contains(@data-val-required,'The IAgreeTerms field is required.')]")
	private WebElementFacade AgreeChckBox;

	@FindBy(xpath = "//input[contains(@name,'txtCusomerSignName')]")
	private WebElementFacade customerName;

	@FindBy(xpath = "//canvas[@id='ctlSignatureT']")
	private WebElementFacade sign;

	@FindBy(xpath = "(//button[@name='btnname'][contains(.,'Save & Continue')])[7]")
	private WebElementFacade saveContFinal;

	@FindBy(xpath = "//button[@name='btnname'][contains(.,'Send Email')]")
	private WebElementFacade sendMailBtn;

	@FindBy(xpath = "//div[@id='uniform-RangeTimeType']")
	private WebElementFacade rangeRadio;

	@FindBy(xpath = "//select[@id='InitialPreferedId']")
	private WebElementFacade timeRange;

	@FindBy(xpath = "//*[@id=\"InitialPreferedId\"]/option[1]")
	private WebElementFacade timeRange1;

	@FindBy(xpath = "(//*[@id=\"uniform-SalesType\"])[2]")
	private WebElementFacade fieldRadio;

	@FindBy(xpath = "//*[@id=\"uniform-rdoFR\"]")
	private WebElementFacade flatRsteRadio;

	@FindBy(xpath = "//textarea[@id='JobDesc']")
	private WebElementFacade jobDesc;

	@FindBy(xpath = "//button[@id='btnAddIssue']")
	private WebElementFacade addJob;

	@FindBy(xpath = "//select[@id='RouteMasterId']")
	private WebElementFacade route;

	@FindBy(xpath = "//*[@id=\"RouteMasterId\"]/optgroup[2]/option")
	private WebElementFacade route1;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElementFacade submitButton;

	@FindBy(xpath = "//input[@id='btnAdvanceSearch']")
	private WebElementFacade advanceSearch;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
	private WebElementFacade desiredOpportunity;

	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade saveWorkOrder;

	@FindBy(xpath = "//a[contains(.,'Appointments')]")
	private WebElementFacade appointment;

	@FindBy(xpath = "//span[contains(text(),'Service Appointment')]")
	private WebElementFacade serviceAppointment;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
	private WebElementFacade desiredOpportunityService;

	@FindBy(xpath = "//button[@id='btnSubWOStatus']")
	private WebElementFacade Recievex3;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-block startRepair']")
	private WebElementFacade startRepair;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-block btnCompleted']")
	private WebElementFacade completeSubWorkOrder;

	@FindBy(xpath = "(//*[@id=\"uniform-PaymentInfoVm_PaymentMode\"])[4]")
	private WebElementFacade paymentMethod;

	@FindBy(xpath = "//canvas[@id='ctlSignatureT']")
	private WebElementFacade customerSign;

	@FindBy(xpath = "//canvas[@id='ctlSignature']")
	private WebElementFacade technicianSign;

	@FindBy(xpath = "//span[contains(text(),'Complete Work Order')]")
	private WebElementFacade completeWorkOrder;

	@FindBy(xpath = "//span[contains(text(),'Send Email')]")
	private WebElementFacade sendMailbtn;

	@FindBy(xpath = "//*[@id=\"uniform-IsAftHrs\"]")
	private WebElementFacade afterHourRadio;

	@FindBy(xpath = "//*[@id=\"uniform-rdoHelper\"]")
	private WebElementFacade HelperRadio;

	@FindBy(xpath = "//*[@id=\"uniform-rdoTM\"]")
	private WebElementFacade timeMaterial;

	public void clickedOnCallTab() {

		try {

			jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
			WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
			wait2.until(ExpectedConditions.elementToBeClickable(callTab));
			callTab.click();

		} catch (Exception e) {
			Log.error("Unable to click Assessment Tab " + e.getMessage());
		}
	}

	public Object getOpportunityPageTittle() {

		return call_page_tittle.getText().trim();
	}

	public void enterLeadDetails() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(companyName));
		companyName.sendKeys("AB Company");
		companySearch.click();
		waitABit(jsonData.get("Time3"));
		scrollToClickAnelement(create_new_company);

		contactName.sendKeys("Thiago");
		contactSearch.click();
		waitABit(jsonData.get("Time3"));
		scrollToClickAnelement(create_new_contact);
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(middleName));
		middleName.sendKeys("C");
		lastName.sendKeys("Messi");
		primaryEmail.sendKeys("testingforpestream@gmail.com");
		cellNo.sendKeys("9878876536");
		secondaryPhone.sendKeys("9549665465");
	}

	public void selectBranchDetils() throws Exception {
		branchName.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(branchName1));
		branchName1.click();
		waitABit(jsonData.get("Time3"));
		try {
			service1.click();
			waitABit(jsonData.get("Time3"));
		} catch (Exception e) {
			service1.submit();
		}
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(service2));
		service2.click();
		waitABit(jsonData.get("Time3"));
		source_ddl.click();
		waitABit(jsonData.get("Time3"));
		customerPortalApp.click();
	}

	public void alertDesc() throws Exception {
		accountAlert.sendKeys("TestAlert");
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(accountDes));
		accountDes.sendKeys("TestDesc");
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(resRadioBtn));
		resRadioBtn.click();

	}

	public void continueClick() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(continuebtn));
		continuebtn.click();

	}

	public void ScheduleEstimationBtnRadio() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ScheduleEstimationRadio));
		ScheduleEstimationRadio.click();
	}

	public void opportunityType() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(residentialRadio));
		residentialRadio.click();

	}

	public void addresslineDetails() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(addressline1));
		addressline1.sendKeys("343 Smith St");
		waitABit(jsonData.get("Time3"));
		zipCode.sendKeys("12345");
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(city));
		city.sendKeys("Dakota");
		addressSubType.click();
		waitABit(jsonData.get("Time3"));
		addressSubType1.click();
		waitABit(jsonData.get("Time3"));
	}

	public void assignedToPerson() throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(assignPerson));
		assignPerson.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(assignPerson1));
		assignPerson1.click();
	}

	public void SaveClick() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(savebtn));
		savebtn.click();
		waitABit(jsonData.get("Time3"));
	}

	public void reqAppointment() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(reqAppointment));
		reqAppointment.click();

	}

	public void saveContBtnSaveBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveAndCont1));
		saveAndCont1.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(continueBtn));
		continueBtn.click();

	}

	public void RadioRepairName() throws Exception {

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(nonStdRadio));
		nonStdRadio.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(repairName));
		repairName.sendKeys("New Repair");
	}

	public void CostSaveBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(repairAmt));
		repairAmt.sendKeys("500");
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(savebtnNonStd));
		savebtnNonStd.click();
		waitABit(jsonData.get("Time3"));
	}

	public void ContSaveTwice() throws Exception {

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(saveCont1));
		scrollUP(saveCont1);
		saveCont1.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveCont2));
		saveCont2.click();

	}

	public void agreeChckBox() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AgreeChckBox));
		AgreeChckBox.click();
	}

	public void signAgree() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(customerName));
		customerName.sendKeys("Test Name");
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(sign));
		sign.click();

	}

	public void saveContBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveContFinal));
		saveContFinal.click();

	}

	public void sendMailBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(sendMailBtn));
		sendMailBtn.click();

	}

	public void rangeTimrDesiredRange() throws Exception {
		rangeRadio.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(timeRange));
		timeRange.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(timeRange1));
		timeRange1.click();

	}

	public void fieldRadioButton() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(fieldRadio));
		fieldRadio.click();

	}

	public void flatRateRadio() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(flatRsteRadio));
		flatRsteRadio.click();
	}

	public void jobDescriptionAddButton() throws Exception {

		jobDesc.sendKeys("NewJob");
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(addJob));
		addJob.click();
		waitABit(2000);

	}

	public void primaryRoute() throws Exception {

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(route));
		route.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(route1));
		route1.click();

	}

	public void saveButton() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(submitButton));
		submitButton.click();

	}

	public void advanceSearchDesiredOpportunity() throws Exception {
		advanceSearch.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(desiredOpportunity));
		desiredOpportunity.click();
	}

	public void savBtnHVACssc() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveWorkOrder));
		saveWorkOrder.click();

	}

	public void serviceAppointment() throws Exception {
		scrollUP(appointment);
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(appointment));
		appointment.click();
		waitABit(jsonData.get("Time3"));
		serviceAppointment.click();

	}

	public void desiredOpportunityServiceAppointment() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(desiredOpportunityService));
		desiredOpportunityService.click();

	}

	public void recievedOnmyWayArrivedStartRepair() throws Exception {
		Recievex3.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Recievex3));
		Recievex3.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(Recievex3));
		Recievex3.click();
		waitABit(jsonData.get("Time3"));
		startRepair.click();
	}

	public void completeSubOrder() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(completeSubWorkOrder));
		completeSubWorkOrder.click();
	}

	public void paymentMode() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(paymentMethod));
		paymentMethod.click();

	}

	public void customerTechnicianSign() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(customerSign));
		customerSign.click();
		waitABit(jsonData.get("Time3"));
		technicianSign.click();
		waitABit(jsonData.get("Time3"));

	}

	public void completeWorkOrder() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(completeWorkOrder));
		completeWorkOrder.click();
		waitABit(jsonData.get("Time3"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(sendMailbtn));
		sendMailbtn.click();
		waitABit(jsonData.get("Time3"));

	}

	public void adressZip() throws Exception {
		addressline1.sendKeys("343 Smith St");
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(zipCode));
		zipCode.sendKeys("12345");

	}

	public void afterHour() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(afterHourRadio));
		afterHourRadio.click();

	}

	public void helperRadio() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(HelperRadio));
		HelperRadio.click();

	}

	public void TimeMaterialRadio() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(timeMaterial));
		timeMaterial.click();

	}

}
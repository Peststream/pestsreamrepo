package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.JsonHelper;
import com.infocrats.utils.Log;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class newUserTermiteResidentialPage extends peststreamPage {
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
	private WebElementFacade companySearchButton;

	@FindBy(xpath = "//a[@class='btn typeHeadSuggestedCreateLink']")
	private WebElementFacade create_new_company;

	@FindBy(xpath = "//div[@class='col-md-3 divSalesContact']//a[@class='btn typeHeadSuggestedCreateLink'][contains(text(),'Create')]")
	WebElementFacade create_new_contact;

	@FindBy(xpath = "//*[@id=\"crmContactSaleshead\"]")
	private WebElementFacade contactName;

	@FindBy(xpath = "//a[@id='btngocrmContactSaleshead']")
	private WebElementFacade contactSearchButton;

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

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[4]/div[2]/div[1]/div[1]/a[1]/span[1]")
	private WebElementFacade department;

	@FindBy(xpath = "//div[@class='select2-result-label'][contains(.,'QA Automation Department1')]")
	private WebElementFacade department1;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[4]/div[4]/div[1]/div[1]")
	private WebElementFacade service;

	@FindBy(xpath = "/html[1]/body[1]/div[15]/ul[1]/li[2]/ul[1]/li[1]/div[1]")
	private WebElementFacade service1;

	@FindBy(xpath = "//*[@id=\"frmGeneralInfo\"]/div/div/div[3]/div[5]/div[2]/div/div")
	private WebElementFacade source_ddl;

	@FindBy(xpath = " //*[@id=\"frmGeneralInfo\"]/div/div/div[3]/div[5]/div[2]/div/div/div/ul/li[2]/a")
	private WebElementFacade customerPortalApp;

	@FindBy(xpath = "//textarea[@id='AccountDescription']")
	private WebElementFacade alert;

	@FindBy(xpath = "//textarea[@id='ProblemDescription']")
	private WebElementFacade desc;

	@FindBy(xpath = "//*[@id=\"uniform-rdoResidential\"]")
	private WebElementFacade residential;

	@FindBy(xpath = "//span[contains(.,'Continue')]")
	private WebElementFacade continueBtn;

	@FindBy(xpath = "//input[@id='CreateWebLead']")
	private WebElementFacade createLead;

	@FindBy(xpath = "//input[contains(@id,'ServiceAddressLine1')]")
	private WebElementFacade addressLine1;

	@FindBy(xpath = "//input[@id='SpRequiredServiceAddressControl_ServiceZipCode']")
	private WebElementFacade zipcode;

	@FindBy(xpath = "//input[@class='form-control SAddressCntrlCity sAddress empty-zillow capitalizeFirstLetter'][contains(@id,'ServiceCityName')]")
	private WebElementFacade city;

	@FindBy(xpath = "//span[@id='select2-chosen-8']")
	private WebElementFacade packageS;

	@FindBy(xpath = "(//div[contains(@role,'option')])[2]")
	private WebElementFacade packageS1;

	@FindBy(xpath = "//span[@id='select2-chosen-9']")
	private WebElementFacade frequency;

	@FindBy(xpath = "(//div[@role='option'])[2]")
	private WebElementFacade frequency1;

	@FindBy(xpath = "//button[@id='addService']")
	private WebElementFacade addBtn;

	@FindBy(xpath = "//input[@id='StandardServices_0_IsSold']")
	private WebElementFacade chckbox;

	@FindBy(xpath = "(//span[contains(.,'Save and Sign Agreement')])[4]")
	private WebElementFacade saveSignAgree;

	@FindBy(xpath = "(//span[@class='ladda-label'][contains(.,'Save & Continue to Setup')])[1]")
	private WebElementFacade saveContSetup;

	@FindBy(xpath = "//select[@id='ddlServices']")
	private WebElementFacade serviceDDl;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]/optgroup[1]/option[1]")
	private WebElementFacade ServiceDDL1;

	@FindBy(xpath = "//a[@class='btn btn-primary btnAddService']")
	private WebElementFacade addBtnService;

	@FindBy(xpath = "//select[@id='ManageFrequencyId']")
	private WebElementFacade frequencyChange;

	@FindBy(xpath = "//select[@id='ManageFrequencyId']//option[contains(text(),'Every Other Week')]")
	private WebElementFacade everotherWeak;

	@FindBy(xpath = "//button[@class='btn green btnDeleteAlertYes']")
	private WebElementFacade Yes;

	@FindBy(xpath = "//select[@id='ManageFrequencyScheduleId']")
	private WebElementFacade schedule;

	@FindBy(xpath = "//option[contains(text(),'fdgdgdgfgdfgg')]")
	private WebElementFacade schedule1;

	@FindBy(xpath = "//select[@id='PrimaryTechEmployeeNo']")
	private WebElementFacade route;

	@FindBy(xpath = "//select[@id='PrimaryTechEmployeeNo']//option[contains(text(),'Name Route (q q)')]")
	private WebElementFacade route1;

	@FindBy(xpath = "//button[@id='btnSubmitSave']")
	private WebElementFacade saveAndGenerate;

	@FindBy(xpath = "//input[@id='StartDate']")
	private WebElementFacade startdate;

	@FindBy(xpath = "/html[1]/body[1]/div[12]/div[1]/table[1]/thead[1]/tr[1]/th[3]")
	private WebElementFacade nextCalender;

	@FindBy(xpath = "//td[contains(text(),'15')]")
	private WebElementFacade date;

	@FindBy(xpath = "//input[@id='EndDate']")
	private WebElementFacade endDate;

	@FindBy(xpath = "//td[contains(text(),'20')]")
	private WebElementFacade endDate1;

	@FindBy(xpath = "//span[@id='genId']")
	private WebElementFacade GenrateOnlineWorkOrder;

	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[1]")
	private WebElementFacade ChckBoxALL;

	@FindBy(xpath = "(//input[contains(@class,'group-checkable')])[1]")
	private WebElementFacade ChkAll;

	@FindBy(xpath = "(//span[contains(.,'Publish Online')])[1]")
	private WebElementFacade publishOnline;

	@FindBy(xpath = "//span[contains(text(),'Appointments')]")
	private WebElementFacade appointment;

	@FindBy(xpath = "//span[contains(text(),'Service Appointment')]")
	private WebElementFacade serviceAppointment;

	@FindBy(xpath = "//tr[1]//td[1]//a[1]")
	private WebElementFacade desiredAppointment;

	@FindBy(xpath = "//button[@id='btnTimeIn']")
	private WebElementFacade currentTime;

	@FindBy(xpath = "(//span[contains(.,'Save & Continue')])[2]")
	private WebElementFacade saveAndContt;

	@FindBy(xpath = "(//span[contains(.,'Continue')])[3]")
	private WebElementFacade continueBtn1;

	@FindBy(xpath = "//canvas[@id='ctlSignatureAgent']")
	private WebElementFacade canvasSign;

	@FindBy(xpath = "(//input[@id='PaymentInfoVm_PaymentMode'])[5]")
	private WebElementFacade noCharge;

	@FindBy(xpath = "(//span[contains(.,'Save & Continue')])[4]")
	private WebElementFacade saveContafterNOCHARGE;

	@FindBy(xpath = "//canvas[@id='ctlSignatureT']")
	private WebElementFacade canvasSign1;

	@FindBy(xpath = "//canvas[@id='ctlSignature']")
	private WebElementFacade canvasSign2;

	@FindBy(xpath = "//button[@id='submit']")
	private WebElementFacade submitBtn;

	@FindBy(xpath = "//span[contains(text(),'Send Email')]")
	private WebElementFacade sendMailBtn;

	@FindBy(xpath = "(//*[@id=\"uniform-SelectServicePackageVm_SelectServiceType\"])[2]")
	private WebElementFacade serviceBundleRadio;

	@FindBy(xpath = "//*[@id=\"divbundle\"]/div[1]/div/div/button/span[1]")
	private WebElementFacade bundleDDL;

	@FindBy(xpath = "//a[@tabindex='0'][contains(.,'QABundle')]")
	private WebElementFacade termiteBundle;

	@FindBy(xpath = "//button[@id='addBundle']")
	private WebElementFacade addBundleBtn;

	@FindBy(xpath = "(//input[@type='checkbox'])[4]")
	private WebElementFacade bundleChckBox;

	@FindBy(xpath = "//*[@id=\"ddlServices\"]/optgroup[1]/option")
	private WebElementFacade serviceddl1;

	@FindBy(xpath = "//input[@id='btnAdvanceSearch']")
	private WebElementFacade advacnceSearch;

	@FindBy(xpath = "//tr[1]//td[15]//a[1]")
	private WebElementFacade createSetupWorkBtn;

	@FindBy(xpath = "//input[@id='SetupStartDate']")
	private WebElementFacade setupStartDate;

	@FindBy(xpath = "(//span[contains(.,'Mark as Lost')])[4]")
	private WebElementFacade MarkAsLost;

	@FindBy(xpath = "//select[@id='SelCancelReasonMasterId']")
	private WebElementFacade reason;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]/option[2]")
	private WebElementFacade reason1;

	@FindBy(xpath = "//textarea[@id='txtCancelReasonDescription']")
	private WebElementFacade descMarkAsLost;

	@FindBy(xpath = "//button[@id='btnCancelReasonSubmit']")
	private WebElementFacade saveMarkAsLost;

	@FindBy(xpath = "(//span[contains(.,'Save')])[6]")
	private WebElementFacade saveBtnOpportunity;

	@FindBy(xpath = "(//button[@id='btnSaveProposal'])[2]")
	private WebElementFacade saveProposal;

	@FindBy(xpath = "(//span[contains(.,'Send Proposal')])[1]")
	private WebElementFacade sendProposal;

	@FindBy(xpath = "(//span[contains(.,'Send Proposal')])[3]")
	private WebElementFacade sendMail;

	@FindBy(xpath = "(//span[contains(.,'Mark as Lost')])[1]")
	private WebElementFacade MarkAsLostSendProposal;

	@FindBy(xpath = "(//span[contains(.,'Send Agreement For Customer Signature')])[1]")
	private WebElementFacade sendAgreementSign;

	@FindBy(xpath = "//button[contains(.,'Send Agreement Link')]")
	private WebElementFacade sendMailbtn;

	@FindBy(xpath = "//input[@id='identifierId']")
	private WebElementFacade mailID;

	@FindBy(xpath = "//span[contains(text(),'Next')]")
	private WebElementFacade NextBtn;

	@FindBy(xpath = "//input[@name='password']")
	private WebElementFacade Pass;

	@FindBy(xpath = "/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")
	private WebElementFacade gmailLogin_btn;

	@FindBy(xpath = "/html[1]/body[1]/div[7]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]")
	private WebElementFacade mailRequired;

	@FindBy(xpath = "//a[contains(text(),'Click Here')]")
	private WebElementFacade clickHereMail;

	@FindBy(xpath = "//input[@id='IAgreeTerms']")
	private WebElementFacade ChckboxIAgree;

	@FindBy(xpath = "//input[@id='txtCusomerSignName']")
	private WebElementFacade TypeName;

	@FindBy(xpath = "//button[@id='btnSubmit']")
	private WebElementFacade SubmitBtn;

	@FindBy(xpath = "//a[contains(text(),'Complete')]")
	private WebElementFacade complete;

	@FindBy(xpath = "(//span[contains(.,'Customer')])[1]")
	private WebElementFacade customer;

	@FindBy(xpath = "(//span[contains(.,'Opportunity')])[1]")
	private WebElementFacade customerOpportunity;

	@FindBy(xpath = "//input[@id='btnAdvanceSearch']")
	private WebElementFacade advanceSearch;

	@FindBy(xpath = "//a[contains(text(),'Non-Standard Services')]")
	private WebElementFacade NonStdServices;

	@FindBy(xpath = "//span[@id='select2-chosen-10']")
	private WebElementFacade deptNonStd;

	@FindBy(xpath = "(//div[@role='option'])[2]")
	private WebElementFacade termite;

	@FindBy(xpath = "//input[@id='SelectServicePackageVm_NonStandardServiceName']")
	private WebElementFacade serviceName;

	@FindBy(xpath = "//button[@id='addNonStdService']")
	private WebElementFacade addNonStdService;

	@FindBy(xpath = "//input[@id='NonStandardServices_0_IsSold']")
	private WebElementFacade chckBoxNonStdservices;

	@FindBy(xpath = "//input[@id='NonStandardServices_0_InitialPrice']")
	private WebElementFacade priceCost;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]/optgroup[2]/option[1]")
	private WebElementFacade NonStdServiceDDL1;

	@FindBy(xpath = "//input[@id='NonStandardServices_0_MaintenancePrice']")
	private WebElementFacade priceCostMain;

	@FindBy(xpath = "//input[@name='ServiceDateStr']")
	private WebElementFacade serviceStartDate;

	@FindBy(xpath = "//select[@id='ManageInitialTechId1']")
	private WebElementFacade routeSelect;

	@FindBy(xpath = "//*[@id=\"ManageInitialTechId1\"]/optgroup[2]/option")
	private WebElementFacade serviceRoute;

	@FindBy(xpath = "//button[@value='Save&Generate']")
	private WebElementFacade saveAndGenrate;

	@FindBy(xpath = "(//span[contains(.,'Save & Continue')])[3]")
	private WebElementFacade saveCont;

	@FindBy(xpath = "(//input[contains(@id,'PaymentMode')])[6]")
	private WebElementFacade paymentMode;

	@FindBy(xpath = "(//span[contains(.,'Save & Continue')])[6]")
	private WebElementFacade saveCont1;

	@FindBy(xpath = "//canvas[@id='ctlSignatureT']")
	private WebElementFacade customerSign;

	@FindBy(xpath = "//canvas[@id='ctlSignature']")
	private WebElementFacade technician1;

	@FindBy(xpath = "(//span[contains(.,'Submit')])[2]")
	private WebElementFacade submitBtn1;

	@FindBy(xpath = "//a[contains(text(),'Schedule Estimation')]")
	private WebElementFacade scheduleEstimation;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[10]/div[11]/div[1]/div[2]/div[5]/div[2]/div[1]/div[1]/a[1]/span[1]")
	private WebElementFacade assignedTo;

	@FindBy(xpath = "//div[@class='select2-result-label'][contains(.,'QA Admin')]")
	private WebElementFacade assignedTo1;

	@FindBy(xpath = "(//span[contains(.,'Save')])[6]")
	private WebElementFacade saveSE;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
	private WebElementFacade desiredOppSales;

	@FindBy(xpath = "(//span[contains(.,'Save & Continue')])[1]")
	private WebElementFacade saveContinuee;

	@FindBy(xpath = "(//span[contains(.,'Continue')])[3]")
	private WebElementFacade continueBtnx;

	@FindBy(xpath = "//*[@id=\"divpackage\"]/div[1]/div/div/button/span[1]")
	private WebElementFacade category;

	@FindBy(xpath = "//a[@tabindex='0'][contains(.,'PestControl')]")
	private WebElementFacade category1;

	@FindBy(xpath = "//select[contains(@name,'Services')]")
	private WebElementFacade serviceS;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/div/div/div/div[2]/div/div/div[2]/div[6]/div/div/form/div/div[4]/div/div/div[1]/div[2]/div[2]/div/select/option[2]")
	private WebElementFacade serviceS1;

	@FindBy(xpath = "//select[@id='Package']")
	private WebElementFacade packAge;

	@FindBy(xpath = "//*[@id=\"Package\"]/option[2]")
	private WebElementFacade packAge1;

	@FindBy(xpath = "//select[@id='Frequencies']")
	private WebElementFacade frquency;

	@FindBy(xpath = "//*[@id=\"Frequencies\"]/option[2]")
	private WebElementFacade frequncy1;

	@FindBy(xpath = "//button[@id='submitserv']")
	private WebElementFacade addBtnServi;

	@FindBy(xpath = "//input[contains(@class,'ServiceChk')]")
	private WebElementFacade chckBoxBundle;

	@FindBy(xpath = "(//span[contains(.,'Save & View Agreement')])[2]")
	private WebElementFacade saveViewAgreement;

	@FindBy(xpath = "(//span[contains(.,'Save & Continue')])[3]")
	private WebElementFacade savecontAgreement;

	@FindBy(xpath = "//input[@id='IAgreeTerms']")
	private WebElementFacade iAgree;

	@FindBy(xpath = "//input[@id='txtCusomerSignName']")
	private WebElementFacade Namebtn;

	@FindBy(xpath = "//canvas[@id='ctlSignatureT']")
	private WebElementFacade cusSign;

	@FindBy(xpath = "(//span[contains(.,'Save & Continue')])[7]")
	private WebElementFacade saveSendMail;

	@FindBy(xpath = "//button[contains(@id,'submitproposal1')]")
	private WebElementFacade send_Proposal;

	@FindBy(xpath = "//span[contains(.,'Send Proposal')]")
	private WebElementFacade senTProposal;

	@FindBy(xpath = "(//span[contains(.,'Send Proposal')])[2]")
	private WebElementFacade sendMialProp;

	@FindBy(xpath = "(//span[contains(.,'Mark as Lost')])[1]")
	private WebElementFacade markasSE;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]/option[2]")
	private WebElementFacade reason2;

	@FindBy(xpath = "//*[@id=\"uniform-RangeTimeType\"]")
	private WebElementFacade rangeTimeRadio;

	@FindBy(xpath = "//select[@id='InitialPreferedId']")
	private WebElementFacade timeRange;

	@FindBy(xpath = "//*[@id=\"InitialPreferedId\"]/option[2]")
	private WebElementFacade timeRange1;

	@FindBy(xpath = "(//*[@id=\"uniform-SalesType\"])[2]")
	private WebElementFacade fieldRadioBtn;

	@FindBy(xpath = "(//span[contains(.,'Mark as Lost')])[4]")
	private WebElementFacade MarkAsLostBeforeSave;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]/option[2]")
	private WebElementFacade reason3;

	public void callTabBtn() {
		try {

			callTab.click();

		} catch (Exception e) {
			Log.error("Unable to click Assessment Tab " + e.getMessage());
		}
	}

	public void enterLeadDetails() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(companyName));
		companyName.click();
		companyName.sendKeys("Mon Inc");

		wait.until(ExpectedConditions.elementToBeClickable(companySearchButton));
		companySearchButton.click();

		wait.until(ExpectedConditions.elementToBeClickable(create_new_company));
		scrollToClickAnelement(create_new_company);

		wait.until(ExpectedConditions.elementToBeClickable(contactName));
		contactName.click();
		contactName.sendKeys("Joey");

		wait.until(ExpectedConditions.elementToBeClickable(contactSearchButton));
		contactSearchButton.click();

		wait.until(ExpectedConditions.elementToBeClickable(create_new_contact));
		scrollToClickAnelement(create_new_contact);

		middleName.sendKeys("M");
		lastName.sendKeys("Roco");
		primaryEmail.sendKeys("testingforpestream@gmail.com");
		cellNo.sendKeys("9878876536");
		secondaryPhone.sendKeys("9549665465");

	}

	public void selectBranchDetils() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(branchName));
		branchName.click();

		wait.until(ExpectedConditions.elementToBeClickable(branchName1));
		branchName1.click();

		wait.until(ExpectedConditions.elementToBeClickable(department));
		department.click();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(department1));
			department1.click();
		} catch (Exception e) {

			department1.submit();
		}
		wait.until(ExpectedConditions.elementToBeClickable(service));

		service.click();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(service1));
			service1.click();
		} catch (Exception e) {
			service1.submit();
		}
		wait.until(ExpectedConditions.elementToBeClickable(source_ddl));
		source_ddl.click();
		wait.until(ExpectedConditions.elementToBeClickable(customerPortalApp));

		customerPortalApp.click();
	}

	public void accAlertDesc() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(alert));
		alert.click();
		alert.sendKeys("Test");

		wait.until(ExpectedConditions.elementToBeClickable(desc));
		desc.click();
		desc.sendKeys("TestDesc");

	}

	public void oppTypeBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(residential));
		residential.click();
		waitABit(jsonData.get("Time3"));

	}

	public void continueBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
		continueBtn.click();
		waitABit(jsonData.get("Time3"));
	}

	public void createLead() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(createLead));
		createLead.click();

	}

	public void addAdressZip() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(addressLine1));
		addressLine1.click();
		addressLine1.sendKeys("Line1");

		wait.until(ExpectedConditions.elementToBeClickable(zipcode));
		zipcode.click();
		zipcode.sendKeys("80201");

		wait.until(ExpectedConditions.elementToBeClickable(city));
		city.click();
		city.sendKeys("Austin");
	}

	public void packageFreqBillDDLAddBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(packageS));
		packageS.click();

		wait.until(ExpectedConditions.elementToBeClickable(packageS1));
		packageS1.click();

		wait.until(ExpectedConditions.elementToBeClickable(frequency));
		frequency.click();

		wait.until(ExpectedConditions.elementToBeClickable(frequency1));
		frequency1.click();

		wait.until(ExpectedConditions.elementToBeClickable(addBtn));
		addBtn.click();

	}

	public void chckBoxBTN() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(chckbox));
		chckbox.click();

	}

	public void saveSignAgree() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveSignAgree));
		saveSignAgree.click();

	}

	public void ContSetup() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveContSetup));
		saveContSetup.click();
	}

	public void serviceDDLADD() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(serviceDDl));
		serviceDDl.click();

		wait.until(ExpectedConditions.elementToBeClickable(ServiceDDL1));
		ServiceDDL1.click();

		wait.until(ExpectedConditions.elementToBeClickable(addBtnService));
		addBtnService.click();

	}

	public void freqokBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(frequencyChange));
		frequencyChange.click();

		wait.until(ExpectedConditions.elementToBeClickable(everotherWeak));
		everotherWeak.click();

		wait.until(ExpectedConditions.elementToBeClickable(Yes));
		Yes.click();

		wait.until(ExpectedConditions.elementToBeClickable(schedule));
		schedule.click();

		wait.until(ExpectedConditions.elementToBeClickable(schedule1));
		schedule1.click();

	}

	public void routeSelectSaveAndGenerate() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(route));
		route.click();

		wait.until(ExpectedConditions.elementToBeClickable(route1));
		route1.click();

		wait.until(ExpectedConditions.elementToBeClickable(saveAndGenerate));
		saveAndGenerate.click();

	}

	public void StartDateEndDate() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(startdate));
		startdate.click();

		wait.until(ExpectedConditions.elementToBeClickable(nextCalender));
		nextCalender.click();

		wait.until(ExpectedConditions.elementToBeClickable(date));
		date.click();

		wait.until(ExpectedConditions.elementToBeClickable(endDate));
		endDate.click();

		wait.until(ExpectedConditions.elementToBeClickable(nextCalender));
		nextCalender.click();

		wait.until(ExpectedConditions.elementToBeClickable(nextCalender));
		nextCalender.click();

		wait.until(ExpectedConditions.elementToBeClickable(endDate1));
		endDate1.click();

	}

	public void GenerateOnlineWOSelectAllPublishOnline() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(GenrateOnlineWorkOrder));
		GenrateOnlineWorkOrder.click();
		wait.until(ExpectedConditions.elementToBeClickable(ChckBoxALL));
		try {
			ChckBoxALL.click();
			wait.until(ExpectedConditions.elementToBeClickable(ChkAll));
		} catch (Exception e) {
			ChkAll.click();
			wait.until(ExpectedConditions.elementToBeClickable(publishOnline));
		}

		publishOnline.click();
		waitABit(4000);

	}

	public void AppointmentTabServiceAppointment() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(appointment));
		scrollUP(appointment);
		appointment.click();

		wait.until(ExpectedConditions.elementToBeClickable(serviceAppointment));
		serviceAppointment.click();

	}

	public void desiredOppCurrentTime() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(desiredAppointment));
		desiredAppointment.click();

		wait.until(ExpectedConditions.elementToBeClickable(currentTime));
		currentTime.click();

	}

	public void SaveContBtnContBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveAndContt));
		saveAndContt.click();

		wait.until(ExpectedConditions.elementToBeClickable(continueBtn1));
		continueBtn1.click();

	}

	public void SignAgreementDateBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(canvasSign));
		canvasSign.click();

	}

	public void PaymentModeSaveCont() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(noCharge));
		noCharge.click();

		wait.until(ExpectedConditions.elementToBeClickable(saveContafterNOCHARGE));
		saveContafterNOCHARGE.click();

	}

	public void TechnicianCustomerSignDate() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(canvasSign1));
		canvasSign1.click();

		wait.until(ExpectedConditions.elementToBeClickable(canvasSign2));
		canvasSign2.click();

	}

	public void submitSendMail() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
		submitBtn.click();

		wait.until(ExpectedConditions.elementToBeClickable(sendMailBtn));
		sendMailBtn.click();

	}

	public void serviceBundleRadio() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(serviceBundleRadio));
		serviceBundleRadio.click();

	}

	public void serviceBundleDDLFreqBilling() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(bundleDDL));
		bundleDDL.click();

		wait.until(ExpectedConditions.elementToBeClickable(termiteBundle));
		termiteBundle.click();

	}

	public void AddButtonBundle() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(addBundleBtn));
		addBundleBtn.click();

	}

	public void chckboxBundle() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(bundleChckBox));
		bundleChckBox.click();

	}

	public void serviceDDLbundleAddBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(serviceDDl));
		serviceDDl.click();

		wait.until(ExpectedConditions.elementToBeClickable(serviceddl1));
		serviceddl1.click();

		wait.until(ExpectedConditions.elementToBeClickable(addBtnService));
		addBtnService.click();

	}

	public void generatePublish() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveAndGenerate));
		saveAndGenerate.click();

	}

	public void advcSearchCreateSetup() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(advacnceSearch));
		advacnceSearch.click();

		wait.until(ExpectedConditions.elementToBeClickable(createSetupWorkBtn));
		createSetupWorkBtn.click();

	}

	public void setupStartDate() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(setupStartDate));
		setupStartDate.click();

		wait.until(ExpectedConditions.elementToBeClickable(nextCalender));
		nextCalender.click();

		wait.until(ExpectedConditions.elementToBeClickable(date));
		date.click();

	}

	public void freqSchedule() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(frequencyChange));
		frequencyChange.click();

		wait.until(ExpectedConditions.elementToBeClickable(everotherWeak));
		everotherWeak.click();

		wait.until(ExpectedConditions.elementToBeClickable(schedule));
		schedule.click();

		wait.until(ExpectedConditions.elementToBeClickable(schedule1));
		schedule1.click();

	}

	public void MarkAsLost() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(MarkAsLost));
		MarkAsLost.click();

	}

	public void DescSaveReason() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(reason));
		reason.click();

		wait.until(ExpectedConditions.elementToBeClickable(reason1));
		reason1.click();

		wait.until(ExpectedConditions.elementToBeClickable(descMarkAsLost));
		descMarkAsLost.sendKeys("Lost");

		wait.until(ExpectedConditions.elementToBeClickable(saveMarkAsLost));
		saveMarkAsLost.click();

	}

	public void saveBtnOpp() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveBtnOpportunity));
		saveBtnOpportunity.click();

	}

	public void saveProposalBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveProposal));
		saveProposal.click();

	}

	public void sendProposal() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(sendProposal));
		sendProposal.click();

		wait.until(ExpectedConditions.elementToBeClickable(sendMail));
		sendMail.click();

	}

	public void MarkAsLostSendProposal() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(MarkAsLostSendProposal));
		MarkAsLostSendProposal.click();

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		getDriver().switchTo().alert().accept();

	}

	public void sendAgreementMailSend() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(sendAgreementSign));
		sendAgreementSign.click();

		wait.until(ExpectedConditions.elementToBeClickable(sendMailbtn));
		sendMailbtn.click();

	}

	public void newChrome_tap() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		String allWindowHandle = getDriver().getWindowHandle();
		getDriver().switchTo().window(allWindowHandle);
		getDriver().get(
				"https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

	}

	public void open_gmail() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(mailID));
		mailID.click();
		mailID.sendKeys("testingforpestream@gmail.com");

		wait.until(ExpectedConditions.elementToBeClickable(NextBtn));
		NextBtn.click();

		wait.until(ExpectedConditions.elementToBeClickable(Pass));
		Pass.sendKeys("manjeet1234");

		wait.until(ExpectedConditions.elementToBeClickable(NextBtn));
		NextBtn.click();
	}

	public void open_mail() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		try {

			wait.until(ExpectedConditions.elementToBeClickable(mailRequired));

			scrollUP(mailRequired);
			mailRequired.click();
		} catch (Exception e) {
			mailRequired.submit();

		}
	}

	public void open_agreement() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(clickHereMail));
		clickHereMail.click();
		waitABit(jsonData.get("Time3"));
		for (String agreement : getDriver().getWindowHandles()) // iterating on child windows
		{
			getDriver().switchTo().window(agreement);
		}

	}

	public void dashBoaRd() {
		String allWindowHandle = getDriver().getWindowHandle();
		getDriver().switchTo().window(allWindowHandle);
		getDriver().get("https://pestream.com/");
		waitABit(jsonData.get("Time3"));

	}

	public void completeTab() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(complete));
		scrollUP(complete);
		complete.click();
		waitABit(jsonData.get("Time3"));

	}

	public void agreeTermsChck() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ChckboxIAgree));
		ChckboxIAgree.click();

		wait.until(ExpectedConditions.elementToBeClickable(TypeName));
		TypeName.sendKeys("Test Name");

		wait.until(ExpectedConditions.elementToBeClickable(SubmitBtn));
		SubmitBtn.click();
		waitABit(jsonData.get("Time3"));

	}

	public void advanceSearch() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(advanceSearch));
		advanceSearch.click();
	}

	public void customerOpportunity() throws Exception {
		waitABit(jsonData.get("Time3"));
		scrollUP(customer);

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(customer));
		customer.click();

		wait.until(ExpectedConditions.elementToBeClickable(customerOpportunity));
		customerOpportunity.click();

		waitABit(jsonData.get("Time3"));

	}

	public void NonStdService() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(NonStdServices));
		NonStdServices.click();
		waitABit(jsonData.get("Time3"));

	}

	public void deptServiceNames() throws Exception {

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(deptNonStd));
		deptNonStd.click();

		wait.until(ExpectedConditions.elementToBeClickable(termite));
		termite.click();

		wait.until(ExpectedConditions.elementToBeClickable(serviceName));
		serviceName.sendKeys("NonStdServiceName");
		waitABit(jsonData.get("Time3"));

	}

	public void addButtonclick() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(addNonStdService));
		addNonStdService.click();
		waitABit(jsonData.get("Time3"));

	}

	public void chckboxServicePrice() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(chckBoxNonStdservices));
		chckBoxNonStdservices.click();

		wait.until(ExpectedConditions.elementToBeClickable(priceCost));
		priceCost.sendKeys("200");

		wait.until(ExpectedConditions.elementToBeClickable(priceCostMain));
		priceCostMain.sendKeys("50");
		waitABit(jsonData.get("Time3"));

	}

	public void NonStdServiceAddbtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(serviceDDl));
		serviceDDl.click();

		wait.until(ExpectedConditions.elementToBeClickable(NonStdServiceDDL1));
		NonStdServiceDDL1.click();

		wait.until(ExpectedConditions.elementToBeClickable(addBtnService));
		addBtnService.click();
		waitABit(jsonData.get("Time3"));

	}

	public void serviceStartDate() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(serviceStartDate));
		serviceStartDate.click();

		wait.until(ExpectedConditions.elementToBeClickable(nextCalender));
		nextCalender.click();

		wait.until(ExpectedConditions.elementToBeClickable(date));
		date.click();
		waitABit(jsonData.get("Time3"));

	}

	public void RouteGenerateBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(routeSelect));
		routeSelect.click();

		wait.until(ExpectedConditions.elementToBeClickable(serviceRoute));
		serviceRoute.click();

		wait.until(ExpectedConditions.elementToBeClickable(saveAndGenrate));
		saveAndGenrate.click();
		waitABit(jsonData.get("Time3"));

	}

	public void saveContNext() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveAndContt));
		saveAndContt.click();
		waitABit(jsonData.get("Time3"));

	}

	public void saveContinue() throws Exception {
		waitABit(jsonData.get("Time3"));
		scrollUP(saveCont);

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveCont));
		saveCont.click();

	}

	public void paymentConyinue() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(paymentMode));
		paymentMode.click();

		wait.until(ExpectedConditions.elementToBeClickable(saveCont1));
		saveCont1.click();

	}

	public void signCustomerTechnician() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(customerSign));
		customerSign.click();

		wait.until(ExpectedConditions.elementToBeClickable(technician1));
		technician1.click();

		waitABit(jsonData.get("Time3"));

	}

	public void submitSendMailbtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(customerSign));
		submitBtn1.click();

		wait.until(ExpectedConditions.elementToBeClickable(customerSign));
		sendMailBtn.click();

		waitABit(jsonData.get("Time3"));

	}

	public void ScheduleEstimation() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(scheduleEstimation));
		scheduleEstimation.click();
		waitABit(jsonData.get("Time3"));

	}

	public void AssignedToEmp() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(assignedTo));
		assignedTo.click();

		wait.until(ExpectedConditions.elementToBeClickable(assignedTo1));
		assignedTo1.click();
		waitABit(jsonData.get("Time3"));

	}

	public void svaeBtnScheduleEst() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveSE));
		saveSE.click();
		waitABit(jsonData.get("Time3"));
	}

	public void desiredOPP() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(desiredOppSales));
		desiredOppSales.click();
		waitABit(jsonData.get("Time3"));
	}

	public void saveContBtn() throws Exception {

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));

		try {
			wait.until(ExpectedConditions.elementToBeClickable(saveContinuee));
			saveContinuee.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(saveContinuee));
			scrollUP(saveContinuee);
			saveContinuee.submit();
		}
		wait.until(ExpectedConditions.elementToBeClickable(continueBtnx));
		continueBtnx.click();
		waitABit(jsonData.get("Time3"));
	}

	public void addingDesiredCountry() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(category));
		category.click();

		wait.until(ExpectedConditions.elementToBeClickable(category1));
		category1.click();

		wait.until(ExpectedConditions.elementToBeClickable(serviceS));
		serviceS.click();

		wait.until(ExpectedConditions.elementToBeClickable(serviceS1));
		serviceS1.click();

		wait.until(ExpectedConditions.elementToBeClickable(packAge));
		packAge.click();

		wait.until(ExpectedConditions.elementToBeClickable(packAge1));
		packAge1.click();

		wait.until(ExpectedConditions.elementToBeClickable(frquency));
		frquency.click();

		wait.until(ExpectedConditions.elementToBeClickable(frequncy1));
		frequncy1.click();

		wait.until(ExpectedConditions.elementToBeClickable(addBtnServi));
		addBtnServi.click();

		waitABit(jsonData.get("Time3"));
	}

	public void SelectServiceViewAgreement() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(chckBoxBundle));
		chckBoxBundle.click();
		waitABit(jsonData.get("Time3"));

	}

	public void saveContBtnx2() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveViewAgreement));
		saveViewAgreement.click();

		wait.until(ExpectedConditions.elementToBeClickable(savecontAgreement));
		scrollUP(savecontAgreement);
		savecontAgreement.click();
		waitABit(jsonData.get("Time3"));
	}

	public void agreeTermsNameSign() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(iAgree));
		iAgree.click();

		wait.until(ExpectedConditions.elementToBeClickable(Namebtn));
		Namebtn.sendKeys("Sameple Name");

		wait.until(ExpectedConditions.elementToBeClickable(cusSign));
		cusSign.click();
		waitABit(jsonData.get("Time3"));
	}

	public void saveContBtnX() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveSendMail));
		saveSendMail.click();
		waitABit(jsonData.get("Time3"));
	}

	public void sendMailBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(sendMailBtn));
		sendMailBtn.click();
		waitABit(jsonData.get("Time3"));

	}

	public void savePropp() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(send_Proposal));
		send_Proposal.click();
		waitABit(jsonData.get("Time3"));

	}

	public void sebdProposall() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(senTProposal));
		senTProposal.click();
		waitABit(jsonData.get("Time3"));
	}

	public void senProposalMail() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(sendMialProp));
		sendMialProp.click();
		waitABit(jsonData.get("Time3"));

	}

	public void markAsLostButton() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(markasSE));
		markasSE.click();

		wait.until(ExpectedConditions.elementToBeClickable(reason));
		reason.click();

		wait.until(ExpectedConditions.elementToBeClickable(reason2));
		reason2.click();

		wait.until(ExpectedConditions.elementToBeClickable(descMarkAsLost));
		descMarkAsLost.sendKeys("Lost");

		wait.until(ExpectedConditions.elementToBeClickable(saveMarkAsLost));
		saveMarkAsLost.click();

		waitABit(jsonData.get("Time3"));
	}

	public void rangeTimeTimeRange() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(rangeTimeRadio));
		rangeTimeRadio.click();

		wait.until(ExpectedConditions.elementToBeClickable(timeRange));
		timeRange.click();

		wait.until(ExpectedConditions.elementToBeClickable(timeRange1));
		timeRange1.click();

		waitABit(jsonData.get("Time3"));

	}

	public void fieldRadioButton() {
		fieldRadioBtn.click();
		waitABit(2000);

	}

	public void markAsLostSE() {
		MarkAsLostBeforeSave.click();
		waitABit(3000);
		reason.click();
		waitABit(2000);
		reason3.click();
		waitABit(2000);
		descMarkAsLost.sendKeys("Lost");
		waitABit(1000);
		saveMarkAsLost.click();
		waitABit(4000);

	}
}

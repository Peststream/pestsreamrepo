package com.infocrats.pageObjects;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.Log;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class newUserTermiteResidentialPage extends peststreamPage {
	BaseUtills utills = new BaseUtills();
	
	
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
	
	@FindBy(xpath="//div[@class='col-md-3 divSalesContact']//a[@class='btn typeHeadSuggestedCreateLink'][contains(text(),'Create')]")
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
	public void enterLeadDetails() {
		companyName.sendKeys("Mon Inc");
		waitABit(1500);
		companySearchButton.click();
		waitABit(1500);
		scrollToClickAnelement(create_new_company);
		
		contactName.sendKeys("Joey");
		waitABit(1500);
		contactSearchButton.click();
		waitABit(1500);
		scrollToClickAnelement(create_new_contact);
		
		middleName.sendKeys("M");
		lastName.sendKeys("Roco");
		primaryEmail.sendKeys("testingforpestream@gmail.com");
		cellNo.sendKeys("9878876536");
		secondaryPhone.sendKeys("9549665465");	
		
		waitABit(2000);
	}


	public void selectBranchDetils() {
		 branchName.click();
		 waitABit(2000);
		 branchName1.click();
		 waitABit(2000);
		 department.click();
		 waitABit(2000);
		try{
			department1.click();
			waitABit(2000);
		}
		catch(Exception e) {
			department1.submit();
		}
		waitABit(2000);
		service.click();
		waitABit(2000);
		try {
			service1.click();
			waitABit(2000);
		}
		catch(Exception e)
		{
			service1.submit();
		}
		waitABit(2000);
		
		source_ddl.click();
		waitABit(2000);
		customerPortalApp.click();
		waitABit(2000);
}
	
	
	public void accAlertDesc() {
		alert.sendKeys("Test");
	
		desc.sendKeys("TestDesc");
		
}
	
	
	public void oppTypeBtn() {
		
		residential.click();
		waitABit(2000);
		
		
	}
	public void continueBtn() {
		
		 continueBtn.click();
		 waitABit(2000);
	}
	public void createLead() {
		createLead.click();
		
	}
	public void addAdressZip() {
		addressLine1.sendKeys("Line1");
		waitABit(2000);
		zipcode.sendKeys("80201");
		waitABit(2000);
		city.sendKeys("Austin");
	}
	public void packageFreqBillDDLAddBtn() {
		waitABit(3000); 
		
		packageS.click();
		waitABit(2000);
			
		packageS1.click();
		waitABit(2000);
			
		frequency.click();
		waitABit(2000);	
			
		frequency1.click();
		waitABit(2000);
		
		addBtn.click();
		waitABit(4000);
	}
	public void chckBoxBTN() {
		chckbox.click();
		waitABit(2000);
		
	}
	public void saveSignAgree() {
		 saveSignAgree.click();
		 waitABit(4000);
	}
	public void ContSetup() {
		saveContSetup.click();
		waitABit(4000);

	}
	public void serviceDDLADD() {
		
		
		serviceDDl.click();
		waitABit(2000);
		ServiceDDL1.click();
		waitABit(2000);
		addBtnService.click();
		waitABit(2000);
}
	public void freqokBtn() {
	
		frequencyChange.click();
		waitABit(2000);
		 everotherWeak.click();
		 waitABit(2000);
		 Yes.click();
		 waitABit(2000);
		
		schedule.click();
		waitABit(2000);
		schedule1.click();
		waitABit(2000);
		
		
	
		
	}
	public void routeSelectSaveAndGenerate() {
	
		
		route.click();
		waitABit(2000);
		route1.click();
		waitABit(2000);
		saveAndGenerate.click();		
		waitABit(4000);
}
	public void StartDateEndDate() {
		startdate.click();
		waitABit(2000);
		
		nextCalender.click();
		waitABit(2000);
		
		 date.click();
		 waitABit(2000);
		
		 endDate.click();
		 waitABit(2000);
		 nextCalender.click();
			waitABit(2000);
			nextCalender.click();
			waitABit(2000);
		
		 endDate1.click();
		 waitABit(2000);
		 
		
	}
	public void GenerateOnlineWOSelectAllPublishOnline() {
		 GenrateOnlineWorkOrder.click();
		 waitABit(4000);
		 try{
			 ChckBoxALL.click();
			 waitABit(2000);
		 }
		 catch(Exception e) {
			 ChkAll.click(); 
			 waitABit(2000);
		 }
		
		
		publishOnline.click();
		waitABit(4000);
		
	}
	public void AppointmentTabServiceAppointment() {
		scrollUP(appointment);
		
		appointment.click();
		waitABit(2000);
		
		serviceAppointment.click();
		waitABit(2000);
		

		
	}
	public void desiredOppCurrentTime() {
		desiredAppointment.click();
		waitABit(3000);
		
		currentTime.click();
		waitABit(2000);
		
	}
	public void SaveContBtnContBtn() {

		
		saveAndContt.click();
		waitABit(3000);
		
		continueBtn1.click();
		waitABit(3000);
		
		
	}
	public void SignAgreementDateBtn() {
		canvasSign.click();
		waitABit(2000);
	}
	public void PaymentModeSaveCont() {
		noCharge.click();
		waitABit(2000);
		
		saveContafterNOCHARGE.click();
		waitABit(2000);
		
		
	}
	public void TechnicianCustomerSignDate() {
		canvasSign1.click();
		waitABit(2000);
		canvasSign2.click();
		waitABit(2000);
		
		
		
	}
	public void submitSendMail() {
		
		
		submitBtn.click();
		waitABit(6000);
		sendMailBtn.click();
		waitABit(4000);
		
	}
	public void serviceBundleRadio() {
		 serviceBundleRadio.click();
		 waitABit(2000);
		
		
	}
	public void serviceBundleDDLFreqBilling() {
		bundleDDL.click();
		waitABit(2000);
		termiteBundle.click();
		waitABit(2000);
		
	}
	public void AddButtonBundle() {
		addBundleBtn.click();
		waitABit(2000);
	}
	public void chckboxBundle() {
		bundleChckBox.click();
		waitABit(2000);
	}
	public void serviceDDLbundleAddBtn() {
		serviceDDl.click();
		waitABit(2000);
		
		serviceddl1.click();
		waitABit(2000);
		addBtnService.click();
		waitABit(2000);
	}
	public void generatePublish() {
		saveAndGenerate.click();
		waitABit(2000);
		
	}
	public void advcSearchCreateSetup() {
		advacnceSearch.click();
		waitABit(2000);
		createSetupWorkBtn.click();
		waitABit(2000);
		
		
	}
	public void setupStartDate() {
		setupStartDate.click();
		waitABit(2000);
		nextCalender.click();
		waitABit(2000);
		date.click();
		waitABit(2000);
		
		
	}
	public void freqSchedule() {
		frequencyChange.click();
		waitABit(2000);
		everotherWeak.click();
		waitABit(2000);
		schedule.click();
		waitABit(2000);
		schedule1.click();
		waitABit(2000);
	}
	public void MarkAsLost() {
		MarkAsLost.click();
		waitABit(2000);
		
	}
	public void DescSaveReason() {
		reason.click();
		waitABit(2000);
		reason1.click();
		waitABit(2000);
		descMarkAsLost.sendKeys("Lost");
		waitABit(2000);
		 saveMarkAsLost.click();	
		 waitABit(4000);
	}
	public void saveBtnOpp() {
		saveBtnOpportunity.click();
		
		waitABit(6000);
		
		
	}
	public void saveProposalBtn() {
		saveProposal.click();
		waitABit(5000);		
		
	}
	public void sendProposal() {
		sendProposal.click();
		waitABit(5000);
		sendMail.click();
		waitABit(4000);
	}
	public void MarkAsLostSendProposal() {
		MarkAsLostSendProposal.click();
		waitABit(500);
		getDriver().switchTo().alert().accept();
		waitABit(4000);
	}
	public void sendAgreementMailSend() {
		sendAgreementSign.click();
		waitABit(2000);
		sendMailbtn.click();
		waitABit(4000);
	}
	
	
	
public void newChrome_tap() {
		
		String allWindowHandle = getDriver().getWindowHandle();
		getDriver().switchTo().window(allWindowHandle);
		getDriver().get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		waitABit(2000);
	}

	public void open_gmail() {
	
		 mailID.sendKeys("testingforpestream@gmail.com");
		 NextBtn.click();
		 waitABit(3000);
		 Pass.sendKeys("manjeet1234");
		 NextBtn.click();
}

	public void open_mail() {
		
		try{
			waitABit(3000);
		
			scrollUP(mailRequired);
			mailRequired.click();
		}
		catch(Exception e) {
			mailRequired.submit();
			waitABit(2000);
		}
	}

	public void open_agreement() {
		clickHereMail.click();
		waitABit(3000);
		  for(String agreement :getDriver().getWindowHandles()) //iterating on child windows
		    {
		    getDriver().switchTo().window(agreement);
		}
		    
		
		
		
		
	}
public void dashBoaRd() {
		String allWindowHandle = getDriver().getWindowHandle();
		getDriver().switchTo().window(allWindowHandle);
		getDriver().get("https://pestream.com/");
		waitABit(2000);
		
	}

	public void completeTab() {
		scrollUP(complete);
		complete.click();
		waitABit(6000);
		
		
	}

	

	public void agreeTermsChck() {
		ChckboxIAgree.click();
    	waitABit(2000);
    	
    	TypeName.sendKeys("Test Name");
    	
    	
    	SubmitBtn.click();
    	waitABit(3000);

		
	}
	public void advanceSearch() {
		advanceSearch.click();
	}
	public void customerOpportunity() {
	
		scrollUP(customer);
		customer.click();
		waitABit(2000);
		customerOpportunity.click();
		waitABit(2000);
		
	}
	public void NonStdService() {
		NonStdServices.click();
		waitABit(2000);	
		
		
	}
	public void deptServiceNames() {
		
		deptNonStd.click();
		waitABit(2000);	
		termite.click();
		waitABit(2000);	
		serviceName.sendKeys("NonStdServiceName");
		waitABit(2000);	
		
	}
	public void addButtonclick() {
		addNonStdService.click();
		waitABit(2000);	
		
	}
	public void chckboxServicePrice() {
		chckBoxNonStdservices.click();
		
		priceCost.sendKeys("200");
		waitABit(2000);	
		priceCostMain.sendKeys("50");
		waitABit(2000);	
		
	}
	public void NonStdServiceAddbtn() {
		serviceDDl.click();
		waitABit(2000);
		NonStdServiceDDL1.click();
		waitABit(2000);
		addBtnService.click();
		waitABit(2000);
		
	}
	public void serviceStartDate() {
		serviceStartDate.click();
		waitABit(2000);
		
		nextCalender.click();
		waitABit(2000);
		
		 date.click();
		 waitABit(2000);
		
	}
	public void RouteGenerateBtn() {
		
		routeSelect.click();
		waitABit(2000);
		serviceRoute.click();
		waitABit(2000);
		saveAndGenrate.click();
		waitABit(3000);
		
		
		
	}
	public void saveContNext() {
		saveAndContt.click();
		waitABit(3000);
		
		
	}
	public void saveContinue() {
		scrollUP(saveCont);
		saveCont.click();
		
	}
	public void paymentConyinue() {
		paymentMode.click();
		waitABit(2000);
		
		saveCont1.click();
		waitABit(2000);
		
		
	
		
	}
	public void signCustomerTechnician() {
		customerSign.click();
		waitABit(500);
		technician1.click();
		waitABit(500);
		
	}
	public void submitSendMailbtn() {
		submitBtn1.click();
		waitABit(6000);
		sendMailBtn.click();
		waitABit(4000);
		
	}
	public void ScheduleEstimation() {
		 scheduleEstimation.click();
		 waitABit(2000);
			
		
	}
	public void AssignedToEmp() {
		assignedTo.click();		
		waitABit(2000);
		assignedTo1.click();
		waitABit(2000);

	}
	public void svaeBtnScheduleEst() {
		 saveSE.click();
		 waitABit(4000);
}
			
		
			
public void desiredOPP() {
desiredOppSales.click();
waitABit(4000);
}
	
public void saveContBtn() {
		try{
			saveContinuee.click();
		}
		catch(Exception e) {
			waitABit(4000);
			scrollUP(saveContinuee);
			saveContinuee.submit();
		}
waitABit(4000);
continueBtnx.click();
waitABit(4000);
}
	
public void addingDesiredCountry() {
category.click();
waitABit(2000);
	category1.click();
	waitABit(2000);
	serviceS.click();
	waitABit(2000);
	serviceS1.click();
	waitABit(2000);
	packAge.click();
	waitABit(2000);
	
	packAge1.click();
	waitABit(2000);
	
	frquency.click();
	waitABit(2000);
	frequncy1.click();
	waitABit(2000);
	addBtnServi.click();
	waitABit(3000);
}


public void SelectServiceViewAgreement() {
	chckBoxBundle.click();
	waitABit(2000);	
		
	}
	public void saveContBtnx2() {
		saveViewAgreement.click();
		waitABit(4000);
		
		scrollUP(savecontAgreement);
		savecontAgreement.click();
		waitABit(3000);
	}
	public void agreeTermsNameSign() {
		iAgree.click();
		waitABit(2000);
		
		Namebtn.sendKeys("Sameple Name");
		waitABit(2000);
		
		cusSign.click();	
		waitABit(2000);
	}
	public void saveContBtnX() {
		saveSendMail.click();
		waitABit(6000);
	}
	
	public void sendMailBtn() {
		sendMailBtn.click();
		waitABit(4000);
		
	}
	public void savePropp() {
		send_Proposal.click();
		waitABit(2000);

		
	}
	public void sebdProposall() {
		senTProposal.click();
		waitABit(6000);
	}
	public void senProposalMail() {
		sendMialProp.click();
		waitABit(4000);
		
	}
	public void markAsLostButton() {
		markasSE.click();
		waitABit(3000);
		
		reason.click();
		waitABit(2000);
		reason2.click();
		waitABit(2000);
		descMarkAsLost.sendKeys("Lost");
		waitABit(1000);
		saveMarkAsLost.click();
		waitABit(4000);
	}
	public void rangeTimeTimeRange() {
		rangeTimeRadio.click();
		waitABit(2000);
		timeRange.click();
		waitABit(2000);
		timeRange1.click();
		waitABit(2000);
		
		
		
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


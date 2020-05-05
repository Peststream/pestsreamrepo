package com.infocrats.pageObjects;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.Log;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class newUserHvacPage extends peststreamPage {
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
	private WebElementFacade companySearch;
	
	
	@FindBy(xpath = "//a[@class='btn typeHeadSuggestedCreateLink']")
	private WebElementFacade create_new_company;
	
	@FindBy(xpath="//div[@class='col-md-3 divSalesContact']//a[@class='btn typeHeadSuggestedCreateLink'][contains(text(),'Create')]")
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

			callTab.click();

		} catch (Exception e) {
			Log.error("Unable to click Assessment Tab " + e.getMessage());
		}
	}

	public Object getOpportunityPageTittle() {

		return call_page_tittle.getText().trim();
	}

	
	

	public void enterLeadDetails() {
		companyName.sendKeys("AB Company");
		companySearch.click();
		waitABit(1500);
		scrollToClickAnelement(create_new_company);
		
		contactName.sendKeys("Thiago");
		contactSearch.click();
		waitABit(1500);
		scrollToClickAnelement(create_new_contact);
		
		middleName.sendKeys("C");
		lastName.sendKeys("Messi");
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
		try{
			service1.click();
			waitABit(2000);
		}
		catch(Exception e)
		{
			service1.submit();
		}
		waitABit(2000);
		service2.click();
		waitABit(2000);
		source_ddl.click();
		waitABit(2000);
		customerPortalApp.click();
		waitABit(2000);
	}



	public void alertDesc() {
		accountAlert.sendKeys("TestAlert");
		waitABit(2000);
		accountDes.sendKeys("TestDesc");
		waitABit(2000);
		resRadioBtn.click();
		waitABit(2000);
		
	}


	public void continueClick() {
		
		continuebtn.click();
		waitABit(2000);
		
	}

	public void ScheduleEstimationBtnRadio() {
		ScheduleEstimationRadio.click();	
		waitABit(2000);
	}

	public void opportunityType() {
		residentialRadio.click();
		
	}

	public void addresslineDetails() {
		addressline1.sendKeys("343 Smith St");
		waitABit(2000);
		
		 zipCode.sendKeys("12345");
		 waitABit(2000);
		city.sendKeys("Dakota");
		addressSubType.click();
		waitABit(2000);
		
		addressSubType1.click();
		waitABit(2000);
	}

	public void assignedToPerson() {
		assignPerson.click();
		waitABit(2000);
		
		assignPerson1.click();
		waitABit(2000);
	}

	public void SaveClick() {
		savebtn.click();
		waitABit(5000);
	}

	public void reqAppointment() {
		reqAppointment.click();
		waitABit(5000);
		
		
		
		
	}

	public void saveContBtnSaveBtn() {
		saveAndCont1.click();
		waitABit(2000);
		continueBtn.click();
		waitABit(2000);
		
	}

	public void RadioRepairName() {

		nonStdRadio.click();
		waitABit(2000);
		
		repairName.sendKeys("New Repair");
		waitABit(2000);
		}

	public void CostSaveBtn() {

		repairAmt.sendKeys("500");
		waitABit(2000);
		
		savebtnNonStd.click();
		waitABit(3000);
//		checkserv.click();
		waitABit(1000);
	}

	public void ContSaveTwice() {
 
		scrollUP(saveCont1);
		saveCont1.click();
		waitABit(5000);
		
		saveCont2.click();
		waitABit(4000);
		
			
	}

	public void agreeChckBox() {
		AgreeChckBox.click();
		waitABit(2000);
		}

	public void signAgree() {
		customerName.sendKeys("Test Name");
		waitABit(3000);
			
		sign.click();
		waitABit(3000);
		
	}

	public void saveContBtn() {
		saveContFinal.click();
		waitABit(6000);
		
	}

	public void sendMailBtn() {
		sendMailBtn.click();
		waitABit(4000);
		
	}

	public void rangeTimrDesiredRange() {
		rangeRadio.click();
		waitABit(500);
		timeRange.click();
		waitABit(500);
		timeRange1.click();
		waitABit(2000);
		
	}

	public void fieldRadioButton() {
		fieldRadio.click();
		waitABit(1000);
		
		
	}

	public void flatRateRadio() {
		flatRsteRadio.click();
		waitABit(2000);
	}

	public void jobDescriptionAddButton() {

		jobDesc.sendKeys("NewJob");
		waitABit(500);
		addJob.click();
		waitABit(2000);
		
		
	}

	public void primaryRoute() {
			
		route.click();
		waitABit(1000);
		 route1.click();
		 waitABit(2000);
		
	}

	public void saveButton() {
		submitButton.click();
		waitABit(4000);
		
	}

	public void advanceSearchDesiredOpportunity() {
		advanceSearch.click();
		waitABit(4000);
		
		desiredOpportunity.click();
		waitABit(3000);
	}

	public void savBtnHVACssc() {
		saveWorkOrder.click();
		waitABit(4000);
		
	}

	public void serviceAppointment() {
		scrollUP(appointment);
		appointment.click();
		waitABit(500);
		serviceAppointment.click();
		waitABit(4000);
		
	}

	public void desiredOpportunityServiceAppointment() {
		desiredOpportunityService.click();
		waitABit(2000);
		
	}

	public void recievedOnmyWayArrivedStartRepair() {
		Recievex3.click();
		waitABit(3000);
		
		Recievex3.click();
		waitABit(3000);
		
		Recievex3.click();
		waitABit(7000);
		
		startRepair.click();
		waitABit(10000);
	}

	public void completeSubOrder() {
		completeSubWorkOrder.click();
		waitABit(4000);
}

	public void paymentMode() {
		paymentMethod.click();
		waitABit(500);
		
	}

	public void customerTechnicianSign() {
		
		
		customerSign.click();
		waitABit(1000);
	
		technicianSign.click();
		waitABit(1000);
		
	}

	public void completeWorkOrder() {
		
		
		completeWorkOrder.click();
		waitABit(6000);
		
		sendMailbtn.click();
		waitABit(4000);
		
	}

	public void adressZip() {
		addressline1.sendKeys("343 Smith St");
		waitABit(2000);
		
		 zipCode.sendKeys("12345");
		 waitABit(500);
		
	}

	public void afterHour() {
		afterHourRadio.click();
		waitABit(2000);
		
	}

	public void helperRadio() {
		HelperRadio.click();
		waitABit(2000);
		
		
	}

	public void TimeMaterialRadio() {
		timeMaterial.click();
		waitABit(2000);
		
	}

	
}
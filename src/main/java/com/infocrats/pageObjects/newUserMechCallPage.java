
package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infocrats.utils.BaseUtills;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class newUserMechCallPage extends peststreamPage {
	BaseUtills utills = new BaseUtills();

	@FindBy(xpath = "//body/div/div/div/ul/li[3]/a[1]")
	private WebElementFacade CallTab;

	@FindBy(xpath = "//*[@id='crmCompanySaleshead']")
	private WebElementFacade Company_CSSO;

	@FindBy(xpath = "//*[@id='btngocrmCompanySaleshead']/i")
	private WebElementFacade companySearch;

	@FindBy(xpath = "//*[@id='frmGeneralInfo']/div/div/div[3]/div[1]/div[2]/div/div/span[1]/span/div[2]/div/a")
	private WebElementFacade companySearchCreate;

	@FindBy(xpath = "//input[@id='crmContactSaleshead']")
	private WebElementFacade Contact_CSSO;

	@FindBy(xpath = "//*[@id='btngocrmContactSaleshead']/i")
	private WebElementFacade contactSearch;

	@FindBy(xpath = "//*[@id='frmGeneralInfo']/div/div/div[3]/div[1]/div[3]/div/div/span[1]/span/div[2]/span/div[1]/div/small[1]/i")
	private WebElementFacade contactSearchValue;

	@FindBy(xpath = "//*[@id='CellNo']")
	private WebElementFacade PPhone_CSSO;

	@FindBy(xpath = "(//span[contains(.,'--Select--')])[2]")
	private WebElementFacade DDService_CSSO;

	@FindBy(xpath = "(//div[@role='option'])[3]")
	private WebElementFacade ValueDDService_CSSO;

	@FindBy(xpath = "//button//span[contains(text(),'--Select--')]")
	private WebElementFacade DDSource_CSSO;

	@FindBy(xpath = "//span[@class='text'][contains(.,'CustomerPortal App')]")
	private WebElementFacade ValueDDSource_CSSO;

	@FindBy(xpath = "//textarea[@id='AccountDescription']")
	private WebElementFacade AccAlert_CSSO;

	@FindBy(xpath = "//textarea[@id='ProblemDescription']")
	private WebElementFacade ProbDes_CSSO;

	@FindBy(xpath = "//*[@id='uniform-rdoCommercial']")
	private WebElementFacade Opp_Type_Commercial;

	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	private WebElementFacade Continue_CSSO;

	@FindBy(xpath = "//span[@id='select2-chosen-5']")
	private WebElementFacade DDBranch_CSSO;

	@FindBy(xpath = "//*[@id='select2-results-5']/li[3]")
	private WebElementFacade ValueDDBranch_CSSO;

	@FindBy(xpath = "//div[@id='s2id_DepartmentSysName']//a//span//b")
	private WebElementFacade DDDep_CSSO;

	@FindBy(xpath = "(//div[@role='option'])[3]")
	private WebElementFacade ValueDDDep_CSSO;

	@FindBy(xpath = "//*[@id='rdoSc']")
	private WebElementFacade scheduleType;

	@FindBy(xpath = "//*[@id='PropertyType']")
	private WebElementFacade job_Type;

	@FindBy(xpath = "//*[@id='PropertyType']/option[2]")
	private WebElementFacade Value_job_Type;

	@FindBy(xpath = "//*[@id='uniform-rdoFR']")
	private WebElementFacade flatRate;

	@FindBy(xpath = "//*[@id='IsStandard']")
	private WebElementFacade ser_Repair_Rate;

	@FindBy(xpath = "//*[@id='JobDesc']")
	private WebElementFacade job_Description;

	@FindBy(xpath = "//*[@id='btnAddIssue']")
	private WebElementFacade add_Button;

	@FindBy(xpath = "//*[@id='SpRequiredServiceAddressControl_ServiceAddressLine1']")
	private WebElementFacade Address;

	@FindBy(xpath = "//input[contains(@id,'ServiceZipCode')]")
	private WebElementFacade Zip;

	@FindBy(xpath = "//*[@id='SpRequiredServiceAddressControl_ServiceCityName']")
	private WebElementFacade enter_city;

	@FindBy(xpath = "//*[@id='SpRequiredServiceAddressControl_ServiceStateId']")
	private WebElementFacade select_state;

	@FindBy(xpath = "//*[@id='SpRequiredServiceAddressControl_ServiceStateId']/option[34]")
	private WebElementFacade value_select_state;

	@FindBy(xpath = "//*[@id='SpRequiredServiceAddressControl_ServiceCountryId']")
	private WebElementFacade select_country;

	@FindBy(xpath = "//*[@id='SpRequiredServiceAddressControl_ServiceCountryId']/option")
	private WebElementFacade value_select_country;

	@FindBy(xpath = "//*[@id='uniform-SpecificTimeType']")
	private WebElementFacade specific_Time;

	@FindBy(xpath = "//*[@id='RouteMasterId']")
	private WebElementFacade select_primary_route;

	@FindBy(xpath = "//*[@id='RouteMasterId']/optgroup[2]/option")
	private WebElementFacade value_select_primary_route;

	@FindBy(xpath = "(//span[contains(.,'Save')])[3]")
	private WebElementFacade save_button_Mech;

	@FindBy(xpath = "//*[@id='btnAdvanceSearch']")
	private WebElementFacade advanceSearch_Mech;

	@FindBy(xpath = "//table[@id='sample_1']/tbody/tr[1]/td[3]/a[@title='Edit Work Order']")
	private WebElementFacade select_Work_Order;

	@FindBy(xpath = "//form[@id='frmLeadDetail']/div[@class='modal-footer pull-right']//button[@id='btnSave']")
	private WebElementFacade checkDetails_Save_Button;

	@FindBy(xpath = "//*[@id='dynamicModal']/div/div/div[3]/span")
	private WebElementFacade ok_Button;

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[8]/a/span[1]")
	private WebElementFacade appointment_Tab;

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[8]/ul/li[2]/a/span")
	private WebElementFacade service_Appointment;

	@FindBy(xpath = "//*[@id='sample_1']/tbody/tr[1]/td[1]/a")
	private WebElementFacade name;

	@FindBy(xpath = "//*[@id='tblSubWorkOrder']/tbody/tr/td[10]/a[3]")
	private WebElementFacade action_Button;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div[2]/div[1]/div/div/div[6]/div[2]/button")
	private WebElementFacade start_Repair;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div[2]/div[1]/div/div/div[6]/button")
	private WebElementFacade complete_SubWork_Order;

	@FindBy(xpath = "//*[@id='sample_1']/tbody/tr[1]/td[1]/a")
	private WebElementFacade payment_Mode;

	@FindBy(xpath = "//*[@id='PaymentInfoVm_PaidAmount']")
	private WebElementFacade enter_Amount;

	@FindBy(xpath = "//*[@id='ctlSignatureT']")
	private WebElementFacade signatureBoxTech_Mech;

	@FindBy(xpath = "//*[@id='ctlSignature']")
	private WebElementFacade signatureBoxCust_Mech;

	@FindBy(xpath = "//*[@id='sample_1']/tbody/tr[1]/td[1]/a")
	private WebElementFacade technician_Sign;

	@FindBy(xpath = "//*[@id='tblSubWorkOrder']/tbody/tr/td[10]/a[3]/i")
	private WebElementFacade customer_Sign;

	@FindBy(xpath = "//*[@id='submit']/span")
	private WebElementFacade complete_Work_Order;

	@FindBy(xpath = "//*[@id='sample_1']/tbody/tr[1]/td[1]/a")
	private WebElementFacade service_Report_Invoice;

	@FindBy(xpath = "//span[contains(text(),'Send Email')]")
	private WebElementFacade send_Email;

	@FindBy(xpath = "//*[@id='uniform-rdoEst']")
	private WebElementFacade scheduleEstimation;

	@FindBy(xpath = "//*[@id='SpRequiredServiceAddressControl_AddressSubType']")
	private WebElementFacade addresssubType_Residential;

	@FindBy(xpath = "//*[@id='SpRequiredServiceAddressControl_AddressSubType']/option[2]")
	private WebElementFacade value_addresssubType_Residential;

	@FindBy(xpath = "//*[@id='uniform-SalesType'][2]")
	private WebElementFacade salesType_Field;

	@FindBy(xpath = "//*[@id='submit']")
	private WebElementFacade scheduleTime_Specific;

	@FindBy(xpath = "//*[@id='select2-chosen-3']")
	private WebElementFacade assignedTo;

	@FindBy(xpath = "(//div[contains(@role,'option')])[4]")
	private WebElementFacade value_assignedTo;

	@FindBy(xpath = "//*[@id='EstimatedTimeStr']")
	private WebElementFacade estimated_Duration;

	@FindBy(xpath = "//*[@id='uniform-rdoCommercial']")
	private WebElementFacade commercial;

	@FindBy(xpath = "//form[@id='frmLeadDetail']/div[@class='modal-footer pull-right']//button[@id='btnSave']")
	private WebElementFacade saveInfo_Button;

	@FindBy(xpath = "//*[@id='sample_1']/tbody/tr[1]/td[2]/a")
	private WebElementFacade clickOnOpp_Mech;

	@FindBy(xpath = "//*[@id='submit2555']/span")
	private WebElementFacade saveandContinue_GenralInfo;

	@FindBy(xpath = "//*[@id='submit2']/span")
	private WebElementFacade continue_Inspection;

	@FindBy(xpath = "//*[@id='frmAddEquipments']/div[2]/ul/li[2]/a")
	private WebElementFacade nonStdEquipmentSubTab;

	@FindBy(xpath = "//*[@id='NonStandard']")
	private WebElementFacade serviceRepairRate_NonStd;

	@FindBy(xpath = "//*[@id='btnSaveRepair']")
	private WebElementFacade saveEquipment;

	@FindBy(xpath = "//*[@id='RepairName']")
	private WebElementFacade repair_Name;

	@FindBy(xpath = "//*[@id='submit13']/span[1]")
	private WebElementFacade saveandContinue_Equipment;

	@FindBy(xpath = "(//span[contains(.,'Save & Continue')])[5]")
	private WebElementFacade saveandContinueCust_Review;

	@FindBy(xpath = "//input[@value='Cash']")
	private WebElementFacade payment_Type;

	@FindBy(xpath = "//*[@id='txtTotalPaidPrice']")
	private WebElementFacade amountPaid;

	@FindBy(xpath = "//*[@id='IAgreeTerms']")
	private WebElementFacade clickOnIAgree;

	@FindBy(xpath = "//input[@value='CUSTElec']")
	private WebElementFacade electronic_Signature;

	@FindBy(xpath = "//canvas[@id='ctlSignatureT']")
	private WebElementFacade salesRep_Signature;

	@FindBy(xpath = "//*[@id='btnSubmitAgreement1']/span[1]")
	private WebElementFacade saveandContinue_Signature;

	@FindBy(xpath = "/html//div[@id='SendEmail']/div[@class='vertical-alignment-helper']//form[@action='/Sale/Email/AddUpdateEmail']/div[@class='modal-body']//div[@class='col-md-12']/button[1]/span[@class='ladda-label']")
	private WebElementFacade sendEmail_Agreement;

	@FindBy(xpath = "//span[contains(.,'Send Agreement Link')]")
	private WebElementFacade sendAgreement_Link;

	@FindBy(xpath = "//*[@id='rdoSc']")
	private WebElementFacade schedule_Service_Order;

	@FindBy(xpath = "//*[@id='uniform-rdoTM']")
	private WebElementFacade time_Material;

	@FindBy(xpath = "//*[@id='uniform-RangeTimeType']")
	private WebElementFacade range_Time;

	@FindBy(xpath = "//*[@id='InitialPreferedId']")
	private WebElementFacade time_Range;

	@FindBy(xpath = "//*[@id='InitialPreferedId']/option[2]")
	private WebElementFacade value_time_Range;

	@FindBy(xpath = "//*[@id='SecondRangeofTimeIdOpen']")
	private WebElementFacade second_Time_Range;

	@FindBy(xpath = "//*[@id='SecondRangeofTimeIdOpen']/option[3]")
	private WebElementFacade value_second_Time_Range;

	@FindBy(xpath = "/html//input[@id='IsCustomerNotPresent']")
	private WebElementFacade cust_NotPresent;

	@FindBy(xpath = "//*[@id='uniform-rdoResidential']")
	private WebElementFacade oppType_Residential;

	@FindBy(xpath = "//*[@id='StdRepairName']")
	private WebElementFacade repairToSearch;

	@FindBy(css = "#frmAddRepairDiv > div > div > div > div.tab-content > div.row > div.col-sm-8 > div:nth-child(3) > div.col-sm-8 > span > pre")
	private WebElementFacade selectRepair_Option;

	@FindBy(xpath = "//*[@id='uniform-rdoCommercial']")
	private WebElementFacade oppType_Commercial;

	@FindBy(xpath = "//*[@id='SpRequiredServiceAddressControl_AddressSubType']/option[3]")
	private WebElementFacade addSubType_Commercial;

	@FindBy(xpath = "//*[@id='SalesType']")
	private WebElementFacade saleType_Inside;

	@FindBy(xpath = "//*[@id='servAddr_glyphicon']")
	private WebElementFacade service_Address;

	@FindBy(xpath = "//*[@id='LastName']")
	private WebElementFacade last_Name;

	@FindBy(xpath = "//*[@id='PriceNotToExceed']")
	private WebElementFacade priceNot_Exceed;

	@FindBy(xpath = "//*[@id='uniform-IsAftHrs']")
	private WebElementFacade serviceRR_After;

	@FindBy(xpath = "//*[@id='uniform-IsSpecificHrs']")
	private WebElementFacade specific_Hour;

	@FindBy(xpath = "//*[@id='uniform-isSplitPrice']")
	private WebElementFacade split_Price;

	@FindBy(xpath = "//*[@id='uniform-rdoHelper']")
	private WebElementFacade labourType_Helper;

	@FindBy(xpath = "//*[@id='PropertyType']/option[1]")
	private WebElementFacade Value_jtnew_Cons;

	@FindBy(xpath = "//span[contains(.,'Send Email')]")
	private WebElementFacade sendEmail_CustPresent;

	@FindBy(xpath = "//a[contains(.,'Create Quote')]")
	private WebElementFacade create_Quote;

	@FindBy(xpath = "//*[@id='PrimaryServiceId']")
	private WebElementFacade select_Service;

	@FindBy(xpath = "//*[@id='PrimaryServiceId']/option[3]")
	private WebElementFacade select_Service_Value;

	@FindBy(xpath = "//*[@id='EmployeeNo']")
	private WebElementFacade select_Mechanic;

	@FindBy(xpath = "//*[@id='EmployeeNo']/option[2]")
	private WebElementFacade select_Mechanic_Value;

	@FindBy(xpath = "//*[@id='form0']/div/div/div[4]/div/div[3]/div/button[2]")
	private WebElementFacade submit;

	@FindBy(xpath = "//a[@class='btn green btnPurchaseOrder']")
	private WebElementFacade purchase_Order;

	@FindBy(xpath = "//span[contains(.,'Add Purchase Order')]")
	private WebElementFacade addPurchase_Order;

	@FindBy(xpath = "//*[@id='VendorMasterId']")
	private WebElementFacade select_Vendor;

	@FindBy(xpath = "//*[@id='VendorMasterId']/option[3]")
	private WebElementFacade select_Vendor_Value;

	@FindBy(xpath = "//*[@id='VendorLocationId']")
	private WebElementFacade select_Vendor_Location;

	@FindBy(xpath = "//*[@id='VendorLocationId']/option[2]")
	private WebElementFacade select_Vendor_Location_Value;

	@FindBy(xpath = "//*[@id='divPOGeneric']/div[2]/div[2]/button")
	private WebElementFacade submit_Request;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/div[2]/div[1]/div/div/div[1]/div[2]/div[1]/button[2]")
	private WebElementFacade stop_Job;

	@FindBy(xpath = "//*[@id='Reason']")
	private WebElementFacade reason;

	@FindBy(xpath = "//*[@id='Reason']/option[2]")
	private WebElementFacade reason_Value;

	@FindBy(xpath = "//*[@id='btnActualHours']")
	private WebElementFacade save_Reason;

	@FindBy(xpath = "//*[@id='submit21']")
	private WebElementFacade saveAndContinue_Job;

	@FindBy(xpath = "//select[@id='OrderType']/option[@value='ServiceOrder']")
	private WebElementFacade WorkOrderDD;

	@FindBy(xpath = "//*[@id='btnSubmit']/span[1]")
	private WebElementFacade SaveBtnOnWorkOrder;

	@Override
	public WebElementFacade getUniqueElement() {
		return null;
	}

	public void clickOnCallTab() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(CallTab));
		CallTab.click();

	}

	public void enterCompany(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(Company_CSSO));

		Company_CSSO.sendKeys(testData.get("Company_CSSO"));
		wait.until(ExpectedConditions.elementToBeClickable(companySearch));
		companySearch.click();
		wait.until(ExpectedConditions.elementToBeClickable(companySearchCreate));
		companySearchCreate.click();
	}

	public void clickOnContact(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(Company_CSSO));
		Contact_CSSO.click();

		Contact_CSSO.sendKeys(testData.get("Contact_CSSO"));

		contactSearch.click();
		wait.until(ExpectedConditions.elementToBeClickable(contactSearchValue));
		contactSearchValue.click();

	}

	public void clickOnSearch() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(companySearch));
		companySearch.click();
	}

	public void enterPrimaryEmail(Map<String, String> testData) {
		// PEmail_CSSO.sendKeys(testData.get("Primary_Email"));
	}

	public void enterCell(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(PPhone_CSSO));
		PPhone_CSSO.sendKeys(testData.get("Primary_Cell"));
	}

	public void clickOnBranch() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(DDBranch_CSSO));
		DDBranch_CSSO.click();
		waitABit(3000);
		ValueDDBranch_CSSO.click();
	}

	public void clickOnDept() {
		waitABit(1500);
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(DDDep_CSSO));
		DDDep_CSSO.click();
		waitABit(1500);
		ValueDDDep_CSSO.click();
		waitABit(3000);
		
	}

	public void clickOnService() {
		waitABit(5000);
		DDService_CSSO.click();
		waitABit(4000);
		ValueDDService_CSSO.click();

	}

	public void clickOnSource() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(DDSource_CSSO));
		DDSource_CSSO.click();
		waitABit(3000);
		ValueDDSource_CSSO.click();
		// scrollUP(Customer);
	}

	public void enterAcc_Alert(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(AccAlert_CSSO));
		AccAlert_CSSO.click();
		wait.until(ExpectedConditions.elementToBeClickable(AccAlert_CSSO));
        AccAlert_CSSO.sendKeys(testData.get("Acc_Alert_Mech"));
	}

	public void enterProblemDescription(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(ProbDes_CSSO));
		ProbDes_CSSO.sendKeys(testData.get("Problem_Description_Mech"));
	}

	public void selectOppType() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(Opp_Type_Commercial));
		scrollDown(Opp_Type_Commercial);
		wait.until(ExpectedConditions.elementToBeClickable(Opp_Type_Commercial));
		Opp_Type_Commercial.click();

	}

	public void clickOnContinue() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(Continue_CSSO));
		Continue_CSSO.click();
	}

	public void ScheduleType() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(scheduleType));
		scheduleType.click();
	}

	public void Job_Type() {
        waitABit(1500);

		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(job_Type));
		job_Type.click();
           waitABit(1500);
		Value_job_Type.click();
	}

	public void Ser_Repair_Rate() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(ser_Repair_Rate));
		ser_Repair_Rate.click();
	}

	public void Job_Description(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(job_Description));
		scrollDown(job_Description);
		wait.until(ExpectedConditions.elementToBeClickable(job_Description));

		job_Description.sendKeys(testData.get("Job_Description"));
	}

	public void ClickOnAdd() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(add_Button));
		add_Button.click();
	}

	public void enter_Address(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(Address));
		Address.sendKeys(testData.get("Address"));

	}

	public void enter_Zip(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(Zip));
		Zip.sendKeys(testData.get("Zip"));
	}

	public void enter_City(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(enter_city));
		enter_city.sendKeys(testData.get("City"));

	}

	public void select_State() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(select_state));
		select_state.click();
		wait.until(ExpectedConditions.elementToBeClickable(value_select_state));
		value_select_state.click();
	}

	public void select_Country() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(select_country));
		select_country.click();
		wait.until(ExpectedConditions.elementToBeClickable(value_select_country));
		value_select_country.click();
	}

	public void clickOnSchedule_Time() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(specific_Time));
		specific_Time.click();
	}

	public void select_Primary_Route() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(select_primary_route));
		select_primary_route.click();
		wait.until(ExpectedConditions.elementToBeClickable(value_select_primary_route));

		value_select_primary_route.click();
	}

	public void clickOnFlatRate() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(flatRate));
		flatRate.click();

	}

	public void clickOnSaveButton_Mech() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		scrollDown(save_button_Mech);
		wait.until(ExpectedConditions.elementToBeClickable(save_button_Mech));
		save_button_Mech.click();
		wait.until(ExpectedConditions.elementToBeClickable(ok_Button));
		ok_Button.click();
	}

	public void clickOnAdvanceSearch_Mech() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(advanceSearch_Mech));
		advanceSearch_Mech.click();
	}

	public void select_Work_Order() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(select_Work_Order));
		select_Work_Order.click();

	}

	public void checkDetails_Save() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(SaveBtnOnWorkOrder));
		scrollDown(SaveBtnOnWorkOrder);
		waitABit(2000);
		SaveBtnOnWorkOrder.click();
	}

	public void clickOn_Appointment_Tab() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(appointment_Tab));
		appointment_Tab.click();
	}

	public void clickOn_Service_Appointment() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(service_Appointment));
		service_Appointment.click();
	}

	public void clickOn_Name() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(name));
		name.click();
	}

	public void subWorkOrder_Action() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(action_Button));
		scrollDown(action_Button);
		waitABit(3000);
		action_Button.click();
		waitABit(3000);
		action_Button.click();
		waitABit(3000);
		action_Button.click();
	}

	public void clickOnStart_Repair() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(start_Repair));
		start_Repair.click();
	}

	public void completeSub_Work_Order() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(complete_SubWork_Order));
		complete_SubWork_Order.click();
	}

	public void clickOnPayment_Mode() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(payment_Mode));
	
		payment_Mode.click();

	}

	public void enter_Amount(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(enter_Amount));
	
		scrollDown(enter_Amount);
		waitABit(2000);
		enter_Amount.sendKeys(testData.get("Amount"));
	}

	public void clickOn_Technicican_Signature(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(signatureBoxTech_Mech));
		scrollDown(signatureBoxTech_Mech);
		waitABit(3000);
		signatureBoxTech_Mech.click();

	}

	public void clickOn_Customer_Signature(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(signatureBoxCust_Mech));
		signatureBoxCust_Mech.click();
	}

	public void clickOnComplete_WorkOrder() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(complete_Work_Order));
		complete_Work_Order.click();
	}

	public void clickOnService_Report_Invoice() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(service_Report_Invoice));
		service_Report_Invoice.click();
	}

	public void clickOnSend_Mail() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(send_Email));
		send_Email.click();
	}

	/******************* @CSSO_ScheduleEstimation_Residential_Field_SpecificTime_Save_Mech ************************/

	public void clickOnScheduleEstimation() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(scheduleEstimation));
		
		scheduleEstimation.click();
	}

	public void clickOnaddSubType_Residential() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(addresssubType_Residential));
		scrollDown(addresssubType_Residential);
		waitABit(3000);
		addresssubType_Residential.click();
		wait.until(ExpectedConditions.elementToBeClickable(value_addresssubType_Residential));

		value_addresssubType_Residential.click();
	}

	public void clickOnSalesType_Field() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(salesType_Field));
		scrollDownLarge(salesType_Field);
		wait.until(ExpectedConditions.elementToBeClickable(salesType_Field));
		salesType_Field.click();

	}

	public void clickOnScheduleTime_Specific() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(scheduleTime_Specific));

		scheduleTime_Specific.click();
	}

	public void click_on_Assigned_Estimated_Duration(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(assignedTo));
		assignedTo.click();
		wait.until(ExpectedConditions.elementToBeClickable(value_assignedTo));
		value_assignedTo.click();
		wait.until(ExpectedConditions.elementToBeClickable(estimated_Duration));

		estimated_Duration.sendKeys(testData.get("Estimated_Duration"));
	}

	public void clickOn_Commercial() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(commercial));
		commercial.click();
	}

	public void clickOnSaveInfo_Button() {
		waitABit(2000);
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		
		wait.until(ExpectedConditions.elementToBeClickable(saveInfo_Button));
		waitABit(1000);
		
		saveInfo_Button.click();
	}

	/***********************
	 * CSSO_ScheduleEstimation_Residential_Field_NonStd_Agreement1_Mech
	 ************************/

	public void clickOnOpportunity_Mech() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(clickOnOpp_Mech));
		
		clickOnOpp_Mech.click();

	}

	public void clickOnSaveandContinue_GenralInfo() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(saveandContinue_GenralInfo));
		
		saveandContinue_GenralInfo.click();
	}

	public void clickOnContinue_Inspection() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(continue_Inspection));
		
		scrollUP(continue_Inspection);
		waitABit(2000);
		continue_Inspection.click();
	}

	public void clickOnNonStdEquipmentSubTab(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(nonStdEquipmentSubTab));
		
		nonStdEquipmentSubTab.click();

	}

	public void clickOnServiceRepairRate_NonStd(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(serviceRepairRate_NonStd));
		

		scrollDown(serviceRepairRate_NonStd);
		waitABit(2000);
		serviceRepairRate_NonStd.click();
		waitABit(2000);
		repair_Name.sendKeys(testData.get("Repair_Name"));
		waitABit(2000);

	}

	public void clickOnSaveEquipment() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(saveEquipment));
		
		saveEquipment.click();
	}

	public void clickOnSaveandContinue_Equipment() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(saveandContinue_Equipment));
		

		saveandContinue_Equipment.click();
	}

	public void clickOnSaveandContinueCust_Review() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(saveandContinueCust_Review));
		scrollUP(saveandContinueCust_Review);
		waitABit(1000);
		scrollUP(saveandContinueCust_Review);
		wait.until(ExpectedConditions.elementToBeClickable(saveandContinueCust_Review));

		saveandContinueCust_Review.click();

	}

	public void clickOnPayment_Type() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(payment_Type));
		

		payment_Type.click();
	}

	public void clickOnAmountPaid(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(amountPaid));
		
		amountPaid.sendKeys(testData.get("Amount"));
	}

	public void clickOnIAgree() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(clickOnIAgree));
		

	}

	public void clickOnElectronic_Signature() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(electronic_Signature));
		
		electronic_Signature.click();
	}

	public void clickOnSalesRep_Signature() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(salesRep_Signature));
		

		salesRep_Signature.click();
	}

	public void clickOnSaveandContinue_Signature() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(saveandContinue_Signature));
		
		saveandContinue_Signature.click();
	}

	public void clickOnSendEmailAgreement() {
		boolean staleElement = true;
		while (staleElement) {
			try {
				WebDriverWait wait = new WebDriverWait(getDriver(), 20);
				wait.until(ExpectedConditions.elementToBeClickable(sendEmail_Agreement));
				sendEmail_Agreement.click();
				staleElement = false;
			} catch (StaleElementReferenceException e) {
				staleElement = true;
			}
		}
	}

	public void clickOnSSO() {

	}

	public void clickOnTime_Material() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(time_Material));
		
		time_Material.click();
	}

	public void clickOnRange_Time() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(range_Time));
		
		scrollDownLarge(range_Time);
		waitABit(2000);
		range_Time.click();

	}

	public void Time_Range() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(time_Range));
		
		time_Range.click();
		wait.until(ExpectedConditions.elementToBeClickable(value_time_Range));

		value_time_Range.click();
	}

	public void SecondTime_Range() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(second_Time_Range));
		
		second_Time_Range.click();
		wait.until(ExpectedConditions.elementToBeClickable(value_second_Time_Range));

		value_second_Time_Range.click();

	}

	public void clickOnCustomer_NotPresent() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(cust_NotPresent));
		
		scrollDown(cust_NotPresent);
		waitABit(1500);
		cust_NotPresent.click();

	}

	public void clickOnOppType_Residential() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(oppType_Residential));
		
		oppType_Residential.click();
	}

	public void clickOnSendAgreement_Link() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(sendAgreement_Link));
		
		sendAgreement_Link.click();
	}

	/*
	 * public void repairToSearch(Map<String, String> testData) { waitABit(3000);
	 * rapairToSearch.sendKeys(testData.get("Repairto_Search")); waitABit(5000);
	 * selectRepair_Option.click(); }
	 */

	public void repairToSearch(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(repairToSearch));
		
		repairToSearch.sendKeys(testData.get("Repairto_Search"));
		waitABit(2000);
		repairToSearch.sendKeys(Keys.DOWN);
		waitABit(1000);
		repairToSearch.sendKeys(Keys.ENTER);
		waitABit(4000);

		// selectRepair_Option.click();
		// waitABit(5000);
	}

	public void clickOnOppType_Commercial() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(oppType_Commercial));
		
		oppType_Commercial.click();
	}

	public void clickOnaddSubType_Commercial() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(addSubType_Commercial));
		
		addSubType_Commercial.click();
	}

	public void clickOnSalesType_Inside() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(saleType_Inside));
		
		saleType_Inside.click();
	}

	public void clickOnService_Address() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(service_Address));
		
		service_Address.click();
	}

	public void enterLast_Name(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(last_Name));
		
		last_Name.sendKeys(testData.get("Last_Name"));
	}

	public void priceNot_Exceed(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(priceNot_Exceed));
				priceNot_Exceed.sendKeys(testData.get("Price"));
	}

	public void clickOnServiceRR_After() {
		waitABit(5000);
		serviceRR_After.click();
	}

	public void clickOnSpecific_Hour() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(specific_Hour));
		
		specific_Hour.click();
	}

	public void clickOnSplit_Price() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(split_Price));
		
		split_Price.click();
	}

	public void clickOnLabourType_Helper() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(labourType_Helper));
		
		labourType_Helper.click();
	}

	public void jTNew_Construction() {
		waitABit(3000);
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(job_Type));
		
		job_Type.click();
		
		Value_jtnew_Cons.click();
	}

	public void sendEmail_CustPresent() {
		boolean staleElement = true;
		while (staleElement) {
			try {
				WebDriverWait wait = new WebDriverWait(getDriver(), 20);
				wait.until(ExpectedConditions.elementToBeClickable(sendEmail_CustPresent));
				
				sendEmail_CustPresent.click();
				staleElement = false;
			} catch (StaleElementReferenceException e) {
				staleElement = true;
			}
		}
	}

	public void clickOnCreate_Quote() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(create_Quote));
		
		create_Quote.click();

	}

	public void service_Meachanic() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(select_Service));
		
		select_Service.click();
		waitABit(2000);
		select_Service_Value.click();
		waitABit(3000);
		select_Mechanic.click();
		waitABit(2000);
		select_Mechanic_Value.click();
	}

	public void clickOn_Submit() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		
		submit.click();
	}

	public void clickOnPurchase_Order() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(purchase_Order));
		
		purchase_Order.click();
	}

	public void clickOnAddPurchase_Order() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(addPurchase_Order));
		addPurchase_Order.click();
	}

	public void vendor_VendorLocation() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(select_Vendor));
		
		select_Vendor.click();
		waitABit(2000);
		select_Vendor_Value.click();
		waitABit(3000);
		select_Vendor_Location.click();
		waitABit(2000);
	
		select_Vendor_Location_Value.click();
		waitABit(3000);
	}

	public void clickOnSubmit_Request() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(submit_Request));
		
		submit_Request.click();
	}

	public void navigate_Back() {
		
		waitABit(4000);
		((JavascriptExecutor) getDriver()).executeScript("window.history.go(-1)");

		waitABit(3000);
		((JavascriptExecutor) getDriver()).executeScript("window.history.go(-1)");

	}

	public void clickOnStop_Job() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(stop_Job));
		
		stop_Job.click();
	}

	public void select_Reason() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(reason));
		reason.click();
		wait.until(ExpectedConditions.elementToBeClickable(reason_Value));
		reason_Value.click();
	}

	public void clickOnSave_Reason() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(save_Reason));
		
		save_Reason.click();
	}

	public void clickOnSaveandContinue_Job() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.elementToBeClickable(saveAndContinue_Job));
		
		saveAndContinue_Job.click();
	}

}

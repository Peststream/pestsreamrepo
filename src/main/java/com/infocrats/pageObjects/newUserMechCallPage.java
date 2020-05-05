package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;

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

	@FindBy(xpath = "//*[@id='sample_1']/tbody/tr[1]/td[2]/a")
	private WebElementFacade select_Work_Order;

	@FindBy(xpath = "//*[@id='btnSubmit']/span[1]")
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

	@FindBy(xpath = "(//span[contains(.,'Save')])[2]")
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

	@FindBy(xpath = "//button[@value='sendagreement']")
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

	@FindBy(xpath = "//*[@id='CompleteSWO_IsCustomerNotPresent']")
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

	@Override
	public WebElementFacade getUniqueElement() {
		return null;
	}

	public void clickOnCallTab() {
		CallTab.click();

	}

	public void enterCompany(Map<String, String> testData) {
		waitABit(3000);
		Company_CSSO.sendKeys(testData.get("Company_CSSO"));
		waitABit(3000);
		companySearch.click();
		waitABit(3000);
		companySearchCreate.click();
	}

	public void clickOnContact(Map<String, String> testData) {
		Contact_CSSO.click();
		waitABit(2000);
		Contact_CSSO.sendKeys(testData.get("Contact_CSSO"));
		contactSearch.click();
		waitABit(2000);
		contactSearchValue.click();

	}

	public void clickOnSearch() {
		companySearch.click();
	}

	public void enterPrimaryEmail(Map<String, String> testData) {
		// PEmail_CSSO.sendKeys(testData.get("Primary_Email"));
	}

	public void enterCell(Map<String, String> testData) {

		PPhone_CSSO.sendKeys(testData.get("Primary_Cell"));
	}

	public void clickOnBranch() {
		waitABit(2000);
		DDBranch_CSSO.click();
		waitABit(3000);
		ValueDDBranch_CSSO.click();
	}

	public void clickOnDept() {
		waitABit(5000);
		DDDep_CSSO.click();
		waitABit(3000);
		ValueDDDep_CSSO.click();
	}

	public void clickOnService() {
		waitABit(5000);
		DDService_CSSO.click();
		waitABit(2000);
		ValueDDService_CSSO.click();

	}

	public void clickOnSource() {
		waitABit(2000);
		DDSource_CSSO.click();
		waitABit(2000);
		ValueDDSource_CSSO.click();
		// scrollUP(Customer);
	}

	public void enterAcc_Alert(Map<String, String> testData) {
		AccAlert_CSSO.click();
		AccAlert_CSSO.sendKeys(testData.get("Acc_Alert_Mech"));
	}

	public void enterProblemDescription(Map<String, String> testData) {
		ProbDes_CSSO.sendKeys(testData.get("Problem_Description_Mech"));
	}

	public void selectOppType() {
		waitABit(3000);
		scrollDown(Opp_Type_Commercial);
		waitABit(3000);
		Opp_Type_Commercial.click();

	}

	public void clickOnContinue() {
		Continue_CSSO.click();
	}

	public void ScheduleType() {
		waitABit(3000);
		scheduleType.click();
	}

	public void Job_Type() {
		waitABit(2000);
		job_Type.click();
		waitABit(2000);
		Value_job_Type.click();
	}

	public void Ser_Repair_Rate() {

		ser_Repair_Rate.click();
	}

	public void Job_Description(Map<String, String> testData) {
		waitABit(3000);
		scrollDown(job_Description);
		waitABit(3000);
		job_Description.sendKeys(testData.get("Job_Description"));
	}

	public void ClickOnAdd() {
		waitABit(3000);
		add_Button.click();
	}

	public void enter_Address(Map<String, String> testData) {
		Address.sendKeys(testData.get("Address"));

	}

	public void enter_Zip(Map<String, String> testData) {
		Zip.sendKeys(testData.get("Zip"));
	}

	public void enter_City(Map<String, String> testData) {
		enter_city.sendKeys(testData.get("City"));

	}

	public void select_State() {
		waitABit(2000);
		select_state.click();
		waitABit(2000);
		value_select_state.click();
	}

	public void select_Country() {

		waitABit(2000);
		select_country.click();
		waitABit(2000);
		value_select_country.click();
	}

	public void clickOnSchedule_Time() {
		waitABit(2000);
		specific_Time.click();
	}

	public void select_Primary_Route() {
		waitABit(2000);
		select_primary_route.click();
		waitABit(2000);
		value_select_primary_route.click();
	}

	public void clickOnFlatRate() {
		waitABit(5000);
		flatRate.click();

	}

	public void clickOnSaveButton_Mech() {
		waitABit(2000);
		scrollDown(save_button_Mech);
		waitABit(2000);
		save_button_Mech.click();
		waitABit(3000);
		ok_Button.click();
	}

	public void clickOnAdvanceSearch_Mech() {

		waitABit(2000);
		advanceSearch_Mech.click();
	}

	public void select_Work_Order() {
		waitABit(2000);
		select_Work_Order.click();

	}

	public void checkDetails_Save() {
		waitABit(2000);
		scrollDown(checkDetails_Save_Button);
		waitABit(2000);
		checkDetails_Save_Button.click();
	}

	public void clickOn_Appointment_Tab() {
		waitABit(2000);
		appointment_Tab.click();
	}

	public void clickOn_Service_Appointment() {
		waitABit(2000);
		service_Appointment.click();
	}

	public void clickOn_Name() {
		waitABit(2000);
		name.click();
	}

	public void subWorkOrder_Action() {
		waitABit(2000);
		scrollDown(action_Button);
		action_Button.click();
		waitABit(2000);
		action_Button.click();
		waitABit(2000);
		action_Button.click();
	}

	public void clickOnStart_Repair() {
		waitABit(5000);
		start_Repair.click();
	}

	public void completeSub_Work_Order() {
		waitABit(2000);
		complete_SubWork_Order.click();
	}

	public void clickOnPayment_Mode() {
		waitABit(2000);
		payment_Mode.click();

	}

	public void enter_Amount(Map<String, String> testData) {
		waitABit(2000);
		scrollDown(enter_Amount);
		waitABit(2000);
		enter_Amount.sendKeys(testData.get("Amount"));
	}

	public void clickOn_Technicican_Signature(Map<String, String> testData) {

		waitABit(2000);
		scrollDown(signatureBoxTech_Mech);
		waitABit(2000);
		signatureBoxTech_Mech.click();

	}

	public void clickOn_Customer_Signature(Map<String, String> testData) {
		waitABit(2000);
		signatureBoxCust_Mech.click();
	}

	public void clickOnComplete_WorkOrder() {
		waitABit(2000);
		complete_Work_Order.click();
	}

	public void clickOnService_Report_Invoice() {
		waitABit(2000);
		service_Report_Invoice.click();
	}

	public void clickOnSend_Mail() {
		waitABit(3000);
		send_Email.click();
	}

	/******************* @CSSO_ScheduleEstimation_Residential_Field_SpecificTime_Save_Mech ************************/

	public void clickOnScheduleEstimation() {
		waitABit(2000);
		scheduleEstimation.click();
	}

	public void clickOnaddSubType_Residential() {
		waitABit(2000);
		scrollDown(addresssubType_Residential);
		waitABit(2000);
		addresssubType_Residential.click();
		waitABit(2000);
		value_addresssubType_Residential.click();
	}

	public void clickOnSalesType_Field() {
		waitABit(2000);
		scrollDownLarge(salesType_Field);
		waitABit(5000);
		salesType_Field.click();

	}

	public void clickOnScheduleTime_Specific() {

		waitABit(2000);
		scheduleTime_Specific.click();
	}

	public void click_on_Assigned_Estimated_Duration(Map<String, String> testData) {

		waitABit(2000);
		assignedTo.click();
		waitABit(2000);
		value_assignedTo.click();
		waitABit(2000);
		estimated_Duration.sendKeys(testData.get("Estimated_Duration"));
	}

	public void clickOn_Commercial() {
		waitABit(2000);
		commercial.click();
	}

	public void clickOnSaveInfo_Button() {
		waitABit(2000);
		saveInfo_Button.click();
	}

	/***********************
	 * CSSO_ScheduleEstimation_Residential_Field_NonStd_Agreement1_Mech
	 ************************/

	public void clickOnOpportunity_Mech() {
		waitABit(2000);
		clickOnOpp_Mech.click();

	}

	public void clickOnSaveandContinue_GenralInfo() {
		waitABit(2000);
		saveandContinue_GenralInfo.click();
	}

	public void clickOnContinue_Inspection() {
		waitABit(2000);
		scrollUP(continue_Inspection);
		waitABit(2000);
		continue_Inspection.click();
	}

	public void clickOnNonStdEquipmentSubTab(Map<String, String> testData) {
		waitABit(2000);
		nonStdEquipmentSubTab.click();

	}

	public void clickOnServiceRepairRate_NonStd(Map<String, String> testData) {

		waitABit(2000);
		scrollDown(serviceRepairRate_NonStd);
		waitABit(2000);
		serviceRepairRate_NonStd.click();
		waitABit(2000);
		repair_Name.sendKeys(testData.get("Repair_Name"));

	}

	public void clickOnSaveEquipment() {
		// waitABit(2000);
		saveEquipment.click();
	}

	public void clickOnSaveandContinue_Equipment() {

		waitABit(2000);
		saveandContinue_Equipment.click();
	}

	public void clickOnSaveandContinueCust_Review() {
		waitABit(2000);
		scrollUP(saveandContinueCust_Review);
		scrollUP(saveandContinueCust_Review);
		waitABit(2000);
		saveandContinueCust_Review.click();

	}

	public void clickOnPayment_Type() {

		waitABit(2000);
		payment_Type.click();
	}

	public void clickOnAmountPaid(Map<String, String> testData) {

		waitABit(2000);
		amountPaid.sendKeys(testData.get("Amount"));
	}

	public void clickOnIAgree() {

		waitABit(2000);
		clickOnIAgree.click();
	}

	public void clickOnElectronic_Signature() {
		waitABit(2000);
		electronic_Signature.click();
	}

	public void clickOnSalesRep_Signature() {

		waitABit(2000);
		salesRep_Signature.click();
	}

	public void clickOnSaveandContinue_Signature() {
		waitABit(2000);
		saveandContinue_Signature.click();
	}

	public void clickOnSendEmailAgreement() {
		boolean staleElement = true;
		while (staleElement) {
			try {
				waitABit(2000);
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
		waitABit(3000);
		time_Material.click();
	}

	public void clickOnRange_Time() {
		waitABit(3000);
		scrollDownLarge(range_Time);
		range_Time.click();

	}

	public void Time_Range() {
		waitABit(3000);
		time_Range.click();
		waitABit(3000);
		value_time_Range.click();
	}

	public void SecondTime_Range() {
		waitABit(3000);
		second_Time_Range.click();
		waitABit(3000);
		value_second_Time_Range.click();

	}

	public void clickOnCustomer_NotPresent() {
		waitABit(3000);
		scrollDown(cust_NotPresent);
		cust_NotPresent.click();

	}

	public void clickOnOppType_Residential() {
		waitABit(3000);
		oppType_Residential.click();
	}

	public void clickOnSendAgreement_Link() {
		waitABit(3000);
		sendAgreement_Link.click();
	}

	/*
	 * public void repairToSearch(Map<String, String> testData) { waitABit(3000);
	 * rapairToSearch.sendKeys(testData.get("Repairto_Search")); waitABit(5000);
	 * selectRepair_Option.click(); }
	 */

	public void repairToSearch(Map<String, String> testData) {
		waitABit(3000);
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
		waitABit(3000);
		oppType_Commercial.click();
	}

	public void clickOnaddSubType_Commercial() {
		waitABit(3000);
		addSubType_Commercial.click();
	}

	public void clickOnSalesType_Inside() {
		waitABit(3000);
		saleType_Inside.click();
	}

	public void clickOnService_Address() {
		waitABit(3000);
		service_Address.click();
	}

	public void enterLast_Name(Map<String, String> testData) {
		waitABit(2000);
		last_Name.sendKeys(testData.get("Last_Name"));
	}

	public void priceNot_Exceed(Map<String, String> testData) {
		waitABit(2000);
		priceNot_Exceed.sendKeys(testData.get("Price"));
	}

	public void clickOnServiceRR_After() {
		waitABit(2000);
		serviceRR_After.click();
	}

	public void clickOnSpecific_Hour() {
		specific_Hour.click();
	}

	public void clickOnSplit_Price() {
		split_Price.click();
	}

	public void clickOnLabourType_Helper() {
		labourType_Helper.click();
	}

	public void jTNew_Construction() {
		job_Type.click();
		waitABit(2000);
		Value_jtnew_Cons.click();
	}

	public void sendEmail_CustPresent() {
		boolean staleElement = true;
		while (staleElement) {
			try {
				waitABit(3000);
				sendEmail_CustPresent.click();
				staleElement = false;
			} catch (StaleElementReferenceException e) {
				staleElement = true;
			}
		}
	}

	public void clickOnCreate_Quote() {
		waitABit(4000);
		create_Quote.click();

	}

	public void service_Meachanic() {
		waitABit(3000);
		select_Service.click();
		select_Service_Value.click();
		waitABit(3000);
		select_Mechanic.click();
		select_Mechanic_Value.click();
	}

	public void clickOn_Submit() {
		waitABit(3000);
		submit.click();
		waitABit(7000);
	}

	public void clickOnPurchase_Order() {
		waitABit(4000);
		purchase_Order.click();
		waitABit(7000);
	}

	public void clickOnAddPurchase_Order() {
		waitABit(4000);
		// addPurchase_Order.click();
		waitABit(7000);
	}

	public void vendor_VendorLocation() {
		waitABit(3000);
		select_Vendor.click();
		select_Vendor_Value.click();
		waitABit(3000);
		select_Vendor_Location.click();
		select_Vendor_Location_Value.click();
		waitABit(3000);
	}

	public void clickOnSubmit_Request() {
		waitABit(3000);
		submit_Request.click();
		waitABit(3000);
	}

	public void navigate_Back() {
		waitABit(4000);
		// getDriver().navigate().back();
		// getDriver().navigate().refresh();
		//
		// getDriver().navigate().back();
		// waitABit(3000);

		// String allWindowHandle = getDriver().getWindowHandle();
		// getDriver().switchTo().window(allWindowHandle);
		// getDriver().get("https://pestream.com/Service/SubWorkOrder/PlumbingSubWorkOrder?workOrderId=634317&subWorkOrderId=45377");
		// waitABit(2000);
		/*
		 * waitABit(4000); getDriver().navigate().to(
		 * "https://pestream.com/Service/SubWorkOrder/PlumbingSubWorkOrder?workOrderId=634317&subWorkOrderId=45377"
		 * ); waitABit(3000);
		 */

		// new
		// getDriver().navigate().back();
		// waitABit(3000);
		// getDriver().navigate().back();
		// waitABit(4000);

		// new1
		waitABit(3000);
		((JavascriptExecutor) getDriver()).executeScript("window.history.go(-1)");

		waitABit(3000);
		((JavascriptExecutor) getDriver()).executeScript("window.history.go(-1)");
		// JavascriptExecutor js = (JavascriptExecutor) getDriver();
		// getDriver().executeScript("window.history.go(-1)");

	}

	public void clickOnStop_Job() {
		waitABit(3000);
		stop_Job.click();
		waitABit(3000);
	}

	public void select_Reason() {
		waitABit(3000);
		reason.click();
		waitABit(3000);
		reason_Value.click();
		waitABit(3000);
	}

	public void clickOnSave_Reason() {
		waitABit(3000);
		save_Reason.click();
	}

	public void clickOnSaveandContinue_Job() {
		waitABit(3000);
		saveAndContinue_Job.click();
	}

}

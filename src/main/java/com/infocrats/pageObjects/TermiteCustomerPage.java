package com.infocrats.pageObjects;

import java.util.Map;

import com.infocrats.utils.BaseUtills;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TermiteCustomerPage extends peststreamPage {
	BaseUtills utills = new BaseUtills();

	@FindBy(xpath = "(//span[contains(.,'Customer')])[1]")
	private WebElementFacade CustomerTermite;
	
	@FindBy(xpath = "//span[contains(text(),'Account')]")
	private WebElementFacade Account_Cust;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btnAddAccount']")
	private WebElementFacade AddAccount_Cust;
	
	@FindBy(xpath = "//select[@id='ContactTypeId']")
	private WebElementFacade DDContactType_AccCust;
	
	@FindBy(xpath = "//*[@id=\"ContactTypeId\"]/option[2]")
	private WebElementFacade ValueDDContactType_AccCust;
	
	@FindBy(xpath = "//div[contains(@class,'col-md-6')]//input[@id='AccountName']")
	private WebElementFacade AccountName_AccCust;
	
	@FindBy(xpath = "//span[contains(text(),'Nothing selected')]")
	private WebElementFacade DDSource_AccCust;
	
	@FindBy(xpath = "//span[contains(text(),'CustomerPortal App')]")
	private WebElementFacade ValueDDSource_AccCust;
	
	@FindBy(xpath = "//button[@type='submit'][contains(.,'Save')]")
	private WebElementFacade Save_AccCust;
	
	@FindBy(xpath = "//span[contains(text(),'Add Company')]")
	private WebElementFacade AddCompCust;
	
	@FindBy(xpath = "//input[@id='Name']")
	private WebElementFacade NameCompCust;
	
	@FindBy(xpath = "//div[@id='s2id_ddlCrmCompanySource']//b")
	private WebElementFacade DDSourceCompCust;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[5]")
	private WebElementFacade ValueDDSourceCompCust;
	
	@FindBy(xpath = "//input[@id='PrimaryEmail']")
	private WebElementFacade PEmailCompCust;
	
	@FindBy(xpath = "//input[@id='PrimaryPhone']")
	private WebElementFacade PPhone_CompCust;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElementFacade Save_CompCust;
	
	@FindBy(xpath = "//span[@class='title'][contains(text(),'Company')]")
	private WebElementFacade CompCust;
	
	@FindBy(xpath = "//span[contains(text(),'Contact')]")
	private WebElementFacade ContCustTermite;
	
	@FindBy(xpath = "//span[contains(text(),'Add Contact')]")
	private WebElementFacade AddContContCustTermite;
	
	@FindBy(xpath = "//input[@data-val-required='First Name is Required.']")
	private WebElementFacade FNameContCustTermite;
	
	@FindBy(xpath = "(//input[@type='text'])[20]")
	private WebElementFacade LNameContCustTermite;
	
	@FindBy(xpath = "//input[@id='PrimaryEmail']")
	private WebElementFacade PEmailContCustTermite;
	
	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade SaveContCustTermite;
	
	@FindBy(xpath = "(//span[contains(.,'Opportunity')])[1]")
	private WebElementFacade OppCustTermite;
	
	@FindBy(xpath = "//span[contains(text(),'Add Opportunity')]")
	private WebElementFacade AddOppCustTermite;
	
	@FindBy(xpath = "//input[@id='CrmCompanyName']")
	private WebElementFacade CompanyNameOppCust;
	
	@FindBy(xpath = "//input[@placeholder='Enter Opportunity Name']")
	private WebElementFacade OppNameOppCust;
	
	@FindBy(xpath = "//input[@id='CrmContactFirstName']")
	private WebElementFacade FNameOppCust;
	
	@FindBy(xpath = "//div[@class='col-md-4']//div[@id='s2id_BranchSysName']//b")
	private WebElementFacade DDBranchOppCust;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[6]")
	private WebElementFacade ValueDDBranchOppCust;
	
	@FindBy(xpath = "//div[@id='s2id_AddLeadDepartmentSysname']//b")
	private WebElementFacade DDDepartmentOppCust;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[3]")
	private WebElementFacade ValueDDDepartmentOppCust;
	
	@FindBy(xpath = "//span[contains(text(),'Nothing selected')]")
	private WebElementFacade DDSourceOppCust;
	
	@FindBy(xpath = "(//span[contains(.,'CustomerPortal App')])[2]")
	private WebElementFacade ValueDDSourceOppCust;
	
	@FindBy(xpath = "(//*[@id=\"FlowType\"])[2]")
	private WebElementFacade ResiOpptypeOppCust;
	
	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade SaveOppCust;
	
	@FindBy(xpath = "//a[contains(text(),'New Account')]")
	private WebElementFacade NewAccountOppCustTermite;
	
	@FindBy(xpath = "(//span[contains(.,'Lead')])[1]")
	private WebElementFacade LeadCustTermite;
	
	@FindBy(xpath = "//span[contains(text(),'Add Lead')]")
	private WebElementFacade AddLeadCustTermite;
	
	@FindBy(xpath = "(//input[@id='FirstName'])[2]")
	private WebElementFacade FNameLeadCustTermite;
	
	@FindBy(xpath = "//div[@class='col-md-6']//input[@id='Email']")
	private WebElementFacade PEmailLeadCustTermite;
	
	@FindBy(xpath = "//div[@class='form-body']//input[@id='Address1']")
	private WebElementFacade AddressLeadCustTermite;
	
	@FindBy(xpath = "//div[@class='form-body']//div[@id='s2id_StateId']//b")
	private WebElementFacade DDStateLeadCustTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade ValueDDStateLeadCustTermite;
	
	@FindBy(xpath = "//span[contains(text(),'Nothing selected')]")
	private WebElementFacade DDSourceLeadCustTermite;
	
	@FindBy(xpath = "//span[contains(.,'CustomerPortal App')]")
	private WebElementFacade ValueDDSourceLeadCustTermite;
	
	@FindBy(xpath = "(//*[@id='FlowType'])[1]")
	private WebElementFacade ResiLeadTypeLeadCustTermite;
	
	@FindBy(xpath = "//*[@id='AssignToTypeTeam']")
	private WebElementFacade SelectAssignTypeLeadCustTermite;
	
	@FindBy(xpath = "//button[2]//span[1]")
	private WebElementFacade SaveLeadCustTermite;
	
	@FindBy(xpath = "//span[contains(text(),'Database')]")
	private WebElementFacade DBCustTermite;
	
	@FindBy(xpath = "//span[contains(text(),'Database Entry')]")
	private WebElementFacade AddDBCustTermite;
	
	@FindBy(xpath = "//div[@class='col-lg-4']//input[@id='FirstName']")
	private WebElementFacade FNameDBCustTermite;
	
	@FindBy(xpath = "//div[@class='col-lg-4']//input[@id='LastName']")
	private WebElementFacade LNameDBCustTermite;
	
	@FindBy(xpath = "//div[@class='modal-body']//input[@id='Source']")
	private WebElementFacade SourceSysNameDBCustTermite;
	
	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade SaveDBCustTermite;
	
	@FindBy(xpath = "//button[@class='btn green btnSubmitAdvanceSearch']")
	private WebElementFacade AdvanceSearchAccCustTermite;
	
	@FindBy(xpath = "(//a[@title='Add Opportunity'])[1]")
	private WebElementFacade AddOppActionAdSearchAccCustTermite;
	
	@FindBy(xpath = "(//input[contains(@id,'Name')])[12]")
	private WebElementFacade OppNameAdSearchAccCustTermite;
	
	@FindBy(xpath = "(//input[@placeholder='Last Name'])[2]")
	private WebElementFacade LastNameAdSearchAccCustTermite;
	
	@FindBy(xpath = "//div[@id='s2id_BranchSysName']//b")
	private WebElementFacade DDBranchAdSearchAccCustTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[6]")
	private WebElementFacade ValueDDBranchAdSearchAccCustTermite;
	
	@FindBy(xpath = "//div[@id='s2id_AddLeadDepartmentSysname']//b")
	private WebElementFacade DDDeptAdSearchAccCustTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[3]")
	private WebElementFacade ValueDDDeptAdSearchAccCustTermite;
	
	@FindBy(xpath = "//span[contains(text(),'Nothing selected')]")
	private WebElementFacade DDSourceAdSearchAccCustTermite;
	
	@FindBy(xpath = "//span[contains(text(),'CustomerPortal App')]")
	private WebElementFacade ValueDDSourceAdSearchAccCustTermite;
	
	@FindBy(xpath = "(//*[@id=\"FlowType\"])[1]")
	private WebElementFacade ResiOppTypeAdSearchAccCustTermite;
	
	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade SaveAdSearchAccCustTermite;
	
	@FindBy(xpath = "(//a[@title='Phone Sales'])[1]")
	private WebElementFacade AddPhoneCallAdSearchAccCustTermite;
	
	@FindBy(xpath = "//input[@id='crmContactSaleshead']")
	private WebElementFacade ContactCallAdSearchAccCustTermite;

	@FindBy(xpath = "//*[@id='btngocrmContactSaleshead']/i")
	private WebElementFacade SearchContactCallAdSearchAccCustTermite;

	@FindBy(xpath = "/html//form[@id='frmGeneralInfo']/div[@class='divPhoneSales']//div[@class='col-md-3 divSalesContact']/div[@class='form-group']/div[@class='input-group']/span[@class='twitter-typeahead']/span[@class='tt-dropdown-menu']/div[@class='tt-dataset-list2']/span[@class='tt-suggestions']/div/div")
	private WebElementFacade ValueContactCallAdSearchAccCustTermite;
	
	@FindBy(xpath = "(//span[@class='filter-option pull-left'])[3]")
	private WebElementFacade DDSourceCallAdSearchAccCustTermite;
	
	@FindBy(xpath = "//span[contains(text(),'CustomerPortal App')]")
	private WebElementFacade ValueDDSourceCallAdSearchAccCustTermite;
	
	@FindBy(xpath = "//textarea[@id='AccountDescription']")
	private WebElementFacade AccAlertCallAdSearchAccCustTermite;
	
	@FindBy(xpath = "//div[@id='uniform-rdoResidential']")
	private WebElementFacade ResiOppTypeCallAdSearchAccCustTermite;
	
	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	private WebElementFacade ContinueCallAdSearchAccCustTermite;
	
	@FindBy(xpath = "(//a[contains(@title,'Delete')])[1]")
	private WebElementFacade DeleteAdSearchAccCustTermitee;
	
	@FindBy(xpath = "//button[@class='btn green btnDeleteAlertYes']")
	private WebElementFacade YesDeleteAdSearchAccCustTermite;
	
	@FindBy(xpath = "//input[@id='btnAdvanceSearch']")
	private WebElementFacade AdvanceSearchCompCustTermite;
	
	@FindBy(xpath = "(//a[@title='Add Opportunity'])[1]")
	private WebElementFacade AddOppActionCallAdSearchCompCustTermite;
	
	@FindBy(xpath = "//select[@id='ddlAccountId']")
	private WebElementFacade DDAccOppAdSearchAccCustTermite;
	
	@FindBy(xpath = "//*[@id=\"ddlAccountId\"]/option[2]")
	private WebElementFacade ValueDDAccOppAdSearchAccCustTermite;
	
	@FindBy(xpath = "(//span[contains(.,'Continue')])[1]")
	private WebElementFacade ContinueOppAdSearchAccCustTermite;
	
	@FindBy(xpath = "//input[@id='Name']")
	private WebElementFacade OppNameOppAdSearchAccCustTermite;
	
	@FindBy(xpath = "//div[@id='s2id_BranchSysName']//b")
	private WebElementFacade DDBranchOppAdSearchAccCustTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[6]")
	private WebElementFacade ValueDDBranchOppAdSearchAccCustTermite;
	
	@FindBy(xpath = "//div[@id='s2id_AddLeadDepartmentSysname']//b")
	private WebElementFacade DDDeptOppAdSearchAccCustTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[3]")
	private WebElementFacade ValueDDDeptOppAdSearchAccCustTermite;
	
	@FindBy(xpath = "//span[contains(text(),'Nothing selected')]")
	private WebElementFacade DDSourceOppAdSearchAccCustTermite;
	
	@FindBy(xpath = "//span[contains(text(),'CustomerPortal App')]")
	private WebElementFacade ValueDDSourceOppAdSearchAccCustTermite;
	
	@FindBy(xpath = "(//*[@id=\"FlowType\"])[1]")
	private WebElementFacade ResiOppTypeOppAdSearchAccCustTermite;
	
	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade SaveOppAdSearchAccCustTermite;
	
	@FindBy(xpath = "(//a[@title='Delete'])[1]")
	private WebElementFacade DeleteActionAdSearchCompCustTermite;
	
	@FindBy(xpath = "//button[@class='btn green btnDeleteAlertYes']")
	private WebElementFacade YesDeleteAdSearchCompCustTermite;
	
	@FindBy(xpath = "//input[@id='btnAdvanceSearch']")
	private WebElementFacade AdvanceSearchContCustTermite;
	
	@FindBy(xpath = "(//a[@title='Add Opportunity'])[1]")
	private WebElementFacade AddOppActionAdvanceSearchContCustTermite;
	
	@FindBy(xpath = "//select[@id='ddlSelectedAccount']")
	private WebElementFacade DDAccountAddOppAdvanceSearchContCustTermite;
	
	@FindBy(xpath = "//*[@id=\"ddlSelectedAccount\"]/option[2]")
	private WebElementFacade ValueDDAccountAddOppAdvanceSearchContCustTermite;
	
	@FindBy(xpath = "(//span[contains(.,'Continue')])[1]")
	private WebElementFacade ContAddOppAdvanceSearchContCustTermite;
	
	@FindBy(xpath = "//input[@id='Name']")
	private WebElementFacade OppNameAddOppAdvanceSearchContCustTermite;
	
	@FindBy(xpath = "//div[@id='s2id_BranchSysName']//b")
	private WebElementFacade DDBranchAddOppAdvanceSearchContCustTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[6]")
	private WebElementFacade ValueDDBranchAddOppAdvanceSearchContCustTermite;
	
	@FindBy(xpath = "//div[@id='s2id_AddLeadDepartmentSysname']//b")
	private WebElementFacade DDDeptAddOppAdvanceSearchContCustTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[3]")
	private WebElementFacade ValueDDDeptAddOppAdvanceSearchContCustTermite;
	
	@FindBy(xpath = "//span[contains(text(),'Nothing selected')]")
	private WebElementFacade DDSourceAddOppAdvanceSearchContCustTermite;
	
	@FindBy(xpath = "//span[contains(text(),'CustomerPortal App')]")
	private WebElementFacade ValueDDSourceAddOppAdvanceSearchContCustTermite;
	
	@FindBy(xpath = "(//*[@id=\"FlowType\"])[1]")
	private WebElementFacade ResiOppTypeAddOppAdvanceSearchContCustTermite;
	
	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade SaveAddOppAdvanceSearchContCustTermite;
	
	@FindBy(xpath = "(//a[@title='Delete'])[1]")
	private WebElementFacade DeleteActionAdSearchContCustTermite;
	
	@FindBy(xpath = "//button[@class='btn green btnDeleteAlertYes']")
	private WebElementFacade YesDeleteAdSearchContCustTermite;
	

	

	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	public void clickOn_CustomerTermite() {
		CustomerTermite.click();
		waitABit(1000);
		
	}



	public void clickOn_Account_Cust() {
		Account_Cust.click();
		waitABit(1000);
		
	}
	
	public void clickOn_AddAccount_AccCust() {
		AddAccount_Cust.click();
		waitABit(1000);
		
	}



	public void clickOn_DDContactType_AccCust() {
		DDContactType_AccCust.click();
		waitABit(1000);
		
		ValueDDContactType_AccCust.click();
		waitABit(1000);
		
	}



	public void clickOn_AccountName_AccCust(Map<String, String> testData) {
		AccountName_AccCust.sendKeys(testData.get("AccountName"));
		waitABit(1000);
		
	}



	public void clickOn_DDSource_AccCust() {
		DDSource_AccCust.click();
		waitABit(1000);
		
		ValueDDSource_AccCust.click();
		waitABit(1000);
		
	}



	public void clickOn_Save_AccCust() {
		scrollDown(Save_AccCust);
		Save_AccCust.click();
		waitABit(1000);
		
	}



	public void clickOn_AddComp_Cust() {
		AddCompCust.click();
		waitABit(1000);
		
	}



	public void clickOn_Name_CompCust(Map<String, String> testData) {
		NameCompCust.sendKeys(testData.get("Name"));
		waitABit(1000);
		
	}



	public void clickOn_DDSource_CompCust() {
		DDSourceCompCust.click();
		waitABit(1000);
		
		ValueDDSourceCompCust.click();
		waitABit(1000);
		
	}



	public void clickOn_PEmail_CompCust(Map<String, String> testData) {
		PEmailCompCust.sendKeys(testData.get("PrimaryEmail"));
		waitABit(1000);
		
	}



	public void clickOn_PPhone_CompCust(Map<String, String> testData) {
		PPhone_CompCust.sendKeys(testData.get("PrimaryPhone"));
		waitABit(1000);
		
	}



	public void clickOn_Save_CompCust() {
		Save_CompCust.click();
		waitABit(1000);
		
	}



	public void clickOn_CompCust() {
		CompCust.click();
		waitABit(1000);
		
	}



	public void clickOn_ContCustTermite() {
		ContCustTermite.click();
		waitABit(1000);
		
	}



	public void clickOn_AddCont_ContCustTermite() {
		AddContContCustTermite.click();
		waitABit(1000);
		
	}



	public void clickOn_FName_ContCustTermite(Map<String, String> testData) {
		FNameContCustTermite.sendKeys(testData.get("FirstName"));
		waitABit(1000);
		
	}
	
	
	public void clickOn_LName_ContCustTermite(Map<String, String> testData) {
		LNameContCustTermite.sendKeys(testData.get("LastName"));
		waitABit(1000);
		
	}



	public void clickOn_PEmail_ContCustTermite(Map<String, String> testData) {
		PEmailContCustTermite.sendKeys(testData.get("PrimaryEmail"));
		waitABit(1000);
		
	}



	public void clickOn_Save_ContCustTermite() {
		SaveContCustTermite.click();
		waitABit(1000);
		
	}



	public void clickOn_Opp_CustTermite() {
		OppCustTermite.click();
		waitABit(1000);
		
	}



	public void clickOn_AddOpp_CustTermite() {
		AddOppCustTermite.click();
		waitABit(1000);
		
	}



	public void clickOn_CompanyName_OppCust(Map<String, String> testData) {
		CompanyNameOppCust.sendKeys(testData.get("CompanyName"));
		waitABit(1000);
		
	}



	public void clickOn_OppName_OppCust(Map<String, String> testData) {
		OppNameOppCust.sendKeys(testData.get("OpportunityName"));
		waitABit(1000);
		
	}



	public void clickOn_FName_OppCust(Map<String, String> testData) {
		FNameOppCust.sendKeys(testData.get("FirstName"));
		waitABit(1000);
		
	}



	public void clickOn_DDBranch_OppCust() {
		DDBranchOppCust.click();
		waitABit(1000);
		
		ValueDDBranchOppCust.click();
		waitABit(1000);
		
	}



	public void clickOn_DDDepartment_OppCust() {
		DDDepartmentOppCust.click();
		waitABit(1000);
		
		ValueDDDepartmentOppCust.click();
		waitABit(1000);
		
	}



	public void clickOn_DDSource_OppCust() {
		DDSourceOppCust.click();
		waitABit(1000);
		
		ValueDDSourceOppCust.click();
		waitABit(1000);
		
	}



	public void clickOn_ResiOpptype_OppCust() {
		ResiOpptypeOppCust.click();
		waitABit(1000);
		
	}



	public void clickOn_Save_OppCust() {
		SaveOppCust.click();
		waitABit(1000);
		
	}



	public void clickOn_NewAccount_OppCustTermite() {
		NewAccountOppCustTermite.click();
		waitABit(1000);
		
	}



	public void clickOn_Lead_CustTermite() {
		LeadCustTermite.click();
		waitABit(1000);
		
	}



	public void clickOn_AddLead_CustTermite() {
		AddLeadCustTermite.click();
		waitABit(1000);
		
	}



	public void clickOn_FName_LeadCustTermite(Map<String, String> testData) {
		FNameLeadCustTermite.sendKeys(testData.get("FirstName"));
		waitABit(1000);
		
	}



	public void clickOn_PEmail_LeadCustTermite(Map<String, String> testData) {
		PEmailLeadCustTermite.sendKeys(testData.get("PrimaryEmail"));
		waitABit(1000);
		
	}



	public void clickOn_Address_LeadCustTermite(Map<String, String> testData) {
		AddressLeadCustTermite.sendKeys(testData.get("Address"));
		waitABit(1000);
		
	}



	public void clickOn_DDState_LeadCustTermite() {
		DDStateLeadCustTermite.click();
		waitABit(1000);
		
		ValueDDStateLeadCustTermite.click();
		waitABit(1000);
		
	}



	public void clickOn_DDSource_LeadCustTermite() {
		DDSourceLeadCustTermite.click();
		waitABit(1000);
		
		ValueDDSourceLeadCustTermite.click();
		waitABit(1000);
		
	}



	public void clickOn_ResiLeadType_LeadCustTermite() {
		ResiLeadTypeLeadCustTermite.click();
		waitABit(1000);
		
	}



	public void clickOn_SelectAssignType_LeadCustTermite() {
		SelectAssignTypeLeadCustTermite.click();
		waitABit(1000);
		
	}



	public void clickOn_Save_LeadCustTermite() {
		SaveLeadCustTermite.click();
		waitABit(1000);
		
	}



	public void clickOn_DB_CustTermite() {
		DBCustTermite.click();
		waitABit(1000);
		
	}



	public void clickOn_AddDB_CustTermite() {
		AddDBCustTermite.click();
		waitABit(1000);
		
	}



	public void clickOn_FName_DBCustTermite(Map<String, String> testData) {
		FNameDBCustTermite.sendKeys(testData.get("FirstName"));
		waitABit(1000);
		
	}



	public void clickOn_LName_DBCustTermite(Map<String, String> testData) {
		LNameDBCustTermite.sendKeys(testData.get("LastName"));
		waitABit(1000);
		
	}



	public void clickOn_SourceSysName_DBCustTermite(Map<String, String> testData) {
		SourceSysNameDBCustTermite.sendKeys(testData.get("SourceSysName"));
		waitABit(1000);
		
	}



	public void clickOn_Save_DBCustTermite() {
		SaveDBCustTermite.click();
		waitABit(1000);
		
	}



	public void clickOn_AdvanceSearch_AccCustTermite() {
		AdvanceSearchAccCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_AddOppAction_AdSearchAccCustTermite() {
		AddOppActionAdSearchAccCustTermite.click();
		waitABit(1000);
	}



	public void OppName_AdSearchAccCustTermite(Map<String, String> testData) {
		OppNameAdSearchAccCustTermite.sendKeys(testData.get("OppName"));
		waitABit(1000);
	}



	public void clickOn_LastName_AdSearchAccCustTermite(Map<String, String> testData) {
		LastNameAdSearchAccCustTermite.sendKeys(testData.get("LName"));
		waitABit(1000);
	}



	public void clickOn_DDBranch_AdSearchAccCustTermite() {
		DDBranchAdSearchAccCustTermite.click();
		waitABit(1000);
		
		ValueDDBranchAdSearchAccCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_DDDept_AdSearchAccCustTermite() {
        DDDeptAdSearchAccCustTermite.click();
		waitABit(1000);
		
		 ValueDDDeptAdSearchAccCustTermite.click();
		 waitABit(1000);
	}



	public void clickOn_DDSource_AdSearchAccCustTermite() {
		DDSourceAdSearchAccCustTermite.click();
		waitABit(1000);
		
		ValueDDSourceAdSearchAccCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_ResiOppType_AdSearchAccCustTermite() {
		ResiOppTypeAdSearchAccCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_Save_AdSearchAccCustTermite() {
		SaveAdSearchAccCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_AddPhone_CallAdSearchAccCustTermite() {
		AddPhoneCallAdSearchAccCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_Contact_CallAdSearchAccCustTermite(Map<String, String> testData) {
		waitABit(1000);
		ContactCallAdSearchAccCustTermite.sendKeys(testData.get("Contact"));
		waitABit(1000);
		SearchContactCallAdSearchAccCustTermite.click();
		waitABit(1000);
		ValueContactCallAdSearchAccCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_DDSource_CallAdSearchAccCustTermite() {
		DDSourceCallAdSearchAccCustTermite.click();
		waitABit(1000);
		
		ValueDDSourceCallAdSearchAccCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_AccAlert_CallAdSearchAccCustTermite(Map<String, String> testData) {
		AccAlertCallAdSearchAccCustTermite.sendKeys(testData.get("AccAlert"));
		waitABit(1000);
	}



	public void clickOn_ResiOppType_CallAdSearchAccCustTermite() {
		ResiOppTypeCallAdSearchAccCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_Continue_CallAdSearchAccCustTermite() {
		ContinueCallAdSearchAccCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_Delete_AdSearchAccCustTermitee() {
		DeleteAdSearchAccCustTermitee.click();
		waitABit(1000);
	}



	public void clickOn_Yes_DeleteAdSearchAccCustTermite() {
		YesDeleteAdSearchAccCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_AdvanceSearch_CompCustTermite() {
		AdvanceSearchCompCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_AddOppAction_CallAdSearchCompCustTermite() {
		AddOppActionCallAdSearchCompCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_DDAcc_OppAdSearchAccCustTermite() {
		DDAccOppAdSearchAccCustTermite.click();
		waitABit(1000);
		
		ValueDDAccOppAdSearchAccCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_Continue_OppAdSearchAccCustTermite() {
	    ContinueOppAdSearchAccCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_OppName_OppAdSearchAccCustTermite(Map<String, String> testData) {
		OppNameOppAdSearchAccCustTermite.sendKeys(testData.get("OppName"));
		waitABit(1000);
	}



	public void clickOn_DDBranch_OppAdSearchAccCustTermite() {
		DDBranchOppAdSearchAccCustTermite.click();
		waitABit(1000);
		
		ValueDDBranchOppAdSearchAccCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_DDDept_OppAdSearchAccCustTermite() {
		DDDeptOppAdSearchAccCustTermite.click();
		waitABit(1000);
		
		ValueDDDeptOppAdSearchAccCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_DDSource_OppAdSearchAccCustTermite() {
		DDSourceOppAdSearchAccCustTermite.click();
		waitABit(1000);
		
		ValueDDSourceOppAdSearchAccCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_ResiOppType_OppAdSearchAccCustTermite() {
		ResiOppTypeOppAdSearchAccCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_Save_OppAdSearchAccCustTermite() {
		SaveOppAdSearchAccCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_DeleteAction_AdSearchCompCustTermite() {
		DeleteActionAdSearchCompCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_Yes_DeleteAdSearchCompCustTermite() {
		YesDeleteAdSearchCompCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_AdvanceSearch_ContCustTermite() {
		AdvanceSearchContCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_AddOppAction_AdvanceSearchContCustTermite() {
		AddOppActionAdvanceSearchContCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_DDAccount_AddOppAdvanceSearchContCustTermite() {
		DDAccountAddOppAdvanceSearchContCustTermite.click();
		waitABit(1000);
		
		ValueDDAccountAddOppAdvanceSearchContCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_Cont_AddOppAdvanceSearchContCustTermite() {
		ContAddOppAdvanceSearchContCustTermite.click();
		waitABit(1000);
		
	}



	public void clickOn_OppName_AddOppAdvanceSearchContCustTermite(Map<String, String> testData) {
		OppNameAddOppAdvanceSearchContCustTermite.sendKeys(testData.get("OppName"));
		waitABit(1000);
	}



	public void clickOn_DDBranch_AddOppAdvanceSearchContCustTermite() {
		DDBranchAddOppAdvanceSearchContCustTermite.click();
		waitABit(1000);
		
		ValueDDBranchAddOppAdvanceSearchContCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_DDDept_AddOppAdvanceSearchContCustTermite() {
		DDDeptAddOppAdvanceSearchContCustTermite.click();
		waitABit(1000);
		
		ValueDDDeptAddOppAdvanceSearchContCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_DDSource_AddOppAdvanceSearchContCustTermite() {
		DDSourceAddOppAdvanceSearchContCustTermite.click();
		waitABit(1000);
		
		ValueDDSourceAddOppAdvanceSearchContCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_ResiOppType_AddOppAdvanceSearchContCustTermite() {
		ResiOppTypeAddOppAdvanceSearchContCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_Save_AddOppAdvanceSearchContCustTermite() {
		SaveAddOppAdvanceSearchContCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_DeleteAction_AdSearchContCustTermite() {
		DeleteActionAdSearchContCustTermite.click();
		waitABit(1000);
	}



	public void clickOn_Yes_DeleteAdSearchContCustTermite() {
		YesDeleteAdSearchContCustTermite.click();
		waitABit(1000);
	}



	

}

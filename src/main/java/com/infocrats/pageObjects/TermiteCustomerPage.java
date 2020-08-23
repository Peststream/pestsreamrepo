package com.infocrats.pageObjects;

import java.util.Map;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.JsonHelper;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TermiteCustomerPage extends peststreamPage {
	BaseUtills utills = new BaseUtills();
	private Map<String, Integer> jsonData;

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
	
	

	public void clickOn_CustomerTermite() throws Exception {
		CustomerTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time1"));
		
	}



	public void clickOn_Account_Cust() throws Exception {
		Account_Cust.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}
	
	public void clickOn_AddAccount_AccCust() throws Exception {
		AddAccount_Cust.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_DDContactType_AccCust() throws Exception {
		DDContactType_AccCust.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		ValueDDContactType_AccCust.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_AccountName_AccCust(Map<String, String> testData) throws Exception {
		AccountName_AccCust.sendKeys(testData.get("AccountName"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_DDSource_AccCust() throws Exception {
		DDSource_AccCust.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		ValueDDSource_AccCust.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_Save_AccCust() throws Exception {
		scrollDown(Save_AccCust);
		Save_AccCust.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_AddComp_Cust() throws Exception {
		AddCompCust.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_Name_CompCust(Map<String, String> testData) throws Exception {
		NameCompCust.sendKeys(testData.get("Name"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_DDSource_CompCust() throws Exception {
		DDSourceCompCust.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		ValueDDSourceCompCust.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_PEmail_CompCust(Map<String, String> testData) throws Exception {
		PEmailCompCust.sendKeys(testData.get("PrimaryEmail"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_PPhone_CompCust(Map<String, String> testData) throws Exception {
		PPhone_CompCust.sendKeys(testData.get("PrimaryPhone"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_Save_CompCust() throws Exception {
		Save_CompCust.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_CompCust() throws Exception {
		CompCust.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_ContCustTermite() throws Exception {
		ContCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_AddCont_ContCustTermite() throws Exception {
		AddContContCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_FName_ContCustTermite(Map<String, String> testData) throws Exception {
		FNameContCustTermite.sendKeys(testData.get("FirstName"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}
	
	
	public void clickOn_LName_ContCustTermite(Map<String, String> testData) throws Exception {
		LNameContCustTermite.sendKeys(testData.get("LastName"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_PEmail_ContCustTermite(Map<String, String> testData) throws Exception {
		PEmailContCustTermite.sendKeys(testData.get("PrimaryEmail"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_Save_ContCustTermite() throws Exception {
		SaveContCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_Opp_CustTermite() throws Exception {
		OppCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_AddOpp_CustTermite() throws Exception {
		AddOppCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_CompanyName_OppCust(Map<String, String> testData) throws Exception {
		CompanyNameOppCust.sendKeys(testData.get("CompanyName"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_OppName_OppCust(Map<String, String> testData) throws Exception {
		OppNameOppCust.sendKeys(testData.get("OpportunityName"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_FName_OppCust(Map<String, String> testData) throws Exception {
		FNameOppCust.sendKeys(testData.get("FirstName"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_DDBranch_OppCust() throws Exception {
		DDBranchOppCust.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		ValueDDBranchOppCust.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_DDDepartment_OppCust() throws Exception {
		DDDepartmentOppCust.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		ValueDDDepartmentOppCust.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_DDSource_OppCust() throws Exception {
		DDSourceOppCust.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		ValueDDSourceOppCust.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_ResiOpptype_OppCust() throws Exception {
		ResiOpptypeOppCust.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_Save_OppCust() throws Exception {
		SaveOppCust.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_NewAccount_OppCustTermite() throws Exception {
		NewAccountOppCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_Lead_CustTermite() throws Exception {
		LeadCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_AddLead_CustTermite() throws Exception {
		AddLeadCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_FName_LeadCustTermite(Map<String, String> testData) throws Exception {
		FNameLeadCustTermite.sendKeys(testData.get("FirstName"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_PEmail_LeadCustTermite(Map<String, String> testData) throws Exception {
		PEmailLeadCustTermite.sendKeys(testData.get("PrimaryEmail"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_Address_LeadCustTermite(Map<String, String> testData) throws Exception {
		AddressLeadCustTermite.sendKeys(testData.get("Address"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_DDState_LeadCustTermite() throws Exception {
		DDStateLeadCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		ValueDDStateLeadCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_DDSource_LeadCustTermite() throws Exception {
		DDSourceLeadCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		ValueDDSourceLeadCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_ResiLeadType_LeadCustTermite() throws Exception {
		ResiLeadTypeLeadCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_SelectAssignType_LeadCustTermite() throws Exception {
		SelectAssignTypeLeadCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_Save_LeadCustTermite() throws Exception {
		SaveLeadCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_DB_CustTermite() throws Exception {
		DBCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_AddDB_CustTermite() throws Exception {
		AddDBCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_FName_DBCustTermite(Map<String, String> testData) throws Exception {
		FNameDBCustTermite.sendKeys(testData.get("FirstName"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_LName_DBCustTermite(Map<String, String> testData) throws Exception {
		LNameDBCustTermite.sendKeys(testData.get("LastName"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_SourceSysName_DBCustTermite(Map<String, String> testData) throws Exception {
		SourceSysNameDBCustTermite.sendKeys(testData.get("SourceSysName"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_Save_DBCustTermite() throws Exception {
		SaveDBCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_AdvanceSearch_AccCustTermite() throws Exception {
		AdvanceSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_AddOppAction_AdSearchAccCustTermite() throws Exception {
		AddOppActionAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void OppName_AdSearchAccCustTermite(Map<String, String> testData) throws Exception {
		OppNameAdSearchAccCustTermite.sendKeys(testData.get("OppName"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_LastName_AdSearchAccCustTermite(Map<String, String> testData) throws Exception {
		LastNameAdSearchAccCustTermite.sendKeys(testData.get("LName"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDBranch_AdSearchAccCustTermite() throws Exception {
		DDBranchAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		ValueDDBranchAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDDept_AdSearchAccCustTermite() throws Exception {
        DDDeptAdSearchAccCustTermite.click();
        jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		 ValueDDDeptAdSearchAccCustTermite.click();
		 jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		 waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDSource_AdSearchAccCustTermite() throws Exception {
		DDSourceAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		ValueDDSourceAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_ResiOppType_AdSearchAccCustTermite() throws Exception {
		ResiOppTypeAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Save_AdSearchAccCustTermite() throws Exception {
		SaveAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_AddPhone_CallAdSearchAccCustTermite() throws Exception {
		AddPhoneCallAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Contact_CallAdSearchAccCustTermite(Map<String, String> testData) throws Exception {
		waitABit(1000);
		ContactCallAdSearchAccCustTermite.sendKeys(testData.get("Contact"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		SearchContactCallAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		ValueContactCallAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDSource_CallAdSearchAccCustTermite() throws Exception {
		DDSourceCallAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		ValueDDSourceCallAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_AccAlert_CallAdSearchAccCustTermite(Map<String, String> testData) throws Exception {
		AccAlertCallAdSearchAccCustTermite.sendKeys(testData.get("AccAlert"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_ResiOppType_CallAdSearchAccCustTermite() throws Exception {
		ResiOppTypeCallAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Continue_CallAdSearchAccCustTermite() throws Exception {
		ContinueCallAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Delete_AdSearchAccCustTermitee() throws Exception {
		DeleteAdSearchAccCustTermitee.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Yes_DeleteAdSearchAccCustTermite() throws Exception {
		YesDeleteAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_AdvanceSearch_CompCustTermite() throws Exception {
		AdvanceSearchCompCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_AddOppAction_CallAdSearchCompCustTermite() throws Exception {
		AddOppActionCallAdSearchCompCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDAcc_OppAdSearchAccCustTermite() throws Exception {
		DDAccOppAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		ValueDDAccOppAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Continue_OppAdSearchAccCustTermite() throws Exception {
	    ContinueOppAdSearchAccCustTermite.click();
	    jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_OppName_OppAdSearchAccCustTermite(Map<String, String> testData) throws Exception {
		OppNameOppAdSearchAccCustTermite.sendKeys(testData.get("OppName"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDBranch_OppAdSearchAccCustTermite() throws Exception {
		DDBranchOppAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		ValueDDBranchOppAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDDept_OppAdSearchAccCustTermite() throws Exception {
		DDDeptOppAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		ValueDDDeptOppAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDSource_OppAdSearchAccCustTermite() throws Exception {
		DDSourceOppAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		ValueDDSourceOppAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_ResiOppType_OppAdSearchAccCustTermite() throws Exception {
		ResiOppTypeOppAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Save_OppAdSearchAccCustTermite() throws Exception {
		SaveOppAdSearchAccCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DeleteAction_AdSearchCompCustTermite() throws Exception {
		DeleteActionAdSearchCompCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Yes_DeleteAdSearchCompCustTermite() throws Exception {
		YesDeleteAdSearchCompCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_AdvanceSearch_ContCustTermite() throws Exception {
		AdvanceSearchContCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_AddOppAction_AdvanceSearchContCustTermite() throws Exception {
		AddOppActionAdvanceSearchContCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDAccount_AddOppAdvanceSearchContCustTermite() throws Exception {
		DDAccountAddOppAdvanceSearchContCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		ValueDDAccountAddOppAdvanceSearchContCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Cont_AddOppAdvanceSearchContCustTermite() throws Exception {
		ContAddOppAdvanceSearchContCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_OppName_AddOppAdvanceSearchContCustTermite(Map<String, String> testData) throws Exception {
		OppNameAddOppAdvanceSearchContCustTermite.sendKeys(testData.get("OppName"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDBranch_AddOppAdvanceSearchContCustTermite() throws Exception {
		DDBranchAddOppAdvanceSearchContCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		ValueDDBranchAddOppAdvanceSearchContCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDDept_AddOppAdvanceSearchContCustTermite() throws Exception {
		DDDeptAddOppAdvanceSearchContCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		ValueDDDeptAddOppAdvanceSearchContCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDSource_AddOppAdvanceSearchContCustTermite() throws Exception {
		DDSourceAddOppAdvanceSearchContCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
		
		ValueDDSourceAddOppAdvanceSearchContCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_ResiOppType_AddOppAdvanceSearchContCustTermite() throws Exception {
		ResiOppTypeAddOppAdvanceSearchContCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Save_AddOppAdvanceSearchContCustTermite() throws Exception {
		SaveAddOppAdvanceSearchContCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DeleteAction_AdSearchContCustTermite() throws Exception {
		DeleteActionAdSearchContCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Yes_DeleteAdSearchContCustTermite() throws Exception {
		YesDeleteAdSearchContCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	

}

package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	@FindBy(xpath = "(//a[@href='javascript:;'])[13]")
	private WebElementFacade contactSearchValuetermite;
	
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
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(CustomerTermite));
		CustomerTermite.click();
		
		waitABit(jsonData.get("Time3"));
	}



	public void clickOn_Account_Cust() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Account_Cust));
		Account_Cust.click();
		
		waitABit(jsonData.get("Time3"));
	}
	
	public void clickOn_AddAccount_AccCust() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddAccount_Cust));
		AddAccount_Cust.click();
		waitABit(jsonData.get("Time3"));
		
	}



	public void clickOn_DDContactType_AccCust() throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDContactType_AccCust));
		DDContactType_AccCust.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDContactType_AccCust));
		ValueDDContactType_AccCust.click();
		
		waitABit(jsonData.get("Time3"));
	}



	public void clickOn_AccountName_AccCust(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AccountName_AccCust));
		AccountName_AccCust.sendKeys(testData.get("AccountName"));
		
		waitABit(jsonData.get("Time3"));
	}



	public void clickOn_DDSource_AccCust() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDSource_AccCust));
		DDSource_AccCust.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(DDSource_AccCust));
		ValueDDSource_AccCust.click();
		waitABit(jsonData.get("Time3"));
	}



	public void clickOn_Save_AccCust() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Save_AccCust));
		scrollDown(Save_AccCust);
		Save_AccCust.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_AddComp_Cust() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddCompCust));
		AddCompCust.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_Name_CompCust(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(NameCompCust));
		NameCompCust.sendKeys(testData.get("Name"));
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_DDSource_CompCust() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDSourceCompCust));
		DDSourceCompCust.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDSourceCompCust));
		ValueDDSourceCompCust.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_PEmail_CompCust(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(PEmailCompCust));
		PEmailCompCust.sendKeys(testData.get("PrimaryEmail"));
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_PPhone_CompCust(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(PPhone_CompCust));
		PPhone_CompCust.sendKeys(testData.get("PrimaryPhone"));
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_Save_CompCust() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Save_CompCust));
		Save_CompCust.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_CompCust() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(CompCust));
		CompCust.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_ContCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ContCustTermite));
		ContCustTermite.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_AddCont_ContCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddContContCustTermite));
		AddContContCustTermite.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_FName_ContCustTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(FNameContCustTermite));
		FNameContCustTermite.sendKeys(testData.get("FirstName"));
		waitABit(jsonData.get("Time2"));
		
	}
	
	
	public void clickOn_LName_ContCustTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(LNameContCustTermite));
		LNameContCustTermite.sendKeys(testData.get("LastName"));
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_PEmail_ContCustTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(PEmailContCustTermite));
		PEmailContCustTermite.sendKeys(testData.get("PrimaryEmail"));
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_Save_ContCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveContCustTermite));
		SaveContCustTermite.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_Opp_CustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(OppCustTermite));
		OppCustTermite.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_AddOpp_CustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddOppCustTermite));
		AddOppCustTermite.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_CompanyName_OppCust(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(CompanyNameOppCust));
		CompanyNameOppCust.sendKeys(testData.get("CompanyName"));
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_OppName_OppCust(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(OppNameOppCust));
		OppNameOppCust.sendKeys(testData.get("OpportunityName"));
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_FName_OppCust(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(FNameOppCust));
		FNameOppCust.sendKeys(testData.get("FirstName"));
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_DDBranch_OppCust() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDBranchOppCust));
		DDBranchOppCust.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDBranchOppCust));
		ValueDDBranchOppCust.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_DDDepartment_OppCust() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDDepartmentOppCust));
		DDDepartmentOppCust.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDDepartmentOppCust));
		ValueDDDepartmentOppCust.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_DDSource_OppCust() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDSourceOppCust));
		DDSourceOppCust.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDSourceOppCust));
		ValueDDSourceOppCust.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_ResiOpptype_OppCust() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ResiOpptypeOppCust));
		ResiOpptypeOppCust.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_Save_OppCust() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveOppCust));
		SaveOppCust.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_NewAccount_OppCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(NewAccountOppCustTermite));
		NewAccountOppCustTermite.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_Lead_CustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(LeadCustTermite));
		LeadCustTermite.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_AddLead_CustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddLeadCustTermite));
		AddLeadCustTermite.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_FName_LeadCustTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(FNameLeadCustTermite));
		FNameLeadCustTermite.sendKeys(testData.get("FirstName"));
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_PEmail_LeadCustTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(PEmailLeadCustTermite));
		PEmailLeadCustTermite.sendKeys(testData.get("PrimaryEmail"));
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_Address_LeadCustTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddressLeadCustTermite));
		AddressLeadCustTermite.sendKeys(testData.get("Address"));
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_DDState_LeadCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDStateLeadCustTermite));
		DDStateLeadCustTermite.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDStateLeadCustTermite));
		ValueDDStateLeadCustTermite.click();
		
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_DDSource_LeadCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDSourceLeadCustTermite));
		DDSourceLeadCustTermite.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDSourceLeadCustTermite));
		ValueDDSourceLeadCustTermite.click();
		
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_ResiLeadType_LeadCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ResiLeadTypeLeadCustTermite));
		ResiLeadTypeLeadCustTermite.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_SelectAssignType_LeadCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SelectAssignTypeLeadCustTermite));
		SelectAssignTypeLeadCustTermite.click();

		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_Save_LeadCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveLeadCustTermite));
		SaveLeadCustTermite.click();
		
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_DB_CustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DBCustTermite));
		
		DBCustTermite.click();

		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_AddDB_CustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddDBCustTermite));
		
		AddDBCustTermite.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_FName_DBCustTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(FNameDBCustTermite));
		FNameDBCustTermite.sendKeys(testData.get("FirstName"));
	
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_LName_DBCustTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(LNameDBCustTermite));
		
		LNameDBCustTermite.sendKeys(testData.get("LastName"));
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_SourceSysName_DBCustTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SourceSysNameDBCustTermite));
		
		SourceSysNameDBCustTermite.sendKeys(testData.get("SourceSysName"));
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_Save_DBCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveDBCustTermite));
		
		SaveDBCustTermite.click();
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_AdvanceSearch_AccCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AdvanceSearchAccCustTermite));
		
		AdvanceSearchAccCustTermite.click();
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_AddOppAction_AdSearchAccCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddOppActionAdSearchAccCustTermite));
		
		AddOppActionAdSearchAccCustTermite.click();
		waitABit(jsonData.get("Time2"));
	}



	public void OppName_AdSearchAccCustTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(OppNameAdSearchAccCustTermite));
		
		OppNameAdSearchAccCustTermite.sendKeys(testData.get("OppName"));
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_LastName_AdSearchAccCustTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(LastNameAdSearchAccCustTermite));
		
		LastNameAdSearchAccCustTermite.sendKeys(testData.get("LName"));
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDBranch_AdSearchAccCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDBranchAdSearchAccCustTermite));
		
		DDBranchAdSearchAccCustTermite.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDBranchAdSearchAccCustTermite));
		ValueDDBranchAdSearchAccCustTermite.click();
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDDept_AdSearchAccCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDDeptAdSearchAccCustTermite));
		
		DDDeptAdSearchAccCustTermite.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDDeptAdSearchAccCustTermite));
		ValueDDDeptAdSearchAccCustTermite.click();
		 waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDSource_AdSearchAccCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDSourceAdSearchAccCustTermite));
		
		DDSourceAdSearchAccCustTermite.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDSourceAdSearchAccCustTermite));
		ValueDDSourceAdSearchAccCustTermite.click();
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_ResiOppType_AdSearchAccCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ResiOppTypeAdSearchAccCustTermite));
		ResiOppTypeAdSearchAccCustTermite.click();
	
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Save_AdSearchAccCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveAdSearchAccCustTermite));
		SaveAdSearchAccCustTermite.click();
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_AddPhone_CallAdSearchAccCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddPhoneCallAdSearchAccCustTermite));
		AddPhoneCallAdSearchAccCustTermite.click();
	
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Contact_CallAdSearchAccCustTermite(Map<String, String> testData) throws Exception {
		waitABit(jsonData.get("Time2"));
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time2"));
		wait.until(ExpectedConditions.elementToBeClickable(ContactCallAdSearchAccCustTermite));
		ContactCallAdSearchAccCustTermite.sendKeys(testData.get("Contact"));
		
		wait.until(ExpectedConditions.elementToBeClickable(SearchContactCallAdSearchAccCustTermite));
		SearchContactCallAdSearchAccCustTermite.click();
		/*wait.until(ExpectedConditions.elementToBeClickable(ValueContactCallAdSearchAccCustTermite));
		ValueContactCallAdSearchAccCustTermite.click();*/
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(contactSearchValuetermite));
		contactSearchValuetermite.click();
	}



	public void clickOn_DDSource_CallAdSearchAccCustTermite() throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDSourceCallAdSearchAccCustTermite));
		DDSourceCallAdSearchAccCustTermite.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDSourceCallAdSearchAccCustTermite));
		ValueDDSourceCallAdSearchAccCustTermite.click();
	
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_AccAlert_CallAdSearchAccCustTermite(Map<String, String> testData) throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AccAlertCallAdSearchAccCustTermite));
		AccAlertCallAdSearchAccCustTermite.sendKeys(testData.get("AccAlert"));
		
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_ResiOppType_CallAdSearchAccCustTermite() throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ResiOppTypeCallAdSearchAccCustTermite));
		ResiOppTypeCallAdSearchAccCustTermite.click();
	
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Continue_CallAdSearchAccCustTermite() throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ContinueCallAdSearchAccCustTermite));
		ContinueCallAdSearchAccCustTermite.click();
	
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Delete_AdSearchAccCustTermitee() throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DeleteAdSearchAccCustTermitee));
		DeleteAdSearchAccCustTermitee.click();
	
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Yes_DeleteAdSearchAccCustTermite() throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(YesDeleteAdSearchAccCustTermite));
		YesDeleteAdSearchAccCustTermite.click();
	
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_AdvanceSearch_CompCustTermite() throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AdvanceSearchCompCustTermite));
		AdvanceSearchCompCustTermite.click();

		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_AddOppAction_CallAdSearchCompCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddOppActionCallAdSearchCompCustTermite));
		AddOppActionCallAdSearchCompCustTermite.click();
	
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDAcc_OppAdSearchAccCustTermite() throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDAccOppAdSearchAccCustTermite));
		DDAccOppAdSearchAccCustTermite.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDAccOppAdSearchAccCustTermite));
		ValueDDAccOppAdSearchAccCustTermite.click();
		
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Continue_OppAdSearchAccCustTermite() throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ContinueOppAdSearchAccCustTermite));
	    ContinueOppAdSearchAccCustTermite.click();
	
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_OppName_OppAdSearchAccCustTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(OppNameOppAdSearchAccCustTermite));
		OppNameOppAdSearchAccCustTermite.sendKeys(testData.get("OppName"));
		
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDBranch_OppAdSearchAccCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDBranchOppAdSearchAccCustTermite));
		
		DDBranchOppAdSearchAccCustTermite.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDBranchOppAdSearchAccCustTermite));
		ValueDDBranchOppAdSearchAccCustTermite.click();
		
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDDept_OppAdSearchAccCustTermite() throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDDeptOppAdSearchAccCustTermite));
		DDDeptOppAdSearchAccCustTermite.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDDeptOppAdSearchAccCustTermite));
		ValueDDDeptOppAdSearchAccCustTermite.click();
		
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDSource_OppAdSearchAccCustTermite() throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDSourceOppAdSearchAccCustTermite));
		
		DDSourceOppAdSearchAccCustTermite.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDSourceOppAdSearchAccCustTermite));
		
		ValueDDSourceOppAdSearchAccCustTermite.click();
	
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_ResiOppType_OppAdSearchAccCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ResiOppTypeOppAdSearchAccCustTermite));
		
		ResiOppTypeOppAdSearchAccCustTermite.click();
		
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Save_OppAdSearchAccCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveOppAdSearchAccCustTermite));
		SaveOppAdSearchAccCustTermite.click();
	
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DeleteAction_AdSearchCompCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DeleteActionAdSearchCompCustTermite));
		DeleteActionAdSearchCompCustTermite.click();
		
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Yes_DeleteAdSearchCompCustTermite() throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(YesDeleteAdSearchCompCustTermite));
		YesDeleteAdSearchCompCustTermite.click();
		
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_AdvanceSearch_ContCustTermite() throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AdvanceSearchContCustTermite));
		AdvanceSearchContCustTermite.click();
		
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_AddOppAction_AdvanceSearchContCustTermite() throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddOppActionAdvanceSearchContCustTermite));
		AddOppActionAdvanceSearchContCustTermite.click();
		
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDAccount_AddOppAdvanceSearchContCustTermite() throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDAccountAddOppAdvanceSearchContCustTermite));
		DDAccountAddOppAdvanceSearchContCustTermite.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDAccountAddOppAdvanceSearchContCustTermite));
		ValueDDAccountAddOppAdvanceSearchContCustTermite.click();
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Cont_AddOppAdvanceSearchContCustTermite() throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ContAddOppAdvanceSearchContCustTermite));
		ContAddOppAdvanceSearchContCustTermite.click();
		
		waitABit(jsonData.get("Time2"));
		
	}



	public void clickOn_OppName_AddOppAdvanceSearchContCustTermite(Map<String, String> testData) throws Exception {
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(OppNameAddOppAdvanceSearchContCustTermite));
		OppNameAddOppAdvanceSearchContCustTermite.sendKeys(testData.get("OppName"));
		
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDBranch_AddOppAdvanceSearchContCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDBranchAddOppAdvanceSearchContCustTermite));
		
		DDBranchAddOppAdvanceSearchContCustTermite.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDBranchAddOppAdvanceSearchContCustTermite));
		
		ValueDDBranchAddOppAdvanceSearchContCustTermite.click();
		
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDDept_AddOppAdvanceSearchContCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDDeptAddOppAdvanceSearchContCustTermite));
		
		DDDeptAddOppAdvanceSearchContCustTermite.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDDeptAddOppAdvanceSearchContCustTermite));
		
		ValueDDDeptAddOppAdvanceSearchContCustTermite.click();
		
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DDSource_AddOppAdvanceSearchContCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDSourceAddOppAdvanceSearchContCustTermite));
		
		DDSourceAddOppAdvanceSearchContCustTermite.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDSourceAddOppAdvanceSearchContCustTermite));
		
		ValueDDSourceAddOppAdvanceSearchContCustTermite.click();
		
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_ResiOppType_AddOppAdvanceSearchContCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ResiOppTypeAddOppAdvanceSearchContCustTermite));
		
		ResiOppTypeAddOppAdvanceSearchContCustTermite.click();
	
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Save_AddOppAdvanceSearchContCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveAddOppAdvanceSearchContCustTermite));
		
		SaveAddOppAdvanceSearchContCustTermite.click();
		
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_DeleteAction_AdSearchContCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DeleteActionAdSearchContCustTermite));
		
		DeleteActionAdSearchContCustTermite.click();
		
		waitABit(jsonData.get("Time2"));
	}



	public void clickOn_Yes_DeleteAdSearchContCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(YesDeleteAdSearchContCustTermite));
		
		YesDeleteAdSearchContCustTermite.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		waitABit(jsonData.get("Time2"));
	}



	

}

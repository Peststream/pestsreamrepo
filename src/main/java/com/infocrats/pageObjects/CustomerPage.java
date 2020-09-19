package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.JsonHelper;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CustomerPage extends peststreamPage {

	BaseUtills utills = new BaseUtills();
	private Map<String, Integer> jsonData;

	@FindBy(linkText = "Lead")
	private WebElementFacade lead_tab;

	@FindBy(xpath = "//button[@class='btn btn-primary btnAddWebLead']")
	private WebElementFacade add_lead;

	@FindBy(xpath = "(//*[@id=\"FirstName\"])[2]")
	private WebElementFacade firstName;

	@FindBy(xpath = "(//*[@id=\"LastName\"])[2]")
	private WebElementFacade lastName;

	@FindBy(xpath = "(//*[@id=\"Email\"])[2]")
	private WebElementFacade primaryMail;

	@FindBy(xpath = "(//*[@id=\"Address1\"])[2]")
	private WebElementFacade address1;

	@FindBy(xpath = "(//*[@id=\"s2id_StateId\"])[2]")
	private WebElementFacade stateDDL;

	@FindBy(xpath = "//*[@id=\"select2-results-9\"]/li[2]")
	private WebElementFacade stateValue;

	@FindBy(xpath = "//*[@id=\"Latitude\"]")
	private WebElementFacade latitute;

	@FindBy(xpath = "//*[@id=\"Longitude\"]")
	private WebElementFacade logitude;

	@FindBy(xpath = "//*[@id=\"ThirdPartyLocationCode\"]")
	private WebElementFacade thirdPartyLocationCode;

	@FindBy(xpath = "//*[@id=\"FlowType\"]")
	private WebElementFacade leadType;

	@FindBy(xpath = "//*[@id=\"AssignToTypeTeam\"]")
	private WebElementFacade assignType;

	@FindBy(xpath = "//*[@id=\"Comments\"]")
	private WebElementFacade notes;

	@FindBy(xpath = "//*[@id=\"form0\"]/div[2]/button[2]")
	private WebElementFacade saveLead;

	@FindBy(xpath = "//*[@id=\"AssignToTypeTeam\"]")
	private WebElementFacade saveAndCont;

	@FindBy(xpath = "//*[@id=\"s2id_AssignToTeamId\"]")
	private WebElementFacade teamDDL;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade teamValue;

	@FindBy(linkText = "Account")
	private WebElementFacade accountTab;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div/button")
	private WebElementFacade add_account_btn;

	@FindBy(xpath = "(//*[@id=\"ContactTypeId\"])[1]")
	private WebElementFacade contact_type_ddl;

	@FindBy(xpath = "//*[@id=\"ContactTypeId\"]/option[2]")
	private WebElementFacade contact_type_value;

	@FindBy(xpath = "(//*[@id=\"AccountName\"])[2]")
	private WebElementFacade account_name;

	@FindBy(xpath = "//*[@id=\"crmCompanyHead\"]")
	private WebElementFacade add_company;

	@FindBy(xpath = "//*[@id=\"form0\"]/div[1]/div[2]/div[6]/div/div/span/span/div/div/a")
	WebElementFacade create_new_contact;

	@FindBy(xpath = "//span[contains(@class,'title')][contains(text(),'Company')]")
	private WebElementFacade Company_Tab;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div/button/span")
	private WebElementFacade Company_Button;

	@FindBy(xpath = "//*[@id=\"Name\"]")
	private WebElementFacade Company_Name;

	@FindBy(xpath = "//*[@id=\"s2id_ddlCrmCompanySource\"]/a")
	private WebElementFacade Select_Source_From_DDL;

	@FindBy(xpath = "//div[@id='select2-result-label-27']/option[2]")
	private WebElementFacade Select_Source_From_DDL_Value;

	@FindBy(xpath = "//*[@id=\"PrimaryEmail\"]")
	private WebElementFacade Primary_email;

	@FindBy(xpath = "//*[@id=\"PrimaryPhone\"]")
	private WebElementFacade Primary_Phone;

	@FindBy(xpath = "//*[@id=\"form0\"]/div[2]/button[2]/span")
	private WebElementFacade Save_Button_Add_Company;

	@FindBy(xpath = "//span[@class='title'][contains(text(),'Contact')]")
	private WebElementFacade Contact_Tab_Left_Pannel;

	@FindBy(xpath = "//span[contains(text(),'Add Contact')]")
	private WebElementFacade Add_Contact_Button_Inside_Contact;

	@FindBy(xpath = "//*[@id=\"Title\"]")
	private WebElementFacade Title_Of_Add_Contact;

	@FindBy(xpath = "(//*[@id=\"FirstName\"])[2]")
	private WebElementFacade FirstName_Of_Add_Contact;

	@FindBy(xpath = "(//*[@id=\"LastName\"])[2]")
	private WebElementFacade LastName_Of_Add_Contact;

	@FindBy(xpath = "//*[@id=\"form0\"]/div[1]/div[2]/div[3]/div/div/div/button/span[1]")
	private WebElementFacade SelectSource_Of_Add_Contact;

	@FindBy(xpath = "//*[@id=\"form0\"]/div[1]/div[2]/div[3]/div/div/div/div/ul/li[4]/a/span[1]")
	private WebElementFacade SelectSource_Value_Of_Add_Contact;

	@FindBy(linkText = "Database")
	private WebElementFacade database_tab;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div/button[1]")
	private WebElementFacade addDatabase;

	@FindBy(xpath = "(//*[@id=\"CompanyName\"])[2]")
	private WebElementFacade companyName_onDatabase;

	@FindBy(xpath = "(//*[@id=\"Source\"])[2]")
	private WebElementFacade sourceSys;

	@FindBy(xpath = "(//*[@id=\"Service\"])[2]")
	private WebElementFacade serviceSys;

	@FindBy(xpath = "//span[contains(text(),'Add Opportunity')]")
	private WebElementFacade AddOppBtn;

	@FindBy(xpath = "//a[contains(text(),'New Account')]")
	private WebElementFacade NewBtnAcc;

	@FindBy(xpath = "//input[@id='crmCompanyLeadHead']")
	private WebElementFacade company;

	@FindBy(xpath = "//*[@id=\"tab12\"]/div/div[2]/div/span/pre")
	private WebElementFacade create_new_company;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	private WebElementFacade oppName;

	@FindBy(xpath = "//input[@id='LeadValue']")
	private WebElementFacade value;

	@FindBy(xpath = "//input[@id='crmContactLeadHead']")
	private WebElementFacade contact;

	@FindBy(xpath = "//*[@id=\"form0\"]/div[1]/div[2]/div[2]/div[3]/div/span/pre")
	private WebElementFacade create_newContact;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/a[1]/span[1]")
	private WebElementFacade dept;

	@FindBy(xpath = "(//div[@role='option'])[3]")
	private WebElementFacade dept1;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[3]/div[1]/div[1]/div[1]/a[1]/span[1]")
	private WebElementFacade call;

	@FindBy(xpath = "(//div[@role='option'])[2]")
	private WebElementFacade call1;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/a[1]/span[1]")
	private WebElementFacade insidesale;

	@FindBy(xpath = "(//div[@role='option'])[3]")
	private WebElementFacade insidesale1;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[7]/div[2]/div[1]/div[1]/a[1]/span[1]")
	private WebElementFacade urgency;

	@FindBy(xpath = "(//div[@role='option'])[2]")
	private WebElementFacade urgency1;

	@FindBy(xpath = "(//input[@name='FlowType'])[1]")
	private WebElementFacade radioResidential;

	@FindBy(xpath = "(//span[@class='ladda-label'])[1]")
	private WebElementFacade save;

	@FindBy(xpath = "(//input[contains(@type,'text')])[18]")
	private WebElementFacade FirstName_ContactCustomer;

	@FindBy(xpath = "(//input[contains(@type,'text')])[21]")
	private WebElementFacade PEmail_ContactCustomer;

	@FindBy(xpath = "//span[@class='filter-option pull-left']")
	private WebElementFacade DDSource_ContactCustomer;

	@FindBy(xpath = "(//a[contains(@class,'opt ')])[2]")
	private WebElementFacade ValueDDSource_ContactCustomer;

	@FindBy(xpath = "(//span[@class='ladda-label'])[1]")
	private WebElementFacade Save_ContactCustomer;

	@FindBy(xpath = "//span[contains(.,'Nothing selected')]")
	private WebElementFacade DDSource_OpportunityCustomer;

	@FindBy(xpath = "(//span[contains(.,'CustomerPortal App')])[2]")
	private WebElementFacade ValueDDSource_OpportunityCustomer;

	@Override
	public WebElementFacade getUniqueElement() {
		return null;
	}

	public void lead_tab() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(lead_tab));
		lead_tab.click();

	}

	public void addLead_btn() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(add_lead));

		add_lead.click();

	}

	public void enterContract_details() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(firstName));

		firstName.sendKeys("abhi");
		wait.until(ExpectedConditions.elementToBeClickable(lastName));
		lastName.sendKeys("rathore");
		wait.until(ExpectedConditions.elementToBeClickable(primaryMail));
		primaryMail.sendKeys("manjeetsinghsawali@gmail.com");
	}

	public void enterAddress_details() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(address1));

		address1.sendKeys("190-B vaishali nagar");
		stateDDL.click();
		wait.until(ExpectedConditions.elementToBeClickable(stateValue));
		stateValue.click();
		wait.until(ExpectedConditions.elementToBeClickable(latitute));
		latitute.sendKeys("18.5229545");
		wait.until(ExpectedConditions.elementToBeClickable(logitude));
		logitude.sendKeys("73.9242471");
		wait.until(ExpectedConditions.elementToBeClickable(thirdPartyLocationCode));

		thirdPartyLocationCode.sendKeys("14EMT036)");
	}

	public void lead_type() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(leadType));

		leadType.click();
		wait.until(ExpectedConditions.elementToBeClickable(assignType));

		assignType.click();

	}

	public void enter_note() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(notes));

		notes.sendKeys("notes*********************");

	}

	public void saveBtnOn_lead() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(saveLead));

		saveLead.click();

	}

	public void svContOn_lead() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(saveAndCont));

		saveAndCont.click();

	}

	public void team_ddl() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(teamDDL));

		teamDDL.click();
		wait.until(ExpectedConditions.elementToBeClickable(teamValue));
		teamValue.click();

	}

	public void account_tab() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(accountTab));
		accountTab.click();

	}

	public void addAccount_btn() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(add_account_btn));

		add_account_btn.click();

	}

	public void contact_type() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(contact_type_ddl));

		contact_type_ddl.click();
		wait.until(ExpectedConditions.elementToBeClickable(contact_type_value));

		contact_type_value.click();
	}

	public void account_name() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(account_name));

		account_name.sendKeys("Manjeet Nathawat");

	}

	public void add_company() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(add_company));

		add_company.sendKeys("ACS Pune");
		wait.until(ExpectedConditions.elementToBeClickable(create_new_contact));
		scrollToClickAnelement(create_new_contact);

	}

	public void description() {
		// description.sendKeys("description**************");

	}

	public void company_tab() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Company_Tab));

		Company_Tab.click();
	}

	public void company_Button() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Company_Button));

		Company_Button.click();

	}

	public void company_name() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Company_Name));

		Company_Name.click();
		Company_Name.sendKeys("Ascent Cyber Solutions");

	}

	public void select_source_from_ddl() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Select_Source_From_DDL));

		Select_Source_From_DDL.click();
		waitABit(1000);
		Select_Source_From_DDL.sendKeys(Keys.DOWN);
		waitABit(1000);
		Select_Source_From_DDL.sendKeys(Keys.ENTER);

	}

	public void primary_email() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Primary_email));
		Primary_email.click();
		waitABit(1000);
		Primary_email.sendKeys("rathore@gmail.com");

	}

	public void primary_phone() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Primary_Phone));
		Primary_Phone.click();
		waitABit(1000);
		Primary_Phone.sendKeys("1234567890");

	}

	public void save_button_add_company() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Save_Button_Add_Company));
		
		Save_Button_Add_Company.click();

	}

	public void contact_tab_left_pannel() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Contact_Tab_Left_Pannel));
		Contact_Tab_Left_Pannel.click();

	}

	public void add_contact_button_Indide_Conact() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Add_Contact_Button_Inside_Contact));
		
		Add_Contact_Button_Inside_Contact.click();

	}

	public void title_of_add_contact() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Title_Of_Add_Contact));
		
		Title_Of_Add_Contact.click();
		waitABit(1000);
		Title_Of_Add_Contact.sendKeys("Mr.");

	}

	public void first_name_of_add_contact() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(FirstName_Of_Add_Contact));
		
		FirstName_Of_Add_Contact.click();
		waitABit(1000);
		FirstName_Of_Add_Contact.sendKeys("Jason");
		

	}

	public void last_name_of_add_contact() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(LastName_Of_Add_Contact));
		
		LastName_Of_Add_Contact.click();
		waitABit(1000);
		LastName_Of_Add_Contact.sendKeys("Statham");

	}

	public void selectsource_of_add_contact() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(SelectSource_Of_Add_Contact));
		
		SelectSource_Of_Add_Contact.click();
		waitABit(1000);
		Select_Source_From_DDL_Value.click();

	}

	public void database_tab() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(database_tab));
		database_tab.click();

	}

	public void add_database() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(addDatabase));
		

		addDatabase.click();

	}

	public void source_name() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(companyName_onDatabase));
		
		companyName_onDatabase.sendKeys("ACS");
		waitABit(1000);
		sourceSys.sendKeys("sourceSys....");
	}

	public void service_name() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(serviceSys));
		
		serviceSys.sendKeys("serviceSys.....");

	}

	public void addOppBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(AddOppBtn));
		AddOppBtn.click();
	}

	public void newAccAdd() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(NewBtnAcc));
		
		NewBtnAcc.click();
	}

	public void NameOppValueContact() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(company));
		
		company.sendKeys("New Company");
		wait.until(ExpectedConditions.elementToBeClickable(oppName));
		oppName.sendKeys("New Name");
		wait.until(ExpectedConditions.elementToBeClickable(value));
		value.sendKeys("200");
		wait.until(ExpectedConditions.elementToBeClickable(contact));
		contact.sendKeys("Name Test");

	}

	public void ddlDeptReasonServiceSourceInsideSaleUrgency() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(dept));
		
		dept.click();
		wait.until(ExpectedConditions.elementToBeClickable(dept1));
		dept1.click();
		wait.until(ExpectedConditions.elementToBeClickable(call));
		call.click();
		wait.until(ExpectedConditions.elementToBeClickable(call1));
		call1.click();
		wait.until(ExpectedConditions.elementToBeClickable(DDSource_OpportunityCustomer));
		DDSource_OpportunityCustomer.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDSource_OpportunityCustomer));
		ValueDDSource_OpportunityCustomer.click();
		wait.until(ExpectedConditions.elementToBeClickable(insidesale));
		insidesale.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(insidesale1));
		insidesale1.click();
		wait.until(ExpectedConditions.elementToBeClickable(urgency));

		urgency.click();
		wait.until(ExpectedConditions.elementToBeClickable(urgency1));
		urgency1.click();
	}

	public void residentialRadio() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(radioResidential));
		
		radioResidential.click();
	}

	public void confindence() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(save));
		
		save.click();
	}

	public void savebtn() {

		waitABit(2000);
	}

	public void FirstName_ContactCustomer(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(FirstName_ContactCustomer));
		
		FirstName_ContactCustomer.click();
		waitABit(1500);
		FirstName_ContactCustomer.sendKeys(testData.get("ContName"));
	}

	public void PEmail_ContactCustomer(Map<String, String> testData) {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(PEmail_ContactCustomer));
		
		PEmail_ContactCustomer.click();
		waitABit(1500);
		PEmail_ContactCustomer.sendKeys(testData.get("PEmail"));
	}

	public void Source_ContactCustomer() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(DDSource_ContactCustomer));
		
		DDSource_ContactCustomer.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDSource_ContactCustomer));

		ValueDDSource_ContactCustomer.click();
	}

	public void Save_ContactCustomer() {
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time1"));
		wait.until(ExpectedConditions.elementToBeClickable(Save_ContactCustomer));
		
		Save_ContactCustomer.click();
	}

	public void DDSource_OpportunityCustomer() {

	}

}

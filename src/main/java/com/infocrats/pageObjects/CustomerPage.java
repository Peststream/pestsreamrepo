package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.Keys;

import com.infocrats.utils.BaseUtills;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CustomerPage extends peststreamPage {
	
	BaseUtills utills = new BaseUtills();
	
	@FindBy(xpath = "//span[contains(@class,'title')][contains(text(),'Lead')]")
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
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[4]/ul/li[1]/a")
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
	
	@FindBy(xpath="//*[@id=\"form0\"]/div[1]/div[2]/div[6]/div/div/span/span/div/div/a")
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
	
	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[4]/ul/li[6]")
	private WebElementFacade database_tab;
	
	@FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div/button[1]")
	private WebElementFacade addDatabase;
	
	@FindBy(xpath="(//*[@id=\"CompanyName\"])[2]")
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
	
	
	@FindBy(xpath = "//*[@id=\"select2-result-label-20\"]/text()")
	private WebElementFacade dept1;
	
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[3]/div[1]/div[1]/div[1]/a[1]/span[1]")
	private WebElementFacade call;
	
	
	@FindBy(xpath = "/html[1]/body[1]/div[16]/ul[1]/li[2]/div[1]")
	private WebElementFacade call1;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/a[1]/span[1]")
	private WebElementFacade insidesale;

	
	@FindBy(xpath = "/html[1]/body[1]/div[18]/ul[1]/li[3]/div[1]")
	private WebElementFacade insidesale1;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[7]/div[2]/div[1]/div[1]/a[1]/span[1]")
	private WebElementFacade urgency;
	
	@FindBy(xpath = "/html[1]/body[1]/div[19]/ul[1]/li[3]/div[1]")
	private WebElementFacade urgency1;
	
	@FindBy(xpath = "(//*[@id=\"FlowType\"])[3]")
	private WebElementFacade radioResidential;
	
	@FindBy(xpath = "//*[@id=\"form0\"]/div[2]/button[2]/span")
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
	
	@Override
	public WebElementFacade getUniqueElement() {
		return null;
	}

	public void lead_tab() {
		lead_tab.click();
		waitABit(1000);
		
	}

	public void addLead_btn() {
		add_lead.click();
		waitABit(4000);
		
	}

	public void enterContract_details() {
		firstName.sendKeys("abhi");
		waitABit(2000);
		lastName.sendKeys("rathore");
		waitABit(1000);
		primaryMail.sendKeys("manjeetsinghsawali@gmail.com");
		waitABit(2000);
	}

	public void enterAddress_details() {
		address1.sendKeys("190-B vaishali nagar");
		stateDDL.click();
		waitABit(2000);
		stateValue.click();
		waitABit(2000);
		latitute.sendKeys("18.5229545");
		waitABit(1000);
		logitude.sendKeys("73.9242471");
		waitABit(1000);
		thirdPartyLocationCode.sendKeys("14EMT036)");
	}

	public void lead_type() {
		leadType.click();
		waitABit(1000);
		assignType.click();
		waitABit(1000);
		
	}

	public void enter_note() {
		notes.sendKeys("notes*********************");
		waitABit(1000);
		
	}

	public void saveBtnOn_lead() {
		saveLead.click();
		waitABit(5000);
		
	}

	public void svContOn_lead() {
		saveAndCont.click();
		waitABit(5000);
		
	}

	public void team_ddl() {
		teamDDL.click();
		waitABit(2000);
		teamValue.click();
		waitABit(2000);
		
	}

	public void account_tab() {
		accountTab.click();
		waitABit(1000);
		
	}

	public void addAccount_btn() {
		add_account_btn.click();
		waitABit(2000);
		
	}

	public void contact_type() {
		contact_type_ddl.click();
		waitABit(3000);
		contact_type_value.click();
	}

	public void account_name() {
		account_name.sendKeys("Manjeet Nathawat");
		waitABit(1000);
		
	}

	public void add_company() {
		add_company.sendKeys("ACS Pune");
		waitABit(2000);
		scrollToClickAnelement(create_new_contact);
		
	}

	public void description() {
		//description.sendKeys("description**************");
		
	}

	public void company_tab() {
		Company_Tab.click();
		waitABit(2000);
	}

	public void company_Button() {
		Company_Button.click();
		waitABit(2000);
		
	}

	public void company_name() {
		Company_Name.click();
		waitABit(2000);
		Company_Name.sendKeys("Ascent Cyber Solutions");
		
	}

	public void select_source_from_ddl() {
		Select_Source_From_DDL.click();
		waitABit(2000);
		Select_Source_From_DDL.sendKeys(Keys.DOWN);
		Select_Source_From_DDL.sendKeys(Keys.ENTER);
//		Select_Source_From_DDL_Value.click();
		waitABit(2000);
		
	}

	public void primary_email() {
		Primary_email.click();
		waitABit(2000);
		Primary_email.sendKeys("rathore@gmail.com");
		
	}

	public void primary_phone() {
		Primary_Phone.click();
		waitABit(2000);
		Primary_Phone.sendKeys("1234567890");
		
	}

	public void save_button_add_company() {
		Save_Button_Add_Company.click();
		waitABit(2000);
		
	}

	public void contact_tab_left_pannel() {
		Contact_Tab_Left_Pannel.click();
		waitABit(1000);
		
		
	}

	public void add_contact_button_Indide_Conact() {
		Add_Contact_Button_Inside_Contact.click();
		waitABit(1000);
		
		
	}

	public void title_of_add_contact() {
		Title_Of_Add_Contact.click();
		waitABit(1000);
		Title_Of_Add_Contact.sendKeys("Mr.");
		waitABit(1000);
		
		
	}

	public void first_name_of_add_contact() {
		FirstName_Of_Add_Contact.click();
		waitABit(2000);
		FirstName_Of_Add_Contact.sendKeys("Jason");
		waitABit(1000);
		
	}

	public void last_name_of_add_contact() {
		LastName_Of_Add_Contact.click();
		waitABit(2000);
		LastName_Of_Add_Contact.sendKeys("Statham");
		waitABit(1000);
		
	}

	public void selectsource_of_add_contact() {
		SelectSource_Of_Add_Contact.click();
		waitABit(2000);
		Select_Source_From_DDL_Value.click();
		waitABit(2000);
		
	}

	public void database_tab() {
		database_tab.click();
		waitABit(4000);
		
	}

	public void add_database() {
		addDatabase.click();
		waitABit(2000);
		
	}

	public void source_name() {
		companyName_onDatabase.sendKeys("ACS");
		waitABit(2000);
		sourceSys.sendKeys("sourceSys....");
		waitABit(1000);
	}

	public void service_name() {
		serviceSys.sendKeys("serviceSys.....");
		waitABit(2000);
		
	}

	public void addOppBtn() {
		AddOppBtn.click();	
		waitABit(2000);
	}

	public void newAccAdd() {
		NewBtnAcc.click();
		waitABit(2000);
	}

	public void NameOppValueContact() {
		company.sendKeys("New Company");
		waitABit(2000);
		//create_new_company.click();
		//waitABit(2000);
		oppName.sendKeys("New Name");
		waitABit(2000);
		
		value.sendKeys("200");
		waitABit(2000);
		
		contact.sendKeys("Name Test");
		waitABit(2000);
		 //create_newContact.click();
		 waitABit(2000);
		
	}

	public void ddlDeptReasonServiceSourceInsideSaleUrgency() {
		
			dept.click();
			waitABit(2000);
			dept1.click();
			waitABit(2000);
			call.click();
			waitABit(2000);
		
		 	call1.click();
		 	waitABit(2000);
		 	insidesale.click();
		 	waitABit(2000);
			
			insidesale.click();
			waitABit(2000);
			urgency.click();
			waitABit(2000);
		 	urgency1.click();
		
	}

	public void residentialRadio() {
		radioResidential.click();
		waitABit(2000);
	}

	public void confindence() {
	save.click();
	waitABit(2000);
	}

	public void savebtn() {
		
		waitABit(2000);
	}

	public void FirstName_ContactCustomer(Map<String, String> testData) {
		FirstName_ContactCustomer.click();
		FirstName_ContactCustomer.sendKeys(testData.get("ContName"));
		waitABit(4000);
	}

	public void PEmail_ContactCustomer(Map<String, String> testData) {
		PEmail_ContactCustomer.click();
		PEmail_ContactCustomer.sendKeys(testData.get("PEmail"));
		waitABit(4000);
	}

	public void Source_ContactCustomer() {
		DDSource_ContactCustomer.click();
		waitABit(4000);
		
		ValueDDSource_ContactCustomer.click();
		waitABit(4000);
	}

	public void Save_ContactCustomer() {
		Save_ContactCustomer.click();
		waitABit(2000);	}

}

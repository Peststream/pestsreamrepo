package com.infocrats.steps;

import java.util.Map;

import com.infocrats.pageObjects.CustomerPage;
import com.infocrats.utils.JsonHelper;

import net.thucydides.core.annotations.Step;

public class CustomerSteps extends pestreamSteps {
	
	private Map<String, String> jsonData;
	CustomerPage customerpage;

	@Step
	public void leadTab() {
		customerpage.lead_tab();
		
	}

	@Step
	public void addLeadBtn() {
		customerpage.addLead_btn();
		
	}

	@Step
	public void enterContractDetails() {
		customerpage.enterContract_details();
		
	}

	@Step
	public void enterAddressDetails() {
		customerpage.enterAddress_details();
		
	}

	@Step
	public void leadType() {
		customerpage.lead_type();
		
	}

	@Step
	public void enterNote() {
		customerpage.enter_note();
		
	}

	@Step
	public void saveBtnOnLead() {
		customerpage.saveBtnOn_lead();
		
	}

	@Step
	public void svContOnLead() {
		customerpage.svContOn_lead();
		
	}

	@Step
	public void teamDDL() {
		customerpage.team_ddl();
		
	}

	@Step
	public void accountTab() {

		customerpage.account_tab();
	}

	@Step
	public void addAccountBtn() {

		customerpage.addAccount_btn();
	}

	@Step
	public void contactType() {
		customerpage.contact_type();
		
	}

	@Step
	public void accountName() {
		customerpage.account_name();
		
	}

	@Step
	public void addCompany() {
		customerpage.add_company();
		
	}

	@Step
	public void description() {
		customerpage.description();
		
	}

	@Step
	public void Company_tab() {
		customerpage.company_tab();
		
	}

	@Step
	public void Add_Company_button() {
		customerpage.company_Button();
		
	}

	@Step
	public void Enter_Company_Name() {
		customerpage.company_name();
		
	}

	@Step
	public void Select_Source_from_DDL() {
		customerpage.select_source_from_ddl();
		
	}

	@Step
	public void Enter_Primary_Email() {
		customerpage.primary_email();
		
	}

	@Step
	public void Enter_Primary_Phone() {
		customerpage.primary_phone();
		
	}

	@Step
	public void Save_Button_Of_Add_Company() {
		customerpage.save_button_add_company();
		
	}

	@Step
	public void Contact_Tab_On_Left_Pannel() {
		customerpage.contact_tab_left_pannel();
		
	}

	@Step
	public void Add_Contact_Button_Inside_Contact() {
		customerpage.add_contact_button_Indide_Conact();
		
	}

	@Step
	public void Title_Of_Add_Contact() {
		customerpage.title_of_add_contact();
		
	}

	@Step
	public void First_Name_Of_Add_Contact() {
		customerpage.first_name_of_add_contact();
		
	}

	@Step
	public void Last_Name_Of_Add_Contact() {
		customerpage.last_name_of_add_contact();
		
	}

	@Step
	public void SelectSource_Of_Add_Contact() {
		customerpage.selectsource_of_add_contact();
		
	}

	@Step
	public void databaseTab() {
		customerpage.database_tab();
		
	}

	@Step
	public void addDatabase() {
		customerpage.add_database();
		
	}

	@Step
	public void sourceName() {
		customerpage.source_name();
		
	}

	@Step
	public void serviceName() {
		customerpage.service_name();
		
	}
	public void addOpportunity() {
		customerpage.addOppBtn();
		
	}

	public void newAccount() {
		customerpage.newAccAdd();
		
	}
	
	public void CNameOppNameValue_Contact() {
		customerpage.NameOppValueContact();
	}
	
	
	public void DDLDeptReasonServiceSourceInsideSaleUrgency() {
		customerpage.ddlDeptReasonServiceSourceInsideSaleUrgency();
	}

	public void ResidentialRadio() {
		customerpage.residentialRadio();
	}

	public void confidence() {
		customerpage.confindence();
	}

	public void saveBtn() {
		customerpage.savebtn();
	}

	public void FirstName_ContactCustomer() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "CallData");
		customerpage.FirstName_ContactCustomer(jsonData);
		
	}

	public void PEmail_ContactCustomer() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "CallData");
		customerpage.PEmail_ContactCustomer(jsonData);
		
	}

	public void Source_ContactCustomer() {
		customerpage.Source_ContactCustomer();
		
	}

	public void Save_ContactCustomer() {
		customerpage.Save_ContactCustomer();
		
	}


	

}

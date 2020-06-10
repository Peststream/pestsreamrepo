package com.infocrats.stepdefs;

import com.infocrats.steps.CustomerSteps;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class CustomerStepDefs {
	
	@Steps
	CustomerSteps customersteps;
	
	@Then("^User clicked on lead tab$")
	public void user_clicked_on_lead_tab() {
		customersteps.leadTab();
	}

	@Then("^user clicked on Add Lead Button$")
	public void user_clicked_on_Add_Lead_Button() {
		customersteps.addLeadBtn();
	}

	@Then("^user enter contact Details$")
	public void user_enter_contact_Details() {
		customersteps.enterContractDetails();
		
	}

	@Then("^user enter Address Details$")
	public void user_enter_Address_Details() {
		customersteps.enterAddressDetails();
	}

	@Then("^User select lead type$")
	public void user_select_lead_type() {
		customersteps.leadType();
	}
	
	@Then("^user select team from DDL$")
	public void user_select_team_from_DDL() {
		customersteps.teamDDL();
	}

	@Then("^User enter note$")
	public void user_enter_note() {
		customersteps.enterNote();
	}

	@Then("^User click on save button$")
	public void user_click_on_save_button() {
		customersteps.saveBtnOnLead();
	}

	@Then("^User click on save and continue button$")
	public void user_click_on_save_and_continue_button() {
		customersteps.svContOnLead();
	}
	
	@Then("^User clicked on Account tab$")
	public void user_clicked_on_Account_tab() {
		customersteps.accountTab();
	}

	@Then("^user clicked on Add Account Button$")
	public void user_clicked_on_Add_Account_Button() {
		customersteps.addAccountBtn();
	}

	@Then("^user enter contact type Details$")
	public void user_enter_contact_type_Details() {
		customersteps.contactType();
	}

	@Then("^user enter Account name$")
	public void user_enter_Account_name() {
		customersteps.accountName();
	}

	@Then("^User add a company$")
	public void user_add_a_company() {
		customersteps.addCompany();
	}

	@Then("^User enter description$")
	public void user_enter_description() {
		customersteps.description();
	}
	
//customertabinleftsideofpannel
	

@Then("^User clicked on Company tab$")
public void user_clicked_on_Company_tab() {
	customersteps.Company_tab();
}

@Then("^user clicked on Add Company Button$")
public void user_clicked_on_Add_Company_Button() {
	customersteps.Add_Company_button();
}

@Then("^user enter company name$")
public void user_enter_company_name() {
	customersteps.Enter_Company_Name();
}

@Then("^user select Source from DDL$")
public void user_select_Source_from_DDL() {
	customersteps.Select_Source_from_DDL();
}

@Then("^User enter primary Email$")
public void user_enter_primary_Email() {
	customersteps.Enter_Primary_Email();
}

@Then("^user enter primary phone$")
public void user_enter_primary_phone() {
	customersteps.Enter_Primary_Phone();
}


@Then("^user click on save button of add company$")
public void user_enter_save_button_of_add_company() {
	customersteps.Save_Button_Of_Add_Company();
}

//add contact through customer tab using contact tab in left pannel


@Then("^User clicked on contact tab$")
public void user_clicked_on_contact_tab() {
	customersteps.Contact_Tab_On_Left_Pannel();
}

@Then("^user clicked on Add Contact Button$")
public void user_clicked_on_Add_Contact_Button() {
	customersteps.Add_Contact_Button_Inside_Contact();
}

@Then("^user enter title$")
public void user_enter_title() {
	customersteps.Title_Of_Add_Contact();
}

@Then("^user enter First Name$")
public void user_enter_First_Name() {
	customersteps.First_Name_Of_Add_Contact();
}

@Then("^user enter Last Name$")
public void user_enter_Last_Name() {
	customersteps.Last_Name_Of_Add_Contact();
}


@Then("^user select source of add contact$")
public void user_enter_Select_Source_Add_Contact() {
	customersteps.SelectSource_Of_Add_Contact();
}


@Then("^User clicked on database tab$")
public void user_clicked_on_database_tab() {
	customersteps.databaseTab();
}

@Then("^user clicked on Add database entry Button$")
public void user_clicked_on_Add_database_entry_Button() {
	customersteps.addDatabase();
}

/*@Then("^User enter company name$")
public void user_enter_company_name() {
    // Write code here that turns the phrase above into concrete actions
}*/

@Then("^user enter Source Sys Name$")
public void user_enter_Source_Sys_Name() {
	customersteps.sourceName();
}

@Then("^user enter service Sys Name$")
public void user_enter_service_Sys_Name() {
	customersteps.serviceName();
}
@Then("^User Selects Add Opportunity Button$")
public void user_Selects_Add_Opportunity_Button() {
	customersteps.addOpportunity();
}

@Then("^User Selects New Account$")
public void user_Selects_New_Account() {
	customersteps.newAccount();;
}

@Then("^User sends Company Name Opportunity Name Value And Contact$")
public void user_sends_Company_Name_Opportunity_Name_Value_And_Contact() {
	customersteps.CNameOppNameValue_Contact();
}

@Then("^User Selects Department Primary reason for Call And Service Name Source Inside Sales Person Urgency$")
public void user_Selects_Department_Primary_reason_for_Call_And_Service_Name_Source_Inside_Sales_Person_Urgency() {
	customersteps.DDLDeptReasonServiceSourceInsideSaleUrgency();
}

@Then("^User clicks on Residential Radio$")
public void user_clicks_on_Residential_Radio() {
	customersteps.ResidentialRadio();
}

@Then("^User Selects Confidence$")
public void user_Selects_Confidence() {
	customersteps.confidence();
}

@Then("^User Clicks on Save$")
public void user_Clicks_on_Save() {
	customersteps.saveBtn();
}


@Then("^user click on FirstName_ContactCustomer$")
public void user_click_on_FirstName_ContactCustomer() {
	customersteps.FirstName_ContactCustomer();
}

@Then("^user click on PEmail_ContactCustomer$")
public void user_click_on_PEmail_ContactCustomer() {
	customersteps.PEmail_ContactCustomer();
}

@Then("^user click on Source_ContactCustomer$")
public void user_click_on_Source_ContactCustomer() {
	customersteps.Source_ContactCustomer();
}


@Then("^user click on Save_ContactCustomer$")
public void user_click_on_Save_ContactCustomer() {
	customersteps.Save_ContactCustomer();
}



}

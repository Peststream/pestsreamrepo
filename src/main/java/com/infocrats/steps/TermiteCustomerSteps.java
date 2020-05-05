package com.infocrats.steps;

import java.util.Map;

import com.infocrats.pageObjects.TermiteCustomerPage;
import com.infocrats.utils.JsonHelper;

import net.thucydides.core.annotations.Steps;

public class TermiteCustomerSteps extends pestreamSteps {

	private Map<String, String> jsonData;

	@Steps
	TermiteCustomerPage termitecustomerpage;

	public void clickOn_CustomerTermite() {
		termitecustomerpage.clickOn_CustomerTermite();

	}

	public void clickOn_Account_Cust() {
		termitecustomerpage.clickOn_Account_Cust();
		
	}

	public void clickOn_AddAccount_AccCust() {
		termitecustomerpage.clickOn_AddAccount_AccCust();
		
	}

	public void clickOn_DDContactType_AccCust() {
		termitecustomerpage.clickOn_DDContactType_AccCust();
		
	}

	public void clickOn_AccountName_AccCust() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Account_Customer");
		termitecustomerpage.clickOn_AccountName_AccCust(jsonData);
		
	}

	public void clickOn_DDSource_AccCust() {
		termitecustomerpage.clickOn_DDSource_AccCust();
		
	}

	public void clickOn_Save_AccCust() {
		termitecustomerpage.clickOn_Save_AccCust();
		
	}

	public void clickOn_AddComp_Cust() {
		termitecustomerpage.clickOn_AddComp_Cust();
		
	}

	public void clickOn_Name_CompCust() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Company_Customer");
		termitecustomerpage.clickOn_Name_CompCust(jsonData);
		
	}

	public void clickOn_DDSource_CompCust() {
		termitecustomerpage.clickOn_DDSource_CompCust();
		
	}

	public void clickOn_PEmail_CompCust() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Company_Customer");
		termitecustomerpage.clickOn_PEmail_CompCust(jsonData);
		
	}

	public void clickOn_PPhone_CompCust() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Company_Customer");
		termitecustomerpage.clickOn_PPhone_CompCust(jsonData);
		
	}

	public void clickOn_Save_CompCust() {
		termitecustomerpage.clickOn_Save_CompCust();
		
	}

	public void clickOn_CompCust() {
		termitecustomerpage.clickOn_CompCust();
		
	}

	public void clickOn_ContCustTermite() {
		termitecustomerpage.clickOn_ContCustTermite();
		
	}

	public void clickOn_AddCont_ContCustTermite() {
		termitecustomerpage.clickOn_AddCont_ContCustTermite();
		
	}

	public void clickOn_FName_ContCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Contact_Customer");
		termitecustomerpage.clickOn_FName_ContCustTermite(jsonData);
		
	}

	public void clickOn_LName_ContCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Contact_Customer");
		termitecustomerpage.clickOn_LName_ContCustTermite(jsonData);
		
	}

	public void clickOn_PEmail_ContCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Contact_Customer");
		termitecustomerpage.clickOn_PEmail_ContCustTermite(jsonData);
		
	}

	public void clickOn_Save_ContCustTermite() {
		termitecustomerpage.clickOn_Save_ContCustTermite();
		
	}

	public void clickOn_Opp_CustTermite() {
		termitecustomerpage.clickOn_Opp_CustTermite();
		
	}

	public void clickOn_AddOpp_CustTermite() {
		termitecustomerpage.clickOn_AddOpp_CustTermite();
		
	}

	public void clickOn_CompanyName_OppCust() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Opportunity_Customer");
		termitecustomerpage.clickOn_CompanyName_OppCust(jsonData);
		
	}

	public void clickOn_OppName_OppCust() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Opportunity_Customer");
		termitecustomerpage.clickOn_OppName_OppCust(jsonData);
		
	}

	public void clickOn_FName_OppCust() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Opportunity_Customer");
		termitecustomerpage.clickOn_FName_OppCust(jsonData);
		
	}

	public void clickOn_DDBranch_OppCust() {
		termitecustomerpage.clickOn_DDBranch_OppCust();
		
	}

	public void clickOn_DDDepartment_OppCust() {
		termitecustomerpage.clickOn_DDDepartment_OppCust();
		
	}

	public void clickOn_DDSource_OppCust() {
		termitecustomerpage.clickOn_DDSource_OppCust();
		
	}

	public void clickOn_ResiOpptype_OppCust() {
		termitecustomerpage.clickOn_ResiOpptype_OppCust();
		
	}

	public void clickOn_Save_OppCust() {
		termitecustomerpage.clickOn_Save_OppCust();
		
	}

	
	
	
	public void clickOn_Lead_CustTermite() {
		termitecustomerpage.clickOn_Lead_CustTermite();
		
	}
	
	public void clickOn_AddLead_CustTermite() {
		termitecustomerpage.clickOn_AddLead_CustTermite();
		
	}
	
	public void clickOn_FName_LeadCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Lead_Customer");
		termitecustomerpage.clickOn_FName_LeadCustTermite(jsonData);
		
	}
	
	public void clickOn_PEmail_LeadCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Lead_Customer");
		termitecustomerpage.clickOn_PEmail_LeadCustTermite(jsonData);
		
	}
	
	public void clickOn_Address_LeadCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Lead_Customer");
		termitecustomerpage.clickOn_Address_LeadCustTermite(jsonData);
		
	}

	public void clickOn_DDState_LeadCustTermite() {
		termitecustomerpage.clickOn_DDState_LeadCustTermite();
		
	}

	
	public void clickOn_DDSource_LeadCustTermite() {
		termitecustomerpage.clickOn_DDSource_LeadCustTermite();
		
	}
	
	public void clickOn_ResiLeadType_LeadCustTermite() {
		termitecustomerpage.clickOn_ResiLeadType_LeadCustTermite();
		
	}

	public void clickOn_SelectAssignType_LeadCustTermite() {
		termitecustomerpage.clickOn_SelectAssignType_LeadCustTermite();
		
	}

	public void clickOn_Save_LeadCustTermite() {
		termitecustomerpage.clickOn_Save_LeadCustTermite();
		
	}

	public void clickOn_NewAccount_OppCustTermite() {
		termitecustomerpage.clickOn_NewAccount_OppCustTermite();
		
	}

	public void clickOn_DB_CustTermite() {
		termitecustomerpage.clickOn_DB_CustTermite();
		
	}

	public void clickOn_AddDB_CustTermite() {
		termitecustomerpage.clickOn_AddDB_CustTermite();
		
	}

	public void clickOn_FName_DBCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "DB_Customer");
		termitecustomerpage.clickOn_FName_DBCustTermite(jsonData);
		
	}

	public void clickOn_LName_DBCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "DB_Customer");
		termitecustomerpage.clickOn_LName_DBCustTermite(jsonData);
		
	}

	public void clickOn_SourceSysName_DBCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "DB_Customer");
		termitecustomerpage.clickOn_SourceSysName_DBCustTermite(jsonData);
		
	}

	public void clickOn_Save_DBCustTermite() {
		termitecustomerpage.clickOn_Save_DBCustTermite();
		
	}

	public void clickOn_AdvanceSearch_AccCustTermite() {
		termitecustomerpage.clickOn_AdvanceSearch_AccCustTermite();
		
	}

	public void clickOn_AddOppAction_AdSearchAccCustTermite() {
		termitecustomerpage.clickOn_AddOppAction_AdSearchAccCustTermite();
		
	}

	public void OppName_AdSearchAccCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "AddOppAdvanceSearch_AccCustTermite");
		termitecustomerpage.OppName_AdSearchAccCustTermite(jsonData);
		
	}

	public void clickOn_LastName_AdSearchAccCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "AddOppAdvanceSearch_AccCustTermite");
		termitecustomerpage.clickOn_LastName_AdSearchAccCustTermite(jsonData);
		
	}

	public void clickOn_DDBranch_AdSearchAccCustTermite() {
		termitecustomerpage.clickOn_DDBranch_AdSearchAccCustTermite();
		
	}

	public void clickOn_DDDept_AdSearchAccCustTermite() {
		termitecustomerpage.clickOn_DDDept_AdSearchAccCustTermite();
		
	}

	public void clickOn_DDSource_AdSearchAccCustTermite() {
		termitecustomerpage.clickOn_DDSource_AdSearchAccCustTermite();
	}

	public void clickOn_ResiOppType_AdSearchAccCustTermite() {
		termitecustomerpage.clickOn_ResiOppType_AdSearchAccCustTermite();
	}

	public void clickOn_Save_AdSearchAccCustTermite() {
		termitecustomerpage.clickOn_Save_AdSearchAccCustTermite();
	}

	public void clickOn_AddPhone_CallAdSearchAccCustTermite() {
		termitecustomerpage.clickOn_AddPhone_CallAdSearchAccCustTermite();
	}

	public void clickOn_Contact_CallAdSearchAccCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "AddCallAdvanceSearch_AccCustTermite");
		termitecustomerpage.clickOn_Contact_CallAdSearchAccCustTermite(jsonData);
	}

	public void clickOn_DDSource_CallAdSearchAccCustTermite() {
		termitecustomerpage.clickOn_DDSource_CallAdSearchAccCustTermite();
	}

	public void clickOn_AccAlert_CallAdSearchAccCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "AddCallAdvanceSearch_AccCustTermite");
		termitecustomerpage.clickOn_AccAlert_CallAdSearchAccCustTermite(jsonData);
	}

	public void clickOn_ResiOppType_CallAdSearchAccCustTermite() {
		termitecustomerpage.clickOn_ResiOppType_CallAdSearchAccCustTermite();
	}

	public void clickOn_Continue_CallAdSearchAccCustTermite() {
		termitecustomerpage.clickOn_Continue_CallAdSearchAccCustTermite();
	}

	public void clickOn_Delete_AdSearchAccCustTermitee() {
		termitecustomerpage.clickOn_Delete_AdSearchAccCustTermitee();
	}

	public void clickOn_Yes_DeleteAdSearchAccCustTermite() {
		termitecustomerpage.clickOn_Yes_DeleteAdSearchAccCustTermite();
	}

	public void clickOn_AdvanceSearch_CompCustTermite() {
		termitecustomerpage.clickOn_AdvanceSearch_CompCustTermite();
	}

	public void clickOn_AddOppAction_CallAdSearchCompCustTermite() {
		termitecustomerpage.clickOn_AddOppAction_CallAdSearchCompCustTermite();
	}

	public void clickOn_DDAcc_OppAdSearchAccCustTermite() {
		termitecustomerpage.clickOn_DDAcc_OppAdSearchAccCustTermite();
	}

	public void clickOn_Continue_OppAdSearchAccCustTermite() {
		termitecustomerpage.clickOn_Continue_OppAdSearchAccCustTermite();
	}

	public void clickOn_OppName_OppAdSearchAccCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "AddOppAdvanceSearch_CompCustTermite");
		termitecustomerpage.clickOn_OppName_OppAdSearchAccCustTermite(jsonData);
	}

	public void clickOn_DDBranch_OppAdSearchAccCustTermite() {
		termitecustomerpage.clickOn_DDBranch_OppAdSearchAccCustTermite();
	}

	public void clickOn_DDDept_OppAdSearchAccCustTermite() {
		termitecustomerpage.clickOn_DDDept_OppAdSearchAccCustTermite();
	}

	public void clickOn_DDSource_OppAdSearchAccCustTermite() {
		termitecustomerpage.clickOn_DDSource_OppAdSearchAccCustTermite();
	}

	public void clickOn_ResiOppType_OppAdSearchAccCustTermite() {
		termitecustomerpage.clickOn_ResiOppType_OppAdSearchAccCustTermite();
	}

	public void clickOn_Save_OppAdSearchAccCustTermite() {
		termitecustomerpage.clickOn_Save_OppAdSearchAccCustTermite();
	}

	public void clickOn_DeleteAction_AdSearchCompCustTermite() {
		termitecustomerpage.clickOn_DeleteAction_AdSearchCompCustTermite();
	}

	public void clickOn_Yes_DeleteAdSearchCompCustTermite() {
		termitecustomerpage.clickOn_Yes_DeleteAdSearchCompCustTermite();
	}

	public void clickOn_AdvanceSearch_ContCustTermite() {
		termitecustomerpage.clickOn_AdvanceSearch_ContCustTermite();
	}

	public void clickOn_AddOppAction_AdvanceSearchContCustTermite() {
		termitecustomerpage.clickOn_AddOppAction_AdvanceSearchContCustTermite();
	}

	public void clickOn_DDAccount_AddOppAdvanceSearchContCustTermite() {
		termitecustomerpage.clickOn_DDAccount_AddOppAdvanceSearchContCustTermite();
	}

	public void clickOn_Cont_AddOppAdvanceSearchContCustTermite() {
		termitecustomerpage.clickOn_Cont_AddOppAdvanceSearchContCustTermite();
	}

	public void clickOn_OppName_AddOppAdvanceSearchContCustTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "AddOppAdvanceSearch_ContCustTermite");
		termitecustomerpage.clickOn_OppName_AddOppAdvanceSearchContCustTermite(jsonData);
	}

	public void clickOn_DDBranch_AddOppAdvanceSearchContCustTermite() {
		termitecustomerpage.clickOn_DDBranch_AddOppAdvanceSearchContCustTermite();
	}

	public void clickOn_DDDept_AddOppAdvanceSearchContCustTermite() {
		termitecustomerpage.clickOn_DDDept_AddOppAdvanceSearchContCustTermite();
	}

	public void clickOn_DDSource_AddOppAdvanceSearchContCustTermite() {
		termitecustomerpage.clickOn_DDSource_AddOppAdvanceSearchContCustTermite();
	}

	public void clickOn_ResiOppType_AddOppAdvanceSearchContCustTermite() {
		termitecustomerpage.clickOn_ResiOppType_AddOppAdvanceSearchContCustTermite();
	}

	public void clickOn_Save_AddOppAdvanceSearchContCustTermite() {
		termitecustomerpage.clickOn_Save_AddOppAdvanceSearchContCustTermite();
	}

	public void clickOn_DeleteAction_AdSearchContCustTermite() {
		termitecustomerpage.clickOn_DeleteAction_AdSearchContCustTermite();
	}

	public void clickOn_Yes_DeleteAdSearchContCustTermite() {
		termitecustomerpage.clickOn_Yes_DeleteAdSearchContCustTermite();
	}

	

	

	

	
	

	

}

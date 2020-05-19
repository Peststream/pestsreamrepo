@termitecust
Feature: Test Cases for Termite CSRDAshBoard
  I want to use this template for my feature file

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  @AccCustTermite
  Scenario: Test to AddAccount CSRDashboard Termite
    When user click on 	Customer_Termite
    Then user click on Account_Cust
    Then user click on AddAccount_AccCust
    Then user click on DDContactType_AccCust
    Then user click on AccountName_AccCust
    Then user click on DDSource_AccCust
    Then user click on Save_AccCust

  @CompCustTermite
  Scenario: Test to AddCompany CSRDashboard Termite
    When user click on 	Customer_Termite
    Then user click on Comp_Cust
    Then user click on AddComp_Cust
    Then user click on Name_CompCust
    Then user click on DDSource_CompCust
    Then user click on PEmail_CompCust
    Then user click on PPhone_CompCust
    Then user click on Save_CompCust

  @ContCustTermite
  Scenario: Test to AddContact CSRDashboard Termite
    When user click on 	Customer_Termite
    Then user click on ContCustTermite
    Then user click on AddCont_ContCustTermite
    Then user click on FName_ContCustTermite
    Then user click on LName_ContCustTermite
    Then user click on PEmail_ContCustTermite
    Then user click on Save_ContCustTermite

  @OppCustTermite
  Scenario: Test to AddOpportunity CSRDashboard Termite
    When user click on 	Customer_Termite
    Then user click on Opp_CustTermite
    Then user click on AddOpp_CustTermite
    Then user click on NewAccount_OppCustTermite
    Then user click on CompanyName_OppCust
    Then user click on OppName_OppCust
    Then user click on FName_OppCust
    Then user click on DDBranch_OppCust
    Then user click on DDDepartment_OppCust
    Then user click on DDSource_OppCust
    Then user click on ResiOpptype_OppCust
    Then user click on Save_OppCust

  @LeadCustTermite
  Scenario: Test to AddCall CSRDashboard Termite
    When user click on 	Customer_Termite
    Then user click on Lead_CustTermite
    Then user click on AddLead_CustTermite
    Then user click on FName_LeadCustTermite
    Then user click on PEmail_LeadCustTermite
    Then user click on Address1_LeadCustTermite
    Then user click on DDState_LeadCustTermite
    Then user click on DDSource_LeadCustTermite
    Then user click on ResiLeadType_LeadCustTermite
    Then user click on SelectAssignType_LeadCustTermite
    Then user click on Save_LeadCustTermite

  @DBCustTermite
  Scenario: Test to AddDatabase CSRDashboard Termite
    When user click on 	Customer_Termite
    Then user click on DB_CustTermite
    Then user click on AddDB_CustTermite
    Then user click on FName_DBCustTermite
    Then user click on LName_DBCustTermite
    Then user click on SourceSysName_DBCustTermite
    Then user click on Save_DBCustTermite

  @AddOpportunityAdvanceSearchAccCustTermite
  Scenario: Test to Search  inside Account Customer
    When user click on 	Customer_Termite
    Then user click on Account_Cust
    Then user click on AdvanceSearch_AccCustTermite
    Then user click on AddOppAction_AdSearchAccCustTermite
    Then user click on OppName_AdSearchAccCustTermite
    Then user click on LastName_AdSearchAccCustTermite
    Then user click on DDBranch_AdSearchAccCustTermite
    Then user click on DDDept_AdSearchAccCustTermite
    Then user click on DDSource_AdSearchAccCustTermite
    Then user click on ResiOppType_AdSearchAccCustTermite
    Then user click on Save_AdSearchAccCustTermite

  @AddCallAdvanceSearchAccCustTermite
  Scenario: Test to Search  inside Account Customer
    When user click on 	Customer_Termite
    Then user click on Account_Cust
    Then user click on AdvanceSearch_AccCustTermite
    Then user click on AddPhone_CallAdSearchAccCustTermite
    Then user click on Contact_CallAdSearchAccCustTermite
    Then user click on DDSource_CallAdSearchAccCustTermite
    Then user click on AccAlert_CallAdSearchAccCustTermite
    Then user click on ResiOppType_CallAdSearchAccCustTermite
    Then user click on Continue_CallAdSearchAccCustTermite

  @DeleteAdvanceSearchAccCustTermite
  Scenario: Test to Search inside Account Customer
    When user click on 	Customer_Termite
    Then user click on Account_Cust
    Then user click on AdvanceSearch_AccCustTermite
    Then user click on Delete_AdSearchAccCustTermite
    Then user click on Yes_DeleteAdSearchAccCustTermite

  @AddOppAdvanceSearchCompCustTermite
  Scenario: Test to Search inside Account Customer
    When user click on 	Customer_Termite
    Then user click on Comp_Cust
    Then user click on AdvanceSearch_CompCustTermite
    Then user click on AddOppAction_CallAdSearchCompCustTermite
    Then user click on DDAcc_OppAdSearchAccCustTermite
    Then user click on Continue_OppAdSearchAccCustTermite
    Then user click on OppName_OppAdSearchAccCustTermite
    Then user click on DDBranch_OppAdSearchAccCustTermite
    Then user click on DDDept_OppAdSearchAccCustTermite
    Then user click on DDSource_OppAdSearchAccCustTermite
    Then user click on ResiOppType_OppAdSearchAccCustTermite
    Then user click on Save_OppAdSearchAccCustTermite

  @DeleteAdvanceSearchCompCustTermite
  Scenario: Test to Search inside Account Customer
    When user click on 	Customer_Termite
    Then user click on Comp_Cust
    Then user click on AdvanceSearch_CompCustTermite
    Then user click on DeleteAction_AdSearchCompCustTermite
    Then user click on Yes_DeleteAdSearchCompCustTermite

  @AddOppAdvanceSearchContCustTermite
  Scenario: Test to Search AddOpportunity ContactTermite
    When user click on 	Customer_Termite
    Then user click on ContCustTermite
    Then user click on AdvanceSearch_ContCustTermite
    Then user click on AddOppAction_AdvanceSearchContCustTermite
    Then user click on DDAccount_AddOppAdvanceSearchContCustTermite
    Then user click on Cont_AddOppAdvanceSearchContCustTermite
    Then user click on OppName_AddOppAdvanceSearchContCustTermite
    Then user click on DDBranch_AddOppAdvanceSearchContCustTermite
    Then user click on DDDept_AddOppAdvanceSearchContCustTermite
    Then user click on DDSource_AddOppAdvanceSearchContCustTermite
    Then user click on ResiOppType_AddOppAdvanceSearchContCustTermite
    Then user click on Save_AddOppAdvanceSearchContCustTermite

  @DeleteAdvanceSearchContCustTermite
  Scenario: Test to Search DeleteOpportunity ContactTermite
    When user click on 	Customer_Termite
    Then user click on ContCustTermite
    Then user click on AdvanceSearch_ContCustTermite
    Then user click on DeleteAction_AdSearchContCustTermite
    Then user click on Yes_DeleteAdSearchContCustTermite

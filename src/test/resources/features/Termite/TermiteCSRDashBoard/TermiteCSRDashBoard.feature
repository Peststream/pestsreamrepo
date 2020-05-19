@termitecsr
Feature: Test Cases for Termite CSRDAshBoard
  I want to use this template for my feature file

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  @AddCallAction_CSRDashboard
  Scenario: Test to AddCallAction CSRDashboard Termite
    When user click on 	CSRDashboard
    Then user click on AdvanceSearch_CSRDashboard
    Then user click on AddAction_CSRDashboard
    Then user click on DDSourceAddCAll_CSRDashboard
    Then user click on DDTargetAddCall_CSRDashboard
    Then user click on SaveAddCall_CSRDashboard

  @AddNoteAction_CSRDashboard
  Scenario: Test to AddNoteAction CSRDashboard Termite
    When user click on 	CSRDashboard
    Then user click on AdvanceSearch_CSRDashboard
    Then user click on AddNote
    Then user click on ExpirationDate_AddNote
    Then user click on EnterNote_AddNote
    Then user click on Save_AddNote

  @CreateWorkorder_CSRDashboard(f)
  Scenario: Test to CreateWorkorderAction CSRDashboard Termite
    When user click on 	CSRDashboard
    Then user click on AdvanceSearch_CSRDashboard
    Then user click on CreateWorkorder
    Then user click on DDServiceCategory_CreateWorkorder
    Then user click on Services_CreateWorkorder
    Then user click on AddBtn_CreateWorkorder
    Then user click on DDOrderType_CreateWorkorder
    Then user click on KeepSameServiceAdd_CreateWorkorder
    Then user click on ServiceDate_CreateWorkorder
    Then user click on Save_CreateWorkorder
    Then user click on YesCreateOpportunity_CreateWorkorder

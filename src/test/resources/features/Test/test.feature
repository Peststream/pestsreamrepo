@testt
Feature: Create pest control residential opportunity for exiting user.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  @WOST
  Scenario: Testing of WorkOrder from CSR dashBoard
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User Clicks on WorkOrder Button
    Then user click on DDServiceCategoryWO
    Then user click on DDServicesWO
    Then User add the Service
    Then user click on billingAddSame_WOCSRDashboard
    Then user click on AddLine1_WOCSRDashboard
    Then user click on zip_WOCSRDashboard
    Then User Selects the Service date
    Then user click on save_WOCSRDashboard

  #Done
  @WORT
  Scenario: Testing of WorkOrder and add Service from CSR dashBoard
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User Clicks on WorkOrder Button
    Then user click on DDServiceCategoryWO
    Then user click on DDServicesWO
    Then User add the Service
    Then user click on billingAddSame_WOCSRDashboard
    Then user click on AddLine1_WOCSRDashboard
    Then user click on zip_WOCSRDashboard
    Then User Selects the Service date
    Then User clicks on the RangeTime
    Then user click on save_WOCSRDashboard

  #Done
  @WOLeadTech
  Scenario: Testing of WorkOrder withLead from CSR dashBoard
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User Clicks on WorkOrder Button
    Then user click on DDServiceCategoryWO
    Then user click on DDServicesWO
    Then User add the Service
    Then user click on billingAddSame_WOCSRDashboard
    Then user click on AddLine1_WOCSRDashboard
    Then user click on zip_WOCSRDashboard
    Then User Selects the Service date
    Then User clicks on the DDleadTech
    Then user click on save_WOCSRDashboard

  #Done
  @ViewDetailForNewComOpportunity
  Scenario: Testing of ViewDetails from CSR dashBoard for new CommercialOpportunity
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User Clicks on the View Details from action tab
    Then User clicks on add opportunity
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch info
    Then Check lead button
    And enters Account_Alert and enterProblemDiscription
    Then I click on commercial Radio button
    And click on continue button for commercial opportunity

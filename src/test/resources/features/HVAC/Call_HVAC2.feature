@run @hvac
Feature: Test for call Hvac 2

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  #pass
  
  @TestOpportunityInfoForHVAC17
  Scenario: Test Customer DropDown For Company17
    When User Click On Customer
    And Select Customer From The DD List
    And click on Advance Search from Add Company
    And Click On Add Opportunity Icon From Action Company
    And Select Account From DD
    And Click on Continue From Add Opportunity

  #pass
  @TestOpportunityInfoForHVA02
  Scenario: Test opportunity info (general info) for HVAC2
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch Information
    And select source Information
    And enters Account_Alert and enterProblemDiscription
    And click on continue button for commercial opportunity
    And select primary requested service
    And check flat rate
    And Enter Job Description
    And enters service address "Address Line1", "Zip","Contact", "City"
    And click on Save button from general info

  #pass
  @TestOpportunityInfoForHVA3
  Scenario: Test opportunity info (general info) for HVAC3
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch Information
    And select source Information
    And enters Account_Alert and enterProblemDiscription
    And click on continue button for commercial opportunity
    And select primary requested service
    And check flat rate
    And Enter Job Description
    And enters service address "Address Line1", "Zip","Contact", "City"
    And click on Save button from general info
    And click on Advance Search from Work Order
    And Select and click on one Work Order Number
    And Select lead employee from DD
    And Click on save from Work Order

  #pass
  @TestOpportunityInfoForHVA4
  Scenario: Test opportunity info (general info) for HVAC4
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch Information
    And select source Information
    And enters Account_Alert and enterProblemDiscription
    And click on continue button for commercial opportunity
    And select primary requested service
    And check flat rate
    And Enter Job Description
    And enters service address "Address Line1", "Zip","Contact", "City"
    And click on Save button from general info
    And click on Advance Search from Work Order
    And Select and click on one Work Order Number
    And Select lead employee from DD
    And Click on save from Work Order
    And Click on Advance Search Button
    And Click On First Work Order Number From Work Order
    And Select Order Type From DD
    And Click on save from Work Order

  #pass
  @TestOpportunityInfoForHVA5
  Scenario: Test CSR Dashboard for HVAC5
    When user click on CSR Dashboard
    When user click on Advance Search from CSR Dashboard
    And Select Create Workorder From Action for the first Account
    And Select Service Category & Services
    And Click On Add Button
    And Enter Service Date
    And Click on save from Work Order

  #Pass
  @TestOpportunityInfoForHVAC
  Scenario: Test Customer DropDown For Contact22
    When User Click On Customer
    And Select Contact From The DD List
    And click on Add Contact
    And Enter Test Data To Add Contact
    And Click on Close	From Add Account

  #PassButOnlyOneTimeAddopportunityIsPossible
  @TestOpportunityInfoForHVAC23
  Scenario: Test Customer DropDown For Contact23
    When User Click On Customer
    And Select Contact From The DD List
    And Click on Advance Search Button
    And Click On Add Opportunity For Contact
  
  #Pass
  @TestOpportunityInfoForHVAC
  Scenario: Test Customer DropDown For Contact24
    When User Click On Customer
    And Select Contact From The DD List
    And Click on Advance Search Button
    And Click On View For Contact From Action
    And Enter Note
    And Click On Save Button

  #pass
  @TestOpportunityInfoForHVAC
  Scenario: Test Customer DropDown For Contact25
    When User Click On Customer
    And Select Contact From The DD List
    And Click on Advance Search Button
    And Click On Delete For Contact From Action
    And Confirm Delete Alert For Contact

  #Pass
  @TestOpportunityInfoForHVAC
  Scenario: Test Customer DropDown For Contact26
    When User Click On Customer
    And Select Contact From The DD List
    And Click on Advance Search Button
    And Click On Delete For Contact From Action
    And Decline Delete Alert For Contact

  #Pass
  @TestOpportunityInfoForHVAC
  Scenario: Test Customer DropDown For Opportunity27
    When User Click On Customer
    And Select Opportunity From The DD List
    And Click on Add Opportunity Button
    And Click On New Account From Add Opportunity
    And Select or Enter General Test Data For Add Opportunity
    And Click on Save	From Add Opportunity

  #Pass
  @TestOpportunityInfoForHVAC
  Scenario: Test Customer DropDown For Lead28
    When User Click On Customer
    And Select Lead From The DD List
    And Click on Add Lead Button
    And Select Or Enter General Test Info For Lead
    And Click on Save	From Add Lead

  #Pass
  @TestOpportunityInfoForHVAC
  Scenario: Test Customer DropDown For Database29
    When User Click On Customer
    And Select Database From The DD List
    And Click on Add Database Entry Button
    And Select Or Enter General Test Info For Database
    And Click on Save	From Add Database Ezoom



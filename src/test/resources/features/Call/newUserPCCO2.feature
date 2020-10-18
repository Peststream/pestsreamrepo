@pcco @run
Feature: Test for new user PCCO2 for Pest.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system
    
      #Done
  @diffBillingAddressCom @newUserPCCO
  Scenario: Test opportunity info Using Different Address
   When user click on CsrDashboard
   Then user click on AdvanceSearch
   Then user click on CreateNew
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
   Then user click on DDSource
    And enters Account_Alert and enterProblemDiscription
    Then I click on commercial Radio button
    And click on continue button for commercial opportunity
    Then enter service address
    Then check the Billing Address Different
    And click on DifferentAddress Line first
    And click on Different Address Line Second
    And click on Different Zip
    And click on Different City
    And click on save Button
    
     #Done
  @nuComFRTCompSendMail @newUserPCCO
  Scenario: Test opportunity and Send Email
   When user click on CsrDashboard
   Then user click on AdvanceSearch
   Then user click on CreateNew
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
   Then user click on DDSource
    And enters Account_Alert and enterProblemDiscription
    Then I click on commercial Radio button
    And click on continue button for commercial opportunity
    Then enter service address
    Then Select first time range & Second time range
    Then click on assign to DDL
    And choose assign to person
    And click on save Button
    Then click on opportunity action icon
    Then review all the details and click on save and continue button
    Then click on continue button on inspection tab
    Then user click on DDCategory_SelectService_SalesApp
    Then click on saveBttnCom
    Then click on save and continue on select service tab
    And click on checkBox of Service under ConfigureProposal
    Then review proposal and click on save and proposal
    Then check payment type and enter amount
    Then check term and condition
    Then enter full name and signature
    Then click on save and continue on Agreement tab
    
    #Done
  @nuComIRTCompSendMail @newUserPCCO
  Scenario: Test opportunity info Using time range and Send Email
   When user click on CsrDashboard
   Then user click on AdvanceSearch
   Then user click on CreateNew
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
   Then user click on DDSource
    And enters Account_Alert and enterProblemDiscription
    Then I click on commercial Radio button
    And click on continue button for commercial opportunity
    Then enter service address
    Then User Clicks on Inside Radio Button
    Then Select first time range & Second time range
    Then click on assign to DDL
    And choose assign to person
    And click on save Button
    Then click on opportunity action icon
    Then review all the details and click on save and continue button
    Then click on continue button on inspection tab
     Then user click on DDCategory_SelectService_SalesApp
    Then click on saveBttnCom
    Then click on save and continue on select service tab
    And click on checkBox of Service under ConfigureProposal
    Then review proposal and click on save and proposal
    Then check payment type and enter amount
    Then check term and condition
    Then enter full name and signature
    Then click on save and continue on Agreement tab
    
   #Fail
  @nuComFSTCompSendEmail @newUserPCCO12321
  Scenario: Test to Send Email for commercial
   When user click on CsrDashboard
   Then user click on AdvanceSearch
   Then user click on CreateNew
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
   Then user click on DDSource
    And enters Account_Alert and enterProblemDiscription
    Then I click on commercial Radio button
    And click on continue button for commercial opportunity
    Then enter service address
    Then click on assign to DDL
    And choose assign to person
    And click on save Button
    Then click on opportunity action icon
    Then review all the details and click on save and continue button
    Then click on continue button on inspection tab
     Then user click on DDCategory_SelectService_SalesApp
    Then click on saveBttnCom
    Then click on save and continue on select service tab
    And click on checkBox of Service under ConfigureProposal
    Then review proposal and click on save and proposal
    
     #Done
  @nuComISTSendEmail @newUserPCCOMS123
  Scenario: Test opportunity for InsideRadioButton complete flow for commercial
   When user click on CsrDashboard
   Then user click on AdvanceSearch
   Then user click on CreateNew
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
   Then user click on DDSource
    And enters Account_Alert and enterProblemDiscription
    Then I click on commercial Radio button
    And click on continue button for commercial opportunity
    Then enter service address
    Then User Clicks on Inside Radio Button
    Then click on assign to DDL
    And choose assign to person
    And click on save Button
    Then click on opportunity action icon
    Then review all the details and click on save and continue button
    Then click on continue button on inspection tab
    Then user click on DDCategory_SelectService_SalesApp
    Then click on saveBttnCom
    Then click on save and continue on select service tab
    And click on checkBox of Service under ConfigureProposal
    Then review proposal and click on save and proposal
     
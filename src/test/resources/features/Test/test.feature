@test
Feature: Create pest control residential opportunity for exiting user.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  Scenario: Test opportunity and review proposal
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch info
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
    Then choose category DDL
    And select service from DDL
    And click on add button
    Then click on save and continue on select service tab
    And click on checkBox of Service under ConfigureProposal
    Then review proposal and click on save and proposal
    Then check payment type and enter amount
    Then check term and condition
    Then enter full name and signature
    Then click on save and continue on Agreement tab

  #Done
  @MLCommRTI @newUserPCCO
  Scenario: Test opportunity for MarkLost info Using time range
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch info
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
    Then User Clicks On Mark as Lost
    
     #Done
  @MLComRTF @newUserPCCO
  Scenario: Test opportunity for MarkLost info Using Specific time
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch info
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
    Then User Clicks On Mark as Lost
    Then User waits
    
    #Done
  @MLComSTF @newUserPCCO
  Scenario: Test opportunity MarkLost InspectionTab
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch info
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
    Then User Clicks On Mark as Lost
    Then User waits
    
     #Done
  @MLComSTI @newUserPCCO
  Scenario: Test opportunity MarkLost Inspection Tab
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch info
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
    Then User Clicks On Mark as Lost
    
     #Done
  @nuComFRTCompSendMail @newUserPCCO
  Scenario: Test opportunity and Send Email
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch info
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
    Then click on ComddCat
    Then click on ComddService
    Then click on ComddFrequency
    Then click on saveBttnCom
    Then click on save and continue on select service tab
    And click on checkBox of Service under ConfigureProposal
    Then review proposal and click on save and proposal
    Then check payment type and enter amount
    Then check term and condition
    Then enter full name and signature
    Then click on save and continue on Agreement tab
    
    @nuComIRTCompSendMail @newUserPCCO
  Scenario: Test opportunity info Using time range and Send Email
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch info
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
    Then click on ComddCat
    Then click on ComddService
    Then click on ComddFrequency
    Then click on saveBttnCom
    Then click on save and continue on select service tab
    And click on checkBox of Service under ConfigureProposal
    Then review proposal and click on save and proposal
    Then check payment type and enter amount
    Then check term and condition
    Then enter full name and signature
    Then click on save and continue on Agreement tab
    
    #Done
  @nuComFSTCompSendEmail @newUserPCCO
  Scenario: Test to Send Email for commercial
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch info
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
    Then click on ComddCat
    Then click on ComddService
    Then click on ComddFrequency
    Then click on saveBttnCom
    Then click on save and continue on select service tab
    And click on checkBox of Service under ConfigureProposal
    Then review proposal and click on save and proposal
    Then check payment type and enter amount
    Then check term and condition
    Then enter full name and signature
    Then click on save and continue on Agreement tab
    
    #Done
  @nuComISTSendEmail @newUserPCCO
  Scenario: Test opportunity for InsideRadioButton complete flow for commercial
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch info
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
    Then click on ComddCat
    Then click on ComddService
    Then click on ComddFrequency
    Then click on saveBttnCom
    Then click on save and continue on select service tab
    And click on checkBox of Service under ConfigureProposal
    Then review proposal and click on save and proposal
    Then check payment type and enter amount
    Then check term and condition
    Then enter full name and signature
    Then click on save and continue on Agreement tab
    
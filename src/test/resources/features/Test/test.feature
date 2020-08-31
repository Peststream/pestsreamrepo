@mark
Feature: Create pest control residential opportunity for exiting user.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  
   #without lead checkbox(done)
  @newUserPCCO1
  Scenario: Test to Continue General Info of Termite
    When user click on CallTab
    Then user enters company
    Then user enters contact
    Then user click on Branch
    Then user click on Source
    Then user enters Alert
    Then user enters Problem Description
    Then user click on OppType
    Then user click on continue
    
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
    
    #without lead checkbox(done)
  @nuWOLCom
  Scenario: Test opportunity info (general info) for commercial
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch info
    And enters Account_Alert and enterProblemDiscription
    Then I click on commercial Radio button
    And click on continue button for commercial opportunity

  #with checkbox lead(Done)
  @nuWLCom
  Scenario: Test opportunity info (general info) for commercial with lead
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch info
    Then Check lead button
    And enters Account_Alert and enterProblemDiscription
    Then I click on commercial Radio button
    And click on continue button for commercial opportunity
    

  
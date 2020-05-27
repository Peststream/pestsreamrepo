@test
Feature: Create pest control residential opportunity for exiting user.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

 
  @CallAction
  Scenario: 
    Testing Call action on Already Generated Account
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User clicks on Call Button in the Action Section
    Then User enters CalledFor Source and Target DDL
    Then User adds Description and Notes
    Then User Clicks on Save Button

    
     @EAWTL @existingPCRO
  Scenario: Test opportunity From Left nevigation menu with existing account and with lead for Residential
    When user clicked on call tab in left panel
    Then verify page tittle of call page
     When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    Then i chose service and sounce from respective DDL
    And I create lead
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    
 #done   
 @EAOOPP @existingPCRO
  Scenario: Test open opportunity Add note and click on contiue sale process with existing account for Residential
    When user clicked on customer tab in left panel
    Then user clicked on opportunity subtab
    Then user click on advance search button
    Then user click on open tap
    And select opportunity
    Then user write a note

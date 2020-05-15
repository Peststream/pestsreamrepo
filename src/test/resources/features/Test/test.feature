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
    

 
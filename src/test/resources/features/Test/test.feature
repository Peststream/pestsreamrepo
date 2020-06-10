@testt
Feature: Create pest control residential opportunity for exiting user.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

 
    
    
  
    @con
  Scenario: To check add Contact From Customer Tab and Save
    When user clicked on customer tab in left panel
    Then User clicked on contact tab
    And user clicked on Add Contact Button
    Then user click on FirstName_ContactCustomer
    Then user click on PEmail_ContactCustomer
    Then user click on Source_ContactCustomer
    Then user click on Save_ContactCustomer
    
    @conc
  Scenario: To check add Contact From Customer Tab and Save
  
   
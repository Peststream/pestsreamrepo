@run @Newusermechcall1 

Feature: New USer Mech Call 1

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

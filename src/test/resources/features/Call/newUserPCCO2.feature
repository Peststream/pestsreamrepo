@run @pcco @pests
Feature: Test for new user PCCO2 for Pest.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system
    
      #Done
  @diffBillingAddressCom @newUserPCCO
  Scenario: Test opportunity info Using Different Address
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch info
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

 


 
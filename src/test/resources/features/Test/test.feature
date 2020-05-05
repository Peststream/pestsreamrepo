@test
Feature: Create pest control residential opportunity for exiting user.
 
  Background: 
   Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

#done
@EAWOL @RegressionTest
  Scenario: Test opportunity From Left nevigation menu with existing account and without lead for Residential
    When user clicked on call tab in left panel
    Then verify page tittle of call page
     When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    Then i chose service and sounce from respective DDL
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button

#done
 @EAWTL @RegressionTest
  Scenario: Test opportunity From Left nevigation menu with existing account and with lead for Residential
    When user clicked on call tab in left panel
    Then verify page tittle of call page
     When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    Then i chose service and sounce from respective DDL
    And I create lead
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button

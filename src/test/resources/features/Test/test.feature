@testt
Feature: Create pest control residential opportunity for exiting user.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

 
    
    
  
    @con
  Scenario: To check add Contact From Customer Tab and Save
    
    @SaveAndSignAgreementForSSPComplete @newUserPCRO
  Scenario: To Test the Opportunity and send email
    Given user clicked on call tab in left panel
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    And Service address "line1","line2","Zip","city","state"
    When select package as "standard service"
    And package details "category","service","package","Frequency","Billing Frequency"
    Then click on Add Button
    Then click on Add to agreement check button
    Then click on save & sign agreement button
    And enter additional note
    Then click on send agreement for customer signature
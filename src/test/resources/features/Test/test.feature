@test
Feature: Create pest control residential opportunity for exiting user.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

 
 @nuserviceBundleAddBundleButtonSNP @newUserPCRO
  Scenario: Test Save And Proposal Opportunity Info package for standard service for service bundle
    Given user clicked on call tab in left panel
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    Then Service address "line1","line2","Zip","city","state"
    And check Is Tax Exempt
    Then Enter Tax Exemption
    #Then IS Billing Address Different Than Service Address
    #And Billing addess "line1","line2","Zip","city","state"
    Then click on service bundle radio button
    And Select service bundle
    And click on billing Frequency DDl
    And choose monthly frequency from DDL
    Then click on Add Bundle button
    And click On Save & Proposal
    Then enter proposal note
    And click on Send proposal button On review page
    Then add more email
    And click add more email button
    And click send proposal button
    
     @SaveScheduleEstimationInside @newUserPCRO
  Scenario: To Test Save Opportunity Info Schedule Estimation for Inside for specific time
    Given user clicked on call tab in left panel
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    Then Service address "line1","line2","Zip","city","state"
    Then click on schedule estimation tab
    And click on save
    Then User Screen Waits for a Bit
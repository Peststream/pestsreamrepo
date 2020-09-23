@run @pcro @pestsMSN
Feature: Test for new user PCRO for Pest.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  #Done
  @nuWTOL @newUserPCRO11MSN
  Scenario: Test opportunity From Left nevigation menu with new account and without Lead for Residential
    When user clicked on call tab in left panel
    Then verify page tittle of call page
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button

  #Done
  @nuWTL @newUserPCROMSN
  Scenario: Test opportunity From Left nevigation menu with new account and with Lead for Residential
    When user clicked on call tab in left panel
    Then verify page tittle of call page
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And I create lead
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button

  #Done
  @SaveBillingAddressDiffForSSPMSN @newUserPCRO
  Scenario: To Test Mark As Lost Opportunity Info package for standard service for service package
    Given user clicked on call tab in left panel
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    Then Service address "line1","line2","Zip","city","state"
    And check Is Tax Exempt
    And Enter Tax Exemption
    And IS Billing Address Different Than Service Address
    And Billing addess "line1","line2","Zip","city","state"
    And click On Save Button
    Then User Screen Waits for a Bit

  #Done
  @MLBillingAddressDiffForSSP @newUserPCRO @MSN1
  Scenario: To Test Mark As Lost Opportunity Info package for standard service for service package
    Given user clicked on call tab in left panel
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    Then Service address "line1","line2","Zip","city","state"
    And check Is Tax Exempt
    And Enter Tax Exemption
    And IS Billing Address Different Than Service Address
    And Billing addess "line1","line2","Zip","city","state"
    And click On mark as lost button
    Then click on Reason DDL and choose reason
    Then enter reason description
    And click on Save button
    Then User Screen Waits for a Bit
    
  #Done
  @SaveSSP @newUserPCRO @MSN2
  Scenario: To Test Save Opportunity Info package for standard service for service package
    Given user clicked on call tab in left panel
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    Then Service address "line1","line2","Zip","city","state"
    #And check Is Tax Exempt
    #And Enter Tax Exemption
    #And IS Billing Address Different Than Service Address
    #And Billing addess "line1","line2","Zip","city","state"
    When select package as "standard service"
    And package details "category","service","package","Frequency","Billing Frequency"
    Then click on Add Button
    Then click on Add to agreement check button
    And click On Save Button
    Then User Screen Waits for a Bit

  #Done
  @SaveAndProporsalForSSP @newUserPCRO @MSN3
  Scenario: To Test the Save and Proposal for standard service for service package
    Given user clicked on call tab in left panel
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    And Service address "line1","line2","Zip","city","state"
    #And check Is Tax Exempt
    #And Enter Tax Exemption
    #And IS Billing Address Different Than Service Address
    #And Billing addess "line1","line2","Zip","city","state"
    When select package as "standard service"
    And package details "category","service","package","Frequency","Billing Frequency"
    Then click on Add Button
    And click On Save & Proposal
    Then enter proposal note
    And click on Send proposal button On review page
    Then add more email
    And click add more email button
    And click send proposal button
    Then User Screen Waits for a Bit


  #Done
  #And choose mail address
  #Then click on send Agreement list
  #Then open new tap in the browser
  #And open gmail with credentials
  #And click on OutLook_LogIn_Bttn
  #Then open agreement mail
  #And click on agreement link
  #Then User agree terms and give name
  #Then User redirects to dashboard
  #Then User Clicks on Customer Opportunity
  #Then User Clicks on Advance Search
  #Then clicks on Complete
  #Then User Screen Waits for a Bit
  #Done
  @SaveAndContSetup @newUserPCRO @MSN5
  Scenario: To Test The Complete Flow Of Residential From Creating Opportunity To Sent Agreement To The Customer
    Given user clicked on call tab in left panel
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    And Service address "line1","line2","Zip","city","state"
    And check Is Tax Exempt
    And Enter Tax Exemption
    And IS Billing Address Different Than Service Address
    And Billing addess "line1","line2","Zip","city","state"
    When select package as "standard service"
    And package details "category","service","package","Frequency","Billing Frequency"
    Then click on Add Button
    Then click on Add to agreement check button
    Then click on save & sign agreement button
    Then enter additional note
    And click on save & continue to setup button
    Then User Screen Waits for a Bit

  #Done
  @nusaveSSPundercustomerTabOppadvanceSearchoppContsalesProcess @newUserPCRO @MSN6
  Scenario: Test Flow Of Residential From Creating Opportunity To cont Sale process
    Given user clicked on call tab in left panel
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    And Service address "line1","line2","Zip","city","state"
    And check Is Tax Exempt
    And Enter Tax Exemption
    And IS Billing Address Different Than Service Address
    And Billing addess "line1","line2","Zip","city","state"
    When select package as "standard service"
    And package details "category","service","package","Frequency","Billing Frequency"
    Then click on Add Button
    Then click on Add to agreement check button
    Then click on save more
    Then User Clicks on Customer Opportunity

  @SaveAndSignAgreementForSSPComplete @newUserPCRO @MSN9
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

 
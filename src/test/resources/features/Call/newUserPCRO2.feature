@run @pcro
Feature: Test for new user PCRO2 for Pest.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system
    
    
     #Done
  @nuNonSSML @newUserPCRO
  Scenario: Test Mark As Lost Opportunity Info package for non-standard service
    Given user clicked on call tab in left panel
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    Then Service address "line1","line2","Zip","city","state"
    #And check Is Tax Exempt
    #Then Enter Tax Exemption
    #Then IS Billing Address Different Than Service Address
    #And Billing addess "line1","line2","Zip","city","state"
    And click on non-standard service tab
    Then click on department DDL
    Then choose department value
    And enter service name
    And click billing frequency DDL
    And Choose billing frequency value
    Then click on Add non standard service Add Button
    And click On mark as lost button
    Then click on Reason DDL and choose reason
    Then enter reason description
    And click on Save button

  #Done
  @nuNonSSSave @newUserPCRO
  Scenario: To Test Save Opportunity Info package for non-standard service
    Given user clicked on call tab in left panel
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    Then Service address "line1","line2","Zip","city","state"
    #And check Is Tax Exempt
    #Then Enter Tax Exemption
    #Then IS Billing Address Different Than Service Address
    #And Billing addess "line1","line2","Zip","city","state"
    And click on non-standard service tab
    Then click on department DDL
    Then choose department value
    And enter service name
    And click billing frequency DDL
    And Choose billing frequency value
    Then click on Add non standard service Add Button
    Then User selects the Bundle
    And click On Save Button
    Then User Screen Waits for a Bit

  #Done
  @nuNonSSSAP @newUserPCRO
  Scenario: To Test Save And Proposal Opportunity Info package for non-standard service
    Given user clicked on call tab in left panel
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    Then Service address "line1","line2","Zip","city","state"
    #And check Is Tax Exempt
    #Then Enter Tax Exemption
    #Then IS Billing Address Different Than Service Address
    #And Billing addess "line1","line2","Zip","city","state"
    And click on non-standard service tab
    Then click on department DDL
    Then choose department value
    And enter service name
    And click billing frequency DDL
    And Choose billing frequency value
    Then click on Add non standard service Add Button
    And click On Save & Proposal
    Then enter proposal note
    And click on Send proposal button On review page
    And click send proposal button

  #Done
  @nuNonSSSASA @newUserPCRO
  Scenario: To Test Save And Sign Agreement Opportunity Info package for non-standard service
    Given user clicked on call tab in left panel
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    Then Service address "line1","line2","Zip","city","state"
    #And check Is Tax Exempt
    #Then Enter Tax Exemption
    #Then IS Billing Address Different Than Service Address
    #And Billing addess "line1","line2","Zip","city","state"
    And click on non-standard service tab
    Then click on department DDL
    Then choose department value
    And enter service name
    And click billing frequency DDL
    And Choose billing frequency value
    Then click on Add non standard service Add Button
    Then click on Add to agreement check button
    Then click on save & sign agreement button
    And enter additional note
    Then click on send agreement for customer signature

  #Done
 

  #Done
  @SaveScheduleEstimationInsideST @newUserPCRO
  Scenario: To Test Save Opportunity Info Schedule Estimation for Inside for specific time
    Given user clicked on call tab in left panel
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    Then Service address "line1","line2","Zip","city","state"
    Then click on schedule estimation tab
    Then click on assignedTo DDL and choose Value
    And click on save
    Then User Screen Waits for a Bit

  #Done
  @SaveScheduleEstimationInsideRT @newUserPCRO
  Scenario: To Test Save Opportunity Info Schedule Estimation for Inside for Range time
    Given user clicked on call tab in left panel
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    Then Service address "line1","line2","Zip","city","state"
    Then click on schedule estimation tab
    Then Choose Range Time Radio Button
    Then Choose first Time Range
    Then Choose Second Time Range
    Then click on assignedTo DDL and choose Value
    And click on save
    Then User Screen Waits for a Bit

  #Done
  @MLScheduleEstimationInside @newUserPCRO
  Scenario: To Test Mark As Lost Opportunity Info Schedule Estimation for Inside for Specific Time
    Given user clicked on call tab in left panel
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    Then Service address "line1","line2","Zip","city","state"
    Then click on schedule estimation tab
    Then click on assignedTo DDL and choose Value
    And click On mark as lost button
    Then click on Reason DDL and choose reason
    Then enter reason description
    And click on Save button

  #Done
  @MLScheduleEstimationIR @newUserPCRO
  Scenario: To Test Mark As Lost Opportunity Info Schedule Estimation for Inside for Range Time
    Given user clicked on call tab in left panel
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    Then Service address "line1","line2","Zip","city","state"
    Then click on schedule estimation tab
    Then Choose Range Time Radio Button
    Then Choose first Time Range
    Then Choose Second Time Range
    Then click on assignedTo DDL and choose Value
    And click On mark as lost button
    Then click on Reason DDL and choose reason
    Then enter reason description
    And click on Save button

  #Done
  @SaveScheduleEstimationFR @newUserPCRO
  Scenario: To Test Save Opportunity using TimeRange Info Schedule Estimation for field
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
    Then click on schedule estimation tab
    And click on field radio button
    And click on range time radio button
    Then click on time range DDL and Choose value
    Then click on second time range DDL and choose value
    Then click on assignedTo DDL and choose Value
    And click on save
    Then User Screen Waits for a Bit

  #Done
  @SaveScheduleEstimationFST @newUserPCRO
  Scenario: To Test Save Opportunity Info Schedule Estimation for field
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
    Then click on schedule estimation tab
    And click on field radio button
    Then click on assignedTo DDL and choose Value
    And click on save
    Then User Screen Waits for a Bit

  #Done
  @MLScheduleEstimationFR @newUserPCRO
  Scenario: To Test Mark As Lost Opportunity using FieldRadioButton Info Schedule Estimation for field
    Given user clicked on call tab in left panel
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    Then Service address "line1","line2","Zip","city","state"
    And check Is Tax Exempt
    Then Enter Tax Exemption
    Then click on schedule estimation tab
    And click on field radio button
    And click on range time radio button
    Then click on time range DDL and Choose value
    Then click on second time range DDL and choose value
    Then click on assignedTo DDL and choose Value
    And click On mark as lost button
    Then click on Reason DDL and choose reason
    Then enter reason description
    And click on Save button

  #Done
  @MLScheduleEstimationFS @newUserPCRO
  Scenario: To Test Mark As Lost Opportunity Info Schedule Estimation for field
    Given user clicked on call tab in left panel
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch "BranchName", "Department","Primary Reason Of Call", "Service", "Source"
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    Then Service address "line1","line2","Zip","city","state"
    And check Is Tax Exempt
    Then Enter Tax Exemption
    Then click on schedule estimation tab
    And click on field radio button
    Then click on assignedTo DDL and choose Value
    And click On mark as lost button
    Then click on Reason DDL and choose reason
    Then enter reason description
    And click on Save button
    Then User Screen Waits for a Bit
    
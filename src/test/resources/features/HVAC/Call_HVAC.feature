@run @hvac @Passed
Feature: Test for Call HVAC.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  #pass
  @TestOpportunityInfoForHVAC001
  Scenario: Test opportunity info (general info) for HVAC1
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch Information
    And select source Information
    And enters Account_Alert and enterProblemDiscription
    And click on continue button for commercial opportunity

  #pass
  @TestOpportunityInfoForHVAC55
  Scenario: Test CSR Dashboard for HVAC7
    When user click on CSR Dashboard
    When user click on Advance Search from CSR Dashboard
    And Select Add Call From Action for the first Account
    And Select Add Call Info
    And Click on Save Buttton From Add Call Tab

  #pass
  @TestOpportunityInfoForHVAC55
  Scenario: Test CSR Dashboard for HVAC8
    When user click on CSR Dashboard
    When user click on Advance Search from CSR Dashboard
    And Select Add Task From Action for the first Account
   And Select Task Name, Due Date
    And Click on Save Button

  #pass
  @TestOpportunityInfoForHVAC55
  Scenario: Test CSR Dashboard for HVAC9
    When user click on CSR Dashboard
    When user click on Advance Search from CSR Dashboard
    And Select Add Task From Action for the first Account
    #And Select Task Name, Due Date
    And Click on Save Button

  #pass
  #@skip
  #Scenario: Test CSR Dashboard for HVAC10 
   # When user click on CSR Dashboard
   # When user click on Advance Search from CSR Dashboard
    #And Select Detail Page From Action for the first Account
    #And Close Alert
    #And Enter Note
    #And Click On Save Button


  #pass
  @TestOpportunityInfoForHVAC002
  Scenario: Test Customer DropDown For Account12
    When User Click On Customer
    And Select Account From The DD List
    And Click on Add Account
    And Enter Contact Type "Account" "Account Name" "Contact" Source
    And Click on Save	From Add Account

  #pass
  @TestOpportunityInfoForHVAC003
  Scenario: Test Customer DropDown For Account13
    When User Click On Customer
    And Select Account From The DD List
    And Click On Advance Search From Account
    And Click On Add Opportunity Icon From Action For First Account
    And Select Department,Source,Opportunity Type
    And Click on Save	From Add Account

  #pass
  @TestOpportunityInfoForHVAC004
  Scenario: Test Customer DropDown For Account14
    When User Click On Customer
    And Select Account From The DD List
    And Click On Advance Search From Account
    And Click On View Icon From Action For First Account
    And Enter Note
    And Click On Save Button
  #pass
  @TestOpportunityInfoForHVAC005
  Scenario: Test Customer DropDown For Account15
    When User Click On Customer
    And Select Account From The DD List
    And Click On Advance Search From Account
    And Click On Phone Sales From Action For First Account And Select General Info
    And Click on Continue From General Info

  #pass
  @TestOpportunityInfoForHVAC006
  Scenario: Test Customer DropDown For Company16
    When User Click On Customer
    And Select Customer From The DD List
    And Click On Add	Company
    And Enter Test Data For Add Company
    And Click on Save	From Add Account

  #pass
  @TestOpportunityInfoForHVAC007
  Scenario: Test Customer DropDown For Company18
    When User Click On Customer
    And Select Customer From The DD List
    And click on Advance Search from Add Company
    And Click On View Icon From Action Company
    And Enter Note
    And Click On Save Button

  #pass
  @TestOpportunityInfoForHVA008
  Scenario: Test Customer DropDown For Company19
    When User Click On Customer
    And Select Customer From The DD List
    And click on Advance Search from Add Company
    And Click On Delete Icon From Action Company
  

  #pass
  @TestOpportunityInfoForHVA20
  Scenario: Test Customer DropDown For Company20
    When User Click On Customer
    And Select Customer From The DD List
    And click on Advance Search from Add Company
    And Click On Delete Icon From Action Company
    And Cancel The Alert

  #pass
  @TestOpportunityInfoForHVAC21
  Scenario: Test Customer DropDown For Contact21
    When User Click On Customer
    And Select Contact From The DD List
    And click on Add Contact
    And Enter Test Data To Add Contact
    And Click on Save	From Add Account
    
  
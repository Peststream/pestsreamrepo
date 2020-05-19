@hvac
Feature: Create pest control commercial opportunity for new user.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

#pass
  @TestOpportunityInfoForHVAC
  Scenario: Test opportunity info (general info) for HVAC
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch Information
    And select source Information
    And enters Account_Alert and enterProblemDiscription
    And click on continue button for commercial opportunity
#pass
  @TestOpportunityInfoForHVACForGeneralInfo
  Scenario: Test opportunity info (general info) for HVAC
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch Information
    And select source Information
    And enters Account_Alert and enterProblemDiscription
    And click on continue button for commercial opportunity
    And select primary requested service
    And check flat rate
    And Enter Job Description
    And enters service address "Address Line1", "Zip","Contact", "City"
    And click on Save button from general info
#pass
  @TestOpportunityInfoForHVACForGeneralInfoLead
  Scenario: Test opportunity info (general info) for HVAC
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch Information
    And select source Information
    And enters Account_Alert and enterProblemDiscription
    And click on continue button for commercial opportunity
    And select primary requested service
    And check flat rate
    And Enter Job Description
    And enters service address "Address Line1", "Zip","Contact", "City"
    And click on Save button from general info
    And click on Advance Search from Work Order
    And Select and click on one Work Order Number
    And Select lead employee from DD
    And Click on save from Work Order
#pass
  @TestOpportunityInfoForHVACForOrderType
  Scenario: Test opportunity info (general info) for HVAC
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch Information
    And select source Information
    And enters Account_Alert and enterProblemDiscription
    And click on continue button for commercial opportunity
    And select primary requested service
    And check flat rate
    And Enter Job Description
    And enters service address "Address Line1", "Zip","Contact", "City"
    And click on Save button from general info
    And click on Advance Search from Work Order
    And Select and click on one Work Order Number
    And Select lead employee from DD
    And Click on save from Work Order
    And Click on Advance Search Button
    And Click On First Work Order Number From Work Order
    And Select Order Type From DD
    And Click on save from Work Order
#pass
  @TesCSRDashboardForHVAC
  Scenario: Test CSR Dashboard for HVAC
    When user click on CSR Dashboard
    When user click on Advance Search from CSR Dashboard
    And Select Add Opportunity From Action for the first Account
    And Select General Info From Opportunity Info
    And Click on Continue From General Info

#pass
@TesCSRDashboardForHVACAddCall
  Scenario: Test CSR Dashboard for HVAC
    When user click on CSR Dashboard
    When user click on Advance Search from CSR Dashboard
    And Select Add Call From Action for the first Account
    And Select Add Call Info
    And Click on Save Buttton From Add Call Tab
    
#pass
  @TesCSRDashboardForHVACAddTask
  Scenario: Test CSR Dashboard for HVAC
    When user click on CSR Dashboard
    When user click on Advance Search from CSR Dashboard
    And Select Add Task From Action for the first Account
    And Select Task Name, Due Date
    And Click on Save Button

#pass
  @TesCSRDashboardAddTaskDetails
  Scenario: Test CSR Dashboard for HVAC
    When user click on CSR Dashboard
    When user click on Advance Search from CSR Dashboard
    And Select Add Task From Action for the first Account
    And Select Task Name, Due Date
    And Click on Save Button
#pass
  @TesCSRDashboardForCreateWorkorder
  Scenario: Test CSR Dashboard for HVAC
    When user click on CSR Dashboard
    When user click on Advance Search from CSR Dashboard
    And Select Create Workorder From Action for the first Account
    And Select Service Category & Services
    And Click On Add Button
    And Enter Service Date
    And Click on save from Work Order

#pass
  @TestCSRDashboardForEnterNote
  Scenario: Test CSR Dashboard for HVAC
    When user click on CSR Dashboard
    When user click on Advance Search from CSR Dashboard
    And Select Detail Page From Action for the first Account
    And Enter Note
    And Click On Save Button

#pass
  @TestCSRDashboardForAddOpportunity
  Scenario: Test CSR Dashboard for HVAC
    When user click on CSR Dashboard
    When user click on Advance Search from CSR Dashboard
    And Select Add Opportunity From Action for the first Account
    And Select General Info From Opportunity Info
    And Click on Continue From General Info

#pass
 @TestCustomerForAccountDropdown
  Scenario: Test Customer DropDown For Account
    When User Click On Customer
    And Select Account From The DD List
    And Click on Add Account
    And Enter Contact Type "Account" "Account Name" "Contact" Source
    And Click on Save	From Add Account
    
#pass
  @TestCustomerForAddOpportunity
  Scenario: Test Customer DropDown For Account
    When User Click On Customer
    And Select Account From The DD List
    And Click On Advance Search From Account
    And Click On Add Opportunity Icon From Action For First Account
    And Select Department,Source,Opportunity Type
    And Click on Save	From Add Account

#pass
  @TestCustomerForViewIcon
  Scenario: Test Customer DropDown For Account
    When User Click On Customer
    And Select Account From The DD List
    And Click On Advance Search From Account
    And Click On View Icon From Action For First Account
    And Enter Note
    And Click On Save Button

#pass
  @TestCustomerForPhoneSales
  Scenario: Test Customer DropDown For Account
    When User Click On Customer
    And Select Account From The DD List
    And Click On Advance Search From Account
    And Click On Phone Sales From Action For First Account And Select General Info
    And Click on Continue From General Info

#pass
  @TestCustomerForAddCompany
  Scenario: Test Customer DropDown For Company
    When User Click On Customer
    And Select Customer From The DD List
    And Click On Add	Company
    And Enter Test Data For Add Company
    And Click on Save	From Add Account

#pass
  @TestCompanyForAddOpportunity
  Scenario: Test Customer DropDown For Company
    When User Click On Customer
    And Select Customer From The DD List
    And click on Advance Search from Add Company
    And Click On Add Opportunity Icon From Action Company
    And Select Account From DD
    And Click on Continue From Add Opportunity

#pass
  @TestCompanyForViewIcon
  Scenario: Test Customer DropDown For Company
    When User Click On Customer
    And Select Customer From The DD List
    And click on Advance Search from Add Company
    And Click On View Icon From Action Company
    And Enter Note
    And Click On Save Button

#pass
  @TestCompanyForDeleteIcon
  Scenario: Test Customer DropDown For Company
    When User Click On Customer
    And Select Customer From The DD List
    And click on Advance Search from Add Company
    And Click On Delete Icon From Action Company
    And Confirm The Alert
#pass
  @TestCompanyForDeleteIconCancel
  Scenario: Test Customer DropDown For Company
    When User Click On Customer
    And Select Customer From The DD List
    And click on Advance Search from Add Company
    And Click On Delete Icon From Action Company
    And Cancel The Alert

#pass
  @TestContactFromCustomerDD
  Scenario: Test Customer DropDown For Contact
    When User Click On Customer
    And Select Contact From The DD List
    And click on Add Contact
    And Enter Test Data To Add Contact
    And Click on Save	From Add Account
    
#Pass
  @TestContactForAddContact
  Scenario: Test Customer DropDown For Contact
    When User Click On Customer
    And Select Contact From The DD List
    And click on Add Contact
    And Enter Test Data To Add Contact
    And Click on Close	From Add Account

#PassButOnlyOneTimeAddopportunityIsPossible
  @TestContactForAddOpportunity
  Scenario: Test Customer DropDown For Contact
    When User Click On Customer
    And Select Contact From The DD List
    And Click on Advance Search Button
    And Click On Add Opportunity For Contact
    And Select or Enter General Test Data For Add Opportunity For Contact
    And Click On Save Button For Add Opportunity For Contact

#Pass
  @TestContactForViewIcon
  Scenario: Test Customer DropDown For Contact
    When User Click On Customer
    And Select Contact From The DD List
    And Click on Advance Search Button
    And Click On View For Contact From Action
    And Enter Note
    And Click On Save Button

#pass
  @TestContactForDeleteContact
  Scenario: Test Customer DropDown For Contact
    When User Click On Customer
    And Select Contact From The DD List
    And Click on Advance Search Button
    And Click On Delete For Contact From Action
    And Confirm Delete Alert For Contact

#Pass
  @TestContactForCancelDeleteContact
  Scenario: Test Customer DropDown For Contact
    When User Click On Customer
    And Select Contact From The DD List
    And Click on Advance Search Button
    And Click On Delete For Contact From Action
    And Decline Delete Alert For Contact

#Pass
  @TestOpportunityForAddOpportunity
  Scenario: Test Customer DropDown For Opportunity
    When User Click On Customer
    And Select Opportunity From The DD List
    And Click on Add Opportunity Button
    And Click On New Account From Add Opportunity
    And Select or Enter General Test Data For Add Opportunity
    And Click on Save	From Add Opportunity

#Pass
  @TestLeadForAddLead
  Scenario: Test Customer DropDown For Lead
    When User Click On Customer
    And Select Lead From The DD List
    And Click on Add Lead Button
    And Select Or Enter General Test Info For Lead
    And Click on Save	From Add Lead

#Pass
  @TestDatabaseFromCustomerDD
  Scenario: Test Customer DropDown For Database
    When User Click On Customer
    And Select Database From The DD List
    And Click on Add Database Entry Button
    And Select Or Enter General Test Info For Database
    And Click on Save	From Add Database Ezoom

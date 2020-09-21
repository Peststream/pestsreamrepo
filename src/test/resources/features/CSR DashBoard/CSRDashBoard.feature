@run @csrpestMSN
Feature: Test of CSRDASHBOARD user for Pest.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  @CallAction
  Scenario: Testing New Task action on Already Generated Account
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User clicks on new Task button in thr Action Section
    Then user click on TaskName_CSRDashboard
  Then user click on DueDate_CSRDashboard
  Then user click on Save_CSRDashboard
  
  @NewTaskAction
  Scenario: Testing New Task action on Already Generated Account
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User clicks on new Task button in thr Action Section
    Then User Selects the task Template from the DDL
    Then User Selects Due Date from Calender
    Then User Clicks on Save Button

  @NewTaskwithLogAsActivity
  Scenario: Testing New Task action on Already Generated Account with Log as activity Checked
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User clicks on new Task button in thr Action Section
    Then User Selects the task Template from the DDL
    Then User Selects Due Date from Calender
    Then User Checks the Log as Activity and Selects the activity Type log DDL
    Then user click on Activity_CSRDashboard
    Then User Clicks on Save Button

  @NewTaskwithMarkAsDone
  Scenario: Testing Call action on Already Generated Account with mark as Done Checked
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User clicks on new Task button in thr Action Section
    Then User Selects the task Template from the DDL
    Then User Selects Due Date from Calender
    Then User Checks the Mark As Done
    Then User Clicks on Save Button

  @NewTaskwithMarkAsDoneFollowUp
  Scenario: Testing Call action on Already Generated Account with mark as Done and Follow Up Checked
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User clicks on new Task button in thr Action Section
    Then User Selects the task Template from the DDL
    Then User Selects Due Date from Calender
    Then User Checks the Mark As Done
    Then User Checks on Create Follow Up
    Then User Clicks on Save Button

  @NewTaskwithActivityLogAndMarkAsDone
  Scenario: Testing Call action on Already Generated Account with Activity Log and mark as Done
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User clicks on new Task button in thr Action Section
    Then User Selects the task Template from the DDL
    Then User Selects Due Date from Calender
    Then user click on Activity_CSRDashboard
    Then User Checks the Log as Activity and Selects the activity Type log DDL
    Then User Checks the Mark As Done
    Then User Clicks on Save Button

  @NewTaskwithActivityLogAndMarkAsDoneFollowUp
  Scenario: Testing Call action on Already Generated Account with Activity As Log mark as Done and Follow Up Checked
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User clicks on new Task button in thr Action Section
    Then User Selects the task Template from the DDL
    Then User Selects Due Date from Calender
    Then user click on Activity_CSRDashboard
    Then User Checks the Log as Activity and Selects the activity Type log DDL
    Then User Checks the Mark As Done
    Then User Checks on Create Follow Up
    Then User Clicks on Save Button

  @NewTaskwithRecurring
  Scenario: Testing Call action on Already Generated Account with Recurring
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User clicks on new Task button in thr Action Section
    Then User Selects the task Template from the DDL
    Then User Clicks on Recurring
    Then User selects the recurrence pattern
    Then User Clicks on Save Button

  #Done
  @NewOpportunity
  Scenario: Testing add opportunity from CSR Dashboard
     When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User clicks on add Opportunity Button in Action Tab
     When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch info
    And enters Account_Alert and enterProblemDiscription

  @AddingNote
  Scenario: Testing add note from CSR Dashboard
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User clicks on add Notes Button in Action Tab
    Then User add note
    Then User Saves the note

    
 
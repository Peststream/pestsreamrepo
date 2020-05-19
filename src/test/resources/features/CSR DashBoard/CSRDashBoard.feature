@csr
Feature: Creating action on already generated  account.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  @CallAction
  Scenario: 
    Testing Call action on Already Generated Account
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User clicks on Call Button in the Action Section
    Then User enters CalledFor Source and Target DDL
    Then User adds Description and Notes
    Then User Clicks on Save Button

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
    Then user click on DDSourceAccountOpportunit
    Then User clicks on Continue

  @AddingNote
  Scenario: Testing add note from CSR Dashboard
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User clicks on add Notes Button in Action Tab
    Then User add note
    Then User Saves the note

  #Done
  @WOST
  Scenario: Testing of WorkOrder from CSR dashBoard
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User Clicks on WorkOrder Button
    Then user click on DDServiceCategoryWO
    Then user click on DDServicesWO
    Then User add the Service
    Then User Selects the Service date
    Then User Save the WorkOrder

  #Done
  @WORT
  Scenario: Testing of WorkOrder and add Service from CSR dashBoard
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User Clicks on WorkOrder Button
    Then user click on DDServiceCategoryWO
    Then user click on DDServicesWO
    Then User add the Service
    Then User Selects the Service date
    Then User clicks on the RangeTime
    Then User Save the WorkOrder

  #Done
  @WOLeadTech
  Scenario: Testing of WorkOrder withLead from CSR dashBoard
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User Clicks on WorkOrder Button
    Then user click on DDServiceCategoryWO
    Then user click on DDServicesWO
    Then User add the Service
    Then User Selects the Service date
    Then User clicks on the DDleadTech
    Then User Save the WorkOrder

  #Done
  @ViewDetailForNewComOpportunity
  Scenario: Testing of ViewDetails from CSR dashBoard for new CommercialOpportunity
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User Clicks on the View Details from action tab
    Then user click on alertmessageCSRDashboard
    Then User clicks on add opportunity
    Then user click on DDSourceAccountOpportunit
    Then User clicks on Continue

 

@testt
Feature: Create pest control residential opportunity for exiting user.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  

  @markLostInsideRadioBttn_Comm
  Scenario: Test to Commercial MarkLost InsideRadioButton of ScheduleServiceOrder Termite
    When user click on CallTab
    Then user enters company
    Then user enters contact
    Then user click on Branch
    Then user click on Source
    Then user enters Alert
    Then user enters Problem Description
    Then user click on OppTypeComm
    Then user click on continue
    Then user click on addressLine1
    Then user click on zip
    Then user click on city
    Then user click on addNote
    Then user click on InsideRadioBttn_Comm
    Then user click on RangeTime_InsideScheduleEstimation
    Then user click on DDTimeRange_InsideScheduleEstimation
    Then user click on DDAssignedTo
    Then user click on saveScheduleEstimation
    Then user click on generatedOpportunity_FieldSTSaveComm
    Then user click on saveAndcontGI_FieldSTSaveComm
    Then user click on continueInspection_FieldSTSaveComm
    Then user click on markaslost_InsideSTSaveComm
    Then user click on DDReasonML_InsideSTSaveComm
    Then user click on saveML_InsideSTSaveComm

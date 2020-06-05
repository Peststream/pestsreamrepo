@testt
Feature: Create pest control residential opportunity for exiting user.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  @sendEmailInsideRadioBttn_Comm
  Scenario: Test to Commercial SendEmail InsideRadioButton of ScheduleServiceOrder Termite
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
    Then user click on DDCat_StdService_FieldSTSaveComm
    Then user click on DDService_StdService_FieldSTSaveComm
    Then user click on DDFrequency_StdService_FieldSTSaveComm
    Then user click on Save_StdService_FieldSTSaveComm
    Then user click on saveAndcontSelectService_FieldSTSaveComm
    Then user click on radioBttn_Service_FieldSTSaveComm
    Then user click on saveAndcontConfigureProposal_FieldSTSaveComm
    Then user click on radioBttncashAgreement_FieldSTSaveComm
    Then user click on valuepaidamountAgreement_FieldSTSaveComm
    Then user click on radioBttnTANDCAgreement_FieldSTSaveComm
    Then user click on typenameagreement_FieldSTSaveComm
    Then user click on 	salesrepresentativesignAgreement_FieldSTSaveComm
    Then user click on saveandcontAgreement_FieldSTSaveComm
    Then user click on sendemail_FieldSTSaveComm
    
    
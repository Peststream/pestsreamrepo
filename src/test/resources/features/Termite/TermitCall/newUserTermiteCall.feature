Feature: Test Case of new Termite.
  I want to use this template for my feature file

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  @generalInfoResidential
  Scenario: Test to Continue General Info of Termite
    When user click on CallTab
    Then user enters company
    Then user enters contact
    Then user click on Branch
    Then user click on Source
    Then user enters Alert
    Then user enters Problem Description
    Then user click on OppType
    Then user click on continue

  @generalInfoResidentialWithLead
  Scenario: Test to Continue General Info with lead Termite
    When user click on CallTab
    Then user enters company
    Then user enters contact
    Then user click on Branch
    Then user click on Source
    Then user click on lead
    Then user enters Alert
    Then user enters Problem Description
    Then user click on OppType
    Then user click on continue

  @residentialOpportunity
  Scenario: Test to save Residential Opportunity of ScheduleServiceOrder Termite
    When user click on CallTab
    Then user enters company
    Then user enters contact
    Then user click on Branch
    Then user click on Source
    Then user enters Alert
    Then user enters Problem Description
    Then user click on OppType
    Then user click on continue
    Then user click on addressLine1
    Then user click on zip
    Then user click on city
    Then user click on addNote
    Then user click on DDserviceStdServices
    Then user click on DDpackageStdServices
    Then user click on DDfrequencyStdServices
    Then user click on addStdServices
    Then user click on radioButtionAddToAgreement
    Then user click on saveAddToAgreement

  @resiWOMLSelectService
  Scenario: Test to save Opportunity as MarkLost in SelectService(Sales Appointment) of Termite
    When user click on CallTab
    Then user enters company
    Then user enters contact
    Then user click on Branch
    Then user click on Source
    Then user enters Alert
    Then user enters Problem Description
    Then user click on OppType
    Then user click on continue
    Then user click on addressLine1
    Then user click on zip
    Then user click on city
    Then user click on addNote
    Then user click on DDserviceStdServices
    Then user click on DDpackageStdServices
    Then user click on DDfrequencyStdServices
    Then user click on addStdServices
    Then user click on radioButtionAddToAgreement
    Then user click on saveAddToAgreement
    When user click on opportunity
    Then user click on saveAndCont_GI_SalesApp_Appointments
    Then user click on continue_Inspection_SalesApp_Appointments
    Then user click on markAsLost_SelectService_SalesApp_Appointments
    Then user click on DDReason_OppLostReason
    Then user click on des_OppLostReason
    Then user click on save_OppLostReason

  @resiServiceBundleSave
  Scenario: Test to Save ServiceBundle in Opportunity of Termite
    When user click on CallTab
    Then user enters company
    Then user enters contact
    Then user click on Branch
    Then user click on Source
    Then user enters Alert
    Then user enters Problem Description
    Then user click on OppType
    Then user click on continue
    Then user click on addressLine1
    Then user click on zip
    Then user click on city
    Then user click on addNote
    Then user click on ServiceBundle
    Then user click on DDBundle
    Then user click on AddBundle
    Then user click on radioBttnAddToAgreement
    Then user click on Save_BundleServices

  @resiScheduleEstimationInsideSpecificTimeSave
  Scenario: Test to Save ScheduleEstimation in Opportunity of Termite
    When user click on CallTab
    Then user enters company
    Then user enters contact
    Then user click on Branch
    Then user click on Source
    Then user enters Alert
    Then user enters Problem Description
    Then user click on OppType
    Then user click on continue
    Then user click on addressLine1
    Then user click on zip
    Then user click on city
    Then user click on addNote
    Then user click on ScheduleEstimation
    Then user click on DDAssignedTo
    Then user click on saveScheduleEstimation

  @resiScheduleEstimationInsideSpecificTimeMarkLost
  Scenario: Test to Save MarkLost ScheduleEstimation of Termite
    When user click on CallTab
    Then user enters company
    Then user enters contact
    Then user click on Branch
    Then user click on Source
    Then user enters Alert
    Then user enters Problem Description
    Then user click on OppType
    Then user click on continue
    Then user click on addressLine1
    Then user click on zip
    Then user click on city
    Then user click on addNote
    Then user click on ScheduleEstimation
    Then user click on DDAssignedTo
    Then user click on MarkLost_ScheduleEstimation
    Then user click on DDReason_ScheduleEstimation
    Then user click on des_ScheduleEstimation
    Then user click on save_ScheduleEstimation

  @resiScheduleEstimationInsideRangeTimeMarkLost
  Scenario: Test to Save MarkLost ScheduleEstimation of Termite
    When user click on CallTab
    Then user enters company
    Then user enters contact
    Then user click on Branch
    Then user click on Source
    Then user enters Alert
    Then user enters Problem Description
    Then user click on OppType
    Then user click on continue
    Then user click on addressLine1
    Then user click on zip
    Then user click on city
    Then user click on addNote
    Then user click on ScheduleEstimation
    Then user click on RangeTime_InsideScheduleEstimation
    Then user click on DDTimeRange_InsideScheduleEstimation
    Then user click on DDAssignedTo
    Then user click on MarkLost_ScheduleEstimation
    Then user click on DDReason_ScheduleEstimation
    Then user click on des_ScheduleEstimation
    Then user click on save_ScheduleEstimation

  @resiScheduleEstimationInsideRangeTimeSave
  Scenario: Test to Save InsideRangeTime ScheduleEstimation of Termite
    When user click on CallTab
    Then user enters company
    Then user enters contact
    Then user click on Branch
    Then user click on Source
    Then user enters Alert
    Then user enters Problem Description
    Then user click on OppType
    Then user click on continue
    Then user click on addressLine1
    Then user click on zip
    Then user click on city
    Then user click on addNote
    Then user click on ScheduleEstimation
    Then user click on RangeTime_InsideScheduleEstimation
    Then user click on DDTimeRange_InsideScheduleEstimation
    Then user click on DDAssignedTo
    Then user click on saveScheduleEstimation

  @resiScheduleEstimationFieldRangeTimeSave
  Scenario: Test to Save FieldRangeTime ScheduleEstimation of Termite
    When user click on CallTab
    Then user enters company
    Then user enters contact
    Then user click on Branch
    Then user click on Source
    Then user enters Alert
    Then user enters Problem Description
    Then user click on OppType
    Then user click on continue
    Then user click on addressLine1
    Then user click on zip
    Then user click on city
    Then user click on addNote
    Then user click on ScheduleEstimation
    Then user click on fieldRadioBttn_FieldScheduleEstimation
    Then user click on RangeTime_InsideScheduleEstimation
    Then user click on DDTimeRange_InsideScheduleEstimation
    Then user click on DDAssignedTo
    Then user click on saveScheduleEstimation

  @resiScheduleEstimationFieldRangeTimeMarkLost
  Scenario: Test to Save FieldRangeTime MarkLost ScheduleEstimation of Termite
    When user click on CallTab
    Then user enters company
    Then user enters contact
    Then user click on Branch
    Then user click on Source
    Then user enters Alert
    Then user enters Problem Description
    Then user click on OppType
    Then user click on continue
    Then user click on addressLine1
    Then user click on zip
    Then user click on city
    Then user click on addNote
    Then user click on ScheduleEstimation
    Then user click on fieldRadioBttn_FieldScheduleEstimation
    Then user click on RangeTime_InsideScheduleEstimation
    Then user click on DDTimeRange_InsideScheduleEstimation
    Then user click on DDAssignedTo
    Then user click on MarkLost_ScheduleEstimation
    Then user click on DDReason_ScheduleEstimation
    Then user click on des_ScheduleEstimation
    Then user click on save_ScheduleEstimation

  @resiScheduleEstimationFieldSpecificTimeSave
  Scenario: Test to Save FieldSpecificTime ScheduleEstimation of Termite
    When user click on CallTab
    Then user enters company
    Then user enters contact
    Then user click on Branch
    Then user click on Source
    Then user enters Alert
    Then user enters Problem Description
    Then user click on OppType
    Then user click on continue
    Then user click on addressLine1
    Then user click on zip
    Then user click on city
    Then user click on addNote
    Then user click on ScheduleEstimation
    Then user click on fieldRadioBttn_FieldScheduleEstimation
    Then user click on DDAssignedTo
    Then user click on saveScheduleEstimation

  @resiScheduleEstimationFieldRangeTimeMarkLost
  Scenario: Test to Save FieldRangeTime MarkLost ScheduleEstimation of Termite
    When user click on CallTab
    Then user enters company
    Then user enters contact
    Then user click on Branch
    Then user click on Source
    Then user enters Alert
    Then user enters Problem Description
    Then user click on OppType
    Then user click on continue
    Then user click on addressLine1
    Then user click on zip
    Then user click on city
    Then user click on addNote
    Then user click on ScheduleEstimation
    Then user click on fieldRadioBttn_FieldScheduleEstimation
    Then user click on RangeTime_InsideScheduleEstimation
    Then user click on DDTimeRange_InsideScheduleEstimation
    Then user click on DDAssignedTo
    Then user click on MarkLost_ScheduleEstimation
    Then user click on DDReason_ScheduleEstimation
    Then user click on des_ScheduleEstimation
    Then user click on save_ScheduleEstimation

  @resiScheduleEstimationFieldRangeTimeSave
  Scenario: Test to Save FieldRangeTime ScheduleEstimation of Termite
    When user click on CallTab
    Then user enters company
    Then user enters contact
    Then user click on Branch
    Then user click on Source
    Then user enters Alert
    Then user enters Problem Description
    Then user click on OppType
    Then user click on continue
    Then user click on addressLine1
    Then user click on zip
    Then user click on city
    Then user click on addNote
    Then user click on ScheduleEstimation
    Then user click on fieldRadioBttn_FieldScheduleEstimation
    Then user click on RangeTime_InsideScheduleEstimation
    Then user click on DDTimeRange_InsideScheduleEstimation
    Then user click on DDAssignedTo
    Then user click on saveScheduleEstimation

  @generalInfoCommercial
  Scenario: Test to Continue GeneralInfoCommercial of ScheduleServiceOrder Termite
    When user click on CallTab
    Then user enters company
    Then user enters contact
    Then user click on Branch
    Then user click on Source
    Then user enters Alert
    Then user enters Problem Description
    Then user click on OppTypeComm
    Then user click on continue

  @generalInfoCommercialWithLead
  Scenario: Test to Continue GeneralInfoCommercial using Lead of ScheduleServiceOrder Termite
    When user click on CallTab
    Then user enters company
    Then user enters contact
    Then user click on Branch
    Then user click on Source
    Then user click on lead
    Then user enters Alert
    Then user enters Problem Description
    Then user click on OppTypeComm
    Then user click on continue

  @commScheduleEstimationFieldSpecificTimeSave
  Scenario: Test to FieldRadioButton of ScheduleServiceOrder Termite
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
    Then user click on fieldRadioBttn_FieldScheduleEstimation
    Then user click on DDAssignedTo
    Then user click on saveScheduleEstimation

  @commScheduleEstimationFieldRangeTimeSave
  Scenario: Test to  Commercial FieldRadioButton RangeTime of ScheduleServiceOrder Termite
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
    Then user click on fieldRadioBttn_FieldScheduleEstimation
    Then user click on RangeTime_InsideScheduleEstimation
    Then user click on DDTimeRange_InsideScheduleEstimation
    Then user click on DDAssignedTo
    Then user click on saveScheduleEstimation

  @commScheduleEstimationInsideSpecificTimeSave
  Scenario: Test to Commercial InsideSpecificTimeSave of ScheduleServiceOrder Termite
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
    Then user click on DDAssignedTo
    Then user click on saveScheduleEstimation

  @commScheduleEstimationInsideRangeTimeSave
  Scenario: Test to Commercial InsideRangeTimeSave of ScheduleServiceOrder Termite
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

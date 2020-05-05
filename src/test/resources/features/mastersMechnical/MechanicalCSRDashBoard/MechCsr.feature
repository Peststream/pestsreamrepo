Feature: Create Mech CSR DashBoard for advance search.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  @AccNo_AddOppBttn_CSRDB_Mech
  Scenario: Test to Add Opportunity using CSRDashboard.
    When user click on CSRDashBoard_Mech
    When user clicked on AdvanceSearch_CSRDB_Mech
    Then click on AccountNo_CSRDB_Mech
    Then click on OkAccountAlert_CSRDB_Mech
    Then click on AddOppBttn_CSRDB_Mech
    Then click on SecondaryPhoneNo_Opp_CSRDB_Mech
    Then click on DDDep_Opp_CSRDB_Mech
    Then click on ValueDDDep_Opp_CSRDB_Mech
    Then click on DDService_Opp_CSRDB_Mech
    Then click on ValueDDService_Opp_CSRDB_Mech
    Then click on DDSource_Opp_CSRDB_Mech
    Then click on ValueDDSource_Opp_CSRDB_Mech
    Then click on Cont_Opp_CSRDB_Mech

  @AccNo_AddCallBttn_CSRDB_Mech
  Scenario: Test to Add Call using CSRDashboard.
    When user click on CSRDashBoard_Mech
    When user clicked on AdvanceSearch_CSRDB_Mech
    Then click on AccountNo_CSRDB_Mech
    Then click on OkAccountAlert_CSRDB_Mech
    Then click on AddCallBttn_CSRDB_Mech
    Then click on DDTarget_CSRDB_Mech
    Then click on ValueDDTarget_CSRDB_Mech
    Then click on Des_CallBttn_CSRDB_Mech
    Then click on Note_CallBttn_CSRDB_Mech
    Then click on Save_CallBttn_CSRDB_Mech

  @AccNo_AddWOBttn_KeepSameBillingAddress_CSRDB_Mech
  Scenario: Test to Add WorkOrder when Billing Adddress is same using CSRDashboard.
    When user click on CSRDashBoard_Mech
    When user clicked on AdvanceSearch_CSRDB_Mech
    Then click on AccountNo_CSRDB_Mech
    Then click on OkAccountAlert_CSRDB_Mech
    Then click on AddWOBttn_CSRDB_Mech
    Then click on DDServiceCategory_AddWOBttn_CSRDB_Mech
    Then click on ValueDDServiceCategory_AddWOBttn_CSRDB_Mech
    Then click on Services_AddWOBttn_CSRDB_Mech
    Then click on ValueServices_AddWOBttn_CSRDB_Mech
    Then click on Add_AddWOBttn_CSRDB_Mech
    Then click on KeepSameBillingAddress_AddWOBttn_CSRDB_Mech
    Then click on ServiceDatePOP_AddWOBttn_CSRDB_Mech
    Then click on ServiceDateValue_AddWOBttn_CSRDB_Mech
    Then click on Save_AddWOBttn_CSRDB_Mech

  @AccNo_AddWOBttn_Notes_CSRDB_Mech
  Scenario: Test to Add WorkOrder with Notes using CSRDashboard.
    When user click on CSRDashBoard_Mech
    When user clicked on AdvanceSearch_CSRDB_Mech
    Then click on AccountNo_CSRDB_Mech
    Then click on OkAccountAlert_CSRDB_Mech
    Then click on AddWOBttn_CSRDB_Mech
    Then click on DDServiceCategory_AddWOBttn_CSRDB_Mech
    Then click on ValueDDServiceCategory_AddWOBttn_CSRDB_Mech
    Then click on Services_AddWOBttn_CSRDB_Mech
    Then click on ValueServices_AddWOBttn_CSRDB_Mech
    Then click on Add_AddWOBttn_CSRDB_Mech
    Then click on Notes_AddWOBttn_CSRDB_Mech
    Then click on ServiceDatePOP_AddWOBttn_CSRDB_Mech
    Then click on ServiceDateValue_AddWOBttn_CSRDB_Mech
    Then click on Save_AddWOBttn_CSRDB_Mech

  @AccNo_AddWOBttn_Direction_CSRDB_Mech
  Scenario: Test to Add WorkOrder with Direction using CSRDashboard.
    When user click on CSRDashBoard_Mech
    When user clicked on AdvanceSearch_CSRDB_Mech
    Then click on AccountNo_CSRDB_Mech
    Then click on OkAccountAlert_CSRDB_Mech
    Then click on AddWOBttn_CSRDB_Mech
    Then click on DDServiceCategory_AddWOBttn_CSRDB_Mech
    Then click on ValueDDServiceCategory_AddWOBttn_CSRDB_Mech
    Then click on Services_AddWOBttn_CSRDB_Mech
    Then click on ValueServices_AddWOBttn_CSRDB_Mech
    Then click on Add_AddWOBttn_CSRDB_Mech
    Then click on Direction_AddWOBttn_CSRDB_Mech
    Then click on ServiceDatePOP_AddWOBttn_CSRDB_Mech
    Then click on ServiceDateValue_AddWOBttn_CSRDB_Mech
    Then click on Save_AddWOBttn_CSRDB_Mech

  @AccNo_AddWOBttn_PrimaryRoute_CSRDB_Mech
  Scenario: Test to Add WorkOrder with PrimaryRoute using CSRDashboard.
    When user click on CSRDashBoard_Mech
    When user clicked on AdvanceSearch_CSRDB_Mech
    Then click on AccountNo_CSRDB_Mech
    Then click on OkAccountAlert_CSRDB_Mech
    Then click on AddWOBttn_CSRDB_Mech
    Then click on DDServiceCategory_AddWOBttn_CSRDB_Mech
    Then click on ValueDDServiceCategory_AddWOBttn_CSRDB_Mech
    Then click on Services_AddWOBttn_CSRDB_Mech
    Then click on ValueServices_AddWOBttn_CSRDB_Mech
    Then click on Add_AddWOBttn_CSRDB_Mech
    Then click on ServiceDatePOP_AddWOBttn_CSRDB_Mech
    Then click on ServiceDateValue_AddWOBttn_CSRDB_Mech
    Then click on DDPrimaryRoute_AddWOBttn_CSRDB_Mech
    Then click on ValuePrimaryRoute_AddWOBttn_CSRDB_Mech
    Then click on Save_AddWOBttn_CSRDB_Mech
    
    
    @AccNo_AddWOBttn_SpecialInst_CSRDB_Mech
  Scenario: Test to Add WorkOrder with SpecialInstruction using CSRDashboard.
    When user click on CSRDashBoard_Mech
    When user clicked on AdvanceSearch_CSRDB_Mech
    Then click on AccountNo_CSRDB_Mech
    Then click on OkAccountAlert_CSRDB_Mech
    Then click on AddWOBttn_CSRDB_Mech
    Then click on DDServiceCategory_AddWOBttn_CSRDB_Mech
    Then click on ValueDDServiceCategory_AddWOBttn_CSRDB_Mech
    Then click on Services_AddWOBttn_CSRDB_Mech
    Then click on ValueServices_AddWOBttn_CSRDB_Mech
    Then click on Add_AddWOBttn_CSRDB_Mech
    Then click on ServiceDatePOP_AddWOBttn_CSRDB_Mech
    Then click on ServiceDateValue_AddWOBttn_CSRDB_Mech
    Then click on SpecialInstruction_AddWOBttn_CSRDB_Mech
    Then click on Save_AddWOBttn_CSRDB_Mech
    
    
     @AccNo_AddWOBttn_ServiceInst_CSRDB_Mech
  Scenario: Test to Add WorkOrder with ServiceInstruction using CSRDashboard.
    When user click on CSRDashBoard_Mech
    When user clicked on AdvanceSearch_CSRDB_Mech
    Then click on AccountNo_CSRDB_Mech
    Then click on OkAccountAlert_CSRDB_Mech
    Then click on AddWOBttn_CSRDB_Mech
    Then click on DDServiceCategory_AddWOBttn_CSRDB_Mech
    Then click on ValueDDServiceCategory_AddWOBttn_CSRDB_Mech
    Then click on Services_AddWOBttn_CSRDB_Mech
    Then click on ValueServices_AddWOBttn_CSRDB_Mech
    Then click on Add_AddWOBttn_CSRDB_Mech
    Then click on ServiceDatePOP_AddWOBttn_CSRDB_Mech
    Then click on ServiceDateValue_AddWOBttn_CSRDB_Mech
    Then click on ServiceInstruction_AddWOBttn_CSRDB_Mech
    Then click on Save_AddWOBttn_CSRDB_Mech
    
    
     @AccNo_AddWOBttn_InternalInst_CSRDB_Mech
  Scenario: Test to Add WorkOrder with InternalInstruction using CSRDashboard.
    When user click on CSRDashBoard_Mech
    When user clicked on AdvanceSearch_CSRDB_Mech
    Then click on AccountNo_CSRDB_Mech
    Then click on OkAccountAlert_CSRDB_Mech
    Then click on AddWOBttn_CSRDB_Mech
    Then click on DDServiceCategory_AddWOBttn_CSRDB_Mech
    Then click on ValueDDServiceCategory_AddWOBttn_CSRDB_Mech
    Then click on Services_AddWOBttn_CSRDB_Mech
    Then click on ValueServices_AddWOBttn_CSRDB_Mech
    Then click on Add_AddWOBttn_CSRDB_Mech
    Then click on ServiceDatePOP_AddWOBttn_CSRDB_Mech
    Then click on ServiceDateValue_AddWOBttn_CSRDB_Mech
    Then click on InternalInstruction_AddWOBttn_CSRDB_Mech
    Then click on Save_AddWOBttn_CSRDB_Mech
    
    
     @AccNo_AddWOBttn_SetUpInst_CSRDB_Mech
  Scenario: Test to Add WorkOrder with SetUpInstruction using CSRDashboard.
    When user click on CSRDashBoard_Mech
    When user clicked on AdvanceSearch_CSRDB_Mech
    Then click on AccountNo_CSRDB_Mech
    Then click on OkAccountAlert_CSRDB_Mech
    Then click on AddWOBttn_CSRDB_Mech
    Then click on DDServiceCategory_AddWOBttn_CSRDB_Mech
    Then click on ValueDDServiceCategory_AddWOBttn_CSRDB_Mech
    Then click on Services_AddWOBttn_CSRDB_Mech
    Then click on ValueServices_AddWOBttn_CSRDB_Mech
    Then click on Add_AddWOBttn_CSRDB_Mech
    Then click on ServiceDatePOP_AddWOBttn_CSRDB_Mech
    Then click on ServiceDateValue_AddWOBttn_CSRDB_Mech
    Then click on SetUpInstruction_AddWOBttn_CSRDB_Mech
    Then click on Save_AddWOBttn_CSRDB_Mech
    
    
    @AccNo_AddWOBttn_RangeTime_CSRDB_Mech
  Scenario: Test to Add WorkOrder with RangeTime using CSRDashboard.
    When user click on CSRDashBoard_Mech
    When user clicked on AdvanceSearch_CSRDB_Mech
    Then click on AccountNo_CSRDB_Mech
    Then click on OkAccountAlert_CSRDB_Mech
    Then click on AddWOBttn_CSRDB_Mech
    Then click on DDServiceCategory_AddWOBttn_CSRDB_Mech
    Then click on ValueDDServiceCategory_AddWOBttn_CSRDB_Mech
    Then click on Services_AddWOBttn_CSRDB_Mech
    Then click on ValueServices_AddWOBttn_CSRDB_Mech
    Then click on Add_AddWOBttn_CSRDB_Mech
    Then click on ServiceDatePOP_AddWOBttn_CSRDB_Mech
    Then click on ServiceDateValue_AddWOBttn_CSRDB_Mech
    Then click on RangeTimeRdioBttn_AddWOBttn_CSRDB_Mech
    Then click on DDTimeRange_AddWOBttn_CSRDB_Mech
    Then click on ValueTimeRange_AddWOBttn_CSRDB_Mech
    Then click on DDSecondTimeRange_AddWOBttn_CSRDB_Mech
    Then click on ValueSecondTimeRange_AddWOBttn_CSRDB_Mech
    Then click on Save_AddWOBttn_CSRDB_Mech



  @AccNo_AddWOBttn_CSRDB_Mech
  Scenario: Test to Add WorkOrder with PrimaryRoute using CSRDashboard.
    When user click on CSRDashBoard_Mech
    When user clicked on AdvanceSearch_CSRDB_Mech
    Then click on AccountNo_CSRDB_Mech
    Then click on OkAccountAlert_CSRDB_Mech
    Then click on AddWOBttn_CSRDB_Mech
    Then click on DDServiceCategory_AddWOBttn_CSRDB_Mech
    Then click on ValueDDServiceCategory_AddWOBttn_CSRDB_Mech
    Then click on Services_AddWOBttn_CSRDB_Mech
    Then click on ValueServices_AddWOBttn_CSRDB_Mech
    Then click on Add_AddWOBttn_CSRDB_Mech
    Then click on KeepSameBillingAddress_AddWOBttn_CSRDB_Mech
    Then click on Notes_AddWOBttn_CSRDB_Mech
    Then click on Direction_AddWOBttn_CSRDB_Mech
    Then click on ServiceDatePOP_AddWOBttn_CSRDB_Mech
    Then click on ServiceDateValue_AddWOBttn_CSRDB_Mech
    Then click on DDPrimaryRoute_AddWOBttn_CSRDB_Mech
    Then click on ValuePrimaryRoute_AddWOBttn_CSRDB_Mech
    Then click on SpecialInstruction_AddWOBttn_CSRDB_Mech
    Then click on ServiceInstruction_AddWOBttn_CSRDB_Mech
    Then click on InternalInstruction_AddWOBttn_CSRDB_Mech
    Then click on SetUpInstruction_AddWOBttn_CSRDB_Mech
    Then click on Save_AddWOBttn_CSRDB_Mech

  @AccNo_AddWOBttn_CSRDB_Mech1
  Scenario: Test to Add WorkOrder with TwoTimeRange using CSRDashboard.
    Then click on RangeTimeRdioBttn_AddWOBttn_CSRDB_Mech
    Then click on DDTimeRange_AddWOBttn_CSRDB_Mech
    Then click on ValueTimeRange_AddWOBttn_CSRDB_Mech
    Then click on DDSecondTimeRange_AddWOBttn_CSRDB_Mech
    Then click on ValueSecondTimeRange_AddWOBttn_CSRDB_Mech

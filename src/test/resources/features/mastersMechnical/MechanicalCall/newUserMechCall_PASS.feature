@run @Newusermechcallpas
Feature: New USer Mech Call Pass

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  #scenarios are not declared in this feature file
  #Pass_Fixed
  @CSSO_General_Mech
  Scenario: Test to Continue General Info of ScheduleServiceOrder Mechanical1
    When user clicked on CallTab
    Then user enters Company
    Then user click on contact
    Then user click on search
    Then user click on Primary Email
    Then user click on cell
    Then user click on branch Mech
    Then user click on department
    Then user click on service
    Then user click on source
    Then user enters Alert
    Then user enters Problem Description
    Then user click on continue

  #Pass_Fixed
  @CSSO_BranchMech_JobtypeAdd_Save_Mech
  Scenario: Test to Continue General Info of ScheduleServiceOrder with branch Mech and Job Type2
    When user clicked on CallTab
    Then user enters Company
    Then user enters Contact
    And user click on search
    Then user enters Primary Email
    Then user enters Cell
    Then user selects Branch Mech
    Then user selects Service
    Then user selects Source
    Then user enters Account Alert
    Then user enters Problem Description
    Then user click on Continue
    Then user selects on job type
    Then user click on Flat Rate
    Then user enters Job Description
    Then user click on Add
    Then user click on Service Address
    Then user enters Address
    Then user enters Zip
    Then user enters City
    Then user click on Schedule Time
    Then user selects Primary Route
    And user clicks on Save Button Mech

  #Pass_Fixed
  @CSSO_GereralInfo_TMaterial_Save
  Scenario: Test to Continue General Info of ScheduleServiceOrder Mechanical by specifying Time and Material3
    When user clicked on CallTab
    Then user enters Company
    Then user enters Contact
    And user click on search
    Then user enters Primary Email
    Then user enters Cell
    Then user selects Branch Mech
    Then user selects Service
    Then user selects Source
    Then user enters Account Alert
    Then user enters Problem Description
    Then user click on Continue
    Then user selects on job type
    Then user click on Time and Material
    Then user enters Job Description
    Then user click on Add
    Then user click on Service Address
    Then user enters Address
    Then user enters Zip
    Then user enters City
    Then user click on Schedule Time
    Then user selects Primary Route
    And user clicks on Save Button Mech

  #Pass_Fixed
  @CSSO_SSO_TMaterial_TimeandPrice_After_SpecificHour_SplitPrice_Save
  Scenario: Test to Continue General Info of ScheduleServiceOrder Mechanical by specifying Time and Material4
    When user clicked on CallTab
    Then user enters Company
    Then user enters Contact
    And user click on search
    Then user enters Primary Email
    Then user enters Cell
    Then user selects Branch Mech
    Then user selects Service
    Then user selects Source
    Then user enters Account Alert
    Then user enters Problem Description
    Then user click on Continue
    Then user selects on job type
    Then user click on Time and Material
    #Then user enters Price not Exceed
    Then user click on Service Repair rate(After)
    Then user click on Specific Hour
    Then user click on Split Price
    Then user enters Job Description
    Then user click on Add
    Then user click on Service Address
    Then user enters Address
    Then user enters Zip
    Then user enters City
    Then user click on Address Sub Type(residential)
    Then user click on Range 	Time
    Then select Time Range
    Then select Second Time Range
    Then user selects Primary Route
    Then user click on LabourType(Helper)
    And user clicks on Save Button Mech

  #Pass
  @CSSO_SSO_FlatRate_Standard_Specific_Mechanic_Save
  Scenario: Test to Continue General Info of ScheduleServiceOrder Mechanical by using FlatRate5
    When user clicked on CallTab
    Then user enters Company
    Then user enters Contact
    And user click on search
    Then user enters Primary Email
    Then user enters Cell
    Then user selects Branch Mech
    Then user selects Service
    Then user selects Source
    Then user enters Account Alert
    Then user enters Problem Description
    Then user click on Continue
    Then user selects on job type
    Then user click on Flat Rate
    Then user enters Job Description
    Then user click on Add
    Then user click on Service Address
    Then user enters Address
    Then user enters Zip
    Then user enters City
    Then user click on Address Sub Type(residential)
    Then user selects Primary Route
    And user clicks on Save Button Mech

  #Pass
  @CSSO_SSO_FlatRate_Standard_Specific_Mechanic_WorkOrder_SaveDetails
  Scenario: Test to Continue General Info of ScheduleServiceOrder Mechanical by specifying Time and Material6
    When user clicked on CallTab
    Then user enters Company
    Then user enters Contact
    And user click on search
    Then user enters Primary Email
    Then user enters Cell
    Then user selects Branch Mech
    Then user selects Service
    Then user selects Source
    Then user enters Account Alert
    Then user enters Problem Description
    Then user click on Continue
    Then user selects on job type
    Then user click on Flat Rate
    Then user enters Job Description
    Then user click on Add
    Then user click on Service Address
    Then user enters Address
    Then user enters Zip
    Then user enters City
    Then user click on Address Sub Type(residential)
    Then user selects Primary Route
    And user clicks on Save Button Mech
    Then user click on Advance Search Mech

  #PassFixed
  @CSSO_SS0_After_HolidayHour_Range_Helper_Save
  Scenario: Test to Continue General Info of ScheduleServiceOrder with branch Mech and Job Type ,Save and open Work Order.8
    When user clicked on CallTab
    Then user enters Company
    Then user enters Contact
    And user click on search
    Then user enters Primary Email
    Then user enters Cell
    Then user selects Branch Mech
    Then user selects Service
    Then user selects Source
    Then user enters Account Alert
    Then user enters Problem Description
    Then user click on Continue
    Then user selects on job type
    Then user click on Time and Material
    Then user click on Service Repair rate(After)
    #Then user click on Holiday Hour
    Then user click on Split Price
    Then user enters Job Description
    Then user click on Add
    Then user click on Service Address
    Then user enters Address
    Then user enters Zip
    Then user enters City
    Then user click on Address Sub Type(residential)
    Then user click on Range 	Time
    Then select Time Range
    Then select Second Time Range
    Then user selects Primary Route
    Then user click on LabourType(Helper)
    And user clicks on Save Button Mech

  #Pass_fix
  @CSSO_SSO_TMaterial_After_HolidayHour_SplitPrice_Helper_Save
  Scenario: Test to Continue General Info of ScheduleServiceOrder Mechanical by specifying Time and Material9
    When user clicked on CallTab
    Then user enters Company
    Then user enters Contact
    And user click on search
    Then user enters Primary Email
    Then user enters Cell
    Then user selects Branch Mech
    Then user selects Service
    Then user selects Source
    Then user enters Account Alert
    Then user enters Problem Description
    Then user click on Continue
    Then user selects on job type
    Then user click on Time and Material
    Then user click on Service Repair rate(After)
    Then user click on Split Price
    Then user enters Job Description
    Then user click on Add
    Then user click on Service Address
    Then user enters Address
    Then user enters Zip
    Then user enters City
    Then user click on Address Sub Type(residential)
    Then user click on Range 	Time
    Then select Time Range
    Then select Second Time Range
    Then user selects Primary Route
    Then user click on LabourType(Helper)
    And user clicks on Save Button Mech

  #Pass
  @CSSO_GereralInfo_TMaterial_TimeRange_Save
  Scenario: Test to Continue General Info of ScheduleServiceOrder Mechanical by specifying Time and Material,Time Range.10
    When user clicked on CallTab
    Then user enters Company
    Then user enters Contact
    And user click on search
    Then user enters Primary Email
    Then user enters Cell
    Then user selects Branch Mech
    Then user selects Service
    Then user selects Source
    Then user enters Account Alert
    Then user enters Problem Description
    Then user click on Continue
    Then user selects on job type
    Then user click on Time and Material
    Then user enters Job Description
    Then user click on Add
    Then user click on Service Address
    Then user enters Address
    Then user enters Zip
    Then user enters City
    Then user click on Range 	Time
    Then select Time Range
    Then select Second Time Range
    Then user selects Primary Route
    And user clicks on Save Button Mech

  #PassFixed
  @CSSO__JTNew_After_SpecificHour__Split_Range_Helper_Save_Mech
  Scenario: Test Opportunity using Specific Hour.17
    When user clicked on CallTab
    Then user enters Company
    Then user enters Contact
    And user click on search
    Then user enters Primary Email
    Then user enters Cell
    Then user selects Branch Mech
    Then user selects Service
    Then user selects Source
    Then user enters Account Alert
    Then user enters Problem Description
    Then user click on Continue
    Then user selects on job type (New Construction)
    Then user click on Time and Material
    Then user click on Service Repair rate(After)
    Then user click on Specific Hour
    Then user click on Split Price
    Then user enters Job Description
    Then user click on Add
    Then user click on Service Address
    Then user enters Address
    Then user enters Zip
    Then user enters City
    Then user click on Address Sub Type(residential)
    Then user click on Range 	Time
    Then select Time Range
    Then select Second Time Range
    Then user selects Primary Route
    Then user click on LabourType(Helper)
    And user clicks on Save Button Mech

  #Pass_fixed
  @CSSO_GeneralInfo_ScheduleEstimation_Mech
  Scenario: Test to Continue General Info of ScheduleEstimation Mechanical21
    When user clicked on CallTab
    Then user enters Company
    Then user click on contact
    Then user click on search
    Then user click on Primary Email
    Then user click on cell
    Then user click on branch Mech
    Then user click on department
    Then user click on service
    Then user click on source
    Then user click on schedule Type(schedule estimation)
    Then user enters Alert
    Then user enters Problem Description
    Then user click on continue

  #Pass_fixed
  @CSSO_ScheduleEstimation_Save_Mech
  Scenario: Test General Info of ScheduleEstimation with Job Type22
    When user clicked on CallTab
    Then user enters Company
    Then user enters Contact
    And user click on search
    Then user enters Primary Email
    Then user enters Cell
    Then user selects Branch Mech
    Then user selects Service
    Then user selects Source
    Then user click on schedule Type(schedule estimation)
    Then user enters Account Alert
    Then user enters Problem Description
    Then user click on Opportunity Type(Residential)
    Then user click on Continue
    Then user click on Service Address
    Then user enters Address
    Then user enters Zip
    Then user enters City
    Then user click on Address Sub Type(residential)
    Then user click on Assigned,Estimated Duration
    Then user click on saveInfo Button

  #Passes_fixed
  @CSSO_ScheduleEstimation_RangeTime_Mech
  Scenario: Test to Continue General Info of ScheduleEstimation with RangeTime23
    When user clicked on CallTab
    Then user enters Company
    Then user enters Contact
    And user click on search
    Then user enters Primary Email
    Then user enters Cell
    Then user selects Branch Mech
    Then user selects Service
    Then user selects Source
    Then user click on schedule Type(schedule estimation)
    Then user enters Account Alert
    Then user enters Problem Description
    Then user click on Opportunity Type(Residential)
    Then user click on Continue
    Then user click on Service Address
    Then user enters Address
    Then user enters Zip
    Then user enters City
    Then user click on Address Sub Type(residential)
    Then user click on Range 	Time
    Then select Time Range
    Then select Second Time Range
    Then user click on Assigned,Estimated Duration
    Then user click on saveInfo Button

  #Passed_fixed
  @CSSO_ScheduleEstimation_Residential_Field_SpecificTime_Save_Mech
  Scenario: Test to General Info of ScheduleEstimation with SpecificTime24
    When user clicked on CallTab
    Then user enters Company
    Then user enters Contact
    And user click on search
    Then user enters Primary Email
    Then user enters Cell
    Then user selects Branch Mech
    Then user selects Service
    Then user selects Source
    Then user click on schedule Type(schedule estimation)
    Then user enters Account Alert
    Then user enters Problem Description
    Then user click on Opportunity Type(Residential)
    Then user click on continue
    Then user click on Service Address
    Then user enters Address
    Then user enters Zip
    Then user enters City
    Then user click on Address Sub Type(residential)
    Then user click on sales type (field)
    Then user click on Assigned,Estimated Duration
    Then user click on saveInfo Button

  #Pass_Fixed
  @CSSO_ScheduleEstimation_Residential_Inside_SpecificTime_Save_Mech
  Scenario: Test ScheduleEstimation Residential with InsideSpecificTime25
    When user clicked on CallTab
    Then user enters Company
    Then user enters Contact
    And user click on search
    Then user enters Primary Email
    Then user enters Cell
    Then user selects Branch Mech
    Then user selects Service
    Then user selects Source
    Then user click on schedule Type(schedule estimation)
    Then user enters Account Alert
    Then user enters Problem Description
    Then user click on Opportunity Type(Commercial)
    Then user click on continue
    Then user click on Service Address
    Then user enters Address
    Then user enters Zip
    Then user enters City
    Then user click on Address Sub Type(Commercial)
    Then user click on Assigned,Estimated Duration
    Then user click on saveInfo Button

  #Pass_Email
  @CSSO_SchEstimation_Resi_Field_Specific_NonStd_CustPresent_Mech2
  Scenario: Test Scheduleestimation Residential with FieldSpecific when Cust is Present27
    When user clicked on CallTab
    Then user enters Company
    Then user enters Contact
    And user click on search
    Then user enters Primary Email
    Then user enters Cell
    Then user selects Branch Mech
    Then user selects Service
    Then user selects Source
    Then user click on schedule Type(schedule estimation)
    Then user enters Account Alert
    Then user enters Problem Description
    Then user click on Commercial
    Then user click on continue
    Then user click on Service Address
    Then user enters Address
    Then user enters Zip
    Then user enters City
    Then user click on Address Sub Type(residential)
    Then user click on sales type (field)
    Then user click on Assigned,Estimated Duration
    Then user click on saveInfo Button
    Then user click on Opportunity_Mech
    Then user click on Save & Continue General Info
    Then user click on continue Inspection
    Then user click on Non Standard Equipment subTab
    Then user click on Service Repair Rate(non standard)
    Then user click on Save Equipment
    Then user click on Save & Continue Equipment
    Then user click on Save & Continue Customer Review
    Then user click on Payment type
    Then user Enters Amount paid
    Then user click on I Agree Terms & Condition
    Then user click on Electronic Signature
    Then user click on Customer Signature
    Then user click on Sales Representative Signature
    Then user click on Save & Continue Signatures
    Then user click on send email(Cust Present)

  #Pass
  @CSSO_ScheduleEstimation_Comm_Inside_TimeRange_Save_Mech
  Scenario: Test ScheduleEstimation Commercial with InsideTimeRange28
    When user clicked on CallTab
    Then user enters Company
    Then user enters Contact
    And user click on search
    Then user enters Primary Email
    Then user enters Cell
    Then user selects Branch Mech
    Then user selects Service
    Then user selects Source
    Then user click on schedule Type(schedule estimation)
    Then user enters Account Alert
    Then user enters Problem Description
    Then user click on Commercial
    Then user click on continue
    Then user click on Service Address
    Then user enters Address
    Then user enters Zip
    Then user enters City
    Then user click on Address Sub Type(Commercial)
    Then user click on Range 	Time
    Then select Time Range
    Then select Second Time Range
    Then user click on Assigned,Estimated Duration
    Then user click on saveInfo Button
    

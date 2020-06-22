@run @Newusermechcall10
Feature: New USer Mech Call Pass

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system
  #scenarios are not declared in this feature file
  #Pass_Fixed
  @CSSO_General_Mech
  Scenario: Test to Continue General Info of ScheduleServiceOrder Mechanical
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
  Scenario: Test to Continue General Info of ScheduleServiceOrder with branch Mech and Job Type
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
  Scenario: Test to Continue General Info of ScheduleServiceOrder Mechanical by specifying Time and Material
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
  Scenario: Test to Continue General Info of ScheduleServiceOrder Mechanical by specifying Time and Material
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
  Scenario: Test to Continue General Info of ScheduleServiceOrder Mechanical by using FlatRate
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
  Scenario: Test to Continue General Info of ScheduleServiceOrder Mechanical by specifying Time and Material
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

  #Pass_fixed
  @CSSO_SSO_TMaterial_TimeandPrice_After_SpecificHour_SplitPrice_Workorder_CustPresent_Sendmail
  Scenario: Test to Continue General Info of ScheduleServiceOrder Mechanical by specifying Time and Material
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
    Then user click on Advance Search Mech
    Then user selects Work order

  #PassFixed
  @CSSO_SS0_After_HolidayHour_Range_Helper_Save
  Scenario: Test to Continue General Info of ScheduleServiceOrder with branch Mech and Job Type ,Save and open Work Order.
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
  Scenario: Test to Continue General Info of ScheduleServiceOrder Mechanical by specifying Time and Material
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
  Scenario: Test to Continue General Info of ScheduleServiceOrder Mechanical by specifying Time and Material,Time Range.
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

  #Pass_Fixed
  @CSSO_WorkOrder_Frate_ServiceApp_CustPresent_SendMail_Mech
  Scenario: Test to Continue General Info of ScheduleServiceOrder with branch Mech and Job Type ,Save and open Work Order.
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
    Then user click on Advance Search Mech
    Then user selects Work order
    And user checks the details and Save
    Then user click on Appointments Tab
    Then user click on service appointments
    Then user click on name

  #Pass_Fixed
  @CSSO_WorkOrder_Frate_ServiceApp_CustAbsent_SendMail_Mech
  Scenario: Test to Continue General Info of ScheduleServiceOrder with branch Mech and Job Type ,Save and open Work Order.
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
    Then user click on Advance Search Mech
    Then user selects Work order
    And user checks the details and Save
    Then user click on Appointments Tab
    Then user click on service appointments
    Then user click on name

  #Passed_Fixed
  @CSSO__After_HolidayHour_Range_Helper_ServiceApp_CustAbsent_SendMail_Mech
  Scenario: Test to Continue General Info of ScheduleServiceOrder with branch Mech and Job Type ,Save and open Work Order.
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
    Then user click on Advance Search Mech
    Then user selects Work order
    And user checks the details and Save
    Then user click on Appointments Tab
    Then user click on service appointments
    Then user click on name

  #pass_fixed
  @CSSO__JTNew_TMaterial_Mechanic_ServiceApp_CustAbsent_SendMail_Mech
  Scenario: Test to Continue General Info of ScheduleServiceOrder with branch Mech and Job Type ,Save and open Work Order.
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
    Then user click on Advance Search Mech
    Then user selects Work order
    And user checks the details and Save
    Then user click on Appointments Tab
    Then user click on service appointments

  #Pass_Fixed
  @CSSO__After_HolidayHour_Range_Helper_ServiceApp_CustPresent_SendMail_Mech
  Scenario: Test to Continue General Info of ScheduleServiceOrder with branch Mech and Job Type ,Save and open Work Order.
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
    Then user click on Advance Search Mech
    Then user selects Work order
    And user checks the details and Save
    Then user click on Appointments Tab
    Then user click on service appointments
    Then user click on name

  #PAss_Fixed
  @CSSO__TMaterial_After_Hour_Trange_Helper_Workorder_StopJob_CustPresent_Mech
  Scenario: Test to Continue WorkOrder when CustomerPresent.
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
    Then user click on Advance Search Mech
    Then user selects Work order
    And user checks the details and Save
    Then user click on Appointments Tab
    Then user click on service appointments
    Then user click on name

  #PassFixed
  @CSSO__JTNew_After_SpecificHour__Split_Range_Helper_Save_Mech
  Scenario: Test Opportunity using Specific Hour.
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

  #Pass_Fixed
  @CSSO__JTNew_After_SpecificHour__Split_Range_Helper_Save_SerApp_CustPresent_Mech
  Scenario: Test Serevice Appointments and Send Email.
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
    Then user click on Advance Search Mech
    Then user selects Work order

  #Passed_Fixed
  @CSSO_WorkOrder_TMaterial_ServiceApp_CustPresent_SendMail_Mech
  Scenario: Test Service Appointments when Cust is Present and Send Email.
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
    Then user click on Advance Search Mech
    Then user selects Work order
    And user checks the details and Save
    Then user click on Appointments Tab
    Then user click on service appointments

  #Passed_fixed
  @CSSO_WorkOrder_TMaterial_ServiceApp_CustAbsent_SendMail_Mech
  Scenario: Scenario: Test Service Appointments when Cust is Absent and Send Email
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
    Then user click on Advance Search Mech
    Then user selects Work order
    And user checks the details and Save
    Then user click on Appointments Tab
    Then user click on service appointments
    Then user click on name

  #Pass_fixed
  @CSSO_GeneralInfo_ScheduleEstimation_Mech
  Scenario: Test to Continue General Info of ScheduleEstimation Mechanical
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
  Scenario: Test General Info of ScheduleEstimation with Job Type
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
  Scenario: Test to Continue General Info of ScheduleEstimation with RangeTime
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
  Scenario: Test to General Info of ScheduleEstimation with SpecificTime
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
  Scenario: Test ScheduleEstimation Residential with InsideSpecificTime
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

  #Passed_Fixed
  @CSSO_ScheduleEstimation_Commercial_Field_Specific_Save_Mech
  Scenario: Test ScheduleEstimation Commercial with FieldSpecific
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
    Then user click on sales type (field)
    Then user click on Assigned,Estimated Duration
    Then user click on saveInfo Button

 

  #Pass_Email
  @CSSO_SchEstimation_Resi_Field_Specific_NonStd_CustPresent_Mech
  Scenario: Test Scheduleestimation Residential with FieldSpecific when Cust is Present
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
  Scenario: Test ScheduleEstimation Commercial with InsideTimeRange
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
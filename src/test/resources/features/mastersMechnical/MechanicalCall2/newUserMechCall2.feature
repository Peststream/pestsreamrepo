@run @NewUserMechCallPassTwo
Feature: New USer Mech Call 2

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  #Pass_fixed
  @CSSO_SSO_TMaterial_TimeandPrice_After_SpecificHour_SplitPrice_Workorder_CustPresent_Sendmail
  Scenario: Test to Continue General Info of ScheduleServiceOrder Mechanical by specifying Time and Material7
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

  #Pass_Fixed
  @CSSO_WorkOrder_Frate_ServiceApp_CustPresent_SendMail_Mech
  Scenario: Test to Continue General Info of ScheduleServiceOrder with branch Mech and Job Type ,Save and open Work Order.11
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
  Scenario: Test to Continue General Info of ScheduleServiceOrder with branch Mech and Job Type ,Save and open Work Order.12
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

  #Passed_Fixed
  @CSSO__After_HolidayHour_Range_Helper_ServiceApp_CustAbsent_SendMail_Mech
  Scenario: Test to Continue General Info of ScheduleServiceOrder with branch Mech and Job Type ,Save and open Work Order.13
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
  Scenario: Test to Continue General Info of ScheduleServiceOrder with branch Mech and Job Type ,Save and open Work Order.14
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
  Scenario: Test to Continue General Info of ScheduleServiceOrder with branch Mech and Job Type ,Save and open Work Order.15
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
  Scenario: Test to Continue WorkOrder when CustomerPresent.16
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

  #Pass_Fixed
  @CSSO__JTNew_After_SpecificHour__Split_Range_Helper_Save_SerApp_CustPresent_Mech
  Scenario: Test Serevice Appointments and Send Email.18
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
  Scenario: Test Service Appointments when Cust is Present and Send Email.19
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
  Scenario: Scenario: Test Service Appointments when Cust is Absent and Send Email20
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

  #Passed_Fixed
  @CSSO_ScheduleEstimation_Commercial_Field_Specific_Save_Mech
  Scenario: Test ScheduleEstimation Commercial with FieldSpecific26
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
    #Then user click on Address Sub Type(Commercial)
    #Then user click on sales type (field)
    #Then user click on Assigned,Estimated Duration
    #Then user click on saveInfo Button

  #Passed_Recent
  @CSSO_ScheduleEstimation_Residential_Inside_TimeRange_Save_Mech
  Scenario: Test ScheduleEstimation Residential with branch Mech Schedule Estimation,Residential and Specific Schedule Time15
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
    Then user click on Range 	Time
    Then select Time Range
    Then select Second Time Range
    Then user click on Assigned,Estimated Duration
    Then user click on saveInfo Button

  #Passed_Recent
  @CSSO_SchEstimation_Resi_Inside_Specific_Save_Mech
  Scenario: Test ScheduleEstimation with InsideSpecific19
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
    Then user click on Assigned,Estimated Duration
    Then user click on saveInfo Button

  #Passed_Recent
  @CSSO_ScheduleEstimation_Comm_Inside_Specific_Save_Mech
  Scenario: Test ScheduleEstimation Commercial with InsideSpecific22
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

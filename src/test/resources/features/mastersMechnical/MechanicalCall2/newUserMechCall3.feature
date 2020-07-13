@run @NewUserMechCallPass 
Feature: New USer Mech Call 3

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  #Pass_Fixed
  @CSSO_General_Mec11
  Scenario: Test to Continue General Info of ScheduleServiceOrder with branch Mech and Job Type ,Save and open Work Order.1
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
    Then user navigates Back twice

  #And user checks the details and Save
  #Passed_Fixed
  @CSSO_General_Mec2
  Scenario: Test to Continue General Info of ScheduleServiceOrder with branch Mech and Job Type ,Save and open Work Order.2
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

  #Passed_Recent
  @CSSO_General_Mec7
  Scenario: Test to General Info of ScheduleEstimation send Email for CustomerSignature.7
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

  #Then user click on continue Inspection
  #Then user click on Non Standard Equipment subTab
  #Then user click on Service Repair Rate(non standard)
  #Then user click on Save Equipment
  #Then user click on Save & Continue Equipment
  #Then user click on Save & Continue Customer Review
  #Then user click on Payment type
  #Then user Enters Amount paid
  #Then user click on I Agree Terms & Condition
  #Then user click on Electronic Signature
  #Then user click on Customer Signature
  #Then user click on Sales Representative Signature
  #Then user click on Save & Continue Signatures
  #Then user click on Send email	Agreement1
  #Passed_recent
  @CSSO_General_Mec8
  Scenario: Test ScheduleEstimation with FieldRange  Cust is Absent8
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
    Then user click on sales type (field)
    Then user click on Range 	Time
    Then select Time Range
    Then select Second Time Range
    Then user click on Assigned,Estimated Duration
    Then user click on saveInfo Button
    Then user click on Opportunity_Mech
    Then user click on Save & Continue General Info

  #Passed_Recent
  @CSSO_General_Mec9
  Scenario: Test ScheduleEstimation with InsideRange when Cust is Absent and Send Agreement Link9
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
    Then user click on Opportunity_Mech
    Then user click on Save & Continue General Info

  #Then user click on continue Inspection
  ##Then user enters Repair to Search
  # Then user click on Save Equipment
  #Then user click on Save & Continue Equipment
  #Pass_Fixed
  @CSSO_General_Mec10
  Scenario: Test ScheduleEstimation Commercial with FieldSpecific when Cust is Present and send email10
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
    Then user click on Opportunity_Mech
    Then user click on Save & Continue General Info

  #Then user click on send email(Cust Present)
  #Passed_Recent
  @CSSO_General_Mec111
  Scenario: Test ScheduleEstimation with branch Mech Schedule Estimation,Residential and Specific Schedule Time.11
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

  #Passed_recent
  @CSSO_SchEstimation_Resi_Inside_Specific_NonStd_CustPresent_Mech
  Scenario: Test ScheduleEstimation with IndideSpecific with Cust is Present12
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
    Then user click on Opportunity_Mech
    Then user click on Save & Continue General Info

  #Pass_Email
  @CSSO_SchEstimation_Resi_Field_Specific_NonStd_CustPresent_Mech
  Scenario: Test Scheduleestimation Residential with FieldSpecific when Cust is Present13
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

  #Then user click on continue Inspection
  #Then user click on Non Standard Equipment subTab
  #Then user click on Service Repair Rate(non standard)
  #Then user click on Save Equipment
  #Then user click on Save & Continue Equipment
  #Then user click on Save & Continue Customer Review
  #Then user click on Payment type
  #Then user Enters Amount paid
  #Then user click on I Agree Terms & Condition
  #Then user click on Electronic Signature
  #Then user click on Customer Signature
  #Then user click on Sales Representative Signature
  #Then user click on Save & Continue Signatures
  #passed_recent
  @CSSO_ScheduleEstimation_Comm_Inside_Specific_NonStd_CustPresent_Mech
  Scenario: Test ScheduleEstimation Commercial with InsideSpecific when Cust is Present.23
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
    Then user click on Assigned,Estimated Duration
    Then user click on saveInfo Button
    Then user click on Opportunity_Mech
    Then user click on Save & Continue General Info

  #Then user click on continue Inspection
  #Then user click on Non Standard Equipment subTab
  #Then user click on Service Repair Rate(non standard)
  #Then user click on Save Equipment
  #Then user click on Save & Continue Equipment
  #Then user click on Save & Continue Customer Review
  #Then user click on Payment type
  #Then user Enters Amount paid
  #Then user click on I Agree Terms & Condition
  #Then user click on Electronic Signature
  #Then user click on Customer Signature
  #Then user click on Sales Representative Signature
  #Then user click on Save & Continue Signatures
  #Passed_recent
  @CSSO_SchEstimation_Comm_Inside_Range_Std_CustAbsent_Mech
  Scenario: Test ScheduleEstimation Commercial with InsideRange when Cust is Absent and send and email5
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
    Then user click on Range 	Time
    Then select Time Range
    Then select Second Time Range
    Then user click on Assigned,Estimated Duration
    Then user click on saveInfo Button
    Then user click on Opportunity_Mech
    Then user click on Save & Continue General Info
    Then user click on continue Inspection
    Then user enters Repair to Search
    Then user click on Save Equipment
    #Then user click on Save & Continue Equipment
    Then user click on Save & Continue Equipment

  #Pass
  @CSSO_General_Mec3
  Scenario: Test Opportunity using PrimaryRoute.3
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
    And user clicks on Save Button Mech

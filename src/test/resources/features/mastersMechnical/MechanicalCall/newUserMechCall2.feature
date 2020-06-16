@run @Newusermechcall
Feature: New USer Mech Call 2

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  #scenarios are not declared in this feature file
  #Pass_Fixed
  #Passed_Recent
  @CSSO_SchEstimation_Residential_Field_Range_Std_CustAbsent_Mech
  Scenario: Test ScheduleEstimation Residential with FieldRange and send mail.3
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
    Then user click on Range 	Time
    Then select Time Range
    Then select Second Time Range
    Then user click on Assigned,Estimated Duration
    Then user click on saveInfo Button
    Then user click on Opportunity_Mech

  #Passed_recent
  @CSSO_SchEstimation_Comm_Field_Range_Std_CustAbsent_Mech
  Scenario: Test ScheduleEstimation Commercial with FieldRange when Cust is Absent and send Email4
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
    Then user click on Address Sub Type(residential)
    Then user click on sales type (field)
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
    Then user click on Save & Continue Equipment

  #Passed_Fixed
  @CSSO_ScheduleEstimation_Commercial_Field_Save_Mech
  Scenario: Test ScheduleEstimation Commercial with Field7
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

  #Passed_Recent
  @CSSO_ScheduleEstimation_Comm_Field_TimeRange_NonStd_CustAbsent_Mech
  Scenario: Test ScheduleEstimation Commercial with FieldTimeRange when Cust is Absent8
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
    Then user click on Range 	Time
    Then select Time Range
    Then select Second Time Range
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
    Then user click on Customer not present
    Then user click on Sales Representative Signature
    Then user click on Save & Continue Signatures
    Then user click on Send Agreement Link

  #Pass_Fixed
  @CSSO_ScheduleEstimation_Commercial_Field_TimeRange_Save_Mech
  Scenario: Test Commercial ScheduleEstimation with FieldTimeRange and save11
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
    Then user click on Range 	Time
    Then select Time Range
    Then select Second Time Range
    Then user click on Assigned,Estimated Duration
    Then user click on saveInfo Button

  #Passed_Recent
  @CSSO_ScheduleEstimation_Commercial_Field_NonStd_CustAbsent_Mech
  Scenario: Test Commercial ScheduleEstimation with Field using NonStandard when Cust is Absent12
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
    Then user click on Range 	Time
    Then select Time Range
    Then select Second Time Range
    Then user click on Assigned,Estimated Duration
    Then user click on saveInfo Button
    Then user click on Opportunity_Mech
    Then user click on Save & Continue General Info
    Then user click on continue Inspection
    Then user click on Non Standard Equipment subTab
    Then user click on Service Repair Rate(non standard)
    Then user click on Save Equipment
    Then user click on Save & Continue Equipment

  #Passed_Recent
  @CSSO_ScheduleEstimation_Comm_Field_TimeRange_Std_CustPresent_Mech
  Scenario: Test ScheduleEstimation Commercial with FieldTimeRange when Cust is Present.13
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
    Then user click on Range 	Time
    Then select Time Range
    Then select Second Time Range
    Then user click on Assigned,Estimated Duration
    Then user click on saveInfo Button
    Then user click on Opportunity_Mech
    Then user click on Save & Continue General Info

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

  #Passed_recent
  @CSSO_ScheduleEstimation_Resi_Inside_RangeTime_NotSTD_CustAbsent_Mech
  Scenario: Test ScheduleServiceOrder with branch Mech Schedule Estimation,Residential and Specific Schedule Time16
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
    Then user click on Customer not present
    Then user click on Sales Representative Signature
    Then user click on Save & Continue Signatures
    Then user click on Send Agreement Link

  #Passed_Recent
  @CSSO_SchEstimation_Resi_Field_RangeTime_Save_Mech
  Scenario: Test ScheduleEstimation with FieldRangeTime17
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
    Then user click on Range 	Time
    Then select Time Range
    Then select Second Time Range
    Then user click on Assigned,Estimated Duration
    Then user click on saveInfo Button

  #Passed_Recent
  @CSSO_SchEstimation_Resi_Field_RangeTime_NonStd_CustAbsent_Mech
  Scenario: Test ScheduleEstimation Residential with FieldRangeTime when Cust is Absent 18
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
    Then user click on Range 	Time
    Then select Time Range
    Then select Second Time Range
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
    Then user click on Customer not present
    Then user click on Sales Representative Signature
    Then user click on Save & Continue Signatures
    Then user click on Send Agreement Link

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

  #Passed_recent
  @CSSO_ScheduleEstimation_Comm_Inside_TimeRange_NonStd_CustAbsent_Mech
  Scenario: Test ScheduleEstimation Commercial with InsideTimeRange when Cust is Absent25
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
    Then user click on Opportunity_Mech
    #Then user Enters Last Name
    Then user click on Save & Continue General Info

  #Passed_Fixed
  @CSSO_ScheduleEstimation_Comm_Inside_Specific_NonStd_CustAbsent_Mech
  Scenario: Test ScheduleEstimation Commercial with InsideSpecific when Cust is Absent26
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
    #Then user Enters Last Name
    Then user click on Save & Continue General Info
    Then user click on continue Inspection
    Then user click on Non Standard Equipment subTab
    Then user click on Service Repair Rate(non standard)
    Then user click on Save Equipment
    Then user click on Save & Continue Equipment
    Then user click on Save & Continue Customer Review
    Then user click on Payment type
    Then user Enters Amount paid
    Then user click on Customer not present
    Then user click on Sales Representative Signature
    Then user click on Save & Continue Signatures
    Then user click on Send Agreement Link

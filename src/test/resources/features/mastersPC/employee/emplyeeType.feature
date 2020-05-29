Feature: Test for Employee.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  #Done
  @createStaffFullTime
  Scenario: Test create staff for FullTime feature in Employee tab
    When i click on employee tab on dashboard
    Then i click on staff subtab of employee
    And i click on Add Employee button
    Then i enter basic branch info
    Then i enter personal info
    Then i choose employee type
    Then i choose role name
    #ddl not have options
    Then i choose status
    And click on employee save Button

  #Done
  @createStaffHalfTime
  Scenario: Test create staff for HalfTime feature in Employee tab
    When i click on employee tab on dashboard
    Then i click on staff subtab of employee
    And i click on Add Employee button
    Then i enter basic branch info
    Then i enter personal info
    And user click on employeeType
    Then i choose role name
    #ddl not have options
    Then i choose status
    And click on employee save Button

  #Done
  @createStaffReportingAuthority
  Scenario: Test create staff for ReportingAuthority feature in Employee tab
    When i click on employee tab on dashboard
    Then i click on staff subtab of employee
    And i click on Add Employee button
    Then i enter basic branch info
    Then i enter personal info
    Then i choose employee type
    Then i choose role name
    Then user clicks on DDReportingAuthority
    Then i choose status
    And click on employee save Button

  #Done
  @createTeamupdate
  Scenario: Test create team feature in Employee tab
    When i click on employee tab on dashboard
    Then i click on team subtab of employee
    Then i click on add team button
    And get branch name from DDL
    Then i get mailID
    Then i get team name
    Then i get department from DDL
    Then i get employee from DDL
    Then click on IsPrimary check button
    Then click on Action button
    And click on save button

  #Done
  @createRoute
  Scenario: Test create Route feature in Employee tab
    When i click on employee tab on dashboard
    Then i click on route subtab of employee
    Then i click on add route button
    Then enter route
    Then enter route name
    Then select lead technician
    And enter description
    Then click on save button

  #Done
  @createRouteOverride
  Scenario: Test create RouteOverride feature in Employee tab
    When i click on employee tab on dashboard
    Then i click on routeOverride
    Then i click on addRouteOverride
    Then i click on save

  #Done
  @createClockInOut
  Scenario: Test create team feature in Employee tab
    When i click on employee tab on dashboard
    Then user click on ClockInOutTab
    Then user click on addClockInOut
    Then user click on ClockInOutDate
    Then user click on TimeOut
    Then user click on ValueTimeOut
    Then user click on save

  #Done
  @createClockInOutWorkingStatus
  Scenario: Test create ClockInOutWorkingStatus feature in Employee tab
    When i click on employee tab on dashboard
    Then user click on ClockInOutTab
    Then user click on addClockInOut
    Then user click on ClockInOutDate
    Then user click on ValueTimeOut
    Then user click on DDWorkingStatus
    Then user click on save

  #Done
  @createClockInOutReason
  Scenario: Test create ClockInOutReason feature in Employee tab
    When i click on employee tab on dashboard
    Then user click on ClockInOutTab
    Then user click on addClockInOut
    Then user click on ClockInOutDate
    Then user click on ValueTimeOut
    Then user click on Reason
    Then user click on save

  #Done
  @createLMFull
  Scenario: Test create for FullLeaveManagement
    When i click on employee tab on dashboard
    Then user click on leaveManagement
    Then user click on Action
    Then user click on DDLeaveType
    Then user click on ToDateLM
    Then user click on DDStatus
    Then user click on SaveLM

  #Done
  @createLMHalf
  Scenario: Test create for HalfLeaveManagement
    When i click on employee tab on dashboard
    Then user click on leaveManagement
    Then user click on Action
    Then user click on DDLeaveTypeHalf
    Then user click on LMFromTime
    Then user click on LMToTime
    Then user click on DDStatus
    Then user click on SaveLM

  #Done
  @createLMSick
  Scenario: Test create for LeaveType
    When i click on employee tab on dashboard
    Then user click on leaveManagement
    Then user click on Action
    Then user click on DDLeaveTypeSick
    Then user click on ToDateLM
    Then user click on DDStatus
    Then user click on SaveLM

  #Done
  @createEmpTimesheet
  Scenario: Test create Employee Timesheet feature in Employee tab
    When i click on employee tab on dashboard
    Then user click on Employee timesheet
    Then user click on non-billable hours
    Then user selects Department
    Then user selects Time_slot
    Then user enters Date
    Then user selects from_time
    Then user selects to_time
    Then user enters Description
    Then user clicks on save button

  #Done
  @SupervisorTimesheet
  Scenario: Test create Supervisor Timesheet feature in Employee tab
    When i click on employee tab on dashboard
    Then user click on Supervisor timesheet
    Then user click on add non-billable hours
    Then user selects STDepartment
    Then user selects STTimeslot
    Then user enters  ST_Date
    Then user selects ST_from_time
    Then user selects ST_to_time
    Then user enters ST_Description
    Then user clicks on ST_save button

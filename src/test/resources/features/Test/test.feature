	@test
Feature: Create pest control residential opportunity for exiting user.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  @LocationsInventoryTermite
  Scenario: Test to Add Locations in Inventory Termite
  When user click on InventoryTermite
  Then user click on Locations_InventoryTermite
  Then user click on AddLoc_LocInventoryTermite
  Then user click on LocName_LocInventoryTermite
  Then user click on LocNo_LocInventoryTermite
  Then user click on LocType_LocInventoryTermite
  Then user click on Save_LocInventoryTermite
  
   @StaffEmpTermite
  Scenario: Test to Add Employee in Termite
    When user click on 	Emp_Termite
    Then user click on Staff_EmpTermite
    Then user click on AddEmp_StaffEmpTermite
    Then user click on DDBranch_StaffEmpTermite
    Then user click on DDDivison_StaffEmpTermite
    Then user click on DDdepartment_StaffEmpTermite
    Then user click on FName_StaffEmpTermite
    Then user click on LName_StaffEmpTermite
    Then user click on UserName_StaffEmpTermite
    Then user click on EmpType_StaffEmpTermite
    Then user click on DDRoleName_StaffEmpTermite
    Then user click on Save_StaffEmpTermite

  @TeamEmpTermite
  Scenario: Test to Add Team in Termite
    When user click on 	Emp_Termite
    Then user click on Team_EmpTermite
    Then user click on AddTeam_EmpTermite
    Then user click on DDBranch_TeamEmpTermite
    Then user click on Email_TeamEmpTermite
    Then user click on TeamName_TeamEmpTermite
    Then user click on DDDepartment_TeamEmpTermite
    Then user click on DDEmp_TeamEmpTermite
    Then user click on IsPrimary_TeamEmpTermite
    Then user click on PlusAction_TeamEmpTermite
    Then user click on Save_TeamEmpTermite

  @RouteEmpTermite
  Scenario: Test to Add Route in Termite
    When user click on 	Emp_Termite
    Then user click on Route_Termite
    Then user click on AddRoute_EmpTermite
    Then user click on Route_RouteEmpTermite
    Then user click on RouteName_RouteEmpTermite
    Then user click on DDBranch_RouteEmpTermite
    Then user click on DDLeadTech_RouteEmpTermite
    Then user click on Save_RouteEmpTermite

  @RouteOverrideEmpTermite
  Scenario: Test to Add RouteOverride in Termite
    When user click on 	Emp_Termite
    Then user click on RouteOverride_EmpTermite
    Then user click on AddRouteOverride_RouteOEmpTermite
    Then user click on DDRoute_RouteOEmpTermit
    Then user click on Save_RouteOEmpTermite

  @ClockInOutEmpTermite
  Scenario: Test to Add ClockInOu in Termite
    When user click on 	Emp_Termite
    Then user click on ClockInOut_EmpTermite
    Then user click on AddClock_ClockInOutEmpTermite
    Then user click on ClockOutTime_ClockInOutEmpTermite
    Then user click on Save_ClockInOutEmpTermite

  @LeaveManagementEmpTermite
  Scenario: Test to Add LeaveManagement in Termite
    When user click on 	Emp_Termite
    Then user click on LeaveManagement_EmpTermite
    Then user click on EditAction_LeaveManagTermite
    Then user click on DDLeaveType_LeaveManagTermite
    Then user click on DDStatus_LeaveManagTermite
    Then user click on Save_LeaveManagTermite

  @SupervisorTimeSheetEmpTermite
  Scenario: Test to Add Employee in Termite
    When user click on 	Emp_Termite
    Then user click on SupervisorTimeSheet_EmpTermite
    Then user click on AddNonBilableHours_SupervisorTimeSheetEmpTermite
    Then user click on DDDept_SupervisorTimeSheetEmpTermite
    Then user click on DDTimeSlot_SupervisorTimeSheetEmpTermite
    Then user click on Save_SupervisorTimeSheetEmpTermite

 
  
 
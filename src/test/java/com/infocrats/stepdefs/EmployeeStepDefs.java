package com.infocrats.stepdefs;

import com.infocrats.steps.EmployeeSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EmployeeStepDefs {

	@Steps
	EmployeeSteps employeesteps;

	@When("^i click on employee tab on dashboard$")
	public void i_click_on_employee_tab_on_dashboard() {
		employeesteps.employeeTab();
	}

	@Then("^i click on staff subtab of employee$")
	public void i_click_on_staff_subtab_of_employee() {
		employeesteps.staffTab();
	}

	@Then("^i click on Add Employee button$")
	public void i_click_on_Add_Employee_button() {
		employeesteps.addEmployeeBtn();
	}

	@Then("^i enter basic branch info$")
	public void i_enter_basic_branch_info() {
		employeesteps.basicBranchInfo();
	}

	@Then("^i enter personal info$")
	public void i_enter_personal_info() throws Exception {
		employeesteps.personalInfo();
	}

	@Then("^i choose employee type$")
	public void i_choose_employee_type() {
		employeesteps.employeeType();
	}

	@Then("^i choose role name$")
	public void i_choose_role_name() {
		employeesteps.roleName();
	}

	@Then("^i choose status$")
	public void i_choose_status() {
		employeesteps.employeeStatus();
	}

	@Then("^click on employee save Button$")
	public void click_on_employee_save_Button() {
		employeesteps.emplSvBtn();
	}

	@Then("^i click on team subtab of employee$")
	public void i_click_on_team_subtab_of_employee() {
		employeesteps.teamSubtab();
	}

	@Then("^i click on add team button$")
	public void i_click_on_add_team_button() {
		employeesteps.addTeam();
	}

	@Then("^get branch name from DDL$")
	public void get_branch_name_from_DDL() {
		employeesteps.branchName();
	}

	@Then("^i get mailID$")
	public void i_get_mailID() throws Exception {
		employeesteps.mailId();
	}

	@Then("^i get team name$")
	public void i_get_team_name() throws Exception {
		employeesteps.teamName();
	}

	@Then("^i get department from DDL$")
	public void i_get_department_from_DDL() {
		employeesteps.departName();
	}

	@Then("^i get employee from DDL$")
	public void i_get_employee_from_DDL() {
		employeesteps.emplName();
	}

	@Then("^click on IsPrimary check button$")
	public void click_on_IsPrimary_check_button() {
		employeesteps.isPrimary();
	}

	@Then("^click on Action button$")
	public void click_on_Action_button() {
		employeesteps.actionBtn();
	}

	@Then("^click on save button$")
	public void click_on_save_button() {
		employeesteps.teamSaveBtn();
	}

	@Then("^i click on route subtab of employee$")
	public void i_click_on_route_subtab_of_employee() {
		employeesteps.routeTab();
	}

	@Then("^i click on add route button$")
	public void i_click_on_add_route_button() {
		employeesteps.addRoute();
	}

	@Then("^enter route$")
	public void enter_route() throws Exception {
		employeesteps.enterRoute();
	}

	@Then("^enter route name$")
	public void enter_route_name() throws Exception {
		employeesteps.routeName();
	}

	@Then("^select lead technician$")
	public void select_lead_technician() {
		employeesteps.leadTechnician();
	}

	@Then("^enter description$")
	public void enter_description() throws Exception {
		employeesteps.description();
	}

	@Then("^user click on employeeType$")
	public void user_click_on_employeeType() {
		employeesteps.employeeTypePartTime();
	}

	@Then("^user clicks on DDReportingAuthority$")
	public void user_clicks_on_DDReportingAuthority() {
		employeesteps.DDReportingAuthority();
	}

	@Then("^i click on routeOverride$")
	public void i_click_on_routeOverride() {
		employeesteps.routeOverride();
	}

	@Then("^i click on addRouteOverride$")
	public void i_click_on_addRouteOverride() {
		employeesteps.addRouteOverride();
	}

	@Then("^i click on DDcrewTechnician$")
	public void i_click_on_DDcrewTechnician() {
		employeesteps.DDcrewTechnician();
	}

	@Then("^i click on save$")
	public void i_click_on_save() {
		employeesteps.save();
	}

	@Then("^user click on ClockInOutTab$")
	public void user_click_on_ClockInOutTab() {
		employeesteps.ClockInOutTab();
	}

	@Then("^user click on addClockInOut$")
	public void user_click_on_addClockInOut() {
		employeesteps.addClockInOut();
	}

	@Then("^user click on ClockInOutDate$")
	public void user_click_on_ClockInOutDate() {
		employeesteps.ClockInOutDate();
	}

	@Then("^user click on save$")
	public void user_click_on_save() {
		employeesteps.saveClock();
	}

	@Then("^user click on TimeOut$")
	public void user_click_on_TimeOut() {
		employeesteps.TimeOut();
	}

	@Then("^user click on ValueTimeOut$")
	public void user_click_on_ValueTimeOut() throws Exception {
		employeesteps.ValueTimeOut();
	}

	@Then("^user click on DDWorkingStatus$")
	public void user_click_on_DDWorkingStatus() {
		employeesteps.DDWorkingStatus();
	}

	@Then("^user click on Reason$")
	public void user_click_on_Reason() throws Exception {
		employeesteps.Reason();
	}

	@Then("^user click on leaveManagement$")
	public void user_click_on_leaveManagement() {
		employeesteps.leaveManagement();
	}

	@Then("^user click on Action$")
	public void user_click_on_Action() {
		employeesteps.Action();
	}

	@Then("^user click on DDLeaveType$")
	public void user_click_on_DDLeaveType() {
		employeesteps.DDLeaveType();
	}

	@Then("^user click on LMFromTime$")
	public void user_click_on_LMFromTime() throws Exception {
		employeesteps.LMFromTime();
	}

	@Then("^user click on LMToTime$")
	public void user_click_on_LMToTime() throws Exception {
		employeesteps.LMToTime();
	}

	@Then("^user click on DDStatus$")
	public void user_click_on_DDStatus() {
		employeesteps.DDStatus();
	}

	@Then("^user click on SaveLM$")
	public void user_click_on_SaveLM() {
		employeesteps.SaveLM();
	}

	@Then("^user click on DDLeaveTypeHalf$")
	public void user_click_on_DDLeaveTypeHalf() {
		employeesteps.DDLeaveTypeHalf();
	}

	@Then("^user click on DDLeaveTypeSick$")
	public void user_click_on_DDLeaveTypeSick() {
		employeesteps.DDLeaveTypeSick();
	}

	@Then("^user click on ToDateLM$")
	public void user_click_on_ToDateLM() {
		employeesteps.ToDateLM();
	}

	@Then("^user click on Employee timesheet$")
	public void user_click_on_Employee_timesheet() {

		employeesteps.Employee_timesheet();

	}

	@Then("^user click on non-billable hours$")
	public void user_click_on_non_billable_hours() {
		employeesteps.nonBillable_hours();
	}

	@Then("^user selects Department$")
	public void user_selects_Department() {
		employeesteps.department();
	}

	@Then("^user selects Time_slot$")
	public void user_selects_Time_slot() {
		employeesteps.time_slot();
	}

	@Then("^user enters Date$")
	public void user_enters_Date() {
		employeesteps.date();
	}

	@Then("^user selects from_time$")
	public void user_selects_from_time() throws Exception {
		employeesteps.from_time();
	}

	@Then("^user selects to_time$")
	public void user_selects_to_time() throws Exception {
		employeesteps.to_time();
	}

	@Then("^user enters Description$")
	public void user_enters_Description() throws Exception {
		employeesteps.emp_description();
	}

	@Then("^user clicks on save button$")
	public void user_clicks_on_save_button() {
		employeesteps.save_emp_timesheet();
	}

	@Then("^user click on Supervisor timesheet$")
	public void user_click_on_Supervisor_timesheet() {
		employeesteps.supervisor_Timesheet();
	}

	@Then("^user click on add non-billable hours$")
	public void user_click_on_add_non_billable_hours() {
		employeesteps.add_Nonbillablehours();
	}

	@Then("^user selects STDepartment$")
	public void user_selects_STDepartment() {
		employeesteps.stDepertment();

	}

	@Then("^user selects STTimeslot$")
	public void user_selects_STTimeslot() {
		employeesteps.stTimeslot();
	}

	@Then("^user selects employee type$")
	public void user_selects_employee_type() {
		employeesteps.employee_type();
	}

	@Then("^user enters  ST_Date$")
	public void user_enters_ST_Date() {
		employeesteps.ST_Date();
	}

	@Then("^user selects ST_from_time$")
	public void user_selects_ST_from_time() throws Exception {
		employeesteps.ST_from_time();
	}

	@Then("^user selects ST_to_time$")
	public void user_selects_ST_to_time() throws Exception {
		employeesteps.ST_to_time();
	}

	@Then("^user enters ST_Description$")
	public void user_enters_ST_Description() throws Exception {
		employeesteps.ST_Description();
	}

	@Then("^user clicks on ST_save button$")
	public void user_clicks_on_ST_save_button() {
		employeesteps.ST_Save();
	}
	
	@Then("^user click on Branch_StaffEmp$")
	public void user_click_on_Branch_StaffEmp() {
		employeesteps.Branch_StaffEmp();
	}

	@Then("^user click on Divison$")
	public void user_click_on_Divison() {
		employeesteps.Divison();
	}

	@Then("^user click on Department$")
	public void user_click_on_Department() {
		employeesteps.Department();
	}

	@Then("^user click on FName$")
	public void user_click_on_FName() throws Exception {
		employeesteps.FName();
	}

	@Then("^user click on LName$")
	public void user_click_on_LName() throws Exception {
		employeesteps.LName();
	}

	@Then("^user click on UserName$")
	public void user_click_on_UserName() throws Exception {
		employeesteps.UserName();
	}

	@Then("^user click on EmpType$")
	public void user_click_on_EmpType() {
		employeesteps.EmpType();
	}

	@Then("^user click on RoleName$")
	public void user_click_on_RoleName() {
		employeesteps.RoleName();
	}

	@Then("^user click on Save_StaffEmp$")
	public void user_click_on_Save_StaffEmp() {
		employeesteps.Save_StaffEmp();
	}
	

@Then("^user click on EmpTypeHalf$")
public void user_click_on_EmpTypeHalf() {
	employeesteps.EmpTypeHalf();
}




}

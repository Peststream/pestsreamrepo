package com.infocrats.steps;

import java.util.Map;

import com.infocrats.pageObjects.EmployeePage;
import com.infocrats.utils.JsonHelper;

import net.thucydides.core.annotations.Step;

public class EmployeeSteps {
	
	private Map<String, String> jsonData;
	
	EmployeePage employeepage;

	@Step
	public void employeeTab() throws Exception {
		
		employeepage.employee_tab();
		
	}

	@Step
	public void staffTab() throws Exception {
		employeepage.staff_tab();
		
	}

	@Step
	public void addEmployeeBtn() throws Exception {
		employeepage.addEmployee_btn();
		
	}

	@Step
	public void basicBranchInfo() throws Exception {
		employeepage.basicBranch_info();
		
	}

	@Step
	public void personalInfo() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "EmployeeDetails");
		employeepage.personal_info(jsonData);
		
	}

	@Step
	public void employeeType() throws Exception {
		employeepage.employee_type();
		
	}

	@Step
	public void roleName() throws Exception {
		employeepage.role_name();
		
	}

	@Step
	public void employeeStatus() {
		employeepage.employee_status();
		
	}

	@Step
	public void emplSvBtn() {
		employeepage.emplSv_btn();
		
	}

	@Step
	public void teamSubtab() throws Exception {
		employeepage.team_subtab();
		
	}

	@Step
	public void addTeam() throws Exception {
		employeepage.add_team();
		
	}

	@Step
	public void branchName() throws Exception {
		employeepage.branch_name();
		
	}

	@Step
	public void mailId() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "TeamDetails");
		employeepage.mail_id(jsonData);
		
	}

	@Step
	public void teamName() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "TeamDetails");
		employeepage.team_name(jsonData);
		
	}

	@Step
	public void departName() throws Exception {
	employeepage.depart_name();
		
	}

	@Step
	public void emplName() throws Exception {
		employeepage.empl_name();
		
	}

	@Step
	public void isPrimary() throws Exception {
		employeepage.is_primary();
		
	}

	@Step
	public void actionBtn() throws Exception {
		employeepage.action_btn();
		
	}

	@Step
	public void teamSaveBtn() {
		employeepage.teamSave_btn();
		
	}

	@Step
	public void routeTab() {
		employeepage.route_tab();
		
	}

	@Step
	public void addRoute() {
		employeepage.add_route();
		
	}

	@Step
	public void enterRoute() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "RouteDetails");
		employeepage.enter_route(jsonData);
		
	}

	@Step
	public void routeName() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "RouteDetails");
		employeepage.route_name(jsonData);
		
	}

	@Step
	public void leadTechnician() {
		employeepage.lead_technician();
		
	}

	@Step
	public void description() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "RouteDetails");
		employeepage.description(jsonData);
		
	}

	public void employeeTypePartTime() throws Exception {
		employeepage.employeeTypePartTime();
		
	}

	public void DDReportingAuthority() throws Exception {
		employeepage.DDReportingAuthority();
		
	}

	public void routeOverride() throws Exception {
		employeepage.routeOverride();
		
	}

	public void addRouteOverride() {
		employeepage.addRouteOverride();
		
	}

	public void DDcrewTechnician() {
		employeepage.DDcrewTechnician();
		
	}

	public void save() throws Exception {
		employeepage.save();
		
	}

	public void ClockInOutTab() throws Exception {
		employeepage.ClockInOutTab();
		
	}

	public void addClockInOut() throws Exception {
		employeepage.addClockInOut();
		
	}

	public void ClockInOutDate() throws Exception {
		employeepage.ClockInOutDate();
		
	}

	public void saveClock() throws Exception {
		employeepage.saveClock();
		
	}

	public void TimeOut() {
		employeepage.TimeOut();
		
	}

	public void ValueTimeOut() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "ClockInOut");
		employeepage.ValueTimeOut(jsonData);
		
	}

	public void DDWorkingStatus() throws Exception {
		employeepage.DDWorkingStatus();
		
	}

	public void Reason() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "ClockInOut");
		employeepage.Reason(jsonData);
		
	}

	public void leaveManagement() throws Exception {
		employeepage.leaveManagement();
		
	}

	public void Action() throws Exception {
		employeepage.Action();
		
	}

	public void DDLeaveType() throws Exception {
		employeepage.DDLeaveType();
		
	}

	public void DDStatus() throws Exception {
		employeepage.DDStatus();
		
	}

	public void SaveLM() throws Exception {
		employeepage.SaveLM();
		
	}

	public void DDLeaveTypeHalf() throws Exception {
		employeepage.DDLeaveTypeHalf();
		
	}

	public void DDLeaveTypeSick() throws Exception {
		employeepage.DDLeaveTypeSick();
		
	}

	public void ToDateLM() throws Exception {
		employeepage.ToDateLM();
		
	}

	public void Employee_timesheet() throws Exception {
		employeepage.Employee_timesheet();
	}

	public void nonBillable_hours() throws Exception {
		
		employeepage.nonBillable_hours();
	}

	public void department() throws Exception {
		employeepage.department();
		
	}

	public void time_slot() throws Exception {
		
		employeepage.time_slot();
	}

	public void date() throws Exception {
		employeepage.date();
	}

	public void from_time() throws Exception  {
		jsonData = JsonHelper.readJsonElement("call.json", "EmployeeTimesheet");
		employeepage.from_time(jsonData);
	}

	public void to_time() throws Exception {
		jsonData= JsonHelper.readJsonElement("call.json", "EmployeeTimesheet");
		employeepage.to_time(jsonData);
		
	}

	public void emp_description() throws Exception {
		jsonData= JsonHelper.readJsonElement("call.json", "EmployeeTimesheet");
		employeepage.emp_description(jsonData);
	}

	public void save_emp_timesheet() throws Exception {
		employeepage.save_emp_timesheet();
	}

	public void supervisor_Timesheet() {
		employeepage.supervisor_Timesheet();
		
	}

	public void add_Nonbillablehours() {
		employeepage.add_Nonbillablehours();
		
	}

	public void stDepertment() throws Exception {
		employeepage.stDepartment();
	}

	public void stTimeslot() throws Exception {
	employeepage.stTimeslot();
		
	}

	public void employee_type() throws Exception {
		employeepage.employee_type();
	}
	
	public void ST_Date() throws Exception {
		employeepage.ST_date();
	}


	public void ST_from_time() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "SupervisorTimesheet");
		employeepage.ST_from_time(jsonData);	
	}

	public void ST_to_time() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "SupervisorTimesheet");
		employeepage.ST_to_time(jsonData);
	}

	public void ST_Description() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "SupervisorTimesheet");
		employeepage.ST_Description(jsonData);
		
	}

	public void ST_Save() {
		employeepage.ST_save();
		
	}

	public void LMFromTime() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "LeaveManagement");
		employeepage.LMFromTime(jsonData);
	
	}

	public void LMToTime() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "LeaveManagement");
		employeepage.LMToTime(jsonData);
	
	}

	public void Branch_StaffEmp() throws Exception {
		employeepage.Branch_StaffEmp();
		
	}

	public void Divison() throws Exception {
		employeepage.Divison();
		
	}

	public void Department() throws Exception {
		employeepage.Department();
		
	}

	public void FName() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "EmployeeData");
		employeepage.FName(jsonData);
		
	}

	public void LName() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "EmployeeData");
		employeepage.LName(jsonData);
		
	}

	public void UserName() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "EmployeeData");
		employeepage.Username(jsonData);
		
	}

	public void EmpType() throws Exception {
		employeepage.EmpType();
		
	}

	public void RoleName() throws Exception {
		employeepage.RoleName();
		
	}

	public void Save_StaffEmp() throws Exception {
		employeepage.Save_StaffEmp();
		
	}

	public void EmpTypeHalf() throws Exception {
		employeepage.EmpTypeHalf();
		
	}

	public void Branch_RouteEmployee() throws Exception {
		employeepage.Branch_RouteEmployee();
		
	}

	

}

















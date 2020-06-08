package com.infocrats.steps;

import java.util.Map;

import com.infocrats.pageObjects.EmployeePage;
import com.infocrats.utils.JsonHelper;

import net.thucydides.core.annotations.Step;

public class EmployeeSteps {
	
	private Map<String, String> jsonData;
	
	EmployeePage employeepage;

	@Step
	public void employeeTab() {
		
		employeepage.employee_tab();
		
	}

	@Step
	public void staffTab() {
		employeepage.staff_tab();
		
	}

	@Step
	public void addEmployeeBtn() {
		employeepage.addEmployee_btn();
		
	}

	@Step
	public void basicBranchInfo() {
		employeepage.basicBranch_info();
		
	}

	@Step
	public void personalInfo() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "EmployeeDetails");
		employeepage.personal_info(jsonData);
		
	}

	@Step
	public void employeeType() {
		employeepage.employee_type();
		
	}

	@Step
	public void roleName() {
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
	public void teamSubtab() {
		employeepage.team_subtab();
		
	}

	@Step
	public void addTeam() {
		employeepage.add_team();
		
	}

	@Step
	public void branchName() {
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
	public void departName() {
	employeepage.depart_name();
		
	}

	@Step
	public void emplName() {
		employeepage.empl_name();
		
	}

	@Step
	public void isPrimary() {
		employeepage.is_primary();
		
	}

	@Step
	public void actionBtn() {
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

	public void employeeTypePartTime() {
		employeepage.employeeTypePartTime();
		
	}

	public void DDReportingAuthority() {
		employeepage.DDReportingAuthority();
		
	}

	public void routeOverride() {
		employeepage.routeOverride();
		
	}

	public void addRouteOverride() {
		employeepage.addRouteOverride();
		
	}

	public void DDcrewTechnician() {
		employeepage.DDcrewTechnician();
		
	}

	public void save() {
		employeepage.save();
		
	}

	public void ClockInOutTab() {
		employeepage.ClockInOutTab();
		
	}

	public void addClockInOut() {
		employeepage.addClockInOut();
		
	}

	public void ClockInOutDate() {
		employeepage.ClockInOutDate();
		
	}

	public void saveClock() {
		employeepage.saveClock();
		
	}

	public void TimeOut() {
		employeepage.TimeOut();
		
	}

	public void ValueTimeOut() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "ClockInOut");
		employeepage.ValueTimeOut(jsonData);
		
	}

	public void DDWorkingStatus() {
		employeepage.DDWorkingStatus();
		
	}

	public void Reason() throws Exception {
		jsonData = JsonHelper.readJsonElement("call.json", "ClockInOut");
		employeepage.Reason(jsonData);
		
	}

	public void leaveManagement() {
		employeepage.leaveManagement();
		
	}

	public void Action() {
		employeepage.Action();
		
	}

	public void DDLeaveType() {
		employeepage.DDLeaveType();
		
	}

	public void DDStatus() {
		employeepage.DDStatus();
		
	}

	public void SaveLM() {
		employeepage.SaveLM();
		
	}

	public void DDLeaveTypeHalf() {
		employeepage.DDLeaveTypeHalf();
		
	}

	public void DDLeaveTypeSick() {
		employeepage.DDLeaveTypeSick();
		
	}

	public void ToDateLM() {
		employeepage.ToDateLM();
		
	}

	public void Employee_timesheet() {
		employeepage.Employee_timesheet();
	}

	public void nonBillable_hours() {
		
		employeepage.nonBillable_hours();
	}

	public void department() {
		employeepage.department();
		
	}

	public void time_slot() {
		
		employeepage.time_slot();
	}

	public void date() {
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

	public void save_emp_timesheet() {
		employeepage.save_emp_timesheet();
	}

	public void supervisor_Timesheet() {
		employeepage.supervisor_Timesheet();
		
	}

	public void add_Nonbillablehours() {
		employeepage.add_Nonbillablehours();
		
	}

	public void stDepertment() {
		employeepage.stDepartment();
	}

	public void stTimeslot() {
	employeepage.stTimeslot();
		
	}

	public void employee_type() {
		employeepage.employee_type();
	}
	
	public void ST_Date() {
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

	public void Branch_StaffEmp() {
		employeepage.Branch_StaffEmp();
		
	}

	public void Divison() {
		employeepage.Divison();
		
	}

	public void Department() {
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

	public void EmpType() {
		employeepage.EmpType();
		
	}

	public void RoleName() {
		employeepage.RoleName();
		
	}

	public void Save_StaffEmp() {
		employeepage.Save_StaffEmp();
		
	}

	public void EmpTypeHalf() {
		employeepage.EmpTypeHalf();
		
	}


}

















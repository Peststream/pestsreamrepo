package com.infocrats.steps;

import java.util.Map;

import com.infocrats.pageObjects.TermiteEmployeePage;
import com.infocrats.utils.JsonHelper;

import net.thucydides.core.annotations.Steps;

public class TermiteEmployeeSteps extends pestreamSteps {
	
	private Map<String, String> jsonData;

	@Steps
	TermiteEmployeePage termiteemployeepage;

	public void clickon_Emp_Termite() {
		termiteemployeepage.clickon_Emp_Termite();
	}

	public void clickon_Staff_EmpTermite() {
		termiteemployeepage.clickon_Staff_EmpTermite();
	}

	public void clickon_AddEmp_StaffEmpTermite() {
		termiteemployeepage.clickon_AddEmp_StaffEmpTermite();
	}

	public void clickon_DDBranch_StaffEmpTermite() {
		termiteemployeepage.clickon_DDBranch_StaffEmpTermite();
	}

	public void clickon_DDDivison_StaffEmpTermite() {
		termiteemployeepage.clickon_DDDivison_StaffEmpTermite();
	}

	public void clickon_DDdepartment_StaffEmpTermite() {
		termiteemployeepage.clickon_DDdepartment_StaffEmpTermite();
	}

	public void clickon_FName_StaffEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Staff_Employee");
		termiteemployeepage.clickon_FName_StaffEmpTermite(jsonData);
	}

	public void clickon_LName_StaffEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Staff_Employee");
		termiteemployeepage.clickon_LName_StaffEmpTermite(jsonData);
	}

	public void clickon_UserName_StaffEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Staff_Employee");
		termiteemployeepage.clickon_UserName_StaffEmpTermite(jsonData);
	}

	public void clickon_EmpType_StaffEmpTermite() {
		termiteemployeepage.clickon_EmpType_StaffEmpTermite();
	}

	public void clickon_DDRoleName_StaffEmpTermite() {
		termiteemployeepage.clickon_DDRoleName_StaffEmpTermite();
	}

	public void clickon_Save_StaffEmpTermite() {
		termiteemployeepage.clickon_Save_StaffEmpTermite();
	}

	public void clickon_Team_EmpTermite() {
		termiteemployeepage.clickon_Team_EmpTermite();
	}

	public void clickon_AddTeam_EmpTermite() {
		termiteemployeepage.clickon_AddTeam_EmpTermite();
	}

	public void clickon_DDBranch_TeamEmpTermite() {
		termiteemployeepage.clickon_DDBranch_TeamEmpTermite();
	}

	public void clickon_Email_TeamEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Team_Employee");
		termiteemployeepage.clickon_Email_TeamEmpTermite(jsonData);
	}

	public void clickon_TeamName_TeamEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Team_Employee");
		termiteemployeepage.clickon_TeamName_TeamEmpTermite(jsonData);
	}

	public void clickon_Save_TeamEmpTermite() {
		termiteemployeepage.clickon_Save_TeamEmpTermite();
	}

	public void clickon_DDDepartment_TeamEmpTermite() {
		termiteemployeepage.clickon_DDDepartment_TeamEmpTermite();
		
	}

	public void clickon_DDEmp_TeamEmpTermite() {
		termiteemployeepage.clickon_DDEmp_TeamEmpTermite();
	}

	public void clickon_IsPrimary_TeamEmpTermite() {
		termiteemployeepage.clickon_IsPrimary_TeamEmpTermite();
	}

	public void clickon_PlusAction_TeamEmpTermite() {
		termiteemployeepage.clickon_PlusAction_TeamEmpTermite();
	}

	public void clickon_Route_Termite() {
		termiteemployeepage.clickon_Route_Termite();
	}

	public void clickon_AddRoute_EmpTermite() {
		termiteemployeepage.clickon_AddRoute_EmpTermite();
	}

	public void clickon_Route_RouteEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Route_Employee");
		termiteemployeepage.clickon_Route_RouteEmpTermite(jsonData);
	}

	public void clickon_RouteName_RouteEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Route_Employee");
		termiteemployeepage.clickon_RouteName_RouteEmpTermite(jsonData);
	}

	public void clickon_DDLeadTech_RouteEmpTermite() {
		termiteemployeepage.clickon_DDLeadTech_RouteEmpTermite();
	}

	public void clickon_Save_RouteEmpTermite() {
		termiteemployeepage.clickon_Save_RouteEmpTermite();
	}

	public void clickon_DDBranch_RouteEmpTermite() {
		termiteemployeepage.clickon_DDBranch_RouteEmpTermite();
	}

	public void clickon_RouteOverride_EmpTermite() {
		termiteemployeepage.clickon_RouteOverride_EmpTermite();
		
	}

	public void clickon_AddRouteOverride_RouteOEmpTermite() {
		termiteemployeepage.clickon_AddRouteOverride_RouteOEmpTermite();
		
	}

	public void clickon_DDRoute_RouteOEmpTermite() {
		termiteemployeepage.clickon_DDRoute_RouteOEmpTermite();
		
	}

	public void clickon_Save_RouteOEmpTermite() {
		termiteemployeepage.clickon_Save_RouteOEmpTermite();
		
	}

	public void clickon_ClockInOut_EmpTermite() {
		termiteemployeepage.clickon_ClockInOut_EmpTermite();
	}

	public void clickon_AddClock_ClockInOutEmpTermite() {
		termiteemployeepage.clickon_AddClock_ClockInOutEmpTermite();
	}

	public void clickon_ClockOutTime_ClockInOutEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Route_Employee");
		termiteemployeepage.clickon_ClockOutTime_ClockInOutEmpTermite(jsonData);
	}

	public void clickon_Save_ClockInOutEmpTermite() {
		termiteemployeepage.clickon_Save_ClockInOutEmpTermite();
	}

	public void clickon_AdvanceSearch_StaffEmpTermite() {
		termiteemployeepage.clickon_AdvanceSearch_StaffEmpTermite();
	}

	public void clickon_EditAction_AdSearchStaffEmpTermite() {
		termiteemployeepage.clickon_EditAction_AdSearchStaffEmpTermite();
	}

	public void clickon_DDBranch_EditAdSearchStaffEmpTermite() {
		termiteemployeepage.clickon_DDBranch_EditAdSearchStaffEmpTermite();
	}

	public void clickon_DDDivison_EditAdSearchStaffEmpTermite() {
		termiteemployeepage.clickon_DDDivison_EditAdSearchStaffEmpTermite();
	}

	public void clickon_DDDept_EditAdSearchStaffEmpTermite() {
		termiteemployeepage.clickon_DDDept_EditAdSearchStaffEmpTermite();
	}

	public void clickon_DDStartLoc_EditAdSearchStaffEmpTermite() {
		termiteemployeepage.clickon_DDStartLoc_EditAdSearchStaffEmpTermite();
	}

	public void clickon_Save_EditAdSearchStaffEmpTermite() {
		termiteemployeepage.clickon_Save_EditAdSearchStaffEmpTermite();
	}

	public void clickon_ActiveAction_AdSearchStaffEmpTermite() {
		termiteemployeepage.clickon_ActiveAction_AdSearchStaffEmpTermite();
	}

	public void clickon_No_ActiveAdSearchStaffEmpTermite() {
		termiteemployeepage.clickon_No_ActiveAdSearchStaffEmpTermite();
	}

	public void clickon_LeaveManagement_EmpTermite() {
		termiteemployeepage.clickon_LeaveManagement_EmpTermite();
	}

	public void clickon_EditAction_LeaveManagTermite() {
		termiteemployeepage.clickon_EditAction_LeaveManagTermite();
	}

	public void clickon_DDLeaveType_LeaveManagTermite() {
		termiteemployeepage.clickon_DDLeaveType_LeaveManagTermite();
	}

	public void clickon_DDStatus_LeaveManagTermite() {
		termiteemployeepage.clickon_DDStatus_LeaveManagTermite();
	}

	public void clickon_Save_LeaveManagTermite() {
		termiteemployeepage.clickon_Save_LeaveManagTermite();
	}

	public void clickon_SupervisorTimeSheet_EmpTermite() {
		termiteemployeepage.clickon_SupervisorTimeSheet_EmpTermite();
		
	}

	public void clickon_AddNonBilableHours_SupervisorTimeSheetEmpTermite() {
		termiteemployeepage.clickon_AddNonBilableHours_SupervisorTimeSheetEmpTermite();
		
	}

	public void clickon_DDDept_SupervisorTimeSheetEmpTermite() {
		termiteemployeepage.clickon_DDDept_SupervisorTimeSheetEmpTermite();
		
	}

	public void clickon_DDTimeSlot_SupervisorTimeSheetEmpTermite() {
		termiteemployeepage.clickon_DDTimeSlot_SupervisorTimeSheetEmpTermite();
		
	}

	public void clickon_Save_SupervisorTimeSheetEmpTermite() {
		termiteemployeepage.clickon_Save_SupervisorTimeSheetEmpTermite();
	}

	public void select_DDRoute_RouteOEmpTermit() {
		termiteemployeepage.select_DDRoute_RouteOEmpTermit();
		
	}

}

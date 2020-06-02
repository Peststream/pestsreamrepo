package com.infocrats.pageObjects;

import java.util.Map;

import com.infocrats.utils.BaseUtills;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TermiteEmployeePage extends peststreamPage {
	BaseUtills utills = new BaseUtills();
	
	@FindBy(xpath = "(//span[contains(.,'Employee')])[1]")
	private WebElementFacade EmpTermite;
	
	@FindBy(xpath = "//span[contains(text(),'Staff')]")
	private WebElementFacade Staff_EmpTermite;
	
	@FindBy(xpath = "//span[contains(text(),'Add Employee')]")
	private WebElementFacade AddEmpStaffEmpTermite;
	
	@FindBy(xpath = "//div[@id='s2id_EmployeeControlThreeCol_BranchMasterId']//b")
	private WebElementFacade DDBranchStaffEmpTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[7]")
	private WebElementFacade ValueDDBranchStaffEmpTermite;
	
	@FindBy(xpath = "//div[@id='s2id_ddlDivisionMasterId']//b")
	private WebElementFacade DDDivisonStaffEmpTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade ValueDDDivisonStaffEmpTermite;
	
	@FindBy(xpath = "//div[@id='s2id_ddlDepartmentMasterId']//b")
	private WebElementFacade DDdepartmentStaffEmpTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade ValueDDdepartmentStaffEmpTermite;
	
	@FindBy(xpath = "(//input[@placeholder='First Name'])[2]")
	private WebElementFacade FNameStaffEmpTermite;
	
	@FindBy(xpath = "(//input[@placeholder='Last Name'])[2]")
	private WebElementFacade LNameStaffEmpTermite;
	
	@FindBy(xpath = "(//input[@id='UserName'])[2]")
	private WebElementFacade UserNameStaffEmpTermite;
	
	@FindBy(xpath = "//div[@id='s2id_EmployeeTypeId']//b")
	private WebElementFacade DDEmpTypeStaffEmpTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade ValueEmpTypeStaffEmpTermite;
	
	@FindBy(xpath = "(//span[contains(.,'--Select--')])[17]")
	private WebElementFacade DDRoleNameStaffEmpTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade ValueDDRoleNameStaffEmpTermite;
	
	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade SaveStaffEmpTermite;
	
	@FindBy(xpath = "//span[contains(text(),'Team')]")
	private WebElementFacade TeamEmpTermite;
	
	@FindBy(xpath = "//span[contains(text(),'Add Team')]")
	private WebElementFacade AddTeamEmpTermite;
	
	@FindBy(xpath = "//div[@id='s2id_ddlBranchId']//b")
	private WebElementFacade DDBranchTeamEmpTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[7]")
	private WebElementFacade ValueDDBranchTeamEmpTermite;
	
	@FindBy(xpath = "//input[@id='PrimaryEmail']")
	private WebElementFacade EmailTeamEmpTermite;
	
	@FindBy(xpath = "//input[@id='TeamName']")
	private WebElementFacade TeamNameTeamEmpTermite;
	
	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade SaveTeamEmpTermite;
	
	@FindBy(xpath = "//div[@id='s2id_DepartSysName']//b")
	private WebElementFacade DDDepartmentTeamEmpTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[3]")
	private WebElementFacade ValueDDDepartmentTeamEmpTermite;
	
	@FindBy(xpath = "//div[@id='s2id_ddlEmployeeId']//b")
	private WebElementFacade DDEmpTeamEmpTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade ValueDDEmpTeamEmpTermite;
	
	@FindBy(xpath = "//input[@id='IsPrimary']")
	private WebElementFacade IsPrimaryTeamEmpTermite;
	
	@FindBy(xpath = "//a[@class='btn btn-primary btnAddEmp']")
	private WebElementFacade PlusActionTeamEmpTermite;
	
	@FindBy(xpath = "(//span[contains(.,'Route')])[1]")
	private WebElementFacade RouteTermite;
	
	@FindBy(xpath = "//span[contains(text(),'Add Route')]")
	private WebElementFacade AddRouteEmpTermite;
	
	@FindBy(xpath = "//input[@id='RouteNo']")
	private WebElementFacade RouteRouteEmpTermite;
	
	@FindBy(xpath = "//input[@id='RouteName']")
	private WebElementFacade RouteNameRouteEmpTermite;
	
	@FindBy(xpath = "//div[@id='s2id_LeadTechEmployeeNo']//b")
	private WebElementFacade DDLeadTechRouteEmpTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[3]")
	private WebElementFacade ValueDDLeadTechRouteEmpTermite;
	
	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade SaveRouteEmpTermite;
	
	@FindBy(xpath = "(//*[@id='s2id_BranchId'])[2]")
	private WebElementFacade DDBranchRouteEmpTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[7]")
	private WebElementFacade ValueDDBranchRouteEmpTermite;
	
	@FindBy(xpath = "//span[@class='title'][contains(text(),'Route Override')]")
	private WebElementFacade RouteOverrideEmpTermite;
	
	@FindBy(xpath = "//span[contains(text(),'Add Route Override')]")
	private WebElementFacade AddRouteOverrideRouteOEmpTermite;
	
	@FindBy(xpath = "//select[@id='ddlRoute']")
	private WebElementFacade DDRouteRouteOEmpTermite;
	
	@FindBy(xpath = "//option[contains(text(),'Termite (Sarita S R)')]")
	private WebElementFacade ValueDDRouteRouteOEmpTermite;
	
	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade SaveRouteOEmpTermite;
	
	@FindBy(xpath = "//span[@class='title'][contains(text(),'Clock In-Out')]")
	private WebElementFacade ClockInOutEmpTermite;
	
	@FindBy(xpath = "//span[contains(text(),'Add Clock In-Out')]")
	private WebElementFacade AddClockClockInOutEmpTermite;
	
	@FindBy(xpath = "//input[@id='TimeOutStr']")
	private WebElementFacade ClockOutTimeClockInOutEmpTermite;
	
	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade SaveClockInOutEmpTermite;
	
	@FindBy(xpath = "//button[@id='btnAdvanceSearchEmployee']")
	private WebElementFacade AdvanceSearchStaffEmpTermite;
	
	@FindBy(xpath = "(//a[@title='Edit'])[3]")
	private WebElementFacade EditActionAdSearchStaffEmpTermite;
	
	@FindBy(xpath = "//div[@id='s2id_EmployeeControlThreeCol_BranchMasterId']//b")
	private WebElementFacade DDBranchEditAdSearchStaffEmpTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[7]")
	private WebElementFacade ValueDDBranchEditAdSearchStaffEmpTermite;
	
	@FindBy(xpath = "//div[@id='s2id_ddlDivisionMasterId']//b")
	private WebElementFacade DDDivisonEditAdSearchStaffEmpTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade ValueDDDivisonEditAdSearchStaffEmpTermite;
	
	@FindBy(xpath = "//div[@id='s2id_ddlDepartmentMasterId']//b")
	private WebElementFacade DDDeptEditAdSearchStaffEmpTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade ValueDDDeptEditAdSearchStaffEmpTermite;
	
	@FindBy(xpath = "//div[@id='s2id_StartLocation']//b")
	private WebElementFacade DDStartLocEditAdSearchStaffEmpTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade ValueDDStartLocEditAdSearchStaffEmpTermite;
	
	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade SaveEditAdSearchStaffEmpTermite;
	
	@FindBy(xpath = "(//a[contains(@title,'IsActive')])[1]")
	private WebElementFacade ActiveActionAdSearchStaffEmpTermite;
	
	@FindBy(xpath = "//button[@class='btn default btnDeleteAlertNo']")
	private WebElementFacade NoActiveAdSearchStaffEmpTermite;
	
	@FindBy(xpath = "//span[contains(text(),'Leave Management')]")
	private WebElementFacade LeaveManagement_EmpTermite;
	
	@FindBy(xpath = "(//a[@title='Edit'])[1]")
	private WebElementFacade EditActionLeaveManagTermite;
	
	@FindBy(xpath = "//div[@id='s2id_LeaveType']//b")
	private WebElementFacade DDLeaveTypeLeaveManagTermite;
	
	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[4]")
	private WebElementFacade ValueDDLeaveTypeLeaveManagTermite;
	
	@FindBy(xpath = "//select[@id='Status']")
	private WebElementFacade DDStatusLeaveManagTermite;
	
	@FindBy(xpath = "//option[contains(text(),'Approved')]")
	private WebElementFacade ValueDDStatusLeaveManagTermite;
	
	@FindBy(xpath = "(//button[contains(.,'Save')])[1]")
	private WebElementFacade SaveLeaveManagTermite;
	
	@FindBy(xpath = "//span[contains(text(),'Supervisor Time Sheet')]")
	private WebElementFacade SupervisorTimeSheetEmpTermite;
	
	@FindBy(xpath = "//span[contains(.,'Add Non-Billable Hours')]")
	private WebElementFacade AddNonBilableHoursSupervisorTimeSheetEmpTermite;
	
	@FindBy(xpath = "//select[@id='DepartmentSysName']")
	private WebElementFacade DDDeptSupervisorTimeSheetEmpTermite;
	
	@FindBy(xpath = "//select[@id='DepartmentSysName']//option[contains(text(),'Mech')]")
	private WebElementFacade ValueDDDeptSupervisorTimeSheetEmpTermite;
	
	@FindBy(xpath = "//select[@id='TimeSlot']")
	private WebElementFacade DDTimeSlotSupervisorTimeSheetEmpTermite;
	
	@FindBy(xpath = "//option[contains(text(),'Regular')]")
	private WebElementFacade ValueDDTimeSlotSupervisorTimeSheetEmpTermite;
	
	
	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade SaveSupervisorTimeSheetEmpTermite;
	
	@FindBy(xpath = "//select[@id='ddlRoute']")
	private WebElementFacade select_DDRoute_RouteOEmpTermit;
	
	@FindBy(xpath = "//option[contains(text(),'Termite (Sarita S R)')]")
	private WebElementFacade Value_select_DDRoute_RouteOEmpTermit;
	
	
	

	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}
	

	public void clickon_Emp_Termite() {
		EmpTermite.click();
		waitABit(1000);
	}

	public void clickon_Staff_EmpTermite() {
		Staff_EmpTermite.click();
		waitABit(1000);
	}

	public void clickon_AddEmp_StaffEmpTermite() {
		AddEmpStaffEmpTermite.click();
		waitABit(1000);
	}

	public void clickon_DDBranch_StaffEmpTermite() {
		DDBranchStaffEmpTermite.click();
		waitABit(1000);
		
		ValueDDBranchStaffEmpTermite.click();
		waitABit(1000);
	}

	public void clickon_DDDivison_StaffEmpTermite() {
		DDDivisonStaffEmpTermite.click();
		waitABit(1000);
		
		ValueDDDivisonStaffEmpTermite.click();
		waitABit(1000);
	}

	public void clickon_DDdepartment_StaffEmpTermite() {
		DDdepartmentStaffEmpTermite.click();
		waitABit(1000);
		
		ValueDDdepartmentStaffEmpTermite.click();
		waitABit(1000);
	}

	public void clickon_FName_StaffEmpTermite(Map<String, String> testData) {
		FNameStaffEmpTermite.sendKeys(testData.get("FirstName"));
		waitABit(1000);
	}

	public void clickon_LName_StaffEmpTermite(Map<String, String> testData) {
		LNameStaffEmpTermite.sendKeys(testData.get("LastName"));
		waitABit(1000);
	}

	public void clickon_UserName_StaffEmpTermite(Map<String, String> testData) {
		UserNameStaffEmpTermite.sendKeys(testData.get("UserName"));
		waitABit(1000);
	}

	public void clickon_EmpType_StaffEmpTermite() {
		DDEmpTypeStaffEmpTermite.click();
		waitABit(1000);
		
		ValueEmpTypeStaffEmpTermite.click();
		waitABit(1000);
	}

	public void clickon_DDRoleName_StaffEmpTermite() {
		DDRoleNameStaffEmpTermite.click();
		waitABit(1000);
		
		ValueDDRoleNameStaffEmpTermite.click();
		waitABit(1000);
	}

	public void clickon_Save_StaffEmpTermite() {
		SaveStaffEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_Team_EmpTermite() {
		TeamEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_DDBranch_TeamEmpTermite() {
		DDBranchTeamEmpTermite.click();
		waitABit(1000);
		
		ValueDDBranchTeamEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_Email_TeamEmpTermite(Map<String, String> testData) {
		EmailTeamEmpTermite.sendKeys(testData.get("Email"));
		waitABit(1000);
	}


	public void clickon_TeamName_TeamEmpTermite(Map<String, String> testData) {
		TeamNameTeamEmpTermite.sendKeys(testData.get("TeamName"));
		waitABit(1000);
	}


	public void clickon_Save_TeamEmpTermite() {
		SaveTeamEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_AddTeam_EmpTermite() {
		AddTeamEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_DDDepartment_TeamEmpTermite() {
		DDDepartmentTeamEmpTermite.click();
		waitABit(1000);
		
		ValueDDDepartmentTeamEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_DDEmp_TeamEmpTermite() {
		DDEmpTeamEmpTermite.click();
		waitABit(1000);
		
		ValueDDEmpTeamEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_IsPrimary_TeamEmpTermite() {
		IsPrimaryTeamEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_PlusAction_TeamEmpTermite() {
		PlusActionTeamEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_Route_Termite() {
		RouteTermite.click();
		waitABit(2000);
	}


	public void clickon_AddRoute_EmpTermite() {
		AddRouteEmpTermite.click();
		waitABit(3000);
	}


	public void clickon_Route_RouteEmpTermite(Map<String, String> testData) {
		RouteRouteEmpTermite.sendKeys(testData.get("Route"));
		waitABit(1000);
	}


	public void clickon_RouteName_RouteEmpTermite(Map<String, String> testData) {
		RouteNameRouteEmpTermite.sendKeys(testData.get("RouteName"));
		waitABit(1000);
	}


	public void clickon_DDLeadTech_RouteEmpTermite() {
	    DDLeadTechRouteEmpTermite.click();
		waitABit(1000);
		
		ValueDDLeadTechRouteEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_Save_RouteEmpTermite() {
		SaveRouteEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_DDBranch_RouteEmpTermite() {
		DDBranchRouteEmpTermite.click();
		waitABit(1000);
		
		ValueDDBranchRouteEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_RouteOverride_EmpTermite() {
		RouteOverrideEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_AddRouteOverride_RouteOEmpTermite() {
		AddRouteOverrideRouteOEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_DDRoute_RouteOEmpTermite() {
		DDRouteRouteOEmpTermite.click();
		waitABit(1000);
		
		ValueDDRouteRouteOEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_Save_RouteOEmpTermite() {
	    SaveRouteOEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_ClockInOut_EmpTermite() {
		ClockInOutEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_AddClock_ClockInOutEmpTermite() {
		AddClockClockInOutEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_ClockOutTime_ClockInOutEmpTermite(Map<String, String> testData) {
		ClockOutTimeClockInOutEmpTermite.sendKeys(testData.get("ClockOut"));
	    waitABit(1000);
	}


	public void clickon_Save_ClockInOutEmpTermite() {
		SaveClockInOutEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_AdvanceSearch_StaffEmpTermite() {
		AdvanceSearchStaffEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_EditAction_AdSearchStaffEmpTermite() {
		EditActionAdSearchStaffEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_DDBranch_EditAdSearchStaffEmpTermite() {
		DDBranchEditAdSearchStaffEmpTermite.click();
		waitABit(1000);
		
		ValueDDBranchEditAdSearchStaffEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_DDDivison_EditAdSearchStaffEmpTermite() {
		DDDivisonEditAdSearchStaffEmpTermite.click();
		waitABit(1000);
		
		ValueDDDivisonEditAdSearchStaffEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_DDDept_EditAdSearchStaffEmpTermite() {
		DDDeptEditAdSearchStaffEmpTermite.click();
		waitABit(1000);
		
		ValueDDDeptEditAdSearchStaffEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_DDStartLoc_EditAdSearchStaffEmpTermite() {
		DDStartLocEditAdSearchStaffEmpTermite.click();
		waitABit(1000);
		
		ValueDDStartLocEditAdSearchStaffEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_Save_EditAdSearchStaffEmpTermite() {
		SaveEditAdSearchStaffEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_ActiveAction_AdSearchStaffEmpTermite() {
		ActiveActionAdSearchStaffEmpTermite.click();
		waitABit(1000);
		
	}


	public void clickon_No_ActiveAdSearchStaffEmpTermite() {
		NoActiveAdSearchStaffEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_LeaveManagement_EmpTermite() {
		LeaveManagement_EmpTermite.click();
		waitABit(1000);
	}


	public void clickon_EditAction_LeaveManagTermite() {
		EditActionLeaveManagTermite.click();
		waitABit(1000);
	}


	public void clickon_DDLeaveType_LeaveManagTermite() {
		DDLeaveTypeLeaveManagTermite.click();
		waitABit(1000);
		
		ValueDDLeaveTypeLeaveManagTermite.click();
		waitABit(1000);
	}


	public void clickon_DDStatus_LeaveManagTermite() {
		DDStatusLeaveManagTermite.click();
		waitABit(1000);
		
		ValueDDStatusLeaveManagTermite.click();
		waitABit(1000);
	}


	public void clickon_Save_LeaveManagTermite() {
		SaveLeaveManagTermite.click();
		waitABit(1000);
	}


	public void clickon_SupervisorTimeSheet_EmpTermite() {
		SupervisorTimeSheetEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_AddNonBilableHours_SupervisorTimeSheetEmpTermite() {
		AddNonBilableHoursSupervisorTimeSheetEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_DDDept_SupervisorTimeSheetEmpTermite() {
		DDDeptSupervisorTimeSheetEmpTermite.click();
		waitABit(1000);
		
		ValueDDDeptSupervisorTimeSheetEmpTermite.click();
		waitABit(1000);
	}


	public void clickon_DDTimeSlot_SupervisorTimeSheetEmpTermite() {
		DDTimeSlotSupervisorTimeSheetEmpTermite.click();
		waitABit(1000);
		
		ValueDDTimeSlotSupervisorTimeSheetEmpTermite.click();
		waitABit(1000);
	}

	public void clickon_Save_SupervisorTimeSheetEmpTermite() {
		SaveSupervisorTimeSheetEmpTermite.click();
		waitABit(1000);
	}


	public void select_DDRoute_RouteOEmpTermit() {
		select_DDRoute_RouteOEmpTermit.click();
		waitABit(2000);
		
		Value_select_DDRoute_RouteOEmpTermit.click();
		waitABit(1000);
	}
	

}

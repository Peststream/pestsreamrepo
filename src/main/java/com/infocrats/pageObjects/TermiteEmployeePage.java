package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.JsonHelper;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TermiteEmployeePage extends peststreamPage {
	BaseUtills utills = new BaseUtills();
	private Map<String, Integer> jsonData;

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

	public void clickon_Emp_Termite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(EmpTermite));
		EmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_Staff_EmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Staff_EmpTermite));

		Staff_EmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_AddEmp_StaffEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddEmpStaffEmpTermite));

		AddEmpStaffEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_DDBranch_StaffEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDBranchStaffEmpTermite));

		DDBranchStaffEmpTermite.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDBranchStaffEmpTermite));

		ValueDDBranchStaffEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_DDDivison_StaffEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDDivisonStaffEmpTermite));

		DDDivisonStaffEmpTermite.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDDivisonStaffEmpTermite));

		ValueDDDivisonStaffEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_DDdepartment_StaffEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDdepartmentStaffEmpTermite));

		DDdepartmentStaffEmpTermite.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDdepartmentStaffEmpTermite));

		ValueDDdepartmentStaffEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_FName_StaffEmpTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(FNameStaffEmpTermite));

		FNameStaffEmpTermite.sendKeys(testData.get("FirstName"));
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_LName_StaffEmpTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(LNameStaffEmpTermite));

		LNameStaffEmpTermite.sendKeys(testData.get("LastName"));
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_UserName_StaffEmpTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(UserNameStaffEmpTermite));

		UserNameStaffEmpTermite.sendKeys(testData.get("UserName"));
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_EmpType_StaffEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDEmpTypeStaffEmpTermite));

		DDEmpTypeStaffEmpTermite.click();

		wait.until(ExpectedConditions.elementToBeClickable(ValueEmpTypeStaffEmpTermite));
		ValueEmpTypeStaffEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_DDRoleName_StaffEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDRoleNameStaffEmpTermite));

		DDRoleNameStaffEmpTermite.click();

		wait.until(ExpectedConditions.elementToBeClickable(ValueDDRoleNameStaffEmpTermite));
		ValueDDRoleNameStaffEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_Save_StaffEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveStaffEmpTermite));
		SaveStaffEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_Team_EmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(TeamEmpTermite));
		TeamEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_DDBranch_TeamEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDBranchTeamEmpTermite));

		DDBranchTeamEmpTermite.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDBranchTeamEmpTermite));

		ValueDDBranchTeamEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_Email_TeamEmpTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(EmailTeamEmpTermite));
		EmailTeamEmpTermite.sendKeys(testData.get("Email"));
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_TeamName_TeamEmpTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(TeamNameTeamEmpTermite));
		TeamNameTeamEmpTermite.sendKeys(testData.get("TeamName"));
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_Save_TeamEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveTeamEmpTermite));
		SaveTeamEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_AddTeam_EmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddTeamEmpTermite));
		AddTeamEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_DDDepartment_TeamEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDDepartmentTeamEmpTermite));
		DDDepartmentTeamEmpTermite.click();

		wait.until(ExpectedConditions.elementToBeClickable(ValueDDDepartmentTeamEmpTermite));

		ValueDDDepartmentTeamEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_DDEmp_TeamEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDEmpTeamEmpTermite));
		DDEmpTeamEmpTermite.click();

		wait.until(ExpectedConditions.elementToBeClickable(ValueDDEmpTeamEmpTermite));

		ValueDDEmpTeamEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_IsPrimary_TeamEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(IsPrimaryTeamEmpTermite));
		IsPrimaryTeamEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_PlusAction_TeamEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(PlusActionTeamEmpTermite));
		PlusActionTeamEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_Route_Termite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(RouteTermite));
		RouteTermite.click();
		waitABit(2000);
	}

	public void clickon_AddRoute_EmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddRouteEmpTermite));
		AddRouteEmpTermite.click();
		waitABit(3000);
	}

	public void clickon_Route_RouteEmpTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(RouteRouteEmpTermite));
		RouteRouteEmpTermite.sendKeys(testData.get("Route"));
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_RouteName_RouteEmpTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(RouteNameRouteEmpTermite));
		RouteNameRouteEmpTermite.sendKeys(testData.get("RouteName"));
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_DDLeadTech_RouteEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDLeadTechRouteEmpTermite));
		DDLeadTechRouteEmpTermite.click();

		wait.until(ExpectedConditions.elementToBeClickable(ValueDDLeadTechRouteEmpTermite));

		ValueDDLeadTechRouteEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_Save_RouteEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveRouteEmpTermite));
		SaveRouteEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_DDBranch_RouteEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDBranchRouteEmpTermite));
		DDBranchRouteEmpTermite.click();

		wait.until(ExpectedConditions.elementToBeClickable(ValueDDBranchRouteEmpTermite));

		ValueDDBranchRouteEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_RouteOverride_EmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(RouteOverrideEmpTermite));
		RouteOverrideEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_AddRouteOverride_RouteOEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddRouteOverrideRouteOEmpTermite));
		AddRouteOverrideRouteOEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_DDRoute_RouteOEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDRouteRouteOEmpTermite));
		DDRouteRouteOEmpTermite.click();

		wait.until(ExpectedConditions.elementToBeClickable(ValueDDRouteRouteOEmpTermite));

		ValueDDRouteRouteOEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_Save_RouteOEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveRouteOEmpTermite));
		SaveRouteOEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_ClockInOut_EmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ClockInOutEmpTermite));
		ClockInOutEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_AddClock_ClockInOutEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddClockClockInOutEmpTermite));
		AddClockClockInOutEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_ClockOutTime_ClockInOutEmpTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ClockOutTimeClockInOutEmpTermite));
		ClockOutTimeClockInOutEmpTermite.sendKeys(testData.get("ClockOut"));
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_Save_ClockInOutEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveClockInOutEmpTermite));
		SaveClockInOutEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_AdvanceSearch_StaffEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AdvanceSearchStaffEmpTermite));
		AdvanceSearchStaffEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_EditAction_AdSearchStaffEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(EditActionAdSearchStaffEmpTermite));
		EditActionAdSearchStaffEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_DDBranch_EditAdSearchStaffEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDBranchEditAdSearchStaffEmpTermite));
		DDBranchEditAdSearchStaffEmpTermite.click();

		wait.until(ExpectedConditions.elementToBeClickable(ValueDDBranchEditAdSearchStaffEmpTermite));

		ValueDDBranchEditAdSearchStaffEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_DDDivison_EditAdSearchStaffEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDDivisonEditAdSearchStaffEmpTermite));
		DDDivisonEditAdSearchStaffEmpTermite.click();

		wait.until(ExpectedConditions.elementToBeClickable(ValueDDDivisonEditAdSearchStaffEmpTermite));

		ValueDDDivisonEditAdSearchStaffEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_DDDept_EditAdSearchStaffEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDDeptEditAdSearchStaffEmpTermite));
		DDDeptEditAdSearchStaffEmpTermite.click();

		wait.until(ExpectedConditions.elementToBeClickable(ValueDDDeptEditAdSearchStaffEmpTermite));

		ValueDDDeptEditAdSearchStaffEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_DDStartLoc_EditAdSearchStaffEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDStartLocEditAdSearchStaffEmpTermite));
		DDStartLocEditAdSearchStaffEmpTermite.click();

		wait.until(ExpectedConditions.elementToBeClickable(ValueDDStartLocEditAdSearchStaffEmpTermite));

		ValueDDStartLocEditAdSearchStaffEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_Save_EditAdSearchStaffEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveEditAdSearchStaffEmpTermite));
		SaveEditAdSearchStaffEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_ActiveAction_AdSearchStaffEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ActiveActionAdSearchStaffEmpTermite));
		ActiveActionAdSearchStaffEmpTermite.click();
		waitABit(jsonData.get("Time3"));

	}

	public void clickon_No_ActiveAdSearchStaffEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(NoActiveAdSearchStaffEmpTermite));
		NoActiveAdSearchStaffEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_LeaveManagement_EmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(LeaveManagement_EmpTermite));
		LeaveManagement_EmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_EditAction_LeaveManagTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(EditActionLeaveManagTermite));
		EditActionLeaveManagTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_DDLeaveType_LeaveManagTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDLeaveTypeLeaveManagTermite));
		DDLeaveTypeLeaveManagTermite.click();

		wait.until(ExpectedConditions.elementToBeClickable(ValueDDLeaveTypeLeaveManagTermite));

		ValueDDLeaveTypeLeaveManagTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_DDStatus_LeaveManagTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDStatusLeaveManagTermite));
		DDStatusLeaveManagTermite.click();

		wait.until(ExpectedConditions.elementToBeClickable(ValueDDStatusLeaveManagTermite));

		ValueDDStatusLeaveManagTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_Save_LeaveManagTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveLeaveManagTermite));
		SaveLeaveManagTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_SupervisorTimeSheet_EmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SupervisorTimeSheetEmpTermite));
		SupervisorTimeSheetEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_AddNonBilableHours_SupervisorTimeSheetEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddNonBilableHoursSupervisorTimeSheetEmpTermite));
		AddNonBilableHoursSupervisorTimeSheetEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_DDDept_SupervisorTimeSheetEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(TeamNameTeamEmpTermite));
		DDDeptSupervisorTimeSheetEmpTermite.click();

		wait.until(ExpectedConditions.elementToBeClickable(ValueDDDeptSupervisorTimeSheetEmpTermite));

		ValueDDDeptSupervisorTimeSheetEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_DDTimeSlot_SupervisorTimeSheetEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(TeamNameTeamEmpTermite));
		DDTimeSlotSupervisorTimeSheetEmpTermite.click();

		wait.until(ExpectedConditions.elementToBeClickable(ValueDDTimeSlotSupervisorTimeSheetEmpTermite));

		ValueDDTimeSlotSupervisorTimeSheetEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void clickon_Save_SupervisorTimeSheetEmpTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveSupervisorTimeSheetEmpTermite));
		SaveSupervisorTimeSheetEmpTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void select_DDRoute_RouteOEmpTermit() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(select_DDRoute_RouteOEmpTermit));
		select_DDRoute_RouteOEmpTermit.click();

		wait.until(ExpectedConditions.elementToBeClickable(Value_select_DDRoute_RouteOEmpTermit));

		Value_select_DDRoute_RouteOEmpTermit.click();
		waitABit(jsonData.get("Time3"));
	}

}

package com.infocrats.pageObjects;

import java.util.ArrayList;
import java.util.Map;

import org.openqa.selenium.Keys;

import com.infocrats.utils.BaseUtills;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class EmployeePage extends peststreamPage {
	BaseUtills utills = new BaseUtills();

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/ul[1]/li[9]/a[1]/span[1]")
	private WebElementFacade employeeTab;

	@FindBy(xpath = "//span[contains(text(),'Staff')]")
	private WebElementFacade staffTab;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/div[2]/div/div/div[1]/div[1]/div/div/button[1]")
	private WebElementFacade addEmployeeBtn;

	@FindBy(xpath = "//*[@id=\"EmployeeControlThreeCol_BranchMasterId\"]")
	private WebElementFacade branchDDL;

	@FindBy(xpath = "//*[@id=\"EmployeeControlThreeCol_BranchMasterId\"]/option[2]")
	private WebElementFacade branchValue;

	@FindBy(xpath = "//*[@id=\"ddlDivisionMasterId\"]")
	private WebElementFacade divisionDDL;

	@FindBy(xpath = "//*[@id=\"ddlDivisionMasterId\"]/option[2]")
	private WebElementFacade divisionValue;

	@FindBy(xpath = "//*[@id=\"ddlDepartmentMasterId\"]")
	private WebElementFacade departmentDDL;

	@FindBy(xpath = "//*[@id=\"ddlDepartmentMasterId\"]/option[2]")
	private WebElementFacade departmentValue;

	@FindBy(xpath = "(//*[@id=\"FirstName\"])[2]")
	private WebElementFacade firstName;

	@FindBy(xpath = "(//*[@id=\"LastName\"])[2]")
	private WebElementFacade lastName;

	@FindBy(xpath = "(//*[@id=\"UserName\"])[2]")
	private WebElementFacade userName;

	@FindBy(xpath = "//*[@id=\"select2-chosen-11\"]")
	private WebElementFacade employeeTypeDDL;

	@FindBy(xpath = "//*[@id=\"select2-results-11\"]/li[2]")
	private WebElementFacade employeeTypeValue;

	@FindBy(xpath = "(//*[@id=\"s2id_RoleId\"])[2]")
	private WebElementFacade roleDDL;

	@FindBy(xpath = "//*[@class=\"select2-result-label\"]/span")
	private WebElementFacade roleDDL_span;

	@FindBy(xpath = "//*[@id=\"select2-result-label-30\"]")
	private WebElementFacade roleValue;

	@FindBy(xpath = "//*[@id=\"btnSubmitEmployee\"]")
	private WebElementFacade saveBtn;

	@FindBy(xpath = "//*[@id=\"s2id_autogen15_search\"]")
	private WebElementFacade editetxt;

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[9]/ul/li[2]/a/span")
	private WebElementFacade teamTab;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div/button")
	private WebElementFacade addTeamBtn;

	@FindBy(xpath = "//*[@id=\"s2id_ddlBranchId\"]")
	private WebElementFacade addTeam_branchDDL;

	@FindBy(xpath = "(//div[@role='option'])[3]")
	private WebElementFacade addTemBranchValue;

	@FindBy(xpath = "//*[@id='PrimaryEmail']")
	private WebElementFacade mail;

	@FindBy(xpath = "//*[@id=\"TeamName\"]")
	private WebElementFacade teamName;

	@FindBy(xpath = "//*[@id=\"s2id_DepartSysName\"]/a")
	private WebElementFacade TeamDepartmentDDL;

	@FindBy(xpath = "//*[@id=\"select2-results-3\"]/li[2]/ul/li[1]")
	private WebElementFacade TeamDepartmentValue;

	@FindBy(xpath = "//*[@id=\"s2id_ddlEmployeeId\"]")
	private WebElementFacade TeamEmployeeDDL;

	@FindBy(xpath = "//*[@id=\"select2-result-label-29\"]")
	private WebElementFacade TeamEmployeeValue;

	@FindBy(xpath = "//input[@id='IsPrimary']")
	private WebElementFacade IsPrimary;

	@FindBy(xpath = "//*[@id=\"teamEmployee\"]/thead/tr[2]/td[4]/a")
	private WebElementFacade ActionBtn;

	@FindBy(xpath = "//*[@id=\"form0\"]/div[2]/button[2]")
	private WebElementFacade teamsaveBtn;

	@FindBy(xpath = "(//div[@role='option'])[2]")
	private WebElementFacade emplSearchText;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/ul[1]/li[9]/ul[1]/li[3]/a[1]")
	private WebElementFacade routeTab;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div/button")
	private WebElementFacade addRoute;

	@FindBy(xpath = "//*[@id=\"RouteNo\"]")
	private WebElementFacade routeNumber;

	@FindBy(xpath = "//*[@id=\"RouteName\"]")
	private WebElementFacade routeName;

	@FindBy(xpath = "//*[@id=\"s2id_LeadTechEmployeeNo\"]")
	private WebElementFacade leadTechnicianDDL;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[7]")
	private WebElementFacade technicianName;

	@FindBy(xpath = "//*[@id=\"Description\"]")
	private WebElementFacade description;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label')])[3]")
	private WebElementFacade leadSearch;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label')])[3]")
	private WebElementFacade employeeTypePartTime;

	@FindBy(xpath = "//div[@id='s2id_ReportingAuthorityId']//b")
	private WebElementFacade DDReportingAuthority;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label')])[2]")
	private WebElementFacade valueReportingAuthority;

	@FindBy(xpath = "//span[@class='title'][contains(text(),'Route Override')]")
	private WebElementFacade routeOverride;

	@FindBy(xpath = "//span[contains(text(),'Add Route Override')]")
	private WebElementFacade addrouteOverride;

	@FindBy(xpath = "//select[@id='ddlRoute']")
	private WebElementFacade DDaddRouteOverride;

	@FindBy(xpath = "//option[contains(text(),'Test Route (dheeraj R)')]")
	private WebElementFacade valueaddRouteOverride;

	@FindBy(xpath = "//span[contains(text(),'Nothing selected')]")
	private WebElementFacade DDcrewTechnician;

	@FindBy(xpath = "//div[@class='btn-group bootstrap-select show-tick bs-select form-control open']//span[@class='text'][contains(text(),'Kevin Sam')]")
	private WebElementFacade ValuecrewTechnician;

	@FindBy(xpath = "//button[@class='btn green ladda-button btnSubmitRouteOverride']")
	private WebElementFacade save;

	@FindBy(xpath = "//span[@class='title'][contains(text(),'Clock In-Out')]")
	private WebElementFacade ClockInOutTab;

	@FindBy(xpath = "//span[contains(text(),'Add Clock In-Out')]")
	private WebElementFacade addClockInOut;

	@FindBy(xpath = "//input[@id='TimeIn1']")
	private WebElementFacade ClockInOutDate;

	@FindBy(xpath = "//td[@class='day'][contains(text(),'28')]")
	private WebElementFacade valueClockInOut;

	@FindBy(xpath = "//button[@id='submitClockInOut']//span[@class='ladda-label'][contains(text(),'Save')]")
	private WebElementFacade saveClock;

	@FindBy(xpath = "//input[@id='TimeOutStr']")
	private WebElementFacade TimeOut;

	@FindBy(xpath = "//button[@id='submitClockInOut']//span[@class='ladda-label'][contains(text(),'Save')]")
	private WebElementFacade ValueTimeOut;

	@FindBy(xpath = "//select[@id='WorkingStatusTypeDd']")
	private WebElementFacade DDWorkingStatus;

	@FindBy(xpath = "//option[contains(text(),'Break Time')]")
	private WebElementFacade ValueWorkingStatus;

	@FindBy(xpath = "//input[@id='Reason']")
	private WebElementFacade Reason;

	@FindBy(xpath = "//span[contains(text(),'Leave Management')]")
	private WebElementFacade leaveManagement;

	@FindBy(xpath = "//tr[1]//td[7]//a[1]")
	private WebElementFacade Action;

	@FindBy(xpath = "(//span[@class='select2-chosen'])[2]")
	private WebElementFacade DDLeaveType;

	@FindBy(xpath = "(//div[@role='option'])[2]")
	private WebElementFacade ValueLeaveType;

	@FindBy(xpath = "//input[@id='LeaveStartTimeStr']")
	private WebElementFacade lm_from_time;

	@FindBy(xpath = "//input[@id='LeaveEndTimeStr']")
	private WebElementFacade lm_to_time;

	@FindBy(xpath = "//select[@id='Status']")
	private WebElementFacade DDStatus;

	@FindBy(xpath = "//option[contains(text(),'Approved')]")
	private WebElementFacade ValueStatus;

	@FindBy(xpath = "//button[@id='submitLeave']//span[@class='ladda-label'][contains(text(),'Save')]")
	private WebElementFacade SaveLM;

	@FindBy(xpath = "(//div[@role='option'])[3]")
	private WebElementFacade ValueLeaveTypeHalf;

	@FindBy(xpath = "(//div[@role='option'])[4]")
	private WebElementFacade ValueLeaveTypeSick;

	@FindBy(xpath = "//*[@id='ToDate1']")
	private WebElementFacade DDToDateLM;

	@FindBy(xpath = "//div[@class='datepicker-days']//th[@class='next']")
	private WebElementFacade LMnextMonthFull;

	@FindBy(xpath = "//td[@class='day'][contains(text(),'28')]")
	private WebElementFacade ValueToDateLM;

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[9]/ul/li[9]/a/span")
	private WebElementFacade emp_timesheet;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/div/div/div[1]/div[1]/div[1]/div/div/a/span")
	private WebElementFacade nonbillable_hours;

	@FindBy(xpath = "//*[@id='DepartmentSysName']")
	private WebElementFacade dept;

	@FindBy(xpath = "//*[@id='DepartmentSysName']/optgroup/option")
	private WebElementFacade deptvalue;

	@FindBy(xpath = "//*[@id='TimeSlot']")
	private WebElementFacade timeslot;

	@FindBy(xpath = "//*[@id='TimeSlot']/option[3]")
	private WebElementFacade timeslotvalue;

	@FindBy(xpath = "//*[@id='FromDate1']")
	private WebElementFacade dateClick;

	@FindBy(xpath = "/html/body/div[13]/div[1]/table/thead/tr[1]/th[3]")
	private WebElementFacade monthClick;

	@FindBy(xpath = "//td[@class='day'][contains(text(),'26')]")
	private WebElementFacade dateClickValue;

	@FindBy(xpath = "//*[@id='FromTimeStr']")
	private WebElementFacade fromtime;

	@FindBy(xpath = "//*[@id='ToTimeStr']")
	private WebElementFacade totime;

	@FindBy(xpath = "//*[@id='Description']")
	private WebElementFacade empdescription;

	@FindBy(xpath = "//*[@id='submitNonBillableTime']/span")
	private WebElementFacade save_emp;

	@FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[9]/ul/li[10]/a/span")
	private WebElementFacade supervisor_Timesheet;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div[1]/div/div/div[1]/div[1]/div[2]/div/div/a")
	private WebElementFacade add_Nonbillablehours;

	@FindBy(xpath = "//*[@id='DepartmentSysName']")
	private WebElementFacade stdept;

	@FindBy(xpath = "//option[contains(text(),'QA Automation Department1')]")
	private WebElementFacade stdeptvalue;

	@FindBy(xpath = "//*[@id='TimeSlot']")
	private WebElementFacade sttimeslot;

	@FindBy(xpath = "//*[@id='TimeSlot']/option[3]")
	private WebElementFacade sttimeslotvalue;

	@FindBy(xpath = "//*[@id='EmployeeId']")
	private WebElementFacade emp_type;

	@FindBy(xpath = "//*[@id='EmployeeId']/option")
	private WebElementFacade emp_value;

	@FindBy(xpath = "(//input[@size='16'])[1]")
	private WebElementFacade st_date;

	@FindBy(xpath = "/html/body/div[13]/div[1]/table/tbody/tr[3]/td[3]")
	private WebElementFacade st_date_value;

	@FindBy(xpath = "//*[@id='FromTimeStr']")
	private WebElementFacade st_from_time;

	@FindBy(xpath = "//*[@id='ToTimeStr']")
	private WebElementFacade st_to_time;

	@FindBy(xpath = "//*[@id='Description']")
	private WebElementFacade st_description;
	
	@FindBy(xpath = "(//span[@class='select2-chosen'])[6]")
	private WebElementFacade DDBranch_StaffEmp;
	
	@FindBy(xpath = "(//div[@role='option'])[3]")
	private WebElementFacade ValueDDBranch_StaffEmp;
	
	@FindBy(xpath = "(//span[@class='select2-chosen'])[7]")
	private WebElementFacade DDDivison;
	
	@FindBy(xpath = "(//div[@role='option'])[2]")
	private WebElementFacade ValueDDDivison;
	
	@FindBy(xpath = "(//span[@class='select2-chosen'])[8]")
	private WebElementFacade DDDepartment;
	
	@FindBy(xpath = "(//div[@role='option'])[2]")
	private WebElementFacade ValueDDDepartment;
	
	@FindBy(xpath = "(//input[@name='FirstName'])[2]")
	private WebElementFacade FName;
	
	@FindBy(xpath = "(//input[@name='LastName'])[2]")
	private WebElementFacade LName;
	
	@FindBy(xpath = "(//input[@name='UserName'])[2]")
	private WebElementFacade Username;
	
	@FindBy(xpath = "(//span[@class='select2-chosen'])[9]")
	private WebElementFacade DDEmpType;
	
	@FindBy(xpath = "(//div[@class='select2-result-label'])[2]")
	private WebElementFacade ValueDDEmpType;
	
	@FindBy(xpath = "(//span[@class='select2-chosen'])[11]")
	private WebElementFacade DDRoleName;
	
	@FindBy(xpath = "(//div[@role='option'])[2]")
	private WebElementFacade ValueDDRoleName;
	
	@FindBy(xpath = "(//span[@class='ladda-label'])[1]")
	private WebElementFacade Save_StaffEmp;
	
	@FindBy(xpath = "(//div[@role='option'])[4]")
	private WebElementFacade EmpTypeHalf;

	@FindBy(xpath = "//*[@id='submitNonBillableTime']/span")
	private WebElementFacade st_save;
	
	@FindBy(xpath = "(//span[@class='select2-chosen'])[5]")
	private WebElementFacade Branch_RouteEmployee;
	
	@FindBy(xpath = "(//div[@role='option'])[3]")
	private WebElementFacade ValueBranch_RouteEmployee;

	ArrayList<String> al = new ArrayList<String>();

	public ArrayList<String> getText() {
		for (int i = 0; i <= 6; i++) {

			String ddl_value = roleDDL_span.getText();
			System.out.println(ddl_value);

			al.add(ddl_value);
		}
		return al;

	}

	@Override
	public WebElementFacade getUniqueElement() {

		return null;
	}

	public void employee_tab() {
		employeeTab.click();

	}

	public void staff_tab() {
		staffTab.click();
		waitABit(3000);

	}

	public void addEmployee_btn() {
		addEmployeeBtn.click();
		waitABit(3000);
	}

	public void basicBranch_info() {
		branchDDL.click();
		waitABit(1000);
		branchValue.click();
		waitABit(1000);
		divisionDDL.click();
		waitABit(1000);
		divisionValue.click();
		waitABit(1000);
		departmentDDL.click();
		waitABit(1000);
		departmentValue.click();
		waitABit(1000);
	}

	public void personal_info(Map<String, String> testData) {
		waitABit(2000);
		firstName.sendKeys(testData.get("FirstName"));
		lastName.sendKeys(testData.get("LastName"));
		userName.sendKeys(testData.get("UserName"));

	}

	public void employee_type() {
		employeeTypeDDL.click();
		employeeTypeValue.click();
		waitABit(1000);

		for (Object i : al) {
			System.out.print(i + " ");
		}
	}

	public void role_name() {
		roleDDL.click();
		waitABit(2000);
		editetxt.sendKeys("sales person");
		waitABit(1000);
		editetxt.sendKeys(Keys.ENTER);
		waitABit(1000);

	}

	public void employee_status() {
		System.out.println("status is activated");

	}

	public void emplSv_btn() {
		saveBtn.click();
		waitABit(6000);

	}

	public void team_subtab() {
		teamTab.click();
		waitABit(2000);

	}

	public void add_team() {
		addTeamBtn.click();

	}

	public void branch_name() {
		addTeam_branchDDL.click();
		waitABit(3000);
		addTemBranchValue.click();

	}

	public void mail_id(Map<String, String> testData) {
		mail.sendKeys(testData.get("Email"));

	}

	public void team_name(Map<String, String> testData) {
		teamName.sendKeys(testData.get("TeamName"));

	}

	public void depart_name() {
		TeamDepartmentDDL.click();
		waitABit(4000);
		TeamDepartmentValue.click();
	}

	public void empl_name() {
		TeamEmployeeDDL.click();
		waitABit(4000);
		//emplSearchText.sendKeys("Dheeraj");
		emplSearchText.click();
		waitABit(3000);

	}

	public void is_primary() {
		IsPrimary.click();

	}

	public void action_btn() {
		ActionBtn.click();

	}

	public void teamSave_btn() {
		teamsaveBtn.click();
		waitABit(9000);

	}

	public void route_tab() {
		routeTab.click();
		waitABit(4000);

	}

	public void add_route() {
		addRoute.click();
		waitABit(2000);

	}

	public void enter_route(Map<String, String> testData) {
		routeNumber.sendKeys(testData.get("Route"));
		waitABit(3000);

	}

	public void route_name(Map<String, String> testData) {
		waitABit(3000);
		routeName.sendKeys(testData.get("RouteName"));

	}

	public void lead_technician() {
		waitABit(3000);
		leadTechnicianDDL.click();
		waitABit(2000);
		leadSearch.click();
		waitABit(2000);

	}

	public void description(Map<String, String> testData) {
		description.sendKeys(testData.get("RouteDescription"));
		waitABit(1000);

	}

	public void employeeTypePartTime() {
		employeeTypeDDL.click();
		employeeTypePartTime.click();
		waitABit(2000);

	}

	public void DDReportingAuthority() {
		DDReportingAuthority.click();
		valueReportingAuthority.click();
		waitABit(2000);

	}

	public void routeOverride() {
		scrollDown(routeOverride);
		waitABit(2000);
		routeOverride.click();
		waitABit(2000);
		addrouteOverride.click();
		waitABit(2000);

	}

	public void addRouteOverride() {
		DDaddRouteOverride.click();
		valueaddRouteOverride.click();
		waitABit(2000);

	}

	public void DDcrewTechnician() {
		DDcrewTechnician.click();
		ValuecrewTechnician.click();
		waitABit(2000);

	}

	public void save() {
		save.click();
		waitABit(2000);

	}

	public void ClockInOutTab() {
		scrollDown(ClockInOutTab);
		waitABit(5000);
		ClockInOutTab.click();
		waitABit(2000);

	}

	public void addClockInOut() {
		scrollUP(addClockInOut);
		addClockInOut.click();

		waitABit(2000);

	}

	public void ClockInOutDate() {
		ClockInOutDate.click();
		valueClockInOut.click();
		waitABit(2000);

	}

	public void saveClock() {
		saveClock.click();
		waitABit(2000);

	}

	public void TimeOut() {
		/* TimeOut.click(); */

		waitABit(2000);

	}

	public void ValueTimeOut(Map<String, String> testData) {
		waitABit(2000);
		TimeOut.sendKeys(testData.get("TimeOut"));
		waitABit(2000);

	}

	public void DDWorkingStatus() {
		DDWorkingStatus.click();
		waitABit(2000);
		ValueWorkingStatus.click();
		waitABit(2000);

	}

	public void Reason(Map<String, String> testData) {
		Reason.click();
		Reason.sendKeys(testData.get("Reason"));
		waitABit(2000);

	}

	public void leaveManagement() {
		scrollDown(leaveManagement);
		waitABit(5000);
		leaveManagement.click();
		waitABit(2000);

	}

	public void Action() {
		Action.click();
		waitABit(2000);

	}

	public void DDLeaveType() {
		DDLeaveType.click();
		waitABit(2000);

		ValueLeaveType.click();
		waitABit(2000);

	}

	public void DDStatus() {
		DDStatus.click();
		waitABit(2000);

		ValueStatus.click();
		waitABit(2000);

	}

	public void SaveLM() {
		SaveLM.click();
		waitABit(2000);

	}

	public void DDLeaveTypeHalf() {
		DDLeaveType.click();
		waitABit(2000);

		ValueLeaveTypeHalf.click();
		waitABit(2000);

	}

	public void DDLeaveTypeSick() {
		DDLeaveType.click();
		waitABit(2000);

		ValueLeaveTypeSick.click();
		waitABit(2000);

	}

	public void ToDateLM() {
		DDToDateLM.click();
		waitABit(2000);
		LMnextMonthFull.click();
		waitABit(2000);
		ValueToDateLM.click();
		waitABit(2000);

	}

	public void Employee_timesheet() {

		emp_timesheet.click();
	}

	public void nonBillable_hours() {
		nonbillable_hours.click();
	}

	public void department() {
		dept.click();
		waitABit(3000);
		deptvalue.click();

	}

	public void time_slot() {

		timeslot.click();
		waitABit(3000);
		timeslotvalue.click();

	}

	public void date() {
		waitABit(3000);
		dateClick.click();
		waitABit(3000);
		monthClick.click();
		waitABit(3000);
		dateClickValue.click();
		waitABit(3000);

	}

	public void from_time(Map<String, String> testData) {
		fromtime.clear();
		waitABit(2000);
		fromtime.sendKeys(testData.get("from_time"));
		waitABit(3000);
	}

	public void to_time(Map<String, String> testData) {
		totime.sendKeys(testData.get("to_time"));
		waitABit(3000);

	}

	public void emp_description(Map<String, String> testData) {
		waitABit(3000);
		empdescription.sendKeys(testData.get("emp_Description"));
	}

	public void save_emp_timesheet() {
		waitABit(3000);
		save_emp.click();
	}

	public void supervisor_Timesheet() {

		supervisor_Timesheet.click();
	}

	public void add_Nonbillablehours() {
		add_Nonbillablehours.click();
	}

	public void stDepartment() {
		stdept.click();
		waitABit(5000);
		stdeptvalue.click();
	}

	public void stTimeslot() {
		sttimeslot.click();
		waitABit(5000);
		sttimeslotvalue.click();
	}

	public void employeeType() {
		emp_type.click();
		emp_value.click();
	}

	public void ST_date() {
		// TODO Auto-generated method stub
		st_date.click();
		waitABit(3000);
		st_date_value.click();
	}

	public void ST_from_time(Map<String, String> testData) {
		st_from_time.clear();
		waitABit(2000);
		st_from_time.sendKeys(testData.get("st_from_time"));
	}

	public void ST_to_time(Map<String, String> testData) {
		st_to_time.sendKeys(testData.get("st_to_time"));
	}

	public void ST_Description(Map<String, String> testData) {

		st_description.sendKeys(testData.get("st_description"));
	}

	public void ST_save() {
		st_save.click();
	}

	public void LMFromTime(Map<String, String> testData) {
		waitABit(2000);
		lm_from_time.click();
		waitABit(2000);
		lm_from_time.clear();
		waitABit(2000);
		lm_from_time.sendKeys(testData.get("fromLM_time"));
	}

	public void LMToTime(Map<String, String> testData) {
		waitABit(2000);
		lm_to_time.click();
		waitABit(2000);
		lm_to_time.clear();
		waitABit(2000);
		lm_to_time.sendKeys(testData.get("toLM_time"));
	}

	public void Branch_StaffEmp() {
		waitABit(3000);
		DDBranch_StaffEmp.click();
		
		waitABit(3000);
		ValueDDBranch_StaffEmp.click();
	}

	public void Divison() {
		waitABit(2000);
		DDDivison.click();
		
		waitABit(2000);
		ValueDDDivison.click();
	}

	public void Department() {
		waitABit(2000);
		DDDepartment.click();
		
		waitABit(2000);
		ValueDDDepartment.click();
	}

	public void FName(Map<String, String> testData) {
		waitABit(2000);
		FName.sendKeys(testData.get("FName"));
		
	}

	public void LName(Map<String, String> testData) {
		waitABit(2000);
		LName.sendKeys(testData.get("LName"));
		
	}

	public void Username(Map<String, String> testData) {
		waitABit(2000);
		Username.sendKeys(testData.get("Username"));
			}

	public void EmpType() {
		waitABit(2000);
		DDEmpType.click();
		
		waitABit(2000);
		ValueDDEmpType.click();
	}

	public void RoleName() {
		waitABit(2000);
		DDRoleName.click();
		
		waitABit(2000);
		ValueDDRoleName.click();
	}

	public void Save_StaffEmp() {
		waitABit(2000);
		scrollDownLarge(Save_StaffEmp);
		
		waitABit(2000);
		Save_StaffEmp.click();
	}

	public void EmpTypeHalf() {
		waitABit(2000);
		DDEmpType.click();
		
		waitABit(2000);
		EmpTypeHalf.click();
	}

	public void Branch_RouteEmployee() {
		waitABit(2000);
		Branch_RouteEmployee.click();
		
		waitABit(2000);
		ValueBranch_RouteEmployee.click();
	}

}

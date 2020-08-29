package com.infocrats.pageObjects;

import java.util.ArrayList;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.JsonHelper;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class EmployeePage extends peststreamPage {
	BaseUtills utills = new BaseUtills();
	private Map<String, Integer> jsonData;

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

	public void employee_tab() throws Exception {
	jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
	WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
	wait.until(ExpectedConditions.elementToBeClickable(employeeTab));
	employeeTab.click();

	}

	public void staff_tab() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(staffTab));
		staffTab.click();

	}

	public void addEmployee_btn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(addEmployeeBtn));
		addEmployeeBtn.click();
	}

	public void basicBranch_info() throws Exception {
		branchDDL.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(branchValue));
		branchValue.click();
		waitABit(jsonData.get("Time3"));
		divisionDDL.click();
		waitABit(jsonData.get("Time3"));
		divisionValue.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(departmentDDL));
		departmentDDL.click();
		waitABit(jsonData.get("Time3"));
		departmentValue.click();
		waitABit(jsonData.get("Time3"));
	}

	public void personal_info(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(departmentDDL));
		firstName.sendKeys(testData.get("FirstName"));
		lastName.sendKeys(testData.get("LastName"));
		userName.sendKeys(testData.get("UserName"));

	}

	public void employee_type() throws Exception {
		employeeTypeDDL.click();
		employeeTypeValue.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(departmentDDL));

		for (Object i : al) {
			System.out.print(i + " ");
		}
	}

	public void role_name() throws Exception {
		roleDDL.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(departmentDDL));
		editetxt.sendKeys("sales person");
		waitABit(jsonData.get("Time3"));
		editetxt.sendKeys(Keys.ENTER);
		waitABit(jsonData.get("Time3"));

	}

	public void employee_status() {
		System.out.println("status is activated");

	}

	public void emplSv_btn() {
		saveBtn.click();
		waitABit(jsonData.get("Time3"));

	}

	public void team_subtab() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(departmentDDL));
		teamTab.click();

	}

	public void add_team() throws Exception {
	jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
	WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
	wait.until(ExpectedConditions.elementToBeClickable(addTeamBtn));
	addTeamBtn.click();

	}

	public void branch_name() throws Exception {
		addTeam_branchDDL.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(addTemBranchValue));
		addTemBranchValue.click();

	}

	public void mail_id(Map<String, String> testData) {
		mail.sendKeys(testData.get("Email"));

	}

	public void team_name(Map<String, String> testData) {
		teamName.sendKeys(testData.get("TeamName"));

	}

	public void depart_name() throws Exception {
		TeamDepartmentDDL.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(TeamDepartmentValue));
		TeamDepartmentValue.click();
	}

	public void empl_name() throws Exception {
		TeamEmployeeDDL.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(TeamDepartmentValue));
		TeamDepartmentValue.click();
		//emplSearchText.sendKeys("Dheeraj");
		emplSearchText.click();
		waitABit(jsonData.get("Time3"));

	}

	public void is_primary() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(IsPrimary));
		IsPrimary.click();

	}

	public void action_btn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ActionBtn));
		ActionBtn.click();

	}

	public void teamSave_btn() {
		teamsaveBtn.click();
		waitABit(jsonData.get("Time3"));

	}

	public void route_tab() {
		routeTab.click();
		waitABit(jsonData.get("Time3"));

	}

	public void add_route() {
		addRoute.click();
		waitABit(jsonData.get("Time3"));

	}

	public void enter_route(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ActionBtn));
		routeNumber.sendKeys(testData.get("Route"));
		waitABit(jsonData.get("Time3"));

	}

	public void route_name(Map<String, String> testData) {
		waitABit(jsonData.get("Time3"));
		routeName.sendKeys(testData.get("RouteName"));

	}

	public void lead_technician() {
		waitABit(jsonData.get("Time3"));
		leadTechnicianDDL.click();
		waitABit(jsonData.get("Time3"));
		leadSearch.click();
		waitABit(jsonData.get("Time3"));

	}

	public void description(Map<String, String> testData) throws Exception {
		description.sendKeys(testData.get("RouteDescription"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(employeeTypeDDL));

	}

	public void employeeTypePartTime() throws Exception {
		employeeTypeDDL.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(employeeTypePartTime));
		employeeTypePartTime.click();

	}

	public void DDReportingAuthority() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDReportingAuthority));
		DDReportingAuthority.click();
		valueReportingAuthority.click();
		waitABit(jsonData.get("Time3"));

	}

	public void routeOverride() throws Exception {
		scrollDown(routeOverride);
		waitABit(jsonData.get("Time3"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(routeOverride));
		routeOverride.click();
		waitABit(jsonData.get("Time3"));
		addrouteOverride.click();
		waitABit(jsonData.get("Time3"));

	}

	public void addRouteOverride() {
		DDaddRouteOverride.click();
		waitABit(jsonData.get("Time3"));
		valueaddRouteOverride.click();

	}

	public void DDcrewTechnician() {
		DDcrewTechnician.click();
		waitABit(jsonData.get("Time3"));
		ValuecrewTechnician.click();
		waitABit(jsonData.get("Time3"));

	}

	public void save() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(save));
		save.click();

	}

	public void ClockInOutTab() throws Exception {
		scrollDown(ClockInOutTab);
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ClockInOutTab));
		ClockInOutTab.click();
		waitABit(jsonData.get("Time3"));

	}

	public void addClockInOut() throws Exception {
		scrollUP(addClockInOut);
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(addClockInOut));
		addClockInOut.click();


	}

	public void ClockInOutDate() throws Exception {
		ClockInOutDate.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(valueClockInOut));
		valueClockInOut.click();

	}

	public void saveClock() throws Exception {

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveClock));
		saveClock.click();

	}

	public void TimeOut() {
		/* TimeOut.click(); */

		waitABit(jsonData.get("Time3"));

	}

	public void ValueTimeOut(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(TimeOut));
		TimeOut.sendKeys(testData.get("TimeOut"));
		waitABit(jsonData.get("Time3"));

	}

	public void DDWorkingStatus() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDWorkingStatus));
		DDWorkingStatus.click();
		waitABit(jsonData.get("Time3"));
		ValueWorkingStatus.click();
		waitABit(jsonData.get("Time3"));

	}

	public void Reason(Map<String, String> testData) {
		Reason.click();
		Reason.sendKeys(testData.get("Reason"));
		waitABit(jsonData.get("Time3"));

	}

	public void leaveManagement() throws Exception {
		scrollDown(leaveManagement);
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(leaveManagement));
		leaveManagement.click();
		waitABit(jsonData.get("Time3"));

	}

	public void Action() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Action));
		Action.click();

	}

	public void DDLeaveType() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDLeaveType));
		DDLeaveType.click();
		waitABit(jsonData.get("Time3"));

		ValueLeaveType.click();
		waitABit(jsonData.get("Time3"));

	}

	public void DDStatus() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDStatus));
		DDStatus.click();
		waitABit(jsonData.get("Time3"));
		ValueStatus.click();

	}

	public void SaveLM() throws Exception {

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveLM));
		SaveLM.click();

	}

	public void DDLeaveTypeHalf() throws Exception {
		DDLeaveType.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ValueLeaveTypeHalf));
		ValueLeaveTypeHalf.click();
		waitABit(jsonData.get("Time3"));

	}

	public void DDLeaveTypeSick() throws Exception {
		DDLeaveType.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ValueLeaveTypeSick));
		ValueLeaveTypeSick.click();
		waitABit(jsonData.get("Time3"));

	}

	public void ToDateLM() throws Exception {
		DDToDateLM.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(LMnextMonthFull));
		LMnextMonthFull.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ValueToDateLM));
		ValueToDateLM.click();

	}

	public void Employee_timesheet() throws Exception {

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(emp_timesheet));
		emp_timesheet.click();
	}

	public void nonBillable_hours() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(nonbillable_hours));
		nonbillable_hours.click();
	}

	public void department() throws Exception {
		dept.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(deptvalue));
		deptvalue.click();

	}

	public void time_slot() throws Exception {

		timeslot.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(timeslotvalue));
		timeslotvalue.click();

	}

	public void date() throws Exception {
		waitABit(jsonData.get("Time3"));
		dateClick.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(monthClick));
		monthClick.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(dateClickValue));
		dateClickValue.click();
		waitABit(jsonData.get("Time3"));

	}

	public void from_time(Map<String, String> testData) {
		fromtime.clear();
		waitABit(jsonData.get("Time3"));
		fromtime.sendKeys(testData.get("from_time"));
		waitABit(jsonData.get("Time3"));
	}

	public void to_time(Map<String, String> testData) {
		totime.sendKeys(testData.get("to_time"));
		waitABit(jsonData.get("Time3"));

	}

	public void emp_description(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(empdescription));
		empdescription.sendKeys(testData.get("emp_Description"));
	}

	public void save_emp_timesheet() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(save_emp));
		save_emp.click();
	}

	public void supervisor_Timesheet() {

		supervisor_Timesheet.click();
	}

	public void add_Nonbillablehours() {
		add_Nonbillablehours.click();
	}

	public void stDepartment() throws Exception {
		stdept.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(stdeptvalue));
		stdeptvalue.click();
	}

	public void stTimeslot() throws Exception {
		sttimeslot.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(sttimeslotvalue));
		sttimeslotvalue.click();
	}

	public void employeeType() throws Exception {
		emp_type.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(emp_value));
		emp_value.click();
	}

	public void ST_date() throws Exception {
		// TODO Auto-generated method stub
		st_date.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(st_date_value));
		st_date_value.click();
	}

	public void ST_from_time(Map<String, String> testData) throws Exception {
		st_from_time.clear();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(st_from_time));
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

	public void LMFromTime(Map<String, String> testData) throws Exception {
		waitABit(2000);
		lm_from_time.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(lm_from_time));
		lm_from_time.clear();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(lm_from_time));
		lm_from_time.sendKeys(testData.get("fromLM_time"));
	}

	public void LMToTime(Map<String, String> testData) throws Exception {
		waitABit(jsonData.get("Time3"));
		lm_to_time.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(lm_to_time));
		lm_to_time.clear();
		waitABit(jsonData.get("Time3"));
		lm_to_time.sendKeys(testData.get("toLM_time"));
	}

	public void Branch_StaffEmp() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDBranch_StaffEmp));
		DDBranch_StaffEmp.click();
		waitABit(jsonData.get("Time3"));
		ValueDDBranch_StaffEmp.click();
	}

	public void Divison() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDDivison));
		DDDivison.click();
		waitABit(jsonData.get("Time3"));
		ValueDDDivison.click();
	}

	public void Department() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDDepartment));
		DDDepartment.click();
		waitABit(jsonData.get("Time3"));
		ValueDDDepartment.click();
	}

	public void FName(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(FName));
		FName.sendKeys(testData.get("FName"));
		
	}

	public void LName(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(LName));
		LName.sendKeys(testData.get("LName"));
		
	}

	public void Username(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Username));
		Username.sendKeys(testData.get("Username"));
			}

	public void EmpType() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDEmpType));
		DDEmpType.click();
		waitABit(jsonData.get("Time3"));
		ValueDDEmpType.click();
	}

	public void RoleName() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDRoleName));
		DDRoleName.click();
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(ValueDDRoleName));
		ValueDDRoleName.click();
	}

	public void Save_StaffEmp() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Save_StaffEmp));
		scrollDownLarge(Save_StaffEmp);
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(Save_StaffEmp));
		Save_StaffEmp.click();
	}

	public void EmpTypeHalf() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDEmpType));
		DDEmpType.click();
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(EmpTypeHalf));
		EmpTypeHalf.click();
	}

	public void Branch_RouteEmployee() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Branch_RouteEmployee));
		Branch_RouteEmployee.click();
		
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(ValueBranch_RouteEmployee));
		ValueBranch_RouteEmployee.click();
	}

}

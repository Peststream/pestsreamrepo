package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.JsonHelper;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CSRDashBoardPage extends peststreamPage {
	BaseUtills utills = new BaseUtills();
	private Map<String, Integer> jsonData;

	@FindBy(xpath = "//span[contains(text(),'CSR DashBoard')]")
	private WebElementFacade DashBoardTab;

	@FindBy(xpath = "//button[contains(.,'Advance Search')]")
	private WebElementFacade AdvanceSearch;

	@FindBy(xpath = "//tr[1]//td[10]//a[1]//i[1]")
	private WebElementFacade callAction;

	@FindBy(xpath = "//select[@id='EmployeeNo']")
	private WebElementFacade called;

	@FindBy(xpath = "//*[@id=\"EmployeeNo\"]/option[2]")
	private WebElementFacade called1;

	@FindBy(xpath = "//button[@data-id='ddlLeadSource']")
	private WebElementFacade Source;

	@FindBy(xpath = "//span[@class='text'][contains(.,'CustomerPortal App')]")
	private WebElementFacade Source1;

	@FindBy(xpath = "//button[@data-id='ddlLeadTargets']")
	private WebElementFacade Target;

	@FindBy(xpath = "//span[contains(text(),'NewTarget')]")
	private WebElementFacade Target1;

	@FindBy(xpath = "//textarea[@id='Description']")
	private WebElementFacade description;

	@FindBy(xpath = "//textarea[@id='Note']")
	private WebElementFacade notes;

	@FindBy(xpath = "(//span[@class='ladda-label'])[1]")
	private WebElementFacade savebtn;

	@FindBy(xpath = "//tr[1]//td[10]//a[3]//i[1]")
	private WebElementFacade newTaskAxn;

	@FindBy(xpath = "//select[@id='LeadTaskVm_TaskTemplateId']")
	private WebElementFacade template;

	@FindBy(xpath = "//option[contains(text(),'NewTaskTemplate')]")
	private WebElementFacade Template1;

	@FindBy(xpath = "//input[@id='LeadTaskVm_DueDateStr']")
	private WebElementFacade dueDate0;

	@FindBy(xpath = "(//th[contains(@class,'next')])[1]")
	private WebElementFacade nextMonth;

	@FindBy(xpath = "//td[contains(text(),'17')]")
	private WebElementFacade dueDate;

	@FindBy(xpath = "//span[@class='select2-chosen'][contains(.,'--Select--')]")
	private WebElementFacade logActivity;

	@FindBy(xpath = "(//span[contains(.,'--Select--')])[2]")
	private WebElementFacade logDropDown;

	@FindBy(xpath = "//div[@class='select2-result-label'][contains(.,'NewLogType')]")
	private WebElementFacade logDropDown1;

	@FindBy(xpath = "//input[@id='LeadTaskVm_IsDone']")
	private WebElementFacade MarkAsDone;

	@FindBy(xpath = "//input[@id='create_follow_up']")
	private WebElementFacade CreateFollowUp;

	@FindBy(xpath = "//input[@id='Recurring']")
	private WebElementFacade RecurringChckBox;

	@FindBy(xpath = "//select[@id='frequency']")
	private WebElementFacade frquency;

	@FindBy(xpath = "//option[contains(text(),'Yearly')]")
	private WebElementFacade frequency1;

	@FindBy(xpath = "//select[@id='LeadTaskVm_YearlyMonth']")
	private WebElementFacade month1;

	@FindBy(xpath = "//option[contains(text(),'August')]")
	private WebElementFacade month2;

	@FindBy(xpath = "//select[@id='LeadTaskVm_MonthlyDayNoMonth']")
	private WebElementFacade day1;

	@FindBy(xpath = "//*[@id=\"LeadTaskVm_MonthlyDayNoMonth\"]/option[10]")
	private WebElementFacade day2;

	@FindBy(xpath = "//tr[1]//td[10]//a[2]")
	private WebElementFacade addOportunity;

	@FindBy(xpath = "//span[contains(@id,'select2-chosen-9')]")
	private WebElementFacade service1;

	@FindBy(xpath = "//div[@class='select2-result-label'][contains(.,'Pest Control')]")
	private WebElementFacade service2;

	@FindBy(xpath = "(//span[contains(.,'--Select--')])[2]")
	private WebElementFacade source1;

	@FindBy(xpath = "//*[@id=\"frmGeneralInfo\"]/div/div/div[3]/div[5]/div[2]/div/div/div/ul/li[2]/a")
	private WebElementFacade customerPortalApp;

	@FindBy(xpath = "//*[@id=\"AccountDescription\"]")
	private WebElementFacade accountAlert;

	@FindBy(xpath = "//*[@id=\"ProblemDescription\"]")
	private WebElementFacade accountDes;

	@FindBy(xpath = "//*[@id=\"uniform-rdoResidential\"]/span")
	private WebElementFacade Residential_RadioBtn;

	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	private WebElementFacade continuebtn;

	@FindBy(xpath = "//tr[1]//td[10]//a[4]//i[1]")
	private WebElementFacade AddNoteAxn;

	@FindBy(xpath = "//textarea[@id='LeadNoteVm_Note']")
	private WebElementFacade noteType;

	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade saveBtnNotes;

	@FindBy(xpath = "//tr[1]//td[10]//a[5]//i[1]")
	private WebElementFacade WorkOrderCsr;

	@FindBy(xpath = "//span[@id='select2-chosen-6']")
	private WebElementFacade DDWOService;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label')])[5]")
	private WebElementFacade ValueWOService;

	@FindBy(xpath = "//input[@id='serviceWohead']")
	private WebElementFacade DDService;

	@FindBy(xpath = "//strong[contains(.,'Pest Control')]")
	private WebElementFacade ValueDDService;

	@FindBy(xpath = "//a[@class='btn btn-primary btnAddService']")
	private WebElementFacade AddService;

	@FindBy(xpath = "//input[@id='ServiceDateStr']")
	private WebElementFacade serviceDate;

	@FindBy(xpath = "//td[@class='day'][contains(text(),'27')]")
	private WebElementFacade dateWorkOrder;

	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade saveBtnWorkOrder;

	@FindBy(xpath = "//tr[1]//td[10]//a[7]")
	private WebElementFacade ViewDetailsBtn;

	@FindBy(xpath = "//button[contains(.,'Opportunity')]")
	private WebElementFacade AddOpportunityDetails;

	@FindBy(xpath = "(//span[contains(.,'Call')])[2]")
	private WebElementFacade newCallButton;

	@FindBy(xpath = "(//span[contains(.,'CustomerPortal App')])[3]")
	private WebElementFacade source2;

	@FindBy(xpath = "(//span[contains(.,'Nothing selected')])[3]")
	private WebElementFacade target2;

	@FindBy(xpath = "(//button[@type='submit'][contains(.,'Save')])[2]")
	private WebElementFacade saved;

	@FindBy(xpath = "//button[@type='button'][contains(.,'Ok')]")
	private WebElementFacade alertAccount;

	@FindBy(xpath = "(//span[contains(.,'Work Order')])[3]")
	private WebElementFacade workOrderDetail;

	@FindBy(xpath = "//div[@id='uniform-rdoCommercial']")
	private WebElementFacade ComOpportunity;

	@FindBy(xpath = "//label[2]//div[1]")
	private WebElementFacade RangeTime;

	@FindBy(xpath = "//span[@id='select2-chosen-1']")
	private WebElementFacade DDleadTech;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label')])[2]")
	private WebElementFacade valueleadTech;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElementFacade alertmessageCSRDashboard;

	@FindBy(xpath = "//*[@id=\"frmGeneralInfo\"]/div/div/div[3]/div[5]/div[2]/div/div/button/span[1]")
	private WebElementFacade DDSourceAccountOpportunity;

	@FindBy(xpath = "//span[contains(text(),'CustomerPortal App')]")
	private WebElementFacade ValueDDSourceAccountOpportunity;

	@FindBy(xpath = "//*[@id=\"select2-chosen-7\"]")
	private WebElementFacade DDServiceCategoryWO;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[11]")
	private WebElementFacade ValueDDServiceCategoryWO;

	@FindBy(xpath = "//input[@id='serviceWohead']")
	private WebElementFacade DDServicesWO;

	@FindBy(xpath = "//span[contains(text(),'CustomerPortal App')]")
	private WebElementFacade ValueDDServicesWO;

	@FindBy(xpath = "//input[@id='LeadTaskVm_TaskName']")
	private WebElementFacade TaskName_CSRDashboard;

	@FindBy(xpath = "//input[@id='LeadTaskVm_DueDateStr']")
	private WebElementFacade DueDate_CSRDashboard;

	@FindBy(xpath = "(//span[@class='ladda-label'])[1]")
	private WebElementFacade Save_CSRDashboard;

	@FindBy(xpath = "//input[contains(@name,'Agenda')]")
	private WebElementFacade Activity_CSRDashboard;

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElementFacade billingAddSame_WOCSRDashboard;

	@FindBy(xpath = "(//input[@placeholder='Enter Address 1'])[1]")
	private WebElementFacade AddLine;

	@FindBy(xpath = "(//input[@placeholder='Enter Zip'])[1]")
	private WebElementFacade zip_WOCSRDashboard;

	@FindBy(xpath = "(//input[@placeholder='Enter City'])[1]")
	private WebElementFacade City;

	@FindBy(xpath = "(//select[@data-placeholder='Select State...'])[1]")
	private WebElementFacade State_WOCSRDashboard;

	@FindBy(xpath = "(//button[contains(.,'Save')])[1]")
	private WebElementFacade save_WOCSRDashboard;

	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}

	public void dashboardClick() throws Exception {
		scrollUP(DashBoardTab);
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DashBoardTab));
		DashBoardTab.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(AdvanceSearch));

	}

	public void advanceSearchbtn() throws Exception {
		AdvanceSearch.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(callAction));
	}

	public void callAction() throws Exception {
		callAction.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(called));
	}

	public void CalledSourceTarget() throws Exception {

		called.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(called1));
		called1.click();
		waitABit(jsonData.get("Time3"));
		Source.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(Source1));
		Source1.click();
		waitABit(jsonData.get("Time3"));
		Target.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(Target1));
		Target1.click();
		waitABit(jsonData.get("Time3"));
	}

	public void descNotes(Map<String, String> testData) throws Exception {
		description.sendKeys(testData.get("Description"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(notes));
		notes.sendKeys(testData.get("Notes"));
		waitABit(jsonData.get("Time3"));

	}

	public void saveBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(savebtn));
		scrollDown(savebtn);
		waitABit(jsonData.get("Time3"));
		savebtn.click();
		waitABit(jsonData.get("Time3"));
	}

	public void newTaskAxn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(newTaskAxn));
		newTaskAxn.click();
		waitABit(jsonData.get("Time3"));

	}

	public void tasktemplate() throws Exception {
		template.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Template1));
		Template1.click();
		waitABit(jsonData.get("Time3"));

	}

	public void dueDate() throws Exception {
		dueDate0.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(nextMonth));
		nextMonth.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(dueDate));
		dueDate.click();
		waitABit(jsonData.get("Time3"));

	}

	public void lobBtnDDL() throws Exception {
		logActivity.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(logDropDown1));
		// logActivity.sendKeys(testData.get("Description"));
//		logDropDown.click();
//		waitABit(2000);
		logDropDown1.click();
		waitABit(jsonData.get("Time3"));
	}

	public void markasDone() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(MarkAsDone));
		MarkAsDone.click();
		waitABit(jsonData.get("Time3"));

	}

	public void followUpCreate() throws Exception {
		CreateFollowUp.click();
		waitABit(jsonData.get("Time3"));
	}

	public void recuringChckBox() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(RecurringChckBox));
		RecurringChckBox.click();
		waitABit(jsonData.get("Time3"));
	}

	public void recurringDDL() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(frquency));
		frquency.click();
		waitABit(jsonData.get("Time3"));
		frequency1.click();
		waitABit(jsonData.get("Time3"));
		month1.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(month2));
		month2.click();
		waitABit(jsonData.get("Time3"));
		day1.click();
		waitABit(jsonData.get("Time3"));
		day2.click();
		waitABit(jsonData.get("Time3"));

	}

	public void addOportunity() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(addOportunity));
		addOportunity.click();
		waitABit(jsonData.get("Time3"));

	}

	public void serviceSource(Map<String, String> testData) throws Exception {

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(source1));
//		service1.click();
//        service2.click();
//		waitABit(2000);
		source1.click();
		waitABit(jsonData.get("Time3"));
		customerPortalApp.click();
		waitABit(jsonData.get("Time3"));
		accountAlert.sendKeys(testData.get("AccountAlert"));
		accountDes.sendKeys(testData.get("ProblemDescription"));
	}

	public void OpportunityType() {
		Residential_RadioBtn.click();
		waitABit(jsonData.get("Time3"));
	}

	public void Continue() {
		continuebtn.click();
		waitABit(jsonData.get("Time3"));

	}

	public void noteBtnAxn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddNoteAxn));
		AddNoteAxn.click();
		waitABit(jsonData.get("Time3"));

	}

	public void addingNote(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(noteType));
		noteType.sendKeys(testData.get("Notes"));
		waitABit(jsonData.get("Time3"));

	}

	public void savingNote() {
		saveBtnNotes.click();
		waitABit(jsonData.get("Time3"));
	}

	public void WorkOrderBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(WorkOrderCsr));
		WorkOrderCsr.click();
		waitABit(jsonData.get("Time3"));
	}

	public void ServiceCategorySubService() throws Exception {
		DDWOService.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(ValueWOService));
		ValueWOService.click();
		waitABit(jsonData.get("Time3"));
		DDService.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(ValueDDService));
		ValueDDService.click();
		waitABit(jsonData.get("Time3"));

	}

	public void addServiceBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddService));
		AddService.click();
		waitABit(jsonData.get("Time3"));

	}

	public void ServiceDate() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(serviceDate));
		serviceDate.click();
		waitABit(jsonData.get("Time3"));
//		nextMonth.click();
//		waitABit(2000);
		dateWorkOrder.click();
		waitABit(jsonData.get("Time3"));
	}

	public void SavingWorkOrder() {
		saveBtnWorkOrder.click();
		waitABit(jsonData.get("Time3"));
	}

	public void ViewDetailBtn() throws Exception {
		ViewDetailsBtn.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(alertAccount));
		try {
			alertAccount.click();
		} catch (Exception e) {

		}
	}

	public void addOpportunityBtnDetails() {
		AddOpportunityDetails.click();
		waitABit(jsonData.get("Time3"));
		for (String newW : getDriver().getWindowHandles()) // iterating on child windows
		{
			getDriver().switchTo().window(newW);
		}
		waitABit(jsonData.get("Time3"));

	}

	public void callButtonViewDetails() {

		newCallButton.click();
		waitABit(jsonData.get("Time3"));
	}

	public void calledSourceTarget() throws Exception {
		called.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(called1));
		called1.click();
		waitABit(jsonData.get("Time3"));
		Source.click();
		waitABit(jsonData.get("Time3"));
		source2.click();
		called.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(Target));
		Target.click();
		waitABit(jsonData.get("Time3"));
		Target1.click();
		waitABit(jsonData.get("Time3"));

	}

	public void savebtnDetail() {
		saved.click();
		waitABit(jsonData.get("Time3"));
	}

	public void detailsWorKOrder() throws Exception {

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(workOrderDetail));
		workOrderDetail.click();
		waitABit(jsonData.get("Time3"));
		for (String agreement : getDriver().getWindowHandles()) // iterating on child windows
		{
			getDriver().switchTo().window(agreement);
		}

	}

	public void ComOpportunity() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(ComOpportunity));
		scrollDown(ComOpportunity);
		ComOpportunity.click();

	}

	public void RangeTime() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(RangeTime));
		RangeTime.click();
		waitABit(jsonData.get("Time3"));

	}

	public void DDleadTech() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(DDleadTech));
		DDleadTech.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(valueleadTech));

		valueleadTech.click();
		waitABit(jsonData.get("Time3"));

	}

	public void alertmessageCSRDashboard() {
		alertmessageCSRDashboard.click();
		waitABit(jsonData.get("Time3"));
	}

	public void DDSourceAccountOpportunity() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDSourceAccountOpportunity));
		DDSourceAccountOpportunity.click();
		waitABit(jsonData.get("Time3"));
		ValueDDSourceAccountOpportunity.click();
		waitABit(jsonData.get("Time3"));

	}

	public void DDServiceCategoryWO() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDServiceCategoryWO));
		DDServiceCategoryWO.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(ValueDDServiceCategoryWO));
		ValueDDServiceCategoryWO.click();
		waitABit(jsonData.get("Time3"));
	}

	public void DDServicesWO() throws Exception {

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(DDServicesWO));
		DDServicesWO.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDServicesWO));
		DDServicesWO.sendKeys(Keys.DOWN);
		waitABit(jsonData.get("Time3"));
		DDServicesWO.sendKeys(Keys.ENTER);
		waitABit(jsonData.get("Time3"));
	}

	public void TaskName_CSRDashboard(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(TaskName_CSRDashboard));
		TaskName_CSRDashboard.click();
		TaskName_CSRDashboard.sendKeys(testData.get("Description"));
		waitABit(jsonData.get("Time3"));

	}

	public void DueDate_CSRDashboard() throws Exception {
		scrollDown(DueDate_CSRDashboard);
		DueDate_CSRDashboard.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(nextMonth));
		nextMonth.click();
		waitABit(jsonData.get("Time3"));
		dueDate.click();
		waitABit(jsonData.get("Time3"));
		// DueDate_CSRDashboard.sendKeys(testData.get("Description"));

	}

	public void Save_CSRDashboard() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Save_CSRDashboard));
		scrollDown(Save_CSRDashboard);
		Save_CSRDashboard.click();
		waitABit(jsonData.get("Time3"));

	}

	public void Activity_CSRDashboard(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(Activity_CSRDashboard));
		Activity_CSRDashboard.click();
		Activity_CSRDashboard.sendKeys(testData.get("Description"));

	}

	public void billingAddSame_WOCSRDashboard() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(billingAddSame_WOCSRDashboard));
		billingAddSame_WOCSRDashboard.click();
		waitABit(jsonData.get("Time3"));
	}

	public void AddLine(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddLine));
		AddLine.click();
		waitABit(jsonData.get("Time3"));
		AddLine.sendKeys(testData.get("AddressLine1"));
	}

	public void zip_WOCSRDashboard(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(zip_WOCSRDashboard));
		zip_WOCSRDashboard.click();
		waitABit(jsonData.get("Time3"));
		zip_WOCSRDashboard.sendKeys(testData.get("Zip"));
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(City));
		City.click();
		waitABit(jsonData.get("Time3"));
		City.sendKeys(testData.get("City"));
		waitABit(jsonData.get("Time3"));
	}

	/*
	 * public void State_WOCSRDashboard() { waitABit(3000);
	 * State_WOCSRDashboard.click(); }
	 */

	public void save_WOCSRDashboard() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(save_WOCSRDashboard));
		scrollDownLarge(save_WOCSRDashboard);
		waitABit(jsonData.get("Time3"));
		save_WOCSRDashboard.click();
	}
}
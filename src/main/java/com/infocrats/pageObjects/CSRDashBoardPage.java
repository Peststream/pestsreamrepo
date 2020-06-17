package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.Keys;

import com.infocrats.utils.BaseUtills;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CSRDashBoardPage extends peststreamPage {
	BaseUtills utills = new BaseUtills();

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
	
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}

	public void dashboardClick() {
		scrollUP(DashBoardTab);
		waitABit(2000);
		DashBoardTab.click();
		waitABit(4000);
		
	}

	public void advanceSearchbtn() {
		AdvanceSearch.click();
		waitABit(4000);
	}

	public void callAction() {
		callAction.click();
		waitABit(5000);
	}

	public void CalledSourceTarget() {
	
		 called.click();
			waitABit(2000);
		called1.click();
		waitABit(2000);	
		Source.click();
		waitABit(2000);
		Source1.click();
		waitABit(2000);	
		Target.click();
		waitABit(2000);
		Target1.click();
		waitABit(2000);
	}

	public void descNotes(Map<String, String> testData) {
		 description.sendKeys(testData.get("Description"));
			waitABit(2000);
		 notes.sendKeys(testData.get("Notes"));
			waitABit(2000);
			
	}

	public void saveBtn() {
		waitABit(3000);
		scrollDown(savebtn);
		waitABit(3000);
		savebtn.click();
		waitABit(4000);
	}

	public void newTaskAxn() {
		waitABit(2000);
		newTaskAxn.click();
		waitABit(5000);
		
		
	}

	public void tasktemplate() {
		template.click();
		waitABit(3000);
		Template1.click();
		waitABit(4000);
		
		
	}

	public void dueDate() {
		dueDate0.click();
		waitABit(2000);
		nextMonth.click();	
		waitABit(2000);
		dueDate.click();
		waitABit(2000);
		
		
	}

	public void lobBtnDDL() {
		logActivity.click();
		waitABit(3000);
		//logActivity.sendKeys(testData.get("Description"));
//		logDropDown.click();
//		waitABit(2000);
		logDropDown1.click();
		waitABit(2000);
	}

	public void markasDone() {
		waitABit(3000);
		 MarkAsDone.click();
		 waitABit(4000);
			
	}

	public void followUpCreate() {
		CreateFollowUp.click();
		waitABit(2000);
	}

	public void recuringChckBox() {
		waitABit(3000);
		RecurringChckBox.click();
		waitABit(4000);
	}

	public void recurringDDL() {
		waitABit(2000);
		frquency.click();
		waitABit(3000);
		frequency1.click();
		waitABit(3000);
		month1.click();
		waitABit(3000);
		month2.click();
		waitABit(3000);
		day1.click();
		waitABit(3000);
		day2.click();
		waitABit(3000);
		
	}

	public void addOportunity() {
		waitABit(3000);
		addOportunity.click();
		waitABit(2000);

		
	}

	public void serviceSource(Map<String, String> testData) {
		waitABit(2000);
//		service1.click();
//        service2.click();
//		waitABit(2000);
		source1.click();
		waitABit(2000);
		customerPortalApp.click();
		waitABit(2000);
		accountAlert.sendKeys(testData.get("AccountAlert"));
		accountDes.sendKeys(testData.get("ProblemDescription"));
}

	public void OpportunityType() {
		Residential_RadioBtn.click();
		waitABit(2000);
}

	public void Continue() {
		continuebtn.click();
		waitABit(2000);

	}

	public void noteBtnAxn() {
		waitABit(3000);
		AddNoteAxn.click();
		waitABit(5000);
		
	}

	public void addingNote(Map<String, String> testData) {
		waitABit(3000);
		noteType.sendKeys(testData.get("Notes"));
		waitABit(4000);
		
		
	}

	public void savingNote() {
		saveBtnNotes.click();
		waitABit(2000);
	}

	public void WorkOrderBtn() {
		WorkOrderCsr.click();
		waitABit(2000);
	}

	public void ServiceCategorySubService() {
		DDWOService.click();
		waitABit(2000);
		ValueWOService.click();
		waitABit(2000);
		DDService.click();
		waitABit(5000);
		ValueDDService.click();
		waitABit(2000);
		
	}

	public void addServiceBtn() {
		AddService.click();
		waitABit(2000);
		
		
	}

	public void ServiceDate() {
		waitABit(2000);
		serviceDate.click();
		waitABit(2000);
//		nextMonth.click();
//		waitABit(2000);
		 dateWorkOrder.click();
		 waitABit(2000);
	}

	public void SavingWorkOrder() {
		 saveBtnWorkOrder.click();
		 waitABit(5000);
	}

	public void ViewDetailBtn() {
		ViewDetailsBtn.click();
		waitABit(5000);
		try {
			alertAccount.click();
		}
		 catch (Exception e) {
			 
		 }
	}
		


	public void addOpportunityBtnDetails() {
		AddOpportunityDetails.click();
		 waitABit(2000);
		 for(String newW :getDriver().getWindowHandles()) //iterating on child windows
		    {
		    getDriver().switchTo().window(newW);
		}
		 waitABit(4000);
		    
	}

	public void callButtonViewDetails() {
		
		newCallButton.click();
		waitABit(5000);
	}

	public void calledSourceTarget() {
		 called.click();
			waitABit(2000);
		called1.click();
		waitABit(2000);	
		Source.click();
		waitABit(2000);
		source2.click();
		waitABit(2000);
		Target.click();
		waitABit(2000);
		Target1.click();
		waitABit(2000);
		
	}

	public void savebtnDetail() {
		saved.click();
		waitABit(2000);
	}

	public void detailsWorKOrder() {
		workOrderDetail.click();
		waitABit(2000);
		  for(String agreement :getDriver().getWindowHandles()) //iterating on child windows
		    {
		    getDriver().switchTo().window(agreement);
		}
		    



	}

	public void ComOpportunity() {
		waitABit(2000);
		scrollDown(ComOpportunity);
		ComOpportunity.click();
		
		
	}

	public void RangeTime() {
		RangeTime.click();
		waitABit(2000);
		
	}

	public void DDleadTech() {
		DDleadTech.click();
		waitABit(2000);
		
		valueleadTech.click();
		waitABit(2000);
		
	}

	public void alertmessageCSRDashboard() {
		alertmessageCSRDashboard.click();
		waitABit(2000);
	}

	public void DDSourceAccountOpportunity() {
		 waitABit(4000);
		DDSourceAccountOpportunity.click();
		waitABit(2000);
		ValueDDSourceAccountOpportunity.click();
		waitABit(2000);
		
	}

	public void DDServiceCategoryWO() {
		DDServiceCategoryWO.click();
		waitABit(2000);
		
		ValueDDServiceCategoryWO.click();
		waitABit(2000);
	}

	public void DDServicesWO() {
		DDServicesWO.click();
		waitABit(2000);
		
		DDServicesWO.sendKeys(Keys.DOWN);
		waitABit(2000);
		DDServicesWO.sendKeys(Keys.ENTER);
		waitABit(2000);
	}

	public void TaskName_CSRDashboard(Map<String, String> testData) {
		waitABit(2000);
		TaskName_CSRDashboard.click();
		TaskName_CSRDashboard.sendKeys(testData.get("Description"));
		waitABit(4000);
		
	}

	public void DueDate_CSRDashboard() {
		scrollDown(DueDate_CSRDashboard);
		DueDate_CSRDashboard.click();
		waitABit(2000);
		nextMonth.click();	
		waitABit(2000);
		dueDate.click();
		waitABit(2000);
		//DueDate_CSRDashboard.sendKeys(testData.get("Description"));
		waitABit(2000);
		
	}

	public void Save_CSRDashboard() {
		waitABit(3000);
		scrollDown(Save_CSRDashboard);
		Save_CSRDashboard.click();
		waitABit(2000);
		
	}

	public void Activity_CSRDashboard(Map<String, String> testData) {
		waitABit(3000);
		Activity_CSRDashboard.click();
		Activity_CSRDashboard.sendKeys(testData.get("Description"));
		
	}	
}
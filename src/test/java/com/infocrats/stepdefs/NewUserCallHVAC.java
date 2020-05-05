package com.infocrats.stepdefs;

import com.infocrats.steps.NewUserCallHVACSteps;

import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class NewUserCallHVAC {

	@Steps
	NewUserCallHVACSteps newusercallHVACsteps;

	@When("^select lead branch Information$")
	public void select_lead_branch_Information() {
		newusercallHVACsteps.leadBranchInformation();
	}

	@When("^select source Information$")
	public void select_source_Information() {
		newusercallHVACsteps.ClickOnSource();

	}

	@When("^select primary requested service$")
	public void select_primary_requested_service() throws InterruptedException {
		newusercallHVACsteps.ClickOnPrimaryRequestedService();
	}

	@When("^enters service address \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"$")
	public void enters_service_address(String arg1, String arg2, String arg3, String arg4) throws Exception {
		newusercallHVACsteps.EnterServiceAddress();
	}

	@When("^click on Save button from general info$")
	public void click_on_Save_button_from_general_info() throws InterruptedException {
		newusercallHVACsteps.ClickOnSaveFromOpportunity();
	}

	@When("^Enter Job Description$")
	public void enter_Job_Description() throws Exception {
		newusercallHVACsteps.EnterJobDescription();

	}

	@When("^check flat rate$")
	public void check_flat_rate() throws Exception {
		newusercallHVACsteps.CheckFlatRate();
	}

	@When("^click on Advance Search from Work Order$")
	public void click_on_Advance_Search_from_Work_Order() throws InterruptedException {
		newusercallHVACsteps.ClickAdvanceSearch();
	}

	@When("^Select and click on one Work Order Number$")
	public void select_and_click_on_one_Work_Order_Number() throws InterruptedException {
		newusercallHVACsteps.SelectOneWorkOrder();
	}

	@When("^Select lead employee from DD$")
	public void select_lead_employee_from_DD() throws InterruptedException {
		newusercallHVACsteps.SelectLeadEmployeeInDD();
	}

	@When("^Click on save from Work Order$")
	public void click_on_save_from_Work_Order() throws InterruptedException {
		newusercallHVACsteps.ClickOnSaveFromWorkOrder();
	}

	@When("^Click on Advance Search Button$")
	public void click_on_Advance_Search_Button() throws InterruptedException {
		newusercallHVACsteps.ClickOnAdvanceSearchBtn();
	}

	@When("^Click On First Work Order Number From Work Order$")
	public void click_On_First_Work_Order_Number_From_Work_Order() throws InterruptedException {
		newusercallHVACsteps.ClickOnFirstWorkOrderNumber();
	}

	@When("^Select Order Type From DD$")
	public void select_Order_Type_From_DD() throws InterruptedException {
		newusercallHVACsteps.SelectOrderFromOrderTypeDD();

	}

	@When("^user click on CSR Dashboard$")
	public void user_click_on_CSR_Dashboard() throws InterruptedException {
		newusercallHVACsteps.ClickOnCsrDashboard();

	}

	@When("^user click on Advance Search from CSR Dashboard$")
	public void user_click_on_Advance_Search_from_CSR_Dashboard() throws InterruptedException {
		newusercallHVACsteps.clickOnAdvanceSearchBTN();
	}

	@When("^Select Add Call From Action for the first Account$")
	public void select_Add_Call_From_Action_for_the_first_Account() throws InterruptedException {
		newusercallHVACsteps.ClickOnAddCall();

	}

	@When("^Select Add Call Info$")
	public void select_Add_Call_Info() throws InterruptedException {
		newusercallHVACsteps.SelectCallInfo();
	}

	@When("^Click on Save Buttton From Add Call Tab$")
	public void click_on_Save_Buttton_From_Add_Call_Tab() throws InterruptedException {
		newusercallHVACsteps.ClickOnSaveBtn();

	}

	@When("^Select Add Opportunity From Action for the first Account$")
	public void select_Add_Opportunity_From_Action_for_the_first_Account() throws InterruptedException {
		newusercallHVACsteps.ClickOnAddOpportunityFromAction();
	}

	@When("^Select General Info From Opportunity Info$")
	public void select_General_Info_From_Opportunity_Info() throws InterruptedException {
		newusercallHVACsteps.SelectGeneralInfo();
	}

	@When("^Click on Continue From General Info$")
	public void click_on_Continue_From_General_Info() throws InterruptedException {
		newusercallHVACsteps.ClickContinueFromGenralInfo();
	}

	@When("^Select Add Task From Action for the first Account$")
	public void select_Add_Task_From_Action_for_the_first_Account() throws InterruptedException {
		newusercallHVACsteps.ClickOnAddTaskActionFromAction();
	}

	@When("^Select Task Name, Due Date$")
	public void select_Task_Name_Due_Date() throws InterruptedException {
		newusercallHVACsteps.SelectAddTaskAndDueDateFromGeneralInfo();

	}

	@When("^Click on Save Button$")
	public void click_on_Save_Button() {
		newusercallHVACsteps.ClickSaveBtnGeneralInfo();
	}

	@When("^Select Add Note From Action for the first Account$")
	public void select_Add_Note_From_Action_for_the_first_Account() throws InterruptedException {
		newusercallHVACsteps.ClickOnAddNoteFromAction();
	}

	@When("^Enter Note in the Textfield$")
	public void enter_Note_in_the_Textfield() {
		newusercallHVACsteps.EnterNoteForAddNote();
	}

	@When("^Click on Save Button from Add Note$")
	public void click_on_Save_Button_from_Add_Note() throws InterruptedException {
		newusercallHVACsteps.ClickSaveFromAddNote();
	}

	@When("^Click on Close Button from Add Note$")
	public void click_on_Close_Button_from_Add_Note() {
		newusercallHVACsteps.ClickCloseBtnFromAddNote();

	}

	@When("^Select Create Workorder From Action for the first Account$")
	public void select_Create_Workorder_From_Action_for_the_first_Account() throws InterruptedException {
		newusercallHVACsteps.ClickCreateWorkorderFRomAction();
	}

	@When("^Select Service Category & Services$")
	public void select_Service_Category_Services() throws InterruptedException {
		newusercallHVACsteps.SelectServiceCategoryAndServices();
	}

	@When("^Click On Add Button$")
	public void click_On_Add_Button() throws InterruptedException {
		newusercallHVACsteps.ClickOnAddBTN();
	}

	@When("^Enter Service Date$")
	public void enter_Service_Date() throws InterruptedException {
		newusercallHVACsteps.EnterServiceDate();
	}

	@When("^Select Detail Page From Action for the first Account$")
	public void select_Detail_Page_From_Action_for_the_first_Account() throws InterruptedException {
		newusercallHVACsteps.ClickDetailPageFRomAction();
	}
	@When("^Close Alert$")
	public void close_Alert() {
		newusercallHVACsteps.clickCloseForAlert();
	}

	@When("^Enter Note$")
	public void enter_Note() {
		newusercallHVACsteps.EnterNoteForDetailPage();
	}

	@When("^Click On Save Button$")
	public void click_On_Save_Button() throws InterruptedException {
		newusercallHVACsteps.ClickSaveOnDetailPage();
	}

	@When("^User Click On Customer$")
	public void user_Click_On_Customer() {
		newusercallHVACsteps.ClickOnCustomer();
	}

	@When("^Select Account From The DD List$")
	public void select_Account_From_The_DD_List() {
		newusercallHVACsteps.ClickOnAccountFromCustomer();
	}

	@When("^Click on Add Account$")
	public void click_on_Add_Account() throws InterruptedException {
		newusercallHVACsteps.ClickOnAddAccount();
	}

	@When("^Enter Contact Type \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" Source$")
	public void enter_Contact_Type_Source(String arg1, String arg2, String arg3) throws Exception {
		newusercallHVACsteps.EnterCustomerInfo();
	}

	@When("^Click on Save	From Add Account$")
	public void click_on_Save_From_Add_Account() {
		newusercallHVACsteps.ClickSaveFromAddAccount();
	}

	@When("^Click On Advance Search From Account$")
	public void click_On_Advance_Search_From_Account() throws InterruptedException {
		newusercallHVACsteps.CLickAdvanceSearchFromAccount();
	}

	@When("^Click On Add Opportunity Icon From Action For First Account$")
	public void click_On_Add_Opportunity_Icon_From_Action_For_First_Account() {
		newusercallHVACsteps.ClickAddOpportunityFromAction();

	}

	@When("^Select Department,Source,Opportunity Type$")
	public void select_Department_Source_Opportunity_Type() throws InterruptedException {
		newusercallHVACsteps.SelectTestDataForCustomerAddOpportunity();
	}

	@When("^Click On View Icon From Action For First Account$")
	public void click_On_View_Icon_From_Action_For_First_Account() throws InterruptedException {
		newusercallHVACsteps.ClickViewIconFromAction();

	}

	@When("^Click On Phone Sales From Action For First Account And Select General Info$")
	public void click_On_Phone_Sales_From_Action_For_First_Account_And_Select_General_Info()
			throws InterruptedException {
		newusercallHVACsteps.ClickOnPhoneSalesIconAndSelectgeneralInfo();
	}

	@When("^Select Customer From The DD List$")
	public void select_Customer_From_The_DD_List() throws InterruptedException {
		newusercallHVACsteps.ClickOnCompanyFromCustomer();
	}

	@When("^Click On Add	Company$")
	public void click_On_Add_Company() throws InterruptedException {
		newusercallHVACsteps.ClickOnAddAccount();
	}

	@When("^Enter Test Data For Add Company$")
	public void enter_Test_Data_For_Add_Company() throws InterruptedException {
		newusercallHVACsteps.EnterTestDataForAddCompany();
	}

	@When("^click on Advance Search from Add Company$")
	public void click_on_Advance_Search_from_Add_Company() throws InterruptedException {
		newusercallHVACsteps.ClickAdvanceSearch();
	}

	@When("^Click On Add Opportunity Icon From Action Company$")
	public void click_On_Add_Opportunity_Icon_From_Action_Company() {
		newusercallHVACsteps.ClickOnAddOpportunityForCompany();
	}

	@When("^Select Account From DD$")
	public void select_Account_From_DD() {
		newusercallHVACsteps.SelectAccountFromCompany();

	}

	@When("^Click on Continue From Add Opportunity$")
	public void click_on_Continue_From_Add_Opportunity() {
		newusercallHVACsteps.ClickContinueFromAddOpportunityForCompany();
	}

	@When("^Click On View Icon From Action Company$")
	public void click_On_View_Icon_From_Action_Company() throws InterruptedException {
		newusercallHVACsteps.ClickOnViewFromActionForCompany();

	}

	@When("^Click On Delete Icon From Action Company$")
	public void click_On_Delete_Icon_From_Action_Company() {
		newusercallHVACsteps.ClickOnDeleteFromActionForCompany();
	}

	@When("^Confirm The Alert$")
	public void confirm_The_Alert() {
		newusercallHVACsteps.ConfirmTheDeleteAlert();
	}

	@When("^Cancel The Alert$")
	public void cancel_The_Alert() {
		newusercallHVACsteps.CancelTheDeleteAlert();
	}

	@When("^Select Contact From The DD List$")
	public void select_Contact_From_The_DD_List() {
		newusercallHVACsteps.ClickContactFromCustomerDD();
	}

	@When("^click on Add Contact$")
	public void click_on_Add_Contact() {
		newusercallHVACsteps.ClickOnAddContact();
	}

	@When("^Enter Test Data To Add Contact$")
	public void enter_Test_Data_To_Add_Contact() throws InterruptedException {
		newusercallHVACsteps.EnterTestDataForAddContact();
	}

	@When("^Click on Close	From Add Account$")
	public void click_on_Close_From_Add_Account() {
		newusercallHVACsteps.ClickCloseBtnFromAddContact();
	}

	@When("^Click On Add Opportunity For Contact$")
	public void click_On_Add_Opportunity_For_Contact() throws InterruptedException {
		newusercallHVACsteps.ClickonAddOpportunityForContact();
	}

	@When("^Select or Enter General Test Data For Add Opportunity For Contact$")
	public void select_or_Enter_General_Test_Data_For_Add_Opportunity_For_Contact() throws InterruptedException {
		newusercallHVACsteps.EnterTestDataOfAddOpportunityForContact();
	}

	@When("^Click On Save Button For Add Opportunity For Contact$")
	public void click_On_Save_Button_For_Add_Opportunity_For_Contact() {
		newusercallHVACsteps.ClickonSaveButtonForAddOpportunityContact();
	}

	@When("^Click On View For Contact From Action$")
	public void click_On_View_For_Contact_From_Action() throws InterruptedException {
		newusercallHVACsteps.CLickOnViewContactFromAction();

	}

	@When("^Click On Delete For Contact From Action$")
	public void click_On_Delete_For_Contact_From_Action() {
		newusercallHVACsteps.CLickOnDeleteContactFromAction();
	}

	@When("^Confirm Delete Alert For Contact$")
	public void confirm_Delete_Alert_For_Contact() {
		newusercallHVACsteps.ConfirmDeleteForContact();
	}

	@When("^Decline Delete Alert For Contact$")
	public void decline_Delete_Alert_For_Contact() {
		newusercallHVACsteps.DeclineDeleteAlertForContact();
	}

	@When("^Select Opportunity From The DD List$")
	public void select_Opportunity_From_The_DD_List() {
		newusercallHVACsteps.SelectopportunityFromCustomerDD();
	}

	@When("^Click on Add Opportunity Button$")
	public void click_on_Add_Opportunity_Button() throws InterruptedException {
		newusercallHVACsteps.ClickOnAddAccount();
	}

	@When("^Click On New Account From Add Opportunity$")
	public void click_On_New_Account_From_Add_Opportunity() {
		newusercallHVACsteps.ClickNewACcountBtnInAddOpportunity();
	}

	@When("^Select or Enter General Test Data For Add Opportunity$")
	public void select_or_Enter_General_Test_Data_For_Add_Opportunity() throws InterruptedException {
		newusercallHVACsteps.EnterTestDataOfAddOpportunityForContact();
	}

	@When("^Click on Save	From Add Opportunity$")
	public void click_on_Save_From_Add_Opportunity() {
		newusercallHVACsteps.ClickonSaveButtonForAddOpportunityContact();
	}

	@When("^Select Lead From The DD List$")
	public void select_Lead_From_The_DD_List() throws InterruptedException {
		newusercallHVACsteps.SelectLeadFromCustomerDD();
	}

	@When("^Click on Add Lead Button$")
	public void click_on_Add_Lead_Button() {
		newusercallHVACsteps.ClickAddLeadBtn();
	}

	@When("^Select Or Enter General Test Info For Lead$")
	public void select_Or_Enter_General_Test_Info_For_Lead() {
		newusercallHVACsteps.SelectOrEnterInfoForAddLead();
	}

	@When("^Click on Save	From Add Lead$")
	public void click_on_Save_From_Add_Lead() {
		newusercallHVACsteps.ClickSaveFromAddAccountddAccount();
	}

	@When("^Select Database From The DD List$")
	public void select_Database_From_The_DD_List() {
		newusercallHVACsteps.selectDatabaseFromCustomerDD();
	}

	@When("^Click on Add Database Entry Button$")
	public void click_on_Add_Database_Entry_Button() {
		newusercallHVACsteps.clickAddDatabaseEntryBtn();
	}

	@When("^Select Or Enter General Test Info For Database$")
	public void select_Or_Enter_General_Test_Info_For_Database() {
		newusercallHVACsteps.enterGeneralTestDataForAddDatabaseEntry();
	}

	@When("^Click on Save	From Add Database Ezoom$")
	public void click_on_Save_From_Add_Database_Ezoom() {
		newusercallHVACsteps.ClickSaveFromAddAccount();

	}

}

package com.infocrats.stepdefs;

import com.infocrats.steps.newUserTermiteResidentialSteps;
import com.infocrats.utils.Log;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class newUserTermiteResidentialStepDefs {

	@Steps
	newUserTermiteResidentialSteps newusertermiteresidentialsteps;
	
	@When("^user clicked on call tab button$")
	public void user_clicked_on_call_tab_btn() throws InterruptedException {
	
		newusertermiteresidentialsteps.clickOnCallTab();
		Log.info("Clicked on Call Tab");
	}
	
	@When("^enters lead info \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" in form$")
	public void enters_lead_info_in_form(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Exception {
		newusertermiteresidentialsteps.leadDetailsInfo();
	}

	@When("^select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form$")
	public void select_lead_branch_BranchName_Department_Primary_Reason_Of_Call_Service_Source_details_in_form() throws Exception {
		newusertermiteresidentialsteps.branchDetails();
	}

	@Then("^User Add Account Alert and Account Description details$")
	public void user_Add_Account_Alert_and_Account_Description_details() throws Exception {
		newusertermiteresidentialsteps.accAlertDescDetails();
	}

	@Then("^User select opportunity type$")
	public void user_OpportunityType() throws Exception {
		newusertermiteresidentialsteps.oppType();
	}

	@Then("^User Clicks On Continue btn$")
	public void user_Clicks_On_Continue_btn() throws Exception {
		newusertermiteresidentialsteps.continueBtn();
	}
	
	@Then("^User creates Lead$")
	public void user_CreatesLead() throws Exception {
		newusertermiteresidentialsteps.createLeadBtn();
	}
	
	@Then("^User add Address for the contact$")
	public void user_add_Address_for_the_contact() throws Exception {
		newusertermiteresidentialsteps.addAddressContact();
	}

	@Then("^User Selects Package Bundle, Service Frequency and Billing Frequency$")
	public void user_Selects_Package_Bundle_Service_Frequency_and_Billing_Frequency() throws Exception {
		newusertermiteresidentialsteps.PackageFreqBillDDL();
	}

	@Then("^User selects the Package and Clicks on Add Button$")
	public void user_selects_the_Package_and_Clicks_on_Add_Button() throws Exception {
		newusertermiteresidentialsteps.PackageChckBoxAddBtn();
	}

	@Then("^User clicks on Save And Sign Agreement$")
	public void user_clicks_on_Save_And_Sign_Agreement() throws Exception {
		newusertermiteresidentialsteps.SaveSignAgreement();
	}

	@Then("^User Clicks on Save And Con Setup$")
	public void user_Clicks_on_Save_And_Con_Setup() throws Exception {
		newusertermiteresidentialsteps.SaveContSetup();
	}

	@Then("^User Selects Service from DDL and Clicks on Add Button$")
	public void user_Selects_Service_from_DDL_and_Clicks_on_Add_Button() throws Exception {
		newusertermiteresidentialsteps.serviceDDLAddBtn();
	}

	@Then("^User selects from Frequency DDL Clicks Ok and Selects Schedule$")
	public void user_selects_from_Frequency_DDL_Clicks_Ok_and_Selects_Schedule() throws Exception {
		newusertermiteresidentialsteps.freqDDLClicksOkSchedule();
	}

	@Then("^User Selects primary Route and Clicks on Save And Generate Btn$")
	public void user_Selects_primary_Route_and_Clicks_on_Save_And_Generate_Btn() throws Exception {
		newusertermiteresidentialsteps.RouteSelectSaveAndGenerate();
	}

	@Then("^User Selects Start date and End Date and click on Generate Online Work Order$")
	public void user_Selects_Start_date_and_End_Date_and_click_on_Generate_Online_Work_Order() throws Exception {
		newusertermiteresidentialsteps.StartDateGenerateOnlineWorkOrder();
	}

	@Then("^User Selects all generated work order CheckBox and Clicks on Publish Online$")
	public void user_Selects_all_generated_work_order_CheckBox_and_Clicks_on_Publish_Online() throws Exception {
		newusertermiteresidentialsteps.generateWorkOrderPublishOnline();
	}

	@Then("^User clicks on Appointment Tab and Select Service Appointment$")
	public void user_clicks_on_Appointment_Tab_and_Select_Service_Appointment() throws Exception {
		newusertermiteresidentialsteps.AppointmentTabServiceAppointment();
	}

	@Then("^User selects the desired opportunity and clicks on enter current Time$")
	public void user_selects_the_desired_opportunity_and_clicks_on_enter_current_Time() throws Exception {
		newusertermiteresidentialsteps.desiredAppointEnterCurTime();
	}

	@Then("^User Clicks on Save and Continue Button and Clicks on Continue$")
	public void user_Clicks_on_Save_and_Continue_Button_and_Clicks_on_Continue() throws Exception {
		newusertermiteresidentialsteps.SaveContBtnConBtn();
	}

	@Then("^User Sign Agreement and Select Date$")
	public void user_Sign_Agreement_and_Select_Date() throws Exception {
		newusertermiteresidentialsteps.SignAGreementDateBtn();
	}

	@Then("^Select Payment Mode and Clicks on Save And Continue Button$")
	public void select_Payment_Mode_and_Clicks_on_Save_And_Continue_Button() throws Exception {
		newusertermiteresidentialsteps.PaymentModeSaveAndCont();
	}

	@Then("^User gives Technician and Customer Sign$")
	public void user_gives_Technician_and_Customer_Sign() throws Exception {
		newusertermiteresidentialsteps.TechnicianCustomerSign();
	}

	@Then("^User clicks on Submit and Clicks on Send Mail$")
	public void user_clicks_on_Submit_and_Clicks_on_Send_Mail() throws Exception {
		newusertermiteresidentialsteps.SubmitSendMail();
	}
	
	@Then("^User clicks on Service Bundle Radio$")
	public void user_clicks_on_Service_Bundle_Radio() throws Exception {
		newusertermiteresidentialsteps.serviceBundleRadio();
	}

	@Then("^User selects bundle from DDL and Input Billing Frequency$")
	public void user_selects_bundle_from_DDL_and_Input_Billing_Frequency() throws Exception {
		newusertermiteresidentialsteps.serviceBundleDDLBillingFreq();
	}

	@Then("^User clicks on Add Bundle Button$")
	public void user_clicks_on_Add_Bundle_Button() throws Exception {
		newusertermiteresidentialsteps.AddButtonBundle();
	}

	@Then("^User selects the checkbox for reqiured service Bundle$")
	public void user_selects_the_checkbox_for_reqiured_service_Bundle() throws Exception {
		newusertermiteresidentialsteps.ChckboxBundle();
	}

	@Then("^User selects bundle from service DDL and Clicks on Add Button$")
	public void user_selects_bundle_from_service_DDL_and_Clicks_on_Add_Button() throws Exception {
		newusertermiteresidentialsteps.serviceDDLBundleAddBtn();
	}

	@Then("^User clicks on generate and Publish$")
	public void user_clicks_on_generate_and_Publish() throws Exception {
		newusertermiteresidentialsteps.generatePublish();
	}

	@Then("^User Clicks on Advance Search and Select Create Setup Button for desired Opportunity$")
	public void user_Clicks_on_Advance_Search_and_Select_Create_Setup_Button_for_desired_Opportunity() throws Exception {
		newusertermiteresidentialsteps.advSearchCreateSetupDesiredOpportunity();
	}

	@Then("^User select desired Frequency and Schedule$")
	public void user_select_desired_Frequency_and_Schedule() throws Exception {
		newusertermiteresidentialsteps.frerquencySchedule();
	}

	@Then("^User selects the Setup Start Date$")
	public void user_selects_the_Setup_Start_Date() throws Exception {
		newusertermiteresidentialsteps.SetupStartDate();
	}
	
	@Then("^User Clicks on Mark As Lost$")
	public void user_MarkAsLost() throws Exception {
		newusertermiteresidentialsteps.MarkAsLost();
	}
	
	@Then("^User Selects Reason and Description And Save$")
	public void reasonDescription() throws Exception {
		newusertermiteresidentialsteps.reasonDescSave();
	}
	
	@Then("^User Clicks on Save btn$")
	public void savebtnOpportunity() throws Exception {
		newusertermiteresidentialsteps.saveBtnOpportunity();
	}

	
	@Then("^User Clicks on Save and Proposal$")
	public void saveProposal() throws Exception {
		newusertermiteresidentialsteps.saveandProposal();
	}

	@Then("^User Clicks on Send Proposal$")
	public void sendProposal() throws Exception {
		newusertermiteresidentialsteps.sendProposal();
	}
	
	
	@Then("^User Clicks on MarkAsLost Send Proposal$")
	public void markAsLostSendProposal() throws Exception {
		newusertermiteresidentialsteps.MarkAsLostsendProposal();
	}
	
	@Then("^User Clicks Send Agreement and Clicks on Send Agreement Link$")
	public void clickSendAgreementSendMail() throws Exception {
		newusertermiteresidentialsteps.sendAgreementSendMail();
	}
	
	@Then("^REDIRECT browser to Gmail$")
	public void open_new_tap_in_the_browser() throws Exception {
		newusertermiteresidentialsteps.newChromeTab();
	}

	@Then("^Open Gmail with Credentials$")
	public void open_gmail_with_credentials() throws Exception {
		newusertermiteresidentialsteps.openGmail();
	}

	@Then("^Open agreement mail$")
	public void open_agreement_mail() throws Exception {
		newusertermiteresidentialsteps.openMail();
	}

	@Then("^Click on agreement link$")
	public void click_on_agreement_link() throws Exception {
		newusertermiteresidentialsteps.openAgreement();
}
	
	@Then("^User Redirects to Dashboard$")
	public void user_redirectsToDashboard() {
		newusertermiteresidentialsteps.dashBoard();
	}
	
	@Then("^Clicks on Complete$")
	public void user_clicks_on_Complete() throws Exception {
		newusertermiteresidentialsteps.Complete();
	}

	
	@Then("^User Agree Terms and Give Name$")
	public void agreetermsName() throws Exception {
		newusertermiteresidentialsteps.agreeChckBoxName();
	}
	
	@Then("^User clicks on customer opportunity$")
	public void customerOpportunity() throws Exception {
		newusertermiteresidentialsteps.customerOpportunity();
	}
	
	@Then("^User Clicks on Advance search$")
	public void advanceSearch() throws Exception {
		newusertermiteresidentialsteps.advanceSearch();
	}
	
	@Then("^User clicks on Non Std Services$")
	public void user_clicks_on_Non_Std_Services() throws Exception {
		newusertermiteresidentialsteps.NonStdServices();
	}

	@Then("^User selects Department and Add Service Name Frequencies$")
	public void user_selects_Department_and_Add_Service_Name_Frequencies() throws Exception {
		newusertermiteresidentialsteps.deptServiceName();
	}

	@Then("^User Click on Add Button$")
	public void user_Click_on_Add_Button() throws Exception {
		newusertermiteresidentialsteps.addButton();
	}

	@Then("^User selects the service and Enter price Accordingly$")
	public void user_selects_the_service_and_Enter_price_Accordingly() throws Exception {
		newusertermiteresidentialsteps.selectServicePrice();
	}
	
	@Then("^User selects bundle from Non std service DDL and Clicks on Add Button$")
	public void user_selects_the_NonStdservice_and_add() throws Exception {
		newusertermiteresidentialsteps.nonStdserviceAdd();
	}
	
	@Then("^User selects the Setup service Date$")
	public void user_selects_the_setupServiceDate() throws Exception {
		newusertermiteresidentialsteps.serviceStartDate();
	}
	
	@Then("^User Selects primary Route and Clicks on Generate and Publish$")
	public void user_selects_the_RouteandClickGenerateAndPublish() throws Exception {
		newusertermiteresidentialsteps.RoutegeneratePublishBtn();
	}
	
	@Then("^User Clicks on Save and Continue Button$")
	public void user_Clicks_on_Save_and_Continue_Button() throws Exception {
		newusertermiteresidentialsteps.savecontToNext();
	}

	@Then("^Clicks on save Continue$")
	public void clicks_on_save_Continue() throws Exception {
		newusertermiteresidentialsteps.saveContAgainn();
	}

	@Then("^User payment Method and Save Cont$")
	public void user_payment_Method_and_Save_Cont() throws Exception {
		newusertermiteresidentialsteps.PaymethodSaveCont(); 
	}

	@Then("^User gives customer Technician Sign$")
	public void user_gives_customer_Technician_Sign() throws Exception {
		newusertermiteresidentialsteps.customerTechnicianSign();
	}

	@Then("^User clicks on Submit btn and Clicks on Send Mail$")
	public void user_clicks_on_Submit_btn_and_Clicks_on_Send_Mail() throws Exception {
		newusertermiteresidentialsteps.submitSendMail();
	}

	@Then("^User clicks on Schedule estimation$")
	public void user_clicks_on_Schedule_estimation() throws Exception {
		newusertermiteresidentialsteps.ScheduleEstimation();
	}

	@Then("^User Click on Assigned to$")
	public void user_Click_on_Assigned_to() throws Exception {
		newusertermiteresidentialsteps.AssignedToEmp();
	}

	@Then("^User click on save Button$")
	public void user_click_on_save_Button() throws Exception {
		newusertermiteresidentialsteps.saveBtnScheduleEst();
	}

	@Then("^User clicks on Save and Continue$")
	public void user_clicks_on_Save_and_Continue() throws Exception {
		newusertermiteresidentialsteps.saveAndContBtn();
	}

	@Then("^Click on Continue$")
	public void click_on_Continue() throws Exception {
		newusertermiteresidentialsteps.continueBtn();
	}

	@Then("^User add a desired service$")
	public void user_add_a_desired_service() throws Exception {
		newusertermiteresidentialsteps.AddingdesiredService();
	}

	@Then("^User selects the service and Clicks on Save and View Agreement$")
	public void user_selects_the_service_and_Clicks_on_Save_and_View_Agreement() throws Exception {
		newusertermiteresidentialsteps.selectTheServiceSaveViewAgreement();
	}

	@Then("^User clicks on save and Continue$")
	public void user_clicks_on_save_and_Continue() throws Exception {
		newusertermiteresidentialsteps.saveContinue();
	}

	@Then("^User agree terms enter Name and Sign$")
	public void user_agree_terms_enter_Name_and_Sign() throws Exception {
		newusertermiteresidentialsteps.agreeTermsNameSign();
	}

	@Then("^User clicks on Save and Continue btn again$")
	public void user_clicks_on_Save_and_Continue_btn_again() throws Exception {
		newusertermiteresidentialsteps.ContSaveBtnx();
	}

	@Then("^User clicks on Send Mail$")
	public void user_clicks_on_Send_Mail() throws Exception {
		newusertermiteresidentialsteps.sendMailBtn();
	}
	@Then("^User selects desired Opp from Sales$")
	public void userdesiredOpportunity() throws Exception {
		newusertermiteresidentialsteps.desiredOpp();
	}
	
	@Then("^User clicks on Save and View Proposal$")
	public void saveProposalSumma() throws Exception {
		newusertermiteresidentialsteps.saveProposal();
	}
	
	@Then("^User clicks on Send Proposal in service Summary$")
	public void sendProposall() throws Exception {
		newusertermiteresidentialsteps.sendpsll();
	}

	@Then("^User clicks on Send Proposal Mail$")
	public void sendMailProposal() throws Exception {
		newusertermiteresidentialsteps.sendProposalMail();
	}
	@Then("^User clicks on Mark as Lost$")
	public void user_clicks_on_Mark_as_Lost() throws Exception {
		newusertermiteresidentialsteps.markAsLostBtn();
	}
	
	@Then("^User click on Range Radio Button and select the desired time Range$")
	public void user_clicksOnRangeTimeDesiredRange() throws Exception {
		newusertermiteresidentialsteps.rangeTimeTimeRange();
	}
	
	@Then("^User Click on Field Radio Button$")
	public void FieldRadioButton() {
		newusertermiteresidentialsteps.FieldradioBtn();
	}
	
	@Then("^User click on MarkAsLost before Save Schedule Estimation$")
	public void markedAsLostSave() {
		newusertermiteresidentialsteps.markedAsLostbtnSE();
	}
	


	
}
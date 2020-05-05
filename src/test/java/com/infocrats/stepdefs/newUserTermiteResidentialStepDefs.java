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
	public void enters_lead_info_in_form(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
		newusertermiteresidentialsteps.leadDetailsInfo();
	}

	@When("^select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form$")
	public void select_lead_branch_BranchName_Department_Primary_Reason_Of_Call_Service_Source_details_in_form() {
		newusertermiteresidentialsteps.branchDetails();
	}

	@Then("^User Add Account Alert and Account Description details$")
	public void user_Add_Account_Alert_and_Account_Description_details() {
		newusertermiteresidentialsteps.accAlertDescDetails();
	}

	@Then("^User select opportunity type$")
	public void user_OpportunityType() {
		newusertermiteresidentialsteps.oppType();
	}

	@Then("^User Clicks On Continue btn$")
	public void user_Clicks_On_Continue_btn() {
		newusertermiteresidentialsteps.continueBtn();
	}
	
	@Then("^User creates Lead$")
	public void user_CreatesLead() {
		newusertermiteresidentialsteps.createLeadBtn();
	}
	
	@Then("^User add Address for the contact$")
	public void user_add_Address_for_the_contact() {
		newusertermiteresidentialsteps.addAddressContact();
	}

	@Then("^User Selects Package Bundle, Service Frequency and Billing Frequency$")
	public void user_Selects_Package_Bundle_Service_Frequency_and_Billing_Frequency() {
		newusertermiteresidentialsteps.PackageFreqBillDDL();
	}

	@Then("^User selects the Package and Clicks on Add Button$")
	public void user_selects_the_Package_and_Clicks_on_Add_Button() {
		newusertermiteresidentialsteps.PackageChckBoxAddBtn();
	}

	@Then("^User clicks on Save And Sign Agreement$")
	public void user_clicks_on_Save_And_Sign_Agreement() {
		newusertermiteresidentialsteps.SaveSignAgreement();
	}

	@Then("^User Clicks on Save And Con Setup$")
	public void user_Clicks_on_Save_And_Con_Setup() {
		newusertermiteresidentialsteps.SaveContSetup();
	}

	@Then("^User Selects Service from DDL and Clicks on Add Button$")
	public void user_Selects_Service_from_DDL_and_Clicks_on_Add_Button() {
		newusertermiteresidentialsteps.serviceDDLAddBtn();
	}

	@Then("^User selects from Frequency DDL Clicks Ok and Selects Schedule$")
	public void user_selects_from_Frequency_DDL_Clicks_Ok_and_Selects_Schedule() {
		newusertermiteresidentialsteps.freqDDLClicksOkSchedule();
	}

	@Then("^User Selects primary Route and Clicks on Save And Generate Btn$")
	public void user_Selects_primary_Route_and_Clicks_on_Save_And_Generate_Btn() {
		newusertermiteresidentialsteps.RouteSelectSaveAndGenerate();
	}

	@Then("^User Selects Start date and End Date and click on Generate Online Work Order$")
	public void user_Selects_Start_date_and_End_Date_and_click_on_Generate_Online_Work_Order() {
		newusertermiteresidentialsteps.StartDateGenerateOnlineWorkOrder();
	}

	@Then("^User Selects all generated work order CheckBox and Clicks on Publish Online$")
	public void user_Selects_all_generated_work_order_CheckBox_and_Clicks_on_Publish_Online() {
		newusertermiteresidentialsteps.generateWorkOrderPublishOnline();
	}

	@Then("^User clicks on Appointment Tab and Select Service Appointment$")
	public void user_clicks_on_Appointment_Tab_and_Select_Service_Appointment() {
		newusertermiteresidentialsteps.AppointmentTabServiceAppointment();
	}

	@Then("^User selects the desired opportunity and clicks on enter current Time$")
	public void user_selects_the_desired_opportunity_and_clicks_on_enter_current_Time() {
		newusertermiteresidentialsteps.desiredAppointEnterCurTime();
	}

	@Then("^User Clicks on Save and Continue Button and Clicks on Continue$")
	public void user_Clicks_on_Save_and_Continue_Button_and_Clicks_on_Continue() {
		newusertermiteresidentialsteps.SaveContBtnConBtn();
	}

	@Then("^User Sign Agreement and Select Date$")
	public void user_Sign_Agreement_and_Select_Date() {
		newusertermiteresidentialsteps.SignAGreementDateBtn();
	}

	@Then("^Select Payment Mode and Clicks on Save And Continue Button$")
	public void select_Payment_Mode_and_Clicks_on_Save_And_Continue_Button() {
		newusertermiteresidentialsteps.PaymentModeSaveAndCont();
	}

	@Then("^User gives Technician and Customer Sign$")
	public void user_gives_Technician_and_Customer_Sign() {
		newusertermiteresidentialsteps.TechnicianCustomerSign();
	}

	@Then("^User clicks on Submit and Clicks on Send Mail$")
	public void user_clicks_on_Submit_and_Clicks_on_Send_Mail() {
		newusertermiteresidentialsteps.SubmitSendMail();
	}
	
	@Then("^User clicks on Service Bundle Radio$")
	public void user_clicks_on_Service_Bundle_Radio() {
		newusertermiteresidentialsteps.serviceBundleRadio();
	}

	@Then("^User selects bundle from DDL and Input Billing Frequency$")
	public void user_selects_bundle_from_DDL_and_Input_Billing_Frequency() {
		newusertermiteresidentialsteps.serviceBundleDDLBillingFreq();
	}

	@Then("^User clicks on Add Bundle Button$")
	public void user_clicks_on_Add_Bundle_Button() {
		newusertermiteresidentialsteps.AddButtonBundle();
	}

	@Then("^User selects the checkbox for reqiured service Bundle$")
	public void user_selects_the_checkbox_for_reqiured_service_Bundle() {
		newusertermiteresidentialsteps.ChckboxBundle();
	}

	@Then("^User selects bundle from service DDL and Clicks on Add Button$")
	public void user_selects_bundle_from_service_DDL_and_Clicks_on_Add_Button() {
		newusertermiteresidentialsteps.serviceDDLBundleAddBtn();
	}

	@Then("^User clicks on generate and Publish$")
	public void user_clicks_on_generate_and_Publish() {
		newusertermiteresidentialsteps.generatePublish();
	}

	@Then("^User Clicks on Advance Search and Select Create Setup Button for desired Opportunity$")
	public void user_Clicks_on_Advance_Search_and_Select_Create_Setup_Button_for_desired_Opportunity() {
		newusertermiteresidentialsteps.advSearchCreateSetupDesiredOpportunity();
	}

	@Then("^User select desired Frequency and Schedule$")
	public void user_select_desired_Frequency_and_Schedule() {
		newusertermiteresidentialsteps.frerquencySchedule();
	}

	@Then("^User selects the Setup Start Date$")
	public void user_selects_the_Setup_Start_Date() {
		newusertermiteresidentialsteps.SetupStartDate();
	}
	
	@Then("^User Clicks on Mark As Lost$")
	public void user_MarkAsLost() {
		newusertermiteresidentialsteps.MarkAsLost();
	}
	
	@Then("^User Selects Reason and Description And Save$")
	public void reasonDescription() {
		newusertermiteresidentialsteps.reasonDescSave();
	}
	
	@Then("^User Clicks on Save btn$")
	public void savebtnOpportunity() {
		newusertermiteresidentialsteps.saveBtnOpportunity();
	}

	
	@Then("^User Clicks on Save and Proposal$")
	public void saveProposal() {
		newusertermiteresidentialsteps.saveandProposal();
	}

	@Then("^User Clicks on Send Proposal$")
	public void sendProposal() {
		newusertermiteresidentialsteps.sendProposal();
	}
	
	
	@Then("^User Clicks on MarkAsLost Send Proposal$")
	public void markAsLostSendProposal() {
		newusertermiteresidentialsteps.MarkAsLostsendProposal();
	}
	
	@Then("^User Clicks Send Agreement and Clicks on Send Agreement Link$")
	public void clickSendAgreementSendMail() {
		newusertermiteresidentialsteps.sendAgreementSendMail();
	}
	
	@Then("^REDIRECT browser to Gmail$")
	public void open_new_tap_in_the_browser() {
		newusertermiteresidentialsteps.newChromeTab();
	}

	@Then("^Open Gmail with Credentials$")
	public void open_gmail_with_credentials() {
		newusertermiteresidentialsteps.openGmail();
	}

	@Then("^Open agreement mail$")
	public void open_agreement_mail() {
		newusertermiteresidentialsteps.openMail();
	}

	@Then("^Click on agreement link$")
	public void click_on_agreement_link() {
		newusertermiteresidentialsteps.openAgreement();
}
	
	@Then("^User Redirects to Dashboard$")
	public void user_redirectsToDashboard() {
		newusertermiteresidentialsteps.dashBoard();
	}
	
	@Then("^Clicks on Complete$")
	public void user_clicks_on_Complete() {
		newusertermiteresidentialsteps.Complete();
	}

	
	@Then("^User Agree Terms and Give Name$")
	public void agreetermsName() {
		newusertermiteresidentialsteps.agreeChckBoxName();
	}
	
	@Then("^User clicks on customer opportunity$")
	public void customerOpportunity() {
		newusertermiteresidentialsteps.customerOpportunity();
	}
	
	@Then("^User Clicks on Advance search$")
	public void advanceSearch() {
		newusertermiteresidentialsteps.advanceSearch();
	}
	
	@Then("^User clicks on Non Std Services$")
	public void user_clicks_on_Non_Std_Services() {
		newusertermiteresidentialsteps.NonStdServices();
	}

	@Then("^User selects Department and Add Service Name Frequencies$")
	public void user_selects_Department_and_Add_Service_Name_Frequencies() {
		newusertermiteresidentialsteps.deptServiceName();
	}

	@Then("^User Click on Add Button$")
	public void user_Click_on_Add_Button() {
		newusertermiteresidentialsteps.addButton();
	}

	@Then("^User selects the service and Enter price Accordingly$")
	public void user_selects_the_service_and_Enter_price_Accordingly() {
		newusertermiteresidentialsteps.selectServicePrice();
	}
	
	@Then("^User selects bundle from Non std service DDL and Clicks on Add Button$")
	public void user_selects_the_NonStdservice_and_add() {
		newusertermiteresidentialsteps.nonStdserviceAdd();
	}
	
	@Then("^User selects the Setup service Date$")
	public void user_selects_the_setupServiceDate() {
		newusertermiteresidentialsteps.serviceStartDate();
	}
	
	@Then("^User Selects primary Route and Clicks on Generate and Publish$")
	public void user_selects_the_RouteandClickGenerateAndPublish() {
		newusertermiteresidentialsteps.RoutegeneratePublishBtn();
	}
	
	@Then("^User Clicks on Save and Continue Button$")
	public void user_Clicks_on_Save_and_Continue_Button() {
		newusertermiteresidentialsteps.savecontToNext();
	}

	@Then("^Clicks on save Continue$")
	public void clicks_on_save_Continue() {
		newusertermiteresidentialsteps.saveContAgainn();
	}

	@Then("^User payment Method and Save Cont$")
	public void user_payment_Method_and_Save_Cont() {
		newusertermiteresidentialsteps.PaymethodSaveCont(); 
	}

	@Then("^User gives customer Technician Sign$")
	public void user_gives_customer_Technician_Sign() {
		newusertermiteresidentialsteps.customerTechnicianSign();
	}

	@Then("^User clicks on Submit btn and Clicks on Send Mail$")
	public void user_clicks_on_Submit_btn_and_Clicks_on_Send_Mail() {
		newusertermiteresidentialsteps.submitSendMail();
	}

	@Then("^User clicks on Schedule estimation$")
	public void user_clicks_on_Schedule_estimation() {
		newusertermiteresidentialsteps.ScheduleEstimation();
	}

	@Then("^User Click on Assigned to$")
	public void user_Click_on_Assigned_to() {
		newusertermiteresidentialsteps.AssignedToEmp();
	}

	@Then("^User click on save Button$")
	public void user_click_on_save_Button() {
		newusertermiteresidentialsteps.saveBtnScheduleEst();
	}

	@Then("^User clicks on Save and Continue$")
	public void user_clicks_on_Save_and_Continue() {
		newusertermiteresidentialsteps.saveAndContBtn();
	}

	@Then("^Click on Continue$")
	public void click_on_Continue() {
		newusertermiteresidentialsteps.continueBtn();
	}

	@Then("^User add a desired service$")
	public void user_add_a_desired_service() {
		newusertermiteresidentialsteps.AddingdesiredService();
	}

	@Then("^User selects the service and Clicks on Save and View Agreement$")
	public void user_selects_the_service_and_Clicks_on_Save_and_View_Agreement() {
		newusertermiteresidentialsteps.selectTheServiceSaveViewAgreement();
	}

	@Then("^User clicks on save and Continue$")
	public void user_clicks_on_save_and_Continue() {
		newusertermiteresidentialsteps.saveContinue();
	}

	@Then("^User agree terms enter Name and Sign$")
	public void user_agree_terms_enter_Name_and_Sign() {
		newusertermiteresidentialsteps.agreeTermsNameSign();
	}

	@Then("^User clicks on Save and Continue btn again$")
	public void user_clicks_on_Save_and_Continue_btn_again() {
		newusertermiteresidentialsteps.ContSaveBtnx();
	}

	@Then("^User clicks on Send Mail$")
	public void user_clicks_on_Send_Mail() {
		newusertermiteresidentialsteps.sendMailBtn();
	}
	@Then("^User selects desired Opp from Sales$")
	public void userdesiredOpportunity() {
		newusertermiteresidentialsteps.desiredOpp();
	}
	
	@Then("^User clicks on Save and View Proposal$")
	public void saveProposalSumma() {
		newusertermiteresidentialsteps.saveProposal();
	}
	
	@Then("^User clicks on Send Proposal in service Summary$")
	public void sendProposall() {
		newusertermiteresidentialsteps.sendpsll();
	}

	@Then("^User clicks on Send Proposal Mail$")
	public void sendMailProposal() {
		newusertermiteresidentialsteps.sendProposalMail();
	}
	@Then("^User clicks on Mark as Lost$")
	public void user_clicks_on_Mark_as_Lost() {
		newusertermiteresidentialsteps.markAsLostBtn();
	}
	
	@Then("^User click on Range Radio Button and select the desired time Range$")
	public void user_clicksOnRangeTimeDesiredRange() {
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
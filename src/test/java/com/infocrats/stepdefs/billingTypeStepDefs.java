package com.infocrats.stepdefs;

import com.infocrats.steps.billingTypeSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class billingTypeStepDefs {
	
	@Steps
	billingTypeSteps billingTypesteps;

	@When("^User clicks on Billing Transaction in Left Tab$")
	public void user_clicks_on_Billing_Transaction_in_Left_Tab() throws Exception {
		billingTypesteps.BillingTransaction();
	}

	@Then("^User add Transaction type Invoice$")
	public void user_add_Transaction_type_Invoice() throws Exception {
		billingTypesteps.TransactionTypeInvoice();
	}

	@Then("^User search desired Account Number$")
	public void user_search_desired_Account_Number() throws Exception {
		billingTypesteps.AccountNumberSearch();
	}

	@Then("^User selects Terms for the transaction$")
	public void user_selects_Terms_for_the_transaction() throws Exception {
		billingTypesteps.AgreeTermsforTransactio();
	}

	@Then("^User selects the desired service and Add the service$")
	public void user_selects_the_desired_service_and_Add_the_service() throws Exception {
		billingTypesteps.desiredServiceAddButton();
	}

	@Then("^User clicks on the Save Button$")
	public void user_clicks_on_the_Save_Button() throws Exception {
		billingTypesteps.SaveBtnTransaction();
	}

	@Then("^User add Transaction type Recieve Payment$")
	public void user_add_Transaction_type_Recieve_Payment() throws Exception {
		billingTypesteps.transactionTypeRecievedPayment();
	}

	@Then("^User search desired acc number recieved Payment$")
	public void user_search_desired_acc_number_recieved_Payment() throws Exception {
		billingTypesteps.desiredAccDetailsRecievedPay();
	}

	@Then("^user enter the amount he recieves and Reference Number$")
	public void user_enter_the_amount_he_recieves_and_Reference_Number() throws Exception {
		billingTypesteps.amountAnReferenceNumber();
	}

	@Then("^User clicks on Save Button Recieved payment$")
	public void user_clicks_on_Save_Button_Recieved_payment() throws Exception {
		billingTypesteps.saveBtnRecievePayment();
	}

	@Then("^User add Transaction type credit Memo$")
	public void user_add_Transaction_type_credit_Memo() throws Exception {
		billingTypesteps.clicksOnCreditMemo();
	}

	@Then("^User search account and selects desired account$")
	public void user_search_account_and_selects_desired_account() throws Exception {
		billingTypesteps.searchAccDesiredAcc();
	}

	@Then("^User selects desired service from DDL and Add service$")
	public void user_selects_desired_service_from_DDL_and_Add_service() throws Exception {
		billingTypesteps.serviceSelect();
	}

	@Then("^User Save the Memo$")
	public void user_Save_the_Memo() throws Exception {
		billingTypesteps.saveBtnMemo();
	}



	
	}
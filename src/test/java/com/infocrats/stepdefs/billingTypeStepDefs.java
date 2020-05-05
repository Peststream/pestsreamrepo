package com.infocrats.stepdefs;

import com.infocrats.steps.billingTypeSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class billingTypeStepDefs {
	
	@Steps
	billingTypeSteps billingTypesteps;

	@When("^User clicks on Billing Transaction in Left Tab$")
	public void user_clicks_on_Billing_Transaction_in_Left_Tab() {
		billingTypesteps.BillingTransaction();
	}

	@Then("^User add Transaction type Invoice$")
	public void user_add_Transaction_type_Invoice() {
		billingTypesteps.TransactionTypeInvoice();
	}

	@Then("^User search desired Account Number$")
	public void user_search_desired_Account_Number() {
		billingTypesteps.AccountNumberSearch();
	}

	@Then("^User selects Terms for the transaction$")
	public void user_selects_Terms_for_the_transaction() {
		billingTypesteps.AgreeTermsforTransactio();
	}

	@Then("^User selects the desired service and Add the service$")
	public void user_selects_the_desired_service_and_Add_the_service() {
		billingTypesteps.desiredServiceAddButton();
	}

	@Then("^User clicks on the Save Button$")
	public void user_clicks_on_the_Save_Button() {
		billingTypesteps.SaveBtnTransaction();
	}

	@Then("^User add Transaction type Recieve Payment$")
	public void user_add_Transaction_type_Recieve_Payment() {
		billingTypesteps.transactionTypeRecievedPayment();
	}

	@Then("^User search desired acc number recieved Payment$")
	public void user_search_desired_acc_number_recieved_Payment() {
		billingTypesteps.desiredAccDetailsRecievedPay();
	}

	@Then("^user enter the amount he recieves and Reference Number$")
	public void user_enter_the_amount_he_recieves_and_Reference_Number() {
		billingTypesteps.amountAnReferenceNumber();
	}

	@Then("^User clicks on Save Button Recieved payment$")
	public void user_clicks_on_Save_Button_Recieved_payment() {
		billingTypesteps.saveBtnRecievePayment();
	}

	@Then("^User add Transaction type credit Memo$")
	public void user_add_Transaction_type_credit_Memo() {
		billingTypesteps.clicksOnCreditMemo();
	}

	@Then("^User search account and selects desired account$")
	public void user_search_account_and_selects_desired_account() {
		billingTypesteps.searchAccDesiredAcc();
	}

	@Then("^User selects desired service from DDL and Add service$")
	public void user_selects_desired_service_from_DDL_and_Add_service() {
		billingTypesteps.serviceSelect();
	}

	@Then("^User Save the Memo$")
	public void user_Save_the_Memo() {
		billingTypesteps.saveBtnMemo();
	}



	
	}
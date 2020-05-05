package com.infocrats.steps;

import com.infocrats.pageObjects.billingTypePage;


public class billingTypeSteps extends pestreamSteps {
	
	
	billingTypePage billingTypepage;

	public void BillingTransaction() {
		billingTypepage.billingTransactionBtn();
		
	}

	public void TransactionTypeInvoice() {
		billingTypepage.TransactionInvoice();
		
	}

	public void AccountNumberSearch() {
		billingTypepage.accountNumberSelects();
		
	}

	public void AgreeTermsforTransactio() {
		billingTypepage.agreeTermsTransaction();
		
	}

	public void desiredServiceAddButton() {
		billingTypepage.desiredServiceAdd();
		
	}

	public void SaveBtnTransaction() {
		billingTypepage.saveBtnTransaction();
	}

	public void transactionTypeRecievedPayment() {
		billingTypepage.transactionTypeRecievePayment();
		
	}

	public void desiredAccDetailsRecievedPay() {
		billingTypepage.desiredAccDetailsRecievedPay();
		
	}

	public void amountAnReferenceNumber() {
		billingTypepage.amountReferenceNumber();
		
	}

	public void saveBtnRecievePayment() {
		billingTypepage.saveBtnRecievePayment();
		
	}

	public void clicksOnCreditMemo() {
		billingTypepage.creditMemoBtn();
		
	}

	public void searchAccDesiredAcc() {
		billingTypepage.searchAccDesiredAcc();
		
	}

	public void serviceSelect() {
		billingTypepage.ServiceSelect();
		
	}

	public void saveBtnMemo() {
		billingTypepage.SaveMemoBtn();
		
	}
}
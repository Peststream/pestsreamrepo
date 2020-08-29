package com.infocrats.steps;

import com.infocrats.pageObjects.billingTypePage;


public class billingTypeSteps extends pestreamSteps {
	
	
	billingTypePage billingTypepage;

	public void BillingTransaction() throws Exception {
		billingTypepage.billingTransactionBtn();
		
	}

	public void TransactionTypeInvoice() throws Exception {
		billingTypepage.TransactionInvoice();
		
	}

	public void AccountNumberSearch() throws Exception {
		billingTypepage.accountNumberSelects();
		
	}

	public void AgreeTermsforTransactio() throws Exception {
		billingTypepage.agreeTermsTransaction();
		
	}

	public void desiredServiceAddButton() throws Exception {
		billingTypepage.desiredServiceAdd();
		
	}

	public void SaveBtnTransaction() throws Exception {
		billingTypepage.saveBtnTransaction();
	}

	public void transactionTypeRecievedPayment() throws Exception {
		billingTypepage.transactionTypeRecievePayment();
		
	}

	public void desiredAccDetailsRecievedPay() throws Exception {
		billingTypepage.desiredAccDetailsRecievedPay();
		
	}

	public void amountAnReferenceNumber() throws Exception {
		billingTypepage.amountReferenceNumber();
		
	}

	public void saveBtnRecievePayment() throws Exception {
		billingTypepage.saveBtnRecievePayment();
		
	}

	public void clicksOnCreditMemo() throws Exception {
		billingTypepage.creditMemoBtn();
		
	}

	public void searchAccDesiredAcc() throws Exception {
		billingTypepage.searchAccDesiredAcc();
		
	}

	public void serviceSelect() throws Exception {
		billingTypepage.ServiceSelect();
		
	}

	public void saveBtnMemo() throws Exception {
		billingTypepage.SaveMemoBtn();
		
	}
}
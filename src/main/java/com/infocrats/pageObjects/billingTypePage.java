package com.infocrats.pageObjects;

import com.infocrats.utils.BaseUtills;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class billingTypePage extends peststreamPage {
	BaseUtills utills = new BaseUtills();

	
	@FindBy(xpath = "//a[contains(.,'Billing')]")
	private WebElementFacade billing ;
	
	@FindBy(xpath = "(//span[contains(.,'Transaction')])[1]")
	private WebElementFacade transaction;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-primary dropdown-toggle')]")
	private WebElementFacade addTransactionType ;
	
	@FindBy(xpath = "//a[@data-toggle='modal'][contains(.,'Invoice')]")
	private WebElementFacade Invoice;
	
	@FindBy(xpath = "//input[@id='ManageCustomerId']")
	private WebElementFacade seacrhAcc;
	
	@FindBy(xpath = "(//i[contains(@class,'icon-magnifier')])[1]")
	private WebElementFacade searchAccountbtn;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/div[1]")
	private WebElementFacade desiredAccount;
	
	@FindBy(xpath = "//span[@id='select2-chosen-2']")
	private WebElementFacade terms1;
	
	@FindBy(xpath = "(//div[@role='option'])[2]")
	private WebElementFacade terms2;
	
	@FindBy(xpath = "//select[@id='ddlServices']")
	private WebElementFacade service;
	
	@FindBy(xpath = "//option[contains(text(),'Mech Service Name')]")
	private WebElementFacade service1 ;
	
	@FindBy(xpath = "//span[contains(.,'Add')]")
	private WebElementFacade addService;
	
	@FindBy(xpath = "(//span[contains(.,'Save')])[6]")
	private WebElementFacade saveButton;
	
	@FindBy(xpath = "(//a[contains(.,'Receive Payment')])[1]")
	private WebElementFacade RecievePayment;	
	
	@FindBy(xpath = "//input[@id='accounthead']")
	private WebElementFacade accountSearchRecievePayment;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/div[1]/span[1]/div[1]/div[1]/strong[1]")
	private WebElementFacade desiredAccRecievePayment;
	
	@FindBy(xpath = "//input[contains(@id,'ReceivedPayments_0__PaymentAmount')]")
	private WebElementFacade paymentAmount;
	
	@FindBy(xpath = "//input[@id='ReceivedPayments_0__ReferenceNo']")
	private WebElementFacade ReferenceNumber;
	
	@FindBy(xpath = "(//button[@type='submit'][contains(.,'Save')])[1]")
	private WebElementFacade saveBtnRecievedPayment;
	
	@FindBy(xpath = "(//a[contains(.,'Credit Memo')])[1]")
	private WebElementFacade creditMemo;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]/div[1]/span[1]/div[1]/div[1]/strong[1]")
	private WebElementFacade desiredAccCreditMemo;
	
	@FindBy(xpath = "//*[@id=\"select2-results-1\"]/li[2]/ul/li[1]")
	private WebElementFacade serviceCreditMemo;
	
	@FindBy(xpath = "//span[@id='select2-chosen-1']")
	private WebElementFacade serviceDDL;
	
	
	
	
	
@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}

	public void billingTransactionBtn() {
		billing.click();
		waitABit(2000);
		transaction.click();
		waitABit(2000);
	}

	public void TransactionInvoice() {
		addTransactionType.click();
		waitABit(2000);
		Invoice.click();
		waitABit(2000);
		
	}

	public void accountNumberSelects() {
		seacrhAcc.sendKeys("101");
		waitABit(2000);
		searchAccountbtn.click();
		waitABit(2000);
		desiredAccount.click();
		waitABit(2000);
	}

	public void agreeTermsTransaction() {
		terms1.click();
		waitABit(2000);
		terms2.click();
		waitABit(2000);
	}

	public void desiredServiceAdd() {
		service.click();
		waitABit(2000);
		service1.click();
		waitABit(2000);
		addService.click();
		waitABit(2000);
	}

	public void saveBtnTransaction() {
		saveButton.click();
		waitABit(5000);
		
	}

	public void transactionTypeRecievePayment() {
		addTransactionType.click();
		waitABit(2000);
		RecievePayment.click();
		waitABit(2000);
	}

	public void desiredAccDetailsRecievedPay() {
		accountSearchRecievePayment.sendKeys("101");
		waitABit(2000);
		searchAccountbtn.click();
		waitABit(2000);
		desiredAccRecievePayment.click();
		waitABit(2000);
		
	}

	public void amountReferenceNumber() {
		 paymentAmount.sendKeys("160.00");
			waitABit(2000);
			ReferenceNumber.sendKeys("2302");
			waitABit(2000);
		
	}

	public void saveBtnRecievePayment() {
		saveBtnRecievedPayment.click();
		waitABit(5000);
	}

	public void creditMemoBtn() {
		
		addTransactionType.click();
		waitABit(2000);
		creditMemo.click();
		waitABit(2000);
	}

	public void searchAccDesiredAcc() {
	
		accountSearchRecievePayment.sendKeys("101");
		waitABit(2000);
		searchAccountbtn.click();
		waitABit(2000);
		desiredAccCreditMemo.click();
		waitABit(2000);
		}

	public void ServiceSelect() {
		serviceDDL.click();
		waitABit(2000);
		serviceCreditMemo.click();
		waitABit(2000);
		addService.click();
		waitABit(2000);
		
	}

	public void SaveMemoBtn() {
		saveBtnRecievedPayment.click();
		waitABit(5000);
		
		
	}
}
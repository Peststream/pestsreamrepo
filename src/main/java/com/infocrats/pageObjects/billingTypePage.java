package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.JsonHelper;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class billingTypePage extends peststreamPage {
	BaseUtills utills = new BaseUtills();
	private Map<String, Integer> jsonData;

	@FindBy(xpath = "//a[contains(.,'Billing')]")
	private WebElementFacade billing;

	@FindBy(xpath = "(//span[contains(.,'Transaction')])[1]")
	private WebElementFacade transaction;

	@FindBy(xpath = "//button[contains(@class,'btn btn-primary dropdown-toggle')]")
	private WebElementFacade addTransactionType;

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
	private WebElementFacade service1;

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

	public void billingTransactionBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(billing));
		billing.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(transaction));
		transaction.click();

	}

	public void TransactionInvoice() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(addTransactionType));
		addTransactionType.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(Invoice));
		Invoice.click();
	}

	public void accountNumberSelects() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(seacrhAcc));
		seacrhAcc.sendKeys("101");
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(searchAccountbtn));
		searchAccountbtn.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(desiredAccount));
		desiredAccount.click();
	}

	public void agreeTermsTransaction() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(terms1));
		terms1.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(terms2));
		terms2.click();
	}

	public void desiredServiceAdd() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(service));
		service.click();

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(service1));
		service1.click();

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(addService));
		addService.click();

	}

	public void saveBtnTransaction() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveButton));
		saveButton.click();
	}

	public void transactionTypeRecievePayment() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(addTransactionType));
		addTransactionType.click();

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(RecievePayment));
		RecievePayment.click();

	}

	public void desiredAccDetailsRecievedPay() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(accountSearchRecievePayment));
		accountSearchRecievePayment.sendKeys("101");

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(searchAccountbtn));
		searchAccountbtn.click();

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(desiredAccRecievePayment));
		desiredAccRecievePayment.click();

	}

	public void amountReferenceNumber() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(paymentAmount));
		paymentAmount.sendKeys("160.00");

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(ReferenceNumber));
		ReferenceNumber.sendKeys("2302");

	}

	public void saveBtnRecievePayment() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveBtnRecievedPayment));
		saveBtnRecievedPayment.click();
	}

	public void creditMemoBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(addTransactionType));
		addTransactionType.click();

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(creditMemo));
		creditMemo.click();

	}

	public void searchAccDesiredAcc() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(accountSearchRecievePayment));
		accountSearchRecievePayment.sendKeys("101");

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(searchAccountbtn));
		searchAccountbtn.click();

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(desiredAccCreditMemo));
		desiredAccCreditMemo.click();

	}

	public void ServiceSelect() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(serviceDDL));
		serviceDDL.click();

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(serviceCreditMemo));
		serviceCreditMemo.click();

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(addService));
		addService.click();

	}

	public void SaveMemoBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveBtnRecievedPayment));
		saveBtnRecievedPayment.click();

	}
}
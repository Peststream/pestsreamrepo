package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.JsonHelper;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class batchManagementPage extends peststreamPage {
	BaseUtills utills = new BaseUtills();
	private Map<String, Integer> jsonData;

	@FindBy(xpath = "//span[contains(.,'Batch Management')]")
	private WebElementFacade batchManagementBtn;

	@FindBy(xpath = "//span[contains(.,'Add Batch')]")
	private WebElementFacade addBatchBtn;

	@FindBy(xpath = "(//*[@id=\"uniform-BatchCreationType\"])[1]")
	private WebElementFacade workOrderRadio;

	@FindBy(xpath = "//input[@id='BatchName']")
	private WebElementFacade BatchName;

	@FindBy(xpath = "//input[@id='BatchDateStr']")
	private WebElementFacade batchDate1;

	@FindBy(xpath = "//div[@class='datepicker-days']//th[@class='next']")
	private WebElementFacade nextCalender;

	@FindBy(xpath = "//td[@class='day'][contains(text(),'15')]")
	private WebElementFacade dateCalender;

	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[1]")
	private WebElementFacade workOrder1;

	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[4]")
	private WebElementFacade workOrder2;

	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[6]")
	private WebElementFacade workOrder3;

	@FindBy(xpath = "(//span[contains(.,'Save')])[2]")
	private WebElementFacade saveBtnBatch;

	@FindBy(xpath = "//a[@class='btn btn-icon-only purple btnReleasedbatch']")
	private WebElementFacade batchReleaseAction;

	@FindBy(xpath = "//a[contains(text(),'Released')]")
	private WebElementFacade batchReleaseTab;

	@FindBy(xpath = "//button[@class='btn green btnReleaseBatchAlertYes ladda-button']")
	private WebElementFacade confirmYes;

	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}

	public void batchmanagementBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(batchManagementBtn));
        batchManagementBtn.click();

	}

	public void addBatchBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(addBatchBtn));
        addBatchBtn.click();
	}

	public void BatchTypeRadioBtn() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(workOrderRadio));
        scrollUP(workOrderRadio);
		workOrderRadio.click();
	}

	public void BranchNameDate() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(BatchName));
        BatchName.sendKeys("New Batch 1");

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(batchDate1));
        batchDate1.click();

        jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(nextCalender));
		nextCalender.click();

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait3 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait3.until(ExpectedConditions.elementToBeClickable(dateCalender));
        dateCalender.click();

	}

	public void WorkOrderChckBox() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(workOrder1));
		workOrder1.click();

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(workOrder2));
		workOrder2.click();

		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait2 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait2.until(ExpectedConditions.elementToBeClickable(workOrder3));
		workOrder3.click();

	}

	public void SaveBtnBAtchManagement() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(saveBtnBatch));
		saveBtnBatch.click();

	}

	public void batchReleaseAction() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(batchReleaseAction));
		batchReleaseAction.click();
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait1 = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait1.until(ExpectedConditions.elementToBeClickable(confirmYes));
		confirmYes.click();

	}

	public void releaseBatchTab() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(batchReleaseTab));
		scrollUP(batchReleaseTab);
		batchReleaseTab.click();

	}
}
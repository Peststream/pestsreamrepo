package com.infocrats.pageObjects;

import com.infocrats.utils.BaseUtills;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class batchManagementPage extends peststreamPage {
	BaseUtills utills = new BaseUtills();

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

	public void batchmanagementBtn() {
		batchManagementBtn.click();
		waitABit(4000);
}

	public void addBatchBtn() {
		addBatchBtn.click();
		waitABit(2000);
		
	}

	public void BatchTypeRadioBtn() {
	scrollUP(workOrderRadio);
	workOrderRadio.click();
		waitABit(5000);
	}

	public void BranchNameDate() {
		BatchName.sendKeys("New Batch 1");
		waitABit(2000);
	batchDate1.click();
	
	nextCalender.click();
	
	dateCalender.click();
	waitABit(2000);
		
	}

	public void WorkOrderChckBox() {
workOrder1.click();
waitABit(2000);
workOrder2.click();
waitABit(2000);
workOrder3.click();
waitABit(2000);
			
	}

	public void SaveBtnBAtchManagement() {
		saveBtnBatch.click();
		waitABit(4000);
	}

	public void batchReleaseAction() {
		batchReleaseAction.click();
		waitABit(2000);
		confirmYes.click();
		waitABit(2000);
	}

	public void releaseBatchTab() {
		scrollUP(batchReleaseTab);
		batchReleaseTab.click();
		waitABit(4000);
		
	}
}
package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.infocrats.utils.BaseUtills;
import com.infocrats.utils.JsonHelper;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TermiteInventoryPage extends peststreamPage {
	BaseUtills utills = new BaseUtills();
	private Map<String, Integer> jsonData;

	@FindBy(xpath = "(//span[contains(.,'Inventory')])[1]")
	private WebElementFacade InventoryTermite;

	@FindBy(xpath = "//span[contains(text(),'Locations')]")
	private WebElementFacade LocationsInventoryTermite;

	@FindBy(xpath = "//span[contains(text(),'Add Location')]")
	private WebElementFacade AddLocLocInventoryTermite;

	@FindBy(xpath = "(//input[@id='Name'])[2]")
	private WebElementFacade LocNameLocInventoryTermite;

	@FindBy(xpath = "//input[@placeholder='Location Number']")
	private WebElementFacade LocNoLocInventoryTermite;

	@FindBy(xpath = "(//select[@data-placeholder='Select Location Type...'])[2]")
	private WebElementFacade DDLocTypeLocInventoryTermite;

	@FindBy(xpath = "(//span[contains(.,'Save')])[1]")
	private WebElementFacade SaveLocInventoryTermite;

	@FindBy(xpath = "//span[contains(text(),'Transfer Management')]")
	private WebElementFacade TransferManagInventoryTermite;

	@FindBy(xpath = "//span[contains(.,'Transfer Inventory')]")
	private WebElementFacade AddTransferInventory;

	@FindBy(xpath = "(//span[contains(.,'--Select--')])[1]")
	private WebElementFacade DDLocFromTransferManagInventoryTermite;

	@FindBy(xpath = "(//span[contains(.,'Location New')])[1]")
	private WebElementFacade ValueDDLocFromTransferManagInventoryTermite;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]")
	private WebElementFacade DDLocToTransferManagInventoryTermite;

	@FindBy(xpath = "(//span[contains(.,'Location New')])[2]")
	private WebElementFacade ValueDDLocToTransferManagInventoryTermite;

	@FindBy(xpath = "//span[@id='select2-chosen-1']")
	private WebElementFacade DDItemTypeTransferManagInventoryTermite;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade ValueItemTypeTransferManagInventoryTermite;

	@FindBy(xpath = "//span[@id='select2-chosen-2']")
	private WebElementFacade DDDepartmentTransferManagInventoryTermite;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[3]")
	private WebElementFacade ValueDDDepartmentTransferManagInventoryTermite;

	@FindBy(xpath = "//div[@id='s2id_CategoryId']//a[@class='select2-choice']")
	private WebElementFacade DDCategoryTransferManagInventoryTermite;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade ValueDDCategoryTransferManagInventoryTermite;

	@FindBy(xpath = "//span[@id='select2-chosen-22']")
	private WebElementFacade DDItemTransferManagInventoryTermite;

	@FindBy(xpath = "(//*[starts-with(@id,'select2-result-label-')])[2]")
	private WebElementFacade ValueDDItemTransferManagInventoryTermite;

	@FindBy(xpath = "(//button[contains(.,'Save')])[1]")
	private WebElementFacade SaveTransferManagInventoryTermite;

	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}

	public void user_click_on_InventoryTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(InventoryTermite));

		InventoryTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void user_click_on_Locations_InventoryTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(LocationsInventoryTermite));

		LocationsInventoryTermite.click();
		waitABit(jsonData.get("Time3"));

	}

	public void user_click_on_AddLoc_LocInventoryTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddLocLocInventoryTermite));

		AddLocLocInventoryTermite.click();
		waitABit(jsonData.get("Time3"));

	}

	public void user_click_on_LocName_LocInventoryTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(LocNameLocInventoryTermite));

		LocNameLocInventoryTermite.sendKeys(testData.get("LocName"));
		waitABit(jsonData.get("Time3"));

	}

	public void user_click_on_LocNo_LocInventoryTermite(Map<String, String> testData) throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(LocNoLocInventoryTermite));

		LocNoLocInventoryTermite.sendKeys(testData.get("LocNo"));
		waitABit(jsonData.get("Time3"));

	}

	public void user_click_on_LocType_LocInventoryTermite() {
		waitABit(jsonData.get("Time3"));
		Select ddl = new Select(DDLocTypeLocInventoryTermite);
		ddl.selectByIndex(2);
	}

	public void user_click_on_Save_LocInventoryTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveLocInventoryTermite));

		SaveLocInventoryTermite.click();
		waitABit(jsonData.get("Time3"));
	}

	public void user_click_on_TransferManag_InventoryTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(TransferManagInventoryTermite));

		TransferManagInventoryTermite.click();
		waitABit(jsonData.get("Time3"));

	}

	public void user_click_on_AddTransferInventory() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(AddTransferInventory));

		AddTransferInventory.click();
		waitABit(jsonData.get("Time3"));
	}

	public void user_click_on_DDLocFrom_TransferManagInventoryTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDLocFromTransferManagInventoryTermite));

		DDLocFromTransferManagInventoryTermite.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueDDLocFromTransferManagInventoryTermite));

		ValueDDLocFromTransferManagInventoryTermite.click();
		waitABit(jsonData.get("Time3"));

	}

	public void user_click_on_DDLocTo_TransferManagInventoryTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDLocToTransferManagInventoryTermite));

		DDLocToTransferManagInventoryTermite.click();
		waitABit(jsonData.get("Time3"));

		ValueDDLocToTransferManagInventoryTermite.sendKeys(Keys.DOWN.ENTER);

		// ValueDDLocToTransferManagInventoryTermite.click();
		waitABit(jsonData.get("Time3"));

	}

	public void user_click_on_DDItemType_TransferManagInventoryTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDItemTypeTransferManagInventoryTermite));

		DDItemTypeTransferManagInventoryTermite.click();
		wait.until(ExpectedConditions.elementToBeClickable(ValueItemTypeTransferManagInventoryTermite));

		ValueItemTypeTransferManagInventoryTermite.click();
		waitABit(jsonData.get("Time3"));

	}

	public void user_click_on_DDDepartment_TransferManagInventoryTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDDepartmentTransferManagInventoryTermite));

		DDDepartmentTransferManagInventoryTermite.click();

		wait.until(ExpectedConditions.elementToBeClickable(ValueDDDepartmentTransferManagInventoryTermite));

		ValueDDDepartmentTransferManagInventoryTermite.click();
		waitABit(jsonData.get("Time3"));

	}

	public void user_click_on_DDCategory_TransferManagInventoryTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDCategoryTransferManagInventoryTermite));

		DDCategoryTransferManagInventoryTermite.click();

		wait.until(ExpectedConditions.elementToBeClickable(ValueDDCategoryTransferManagInventoryTermite));

		ValueDDCategoryTransferManagInventoryTermite.click();
		waitABit(jsonData.get("Time3"));

	}

	public void user_click_on_DDItem_TransferManagInventoryTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(DDItemTransferManagInventoryTermite));

		DDItemTransferManagInventoryTermite.click();

		wait.until(ExpectedConditions.elementToBeClickable(ValueDDItemTransferManagInventoryTermite));

		ValueDDItemTransferManagInventoryTermite.click();
		waitABit(jsonData.get("Time3"));

	}

	public void user_click_on_Save_TransferManagInventoryTermite() throws Exception {
		jsonData = JsonHelper.readJsonElementInteger("waitTime.json", "SleepTime");
		WebDriverWait wait = new WebDriverWait(getDriver(), jsonData.get("Time3"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveTransferManagInventoryTermite));

		SaveTransferManagInventoryTermite.click();
		waitABit(jsonData.get("Time3"));

	}

}

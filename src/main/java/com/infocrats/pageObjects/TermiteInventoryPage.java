package com.infocrats.pageObjects;

import java.util.Map;

import org.openqa.selenium.support.ui.Select;

import com.infocrats.utils.BaseUtills;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TermiteInventoryPage extends peststreamPage {
	BaseUtills utills = new BaseUtills();

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

	public void user_click_on_InventoryTermite() {
		InventoryTermite.click();
		waitABit(1000);
	}

	public void user_click_on_Locations_InventoryTermite() {
		LocationsInventoryTermite.click();
		waitABit(1000);
		
	}

	public void user_click_on_AddLoc_LocInventoryTermite() {
		AddLocLocInventoryTermite.click();
		waitABit(1000);
		
	}

	public void user_click_on_LocName_LocInventoryTermite(Map<String, String> testData) {
		LocNameLocInventoryTermite.sendKeys(testData.get("LocName"));
		waitABit(1000);
		
	}

	public void user_click_on_LocNo_LocInventoryTermite(Map<String, String> testData) {
		LocNoLocInventoryTermite.sendKeys(testData.get("LocNo"));
		waitABit(1000);
		
	}

	public void user_click_on_LocType_LocInventoryTermite() {
		
		Select ddl = new Select(DDLocTypeLocInventoryTermite);
		ddl.selectByIndex(2);
	}

	public void user_click_on_Save_LocInventoryTermite() {
			SaveLocInventoryTermite.click();
			waitABit(1000);
	}

	public void user_click_on_TransferManag_InventoryTermite() {
		TransferManagInventoryTermite.click();
		waitABit(1000);
		
	}
	
	public void user_click_on_AddTransferInventory() {
		AddTransferInventory.click();
		waitABit(1000);
	}

	public void user_click_on_DDLocFrom_TransferManagInventoryTermite() {
		DDLocFromTransferManagInventoryTermite.click();
		waitABit(1000);
		
		ValueDDLocFromTransferManagInventoryTermite.click();
		waitABit(1000);
		
	}

	public void user_click_on_DDLocTo_TransferManagInventoryTermite() {
		DDLocToTransferManagInventoryTermite.click();
		waitABit(3000);
		
		ValueDDLocToTransferManagInventoryTermite.click();
		waitABit(1000);
		
	}

	public void user_click_on_DDItemType_TransferManagInventoryTermite() {
		DDItemTypeTransferManagInventoryTermite.click();
		waitABit(1000);
		
		ValueItemTypeTransferManagInventoryTermite.click();
		waitABit(1000);
		
	}

	public void user_click_on_DDDepartment_TransferManagInventoryTermite() {
		DDDepartmentTransferManagInventoryTermite.click();
		waitABit(1000);
		
		ValueDDDepartmentTransferManagInventoryTermite.click();
		waitABit(1000);
		
	}

	public void user_click_on_DDCategory_TransferManagInventoryTermite() {
		DDCategoryTransferManagInventoryTermite.click();
		waitABit(1000);
		
		ValueDDCategoryTransferManagInventoryTermite.click();
		waitABit(1000);
		
	}

	public void user_click_on_DDItem_TransferManagInventoryTermite() {
		DDItemTransferManagInventoryTermite.click();
		waitABit(1000);
		
		ValueDDItemTransferManagInventoryTermite.click();
		waitABit(1000);
		
	}

	public void user_click_on_Save_TransferManagInventoryTermite() {
		SaveTransferManagInventoryTermite.click();
		waitABit(1000);
		
	}

	

}

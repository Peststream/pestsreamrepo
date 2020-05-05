package com.infocrats.steps;

import java.util.Map;

import com.infocrats.pageObjects.TermiteInventoryPage;
import com.infocrats.utils.JsonHelper;

import net.thucydides.core.annotations.Steps;

public class TermiteInventorySteps extends pestreamSteps {

	private Map<String, String> jsonData;

	@Steps
	TermiteInventoryPage termiteinventorypage;

	public void user_click_on_InventoryTermite() {
		termiteinventorypage.user_click_on_InventoryTermite();
		
	}

	public void user_click_on_Locations_InventoryTermite() {
		termiteinventorypage.user_click_on_Locations_InventoryTermite();
		
	}

	public void user_click_on_AddLoc_LocInventoryTermite() {
		termiteinventorypage.user_click_on_AddLoc_LocInventoryTermite();
		
	}

	public void user_click_on_LocName_LocInventoryTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Locations_Inventory");
		termiteinventorypage.user_click_on_LocName_LocInventoryTermite(jsonData);
		
	}

	public void user_click_on_LocNo_LocInventoryTermite() throws Exception {
		jsonData = JsonHelper.readJsonElement("call_Termite.json", "Locations_Inventory");
		termiteinventorypage.user_click_on_LocNo_LocInventoryTermite(jsonData);
		
	}

	public void user_click_on_LocType_LocInventoryTermite() {
		termiteinventorypage.user_click_on_LocType_LocInventoryTermite();
		
	}

	public void user_click_on_Save_LocInventoryTermite() {
		termiteinventorypage.user_click_on_Save_LocInventoryTermite();
		
	}


	
	
	public void user_click_on_TransferManag_InventoryTermite() {
		termiteinventorypage.user_click_on_TransferManag_InventoryTermite();
		
	}

	public void user_click_on_DDLocFrom_TransferManagInventoryTermite() {
		termiteinventorypage.user_click_on_DDLocFrom_TransferManagInventoryTermite();
		
	}

	public void user_click_on_DDLocTo_TransferManagInventoryTermite() {
		termiteinventorypage.user_click_on_DDLocTo_TransferManagInventoryTermite();
		
	}

	public void user_click_on_DDItemType_TransferManagInventoryTermite() {
		termiteinventorypage.user_click_on_DDItemType_TransferManagInventoryTermite();
		
	}

	public void user_click_on_DDDepartment_TransferManagInventoryTermite() {
		termiteinventorypage.user_click_on_DDDepartment_TransferManagInventoryTermite();
		
	}

	public void user_click_on_DDCategory_TransferManagInventoryTermite() {
		termiteinventorypage.user_click_on_DDCategory_TransferManagInventoryTermite();
		
	}

	public void user_click_on_DDItem_TransferManagInventoryTermite() {
		termiteinventorypage.user_click_on_DDItem_TransferManagInventoryTermite();
		
	}

	public void user_click_on_Save_TransferManagInventoryTermite() {
		termiteinventorypage.user_click_on_Save_TransferManagInventoryTermite();
		
	}

	public void user_click_on_AddTransferInventory() {
		termiteinventorypage.user_click_on_AddTransferInventory();
		
	}
}

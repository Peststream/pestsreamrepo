package com.infocrats.stepdefs;

import com.infocrats.steps.TermiteInventorySteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TermiteInventoryStepDefs {

	@Steps
	TermiteInventorySteps termiteinventorysteps;

	@When("^user click on InventoryTermite$")
	public void user_click_on_InventoryTermite() {
		termiteinventorysteps.user_click_on_InventoryTermite();
	}

	@Then("^user click on Locations_InventoryTermite$")
	public void user_click_on_Locations_InventoryTermite() {
		termiteinventorysteps.user_click_on_Locations_InventoryTermite();
	}

	@Then("^user click on AddLoc_LocInventoryTermite$")
	public void user_click_on_AddLoc_LocInventoryTermite() {
		termiteinventorysteps.user_click_on_AddLoc_LocInventoryTermite();
	}

	@Then("^user click on LocName_LocInventoryTermite$")
	public void user_click_on_LocName_LocInventoryTermite() throws Exception {
		termiteinventorysteps.user_click_on_LocName_LocInventoryTermite();
	}

	@Then("^user click on LocNo_LocInventoryTermite$")
	public void user_click_on_LocNo_LocInventoryTermite() throws Exception {
		termiteinventorysteps.user_click_on_LocNo_LocInventoryTermite();
	}

	@Then("^user click on LocType_LocInventoryTermite$")
	public void user_click_on_LocType_LocInventoryTermite() {
		termiteinventorysteps.user_click_on_LocType_LocInventoryTermite();
	}

	@Then("^user click on Save_LocInventoryTermite$")
	public void user_click_on_Save_LocInventoryTermite() {
		termiteinventorysteps.user_click_on_Save_LocInventoryTermite();
	}
	
	

@Then("^user click on TransferManag_InventoryTermite$")
public void user_click_on_TransferManag_InventoryTermite() {
	termiteinventorysteps.user_click_on_TransferManag_InventoryTermite();
}

@Then("^user click on DDLocFrom_TransferManagInventoryTermite$")
public void user_click_on_DDLocFrom_TransferManagInventoryTermite() {
	termiteinventorysteps.user_click_on_DDLocFrom_TransferManagInventoryTermite();
}

@Then("^user click on DDLocTo_TransferManagInventoryTermite$")
public void user_click_on_DDLocTo_TransferManagInventoryTermite() {
	termiteinventorysteps.user_click_on_DDLocTo_TransferManagInventoryTermite();
}

@Then("^user click on DDItemType_TransferManagInventoryTermite$")
public void user_click_on_DDItemType_TransferManagInventoryTermite() {
	termiteinventorysteps.user_click_on_DDItemType_TransferManagInventoryTermite();
}

@Then("^user click on DDDepartment_TransferManagInventoryTermite$")
public void user_click_on_DDDepartment_TransferManagInventoryTermite() {
	termiteinventorysteps.user_click_on_DDDepartment_TransferManagInventoryTermite();
}

@Then("^user click on DDCategory_TransferManagInventoryTermite$")
public void user_click_on_DDCategory_TransferManagInventoryTermite() {
	termiteinventorysteps.user_click_on_DDCategory_TransferManagInventoryTermite();
}

@Then("^user click on DDItem_TransferManagInventoryTermite$")
public void user_click_on_DDItem_TransferManagInventoryTermite() {
	termiteinventorysteps.user_click_on_DDItem_TransferManagInventoryTermite();
}

@Then("^user click on Save_TransferManagInventoryTermite$")
public void user_click_on_Save_TransferManagInventoryTermite() {
	termiteinventorysteps.user_click_on_Save_TransferManagInventoryTermite();
}


@Then("^user click on AddTransferInventory$")
public void user_click_on_AddTransferInventory() {
	termiteinventorysteps.user_click_on_AddTransferInventory();
}




}

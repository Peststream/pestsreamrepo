@termiteinventory
Feature: Test Cases for Termite Inventory
  I want to use this template for my feature file

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  @LocationsInventoryTermite
  Scenario: Test to Add Locations in Inventory Termite
  When user click on InventoryTermite
  Then user click on Locations_InventoryTermite
  Then user click on AddLoc_LocInventoryTermite
  Then user click on LocName_LocInventoryTermite
  Then user click on LocNo_LocInventoryTermite
  Then user click on LocType_LocInventoryTermite
  Then user click on Save_LocInventoryTermite
  
   @TransferManagInventoryTermite
  Scenario: Test to Tranfer Management Inventory Termite
  When user click on InventoryTermite
  Then user click on TransferManag_InventoryTermite
  Then user click on AddTransferInventory
  Then user click on DDLocFrom_TransferManagInventoryTermite
  Then user click on DDLocTo_TransferManagInventoryTermite
  Then user click on DDItemType_TransferManagInventoryTermite
  Then user click on DDDepartment_TransferManagInventoryTermite
  Then user click on DDCategory_TransferManagInventoryTermite
  Then user click on DDItem_TransferManagInventoryTermite
  Then user click on Save_TransferManagInventoryTermite
  
  
 
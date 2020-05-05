Feature: Create pest control commercial opportunity for new user.

Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system


@nuBatch
  Scenario: Test opportunity From Left nevigation menu for BatchManagement for Adding Batch
    When user clicked on batch management tab in left panel
    Then User clicks on Add Batch Button
	Then user Selects batch Type Work Order
    Then User inputs New Batch Name and Batch Date
    Then User selects the required number of work order to form a batch
    Then Clicks on Save Button
    
    
 @ReleaseBatch
   Scenario: Test opportunity From Left nevigation menu for BatchManagement for releasing Batch
    When user clicked on batch management tab in left panel
    Then User selects the desired Batch to be released
    Then User moves to Released Batch Tab
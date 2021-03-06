@run @core @RunMSN 
Feature:  Test for Core Setup WorkOrder.
 
  Background: 
   Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system
    
  @Tsfcsg
  Scenario: Test setups fetaure for Click on save and Generate
    When user clicked on Setups tab in left panel
    Then user clicked on Advance Search Button
    Then user clicked on Action Button
    Then select start date and end date
    Then click on genrate online work order
    
  @Tsfcpo
  Scenario: Test setups fetaure for Click on save and Generate and Publish Online
    When user clicked on Setups tab in left panel
    Then user clicked on Advance Search Button
    Then user clicked on Action Button
    Then select start date and end date
    Then click on genrate online work order
    And Check all work order
    And Click on publish online
     
    
    
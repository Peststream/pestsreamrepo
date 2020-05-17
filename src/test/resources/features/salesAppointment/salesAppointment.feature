Feature: Check the Sales Appointments of PestControl.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  
  @salesApp
  Scenario: Test to check an opportunity fills all five forms clearly or not
    When user click on Appointments tab
    Then user click on SalesApp 
    And user click on Opportunity
    And user click on Save&Continue of generalInfo
    Then user click on Continue of inspection
    Then user click on DDCatSalesApp
    Then user click on DDServiceSalesApp
    Then user click on DDFrequencySalesApp
    Then user click on InternalNotes
    Then user click on saveBttn
    Then user click on Save&Continue of Service
    Then user click on NonStdRadioBttn
    Then user click on DDDepartment
    Then user click on Service
    Then user click on DDFreq
    Then user click on saveBttnNonStd
    Then user click on MarkAsLost
    Then user click on DDReason
    Then user click on SaveML
    
     @salesApp111
  Scenario: Test to check an opportunity fills all five forms clearly or not
    When user click on computer
 
    
    
    
    
    

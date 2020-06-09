@testt
Feature: Create pest control residential opportunity for exiting user.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

 
    
    
   @createClockInOut
  Scenario: Test create team feature in Employee tab
    When i click on employee tab on dashboard
    Then user click on ClockInOutTab
    Then user click on addClockInOut
    Then user click on ClockInOutDate
    Then user click on TimeOut
    Then user click on ValueTimeOut
    Then user click on save
    
    @cre
  Scenario: Test create team feature in Employee tab
  Then user click on Branch_RouteEmployee
  
  
    
   
    

 
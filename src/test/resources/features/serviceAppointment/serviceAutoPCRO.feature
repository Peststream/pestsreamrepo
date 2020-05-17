Feature:  To test the feature of service appoinment feature.
 
  Background: 
   Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system
    
 @Tsfcsste
  Scenario: Test appoinment feature for click on submit and add and send the email
    When user clicked on Appointment Tab
    Then user clicked on Service Appoinment Tab
    Then user clicked on Action Button
    Then click Enter Current Time
    And click save and continue button
    Then choose payment mode
    And enter Amount
    And click save and continue on service details
   Then take Technician and Customer signature
   And press Submit button 
   
   
   
   
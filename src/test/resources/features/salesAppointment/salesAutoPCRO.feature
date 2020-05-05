Feature: To test the feature of service appoinment feature.
 
  Background: 
   Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system



 @tslsapFR
   Scenario: Test sales appointment Fill Genaral info,inspection,Select service,Service summery,Aggrement and proposal for Residential
   When i click on Appoinment tab
   Then i click on Sales Appoinment subtab
   And select opportunity
#   And  select opportunity from scheduled

   Then review all the details and click on save and continue button
   Then click on continue button on inspection tab
   And package details "category","service","package","Frequency","Billing Frequency" on sales Appointment select service
   And click on Add button
#   Then click on Add to agreement check buttonon sales Appointment select service
   
   Then click on save & sign agreement button on sales Appointment select service
   Then click on save and continue button on sales Appointment select service
   Then check term and condition
   Then enter full name and signature
   Then click on save and continue on Agreement tab on sales Appointment select service
   Then click on send Agreement list on Agreement tab on sales Appointment select service
   And click on intial setup
   
 
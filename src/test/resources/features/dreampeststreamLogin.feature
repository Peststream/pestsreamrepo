Feature: In order to login Company Admin should have to enter valid Company id and login details

  Background: 
    Given User successfully logged into system with valid credentials

  #@invalidlogin
  #Scenario: Test User should not able to grant the system with invalid credential
    #When I enter a credentials for "InvalidUser"
    #And I can click sign in
    #Then I am notified Incorrect username or password
    #
    #@login 
  #Scenario: Test User should able to grant the system with valid credential
    #When I enter a credentials for "SuperUser"
    #And I can click sign in
    #Then I am granted access to the system

  @login 
  Scenario: Test User should able to grant the system with valid credential
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

    
	   @PestDemo
   Scenario: Testing of ViewDetails from CSR dashBoard for new Opportunity
    When User clicks on the CsrDashboard from the left tab
    Then User Clicks on Advvance Search Tab in CSR
    Then User Clicks on the View Details from action tab
    Then User clicks on add opportunity
    When user clicked on call tab
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    And select lead branch info
    And enters Account_Alert and enterProblemDiscription
    Then I click on commercial Radio button
    And click on continue button for commercial opportunity
    Then enter service address
    Then Select first time range & Second time range 
    Then click on assign to DDL
    And choose assign to person
    And click on save Button       
    Then click on opportunity action icon
    Then review all the details and click on save and continue button
    Then click on continue button on inspection tab
    Then choose category DDL
    And select service from DDL
    And click on add button 
    Then click on save and continue on select service tab
    Then review proposal and click on save and proposal
    Then check payment type and enter amount
    Then check term and condition
    Then enter full name and signature
    Then click on save and continue on Agreement tab
    Then User waits
    
     @pestDemo2
Scenario: Test opportunity for Termite with Select Package Standard Services Service Bundle complete
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User clicks on Service Bundle Radio
   	Then User selects bundle from DDL and Input Billing Frequency
   	Then User clicks on Add Bundle Button
   	Then User selects the checkbox for reqiured service Bundle
   	Then User clicks on Save And Sign Agreement
    Then User Clicks on Save And Con Setup
    Then User selects bundle from service DDL and Clicks on Add Button
   	Then User clicks on generate and Publish
   	Then User Clicks on Advance Search and Select Create Setup Button for desired Opportunity
   	Then User selects the Setup Start Date
   	Then User select desired Frequency and Schedule
   	Then User Selects primary Route and Clicks on Save And Generate Btn
   	Then User Selects Start date and End Date and click on Generate Online Work Order
    Then User Selects all generated work order CheckBox and Clicks on Publish Online
    Then User clicks on Appointment Tab and Select Service Appointment
    Then User selects the desired opportunity and clicks on enter current Time
    And User Clicks on Save and Continue Button and Clicks on Continue
    Then User Sign Agreement and Select Date 
    And Select Payment Mode and Clicks on Save And Continue Button
    Then User gives Technician and Customer Sign
    Then User clicks on Submit and Clicks on Send Mail
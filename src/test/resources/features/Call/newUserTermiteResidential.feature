Feature: Create Termite  opportunity for new user.

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system
    
@nuTermite
 Scenario: Test opportunity From Left nevigation menu with new account and without Lead for Termite
    When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    
    
        @nuTermitewithLead
 Scenario: Test opportunity From Left nevigation menu with new account and with Lead for Termite
    When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User creates Lead
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    
    @nuTermiteResidentialMarkAsLost
    Scenario: Testing Mark as lost for Termite opportunity 
    When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User Selects Package Bundle, Service Frequency and Billing Frequency
    Then User selects the Package and Clicks on Add Button
    Then User Clicks on Mark As Lost
    Then User Selects Reason and Description And Save
    
    @nuTermiteResidentialSave
    Scenario: Testing Save opportunity in termite
    When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User Selects Package Bundle, Service Frequency and Billing Frequency
    Then User selects the Package and Clicks on Add Button
    Then User Clicks on Save btn
    
    @nuTermiteResidentialSaveProposal
    Scenario: Testing Save and Proposal of opportunity in termite
    When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User Selects Package Bundle, Service Frequency and Billing Frequency	
    Then User Clicks on Save and Proposal
    Then User Clicks on Send Proposal
    
    
        @nuTermiteResidentialProposalMarkAsLost
    Scenario: Testing Proposal Mark As Lost opportunity in termite
    When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User Selects Package Bundle, Service Frequency and Billing Frequency	
    Then User Clicks on Save and Proposal
    Then User Clicks on MarkAsLost Send Proposal
    
    
    @nuTermiteResidentialSaveSignAgreement
Scenario: Test opportunity From Left nevigation  for Save Sign Agreement Termite
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User Selects Package Bundle, Service Frequency and Billing Frequency
    Then User selects the Package and Clicks on Add Button 
    Then User clicks on Save And Sign Agreement
    Then User Clicks Send Agreement and Clicks on Send Agreement Link 
      	  
      	  
      	  
@SaveStdPackageNonStdServices
Scenario: Test opportunity Termite to save Non Standard Services 
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
   	Then User clicks on Non Std Services
   	Then User selects Department and Add Service Name Frequencies
   	Then User Click on Add Button
   	Then User selects the service and Enter price Accordingly
	Then User Clicks on Save btn
	
	@SaveAndProposalStdPackageNonStdServices
Scenario: Test opportunity Termite to save and proposal Non Standard Services 
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
   	Then User clicks on Non Std Services
   	Then User selects Department and Add Service Name Frequencies
   	Then User Click on Add Button
  	Then User Clicks on Save and Proposal
    Then User Clicks on Send Proposal
   
   
   	@MarkAsLostSaveAndProposalStdPackageNonStdServices
Scenario: Test opportunity Termite to Mark as Lost Send Proposal Non Standard Services 
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
   	Then User clicks on Non Std Services
   	Then User selects Department and Add Service Name Frequencies
   	Then User Click on Add Button
  	Then User Clicks on Save and Proposal
  	Then User Clicks on MarkAsLost Send Proposal
   
      	@MarkAsLostStdPackageNonStdServices
Scenario: Test opportunity Termite to Mark as lost Non Standard Services 
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
   	Then User clicks on Non Std Services
   	Then User selects Department and Add Service Name Frequencies
   	Then User Click on Add Button
   	Then User Clicks on Mark As Lost
    Then User Selects Reason and Description And Save
    
    
     	  @SaveStdPackageServiceBundle
Scenario: Testing Save opportunity for Termite with Select Package Standard Services Service Package
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
   	Then User Clicks on Save btn
   	

@SendProposalStdPackageServiceBundle
Scenario: Testing Save and Proposal opportunity for Termite with Select Package Standard Services Service Package
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
   	Then User Clicks on Save and Proposal
   	Then User Clicks on Send Proposal
   	
   	@MarkAsLostSendProposalStdPackageServiceBundle
Scenario: Testing Mark As Lost Send Proposal opportunity for Termite with Select Package Standard Services Service Package
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
   	Then User Clicks on Save and Proposal
  	Then User Clicks on MarkAsLost Send Proposal



@MarkAsLostStdPackageServiceBundle
Scenario: Testing Mark as lost opportunity for Termite with Select Package Standard Services Service Package
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
   	Then User Clicks on Mark As Lost
    Then User Selects Reason and Description And Save








   	
   
   
   
   
   
   
   
   
   
   
@nuTermiteResidentialSaveSignAgreementCOMPLETE
Scenario: Test opportunity for Save and Sign Agreement Complete Termite 
   	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User Selects Package Bundle, Service Frequency and Billing Frequency
    Then User selects the Package and Clicks on Add Button 
    
    
    
    Then User clicks on Save And Sign Agreement
    Then User Clicks Send Agreement and Clicks on Send Agreement Link 
    Then REDIRECT browser to Gmail
   	And Open Gmail with Credentials
   	Then Open agreement mail
   	And Click on agreement link
  	Then User Agree Terms and Give Name
  	Then User Redirects to Dashboard
 	Then User clicks on customer opportunity
 	Then User Clicks on Advance search
  	Then Clicks on Complete
  	

  	
   
@nuTermiteResidentialCompleteStdPackageServicePackage
Scenario: Test opportunity for Termite with Select Package Standard Services Service Package complete
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User Selects Package Bundle, Service Frequency and Billing Frequency
    Then User selects the Package and Clicks on Add Button 
    Then User clicks on Save And Sign Agreement
    Then User Clicks on Save And Con Setup
    Then User Selects Service from DDL and Clicks on Add Button
    Then User selects from Frequency DDL Clicks Ok and Selects Schedule
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
    
    @nuTermiteResidentialCompleteStdPackageServiceBundle
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
   	 
   	
   	
 @nuTermiteResidentialCompleteStdPackageNonStdServices
Scenario: Test opportunity  for Termite with  Standard Package Non Standard Services
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
   	Then User clicks on Non Std Services
   	Then User selects Department and Add Service Name Frequencies
   	Then User Click on Add Button
   	Then User selects the service and Enter price Accordingly
   	Then User clicks on Save And Sign Agreement
    Then User Clicks on Save And Con Setup
    Then User selects bundle from Non std service DDL and Clicks on Add Button
   	Then User selects the Setup service Date
   	Then User Selects primary Route and Clicks on Generate and Publish
      Then User clicks on Appointment Tab and Select Service Appointment
    Then User selects the desired opportunity and clicks on enter current Time
     And User Clicks on Save and Continue Button 
    Then Clicks on save Continue
    Then User payment Method and Save Cont
    And User gives customer Technician Sign
    Then User clicks on Submit btn and Clicks on Send Mail
    
    
 




 	 
   	 
@SendViewAgreementNuTermiteScheduleEstimationInsideSpecificTime
Scenario: Test opportunity for Termite with send view agreement in Schedule Estimation with Inside And Specific Time
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
  	Then User clicks on Schedule estimation
    Then User Click on Assigned to
    Then User click on save Button
    Then User selects desired Opp from Sales
    Then User clicks on Save and Continue
    Then User add a desired service 
    Then User selects the service and Clicks on Save and View Agreement
    Then User clicks on save and Continue
    Then User agree terms enter Name and Sign
    Then User clicks on Save and Continue btn again
    Then User clicks on Send Mail
    
    
@SendProposalnuTermiteScheduleEstimationInsideSpecificTime
Scenario: Test opportunity for Termite with Send Proposal in Schedule Estimation with Inside And Specific Time
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User clicks on Schedule estimation
    Then User Click on Assigned to
    Then User click on save Button
    Then User selects desired Opp from Sales
    Then User clicks on Save and Continue
    Then User add a desired service 
    Then User clicks on Save and View Proposal
    Then User clicks on Send Proposal in service Summary
    Then User clicks on Send Proposal Mail
    
    
    
    @MarkAsLostnuTermiteScheduleEstimationInsideSpecificTime
Scenario: Test opportunity for Termite with Mark As Lost in Schedule Estimation with Inside And Specific Time
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User clicks on Schedule estimation
    Then User Click on Assigned to
    Then User click on save Button
    Then User selects desired Opp from Sales
    Then User clicks on Save and Continue
    Then User clicks on Mark as Lost
    
      @SaveNuTermiteScheduleEstimationInsideSpecificTime
Scenario: Test opportunity for Termite with Save in Schedule Estimation with Inside And Specific Time
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User clicks on Schedule estimation
    Then User Click on Assigned to
    Then User click on save Button
    
    
    

    
    
    

    
    
    
    
  @SendViewAgreementnuTermiteScheduleEstimationInsideRangeTime
Scenario: Test opportunity for Termite with send view agreement in Schedule Estimation with Inside And Range Time
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User clicks on Schedule estimation
    Then User click on Range Radio Button and select the desired time Range
    Then User Click on Assigned to
    Then User click on save Button
     Then User selects desired Opp from Sales
    Then User clicks on Save and Continue
    Then User add a desired service 
    Then User selects the service and Clicks on Save and View Agreement
    Then User clicks on save and Continue
    Then User agree terms enter Name and Sign
    Then User clicks on Save and Continue btn again
    Then User clicks on Send Mail
    
    @SendProposalnuTermiteScheduleEstimationInsideRangeTime
Scenario: Test opportunity for Termite with send proposal in Schedule Estimation with Inside And range Time
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User clicks on Schedule estimation
    Then User click on Range Radio Button and select the desired time Range
    Then User Click on Assigned to
    Then User click on save Button
    Then User selects desired Opp from Sales
    Then User clicks on Save and Continue
    Then User add a desired service 
    Then User clicks on Save and View Proposal
    Then User clicks on Send Proposal in service Summary
    Then User clicks on Send Proposal Mail
    
        @MarkAsLostTermiteScheduleEstimationInsideRangeTime
Scenario: Test opportunity for Termite with Mark as lost in Schedule Estimation with Inside And Range Time
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User clicks on Schedule estimation
    Then User click on Range Radio Button and select the desired time Range
    Then User Click on Assigned to
    Then User click on save Button
     Then User selects desired Opp from Sales
    Then User clicks on Save and Continue
    Then User clicks on Mark as Lost
    
    @SaveNuTermiteScheduleEstimationInsideRangeTime
Scenario: Test opportunity for Termite with Save in Schedule Estimation with Inside And Range Time
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User clicks on Schedule estimation
    Then User click on Range Radio Button and select the desired time Range
    Then User Click on Assigned to
    Then User click on save Button
    
    
    
    
    
   @SendViewAgreementNuTermiteScheduleEstimationFieldSpecificTime
Scenario: Test opportunity for Termite with send view agreement in Schedule Estimation with Field And Specific Time
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User clicks on Schedule estimation
    Then User Click on Field Radio Button
    Then User Click on Assigned to
    Then User click on save Button
     Then User selects desired Opp from Sales
    Then User clicks on Save and Continue
    Then User add a desired service 
    Then User selects the service and Clicks on Save and View Agreement
    Then User clicks on save and Continue
    Then User agree terms enter Name and Sign
    Then User clicks on Save and Continue btn again
    Then User clicks on Send Mail
    
    
      @SendProposalNuTermiteScheduleEstimationFieldSpecificTime
Scenario: Test opportunity for Termite with send Proposal in Schedule Estimation with Field And Specific Time
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User clicks on Schedule estimation
    Then User Click on Field Radio Button
    Then User Click on Assigned to
    Then User click on save Button
     Then User selects desired Opp from Sales
    Then User clicks on Save and Continue
    Then User add a desired service 
    Then User clicks on Save and View Proposal
    Then User clicks on Send Proposal in service Summary
    Then User clicks on Send Proposal Mail
    
      @MarkAsLostNuTermiteScheduleEstimationFieldSpecificTime
Scenario: Test opportunity for Termite with Mark As Lost in Schedule Estimation with Field And Specific Time
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User clicks on Schedule estimation
    Then User Click on Field Radio Button
    Then User Click on Assigned to
    Then User click on save Button   
     Then User selects desired Opp from Sales
    Then User clicks on Save and Continue
    Then User clicks on Mark as Lost
    

     @SaveNuTermiteScheduleEstimationFieldSpecificTime
Scenario: Test opportunity for Termite with save in Schedule Estimation with field And Specific Time
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User clicks on Schedule estimation
    Then User Click on Field Radio Button
    Then User Click on Assigned to
    Then User click on save Button
    
      @SendViewAgreementNuTermiteScheduleEstimationFieldRangeTime
Scenario: Test opportunity for Termite with send view agreement in Schedule Estimation with Field And Range Time
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User clicks on Schedule estimation
    Then User Click on Field Radio Button
       Then User click on Range Radio Button and select the desired time Range
    Then User Click on Assigned to
    Then User click on save Button
    Then User selects desired Opp from Sales
    Then User clicks on Save and Continue
    Then User add a desired service 
    Then User selects the service and Clicks on Save and View Agreement
    Then User clicks on save and Continue
    Then User agree terms enter Name and Sign
    Then User clicks on Save and Continue btn again
    Then User clicks on Send Mail
    
      @SendProposalNuTermiteScheduleEstimationFieldRangeTime
Scenario: Test opportunity for Termite with send proposal in Schedule Estimation with field And Range Time
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User clicks on Schedule estimation
    Then User Click on Field Radio Button
       Then User click on Range Radio Button and select the desired time Range
    Then User Click on Assigned to
    Then User click on save Button
    Then User selects desired Opp from Sales
    Then User clicks on Save and Continue
    Then User add a desired service 
    Then User clicks on Save and View Proposal
    Then User clicks on Send Proposal in service Summary
    Then User clicks on Send Proposal Mail
    
      @MarkAsLostNuTermiteScheduleEstimationFieldRangeTime
Scenario: Test opportunity for Termite with mark as lost in Schedule Estimation with range And Specific Time
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User clicks on Schedule estimation
    Then User Click on Field Radio Button
       Then User click on Range Radio Button and select the desired time Range
    Then User Click on Assigned to
    Then User click on save Button
       Then User selects desired Opp from Sales
    Then User clicks on Save and Continue
    Then User clicks on Mark as Lost
    
 @SaveNuTermiteScheduleEstimationFieldRangeTime
Scenario: Test opportunity for Termite with Save in Schedule Estimation with Field And range Time
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User clicks on Schedule estimation
     Then User Click on Field Radio Button
    Then User click on Range Radio Button and select the desired time Range
    Then User Click on Assigned to
    Then User click on save Button
   	 
   	   @MarkAsLostScheduleEstimation
Scenario: Test opportunity Mark As Lost for Termite in Schedule Estimation
	When user clicked on call tab button
    When enters lead info "Company", "Contact", "PrimaryEmail", "PrimaryPhone", "Cell", "SecondaryPhone" in form
    And select lead branch BranchName,Department,Primary Reason Of Call, Service, Source details in form
    Then User Add Account Alert and Account Description details
    Then User select opportunity type
    Then User Clicks On Continue btn
    Then User add Address for the contact
    Then User clicks on Schedule estimation
     Then User Click on Field Radio Button
    Then User click on Range Radio Button and select the desired time Range
    Then User Click on Assigned to
    Then User click on MarkAsLost before Save Schedule Estimation
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
 
   	
   	
   	
   

    
    
    
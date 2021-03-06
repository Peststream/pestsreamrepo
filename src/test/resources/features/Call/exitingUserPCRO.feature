@run @pcro @2711
Feature: Test for existing user PCRO for Pest.
 
  Background: 
   Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

#done
@EAWOLMSN @existingPCRO 
  Scenario: Test opportunity From Left nevigation menu with existing account and without lead for Residential
   When user click on CsrDashboard
   Then user click on AdvanceSearch
   Then user click on CreateNew
    When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    Then i chose service and sounce from respective DDL
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button

#done
 @EAWTLMSN @existingPCRO
  Scenario: Test opportunity From Left nevigation menu with existing account and with lead for Residential
   When user click on CsrDashboard
   Then user click on AdvanceSearch
   Then user click on CreateNew
     When enters lead info "Company", "PrimaryEmail","Contact", "PrimaryPhone", "Cell", "SecondaryPhone"
    Then i chose service and sounce from respective DDL
    And I create lead
    And enters "AccountAlert", "ProblemDescription"
    Then I click on Residential Radio button
    And click on continue button
    
 #done   
 @EAOOPPMSN @existingPCROMSN
  Scenario: Test open opportunity Add note and click on contiue sale process with existing account for Residential
    When user clicked on customer tab in left panel
    Then user clicked on opportunity subtab
    Then user click on advance search button
    Then user click on open tap
    And select opportunity
    Then user write a note
    
 #done
 @GITSMSN @existingPCRO
  Scenario: Test open opportunity General Info (Opportunity Info)>Select Pakage>Standard service>Service package for Residential
    When user clicked on customer tab in left panel
    Then user clicked on opportunity subtab
    Then user click on advance search button
    Then user click on open tap
    And select opportunity
    Then user write a note
    
   
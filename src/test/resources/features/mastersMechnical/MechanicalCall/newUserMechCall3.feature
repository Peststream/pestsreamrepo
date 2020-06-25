@run @Newusermechcall2
Feature: New USer Mech Call 3

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

 

  #Pass
  @CSSO_General_Mec3
  Scenario: Test Opportunity using PrimaryRoute.3
    When user clicked on CallTab
    Then user enters Company
    Then user enters Contact
    And user click on search
    Then user enters Primary Email
    Then user enters Cell
    Then user selects Branch Mech
    Then user selects Service
    Then user selects Source
    Then user enters Account Alert
    Then user enters Problem Description
    Then user click on Continue
    Then user selects on job type (New Construction)
    Then user click on Time and Material
    Then user enters Job Description
    Then user click on Add
    Then user click on Service Address
    Then user enters Address
    Then user enters Zip
    Then user enters City
    Then user click on Address Sub Type(residential)
    Then user click on Range 	Time
    Then select Time Range
    Then select Second Time Range
    Then user selects Primary Route
    And user clicks on Save Button Mech

 
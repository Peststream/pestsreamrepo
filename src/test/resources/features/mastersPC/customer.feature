Feature: To test the Customer tab feature

  Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system

  @LFCtS
  Scenario: To check add Lead From Customer Tab and Save
    When user clicked on customer tab in left panel
    Then User clicked on lead tab
    And user clicked on Add Lead Button
    Then user enter contact Details
    Then user enter Address Details
    And User select lead type
    Then user select team from DDL
    And User enter note
    Then User click on save button

  @LFCtSC
  Scenario: To check add Lead From Customer Tab and Save and Continue
    When user clicked on customer tab in left panel
    Then User clicked on lead tab
    And user clicked on Add Lead Button
    Then user enter contact Details
    Then user enter Address Details
    And User select lead type
    Then user select team from DDL
    And User enter note
    Then User click on save and continue button

  @AFCtS
  Scenario: To check add Account From Customer Tab and Save
    When user clicked on customer tab in left panel
    Then User clicked on Account tab
    And user clicked on Add Account Button
    Then user enter contact type Details
    Then user enter Account name
    And User add a company
    And User enter description
    Then User click on save button

  @cFCtS
  Scenario: To check add Company From Customer Tab and Save
    When user clicked on customer tab in left panel
    Then User clicked on Company tab
    And user clicked on Add Company Button
    Then user enter company name
    Then user select Source from DDL
    And User enter primary Email
    And user enter primary phone
    Then User click on save button

  @conFCtS
  Scenario: To check add Contact From Customer Tab and Save
    When user clicked on customer tab in left panel
    Then User clicked on contact tab
    And user clicked on Add Contact Button
    Then user enter title
    Then user enter First Name
    Then user enter Last Name
    And User enter primary Email
    And user enter primary phone
    Then user select Source from DDL
    Then User click on save button

  @DBFCtS
  Scenario: To check Database Entry From Customer Tab and Save
    When user clicked on customer tab in left panel
    Then User clicked on database tab
    And user clicked on Add database entry Button
    Then user enter First Name
    Then user enter Last Name
    And user enter Source Sys Name
    And user enter service Sys Name
    Then User click on save button

  #NeedsWorkNot Working
  @Opportunity
  Scenario: To Add Opportunity from Customer Tab and Save
    When user clicked on customer tab in left panel
    Then user clicked on opportunity subtab
    Then User Selects Add Opportunity Button
    Then User Selects New Account
    Then User sends Company Name Opportunity Name Value And Contact
    Then User Selects Department Primary reason for Call And Service Name Source Inside Sales Person Urgency
    Then User clicks on Residential Radio
    Then User Selects Confidence
    Then User Clicks on Save

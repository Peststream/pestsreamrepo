@run @bill
Feature: Test for Billing Transcition.

 Background: 
    Given User successfully logged into system with valid credentials
    When I enter a credentials for "CompanyAdmin"
    And I can click sign in
    Then I am granted access to the system
    
    @BillingTrasnsactionInvoice
  Scenario: Adding Billing Transaction Invoice
    When User clicks on Billing Transaction in Left Tab
    Then User add Transaction type Invoice
    Then User search desired Account Number
    Then User selects Terms for the transaction
    Then User selects the desired service and Add the service
    Then User clicks on the Save Button
    
        @BillingTrasnsactionRecievePayment
  Scenario: Adding Billing Transaction Recieved Payment
    When User clicks on Billing Transaction in Left Tab
    Then User add Transaction type Recieve Payment
    Then User search desired acc number recieved Payment
    Then user enter the amount he recieves and Reference Number
    Then User clicks on Save Button Recieved payment
    
         @BillingTrasnsactionCreditMemo
  Scenario: Adding Billing Transaction Credit Memo
    When User clicks on Billing Transaction in Left Tab
    Then User add Transaction type credit Memo
    Then User search account and selects desired account
    Then User selects desired service from DDL and Add service
    Then User Save the Memo
    
 
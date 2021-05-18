Feature: Amazon Order Page
  
  In Order to check my order details
  As a registered user
  I want to specify the feature of order details page

  Background: 
    Given a registered user exists
    Given user is on Amazon login page
    When user enters username
    And user enters password
    And user clicks on login button
    Then user navigates to order page

  Scenario: Check previous Order details
    When user clicks on previous Order link
    Then user checks the previous order details

  Scenario: Check Open Order details
    When user clicks on Open Order link
    Then user checks the Open order details

  Scenario: Check Cancelled Order details
    When user clicks on Cancelled  Order link
    Then user checks the Cancelled order details

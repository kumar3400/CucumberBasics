@All
Feature: Uber Booking Feature

  @Smoke
  Scenario: Booking Cab Sedan
    Given User wants to select a car type "sedan" from uber app
    When User selects car "sedan" and pickup point "Bangalore" and Drop Loaction "pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD

  @Regression @Smoke
  Scenario: Booking Cab SUV
    Given User wants to select a car type "SUV" from uber app
    When User selects car "sedan" and pickup point "Bangalore" and Drop Loaction "Hyderabad"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD

  @Prod
  Scenario: Booking Mini
    Given User wants to select a car type "Mini" from uber app
    When User selects car "sedan" and pickup point "pune" and Drop Loaction "Mumbai"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD

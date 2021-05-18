Feature: Login feature

  Scenario Outline: Login fail-possible combinations
    Given user is an application landing page
    When user clicks on Sign in button
    Then user is displayed login screen
    When user enters "<Username>" in username field
    And user enters"<Password>" in password field
    And user clicks on Sign in button
    Then user gets login failed error message

    Examples: 
      | Username           | Password          |
      | incorrectusername  |            123456 |
      | saikumarAutomation | incorrectpassword |
      | incorrectusername  | incorrectpassword |

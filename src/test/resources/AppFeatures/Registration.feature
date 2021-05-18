Feature: User Registration

  @All
  Scenario: user Registration with different data(Using asLists)
    Given User is on Registration page
    When User enters following user details
      | saikumar | automation | sai@gmail.com  |  9999 | Hyderabad |
      | tom      | peter      | tom@gmail.com  |  9888 | London    |
      | john     | root       | john@gmail.com | 89898 | newyork   |
    Then user registration should be successfull

  Scenario: user Registration with different data(Using asMaps)
    Given User is on Registration page
    When User enters following user details with coulmns
      | firstname | lastname   | email          | phone | city      |
      | saikumar  | automation | sai@gmail.com  |  9999 | Hyderabad |
      | tom       | peter      | tom@gmail.com  |  9888 | London    |
      | john      | root       | john@gmail.com | 89898 | newyork   |
    Then user registration should be successfull

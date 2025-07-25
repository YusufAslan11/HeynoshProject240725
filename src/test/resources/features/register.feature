@register
Feature: Register page automation test

  @register_free
  Scenario: Register page automation test

    Given User clicks on signUp for free button
    Then User enters full name
    Then User enters e-mail address
    Then User enters password
    Then User clicks on Continue button
    Then User clicks Agree and Continue button
    Then User clicks skip button
    Then User allows to the location
    Then User clicks While Using the app button
    Then User clicks on account button
    Then User sees Show Profile
    Then User closed the page

  @registerNegative
  Scenario Outline: Register page automation test negative scenario
    Given User clicks on signUp for free button
    Then User enters fullname
    Then User enters "<e-mail>" address_N
    Then User enters "<password>"
    Then User clicks on Continue button
    Then User should not register if user enters an incorrect email
    And User clicks on Continue buttons
    Then The user should not register if user enters an incorrect email or password..
    Then User closed the page
    Examples:
      | e-mail              | password |
      | deneme@             | 1234587  |
      | deneme@ase          | 6587452  |
      | denemetest@test.com | 12345    |
      | ttyusuf18@gmail.com | As.1456  |
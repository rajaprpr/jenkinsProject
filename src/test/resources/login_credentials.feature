
Feature: Book a Hotel in adactin

  Scenario: Verifying User on Login page
    Given User Enter into the Login page
    When User in Login Page

  Scenario: Verifying Login page Title are equals to actual Title
    Given User Enter into the Login page
    When User is verifying the Title

  Scenario: Verifying the Login page Logo present or not
    Given User Enter into the Login page
    When User verifying the Logo

  Scenario: Verifying Login button present or not
    Given User Enter into the Login page
    When User verifying the Login button

  Scenario Outline: Verifying the login details with valid credentials
    Given User is on Login page
    When User enter the "<username>" and "<password>"
    Then User should click the login button

    Examples: 
      | username     | password |
      | rajaselenium | raja123  |

  Scenario Outline: Verifying the login details with invalid credentials
    Given User is on Login page
    When User enter the "<username>" and "<password>"
    Then User should click the login button

    Examples: 
      | username  | password |
      | rajaselen | raja134  |

  Scenario: Verifying Forgot Password
    Given User Enter into the Login page
    When User should click the forgot password
    Then verifying the Forgot password page

  Scenario: Verifying  Important Note present or not
    Given User Enter into the Login page
    When User Verifying the Important note

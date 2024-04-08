Feature: Account Creation
  Scenario: Signing Up for an Account on TEKSCOOL
    When User Navigate to Signing in button
    Then User Navigate to Create account button
    Then Provide "Name","Email" and "Password"
    Then User to Click on SignUp button
    Then User Account is created

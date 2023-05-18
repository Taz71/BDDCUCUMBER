@LoginFeature @Regression
Feature: Techfios billing login page functionality validation

@Scenario1
  Scenario: user should able to login with valid credential
    Given User is on the Techfios login page
    When User enters username as "demo@techfios.com"
    When User enters password as "abc123"
    When User cllicks on signin button
    Then User should land on dashboard page

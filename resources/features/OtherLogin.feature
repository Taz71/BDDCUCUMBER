@OtherLoginFeature @Regression
Feature: Other Techfios billing login page functionality validation

  Background: 
    Given User is on the Techfios login page

  @OtherScenario1
  Scenario: Other Scenario -user should not be able to login with invalid valid credential
    When User enters username as "demo@techfios.com"
    When User enters password as "abc1234"
    When User cllicks on signin button
    Then User should land on dashboard page

  @OtherScenario2 @Smoke
  Scenario: Other Scenario -user should not be able to login with invalid valid credential
    When User enters username as "demo2@techfios.com"
    When User enters password as "abc1234"
    When User cllicks on signin button
    Then User should land on dashboard page
|username              | password|
| demo@techfios.com    | abc123  |
|  demo@techfios.com   | abc124  |

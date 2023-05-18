$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/OtherLogin.feature");
formatter.feature({
  "name": "Other Techfios billing login page functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@OtherLoginFeature"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.StepDefinition.user_is_on_the_Techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Other Scenario -user should not be able to login with invalid valid credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@OtherLoginFeature"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@OtherScenario1"
    }
  ]
});
formatter.step({
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters password as \"abc1234\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User cllicks on signin button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.StepDefinition.user_is_on_the_Techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Other Scenario -user should not be able to login with invalid valid credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@OtherLoginFeature"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@OtherScenario2"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User enters username as \"demo2@techfios.com\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters password as \"abc1234\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User cllicks on signin button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should land on dashboard page",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/TechfiosLogin.feature");
formatter.feature({
  "name": "Techfios billing login page functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "name": "user should able to login with valid credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.StepDefinition.user_is_on_the_Techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User cllicks on signin button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});
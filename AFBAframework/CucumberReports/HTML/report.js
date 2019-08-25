$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyFeatures/login.feature");
formatter.feature({
  "name": "login Feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test01"
    }
  ]
});
formatter.scenario({
  "name": "print something",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test01"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "okay",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDef.okay()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Bye",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDef.bye()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
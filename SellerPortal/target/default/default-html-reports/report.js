$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login as admin",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.sellerportal.step_definitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "com.sellerportal.step_definitions.LoginStepDefs.the_user_enters_the_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in successfully",
  "keyword": "And "
});
formatter.match({
  "location": "com.sellerportal.step_definitions.LoginStepDefs.the_user_logs_in_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
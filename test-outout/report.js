$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/jaideo/Documents/varsha-workspace/LeadFerretCucumberBDDFrameWorkWithPageObjModel/src/main/java/com/qa/Feature/Login.feature");
formatter.feature({
  "line": 1,
  "name": "QTP Selenium Login Feature",
  "description": "",
  "id": "qtp-selenium-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "QTP Selenium Login Scenario",
  "description": "",
  "id": "qtp-selenium-login-feature;qtp-selenium-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User launching the a browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User is on HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_launching_the_a_browser()"
});
formatter.result({
  "duration": 4272790257,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_Login_page()"
});
formatter.result({
  "duration": 11559024,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_logged_in()"
});
formatter.result({
  "duration": 2140127703,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_HomePage()"
});
formatter.result({
  "duration": 22904120,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.close_browser()"
});
formatter.result({
  "duration": 131651970,
  "status": "passed"
});
});
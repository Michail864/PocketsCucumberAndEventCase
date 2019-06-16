$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Contacts.feature");
formatter.feature({
  "line": 1,
  "name": "Send message to the developer validation",
  "description": "",
  "id": "send-message-to-the-developer-validation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Check out button to send message",
  "description": "",
  "id": "send-message-to-the-developer-validation;check-out-button-to-send-message",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I browse to pocketsdeveloper.com",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I parse name",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I parse mail",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I parse subject",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I parse message",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I press button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I close my browser",
  "keyword": "And "
});
formatter.match({
  "location": "ContactsSteps.i_browse_to_pocketsdeveloper_com()"
});
formatter.result({
  "duration": 5171631800,
  "status": "passed"
});
formatter.match({
  "location": "ContactsSteps.i_parse_name()"
});
formatter.result({
  "duration": 2243830900,
  "status": "passed"
});
formatter.match({
  "location": "ContactsSteps.i_parse_mail()"
});
formatter.result({
  "duration": 2115024700,
  "status": "passed"
});
formatter.match({
  "location": "ContactsSteps.i_parse_subject()"
});
formatter.result({
  "duration": 2107528400,
  "status": "passed"
});
formatter.match({
  "location": "ContactsSteps.i_parse_message()"
});
formatter.result({
  "duration": 2396466900,
  "status": "passed"
});
formatter.match({
  "location": "ContactsSteps.i_press_button()"
});
formatter.result({
  "duration": 2228562200,
  "status": "passed"
});
formatter.match({
  "location": "ContactsSteps.i_close_my_browser()"
});
formatter.result({
  "duration": 754600200,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HOME/eclipse-workspace/com.gmail.bdd/src/test/resources/gmailresources/Feature1.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 388267,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Validate gmail title",
  "description": "",
  "id": "login;validate-gmail-title",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "launch site",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "title should be \"Gmail\"",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "close site",
  "keyword": "When "
});
formatter.match({
  "location": "Gmailtitletest.method2()"
});
formatter.result({
  "duration": 12134973383,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gmail",
      "offset": 17
    }
  ],
  "location": "Gmailtitletest.method3(String)"
});
formatter.write("Gmail title test passed");
formatter.result({
  "duration": 5015007994,
  "status": "passed"
});
formatter.match({
  "location": "Gmailtitletest.method4()"
});
formatter.result({
  "duration": 2417204729,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Amazon.feature");
formatter.feature({
  "name": "To Validate Login page in amazon",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To validate login page using invaid credencials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User in amazon home page",
  "keyword": "Given "
});
formatter.step({
  "name": "User Enter invalid \"\u003cEmail\u003e\"login id",
  "keyword": "When "
});
formatter.step({
  "name": "User Click the continue button",
  "keyword": "And "
});
formatter.step({
  "name": "User enter invalid \"\u003cPassword\u003e\" password",
  "keyword": "And "
});
formatter.step({
  "name": "User close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Email",
        "Password"
      ]
    },
    {
      "cells": [
        "java@gmail.com",
        "java@123"
      ]
    },
    {
      "cells": [
        "selenium@gmail.com",
        "selenium@123"
      ]
    },
    {
      "cells": [
        "framework@gmail.com",
        "frame@123"
      ]
    },
    {
      "cells": [
        "sql@gmail.com",
        "sql@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate login page using invaid credencials",
  "description": "",
  "keyword": "Scenario Outline"
});

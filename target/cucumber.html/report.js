$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/basic.feature");
formatter.feature({
  "line": 1,
  "name": "Basic tests",
  "description": "",
  "id": "basic-tests",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "# Given - Initial Setup"
    },
    {
      "line": 3,
      "value": "# When - Perform some operations"
    },
    {
      "line": 4,
      "value": "# Then - Assertions"
    }
  ],
  "line": 6,
  "name": "Search for kajal",
  "description": "",
  "id": "basic-tests;search-for-kajal",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I navigate to the website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I search for \"kajal\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on \"Maybelline The Colossal Kajal Eyeliner Pencil - Black\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I check that I am on \"Maybelline The Colossal Kajal Eyeliner Pencil - Black\" Page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.navigateToWebsite()"
});
formatter.result({
  "duration": 136684007,
  "error_message": "java.lang.IllegalStateException: The driver is not executable: /Users/prinks/myAuto/seleniumProjectOne/src/main/java/com/Priyanka/webDrivers/chromedriver.exe\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:199)\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:125)\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:116)\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:32)\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:137)\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:296)\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:88)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:116)\n\tat com.Priyanka.cucumber.features.stepDefinitions.navigateToWebsite(stepDefinitions.java:32)\n\tat ✽.Given I navigate to the website(features/basic.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "kajal",
      "offset": 14
    }
  ],
  "location": "stepDefinitions.searchFor(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Maybelline The Colossal Kajal Eyeliner Pencil - Black",
      "offset": 12
    }
  ],
  "location": "stepDefinitions.clickOnAProduct(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Maybelline The Colossal Kajal Eyeliner Pencil - Black",
      "offset": 22
    }
  ],
  "location": "stepDefinitions.checkWhetherIAmOnTheRightPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinitions.closeTheBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 13,
  "name": "Fill in the shipping address",
  "description": "",
  "id": "basic-tests;fill-in-the-shipping-address",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I navigate to the website",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I search for \"bathroom freshner\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click on \"Citrus Magic Solid Air Freshener, Fresh Citrus, 8-Ounce\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I check that I am on \"Citrus Magic Solid Air Freshener, Fresh Citrus, 8-Ounce\" Page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I choose quantity as \"20\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I click on \"Add to Shopping Cart\" button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I check that I am on \"Added to Cart\" Page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I click on \"Proceed to checkout\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I enter Sign in credentials",
  "rows": [
    {
      "cells": [
        "email",
        "priyankamg.test@gmail.com"
      ],
      "line": 23
    },
    {
      "cells": [
        "password",
        "karu5%99"
      ],
      "line": 24
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.navigateToWebsite()"
});
formatter.result({
  "duration": 773281,
  "error_message": "java.lang.IllegalStateException: The driver is not executable: /Users/prinks/myAuto/seleniumProjectOne/src/main/java/com/Priyanka/webDrivers/chromedriver.exe\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:199)\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:125)\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:116)\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:32)\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:137)\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:296)\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:88)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:116)\n\tat com.Priyanka.cucumber.features.stepDefinitions.navigateToWebsite(stepDefinitions.java:32)\n\tat ✽.Given I navigate to the website(features/basic.feature:14)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "bathroom freshner",
      "offset": 14
    }
  ],
  "location": "stepDefinitions.searchFor(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Citrus Magic Solid Air Freshener, Fresh Citrus, 8-Ounce",
      "offset": 12
    }
  ],
  "location": "stepDefinitions.clickOnAProduct(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Citrus Magic Solid Air Freshener, Fresh Citrus, 8-Ounce",
      "offset": 22
    }
  ],
  "location": "stepDefinitions.checkWhetherIAmOnTheRightPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 22
    }
  ],
  "location": "stepDefinitions.iChooseQuantityAs(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Add to Shopping Cart",
      "offset": 12
    }
  ],
  "location": "stepDefinitions.iClickOnButton(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Added to Cart",
      "offset": 22
    }
  ],
  "location": "stepDefinitions.checkWhetherIAmOnTheRightPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Proceed to checkout",
      "offset": 12
    }
  ],
  "location": "stepDefinitions.clickOnAProduct(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinitions.iEnterSignInCredentials(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinitions.closeTheBrowser()"
});
formatter.result({
  "status": "skipped"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyFeatures/application.feature");
formatter.feature({
  "name": "application Feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test01"
    }
  ]
});
formatter.scenario({
  "name": "eApp application Feature test Scenario",
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
  "name": "User enter HomePage to click Manage cases button",
  "keyword": "When "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_enter_HomePage_to_click_Manage_cases_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input search to find AFBA case",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_input_search_to_find_AFBA_case()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the AFBA case",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.click_the_AFBA_case()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "create New Enrollment",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.create_New_Enrollment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Sponsor SSN and click Next button",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_input_Sponsor_SSN_and_click_Next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Sponsor firstName, lastName, dateOfBirth",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_input_Sponsor_firstName_lastName_dateOfBirth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select Eligibility, BranchOfService, DutyStatus, Rank and Contribution Mode",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_select_Eligibility_BranchOfService_DutyStatus_Rank_and_Contribution_Mode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input DepartmentCode and SourceCode",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_input_DepartmentCode_and_SourceCode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Show Coverage Options button",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_click_Show_Coverage_Options_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select firstOption",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_select_firstOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Next button",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.User_click_Next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select yes or No for Other Insurance option",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_select_yes_or_No_for_Other_Insurance_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select Yes or No for Better Alternative options",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_select_Yes_or_No_for_Better_Alternative_options()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cilck the Next button",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.cilck_the_Next_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d77.0.3865.75)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ALXLWX2304\u0027, ip: \u002710.120.5.31\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 77.0.3865.75, chrome: {chromedriverVersion: 77.0.3865.40 (f484704e052e0..., userDataDir: C:\\Users\\MABABA~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:63473}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d38271d28f803bd4004181419890afce\n*** Element info: {Using\u003dxpath, value\u003d//button[@class\u003d\u0027btn btn-success btn-next\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat stepdefination.ApplicationPageStepDef.cilck_the_Next_button(ApplicationPageStepDef.java:168)\r\n\tat ✽.cilck the Next button(MyFeatures/application.feature:28)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User select Sponsor gender",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_select_Sponsor_gender()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User input Sponsor height and weight",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_input_Sponsor_height_and_weight()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User input Sponsor address, Email and contact numbers",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_input_Sponsor_address_Email_and_contact_numbers()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click Next button",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.User_click_Next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click Next button",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.User_click_Next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enter Sponsor beneficiary fullName SSN Relationship DOB",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_enter_Sponsor_beneficiary_fullName_SSN_Relationship_DOB()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click Next buuton for next step",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_click_Next_buuton_for_next_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click Deducation day",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_click_Deducation_day()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User select Deducation day",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_select_Deducation_day()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User input Credit Card Number, Expiration Date and Cvv",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_input_Credit_Card_Number_Expiration_Date_and_Cvv()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click Signing in-person button",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_click_Signing_in_person_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click I agree to this coverage and ready to sign button",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_click_I_agree_to_this_coverage_and_ready_to_sign_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click the Review Application Ducuments",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_click_the_Review_Application_Ducuments()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Close the Application",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_Close_the_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User select Paper radio button",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_select_Paper_radio_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User input sponsor lastName",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_input_sponsor_lastName()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User input Last four SSN number",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_input_Last_four_SSN_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Click Sign button",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_Click_Sign_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click Sign button for Angent eSignature",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.user_click_Sign_button_for_Angent_eSignature()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "back to Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.back_to_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click View Transmittals button",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationPageStepDef.click_View_Transmittals_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "View Submission button to check submission",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.view_Submission_button_to_check_submission()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "check Download Data from XML file",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationPageStepDef.check_Download_Data_from_XML_file()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d77.0.3865.75)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ALXLWX2304\u0027, ip: \u002710.120.5.31\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 77.0.3865.75, chrome: {chromedriverVersion: 77.0.3865.40 (f484704e052e0..., userDataDir: C:\\Users\\MABABA~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:63473}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d38271d28f803bd4004181419890afce\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat utilities.TestBase.TearDown(TestBase.java:74)\r\n\tat stepdefination.Hooks.tearDown(Hooks.java:39)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.HookDefinitionMatch.runStep(HookDefinitionMatch.java:14)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:55)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:42)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:53)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:98)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:107)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
});
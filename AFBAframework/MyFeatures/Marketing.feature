@Test03
Feature: Marketing Opt In or Opt Out Test Environment

Scenario: Salesforce Test Environment Feature test Scenario

Given User input valid Email addrees
When User input valid SSN number
Then User input valid lastName
And User input valid DOB
Then User click the Next button
Then User can able to select State, district options
And User click Marketing option to make sure Markiting Opt in or Opt out
And User click Captcha button to varify I am not robot 
Then click Submit btton to send appilication
And User receive an Email 
And User can able to change Markiting Opt in or Opt Out section on SalesForce page. 

































@Test02
Feature: application Feature

Scenario: application Feature test Scenario
When User enter HomePage to click Manage cases button
Then User input search to find AFBA case
And click the AFBA case
Then create New Enrollment
Then User enter Sponsor SSN and click Next button
And User input Sponsor firstName, lastName, dateOfBirth 
And User select Eligibility, BranchOfService, DutyStatus, Rank and Contribution Mode
Then input DepartmentCode, SourceCode
Then User click Show Coverage Options button
And User select firstOption
Then User click Next button
And Second step Qualification select NO to other insurance
Then Select Yes or No to Better Alternative questions
Then cilck the Next button 
And User fillOut sponsor information to select gender
Then User select height,weight
Then User click Next on Spouse or Children info page
And User enter sponsor beneficiary fullName SSN Relationship DOB
Then User click Next buuton for next step







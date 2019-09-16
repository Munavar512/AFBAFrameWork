@Test01
Feature: application Feature

Scenario: eApp application Feature test Scenario

When User enter HomePage to click Manage cases button
Then User input search to find AFBA case
And click the AFBA case
Then create New Enrollment
Then User input Sponsor SSN and click Next button
And User input Sponsor firstName, lastName, dateOfBirth 

#Then If User select Married button
#Then User input Spouse firstName, lastName and DOB
#Then If User select IncludeChildren button
#Then User input Children firstName, lastName and DOB

And User select Eligibility, BranchOfService, DutyStatus, Rank and Contribution Mode
Then User input DepartmentCode and SourceCode
Then User click Show Coverage Options button
And User select firstOption
Then User click Next button

And User select yes or No for Other Insurance option
Then User select Yes or No for Better Alternative options
#Then User Spouse select Yes or No for Other Insurance options
#And User Spouse select Yes or No for Better Alternative options
Then cilck the Next button 

And User select Sponsor gender
Then User input Sponsor height and weight
Then User input Sponsor address, Email and contact numbers
Then User click Next button

#Then User input valid Spose SSN numbers
#And User select Spouse gender
#Then User select Spouse height and weight
And User click Next button

#And User select Sponsor beneficiary option
#Then User select Spouse beneficiary option
#Then User click Next Button for Beneficiaries for Better Alternative

And User enter Sponsor beneficiary fullName SSN Relationship DOB
Then User click Next buuton for next step
Then User click Deducation day
Then User select Deducation day
And User input Credit Card Number, Expiration Date and Cvv
Then User click Signing in-person button
Then User click I agree to this coverage and ready to sign button
Then User click the Review Application Ducuments
Then User Close the Application
#And User click the check box
Then User select Paper radio button 
And User input sponsor lastName
And User input Last four SSN number
Then User Click Sign button
And User click Sign button for Angent eSignature
Then back to Home page
And click View Transmittals button
Then View Submission button to check submission
Then check Download Data from XML file


















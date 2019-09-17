@eApp
Feature: eApp Application Feature

Scenario: eApp application Feature test Scenario

When HomePage to click Manage cases button
Then Enrollment Cases to search AFBA case
And Click AFBA case to open it
Then Create New Enrollment
Then Input Sponsor SSN number and click Next button
And Input Sponsor firstName, lastName, dateOfBirth 
Then Select Eligibility options, Branch of Servive, Duty Status, Rank and Contribution Mode
And Input Department Code and Source Code
Then Input Street1, Street2, City, ST, Zip
And Input Email Address
Then Input Daytime phoe
And Second phone
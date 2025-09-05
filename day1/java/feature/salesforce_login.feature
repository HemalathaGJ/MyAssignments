Feature: Login function Salesforce application
@Salesforce
Scenario Outline: Login with valid credentials

Given Enter username <UserName>
And Enter password <Password>
When Click Login button
Then should be able to login


Examples:
|UserName            |Password|
|vidyar@testleaf.com |Sales@123|

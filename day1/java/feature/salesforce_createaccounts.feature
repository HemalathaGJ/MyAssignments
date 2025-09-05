Feature: Create Account function - Salesforce application
@Salesforce
Scenario Outline: Create new account using App Launcher with my name as Account name

Given Enter username <Username>
And Enter password <Password>
When Click Login button
Then should be able to login
When Click on toggle menu button from the left corner 
And Click view All and click Sales from App Launcher
And Click on Accounts tab
And Click on New button
And Enter accountname as <AccountName>
And Select Ownership as <Ownership>  
And Click save and verify Account name 
Then The Account name displayed in the screen should be <AccountName>


Examples:
|Username             |Password |AccountName|Ownership|
|vidyar@testleaf.com  |Sales@123| Hemalatha | Public  |


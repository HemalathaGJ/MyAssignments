Feature: CreateAccount function of Leaftaps application

@Leaftaps
Scenario Outline: CreateAccount with multiple data


Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should be able to login
When Click on the CRMSFA link
And Click on the Accounts link
And Click on the Create Account link
And Enter the Accountname as <AccountName>	
When Click on the Create Account button
Then Account should be created

Examples:
|AccountName|
|'TestLeaf'|

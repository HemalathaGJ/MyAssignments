Feature: EditAccount function of Leaftaps application

@Leaftaps
Scenario Outline: EditAccount with multiple data


Given  Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should be able to login
When Click on the CRMSFA link
And Click on the Accounts link
And Click on the Account displayed under Account List table
When Click on the Edit button
And Edit the Accountname as <AccountName>
When Click on the Save button
Then Account should be displayed with new Accountname

Examples:
|AccountName|
|'TestLeaf1111'|

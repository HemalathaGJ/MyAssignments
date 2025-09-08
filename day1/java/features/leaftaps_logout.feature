Feature: Login function of Leaftaps application


@Leaftaps
Scenario Outline: Login with valid credentials


Given Enter the username as <UserName>
And Enter the password as <Password>
When Click on the Login button
Then It should be able to login
When Click on the CRMSFA link
And Click on the Logout link
Then It should be able to logout

Examples:
|UserName			|Password|
|'Demosalesmanager' |'crmsfa'|
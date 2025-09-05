Feature: DeleteAccount function of Leaftaps application

@Leaftaps
Scenario Outline: DeleteAccount with multiple data


Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should be able to login
When Click on the CRMSFA link
And Click on the Accounts link
And Click on the Account displayed under Account List table
When Click on the Deactivate Account button
And Click on the Ok button in the alert message box
Then Account should be deactivated with the confirmation message
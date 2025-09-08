Feature: Login function of Leaftaps application


@Smoke @Regression
Scenario: Login with valid credentials


And Enter the username as 'Demosalesmanager'
Given Enter the password as 'crmsfa'
When Click on the Login button
Then It should be able to login


@Sanity
Scenario: Login with invalid credentials


And Enter the username as 'Demo'
Given Enter the password as 'crm'
When Click on the Login button
But It throws error message
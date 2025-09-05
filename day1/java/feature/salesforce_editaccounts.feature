Feature: Edit Account function - Salesforce application
@Salesforce
Scenario: Edit existing account searching for name as my name

Given Enter uname 'vidyar@testleaf.com'	
And Enter pword 'Sales@123'
When Click Login button
Then should be able to login
When Click on toggle menu button from the left corner 
And Select Accounts
And Search for the account using your unique account name 'Hemalatha'
And Click the dropdown icon next to the account and select Edit
Then Edit Account window displayed 
Given Enter phone as '1111111111'
And Set Type to Technology Partner
And Set Industry to Healthcare.
And Enter the Billing Street as 'bsbsbs'
And Enter the Billing City as 'bcbc'
And Enter the Billing zip code as 'bzbz'
And Enter the Billing state as 'bpbpbp'
And Enter the Billing country as 'bcnt'
And Enter the Shipping Street as 'ssssss'
And Enter the Shipping City as 'scsc'
And Enter the Shipping zip code as 'szsz'
And Enter the Shipping state as 'spspsp'
And Enter the Shipping country as 'scnt'
And Set Customer Priority to Low
And Set SLA to Silver
And Set Active to NO
And Set Upsell Opportunity to No
When Click save and verify phone number '1111111111' for account 'Hemalatha'
Then The phone number displayed in the screen is the same as entered in the edit screen

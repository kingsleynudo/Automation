Narrative:
In order to access the product page
As a user
I want to log in successfully into Active Teach



Meta:
@author Kingsley Nudo
@date 09/11/2013

Scenario:Logging into Active Teach site successfully
Given the user is on the Active Teach home page
When the user enters the email <email> in the email field
When the user enters the password <password> in the password field
When the user clicks on the login button
Then the user should be taken to the product page

Examples:
|email|password|
|kingsley.nudo@pearson.com|Pearson1KM|
|kingsleynudo007@aol.com|59382king|








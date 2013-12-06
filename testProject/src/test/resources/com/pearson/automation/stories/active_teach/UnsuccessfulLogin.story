Narrative:
In order to attempt logging in
As a user
I want to log in unsuccessfully into Active Teach

Meta:
@author Kingsley Nudo
@date 09/11/2013

Scenario:Logging into Active Teach site unsuccessfully
Given the user is on the Active Teach home page
When the user enters the email <email> in the email field
When the user enters the password <password> in the password field
When the user clicks on the login button
Then the user should remain on the Active Teach home page

Examples:
|email|password|
|kingsleynudo@gmail.com|Pearson2KM|
|zzz@mee.com|zzz|
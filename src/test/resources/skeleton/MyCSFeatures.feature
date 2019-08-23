Feature: azzMy registration process for TestMeApp

@Registration
Scenario Outline: azzRegister into TestMeApp by entering valid information
Given azzTestMeApp is up and running
When azzUser enters valid username "<uname>"
Then azzenters firstname "<fname>"
And azzenters lastname "<lname>"
Then azzenters Password "<pwd>"
And azzenters Confirm Password "<cpwd>"
Then azzselects gender
Then azzenters valid email address "<email>"
Then azzenters valid phone number "<pno>"
And azzenters valid date of birth "<dob>"
Then azzenters Address "<address>"
Then azzSelects Security question 
And azzenters the answer "<sanswer>"
Then azzclicks on the submit button

Examples:
|uname|fname|lname|pwd|cpwd|email|dob|pno|address|sanswer|
|vnmr12345|vnmr|uuuu|Vnmr1234|Vnmr1234|vnmr12345@gmail.com|9895969899|08/08/1999|hyderabad|vilasavilli|
|vulppj123|vulppj|vulppj|Pwd1234|Pwd1234|vulppj@gmail.com|9895969892|12/15/1989|hyderabad|tuni|
|bugulusgr|sgr|bugulu|Pwd12345|Pwd12345|sgrb@gmail.com|9895969891|01/29/1998|hyderabad|hyderabad|


@UAT
Scenario Outline: azzLogin to TestMeApp by entering valid information
Given azzLogin page is ready after successfull registration
Then azzEnter valid username "<uname>"
And azzenters valid password "<pwd>"
Then azzclicks on Login

Examples:
|uname|pwd|
|lalitha|Password123|

@UAT
Scenario: azzUser searches products using search functionality
Given azzThe user is logged in
Then azzenter partial data of product in searchfield
And azzselects the product and clicks on find details
Then azzProduct is added to the cart
Then azzClicks on cart link to view items in cart
And azzclicks on checkout and proceed to pay redirected to Payment page
Then azzSelects the bank and clicks on continue
And azzEnters valid bank credentials to login
Then azzenters valid Transaction password and completes payment

@UAT
Scenario: azzThe one where the user moves to cart without adding add item in it
Given azzUser logins with valid credentials
When azzUser searches for a particular product like headphones
And azztry to proceed to payment without adding any item in the cart
Then azzTestMeApp doesn't display the cart icon

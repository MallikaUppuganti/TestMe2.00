Feature: azzMy registration process for TestMeApp

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

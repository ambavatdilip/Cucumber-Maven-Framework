Feature: Free CRM New Contact Feature

# Without Example

#Scenario: user is able to create new contact

#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "naveenk" and "test123"
#Then  user clicks on login button
#Given user is on home page
#Then user moves to new contact page
#Then user enter firstname and lastname
#Then user clicks on save button




# With Examples

Scenario Outline: user is able to create new contact

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then  user clicks on login button
Given user is on home page
Then user moves to new contact page
Then user enter contact details "<firstname>" and "<lastname>"
Then user clicks on save button
Then user close the browser

Examples:

       | username | password | firstname | lastname |
       | naveenk  | test123  | Poonam    | Jain     |
       | naveenk  | test123  | Amitab    | Bacchan  |
       | naveenk  | test123  | Sharda    | Ambavat  |
       


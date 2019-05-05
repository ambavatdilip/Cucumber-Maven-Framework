Feature: Free CRM New Deal Feature

Scenario: user is able to create new deal


Given user is already on Login Page
When title of login page is Free CRM
Then user enters username and password
| naveenk | test123 |
Then  user clicks on login button
Given user is on home page
Then user moves to new contact page
Then user enter contact details firstname and lastname
| Mohan | Kumar |
Then user clicks on contact save button
Then user move to deal page
Then user enter deal detail
| Selenium Deal | 2500 | 90 | 50 |
Then user click on deal page save button
Then user close the browser



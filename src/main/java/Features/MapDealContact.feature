Feature: Free CRM New Map Deal Feature

Scenario: user is able to create new Map deal


Given user is already on Login Page
When title of login page is Free CRM
Then user enters username and password
| username | password |
| naveenk | test123 |

Then  user clicks on login button
Given user is on home page
Then user moves to new contact page
Then user enter contact details firstname and lastname
| firstname | lastname |
| Dilip | Ambavat |
| Tisha | Ambavat |

Then user move to deal page
Then user enter deal detail

| title | Amount | Probability | Commission |
| QTP Deal | 1500 | 80 | 40 |
| JIRA Deal | 3500 | 70 | 30 |
| TOSCA Deal | 4500 | 60 | 20 |

Then user close the browser



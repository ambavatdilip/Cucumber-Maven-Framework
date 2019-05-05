$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Softtech/eclipse-workspace/POM/BDD_FreeCRM/src/main/java/Features/MapDealContact.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM New Map Deal Feature",
  "description": "",
  "id": "free-crm-new-map-deal-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "user is able to create new Map deal",
  "description": "",
  "id": "free-crm-new-map-deal-feature;user-is-able-to-create-new-map-deal",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9
    },
    {
      "cells": [
        "naveenk",
        "test123"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user moves to new contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enter contact details firstname and lastname",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname"
      ],
      "line": 16
    },
    {
      "cells": [
        "Dilip",
        "Ambavat"
      ],
      "line": 17
    },
    {
      "cells": [
        "Tisha",
        "Ambavat"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user move to deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user enter deal detail",
  "rows": [
    {
      "cells": [
        "title",
        "Amount",
        "Probability",
        "Commission"
      ],
      "line": 23
    },
    {
      "cells": [
        "QTP Deal",
        "1500",
        "80",
        "40"
      ],
      "line": 24
    },
    {
      "cells": [
        "JIRA Deal",
        "3500",
        "70",
        "30"
      ],
      "line": 25
    },
    {
      "cells": [
        "TOSCA Deal",
        "4500",
        "60",
        "20"
      ],
      "line": 26
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealMapStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 34491892032,
  "status": "passed"
});
formatter.match({
  "location": "DealMapStepDefinition.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 63939830,
  "status": "passed"
});
formatter.match({
  "location": "DealMapStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 1201224477,
  "status": "passed"
});
formatter.match({
  "location": "DealMapStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 10509137266,
  "status": "passed"
});
formatter.match({
  "location": "DealMapStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 22888415,
  "status": "passed"
});
formatter.match({
  "location": "DealMapStepDefinition.user_moves_to_new_contact_page()"
});
formatter.result({
  "duration": 3194170619,
  "status": "passed"
});
formatter.match({
  "location": "DealMapStepDefinition.user_enter_contact_details_firstname_and_lastname(DataTable)"
});
formatter.result({
  "duration": 5122251129,
  "status": "passed"
});
formatter.match({
  "location": "DealMapStepDefinition.user_move_to_deal_page()"
});
formatter.result({
  "duration": 1834822697,
  "status": "passed"
});
formatter.match({
  "location": "DealMapStepDefinition.user_enter_deal_detail(DataTable)"
});
formatter.result({
  "duration": 8076504546,
  "status": "passed"
});
formatter.match({
  "location": "DealMapStepDefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 678438851,
  "status": "passed"
});
});
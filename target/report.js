$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/adactinfeaturefile.feature");
formatter.feature({
  "name": "Book a Hotel in adactin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying the login details with credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "User is on Login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "rajaselenium",
        "raja123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying the login details with credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "User is on Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Page.user_is_on_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the \"rajaselenium\" and \"raja123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Page.user_enter_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Page.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Search the Hotel details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "User is on Search Hotel page",
  "keyword": "Given "
});
formatter.step({
  "name": "User select the details \"\u003clocation\u003e\" and \"\u003chotel\u003e\" and \"\u003croomtype\u003e\" and \"\u003cnoOfRoom\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enter the date \"\u003ccheckIn\u003e\" and \"\u003ccheckOut\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User select the person details \"\u003cadults\u003e\" and \"\u003cchildren\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User click the Search button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "location",
        "hotel",
        "roomtype",
        "noOfRoom",
        "checkIn",
        "checkOut",
        "adults",
        "children"
      ]
    },
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Standard",
        "4 - Four",
        "09/10/2020",
        "10/10/2020",
        "2 - Two",
        "1 - One"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search the Hotel details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "User is on Search Hotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchHotelPage.user_is_on_Search_Hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the details \"Sydney\" and \"Hotel Creek\" and \"Standard\" and \"4 - Four\"",
  "keyword": "When "
});
formatter.match({
  "location": "SearchHotelPage.user_select_the_details_and_and_and(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the date \"09/10/2020\" and \"10/10/2020\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchHotelPage.user_enter_the_date_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the person details \"2 - Two\" and \"1 - One\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchHotelPage.user_select_the_person_details_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Search button",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchHotelPage.user_click_the_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying the Selected details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "name": "User is on Select Hotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "SelectHotel.user_is_on_Select_Hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select the Hotel",
  "keyword": "When "
});
formatter.match({
  "location": "SelectHotel.user_should_select_the_Hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "SelectHotel.user_should_click_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verifying the Booking details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag4"
    }
  ]
});
formatter.step({
  "name": "User is on Hotel Booking page",
  "keyword": "Given "
});
formatter.step({
  "name": "User Enter the \"\u003cfirstName\u003e\" and \"\u003clastName\u003e\" and \"\u003caddress\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User Enter the Creditcard details",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "CreditCardNo",
        "CardType",
        "Exp_Month",
        "Exp_Year",
        "CVV"
      ]
    },
    {
      "cells": [
        "8766789876545678",
        "VISA",
        "July",
        "2022",
        "2345"
      ]
    }
  ]
});
formatter.step({
  "name": "User should click the BookNow button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "address"
      ]
    },
    {
      "cells": [
        "Raja",
        "murugan",
        "Chennai, OMR"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying the Booking details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag4"
    }
  ]
});
formatter.step({
  "name": "User is on Hotel Booking page",
  "keyword": "Given "
});
formatter.match({
  "location": "BookHotelPage.user_is_on_Hotel_Booking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter the \"Raja\" and \"murugan\" and \"Chennai, OMR\"",
  "keyword": "When "
});
formatter.match({
  "location": "BookHotelPage.user_Enter_the_and_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter the Creditcard details",
  "rows": [
    {
      "cells": [
        "CreditCardNo",
        "CardType",
        "Exp_Month",
        "Exp_Year",
        "CVV"
      ]
    },
    {
      "cells": [
        "8766789876545678",
        "VISA",
        "July",
        "2022",
        "2345"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "BookHotelPage.user_Enter_the_Creditcard_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the BookNow button",
  "keyword": "Then "
});
formatter.match({
  "location": "BookHotelPage.user_should_click_the_BookNow_button()"
});
formatter.result({
  "status": "passed"
});
});
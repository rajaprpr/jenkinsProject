Feature: Book a Hotel in adactin

  @tag1
  Scenario Outline: Verifying the login details with credentials
    Given User is on Login page
    When User enter the "<username>" and "<password>"
    Then User should click the login button

    Examples: 
      | username     | password |
      | rajaselenium | raja123  |

  @tag2
  Scenario Outline: Search the Hotel details
    Given User is on Search Hotel page
    When User select the details "<location>" and "<hotel>" and "<roomtype>" and "<noOfRoom>"
    And User enter the date "<checkIn>" and "<checkOut>"
    And User select the person details "<adults>" and "<children>"
    Then User click the Search button

    Examples: 
      | location | hotel       | roomtype | noOfRoom | checkIn    | checkOut   | adults  | children |
      | Sydney   | Hotel Creek | Standard | 4 - Four | 09/10/2020 | 10/10/2020 | 2 - Two | 1 - One  |

  @tag3
  Scenario: Verifying the Selected details
    Given User is on Select Hotel page
    When User should select the Hotel
    Then User should click the continue button

  @tag4
  Scenario Outline: Verifying the Booking details
    Given User is on Hotel Booking page
    When User Enter the "<firstName>" and "<lastName>" and "<address>"
    And User Enter the Creditcard details
      | CreditCardNo     | CardType | Exp_Month | Exp_Year | CVV  |
      | 8766789876545678 | VISA     | July      |     2022 | 2345 |
    Then User should click the BookNow button

    Examples: 
      | firstName | lastName | address      |
      | Raja      | murugan  | Chennai, OMR |

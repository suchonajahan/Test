Feature: Add Customer

  @Scenario1
  Scenario Outline: Add new customer with valid data
    Given user in add customer page
    When user enters '<firstName>' and '<lastName>' and '<postCode>'
    And click add customer button
    Then manager will navigate to successful popup page

    Examples:
      | firstName | lastName | postCode |
      | Israt     | Jahan    | 2200     |

  @Scenario1
  Scenario: Add Customer name and currency
    When user in open account page
    When select customer name and currency
    And click process button
    Then navigate the successful popup page

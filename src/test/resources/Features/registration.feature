Feature: registration

  @smoke
  Scenario Outline:  Registration to the system

    Given user is in the Home page
    When user enter '<firstName>' and '<lastName>' and '<postCode>'
    And click on Add Customer
    Then user will be in the dashboard

    Examples:
      | firstName | lastName | postCode |
       | israt     | jahan    | 1234     |


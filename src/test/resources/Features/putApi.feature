Feature:
  @smoke
  Scenario Outline: Update Employee record
    Given user has the base api '<path>'
    When user update '<name>' and '<job>'
    And call put Api with body
    Then I receive valid response data

    Examples:
      | path  | name  | job |
      | users | israt | qa  |

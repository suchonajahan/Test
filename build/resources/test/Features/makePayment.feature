Feature:


  @Scenario5
Scenario Outline:
Given user click on Make Payment
When user enter '<phone>' and  '<name>' and '<amount>' and '<country>'
Then user will make payment

Examples:
| phone       | name | amount | country |
| 01711786756 | suchona | 500 | India   |

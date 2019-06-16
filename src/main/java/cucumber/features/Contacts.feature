Feature: Send message to the developer validation

Scenario: Check out button to send message

    Given I browse to pocketsdeveloper.com
    Then I parse name
    Then I parse mail
    Then I parse subject
    Then I parse message
    Then I press button
    And I close my browser

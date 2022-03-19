Feature: Calculator feature
  As a user I should be able to use  calculator

  Scenario: Add two numbers
    Given Calculator app is opened
    When User add 2 to 3
    Then User should see 5 as result


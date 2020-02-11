Feature: Shopping list

  Background: open application
    Given I check landing screen


  Scenario: Add shopping list
    When I click on add shopping list
    And I type "First List"
    And I click on add list
    Then I see new list "First List" on landing screen
    Then I click on "First List"
    Then I click on list settings
    And I chose to delete the list
    And I make sure to delete the list
    Then I check there is no "First List"
Feature: Basic tests

  Scenario: Search for kajal
    # Given - Initial Setup
    # When - Perform some operations
    # Then - Assertions
    Given I navigate to the website
    When I search for "kajal"
    And I click on "Maybelline The Colossal Kajal Eyeliner Pencil - Black"
    Then I check that I am on "Maybelline The Colossal Kajal Eyeliner Pencil - Black" Page
    And I close the browser


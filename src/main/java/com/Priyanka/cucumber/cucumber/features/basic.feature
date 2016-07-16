Feature: Basic tests

  Scenario: Search for kajal
    Given I navigate to the website
    When I search for "kajal"
    And I click on "Maybelline The Colossal Kajal Eyeliner Pencil - Black"
    Then I check that I am on "Maybelline The Collosal Kajal Eyeliner Pencil - Black" Page

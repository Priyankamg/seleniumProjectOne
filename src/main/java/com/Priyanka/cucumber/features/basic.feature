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

  Scenario: Fill in the shipping address
    Given I navigate to the website
    When I search for "bathroom freshner"
    And I click on "Citrus Magic Solid Air Freshener, Fresh Citrus, 8-Ounce"
    Then I check that I am on "Citrus Magic Solid Air Freshener, Fresh Citrus, 8-Ounce" Page
    Then I choose quantity as "20"
    Then I click on "Add to Shopping Cart" button
    Then I check that I am on "Added to Cart" Page
    Then I click on "Proceed to checkout"
    Then I enter Sign in credentials
    | email    | priyankamg.test@gmail.com |
    | password | karu5%99                  |
    And I close the browser



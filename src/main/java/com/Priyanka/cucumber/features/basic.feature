Feature: Basic tests
    # Given - Initial Setup
    # When - Perform some operations
    # Then - Assertions

  Scenario: Search for kajal
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
    When I choose quantity as "20"
    When I click on "Add to Shopping Cart" button
    Then I check that I am on "Added to Cart" Page
    When I click on "Proceed to checkout"
    When I enter Sign in credentials
    | email    | priyankamg.test@gmail.com |
    | password | karu5%99                  |
    Then I close the browser



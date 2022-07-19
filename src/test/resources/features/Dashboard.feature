Feature: User should be able to login and navigate to Products

  Background: Login as admin and select the company
    Given the user is on the login page
    Then the user enters the credentials
    And the user logs in successfully
    Then the user is able to select the company

  Scenario: User is able to create a new product
    When the user select the active products
    And the user clicks to add product


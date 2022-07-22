Feature: User should be able to make changes on Products

  Background:
    Given the user logs in and navigates to the products page

    @wip
  Scenario: User is able to add product
    When the user fills the required fields on the basic part
    Then the user selects the first variant and fills out the required fields
    And the user fills out the blank fields of the appeared variant parts
    Then the user hover overs to images tab
    And the user clicks on choose file and uploads the product image

Feature: Select products and add them to kart

  @A2
  Scenario Outline: Search product in Landing page and add to kart
    Given User is on GreenKart Landing Page
    When User searched  with shortname <name> and extracted actual name for product
    Then Increase 3 the quantity of product selected
    And Navigate to place order page
    And Verify the <name> is displayed
    And Verify that "Apply" and "Place Order" buttons

    Examples: 
      | name | qty |
      | Tom  |   3 |

Feature: Search and Place  the order for Products

  #Scenario: Search experience for product search in both home and Offers pages
  #Given User is on GreenKart Landing Page
  #When User searched  with shortname "Tom" and extracted actual name for product
  #Then user searched  for "Tom" shortname in offers page
  #And  validate product name in offers page matches with Landing page
  
  @A1
  Scenario Outline: Search experience for product search in both home and Offers pages
    Given User is on GreenKart Landing Page
    When User searched  with shortname <name> and extracted actual name for product
    Then user searched  for <name> shortname in offers page
    And validate product name in offers page matches with Landing page

    Examples: 
      | name |
      | Tom  |
      | Beet |


Feature: Verify differnet get operations using REST-Assured

  Scenario: Get the list of all products
    Given User perform Get Operation to get all list of products
    And User verify the total products and limits

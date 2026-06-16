Feature:TestAddToCart
@addtocart1
Scenario: Add to cart

    Given User is on loginpage
    When User user logins with Valid credentials "<username>","<password>"
    And User add items to cart
    Then Cart badge should update with digit 1

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
     
@addtocart2
     Scenario: Add to cart

    Given User is on loginpage
    When User user logins with Valid credentials "<username>","<password>"
    And User add 2 items to cart
    Then Cart badge should update with digit 2
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
    
  @Removefromcart   
     Scenario: remove from cart

    Given User is on loginpage
    When User user logins with Valid credentials "<username>","<password>"
    And User add items to cart
    And User remove item from cart
    Then Cart should display Add To cart again

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      
  @Productnames   
     Scenario: Find Product names

    Given User is on loginpage
    When User user logins with Valid credentials "<username>","<password>"
    Then User should see Product Names

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      
  @Productprice   
     Scenario: Find Product names

    Given User is on loginpage
    When User user logins with Valid credentials "<username>","<password>"
    Then User should see Product price

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |     
      
      
 @Sortlowtohigh     
  Scenario: Sort low to high

    Given User is on loginpage
    When User user logins with Valid credentials "<username>","<password>"
    And User sort low to high
    Then User should see low to high sorted Product

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |     
      
      
 @SortZtoA     
  Scenario: Sort Z to A

    Given User is on loginpage
    When User user logins with Valid credentials "<username>","<password>"
    And User sort Z to A
    Then User should see z to a sorted Products

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      
 
      
      
      
      
      
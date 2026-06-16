Feature:TestCheckout

@e2e
Scenario:E2ECheckout

 	Given User is on loginpage
    When User user logins with Valid credentials "<username>","<password>"
    And User add items to cart
    And USer clicks on Cart
    Then User finds added item and Checkout
    Then User fills shipping info
    Then User checks overview of products and Finish
    Then User completed order
    
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
  
  @Checkout    
Scenario:CheckoutPage

 	Given User is on loginpage
    When User user logins with Valid credentials "<username>","<password>"
    And User add items to cart
    And USer clicks on Cart
    Then User Removes item
      
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
         
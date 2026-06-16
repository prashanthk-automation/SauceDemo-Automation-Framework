Feature: Login functionality

@login
  	Scenario: Valid Login
    Given User is on loginpage
    When User enters username "<username>"
    And User enters password "<password>"
    And User clicks login
    Then User should navigate to homepage

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
           
@invalidcreds      
    Scenario: inValid credentilas Login
    Given User is on loginpage
    When User enters username "<username>"
    And User enters password "<password>"
    And User clicks login
    Then User should see invalid user message
    
    
    Examples:
    	| username      | password     |
 		| standard_user | test_1234    |

      
@lockedoutuser
	Scenario:Invalid Login
	Given User is on loginpage
    When User enters username "<username>"
    And User enters password "<password>"
    And User clicks login
    Then User should see error meessage
    
       Examples:
      | username      | password     |
      | locked_out_user | secret_sauce |
      
     @emptycreds 
      Scenario: Empty creds Login
	Given User is on loginpage
    When User enters username "<username>"
    And User enters password "<password>"
    And User clicks login
    Then User should see empty creds error meessage
    
    Examples:
      | username      | password     |
      |  | |
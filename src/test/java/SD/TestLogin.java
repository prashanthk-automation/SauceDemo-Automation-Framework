package SD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.LoginPage;
import constants.AppConstants;
import factory.DriverFactory;

public class TestLogin {
	
	LoginPage lp;
			
		    @Given("User is on loginpage")
		    public void User_is_on_loginpage() {

		    	DriverFactory.driver.get(AppConstants.Base_URL);
		        lp= new LoginPage(DriverFactory.driver);
		        
		        
		    }

		    @When("User enters username {string}")
		    public void user_enters_username(String username) {
		    	lp.enterusername(username);
		    }
		    
		    @And("User enters password {string}")
		    public void user_enters_password(String password) {
		    	lp.enterpassword(password);
		    }
		    @And("User clicks login")
		    public void user_clicks_login() {
		    	lp.login();
		    }
		    
		    //invalid credentials     
		    
		    @Then ("User should see invalid user message")
		    public void user_should_see_invalid_user_message()
		    {
		    	if (lp.invaliderror())
		    	{
		    		System.out.println("Pass");
		     	}
		    	else
		    	{
		    		System.out.println("Fail");
		    	}
		    
		    }
		    
		    
		    //locked out user
		    @Then("User should see error meessage")
		    public void user_should_see_error_message() {
		    	
		    if (lp.lockedouterror())
		    {
		    	System.out.println("Pass");
		    }
		    
		    else
		    {
		    	System.out.println("Fail");
		    }
		    }
		    
		    @Then("User should see empty creds error meessage")
		    public void user_should_see_empty_creds_error_message() {
		    	
		    if (lp.emptycrederror())
		    {
		    	System.out.println("Pass");
		    }
		    
		    else
		    {
		    	System.out.println("Fail");
		    }
		    }
		    
		    

		    @Then("User should navigate to homepage")
		    public void user_should_navigate_to_homepage() {
		    	lp.getUrl();
		    	
		    }
		    
		    

}

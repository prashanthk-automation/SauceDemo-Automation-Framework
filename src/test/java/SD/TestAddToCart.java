package SD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;

import Pages.LoginPage;
import Pages.ProductsPage;
import constants.AppConstants;
import factory.DriverFactory;

public class TestAddToCart {
	
	LoginPage lp;
	ProductsPage pp;

	@When("User user logins with Valid credentials {string},{string}")
	public void user_user_logins_with_valid_credentials(String username, String password) 
	{
		lp = new LoginPage (DriverFactory.driver);
		
		
	lp.enterusername(username);
	lp.enterpassword(password);
	lp.login();
	
	pp = new ProductsPage (DriverFactory.driver);
	
				
	}
	//add 1 item to cart
	@When("User add items to cart")
	public void user_add_items_to_cart() 
	{
				pp.backpack();
	}
	//add 2 items to cart
	@When ("User add 2 items to cart")
	public void user_add_2items_to_cart()
	{
		pp.backpack();
		pp.backlight();
	}
	
	@When ("User remove item from cart")
	public void user_remove_item_from_cart()
	{
		pp.backpackrem();
	}
	
	@When ("User sort low to high")
	public void user_sort_low_to_high()
	{
		pp.sortlowtohigh();
	}
	
	@When ("User sort Z to A")
	public void user_sort_Z_to_A ()
	{
		pp.sortZtoA();
	}
	
	@And ("USer clicks on Cart")
	public void user_clicks_on_cart ()
	{
		pp.cartcontainer();
	}
	//add 1 item to cart
	@Then ("Cart badge should update with digit 1")
	public void cart_badge_should_update_with_digit_1()
	{
		String actualcount = pp.getCartBadgeCount();
		Assert.assertEquals(actualcount, "1");
		
	}
	
	//add 2 items to cart
	@Then ("Cart badge should update with digit 2")
	public void cart_badge_should_update_with_digit_2()
	{
		String actualcount = pp.getCartBadgeCount();
		Assert.assertEquals(actualcount, "2");
		
	}
	
	
	@Then ("Cart should display Add To cart again")
	public void cart_should_display_add_to_cart_again()
	{
		
		Assert.assertTrue(pp.backpackaddtocartdisplay());
	}
	
	@Then ("User should see Product Names")
	public void user_should_see_prodcut_names()
	{
		List <String> names = pp.getAllProductNames();
		Assert.assertTrue(names.contains(AppConstants.PRODUCT_NAME));
		
	}
	
	@Then ("User should see Product price")
	public void user_should_see_product_price ()
	{ 
		List <String> prices = pp.getAllProductPrice();
		Assert.assertTrue(prices.contains(AppConstants.PRODUCT_PRICE));

	}
	
	@Then ("User should see low to high sorted Product")
	public void user_should_see_low_tohigh_sorted_products()
	{
		List <Double> actualprices = pp.getAllProductPriceasDouble();
		List <Double> sortedprices = new ArrayList<>(actualprices);
		
		Collections.sort(sortedprices);
		
		Assert.assertEquals(actualprices, sortedprices);
		
	}
	
	@Then ("User should see z to a sorted Products")
	public void user_should_see_z_to_a_sorted_products()
	{
		List <String> actualnames = pp.getAllProductNames();
		List <String> sortednames = new ArrayList<> (actualnames);
		
		Collections.sort(sortednames, Collections.reverseOrder());
		
		Assert.assertEquals(actualnames, sortednames);
			
	}
	
}

	
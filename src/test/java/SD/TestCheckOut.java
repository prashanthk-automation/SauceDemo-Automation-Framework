package SD;

import org.testng.Assert;

import Pages.CheckOutPage;
import Pages.CompletePage;
import Pages.InfoPage;
import Pages.OverviewPage;
import constants.AppConstants;
import factory.DriverFactory;
import io.cucumber.java.en.Then;

public class TestCheckOut {
	
	
	CheckOutPage CP;
	InfoPage ip;
	OverviewPage OP;
	CompletePage cmplt;
	
	@Then ("User finds added item and Checkout")
	public void user_finds_added_item () throws InterruptedException
	{
		CP = new CheckOutPage (DriverFactory.driver);
		CP.checkout();
		
		ip = new InfoPage (DriverFactory.driver);
		OP = new OverviewPage (DriverFactory.driver);
		cmplt = new CompletePage (DriverFactory.driver);
		
		//CP.backpackremchcekout();
		
		
	}
	
	@Then ("User Removes item")
	public void user_removes_item()
	{
		CP = new CheckOutPage (DriverFactory.driver);
		CP.removeitem();
	}
	
	@Then ("User fills shipping info")
	public void user_fills_shipping_info() throws InterruptedException
	{
		
		
		ip.firstname();
		ip.lastname();
		ip.zip();
		ip.cotinue();
		System.out.println(DriverFactory.driver.getCurrentUrl());
		
	}
	
	@Then ("User checks overview of products and Finish")
	public void user_checks_overview_of_products_finish () throws InterruptedException
	{
		System.out.println(DriverFactory.driver.getCurrentUrl());
		
		String actualText =OP.Overview();
		
		Assert.assertEquals(actualText,AppConstants.PRODUCT_NAME);
		OP.finish();
		
	}
	
	@Then ("User completed order")
	public void user_completed_order ()
	{
		String actual = cmplt.complete();
		
		Assert.assertEquals(actual, AppConstants.SUCCESS_MESSAGE);
	}
	
	

}

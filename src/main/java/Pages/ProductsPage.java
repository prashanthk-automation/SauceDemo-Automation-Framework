package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage
{
		
	public ProductsPage(WebDriver driver)
	{
		super(driver);
	}
	
		
	//Add-sauce-labs-backpack
	public void backpack() 
	{
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	
	}
	public boolean backpackaddtocartdisplay()
	{
		return driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).isDisplayed();
	}
	
	//remove back pack
	public void backpackrem() 
	{
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();;
	
	}
	//remove-sauce-labs-backpack display
	public boolean backpackremdisplay() 
	{
	return driver.findElement(By.id("remove-sauce-labs-backpack")).isDisplayed();
	
	}
	
	//backlight
	public void backlight()
	{
		
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	}
	
	//Product names list
	public List<String> getAllProductNames() 
	{
		List <WebElement> products = driver.findElements(By.className("inventory_item_name"));
		List <String> productnames = new ArrayList<>();
		
		for (WebElement product : products)
		{
			productnames.add(product.getText());
		}
		
		return productnames;
	}
	
	//Product price list
	public List<String> getAllProductPrice() 
	{
		List <WebElement> price = driver.findElements(By.className("inventory_item_price"));
		List <String> productprice = new ArrayList<>();
		
		for (WebElement amount : price)
		{
			productprice.add(amount.getText());
		}
		
		return productprice;
	}
	
	//product price list in double
	public List<Double> getAllProductPriceasDouble()
	{
		List<String> prices = getAllProductPrice();
		List <Double> pricevalues = new ArrayList<>();
		
		for (String price : prices)
		{
			String actualprice = price.replace("$","");
			pricevalues.add(Double.parseDouble(actualprice));
			
			
		}
		return pricevalues;
	}
	
	//Cartcontainer
			public void cartcontainer()
			{
				driver.findElement(By.id("shopping_cart_container")).click();
			}
	//shoppingcart
	public boolean cartbadge() 
	{
		return driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).isDisplayed();
		
	}
	
//Hard coded Badge
	//singleitemcartbadge
	public boolean singleitem()
	{
		return driver.findElement(By.xpath("//span[text()='1']")).isDisplayed();
	}
	
	//2itemcartbadge
		public boolean dualitem()
		{
			return driver.findElement(By.xpath("//span[text()='2']")).isDisplayed();
		}
		
//Reusable method
		public String getCartBadgeCount()
		{
			
			return driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).getText();
		}
		
	
			
	//menu
	public void cartmenu()
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
	}
	
	//allitems
	
	public void cartmenuallitems()
	{
		driver.findElement(By.id("inventory_sidebar_link")).click();
	}
	//about
	public void cartmenuabout()
	{
		driver.findElement(By.id("about_sidebar_link")).click();
	}
	//logout
	public void cartmenulogout()
	{
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
	//reset
	public void cartmenureset()
	{
		driver.findElement(By.id("reset_sidebar_link")).click();
	}
	
	//closecartmenu
	public void cartmenuclose()
	{
		driver.findElement(By.id("react-burger-cross-btn")).click();
	}
	
	//Sortbutton
	
	public void cartSort()
	{
		driver.findElement(By.id("//select[@class = 'product_sort_container']")).click();
	}
	
	//AtoZ
	public void sortAtoZ()
	{
		driver.findElement(By.xpath("//option[text()= 'Name (A to Z)']")).click();
	}
	
	//ZtoA
	public void sortZtoA()
	{
		driver.findElement(By.xpath("//option[text()= 'Name (Z to A)']")).click();
	}
	
	//Price low to High
		public void sortlowtohigh()
		{
			driver.findElement(By.xpath("//option[text()= 'Price (low to high)']")).click();
		}
		
		//Price High to low
		public void sorthightolow()
		{
			driver.findElement(By.xpath("//option[text()= 'Price (high to low)']")).click();
		}
		
	
	
}

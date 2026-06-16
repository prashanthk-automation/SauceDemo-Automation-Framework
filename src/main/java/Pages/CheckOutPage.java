package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckOutPage extends BasePage{

	
	public CheckOutPage(WebDriver driver)
	{
		super(driver);
	}
	
	//remove-sauce-labs-backpack display
		public boolean backpackremchcekout() 
		{
		return driver.findElement(By.id("remove-sauce-labs-backpack")).isDisplayed();
		
		}
		
		public void removeitem()
		{
			driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		}
		
		
		public void continueshop ()
		{
			driver.findElement(By.id("continue-shopping")).click();
		}
		
		public void checkout ()
		{
			driver.findElement(By.id("checkout")).click();
		}


}

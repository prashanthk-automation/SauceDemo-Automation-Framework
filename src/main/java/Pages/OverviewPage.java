package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage extends BasePage {

	
	public OverviewPage(WebDriver driver)
	{
		super(driver);
	}

	public String Overview ()
	{
		return driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
	}
	
	

	public void finish()
	{
		driver.findElement(By.id("finish")).click();
	}
	
	public void cancel()
	{
		driver.findElement(By.id("cancel")).click();
	}
}

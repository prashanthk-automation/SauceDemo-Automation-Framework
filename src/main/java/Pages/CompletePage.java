package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompletePage extends BasePage {

	public CompletePage(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	public String complete()
	{
		return driver.findElement(By.xpath("//div[@class='complete-text']")).getText();
	}

}

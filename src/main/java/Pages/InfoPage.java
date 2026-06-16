package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class InfoPage extends BasePage {
	

	public InfoPage(WebDriver driver)
	{
		super(driver);
	}
	

	
	@SuppressWarnings("deprecation")
	public void firstname() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement fn = wait.until(ExpectedConditions.elementToBeClickable(By.id("first-name")));
		fn.sendKeys("ramu");
		Thread.sleep(2000);
		System.out.println(fn.getAttribute("value"));
	}
	@SuppressWarnings("deprecation")
	public void lastname() throws InterruptedException
	{
		WebElement ln = driver.findElement(By.id("last-name"));
		ln.sendKeys("kaval");
		Thread.sleep(2000);
		System.out.println(ln.getAttribute("value"));
	}
	@SuppressWarnings("deprecation")
	public void zip()
	{
		WebElement zp= driver.findElement(By.id("postal-code"));
		zp.sendKeys("23455");
		System.out.println(zp.getAttribute("value"));
	}
	
	public void cotinue()
	{
		driver.findElement(By.id("continue")).click();
		WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(5));

	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	        By.className("inventory_item_name")
	    ));
	}

}

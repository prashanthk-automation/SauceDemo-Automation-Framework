package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	

	
	public LoginPage (WebDriver driver)
	{
		super(driver);
	}

	
	public void enterusername(String username) 
	{
		driver.findElement(By.id("user-name")).sendKeys(username);;
	}
	
	public void enterpassword(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);;
	}
	
	public void login()
	{
		driver.findElement(By.id("login-button")).click();
	}
	
	public boolean invaliderror()
	{
		return driver.findElement(By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']")).isDisplayed();
	}
	public boolean lockedouterror()
	{
		return driver.findElement(By.xpath("//h3[text()='Epic sadface: Sorry, this user has been locked out.']")).isDisplayed();
	}
	
	public boolean emptycrederror()
	{
		return driver.findElement(By.xpath("//h3[text()='Epic sadface: Username is required']")).isDisplayed();
	}
	
	
	public void getUrl()
	{
		driver.getCurrentUrl();
	}
	
}

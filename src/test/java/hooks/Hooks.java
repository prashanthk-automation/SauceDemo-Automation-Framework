package hooks;

import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	
	@Before
	public void chromedriver() 
	{
		
		ChromeOptions options = new ChromeOptions();
		
		// Disable save password popup
	    options.addArguments("--disable-notifications");
	    options.addArguments("--incognito");
	    
	    options.setExperimentalOption(
	            "prefs",
	            Map.of(
	                    "credentials_enable_service", false,
	                    "profile.password_manager_enabled", false
	            )
	    );
	    
	    
	    
	WebDriverManager.chromedriver().setup();
    DriverFactory.driver = new ChromeDriver(options);
	DriverFactory.driver.manage().window().maximize();
	}
	
	
	
	
	@After 
	public void quit()
	{
		System.out.println(DriverFactory.driver.getTitle());
		DriverFactory.driver.quit();
        
	}
	
	

}

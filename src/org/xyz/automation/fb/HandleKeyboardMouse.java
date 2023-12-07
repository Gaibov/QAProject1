package org.xyz.automation.fb;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleKeyboardMouse 
{
	
	WebDriver driver;
	
	@Test
	public void HandleKeyboard() throws Exception
	{
	   // WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
	    act.sendKeys("user1").perform();
	    
	    act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
	    act.sendKeys("user2").perform();
	    
	    act.sendKeys(Keys.TAB).perform();              // when we dont put PERFORM test doesnt work
	    act.sendKeys("pass1").perform();
	    act.sendKeys(Keys.ENTER).perform(); 
	}
	
}
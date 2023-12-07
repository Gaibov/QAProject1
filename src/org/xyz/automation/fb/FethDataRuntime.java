package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FethDataRuntime 
{
	
	WebDriver driver;
	
	@Test
	public void lunchBrowser()
	{
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		String ExpUrl="https://www.facebook.com/";
		//driver.get("https://www.facebook.com/");
		driver.get(ExpUrl);
		driver.manage().window().maximize();
	
		//String ExpUrl="https://www.facebook.com/";
		String ActUrl=driver.getCurrentUrl();
		System.out.println(ActUrl);
		
		// Assert.assertEquals(ActUrl, ExpUrl);  //hard assertion
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(ActUrl, ExpUrl);
		
		String ExpTitle="Facebook - log in or sign up";
		String ActTitle=driver.getTitle();
		System.out.println(ActTitle);
		
		sa.assertEquals(ActTitle, ExpTitle);
		
		String ExpUname="Email or phone number";
		String ActUname=driver.findElement(By.id("email")).getAttribute("placeholder");		
		System.out.println(ActUname);
		sa.assertEquals(ActUname, ExpUname);
		
		// link text where is click
		String ExpLogin="Log In";
		String ActLogin=driver.findElement(By.name("login")).getText();
		System.out.println(ActLogin);
		sa.assertEquals(ActLogin, ExpLogin);
		
		//location of elements
		Point LocLogin=driver.findElement(By.name("login")).getLocation();
		System.out.println(LocLogin);
		
		//text html
		//System.out.println(driver.getPageSource());
		
		//Field Enabled
		boolean LogEnab=driver.findElement(By.name("login")).isEnabled();
		System.out.println(LogEnab);
		sa.assertEquals(LogEnab, true);
		
		driver.quit();
		sa.assertAll();
	}
}
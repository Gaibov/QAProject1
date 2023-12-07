package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomation1 
{
	
	WebDriver driver;
	
	@BeforeMethod
	public void lunchBrowser()
	{
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//Implicit write only one time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();		
	}
	
	@Test
	public void signupFunc() throws Exception
	{
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	//	Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Seelenium");
		driver.findElement(By.name("lastname")).sendKeys("Gaibov");
		driver.findElement(By.name("reg_email__")).sendKeys("Gaibov@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Pass1234");
	     
	}

	
	@Test
	public void loginFunc()
	{
	   	driver.findElement(By.id("email")).sendKeys("user1");
		driver.findElement(By.name("pass")).sendKeys("Pass123");
		driver.findElement(By.cssSelector("[type=submit]")).click();
		
	}
	
	}

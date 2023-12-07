package org.xyz.automation.ama;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FirstAutomation 
{

	@Test
	public void loginFunc()
	{
		WebDriver driver = new ChromeDriver(); 
		//WebDriver ewd = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.name("field-keywords")).sendKeys("Iphone 14");
		
		driver.findElement(By.cssSelector("[type=submit]")).click();
		//driver.close();
		
	}
	
	
}

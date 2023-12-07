package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoreFieldsFacebook 
{
	
	WebDriver driver;
	
	@Test
	public void lunchBrowser() throws Exception
	{
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.get("https://thetestingworld.com/testings/");
	//	driver.manage().window().maximize();
		//driver.findElement(By.name("fld_username")).sendKeys("user1");
		
		//driver.findElement(By.id("email")).clear();
		//driver.findElement(By.name("fld_username")).clear();
		
		//driver.findElement(By.name("fld_username")).sendKeys("user2");
		//driver.findElement(By.cssSelector("[value='home']")).click();
		
		//Select gen = new Select(driver.findElement(By.name("sex")));
		//gen.selectByIndex(1);  //1   eto male
		//gen.selectByValue("2");  // female
		//gen.selectByVisibleText("Male");
		
		//Select con = new Select(driver.findElement(By.name("country")));
		//con.selectByVisibleText("United States");
		//con.selectByVisibleText("India");
		//con.selectByVisibleText("United Kingdom");
		
		//con.deselectAll();
		//con.deselectByVisibleText("India");
		
		//driver.findElement(By.name("terms")).click();
		//driver.findElement(By.className("displayPopup")).click();
		//int a=30;
		//String name="java";
		//System.out.println("java");
		//System.out.println(name);
		
		//WebElement t=driver.findElement(By.name("terms"));
		//t.click();
		
		// For Face book
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("user1");
		
		driver.findElement(By.name("firstname")).clear();
		
		driver.findElement(By.name("firstname")).sendKeys("Tomy");
		driver.findElement(By.name("lastname")).sendKeys("Tmovich");
		driver.findElement(By.name("reg_email__")).sendKeys("tmovich992521@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("tmovich992521@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("hotam1234");
		
	//	driver.findElement(By.cssSelector("[value='home']")).click();
		

		
		Select selm = new Select(driver.findElement(By.name("birthday_month")));
		selm.selectByVisibleText("Dec");
		
		//Select seld = new Select(driver.findElement(By.name("birthday_day")));
		//seld.selectByValue("2");  
				
		Select selda = new Select(driver.findElement(By.name("birthday_day")));
		selda.selectByValue("2");  
				
		Select sely = new Select(driver.findElement(By.name("birthday_year")));
		sely.selectByValue("1973");  
		
		
		//driver.findElement(By.className("gender_wrapper")).click();
		//driver.findElement(By.className("_8esa")).click();
		driver.findElement(By.name("sex")).click();
		        
		driver.findElement(By.name("websubmit")).click();
		
		
			
	}
	
}
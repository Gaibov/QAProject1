package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoreFields 
{
	
	WebDriver driver;
	
	@Test
	public void lunchBrowser() throws Exception
	{
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		// u can used it any where when u make automation u havent any problem
		
		driver.findElement(By.name("fld_username")).sendKeys("user1");
		
		//driver.findElement(By.id("email")).clear();
		driver.findElement(By.name("fld_username")).clear();
		
		driver.findElement(By.name("fld_username")).sendKeys("user2");
		driver.findElement(By.cssSelector("[value='home']")).click();
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		//gen.selectByIndex(1);  //1   eto male
		//gen.selectByValue("2");  // female
		gen.selectByVisibleText("Male");
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		//con.selectByVisibleText("India");
		//con.selectByVisibleText("United Kingdom");
		
		//con.deselectAll();
		//con.deselectByVisibleText("India");
		
		driver.findElement(By.name("terms")).click();
		//driver.findElement(By.className("displayPopup")).click();
		//int a=30;
		//String name="java";
		//System.out.println("java");
		//System.out.println(name);
		Select st = new Select(driver.findElement(By.name("state")));
		st.selectByVisibleText("Arizona");
		
		Select ct = new Select(driver.findElement(By.name("city")));
		ct.selectByVisibleText("Bouso");
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Florida"));
		
		WebElement t=driver.findElement(By.name("terms"));
		t.click();
		
		// For Face book
/*		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	//	Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("user1");
		
		//driver.findElement(By.id("email")).clear();
		driver.findElement(By.name("firstname")).clear();
		
		driver.findElement(By.name("firstname")).sendKeys("user2");
		driver.findElement(By.name("lastname")).sendKeys("Gaibov");
		driver.findElement(By.name("reg_email__")).sendKeys("user1@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("h1234");
		
		driver.findElement(By.cssSelector("[value='home']")).click();
		
		Select selm = new Select(driver.findElement(By.id("month")));
		selm.selectByIndex(1);  //1   eto male
		//gen.selectByValue("2");  // female
		//selm.selectByVisibleText("Dec");
		
//Select con = new Select(driver.findElement(By.name("country")));
		//con.selectByVisibleText("United States");
	//	con.selectByVisibleText("India");
		//con.selectByVisibleText("United Kingdom");
		
		//con.deselectAll();
		//con.deselectByVisibleText("India");
		
	//	driver.findElement(By.name("terms")).click();
		
		
	*/	
		
		
		
	}
	
}
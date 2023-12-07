package org.xyz.automation.fb;

import java.io.File;

import org.apache.commons.io.FileUtils;   //come from apachi
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CapchScreenshot {

	public void screenshotresults(WebDriver driver) throws Exception
	{
		
		TakesScreenshot scr = (TakesScreenshot) driver;   //takes screenshot screenshot in memory
						
		File f=scr.getScreenshotAs(OutputType.FILE);
		File fd = new File("./TestResults/test.png") ;
		FileUtils.copyFile(f, fd);// from apache
	}
	
	
	
	
}

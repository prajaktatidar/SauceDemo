package com.saucedemoutilityPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class AllScreenshots 
{
	public static void getScreenshot(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\User\\Pictures\\SeleScreenShote\\"+name+".jpg");
		FileHandler.copy(source, destination);
		
	}

}

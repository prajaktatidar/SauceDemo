package com.saucedemoTestPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_verifyLoginFunctionality extends TestBaseClass
{	
	@Test
	public void verifyLogin() throws IOException
		{
		
//		take screenshot
		com.saucedemoutilityPack.AllScreenshots.getScreenshot(driver, "homePage=3rd nov");
		String expectedresult = "Swag Labs";
		String Actualresult=driver.getTitle();
		
		Assert.assertEquals(Actualresult, expectedresult);
																
		
	}  

}

package com.saucedemoTestPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemoPOMPack.HomePomClass;

public class TC04_verify_applyFilter extends TestBaseClass
{
	@Test
	public void verifyFilter() throws IOException
	{
        HomePomClass hp = new HomePomClass(driver);
		hp.clickOnFilterDropDown();
		
		com.saucedemoutilityPack.AllScreenshots.getScreenshot(driver, "DropDown26th Act");
		
		String expectedresult = "NAME (Z TO A)";
		String actualresult = hp.getTextOfFilter();
		System.out.println(actualresult);
		
		Assert.assertEquals(actualresult, expectedresult);	
	}

}

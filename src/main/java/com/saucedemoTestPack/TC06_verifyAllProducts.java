package com.saucedemoTestPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemoPOMPack.HomePomClass;

public class TC06_verifyAllProducts extends TestBaseClass
{
	@Test
	public void verifyAllProducts() throws IOException
	{
		com.saucedemoutilityPack.AllScreenshots.getScreenshot(driver,"home Page-1oct");
		HomePomClass hp = new HomePomClass(driver);
		hp.clickOnAllProducts();
		System.out.println("select all products");
		
		String expectedcount = "6";
		String Actualcount=hp.grttextofaddcart();
		System.out.println(Actualcount);
		
		Assert.assertEquals(Actualcount, expectedcount);
	}

}

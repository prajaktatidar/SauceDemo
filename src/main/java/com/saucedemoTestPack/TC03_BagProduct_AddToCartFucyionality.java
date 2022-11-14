package com.saucedemoTestPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemoPOMPack.HomePomClass;

public class TC03_BagProduct_AddToCartFucyionality extends TestBaseClass
{
	@Test
	public void BagProduct() throws IOException
	{
		HomePomClass hp = new HomePomClass(driver);
		hp.clickonbagproduct();
		System.out.println("clicked on bag product");
		com.saucedemoutilityPack.AllScreenshots.getScreenshot(driver, "BagProduct");
		//validation
		System.out.println("apply validation");
	    String expectedresult = "1";
		String actualProductcount = hp.grttextofaddcart();
		
		Assert.assertEquals(actualProductcount, expectedresult);
	}
}


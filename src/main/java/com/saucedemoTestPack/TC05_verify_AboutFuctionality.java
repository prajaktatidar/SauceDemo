package com.saucedemoTestPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemoPOMPack.HomePomClass;

public class TC05_verify_AboutFuctionality extends TestBaseClass
{
	@Test
	public void verifyaboutFuctionality() throws IOException
	{
			
//			take screenshot
			com.saucedemoutilityPack.AllScreenshots.getScreenshot(driver, "HomePage_24th_oct");
			
			HomePomClass hp = new HomePomClass(driver);
			hp.clickOnMenuButton();
			System.out.println("clicked on menubutton");
			hp.clickOnAbout();
			System.out.println("clicked on about");
			
			String expectedresult = "Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
			String actualrasult = driver.getTitle();
			
			Assert.assertEquals(actualrasult, expectedresult);

	}

}

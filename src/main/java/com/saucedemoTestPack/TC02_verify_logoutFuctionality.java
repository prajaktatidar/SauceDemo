package com.saucedemoTestPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.saucedemoPOMPack.HomePomClass;
public class TC02_verify_logoutFuctionality extends TestBaseClass
{

@Test
public void verifyLogout() throws IOException
	

{
	
//	logout fuctionality
	
	HomePomClass hp = new HomePomClass(driver);
	hp.clickOnMenuButton();
	System.out.println("click on menu button");
	hp.clickOnLogout();
	System.out.println("clocked on logout button");
	
	com.saucedemoutilityPack.AllScreenshots.getScreenshot(driver, "After Logout");
	
//	login page
	System.out.println("went to login page");
	
//	apply Validation
	
	String expectedresult = "Swag Labs";
	String ActualResult = driver.getTitle();
	
	org.testng.Assert.assertEquals(ActualResult, expectedresult);
	
}

}

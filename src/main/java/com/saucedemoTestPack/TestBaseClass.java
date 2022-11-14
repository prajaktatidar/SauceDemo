package com.saucedemoTestPack;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemoPOMPack.LoginPomClass;

public class TestBaseClass
{
	WebDriver driver;
    @Parameters("browserName")
	@BeforeMethod
	public void setup(String browserName) throws IOException
	{
    	if(browserName.equals("chrome"))
    	{
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	    driver = new ChromeDriver();
    	}
    	else
    	{
    		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
    	    driver = new FirefoxDriver();
    	}
		driver.get("https://www.saucedemo.com/");
		System.out.println("opened URL");
		
		System.out.println("browser opened");
		com.saucedemoutilityPack.AllScreenshots.getScreenshot(driver,"loginPage");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPomClass lp = new LoginPomClass(driver);
		lp.sendUsername();
		System.out.println("enterd user name");
		lp.sendPassword();
		System.out.println("enterd password");
		lp.clickOnloginButton();
		System.out.println("clicked on ligin button");
		System.out.println("went to home page");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("closed browser");

	}
	

}

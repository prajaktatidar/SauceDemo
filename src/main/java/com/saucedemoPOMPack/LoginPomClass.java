package com.saucedemoPOMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomClass
{
//	create this Pom class for verify the login functionality
	
	WebDriver driver;
	
//	we use standard format to find element
	
	@FindBy(xpath = "//input[@id='user-name']")
	WebElement username;
	
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
	
//	password
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
//	login button
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginButton;
	
	public void clickOnloginButton()
	{
		loginButton.click();
	}
	
//	Const class we need to craete
	
	public LoginPomClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

}

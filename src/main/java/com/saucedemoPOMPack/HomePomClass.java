package com.saucedemoPOMPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePomClass 
{
	private WebDriver driver; 
	private Select s;
	
	
	@FindBy(xpath ="//button[@id='react-burger-menu-btn']")
	WebElement menuButton;
	
	public void clickOnMenuButton()
	{
		menuButton.click();
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement LogOut;
	
	public void clickOnLogout()
	{
		LogOut.click();
	}
	
//	bag Product Add to Cart
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement bagprodutselect;
	
	public void clickonbagproduct()
	{
		bagprodutselect.click();
	}
	
	@FindBy(xpath = "//button[text()='Add to cart']")
	private List<WebElement> AllProducts;
	
	public void clickOnAllProducts()
	{
		for(int i=0; i<AllProducts.size();i++)
		{
			AllProducts.get(i).click();
		}
	}
	
    @FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement addtocartlink;
    
    public String grttextofaddcart()
    {
    	String actualcount = addtocartlink.getText();
    	return actualcount;
    }
    
    @FindBy(xpath="//select[@class='product_sort_container']")
    private WebElement applyFilterDropDown;
    public void clickOnFilterDropDown()
    {
    	applyFilterDropDown.click();
        s.selectByValue("za");
    }
    
    @FindBy(xpath = "//Span[@class='active_option']")
    private WebElement Filter;
    
    public String getTextOfFilter()
    {
    	String Actualtext = Filter.getText();
    	return Actualtext;
    }
    
    
    @FindBy(xpath="//a[@id='about_sidebar_link']")
    private WebElement about;
    public void clickOnAbout()
    {
    	about.click();
    }
    
    
    
		
	
	public HomePomClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	    s = new Select(applyFilterDropDown);
    	
	}
	

}

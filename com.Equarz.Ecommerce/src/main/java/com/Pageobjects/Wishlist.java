package com.Pageobjects;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;
import com.base.testbase3;

public class Wishlist  extends testbase3{
	
	
	@FindBy(xpath="//span[text()='TVs & Appliances']")
	WebElement cat;
	@FindBy(xpath="//span[text()='Microwave oven']")
	WebElement subcat;
	@FindBy(xpath="//a[text()='Premium']")
	WebElement subsub;
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/whirlpool-20-l-solo-microwave-oven-magicook-pro-20se-black-0SpMnj']")
    WebElement product;
	@FindBy(xpath="//i[@class='fa fa-heart-o ']")
	WebElement wishlist;
	@FindBy(xpath="//i[@class='navbar-tool-icon czi-heart']")
	WebElement heart;
	@FindBy(xpath="//i[@class='czi-close-circle']")
	WebElement remove;
	@FindBy(xpath="//div[text()='Product has been remove from wishlist!']")
	WebElement msg;
	
	
	@FindBy(xpath="//input[@class='form-control appended-form-control search-bar-input']")
	WebElement search;
	@FindBy(xpath="//button[@class='input-group-append-overlay search_button']")
	WebElement searchbtn;
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/dell-inspiron-5430-laptop-intel-i5-1335u-16gb-512gb-ssd-oEYo5B']")
	WebElement prod;
	
	@FindBy(xpath="//img[@class='d-block w-100 __slide-img']")      //banner
	WebElement ban;
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/jodhpuri-blazer-for-men-black-formal-casual-svSGUX']")
	WebElement pro;
	
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/earpods-boat-W0CoIT']")
	WebElement Hproduct;
	
	@FindBy(xpath="//button[@class='buy_btn']")
	WebElement buynow;
	
	
	public Wishlist (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void catwishlist() throws InterruptedException 
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(cat).build().perform();
		Thread.sleep(3000);
		ac.moveToElement(subcat).build().perform();
		subsub.click();		
		product.click();
		wishlist.click();
		Thread.sleep(2000);
		heart.click();
		remove.click();
		String print=msg.getText();
		assertEquals("Product has been remove from wishlist!",print);						
	}
	public void searchwishlist()
	{
		search.sendKeys(props.getProperty("product"));
		searchbtn.click();
		prod.click();
		wishlist.click();
		heart.click();
		remove.click();
		String print=msg.getText();
		assertEquals("Product has been remove from wishlist!",print);				
		
	}
	public void bannerwishlist()
	{
		ban.click();
		pro.click();
		wishlist.click();
		heart.click();
		remove.click();	
		String print=msg.getText();
		assertEquals("Product has been remove from wishlist!",print);				
		
	}
	public void homewishlist()
	{
		JavascriptExecutor js=(JavascriptExecutor )driver;
		js.executeScript("window.scrollBy(0,500)");
		Hproduct.click();
		wishlist.click();
		heart.click();
		remove.click();	
		String print=msg.getText();
		assertEquals("Product has been remove from wishlist!",print);				
		
	}
	public void dealswishlist()
	{
		JavascriptExecutor js=(JavascriptExecutor )driver;
		js.executeScript("window.scrollBy(0,500)");
		buynow.click();
		wishlist.click();
		heart.click();
		remove.click();					
		String print=msg.getText();
		assertEquals("Product has been remove from wishlist!",print);				
	}
}
	






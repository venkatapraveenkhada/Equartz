package com.Pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.testbase2;

public class Addtocart extends testbase2 {
	
	




	
		@FindBy(xpath="//button[@class='close __close']")
		WebElement popclose;
		
		@FindBy(xpath="//span[text()='TVs & Appliances']")
		WebElement cat;
		@FindBy(xpath="//span[text()='Microwave oven']")
		WebElement subcat;
		@FindBy(xpath="//a[text()='Premium']")
		WebElement subsub;
		@FindBy(xpath="//a[@href='http://e-quarz.com/product/panasonic-20l-solo-microwave-oven-nn-st26jmfdg-silver-51-auto-menus-C81NSM']")
	    WebElement product;
		@FindBy(xpath="//span[text()='Add to cart']")
		WebElement addtocart;
		public Addtocart (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public homepage validateProduct() throws InterruptedException
		{
			popclose.click();
			
			Actions ac=new Actions(driver);
			ac.moveToElement(cat).build().perform();
			Thread.sleep(3000);
			ac.moveToElement(subcat).build().perform();
			subsub.click();
			
			
			product.click();
			addtocart.click();
			
			return new homepage();
			
		}

	


	}

 
	


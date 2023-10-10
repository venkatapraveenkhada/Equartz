package com.Pageobjects;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;



public class searchproduct extends Testbase {
	
	@FindBy(xpath="//input[@class='form-control appended-form-control search-bar-input']")
	WebElement search;
	@FindBy(xpath="//ul[@class='list-grouplist-group-flush']")
	WebElement searchdd;
	
	public searchproduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void searchproduct() 
	{
		search.sendKeys("pendrive");
		search.sendKeys(Keys.ENTER);
	}


}

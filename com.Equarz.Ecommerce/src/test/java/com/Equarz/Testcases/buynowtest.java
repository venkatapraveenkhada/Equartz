package com.Equarz.Testcases;
import org.testng.annotations.Test;
import com.Pageobjects.Login_Functionality;
import com.Pageobjects.buynow;
import com.base.testbase1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class buynowtest extends testbase1{
	
	buynow bn;
	Login_Functionality lg;
	
	public buynowtest()
	{
		super();
	}
	@BeforeClass
	public void intialize() throws Throwable {
		
		Setup();
		lg=new Login_Functionality(driver);
		lg.logindata(props.getProperty("username"),props.getProperty("password"));
	    bn = new buynow(driver);
	     
	}
	@Test
	public void categorybuynow() 
	{
		bn.buynowcategory();
	}
	
	@Test
	public void cartbuynow() throws Throwable 
	{
		bn.buynowcart();
	}
}


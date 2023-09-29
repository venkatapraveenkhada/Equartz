package com.Equarz.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.Pageobjects.Login_Functionality;
import com.Pageobjects.Wishlist;
import com.Utils.Utils;
import com.base.Testbase;
import com.base.testbase3;

public class Wishlisttest extends testbase3{
	Wishlist wf; 
	Login_Functionality lg;
	
	
	public Wishlisttest()
	{
		super();
	}
	@BeforeMethod
	public void initialize() throws Throwable
	{
		
		Setup();
		lg=new Login_Functionality(driver);
		lg.logindata();
		wf=new Wishlist(driver);		
				
	}
	@Test()
	public void categorywishlist () throws InterruptedException 
	{
		wf.catwishlist();
		
	}
	
	@Test()
	public void searchwishlist() 
	{
		wf.searchwishlist();
	}
	@Test()
	public void bannerhwishlist() 
	{
		wf.bannerwishlist();
	}
	@Test()
	public void homehwishlist() 
	{
		wf.homewishlist();
	}
	@Test()
	public void dealswishlist() 
	{
		wf.dealswishlist();
	}
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}


}

package com.Equarz.Testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Addtocart;
import com.Pageobjects.Login_Functionality;

import com.Utils.Utils;

import com.base.testbase2;

	public class Addtocarttest extends testbase2 {
		Addtocart  At;
		public Addtocarttest()
		{
			super();
		}
		@BeforeMethod
		public void initialize()
		{
			
			Setup();
			
			At = new Addtocart (driver);
			
		}
	
		@Test
		public void verifyurl() throws InterruptedException
		{
			At.validateProduct();
			String url = driver.getCurrentUrl();
			Assert.assertEquals("http://e-quarz.com/product/panasonic-20l-solo-microwave-oven-nn-st26jmfdg-silver-51-auto-menus-C81NSM", url);
		}
		@AfterMethod
		public void teardown()
		{
			//driver.close();
		}


}

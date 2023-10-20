package com.Equarz.Testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Pageobjects.addresspage;
import com.base.Testbase;


import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import com.Pageobjects.Login_Functionality;

import com.Utils.Utils;
import com.base.Testbase;

public class addresstest extends Testbase {
	int testid;
	addresspage ap;
	Login_Functionality lg;
	private final String sheetname="address";
	
	
	public addresstest()
	{
		super();
	}
	@BeforeClass
	public void login() throws Exception
	{
		Setup();
		lg=new Login_Functionality(driver);
		lg.logindata();
		
	}
	@DataProvider
	public String[][] addressData() throws IOException
	{
		return Utils.readdata(sheetname);
	}
	
	@BeforeMethod
	public void initialize() 
	{
		ap=new addresspage (driver);		
				
	}
	@Test(priority=1,dataProvider = "addressData",dataProviderClass =addresstest.class )
	public void addaddress(String name,String phone,String city,String zipcode) throws InterruptedException 
	{
		testid=1;
		ap.addaddress(name,phone,city,zipcode);
		
	}
	@Test(priority=2)
	public void editaddress()
	{
		ap.editaddress();
	}
	@Test(priority=3)
	public void deleteaddress() throws Throwable
	{
		ap.deleteaddress();
	}
	

}

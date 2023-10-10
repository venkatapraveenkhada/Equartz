package com.Equarz.Testcases;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Pageobjects.searchproduct;
import com.base.testbase1;



public class searchtest extends testbase1{
	
	searchproduct sp;
	Login_Functionality lg;
	
	public searchtest() 
	{           
		super();
	}
	@BeforeMethod
	public void initialize() throws Throwable 
	{
		Setup();
		lg=new Login_Functionality(driver);
		lg.logindata(props.getProperty("username"),props.getProperty("password"));
		sp=new searchproduct(driver);
	}
	@Test
	public void search() 
	{
		sp.searchproduct();
	}

}




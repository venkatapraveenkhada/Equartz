package com.Equarz.Testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.Pageobjects.addresspage;
import com.base.Testbase;



public class addresstest extends Testbase{
	
	addresspage ap;
	Login_Functionality lg;
	
	public addresstest() {
		super();
	}
	@BeforeClass
	public void login() throws Throwable 
	{
		Setup();
  	  lg=new Login_Functionality(driver);
  	  lg.logindata(props.getProperty("username"),props.getProperty("password"));
  	  ap=new addresspage(driver);
	}
	@Test(dataProvider = "setdata", dataProviderClass = Utilsfile.class , description = "New address added successfuly")
	public void AddressNew(String conname,String mobile,String cityy,String zzipcode,String Addresses) 
	{
		ap.newaddress(conname,mobile,cityy,zzipcode,Addresses);
	}
	@Test
	public void Deleteaddress() 
	{
		ap.deleteaddress();
	}
    @Test 
    public void EditAddress()
    {
    	ap.editaddress();
    }
}

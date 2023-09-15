package com.Equarz.Testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Pageobjects.signup_functionality;
import com.Utils.Utils;
import com.base.testbase1;

public class signuptest extends testbase1 {
	signup_functionality sf;
	public signuptest()
	{
		super();
	}
	@BeforeMethod
	public void initialize()
	{
		Setup();
		sf=new signup_functionality(driver);
		
		
	}
	@Test(dataProvider = "setdata",dataProviderClass = Utils.class)
	public void verifyurl(String firstname,String lastname,String Email,String phone,String password,String cpassword) throws InterruptedException
	{
		sf.validateSignup(firstname,lastname,Email,phone,password,cpassword);
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/customer/auth/login", url);
	}
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}
	
}
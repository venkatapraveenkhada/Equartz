package com.Equarz.Testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.base.Testbase;

public class LoginTest extends Testbase {

Login_Functionality If;

public LoginTest() {
	super();
	
}

@BeforeMethod
 public void Intialization () {
	Setup();
	
	 If = new Login_Functionality(driver);
	
	
	
}

@Test

  public void VerifyLogin() throws Throwable {
  If.logindata();
}
@AfterMethod
public void teardown() {
	
}
  
  
  
  
  






}


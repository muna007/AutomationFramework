package com.ip.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ip.qa.bases.TestBase;
import com.ip.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		LoginPage loginpage = new LoginPage();
		
	}
	@Test
	public void test() {
		String title = LoginPage.validLoginPageId();
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}


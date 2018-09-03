package com.tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.LoginPage;
import com.qa.pages.Page;



public class LoginTest{
	
	public WebDriver driver;
	public Page page;
	public LoginPage lp;

	@BeforeMethod
	public void setUp() {
		page = new Page();
		driver = page.init();
		lp = new LoginPage(driver);
	}

	@Test
	public void loginTestCase(){
		lp.login("naveenk", "test@123");
	}
	
	@Test
	public void verifyloginPageTitle(){
		Assert.assertEquals(lp.getloginPageTitle(), "Free CRM software in the cloud "
				+ "powers sales and customer service");
	}
	
	@AfterMethod
	public void tearDown(){
		lp.tearDown();
	}

}

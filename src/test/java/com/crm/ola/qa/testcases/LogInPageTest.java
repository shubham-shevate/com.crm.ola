package com.crm.ola.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.ola.qa.base.TestBase;
import com.crm.ola.qa.pages.HomePage;
import com.crm.ola.qa.pages.LoginPage;



public class LogInPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	

	public LogInPageTest() throws Exception 
	{
		super();
		
	}
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		loginpage = new LoginPage();
	}
	@Test(priority = 1)
	public void logInpageTitleTest()
	{
		String title = loginpage.validateLoinPageTitle();
		Assert.assertEquals(title,"CRMPRO  - CRM software for customer relationship management, sales, and support.");
	}
	@Test (priority = 2)
	public void verifyCRMlogoTest()
	{
		boolean Logo_is_displayed = loginpage.verifyCRMlogo();
		Assert.assertTrue(Logo_is_displayed);
		
	}
	@Test (priority = 3)
	public void HomePageLogIn() throws IOException
	{
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
@AfterMethod 
public void teardown()
	{
	
	driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

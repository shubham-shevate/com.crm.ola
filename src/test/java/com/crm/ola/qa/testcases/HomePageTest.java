package com.crm.ola.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.ola.qa.base.TestBase;
import com.crm.ola.qa.pages.ContactsPage;
import com.crm.ola.qa.pages.HomePage;
import com.crm.ola.qa.pages.LoginPage;
import com.crm.ola.qa.util.TestUtil;





public class HomePageTest extends TestBase {
	TestUtil testutil;
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	public HomePageTest() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		testutil = new TestUtil();
		loginpage = new LoginPage();
		homepage =	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactspage = new ContactsPage();
	}


	@Test(priority = 1)
	public void verifyHomepageTitleTest()
	{
	Assert.assertEquals(homepage.verifyhomepageTitle(), "CRMPRO","Title dose not match");	
	}
	
	
	@Test (priority = 2)
	public void userverificationTest()
	
	{
		testutil.switchToFrame("mainpanel");
		Assert.assertTrue(homepage.userverification(), "User Didn't Displayed");
	}
	
	@Test(priority = 3)
	public void ClickOnContactsTest() throws IOException
	{	
		testutil.switchToFrame("mainpanel");
		contactspage=homepage.clickOnContacts();
		
	}
	
	
	@AfterMethod 
	public void teardown()
		{
		
		driver.quit();
		}

}

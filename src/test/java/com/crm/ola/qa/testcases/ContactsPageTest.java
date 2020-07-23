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



public class ContactsPageTest extends TestBase
{
	TestUtil testutil;
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	
	
	public ContactsPageTest() throws IOException {
		super();
		
	}

	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		testutil = new TestUtil();
		contactspage = new ContactsPage();
		loginpage = new LoginPage();
		homepage =	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		testutil.switchToFrame("mainpanel");
		contactspage = homepage.clickOnContacts();
		
	}
	@Test(priority = 1)
	public void verifycontactsPagetest()
	{
		Assert.assertTrue(contactspage.contactsPageDisplayed(),"contact page is not displayed");
	}
	@Test(priority = 2)
	public void verifycheckbox()
	{
		
		contactspage.selectCheckBox("8888888888 ");
	}
	
	@AfterMethod 
	public void teardown()
		{
		
		driver.quit();
		}











}



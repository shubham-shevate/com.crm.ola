package com.crm.ola.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.ola.qa.base.TestBase;

public class HomePage extends TestBase {
	
	 
	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "/html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")
WebElement usernameLable;


@FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[4]/a")
WebElement clickOnContactLink;

@FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[5]/a")
WebElement clickOndealsLink;

@FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[6]/a")
WebElement clickonTaskLink;
	
	public String verifyhomepageTitle()
		{
		return driver.getTitle();
		
		}
	
	public Boolean  userverification()
	{
		return usernameLable.isDisplayed();
	}
	
	
	
	public ContactsPage clickOnContacts() throws IOException
	{	
		
		clickOnContactLink.click();
		return new ContactsPage();
	
	}

	public DealsPage clickOnDeals() throws IOException
	{
		clickOndealsLink.click();
		return new DealsPage();
	
	}


	public TaskPage clickonTask() throws IOException
	{
		clickonTaskLink.click();
		return new TaskPage();
	
	}










}

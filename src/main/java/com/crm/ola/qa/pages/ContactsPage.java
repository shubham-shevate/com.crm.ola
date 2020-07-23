package com.crm.ola.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.ola.qa.base.TestBase;

public class ContactsPage extends TestBase {

	public ContactsPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"vContactsForm\"]/table/tbody/tr[1]/td/table/tbody/tr/td[1]")
	WebElement VeryfyContactsPage;
	
	@FindBy(xpath = "//*[@id=\"vContactsForm\"]/table/tbody/tr[3]/td[1]/input")
	WebElement clickOncheckBox;
	
	public Boolean contactsPageDisplayed()
	{
	return	VeryfyContactsPage.isDisplayed();
	}
	
	public void selectCheckBox(String name)
	{
		driver.findElement(By.xpath("//a[contains(text(),'//a[contains(text(),'"+name+"')]//parent::td//preceding::td[1] ')]//parent::td//preceding::td[1]")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

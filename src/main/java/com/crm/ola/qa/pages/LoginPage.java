package com.crm.ola.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.ola.qa.base.TestBase;

public class LoginPage extends TestBase 
{
	
	@FindBy(name="username")
	WebElement username;
	

	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-small']")
	WebElement LoginButton;
	
	@FindBy(xpath="//*[@id=\"navbar-collapse\"]/ul/li[2]/a")
	WebElement SignUpButton;
	

	@FindBy(xpath="/html/body/div[2]/div/div[1]/a/img")
	WebElement Logo;
	
	public LoginPage() throws IOException 
	{
	PageFactory.initElements(driver, this);	
	}
	
	public String validateLoinPageTitle()
	{
		return driver.getTitle();
	}
	public boolean verifyCRMlogo()
	{
		return Logo.isDisplayed();
		
	}
	public HomePage login(String SetUserName , String SetPassword ) throws IOException
	{
		username.sendKeys(SetUserName);
		password.sendKeys(SetPassword);
		LoginButton.click();
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

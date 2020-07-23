package com.crm.ola.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.ola.qa.util.TestUtil;

public class TestBase
{
	public static WebDriver driver;
	public static Properties prop;
	public TestBase() throws IOException 
	{
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\shubh\\eclipse-workspace\\com.crm.ola\\src\\main\\java\\com\\crm\\ola\\qa\\config\\cofig.properties");
		prop.load(file);
	}
		public  void initialization()
		{
		String BrowserName =prop.getProperty("browser");
		
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\shubh\\eclipse-workspace\\com.crm.ola\\Drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (BrowserName.equalsIgnoreCase("firefox"))
		{
			BrowserName.equalsIgnoreCase("Firefox");
			System.setProperty("webdriver.firefox.marionette", "C:\\Users\\shubh\\eclipse-workspace\\com.crm.ola\\Drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Please specify browser");
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_time, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_wait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		}
	
	
}

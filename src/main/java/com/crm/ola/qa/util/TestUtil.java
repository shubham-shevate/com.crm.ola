package com.crm.ola.qa.util;

import java.io.IOException;

import com.crm.ola.qa.base.TestBase;

public class TestUtil extends TestBase
{
public TestUtil() throws IOException {
		super();
		
	}

public static long Page_load_time =40;
public static long Implicit_wait = 40;

public void switchToFrame(String NameOfTheFrame)
	{
	
	driver.switchTo().frame(NameOfTheFrame);
	}

}

package com.tariffs.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.test.factory.SeleniumHelper;
import com.unitedinternet.portal.selenium.utils.logging.LoggingDefaultSelenium;

public class TestBaseTariffs {
	
	protected LoggingDefaultSelenium selenium;
	protected String Path = System.getProperty("user.dir");
	protected String screenPath = (Path + "\\log\\screenshots\\");
	protected static int screenCounter = 1;
	protected static final String browser = null;

	@Parameters({"browser"})
	@BeforeMethod
	public void setUp(@Optional String browser) throws Exception {
		if (browser == null) browser = "*googlechrome";
		selenium = (LoggingDefaultSelenium) SeleniumHelper.getSelenium(this.getClass().getSimpleName(),
				"localhost", 4444, browser, "http://80.75.132.248/ru");				
	}


	@AfterMethod
	public void tearDown() throws Exception {
		SeleniumHelper.dismissSelenium(this.getClass().getSimpleName());
	}


}

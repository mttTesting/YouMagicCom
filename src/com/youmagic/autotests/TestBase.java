package com.youmagic.autotests;

import org.testng.annotations.*;
import com.unitedinternet.portal.selenium.utils.logging.*;

public class TestBase {
	
	//private BufferedWriter loggingWriter;
	  
		protected LoggingDefaultSelenium selenium;

		protected String Path = System.getProperty("user.dir");
		 protected String screenPath = (Path + "\\log\\screenshots\\");
		 protected static int screenCounter = 1;
		 protected static final String browser = null;
		 
		@Parameters({"browser"})
		@BeforeClass
		public void setUp(@Optional String browser) throws Exception {
			if (browser == null) browser = "*firefox";
			selenium = (LoggingDefaultSelenium) SeleniumHelperEx.getSelenium(this.getClass().getSimpleName(),
					"localhost", 4444, browser, "http://80.75.132.248/");
					
		}


		@AfterClass
		public void tearDown() throws Exception {
			SeleniumHelperEx.dismissSelenium(this.getClass().getSimpleName());
		}
}

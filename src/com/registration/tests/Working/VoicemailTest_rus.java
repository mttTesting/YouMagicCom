package com.registration.tests.Working;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBase;

public class VoicemailTest_rus extends TestBase{
	 @Test
	 public void voicemailTest_eng() throws Exception {
		 selenium.open("http://80.75.132.248/ru/component/portabillinguser/login?return");
		    selenium.waitForPageToLoad("30000");
		    selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.type("id=username", "74997098949");
			selenium.type("id=passwd", "Gtnhjczy14");
			selenium.click("id=login-button");
			selenium.waitForPageToLoad("30000");
			selenium.click("link=Voice To Email");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			AssertJUnit.assertTrue(selenium.isElementPresent("css=span.um_t_h_text"));
			AssertJUnit.assertTrue(selenium.isElementPresent("//table[@id='allmessages']/tbody/tr/td[3]/span"));
			AssertJUnit.assertTrue(selenium.isElementPresent("css=#greetingsmessages > tbody > tr > td.um_t_header > span.um_t_h_text"));
	 }
}

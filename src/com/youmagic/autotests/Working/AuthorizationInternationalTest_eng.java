package com.youmagic.autotests.Working;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.youmagic.autotests.TestBase;

public class AuthorizationInternationalTest_eng  extends TestBase{
	 @Test
	 public void authorizationCityNumberTest_eng() throws Exception {
		 selenium.open("http://80.75.132.248/en/component/portabillinguser/login?return");
		    selenium.waitForPageToLoad("30000");
		    selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.type("id=username", "74997098949");
			selenium.type("id=passwd", "Gtnhjczy14");
			selenium.click("id=login-button");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			AssertJUnit.assertTrue(selenium.isTextPresent("Dear subscriber"));
			AssertJUnit.assertTrue(selenium.isElementPresent("css=img.visa"));
			AssertJUnit.assertTrue(selenium.isElementPresent("css=div.balance-icon"));
	 }
}
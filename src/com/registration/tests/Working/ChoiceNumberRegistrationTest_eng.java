package com.registration.tests.Working;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBase;

public class ChoiceNumberRegistrationTest_eng extends TestBase{
	 @Test
	 public void choiceNumberRegistrationTest_eng() throws Exception {
		 selenium.open("http://80.75.132.248/");
		 selenium.waitForPageToLoad("30000");
		 selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
		 
		 selenium.type("id=similar", "7543");
			selenium.click("css=input.finds_btn.validate");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			AssertJUnit.assertTrue(selenium.isTextPresent("7-54-3"));
			AssertJUnit.assertTrue(selenium.isTextPresent("75-43"));
	 }
}

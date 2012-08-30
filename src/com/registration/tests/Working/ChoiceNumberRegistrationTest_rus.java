package com.registration.tests.Working;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseRegistration;

public class ChoiceNumberRegistrationTest_rus extends TestBaseRegistration{
	 @Test
	 public void choiceNumberRegistrationTest_rus() throws Exception {
		 selenium.open("http://80.75.132.248/");
		 selenium.click("//div[@id='jflanguageselection']/ul/li/a/span");
		 selenium.waitForPageToLoad("30000");
		 
		 selenium.type("id=similar", "7543");
			selenium.click("css=input.finds_btn.validate");
			selenium.waitForPageToLoad("30000");
			AssertJUnit.assertTrue(selenium.isTextPresent("7-54-3"));
			AssertJUnit.assertTrue(selenium.isTextPresent("75-43"));
	 }
}

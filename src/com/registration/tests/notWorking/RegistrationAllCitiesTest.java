package com.registration.tests.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseRegistration;

public class RegistrationAllCitiesTest extends TestBaseRegistration{
	@Test
	public void registrationAllCitiesTest() throws Exception {
		 selenium.open("http://80.75.132.248/");
		 selenium.waitForPageToLoad("30000");
		 
		 //if (browser == "*firefox")
		 //selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
		 
			 selenium.open("http://80.75.132.248/ru/registration");
			selenium.waitForPageToLoad("30000");
			selenium.click("xpath=(//a[contains(@href, '/')])[34]");
			Thread.sleep(5000);
			//selenium.click("css=span.bHeader_Text > a");//переход на вкладку "Городской номер"
			AssertJUnit.assertTrue(selenium.isTextPresent("(499)"));
			Thread.sleep(5000);

			selenium.click("id=selectareacode");//выбор города из выпадающего списка
			selenium.click("//div[@id='area_code_sel']/ul/li[2]");
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(343)"));
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li[3]");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[5]/span[2]/label");
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(4012)"));
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li[4]");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[5]/span[2]/label");
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(843)"));
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li[5]");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[5]/span[2]/label");
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(831)"));
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li[6]");
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(863)"));
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li[7]");
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(846)"));
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li[8]");
			selenium.click("css=label");
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(812)"));
			selenium.click("id=selectcountry");
			selenium.click("//td[3]/div/div/div/ul/li[2]");
			selenium.click("id=selectareacode");
			selenium.click("//div[2]/div/ul/li");
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(20)"));
			selenium.click("id=selectcountry");
			selenium.click("css=li.IL.over");
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li");
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(77)"));
			selenium.click("id=selectcountry");
			selenium.click("css=li.LV.over");
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li");
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(6)"));
			selenium.click("id=selectcountry");
			selenium.click("css=li.LT.over");
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li");
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(5)"));
			selenium.click("id=selectareacode");
			selenium.click("css=li.3.over");
			selenium.waitForPageToLoad("30000");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[5]/span[2]/label");
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(3)"));
			selenium.click("id=selectareacode");
			selenium.click("css=li.46.over");
			selenium.waitForPageToLoad("30000");
			selenium.click("css=label");
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(46)"));
			selenium.click("id=selectareacode");
			selenium.click("css=li.45.over");
			selenium.waitForPageToLoad("30000");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[5]/span[2]/label");
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(45)"));
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li[5]");
			selenium.waitForPageToLoad("30000");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[5]/span[2]/label");
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(41)"));
			selenium.click("id=selectcountry");
			selenium.click("css=li.FI.over");
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li");
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(9)"));
			selenium.click("id=selectcountry");
			selenium.click("//div[@id='country_sel']/ul/li[7]");
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li");
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("+372"));
}}

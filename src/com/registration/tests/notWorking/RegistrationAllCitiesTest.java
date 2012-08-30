package com.registration.tests.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseRegistration;

public class RegistrationAllCitiesTest extends TestBaseRegistration{
	@Test
	public void registrationAllCitiesTest() throws Exception {
		 selenium.open("http://80.75.132.248/");
		 selenium.waitForPageToLoad("30000");
		 selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("id=ja-container");
		 selenium.click("css=#menu3 > span.menu-title");//кнопка "–егистраци€"
			selenium.waitForPageToLoad("30000");
			selenium.click("css=span.bHeader_Text > a");//переход на вкладку "√ородской номер"
			AssertJUnit.assertTrue(selenium.isTextPresent("(499)"));
			selenium.click("id=selectareacode");//выбор города из выпадающего списка
			selenium.click("//div[@id='area_code_sel']/ul/li[2]");
			AssertJUnit.assertTrue(selenium.isTextPresent("(343)"));
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li[3]");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[5]/span[2]/label");
			AssertJUnit.assertTrue(selenium.isTextPresent("(4012)"));
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li[4]");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[5]/span[2]/label");
			AssertJUnit.assertTrue(selenium.isTextPresent("(843)"));
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li[5]");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[5]/span[2]/label");
			AssertJUnit.assertTrue(selenium.isTextPresent("(831)"));
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li[6]");
			AssertJUnit.assertTrue(selenium.isTextPresent("(863)"));
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li[7]");
			AssertJUnit.assertTrue(selenium.isTextPresent("(846)"));
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li[8]");
			selenium.click("css=label");
			AssertJUnit.assertTrue(selenium.isTextPresent("(812)"));
			selenium.click("id=selectcountry");
			selenium.click("//div[@id='country_sel']/ul/li[2]");
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li");
			AssertJUnit.assertTrue(selenium.isTextPresent("676"));
			selenium.click("id=selectcountry");//выбор страны из выпадающего списка
			selenium.click("//div[@id='country_sel']/ul/li[3]");
			AssertJUnit.assertTrue(selenium.isTextPresent("(9)"));
			selenium.click("id=selectareacode");
			selenium.click("id=selectcountry");
			selenium.click("//div[@id='country_sel']/ul/li[4]");
			AssertJUnit.assertTrue(selenium.isTextPresent("(20)"));
			selenium.click("id=selectcountry");
			selenium.click("//div[@id='country_sel']/ul/li[5]");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[5]/span[2]/label");
			AssertJUnit.assertTrue(selenium.isTextPresent("(77)"));
			selenium.click("id=selectcountry");
			selenium.click("//div[@id='country_sel']/ul/li[6]");
			selenium.click("css=label");
			selenium.click("id=number37166104874");
			AssertJUnit.assertTrue(selenium.isTextPresent("(6)"));
			selenium.click("id=selectcountry");
			selenium.click("//div[@id='country_sel']/ul/li[7]");
			AssertJUnit.assertTrue(selenium.isTextPresent("(3)"));
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li[2]");
			AssertJUnit.assertTrue(selenium.isTextPresent("(46)"));
			selenium.click("id=selectareacode");
			selenium.click("css=//div[@id='area_code_sel']/ul/li[3]");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[5]/span[2]/label");
			AssertJUnit.assertTrue(selenium.isTextPresent("(45)"));
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li[4]");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[5]/span[2]/label");
			AssertJUnit.assertTrue(selenium.isTextPresent("+370 (41)"));
			selenium.click("id=selectareacode");
			selenium.click("//div[@id='area_code_sel']/ul/li[5]");
			AssertJUnit.assertTrue(selenium.isTextPresent("(5)"));
}}

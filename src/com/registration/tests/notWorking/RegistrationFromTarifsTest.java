package com.registration.tests.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBase;

public class RegistrationFromTarifsTest extends TestBase{
	 @Test
	 public void registrationFromTarifsTest() throws Exception {
		 selenium.open("http://80.75.132.248/");
		 selenium.waitForPageToLoad("30000");
			selenium.click("css=#menu2 > span.menu-title");//������ "������"
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("id=selectcountry");//������ �������� ����������� ���� ������ ������
			selenium.click("//div[2]/div/ul/li[2]");//���� �� ���������� ����
			selenium.click("id=selectarea-code-rate");//������ �������� ����������� ���� ������ ������
			selenium.click("//form/div/div/ul/li[2]");//���� �� ���������� ����
			selenium.click("css=#rate-connect > a");//������ "������������"
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("css=label");
			AssertJUnit.assertTrue(selenium.isTextPresent("(499)"));
			selenium.click("css=#menu2 > span.menu-title");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[2]/div/ul/li[2]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//div[@id='area_code_sel']/ul/li[3]");
			selenium.click("css=#rate-connect > a");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[2]/span[2]/label");
			AssertJUnit.assertTrue(selenium.isTextPresent("(343)"));
			selenium.click("css=#menu2 > span.menu-title");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("//input");
			selenium.click("//div[@id='country_sel']/ul/li[2]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//div[@id='area_code_sel']/ul/li[4]");
			selenium.click("css=#rate-connect > a");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[10]/span[2]/label");
			AssertJUnit.assertTrue(selenium.isTextPresent("(843)"));
			selenium.click("css=#menu2 > span.menu-title");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[@id='country_sel']/ul/li[2]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//div[@id='area_code_sel']/ul/li[5]");
			selenium.click("css=#rate-connect > a");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[10]/span[2]/label");
			AssertJUnit.assertTrue(selenium.isTextPresent("(4012)"));
			selenium.click("css=#menu2 > span.menu-title");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[@id='country_sel']/ul/li[2]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//div[@id='area_code_sel']/ul/li[6]");
			selenium.click("css=#rate-connect > a");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[6]/span[2]/label");
			AssertJUnit.assertTrue(selenium.isTextPresent("(831)"));
			selenium.click("css=#menu2 > span.menu-title");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[@id='country_sel']/ul/li[2]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//div[@id='area_code_sel']/ul/li[7]");
			selenium.click("css=#rate-connect > a");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[6]/span[2]/label");
			selenium.click("css=#menu2 > span.menu-title");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[@id='country_sel']/ul/li[2]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//div[@id='area_code_sel']/ul/li[8]");
			selenium.click("css=#rate-connect > a");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[6]/span[2]/label");
			AssertJUnit.assertTrue(selenium.isTextPresent("(812)"));
			selenium.click("css=#menu2 > span.menu-title");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[@id='country_sel']/ul/li[3]");
			selenium.click("link=������������");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[2]/span[2]/label");
			AssertJUnit.assertTrue(selenium.isTextPresent("(20)"));
			selenium.click("css=#menu2 > span.menu-title");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[@id='country_sel']/ul/li[4]");
			selenium.click("css=#rate-connect > a");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[2]/span[2]/label");
			AssertJUnit.assertTrue(selenium.isTextPresent("(77)"));
			selenium.click("css=#menu2 > span.menu-title");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("id=selectcountry-rate");
			selenium.selectWindow("null");
			selenium.click("css=#radioControlSkip > a.radiocontrol");
			selenium.click("//div[@id='country_sel']/ul/li[5]");
			selenium.click("css=#rate-connect > a");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[10]/span[2]/label");
			AssertJUnit.assertTrue(selenium.isTextPresent("(6)"));
			selenium.click("css=#menu2 > span.menu-title");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("css=#selectcountry-rate");
			selenium.click("//div[@id='country_sel']/ul/li[6]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//div[@id='area_code_sel']/ul/li[2]");
			selenium.click("css=#rate-connect > a");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[6]/span[2]/label");
			AssertJUnit.assertTrue(selenium.isTextPresent("(5)"));
			selenium.click("css=#menu2 > span.menu-title");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[@id='country_sel']/ul/li[6]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//div[@id='area_code_sel']/ul/li[3]");
			selenium.click("css=#rate-connect > a");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[6]/span[2]");
			selenium.click("id=number37037220987");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[6]/span[2]/label");
			AssertJUnit.assertTrue(selenium.isTextPresent("(3)"));
			selenium.click("css=#menu2 > span.menu-title");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[@id='country_sel']/ul/li[6]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//div[@id='area_code_sel']/ul/li[4]");
			selenium.click("css=#rate-connect > a");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[6]/span[2]/label");
			AssertJUnit.assertTrue(selenium.isTextPresent("(46)"));
			selenium.click("css=#menu2 > span.menu-title");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[@id='country_sel']/ul/li[6]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//div[@id='area_code_sel']/ul/li[5]");
			selenium.click("link=������������");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[2]/span[2]/label");
			AssertJUnit.assertTrue(selenium.isTextPresent("(45)"));
			selenium.click("css=#menu2 > span.menu-title");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("//input");
			selenium.click("//div[@id='country_sel']/ul/li[6]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//div[@id='area_code_sel']/ul/li[6]");
			selenium.click("css=#rate-connect > a");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[2]/span[2]");
			AssertJUnit.assertTrue(selenium.isTextPresent("(41)"));
			selenium.click("css=#menu2 > span.menu-title");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[@id='country_sel']/ul/li[7]");
			selenium.click("css=#rate-connect > a");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("//div[@id='bPhones']/table/tbody/tr/td/div[6]/span[2]/label");
			AssertJUnit.assertTrue(selenium.isTextPresent("(9)"));
			selenium.click("css=#menu2 > span.menu-title");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[@id='country_sel']/ul/li[8]");
			selenium.click("css=#rate-connect > a");
			selenium.waitForPageToLoad("30000");
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			AssertJUnit.assertTrue(selenium.isTextPresent("+372"));
	 }
}


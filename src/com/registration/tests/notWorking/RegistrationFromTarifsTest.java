package com.registration.tests.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseRegistration;

public class RegistrationFromTarifsTest extends TestBaseRegistration{
	 @Test
	 public void registrationFromTarifsTest() throws Exception {
		 	selenium.open("http://80.75.132.248/ru/tarify-gorodov");
		 	selenium.waitForPageToLoad("30000");
			Thread.sleep(5000);
			selenium.click("id=selectcountry-rate");//кнопка открытия выпадающего меню выбора страны
			selenium.click("//div[2]/div/ul/li[2]");//клик на выпадающем меню
			selenium.click("id=selectarea-code-rate");//кнопка открытия выпадающего меню выбора города
			selenium.click("//form/div/div/ul/li[2]");//клик на выпадающем меню
			Thread.sleep(5000);
			selenium.click("//td[3]/div/a");//ссылка "Подключиться"
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(499)"));
			
			
			selenium.open("http://80.75.132.248/ru/tarify-gorodov");
			selenium.waitForPageToLoad("30000");
			Thread.sleep(5000);
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[2]/div/ul/li[2]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//form/div/div/ul/li[3]");
			Thread.sleep(5000);
			selenium.click("//td[3]/div/a");//ссылка "Подключиться"
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(343)"));
			
			
			selenium.open("http://80.75.132.248/ru/tarify-gorodov");
			selenium.waitForPageToLoad("30000");
			Thread.sleep(5000);
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[2]/div/ul/li[2]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//form/div/div/ul/li[4]");
			Thread.sleep(5000);
			selenium.click("//td[3]/div/a");//ссылка "Подключиться"
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(843)"));
			
			selenium.open("http://80.75.132.248/ru/tarify-gorodov");
			selenium.waitForPageToLoad("30000");
			Thread.sleep(5000);
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[2]/div/ul/li[2]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//form/div/div/ul/li[5]");
			Thread.sleep(5000);
			selenium.click("//td[3]/div/a");//ссылка "Подключиться"
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(4012)"));
			
			selenium.open("http://80.75.132.248/ru/tarify-gorodov");
			selenium.waitForPageToLoad("30000");
			Thread.sleep(5000);
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[2]/div/ul/li[2]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//form/div/div/ul/li[6]");
			Thread.sleep(5000);
			selenium.click("//td[3]/div/a");//ссылка "Подключиться"
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(831)"));
			
			
			selenium.open("http://80.75.132.248/ru/tarify-gorodov");
			selenium.waitForPageToLoad("30000");
			Thread.sleep(5000);
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[2]/div/ul/li[2]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//form/div/div/ul/li[7]");
			Thread.sleep(5000);
			selenium.click("//td[3]/div/a");//ссылка "Подключиться"
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(863)"));
			
			
			selenium.open("http://80.75.132.248/ru/tarify-gorodov");
			selenium.waitForPageToLoad("30000");
			Thread.sleep(5000);
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[2]/div/ul/li[2]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//form/div/div/ul/li[8]");
			Thread.sleep(5000);
			selenium.click("//td[3]/div/a");//ссылка "Подключиться"
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(812)"));
			
			
			selenium.open("http://80.75.132.248/ru/tarify-gorodov");
			selenium.waitForPageToLoad("30000");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[2]/div/ul/li[3]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//form/div/div/ul/li[2]");
			Thread.sleep(5000);
			selenium.click("//td[3]/div/a");//ссылка "Подключиться"
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(20)"));
			
			
			selenium.open("http://80.75.132.248/ru/tarify-gorodov");
			selenium.waitForPageToLoad("30000");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[2]/div/ul/li[4]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//form/div/div/ul/li[2]");
			Thread.sleep(5000);
			selenium.click("//td[3]/div/a");//ссылка "Подключиться"
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(77)"));
			
			
			selenium.open("http://80.75.132.248/ru/tarify-gorodov");
			selenium.waitForPageToLoad("30000");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[2]/div/ul/li[5]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//form/div/div/ul/li[2]");
			Thread.sleep(5000);
			selenium.click("//td[3]/div/a");//ссылка "Подключиться"
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(6)"));
			
			
			selenium.open("http://80.75.132.248/ru/tarify-gorodov");
			selenium.waitForPageToLoad("30000");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[2]/div/ul/li[6]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//form/div/div/ul/li[2]");
			Thread.sleep(5000);
			selenium.click("//td[3]/div/a");//ссылка "Подключиться"
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(5)"));
			
			
			selenium.open("http://80.75.132.248/ru/tarify-gorodov");
			selenium.waitForPageToLoad("30000");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[2]/div/ul/li[6]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//form/div/div/ul/li[3]");
			Thread.sleep(5000);
			selenium.click("//td[3]/div/a");//ссылка "Подключиться"
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(3)"));
			
			
			selenium.open("http://80.75.132.248/ru/tarify-gorodov");
			selenium.waitForPageToLoad("30000");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[2]/div/ul/li[6]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//form/div/div/ul/li[4]");
			Thread.sleep(5000);
			selenium.click("//td[3]/div/a");//ссылка "Подключиться"
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(46)"));
			
			
			selenium.open("http://80.75.132.248/ru/tarify-gorodov");
			selenium.waitForPageToLoad("30000");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[2]/div/ul/li[6]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//form/div/div/ul/li[5]");
			Thread.sleep(5000);
			selenium.click("//td[3]/div/a");//ссылка "Подключиться"
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(45)"));
			
			
			selenium.open("http://80.75.132.248/ru/tarify-gorodov");
			selenium.waitForPageToLoad("30000");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[2]/div/ul/li[6]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//form/div/div/ul/li[6]");
			Thread.sleep(5000);
			selenium.click("//td[3]/div/a");//ссылка "Подключиться"
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(41)"));
			
			
			selenium.open("http://80.75.132.248/ru/tarify-gorodov");
			selenium.waitForPageToLoad("30000");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[2]/div/ul/li[7]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//form/div/div/ul/li[2]");
			Thread.sleep(5000);
			selenium.click("//td[3]/div/a");//ссылка "Подключиться"
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("(9)"));
			
			
			selenium.open("http://80.75.132.248/ru/tarify-gorodov");
			selenium.waitForPageToLoad("30000");
			selenium.click("id=selectcountry-rate");
			selenium.click("//div[2]/div/ul/li[8]");
			selenium.click("id=selectarea-code-rate");
			selenium.click("//form/div/div/ul/li[2]");
			Thread.sleep(5000);
			selenium.click("//td[3]/div/a");//ссылка "Подключиться"
			Thread.sleep(5000);
			AssertJUnit.assertTrue(selenium.isTextPresent("+372"));
	 }
}


package com.youmagic.autotests.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.youmagic.autotests.TestBase;

public class CallForwardingTest extends TestBase{
		 @Test
		public void callForwardingTest() throws Exception {
			    selenium.open("http://80.75.132.248/ru/component/portabillinguser/login?return");
			    selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			    selenium.waitForPageToLoad("30000");
				selenium.type("id=username", "74997098949");
				selenium.type("id=passwd", "Gtnhjczy14");
				selenium.click("id=login-button"); //кнопка "Вход"
				selenium.open("http://80.75.132.248/ru/refill?layout=billing");
				selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
				selenium.waitForPageToLoad("30000");
				selenium.click("link=Переадресация");//кнопка "Переадресация"
				selenium.waitForPageToLoad("30000");
				selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
				selenium.click("id=addFollowMeClicker");//кнопка "Добавить"
				selenium.type("id=redirect_number[0]", "8888888888888888");
				selenium.type("id=timeout[0]", "21");
				selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
				selenium.click("id=save_button");//кнопка "Сохранить"
				selenium.waitForPageToLoad("30000");
				selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
				
				AssertJUnit.assertTrue(selenium.isTextPresent("21"));
				AssertJUnit.assertTrue(selenium.isTextPresent("8888"));				
		 }
	}

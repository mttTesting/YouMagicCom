package com.registration.tests.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBase;

public class CallForwardingTest extends TestBase{
		 @Test
		public void callForwardingTest() throws Exception {
			 
			 // ����������
			    selenium.open("http://80.75.132.248/ru/component/portabillinguser/login?return");
			  //  selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			    selenium.waitForPageToLoad("30000");
				selenium.type("id=username", "74997098949");
				selenium.type("id=passwd", "Gtnhjczy14");
				selenium.click("id=login-button"); //������ "����"
				Thread.sleep(1000);
		
			// �������������
				selenium.open("http://80.75.132.248/ru/refill?layout=billing");
				//selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
				selenium.waitForPageToLoad("30000");
				AssertJUnit.assertEquals(selenium.getTitle(), "������ � �������");
				selenium.open("http://80.75.132.248/ru/forwarding");
				selenium.waitForPageToLoad("30000");
				AssertJUnit.assertEquals(selenium.getTitle(), "��������� �������������");
				//selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
				selenium.click("id=addFollowMeClicker");//������ "��������"
				selenium.type("id=redirect_number[0]", "8888888888888888");
				selenium.type("id=timeout[0]", "21");
				 //selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
				selenium.click("id=save_button");//������ "���������"
				selenium.waitForPageToLoad("30000");
				 //selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
				AssertJUnit.assertEquals(selenium.getTitle(), "��������� �������������");
				AssertJUnit.assertEquals(selenium.getValue("id=timeout[0]"), "21");
				AssertJUnit.assertEquals(selenium.getValue("id=redirect_number[0]"), "8888888888888888");		

		 }
	}

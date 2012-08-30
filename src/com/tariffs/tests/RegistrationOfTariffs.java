package com.tariffs.tests;
import org.testng.*; 
import org.testng.annotations.Test;

public class RegistrationOfTariffs extends TestBaseTariffs {
		
	@Test (dataProvider = "RegistrationOfTariffs", dataProviderClass = DataProviderTariffs.class)
		public void testUntitled(String countrycode, String towncode, String tname, String link, String pref, String countryname, String townname) throws Exception {
			selenium.logComment("�������� ����� RegistrationOfTariffs � �������� �������: ������ - "+countryname+" ����� - "+townname);

			//����. ������� �� ���. ������. ������ �� ������������.
			selenium.open("http://80.75.132.248");	
/*Screenshot*/if (browser == "*firefox")
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");

			selenium.click("css=li.parent.item24 > a > span"); //���� �� "������"

			for (int second = 0;; second++) {
				if (second >= 60) Assert.fail("timeout after click on '������'");
				try { if (selenium.isTextPresent("������ �� ������������")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			} 
/*Screenshot*/if (browser == "*firefox")
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");

			AssertJUnit.assertEquals(selenium.getTitle(), "������");
			selenium.click("//div[@id='ja-account-info']/div/div/div/a/div"); //���� �� "������ �� ������������"
			selenium.waitForPageToLoad("30000");
			
/*Screenshot*/if (browser == "*firefox")
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "screen.png", "");
			AssertJUnit.assertTrue(selenium.isTextPresent("������� > ������ > ������ �� ������������"));
			AssertJUnit.assertTrue(selenium.isTextPresent("������ ��� ��������� �������"));
		
			//����� ������ � ������
				//��������� ������� ��������
			AssertJUnit.assertEquals(selenium.getValue("id=selectcountry-rate"), "��� ������");
			AssertJUnit.assertEquals(selenium.getValue("id=selectarea-code-rate"), "��� ������");
				//�������� ������ � �����
			selenium.click("id=selectcountry-rate");
			selenium.click(countrycode); //����� ������
			selenium.click("id=selectarea-code-rate");
			selenium.click(towncode); //����� ������
			AssertJUnit.assertEquals(selenium.getValue("id=selectcountry-rate"), countryname);
			AssertJUnit.assertEquals(selenium.getValue("id=selectarea-code-rate"), townname);
		

			for (int second = 0;; second++) {
				if (second >= 60) Assert.fail("timeout after click on" + towncode);
				try { if (selenium.isElementPresent(link)) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}
/*Screenshot*/if (browser == "*firefox")
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");

			AssertJUnit.assertEquals(selenium.getText("css=td.rate"), tname);
			selenium.click(link); //"link=������������"
			selenium.waitForPageToLoad("30000");
			
			for (int second = 0;; second++) {
				if (second >= 60) Assert.fail("timeout after click on" +  link);
				try { if ("�����������".equals(selenium.getText("id=bHeader"))) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

/*Screenshot*/if (browser == "*firefox")
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			AssertJUnit.assertTrue(selenium.isTextPresent("������� > ����������� � ��������� �������"));
			AssertJUnit.assertTrue(selenium.isTextPresent(pref));
			AssertJUnit.assertEquals(selenium.getValue("id=selectcountry"), countryname);
			AssertJUnit.assertEquals(selenium.getValue("id=selectareacode"), townname);
			
		}
		
}


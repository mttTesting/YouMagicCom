package com.tariffs.tests;
import org.testng.*; 
import org.testng.annotations.Test;

public class RegistrationOfTariffs extends TestBaseTariffs {
		
	@Test (dataProvider = "RegistrationOfTariffs", dataProviderClass = DataProviderTariffs.class)
		public void testUntitled(String countrycode, String towncode, String tname, String link, String pref, String countryname, String townname) throws Exception {
			selenium.logComment("ТЕСТОВЫЙ НАБОР RegistrationOfTariffs С ВХОДНЫМИ ДАННЫМИ: СТРАНА - "+countryname+" ГОРОД - "+townname);

			//Вход. Переход на стр. тарифы. Тарифы на обслуживание.
			selenium.open("http://80.75.132.248");	
/*Screenshot*/if (browser == "*firefox")
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");

			selenium.click("css=li.parent.item24 > a > span"); //Клик по "Тарифы"

			for (int second = 0;; second++) {
				if (second >= 60) Assert.fail("timeout after click on 'Тарифы'");
				try { if (selenium.isTextPresent("Тарифы на обслуживание")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			} 
/*Screenshot*/if (browser == "*firefox")
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");

			AssertJUnit.assertEquals(selenium.getTitle(), "Тарифы");
			selenium.click("//div[@id='ja-account-info']/div/div/div/a/div"); //Клик по "Тарифы на обслуживание"
			selenium.waitForPageToLoad("30000");
			
/*Screenshot*/if (browser == "*firefox")
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "screen.png", "");
			AssertJUnit.assertTrue(selenium.isTextPresent("Главная > Тарифы > Тарифы на обслуживание"));
			AssertJUnit.assertTrue(selenium.isTextPresent("Тарифы для городских номеров"));
		
			//Выбор Страны и Города
				//Проверяем наличие фильтров
			AssertJUnit.assertEquals(selenium.getValue("id=selectcountry-rate"), "Все страны");
			AssertJUnit.assertEquals(selenium.getValue("id=selectarea-code-rate"), "Все города");
				//Выбираем страну и город
			selenium.click("id=selectcountry-rate");
			selenium.click(countrycode); //Выбор страны
			selenium.click("id=selectarea-code-rate");
			selenium.click(towncode); //Выбор города
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
			selenium.click(link); //"link=Подключиться"
			selenium.waitForPageToLoad("30000");
			
			for (int second = 0;; second++) {
				if (second >= 60) Assert.fail("timeout after click on" +  link);
				try { if ("Подключение".equals(selenium.getText("id=bHeader"))) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

/*Screenshot*/if (browser == "*firefox")
			selenium.captureEntirePageScreenshot(screenPath +(screenCounter++) + " " + "test.png", "");
			AssertJUnit.assertTrue(selenium.isTextPresent("Главная > Регистрация с городским номером"));
			AssertJUnit.assertTrue(selenium.isTextPresent(pref));
			AssertJUnit.assertEquals(selenium.getValue("id=selectcountry"), countryname);
			AssertJUnit.assertEquals(selenium.getValue("id=selectareacode"), townname);
			
		}
		
}


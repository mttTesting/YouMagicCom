package com.tariffs.tests;

import org.testng.annotations.DataProvider;
import com.test.factory.SeleniumHelper;

public class DataProviderTariffs extends SeleniumHelper {
	
	@DataProvider(name = "RegistrationOfTariffs"/*, parallel = true*/)
	
	  public static Object[][] createData() {
		//499 - Москва
		  return new Object[][] { { new String ("//div[2]/div/ul/li[2]"), ("//form/div/div/ul/li[2]"), ("Москва (499)"), ("link=Подключиться"), ("+7 (499)"), ("Россия"), ("499 - Москва") }, // первый массив данных

		  };	  
};

}
package com.tariffs.tests;

import org.testng.annotations.DataProvider;
import com.test.factory.SeleniumHelper;

public class DataProviderTariffs extends SeleniumHelper {
	
	@DataProvider(name = "RegistrationOfTariffs"/*, parallel = true*/)
	
	  public static Object[][] createData() {
		//499 - ������
		  return new Object[][] { { new String ("//div[2]/div/ul/li[2]"), ("//form/div/div/ul/li[2]"), ("������ (499)"), ("link=������������"), ("+7 (499)"), ("������"), ("499 - ������") }, // ������ ������ ������

		  };	  
};

}
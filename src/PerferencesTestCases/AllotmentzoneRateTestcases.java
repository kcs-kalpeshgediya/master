package PerferencesTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PerferencesObjects.AllotmentzoneRateObject;


public class AllotmentzoneRateTestcases {

	@Test
	public static void Rate(WebDriver webdriver) throws InterruptedException
	{
		AllotmentzoneRateObject atr=new AllotmentzoneRateObject(webdriver);
		Thread.sleep(3000);
		atr.Preferences().click();
		Thread.sleep(3000);
		atr.Alltotmentrate().click();
		Thread.sleep(3000);
		atr.New().click();
		Thread.sleep(3000);
		atr.Type().sendKeys("Visiter charge");
		Thread.sleep(3000);
		atr.Rate().clear();
		Thread.sleep(2000);
		atr.Rate().sendKeys("2000");
		Thread.sleep(3000);
		atr.Save().click();
		Thread.sleep(3000);
		atr.Popup().click();
		Thread.sleep(3000);
		atr.Search().sendKeys("Visiter charge");
		Thread.sleep(3000);
		atr.Edit().click();
		Thread.sleep(3000);
		atr.Type().clear();
		Thread.sleep(3000);
		atr.Type().sendKeys("Advertisement charge");
		Thread.sleep(3000);
		atr.Rate().clear();
		Thread.sleep(3000);
		atr.Rate().sendKeys("1000");
		Thread.sleep(3000);
		atr.Save().click();
		Thread.sleep(3000);
		atr.Popup().click();
		Thread.sleep(3000);
		atr.Search().sendKeys("1000");
		Thread.sleep(3000);
		atr.Delete().click();
		Thread.sleep(3000);
		atr.Delete1().click();
		Thread.sleep(3000);
		atr.Delete1().click();
		
	}
}

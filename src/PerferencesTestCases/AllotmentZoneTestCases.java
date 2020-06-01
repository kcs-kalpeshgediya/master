package PerferencesTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PerferencesObjects.AllotMentZoneObject;
import SmarTown.Base1;


public class AllotmentZoneTestCases extends Base1{

	@Test
	public static void Zone(WebDriver webdriver) throws InterruptedException
	{
		
		 
		AllotMentZoneObject alz=new AllotMentZoneObject(webdriver);
		Thread.sleep(2000);
		alz.Preferences().click();
		Thread.sleep(2000);
		alz.Allotmentzone().click();
		Thread.sleep(2000);
		alz.New().click();
		Thread.sleep(2000);
		alz.Zonename().sendKeys("Tower KZ");
		//Softassert.assertEquals("Tower K","Tower K");
		Thread.sleep(2000);
		alz.Save().click();
		Thread.sleep(2000);
		alz.Popup().click();
		Thread.sleep(2000);
		alz.Search().sendKeys("Tower KZ");
		Thread.sleep(2000);
		alz.Edit().click();
		Thread.sleep(2000);
		alz.Zonename().clear();
		Thread.sleep(2000);
		alz.Zonename().sendKeys("Tower YE");
		//Softassert.assertEquals("Tower Z","Tower K");
		Thread.sleep(2000);
		alz.Save().click();
		Thread.sleep(2000);
		alz.Popup().click();
		Thread.sleep(2000);
		alz.Search().sendKeys("Tower YE");
		Thread.sleep(2000);
		alz.Delete().click();
		Thread.sleep(2000);
		alz.Delete1().click();
		Thread.sleep(2000);
		alz.Delete1().click();
		
		
	}
}

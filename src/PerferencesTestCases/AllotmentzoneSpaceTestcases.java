package PerferencesTestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PerferencesObjects.AllotmentzoneSpace;
import SmarTown.Base1;


public class AllotmentzoneSpaceTestcases extends Base1  {
	
	@Test
	public static void Space(WebDriver webdriver) throws InterruptedException
	{
		
		AllotmentzoneSpace ats=new AllotmentzoneSpace(webdriver);
		Thread.sleep(3000);
		ats.Preferences().click();
		Thread.sleep(3000);
		ats.AlltomateSpace().click();
		Thread.sleep(3000);
		ats.New().click();
		Thread.sleep(3000);
		ats.Selectzonename().click();
		ats.Selectzonename().sendKeys(Keys.ARROW_DOWN);
		ats.Selectzonename().sendKeys(Keys.ARROW_DOWN);
		ats.Selectzonename().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		ats.Spacename().sendKeys("K-222");
		//Softassert.assertEquals("K-222","K-222");
		Thread.sleep(3000);
		ats.Save().click();
		Thread.sleep(3000);
		ats.Popup().click();
		Thread.sleep(3000);
		
		ats.Search().sendKeys("K-222");
		Thread.sleep(3000);
		ats.Edit().click();
		Thread.sleep(3000);
		ats.Selectzonename().click();
		ats.Selectzonename().sendKeys(Keys.ARROW_DOWN);
		ats.Selectzonename().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		ats.Spacename().clear();
		Thread.sleep(3000);
		ats.Spacename().sendKeys("X-111");
		//Softassert.assertEquals("X-111","K-222");
		Thread.sleep(3000);
		ats.Save().click();
		Thread.sleep(3000);
		ats.Popup().click();
		Thread.sleep(3000);
		ats.Search().sendKeys("X-111");
		Thread.sleep(3000);
		ats.Delete().click();
		Thread.sleep(3000);
		ats.Delete1().click();
		Thread.sleep(3000);
		ats.Delete1().click();
		
		//Softassert.assertAll();
	}

}

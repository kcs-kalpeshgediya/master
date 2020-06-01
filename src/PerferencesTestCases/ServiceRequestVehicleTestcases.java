package PerferencesTestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PerferencesObjects.ServiceRequestVehicleObject;


public class ServiceRequestVehicleTestcases  {
	@Test
	public static  void Vehicle(WebDriver webdriver) throws InterruptedException 
	{
		ServiceRequestVehicleObject srv=new ServiceRequestVehicleObject(webdriver);
		
		Thread.sleep(3000);
		srv.ServiceRequest().click();
		Thread.sleep(3000);
		
		srv.Vehicle1().click();
		Thread.sleep(2000);
		
		srv.New().click();
		Thread.sleep(2000);
		srv.MemberSearch().sendKeys("miss k");
		srv.MemberSearch().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		srv.VehicleNo().sendKeys("GJ-01-KA-2611");
		Thread.sleep(2000);
		
		srv.VehicleType().sendKeys(Keys.ARROW_DOWN);
		srv.VehicleType().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		srv.VehicleName().sendKeys("swift car");
		Thread.sleep(2000);
		
		srv.VehicleUser().sendKeys(Keys.ARROW_DOWN);
		srv.VehicleUser().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		srv.Allotmentrate().sendKeys(Keys.ARROW_DOWN);
		srv.Allotmentrate().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		srv.Save().click();
		Thread.sleep(2000);
		srv.Popup().click();
		Thread.sleep(2000);
		srv.Cacle().click();
		Thread.sleep(2000);
		
		srv.Reset().click();
		Thread.sleep(4000);
		
		srv.Search().sendKeys("miss k");
		Thread.sleep(4000);

		srv.Edit().click();
		Thread.sleep(4000);
		
		srv.VehicleNo().clear();
		srv.VehicleNo().sendKeys("GJ-20-AK-2222");
		Thread.sleep(2000);

		srv.VehicleType().sendKeys(Keys.ARROW_DOWN);
		srv.VehicleType().sendKeys(Keys.ARROW_DOWN);
		srv.VehicleType().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		srv.VehicleName().clear();
		Thread.sleep(2000);
		srv.VehicleName().sendKeys("XUV Car");
		Thread.sleep(2000);
		
		srv.Save().click();
		Thread.sleep(2000);
		srv.Popup().click();
		Thread.sleep(2000);
		srv.Cacle().click();
		Thread.sleep(2000);
		
		srv.Reset().click();
		Thread.sleep(4000);
		
		
		srv.Search().sendKeys("miss k");
		Thread.sleep(4000);

		srv.delete().click();
		Thread.sleep(2000);

		srv.delete1().click();
		Thread.sleep(2000);

		srv.delete2().click();
		
		}

}

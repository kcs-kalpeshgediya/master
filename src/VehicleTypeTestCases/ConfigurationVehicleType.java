package VehicleTypeTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ConfigurationVehicleType.AddRecordVehicleType;
import ConfigurationVehicleType.DeleteRecordVehicleType;
import ConfigurationVehicleType.EditRecordVehicleType;
import ConfigurationVehicleType.SearchRecordVehicleType;


public class ConfigurationVehicleType {
	
	@Test
	public static void VehicleType(WebDriver webdriver) throws InterruptedException {
		
		
        AddRecordVehicleType arv=new AddRecordVehicleType(webdriver);
        arv.Configuration().click();
        Thread.sleep(2000);
        arv.VehicleType().click();
        Thread.sleep(2000);
         arv.New().click();
        Thread.sleep(2000);
        arv.Vehicle(). sendKeys("ABCD WHEELER");
        Thread.sleep(2000);
        arv.Description().sendKeys("This is my personal Vehicle");
        Thread.sleep(2000);
        arv.save().click();
        Thread.sleep(2000);
        arv.popup().click();
        Thread.sleep(2000);
        
        SearchRecordVehicleType srv=new SearchRecordVehicleType(webdriver);
        Thread.sleep(2000);
        srv.Search().sendKeys("ABCD WHEELER");
        Thread.sleep(2000);
        
        
        EditRecordVehicleType Erv=new EditRecordVehicleType(webdriver);
        Thread.sleep(2000);
        Erv.Edit().click();
        Thread.sleep(2000);
        Erv.Vehicle().clear();
        Thread.sleep(2000);
        Erv.Vehicle().sendKeys("PQRS WHEELER");
        Thread.sleep(2000);
        Erv.Description().clear();
        Thread.sleep(2000);
        Erv.Description().sendKeys("This is my favroit Vehicle");
        Thread.sleep(2000);
        Erv.save().click();
        Thread.sleep(2000);
        Erv.popup().click();
        
        SearchRecordVehicleType srt=new SearchRecordVehicleType(webdriver);
        Thread.sleep(2000);
        srt.Search().sendKeys("PQRS WHEELER");
        Thread.sleep(2000);
        
        DeleteRecordVehicleType drv=new DeleteRecordVehicleType(webdriver);
        Thread.sleep(2000);
        drv.delete().click();
        Thread.sleep(2000);
        drv.deleted().click();
        Thread.sleep(4000);
        drv.Delete().click();
        
        
        //softAssert.assertAll();
       
}
	 
}

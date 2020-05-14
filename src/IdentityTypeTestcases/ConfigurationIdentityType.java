package IdentityTypeTestcases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ConfigurationIdentityType.EditRecordIdentityType;
import ConfigurationIdentityType.SearchIdentityType;

public class ConfigurationIdentityType {
	
	@Test
	public static void Identity(WebDriver webdriver) throws InterruptedException {
		
        SearchIdentityType si=new SearchIdentityType(webdriver);
        
        si.Configuration().click();
        Thread.sleep(2000);
        si.IdentityType().click();
        Thread.sleep(2000);
        si.Search().sendKeys("Dependent");
        Thread.sleep(4000);
        
        EditRecordIdentityType er=new EditRecordIdentityType(webdriver);
        er.Edit().click();
        Thread.sleep(2000);
        er.ResidentProofCheckBox().click();
        Thread.sleep(2000);
        er.save().click();
        Thread.sleep(2000);
        er.Popup().click();
        Thread.sleep(2000);
        
        SearchIdentityType sit=new SearchIdentityType(webdriver);
        sit.Search().sendKeys("Dependent");
        Thread.sleep(4000);
        
         //softAssert.assertAll();
         //driver.close();
}
}

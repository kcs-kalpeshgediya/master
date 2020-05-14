package IdentityRelationTestcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ConfigurationIdentityRelation.AddRecordIdentityRelation;
import ConfigurationIdentityRelation.DeleteRecordIdentityRelation;
import ConfigurationIdentityRelation.EditRecordIdentityRelation;
import ConfigurationIdentityRelation.SearchRecordIDentityRelation;


public class ConfigurationIdentityRelation  {

	@Test
	public static void IdentityRelation(WebDriver webdriver) throws InterruptedException {
		
        
        AddRecordIdentityRelation ari=new AddRecordIdentityRelation(webdriver);
        ari.Configuration().click();
        Thread.sleep(2000);
        ari.IdentityRelation().click();
        Thread.sleep(2000);
        ari.New().click();
        Thread.sleep(2000);
        ari.MemberRelation().sendKeys("DEFGHIJ");
        Thread.sleep(2000);
        ari.DisplayReord().sendKeys("50");
        Thread.sleep(2000);
        ari.IdentityType().click();
        Thread.sleep(2000);
        ari.IdentityType().sendKeys(Keys.ARROW_DOWN);
        ari.IdentityType().sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        ari.save().click();
        Thread.sleep(2000);
        ari.popup().click();
        
        SearchRecordIDentityRelation sri=new SearchRecordIDentityRelation(webdriver);
        Thread.sleep(2000);
         sri.Search().sendKeys("DEFGHIJ");
         
         EditRecordIdentityRelation eri=new EditRecordIdentityRelation(webdriver);
         Thread.sleep(2000);
         eri.Edit().click();
         Thread.sleep(2000);
         eri.MemberRelation().clear();
         Thread.sleep(2000);
         eri.MemberRelation().sendKeys("KLMNOP");
         Thread.sleep(2000);
         eri.DisplayReord().clear();
         eri.DisplayReord().sendKeys("10");
         Thread.sleep(2000);
         eri.IdentityType().click();
         Thread.sleep(2000);
         eri.IdentityType().sendKeys(Keys.ARROW_DOWN);
         Thread.sleep(2000);
         eri.save().click();
         Thread.sleep(2000);
         eri.popup().click();
         
         SearchRecordIDentityRelation sr=new SearchRecordIDentityRelation(webdriver);
         Thread.sleep(2000);
          sr.Search().sendKeys("KLMNOP");
          
         DeleteRecordIdentityRelation dri=new DeleteRecordIdentityRelation(webdriver);
         Thread.sleep(2000);
         dri.delete().click();
         Thread.sleep(2000);
         dri.deleted().click();
         Thread.sleep(2000);
         dri.Delete().click();
         
        // softAssert.assertAll();
         
         //driver.close();
         
        
         
}
	
}

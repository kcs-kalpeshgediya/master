package DocTypeTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import ConfigurationDocType.AddRecordDocType;
import ConfigurationDocType.DeleteRecordDocType;
import ConfigurationDocType.EditRecordDocType;
import ConfigurationDocType.SearchRecordDocType;


public class ConfigurationDocType {
	@Test
	public static void Doc(WebDriver webdriver) throws InterruptedException 
	{
		        
        AddRecordDocType ad=new AddRecordDocType(webdriver);
        ad.Configuration().click();
        Thread.sleep(2000);
        ad.DocType().click();
        Thread.sleep(2000);
        ad.ClickNew().click();
        Thread.sleep(2000);
        ad.Documentname().sendKeys("ADHAR CARDD");
       // softAssert.assertEquals("ADHAR CARDD", "ADHAR CARDD");
        Thread.sleep(2000);
        ad.save().click();
        Thread.sleep(5000);
        ad.Popup().click();
        
        SearchRecordDocType sr=new SearchRecordDocType(webdriver);
        Thread.sleep(3000);
        sr.Search().sendKeys("ADHAR CARDD");
        Thread.sleep(5000);
        
        EditRecordDocType Er=new EditRecordDocType(webdriver);
        Thread.sleep(5000);
        Er.Edit().click();
        Thread.sleep(2000);
        Er.Documentname().clear();
        Thread.sleep(2000);
        Er.Documentname().sendKeys("HOUSE LIGHT bILL");
        //softAssert.assertEquals("ADHAR CARDD", "HOUSE LIGHT bILL");

        Thread.sleep(2000);
        Er.save().click();
        Thread.sleep(5000);
        Er.Popup().click();
        
        SearchRecordDocType srd=new SearchRecordDocType(webdriver);
        Thread.sleep(3000);
        srd.Search().sendKeys("HOUSE LIGHT bILL");
        Thread.sleep(5000);
        
        DeleteRecordDocType dr=new DeleteRecordDocType(webdriver);
        dr.delete().click();
        Thread.sleep(2000);
        dr.deleted().click();
        Thread.sleep(2000);
        dr.Delete().click();
        
        /*SearchRecordDocType srdt=new SearchRecordDocType(webdriver);
        Thread.sleep(3000);
        srdt.Search().clear();
        srdt.Search().sendKeys("HOUSE LIGHT bILL");
        Thread.sleep(5000);*/
        
       // softAssert.assertAll();
        
        
      //  driver.quit();

}
	
}

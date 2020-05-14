package UnitTestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert
import ConfigurationUnit.DeleteRecordUnit;
import ConfigurationUnit.EditRecordUnit;
import ConfigurationUnit.SearchRecordUnit;
import ConfigurationUnit.UnitRecordAdd;



public class ConfigurationUnit  {
	
	@Test
	public static void Unit(WebDriver webdriver) throws InterruptedException {
		
	UnitRecordAdd ur=new UnitRecordAdd(webdriver);
        ur.Configuration().click();
        Thread.sleep(2000);
        ur.Unit().click();
        Thread.sleep(2000);
        ur.ClickNew().click();
        Thread.sleep(2000);
        Select s=new Select(webdriver.findElement(By.id("Tower")));
        s.selectByValue("19");
        Thread.sleep(2000);
        ur.UnitNumber().sendKeys("19872124");
       // softAssert.assertEquals("admin1", "19872124");
        Thread.sleep(2000);
        
       /* Select sel=new Select(webdriver.findElement(By.id("Floor")));
        sel.selectByValue("7");*/
       
        ur.Floor().click();
        ur.Floor().sendKeys(Keys.ARROW_DOWN);
        ur.Floor().sendKeys(Keys.ARROW_DOWN);
        ur.Floor().sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        
        ur.IntercomNo().sendKeys("50");
        //softAssert.assertEquals("50", "50");
        Thread.sleep(2000);
        ur.BuildArea().sendKeys("200");
        Thread.sleep(2000);
        ur.CarpetArea().sendKeys("10");
        Thread.sleep(2000);
        /*ur.Manipulation().clear();
        Thread.sleep(2000);
        ur.Manipulation().sendKeys("15");
        Thread.sleep(2000);*/
        
        ur.CheckBox().click();
       // ur.CheckBox().isEnabled();
        Thread.sleep(2000);
        ur.Save().click();
        Thread.sleep(4000);
        ur.Popup().click();
        Thread.sleep(4000);
        
        SearchRecordUnit sr=new SearchRecordUnit(webdriver);
        sr.Search().sendKeys("19872124");
      //  softAssert.assertEquals("198721", "19872124");
        Thread.sleep(5000);
        
        EditRecordUnit er=new EditRecordUnit(webdriver);
        //Thread.sleep(5000);
        er.Edit().click();
        Thread.sleep(5000);
       // Select s=new Select(driver.findElement(By.id("Tower")));
        //s.selectByValue("3");
        
        er.Tower().click();
        er.Tower().sendKeys(Keys.ARROW_DOWN);
        er.Tower().sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
         er.UnitNumber().clear();
        Thread.sleep(2000);
        er.UnitNumber().sendKeys("4567890");
        Thread.sleep(2000);
        
        er.Floor().click();
        er.Floor().sendKeys(Keys.ARROW_DOWN);
        er.Floor().sendKeys(Keys.ARROW_DOWN);
        er.Floor().sendKeys(Keys.ARROW_DOWN);
        er.Floor().sendKeys(Keys.ARROW_DOWN);
        er.Floor().sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        er.IntercomNo().clear();
        Thread.sleep(2000);
        er.IntercomNo().sendKeys("55");
        Thread.sleep(2000);
        er.BuildArea().clear();
        Thread.sleep(2000);
        er.BuildArea().sendKeys("150");
        Thread.sleep(2000);
        er.CarpetArea().clear();
        Thread.sleep(2000);
        er.CarpetArea().sendKeys("5");
        Thread.sleep(2000);
        ur.CheckBox().click();
        Thread.sleep(2000);
        er.Save().click();
        Thread.sleep(4000);
        er.Popup().click();
        Thread.sleep(4000);
        

        SearchRecordUnit sru=new SearchRecordUnit(webdriver);
        sru.Search().sendKeys("4567890");
       // softAssert.assertEquals("198721", "4567890");
        Thread.sleep(5000);
        
        DeleteRecordUnit dr=new DeleteRecordUnit(webdriver);
        dr.delete().click();
        Thread.sleep(2000);
        dr.deleted().click();
        Thread.sleep(2000);
        dr.Delete().click();
        Thread.sleep(5000);
        
        
     /*   SearchRecordUnit srt=new SearchRecordUnit(webdriver);
        srt.Search().clear();
        Thread.sleep(3000);
        srt.Search().sendKeys("4567890");*/
       
        //softAssert.assertAll();
        


	}

}

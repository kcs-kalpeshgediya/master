package ConfigurationTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Configuration.ConfigurationTowerMethods;
import Configuration.DeleteRecordTower;
import Configuration.SearchEditRecordTower;

public class ConfigurationTower {
	

	@Test
	public static void Tower(WebDriver webdriver) throws InterruptedException
	{
		ConfigurationTowerMethods ctm=new ConfigurationTowerMethods(webdriver);
		Thread.sleep(2000);
		ctm.Configuration().click();
        Thread.sleep(2000);
        ctm.Tower().click();
        Thread.sleep(2000);
        ctm.New().click();
        Thread.sleep(1000);
        ctm.TowerName().sendKeys("TowerABCD");
       // softAssert.assertEquals("TowerssssABCD", "TowerABCD");
        Thread.sleep(1000);
        ctm.Initial().sendKeys("ABCD");
       // softAssert.assertEquals("ABCD", "ABCD");
        Thread.sleep(1000);
        ctm.Floors().sendKeys("50");
        Thread.sleep(2000);
  
        ctm.save().click();
        Thread.sleep(5000);
        ctm.popup().click();
        Thread.sleep(2000);
        
        SearchEditRecordTower sea=new SearchEditRecordTower(webdriver);
        sea.Search().sendKeys("ABCD");
        Thread.sleep(4000);
         
 
        sea.Edit().click();
        Thread.sleep(4000);
        sea.Towernames().clear();
        Thread.sleep(3000);
        sea.Towernames().sendKeys("TowerPQRS");
        Thread.sleep(3000);
        sea.Initials().clear();
        Thread.sleep(3000);
        sea.Initials().sendKeys("PQRS");
        Thread.sleep(3000);
        sea.TowerFloors().clear();
        Thread.sleep(3000);
        sea.TowerFloors().sendKeys("65");
        Thread.sleep(3000);
        sea.saves().click();
        Thread.sleep(3000);
        sea.popup().click();
        Thread.sleep(2000);
        
        SearchEditRecordTower sear=new SearchEditRecordTower(webdriver);
       /* sear.Search().sendKeys("ABCD");
        Thread.sleep(4000);
        sear.Search().clear();*/
        Thread.sleep(2000);
        sear.Search().sendKeys("PQRS");
        Thread.sleep(2000);
        
        
        DeleteRecordTower del=new DeleteRecordTower(webdriver);
        Thread.sleep(2000);
        del.Delete1().click();
        Thread.sleep(2000);
        del.Delete2().click();
        Thread.sleep(3000);
        del.Delete3().click();
       // softAssert.assertAll();
        
       // driver.close();
        
	}

	
	}




/*
  
    
  */

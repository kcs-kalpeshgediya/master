package LedgerTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import ConfigurationLedger.AddRecordLedger;
import ConfigurationLedger.DeleteRecordLedger;
import ConfigurationLedger.SearchEditRecordLedger;


public class ConfigurationLedgerTestCases{
	
	public static void Ledger(WebDriver webdriver) throws InterruptedException
	{
		AddRecordLedger arl=new AddRecordLedger(webdriver);
		Thread.sleep(2000);
		arl.Configuration().click();
		Thread.sleep(2000);
		arl.Ledger().click();
		Thread.sleep(2000);
		arl.ClickNew().click();
		Thread.sleep(2000);
		arl.AccountHead().sendKeys("Kalpeshgediya");
		Thread.sleep(2000);
		arl.code().sendKeys("98765432");
		Thread.sleep(2000);
		Select s=new Select(webdriver.findElement(By.id("AccountHeadGroupId")));
		s.selectByValue("43");
		Thread.sleep(2000);
		arl.Billingno().clear();
		Thread.sleep(2000);
		arl.Billingno().sendKeys("8140001516");
		Thread.sleep(2000);
		arl.save().click();
		Thread.sleep(2000);
		arl.popup().click();
		
		SearchEditRecordLedger ser=new SearchEditRecordLedger(webdriver);
		Thread.sleep(2000);
		ser.Search().sendKeys("Kalpeshgediya");
		Thread.sleep(2000);
		ser.Edit().click();
		Thread.sleep(2000);
		ser.AccountHead().clear();
		Thread.sleep(2000);
		ser.AccountHead().sendKeys("gediyakalpil");
		Thread.sleep(2000);
		ser.code().clear();
		Thread.sleep(2000);
		ser.code().sendKeys("12345678");
		Thread.sleep(2000);
		
		Select se =new Select(webdriver.findElement(By.id("AccountHeadGroupId")));
		se.selectByValue("18");
		
		Thread.sleep(2000);
		ser.Billingno().clear();
		Thread.sleep(2000);
		ser.Billingno().sendKeys("9925457108");
		Thread.sleep(2000);
		ser.save().click();
		Thread.sleep(2000);
		ser.popup().click();
		

		SearchEditRecordLedger serl=new SearchEditRecordLedger(webdriver);
		Thread.sleep(2000);
		serl.Search().sendKeys("gediyakalpil");
		
		DeleteRecordLedger del=new DeleteRecordLedger(webdriver);
		Thread.sleep(2000);
		del.delete().click();
		Thread.sleep(2000);
		del.deleted().click();
		Thread.sleep(2000);
		del.Delete().click();
		
		SearchEditRecordLedger search=new SearchEditRecordLedger(webdriver);
		Thread.sleep(2000);
		search.Search().clear();
		search.Search().sendKeys("gediyakalpil");
	}

}

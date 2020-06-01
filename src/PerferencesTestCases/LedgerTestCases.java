package PerferencesTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import PerferencesObjects.LedgerObject;



public class LedgerTestCases {
	public static void Ledger(WebDriver webdriver) throws InterruptedException
	{
		LedgerObject arl=new LedgerObject(webdriver);
		Thread.sleep(2000);
		arl.Configuration().click();
		Thread.sleep(2000);
		arl.Ledger().click();
		Thread.sleep(2000);
		arl.ClickNew().click();
		Thread.sleep(2000);
		arl.AccountHead().sendKeys("gediyaDalpatbhai");
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
		
		
		Thread.sleep(4000);
		arl.Search().sendKeys("gediyaDalpatbhai");
		Thread.sleep(7000);
		arl.Edit().click();
		Thread.sleep(2000);
		arl.AccountHead().clear();
		Thread.sleep(2000);
		arl.AccountHead().sendKeys("gediyakalpil");
		Thread.sleep(2000);
		arl.code().clear();
		Thread.sleep(2000);
		arl.code().sendKeys("12345678");
		Thread.sleep(2000);
		
		Select se =new Select(webdriver.findElement(By.id("AccountHeadGroupId")));
		se.selectByValue("18");
		
		Thread.sleep(2000);
		arl.Billingno().clear();
		Thread.sleep(2000);
		arl.Billingno().sendKeys("9925457108");
		Thread.sleep(2000);
		arl.save().click();
		Thread.sleep(2000);
		arl.popup().click();
		

	
		Thread.sleep(4000);
		arl.Search().sendKeys("gediyakalpil");
		
		Thread.sleep(7000);
		arl.delete().click();
		Thread.sleep(2000);
		arl.deleted().click();
		Thread.sleep(2000);
		arl.Delete().click();
	}

}

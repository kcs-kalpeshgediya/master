package PerferencesTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PerferencesObjects.AccountGroupobject;


public class AccountGroupTestCases {
	@Test
	public static void AccountGroup(WebDriver webdriver) throws InterruptedException
	{
		AccountGroupobject agr=new AccountGroupobject(webdriver);
		
		Thread.sleep(2000);
		agr.Configuration().click();
		Thread.sleep(2000);
		agr.AccountType().click();
		Thread.sleep(2000);
		agr.CilckNew().click();
		Thread.sleep(2000);
		agr.ParentAccount().click();
		agr.ParentAccount().sendKeys(Keys.ARROW_DOWN);
		agr.ParentAccount().sendKeys(Keys.ARROW_DOWN);
		agr.ParentAccount().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		Select s=new Select(webdriver.findElement(By.id("AccountHeadGroupId")));
		s.selectByValue("19");
		
		Thread.sleep(2000);
		agr.AccountGroupcode().sendKeys("K1998");
		Thread.sleep(2000);
		agr.AccountHeadgroup().sendKeys("98765432");
		Thread.sleep(2000);
		agr.Save().click();
		Thread.sleep(4000);
		agr.Cancel().click();
		
		
		Thread.sleep(4000);
		agr.Search().sendKeys("98765432");
		Thread.sleep(4000);
		agr.Edit().click();
		Thread.sleep(2000);
		agr.ParentAccount().click();
		agr.ParentAccount().sendKeys(Keys.ARROW_DOWN);
		agr.ParentAccount().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		agr.Under().click();
		agr.Under().sendKeys(Keys.ARROW_DOWN);
		agr.Under().sendKeys(Keys.ARROW_DOWN);
		agr.Under().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		agr.AccountGroupcode().clear();
		Thread.sleep(2000);
		agr.AccountGroupcode().sendKeys("Kalpesh1998");
		Thread.sleep(2000);
		agr.AccountHeadgroup().clear();
		Thread.sleep(2000);
		agr.AccountHeadgroup().sendKeys("12345678");
		Thread.sleep(2000);
		agr.Save().click();
		Thread.sleep(3000);
		agr.Popup().click();
		
		
		
		Thread.sleep(4000);
		agr.Search().sendKeys("12345678");
		
	
		Thread.sleep(4000);
		agr.delete().click();
		Thread.sleep(2000);
		agr.deleted().click();
		Thread.sleep(2000);
		agr.Delete().click();
	}
}

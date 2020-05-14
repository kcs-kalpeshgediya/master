package AccountGroupTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ConfigurationAccountGroup.AddRecordAccountGroup;
import ConfigurationAccountGroup.DeleteRecordAccountGroup;
import ConfigurationAccountGroup.SearchEditRecordAccountGroup;


public class ConfiurationAccountGroup {
	
	@Test
	public static void AccountGroup(WebDriver webdriver) throws InterruptedException
	{
		AddRecordAccountGroup agr=new AddRecordAccountGroup(webdriver);
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
		
		SearchEditRecordAccountGroup sra=new SearchEditRecordAccountGroup(webdriver);
		Thread.sleep(3000);
		sra.Search().sendKeys("98765432");
		Thread.sleep(2000);
		sra.Edit().click();
		Thread.sleep(2000);
		sra.ParentAccount().click();
		sra.ParentAccount().sendKeys(Keys.ARROW_DOWN);
		sra.ParentAccount().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		sra.Under().click();
		sra.Under().sendKeys(Keys.ARROW_DOWN);
		sra.Under().sendKeys(Keys.ARROW_DOWN);
		sra.Under().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		sra.AccountGroupcode().clear();
		Thread.sleep(2000);
		sra.AccountGroupcode().sendKeys("Kalpesh1998");
		Thread.sleep(2000);
		sra.AccountHeadgroup().clear();
		Thread.sleep(2000);
		sra.AccountHeadgroup().sendKeys("12345678");
		Thread.sleep(2000);
		sra.Save().click();
		Thread.sleep(3000);
		sra.Popup().click();
		
		
		SearchEditRecordAccountGroup srag=new SearchEditRecordAccountGroup(webdriver);
		Thread.sleep(3000);
		srag.Search().sendKeys("12345678");
		
		DeleteRecordAccountGroup dra=new DeleteRecordAccountGroup(webdriver);
		Thread.sleep(2000);
		dra.delete().click();
		Thread.sleep(2000);
		dra.deleted().click();
		Thread.sleep(2000);
		dra.Delete().click();
		
		SearchEditRecordAccountGroup srg=new SearchEditRecordAccountGroup(webdriver);
		Thread.sleep(3000);
		srg.Search().click();
		srg.Search().clear();
		srg.Search().sendKeys("12345678");
		
	}

}

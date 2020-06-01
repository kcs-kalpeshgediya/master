package PerferencesTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PerferencesObjects.ReciptsObjects;
import SmarTown.Common;

public class ReceiptsTestCases extends Common{
	public static SoftAssert Softassert=new SoftAssert();
	@Test
	public static void Receipts(WebDriver webdriver) throws InterruptedException
	{
		ReciptsObjects rco=new ReciptsObjects(webdriver);
		Thread.sleep(3000);
		rco.Admin().click();
		Thread.sleep(3000);
		rco.Receipts().click();
		Thread.sleep(3000);
		rco.New().click();
		Thread.sleep(3000);
		Select s=new Select(webdriver.findElement(By.id("ddlVoucherType")));
		s.selectByValue("8");
		Thread.sleep(3000);
		rco.LedgerAccountName().click();
		Thread.sleep(3000);
		
		rco.SearchLedgername().click();
		rco.SearchLedgername().sendKeys("xis");
		rco.SearchLedgername().sendKeys(Keys.ENTER);
		
		Thread.sleep(4000);
		rco.Accountname().click();
		Thread.sleep(4000);
		rco.AccountNameSearch().sendKeys("C - 403 - J P Iscon Friends House - Recurring");
		rco.AccountNameSearch().sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		rco.Amount().sendKeys("10000");
		rco.Amount().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		rco.Narration().sendKeys("House");
		Thread.sleep(3000);
		rco.PaymentType().click();
		rco.PaymentType().sendKeys(Keys.ARROW_DOWN);
		rco.PaymentType().sendKeys(Keys.ARROW_DOWN);
		rco.PaymentType().sendKeys(Keys.ARROW_DOWN);
		rco.PaymentType().sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		rco.Bankbranch().sendKeys("Rajkot Branch");
		Thread.sleep(3000);

		rco.ChequeNo().sendKeys("120");
		Thread.sleep(3000);

		rco.chequeDate().click();
		Thread.sleep(3000);

		rco.SelectDate().click();
		Thread.sleep(3000);

		
		Thread.sleep(3000);
		rco.Save().click();
		Thread.sleep(3000);
		rco.popup().click();
		Thread.sleep(3000);
		
		String Narration=webdriver.findElement(By.xpath("//my-app//tr[1]//td[6]")).getText();
		System.out.println(Narration);
		Softassert.assertEquals(Narration1, Narration);
		Thread.sleep(6000);
		
		rco.Report().click();
		Thread.sleep(3000);
		rco.AccountLedger().click();
		Thread.sleep(6000);
		rco.AccountHeadSelect().click();
		Thread.sleep(3000);
		rco.search().sendKeys("J P Iscon Friends House");
		Thread.sleep(6000);
		rco.CheckBox().click();
		Thread.sleep(3000);
		rco.Contentbox().click();
		Thread.sleep(3000);
		rco.AccountHeadSelect().click();
		Thread.sleep(3000);
		rco.search().clear();
		Thread.sleep(3000);
		rco.search().sendKeys("xis");
		Thread.sleep(6000);
		rco.CheckBox().click();
		Thread.sleep(3000);
		rco.Contentbox().click();
		Thread.sleep(3000);
		rco.Genrate().click();
		Thread.sleep(3000);
		
		String FirstName=webdriver.findElement(By.xpath("/html[1]/body[1]/my-app[1]/div[1]/div[1]/accountledgerreport[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[7]/td[4]")).getText();
		System.out.println(FirstName);
		Softassert.assertEquals(LedgerFirstAccountName, FirstName);
		
		Thread.sleep(3000);
		Softassert.assertAll();
		
		Thread.sleep(10000);
		
		
		
		
		
		
		
		
		/*rco.FromDate().click();
		Thread.sleep(3000);
		rco.SelectMonth().click();
		Thread.sleep(3000);
		rco.SelectMonth().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		rco.SelectMonth().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		rco.Date().click();
		Thread.sleep(3000);
		rco.ToDate().click();
		Thread.sleep(3000);
		rco.SelectYear().click();
		Thread.sleep(3000);
		rco.SelectYear().sendKeys(Keys.ARROW_UP);
		rco.SelectYear().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		rco.Date().click();
		Thread.sleep(3000);*/
		
		
		/*rco.Configuration().click();
		Thread.sleep(4000);
		rco.Ledger().click();
		Thread.sleep(4000);
		rco.Search().sendKeys("C - 403 - J P Iscon Friends House - Recurring");
		Thread.sleep(10000);
		
		rco.Edit().click();
		
		Thread.sleep(4000);
		rco.Accountname().click();
		Thread.sleep(4000);
		rco.AccountNameSearch().sendKeys("kalpesh");
		rco.AccountNameSearch().sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		rco.Amount().sendKeys("2000");
		rco.Amount().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		rco.EditReason().sendKeys("Testing Purpose");
		
		Thread.sleep(3000);
		rco.Save().click();
		Thread.sleep(3000);
		rco.popup().click();
		Thread.sleep(4000);
		
		rco.Search().sendKeys("kalpesh");
		Thread.sleep(4000);
		
		rco.delete().click();
		Thread.sleep(3000);
		rco.ReceiptsReason().sendKeys("For Wrong Receipts Creates");
		Thread.sleep(3000);
		rco.delete1().click();
		Thread.sleep(3000);
		rco.Delete2().click();*/
	}

}

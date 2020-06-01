package PerferencesTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PerferencesObjects.VoucherObjects;
import SmarTown.Common;

public class VoucherTestCases extends Common{
	public static SoftAssert Softassert=new SoftAssert();
	@Test
	public static void Voucher(WebDriver webdriver) throws InterruptedException
	{
		VoucherObjects vco=new VoucherObjects(webdriver);
		Thread.sleep(3000);
		
		vco.Admin().click();
		Thread.sleep(3000);
		vco.Voucher().click();
		Thread.sleep(3000);
		vco.New().click();
		Thread.sleep(3000);
		
		Select s=new Select(webdriver.findElement(By.id("ddlVoucherType")));
		s.selectByValue("4");
		Thread.sleep(3000);
		
		vco.Accountname().click();
		Thread.sleep(4000);
		vco.AccountSearch().sendKeys("kalpesh");
		//Softassert.assertEquals("kalpesh","kalpesh");
		Thread.sleep(3000);
		vco.AccountSearch().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		vco.DrAmount().sendKeys("1000");
		vco.DrAmount().sendKeys(Keys.ENTER);
		
	//	String DrAmount1=webdriver.findElement(By.id("textbox")).getText();
	//	System.out.println(DrAmount1);
	//	Thread.sleep(3000);
		//Softassert.assertEquals("DrAmount","DrAmount1");

		vco.Accountname().click();
		Thread.sleep(4000);
		vco.AccountSearch().sendKeys("MIHIR B SHAH");
		//Softassert.assertEquals("Manish G","kalpesh");
		vco.AccountSearch().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		vco.CrAmount().sendKeys("1000");
		vco.CrAmount().sendKeys(Keys.ENTER);
		//Softassert.assertEquals("20000.00",webdriver.findElement(By.id("CreditAmount_1")).getText());
		Thread.sleep(3000);
		
		vco.Narration().sendKeys("XYZ");
		Thread.sleep(3000);
		vco.Save().click();
		Thread.sleep(3000);
		vco.popup().click();
		Thread.sleep(6000);
		
		vco.New().click();
		Thread.sleep(3000);
		
		Select se=new Select(webdriver.findElement(By.id("ddlVoucherType")));
		se.selectByValue("3");
		Thread.sleep(3000);
		
		vco.Accountname().click();
		Thread.sleep(4000);
		vco.AccountSearch().sendKeys("A - 302 Laxman Surve");
		Thread.sleep(3000);
		vco.AccountSearch().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		vco.DrAmount().sendKeys("1500");
		vco.DrAmount().sendKeys(Keys.ENTER);
		
		vco.Accountname().click();
		Thread.sleep(4000);
		vco.AccountSearch().sendKeys("A - 304 Harjeetsingh Sokhi");
		vco.AccountSearch().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		vco.CrAmount().sendKeys("1500");
		vco.CrAmount().sendKeys(Keys.ENTER);
		//Softassert.assertEquals("20000.00",webdriver.findElement(By.id("CreditAmount_1")).getText());
		Thread.sleep(3000);
		
		vco.Narration().sendKeys("PQR");
		Thread.sleep(3000);
		vco.Save().click();
		Thread.sleep(3000);
		vco.popup().click();
		Thread.sleep(3000);
		
		String Amount1=webdriver.findElement(By.xpath("/html[1]/body[1]/my-app[1]/div[1]/div[1]/voucherlist[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]")).getText();
		System.out.println(Amount1);
		Softassert.assertEquals(CrAmount1, Amount1);
		
		Thread.sleep(3000);
		/*String Narration3=webdriver.findElement(By.xpath("/html[1]/body[1]/my-app[1]/div[1]/div[1]/voucherlist[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[6]")).getText();
		System.out.println(Narration3);
		Softassert.assertEquals(Narration2, Narration3);*/
		
		Thread.sleep(3000);
		
		String Amount=webdriver.findElement(By.xpath("/html[1]/body[1]/my-app[1]/div[1]/div[1]/voucherlist[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[5]")).getText();
		System.out.println(Amount);
		Softassert.assertEquals(CrAmount, Amount);
		Thread.sleep(2000);
		String Narration1=webdriver.findElement(By.xpath("/html[1]/body[1]/my-app[1]/div[1]/div[1]/voucherlist[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[6]")).getText();
		System.out.println(Narration1);
		Softassert.assertEquals(Narration1,Narration2);
		
		Thread.sleep(3000);
		vco.Report().click();
		Thread.sleep(3000);
		vco.AccountLedger().click();
		Thread.sleep(6000);
		vco.AccountHeadSelect().click();
		Thread.sleep(3000);
		vco.search().sendKeys("MIHIR B SHAH");
		Thread.sleep(6000);
		vco.CheckBox().click();
		Thread.sleep(3000);
		vco.Contentbox().click();
		Thread.sleep(3000);
		
		vco.AccountHeadSelect().click();
		Thread.sleep(3000);
		vco.search().clear();
		Thread.sleep(6000);
		vco.search().sendKeys("Kalpesh Patel");
		Thread.sleep(6000);
		vco.CheckBox().click();
		Thread.sleep(3000);
		vco.Contentbox().click();
		Thread.sleep(3000);
		
		vco.Genrate().click();
		Thread.sleep(7000);
		
		String LedgerName=webdriver.findElement(By.xpath("/html[1]/body[1]/my-app[1]/div[1]/div[1]/accountledgerreport[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[8]/td[4]")).getText();
		System.out.println(LedgerName);
		Softassert.assertEquals(LastAccountName, LedgerName);
		Thread.sleep(3000);
		
		String LedgerDebit=webdriver.findElement(By.xpath("/html[1]/body[1]/my-app[1]/div[1]/div[1]/accountledgerreport[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[8]/td[6]")).getText();
		System.out.println(LedgerDebit);
		Softassert.assertEquals(DrAmount, LedgerDebit);
		Thread.sleep(3000);
		
		
		
		Thread.sleep(6000);
		vco.Report().click();
		Thread.sleep(3000);
		vco.AccountLedger().click();
		Thread.sleep(6000);
		vco.AccountHeadSelect().click();
		Thread.sleep(3000);
		vco.search().sendKeys(" A - 302 Laxman Surve");
		Thread.sleep(6000);
		vco.CheckBox().click();
		Thread.sleep(3000);
		vco.Contentbox().click();
		Thread.sleep(3000);
		
		vco.AccountHeadSelect().click();
		Thread.sleep(3000);
		vco.search().clear();
		Thread.sleep(6000);
		vco.search().sendKeys("A - 304 Harjeetsingh Sokhi");
		Thread.sleep(6000);
		vco.CheckBox().click();
		Thread.sleep(3000);
		vco.Contentbox().click();
		Thread.sleep(3000);
		
		vco.Genrate().click();
		Thread.sleep(3000);
		
		String NarrationName=webdriver.findElement(By.xpath("/html[1]/body[1]/my-app[1]/div[1]/div[1]/accountledgerreport[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[7]/td[5]")).getText();
		System.out.println(NarrationName);
		Softassert.assertEquals(Narration2, NarrationName);
		Thread.sleep(3000);
		
		Softassert.assertAll();
		
		Thread.sleep(10000);
		
		
		
		
		
		
		
		
		
		
		
		/*vco.FromDate().click();
		Thread.sleep(3000);
		vco.SelectMonth().click();
		Thread.sleep(3000);
		vco.SelectMonth().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		vco.SelectMonth().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		vco.Date().click();
		Thread.sleep(3000);
		vco.ToDate().click();
		Thread.sleep(3000);
		vco.SelectYear().click();
		Thread.sleep(3000);
		vco.SelectYear().sendKeys(Keys.ARROW_UP);
		vco.SelectYear().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		vco.Date().click();
		Thread.sleep(3000);*/
		
		
		
		/*vco.Configuration().click();
		Thread.sleep(3000);
		vco.Ledger().click();
		Thread.sleep(3000);
		vco.Search().sendKeys("A - 102 - MIHIR B SHAH - Recurring");
		Thread.sleep(10000);
		vco.Search().sendKeys("MV/1");
		Softassert.assertEquals("Manish G","kalpesh");
		Thread.sleep(3000);
		
		vco.Edit().click();
		Thread.sleep(4000);
		
		vco.Accountname().click();
		Thread.sleep(4000);
		vco.AccountSearch().sendKeys("Ramesh");
		Softassert.assertEquals("Ramesh","Ramesh");
		Thread.sleep(3000);
		vco.AccountSearch().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		vco.DrAmount().sendKeys("500");
		vco.DrAmount().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		vco.Accountname().click();
		Thread.sleep(4000);
		vco.AccountSearch().sendKeys("Mahesh");
		Softassert.assertEquals("Mahesh ","Mahesh");
		vco.AccountSearch().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		vco.CrAmount().sendKeys("500");
		vco.CrAmount().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		vco.EditReason().sendKeys("For Testing Purpose");
		Thread.sleep(3000);
		
		vco.Save().click();
		Thread.sleep(3000);
		vco.popup().click();
		Thread.sleep(3000);
		
		vco.Search().sendKeys("MV/1");
		Thread.sleep(4000);

		vco.Delete().click();
		Thread.sleep(3000);
		vco.VoucherReason().sendKeys("For Worng Transaction");
		Thread.sleep(3000);
		vco.Delete1().click();
		Thread.sleep(3000);;
		vco.Delete2().click();*/
	}

}

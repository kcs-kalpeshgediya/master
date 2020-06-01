package PerferencesTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PerferencesObjects.PaymentObjects;
import SmarTown.Common;


public class PaymentsTestCases extends Common {
	public static SoftAssert Softassert=new SoftAssert();
	@Test
	public static void Payment(WebDriver webdriver) throws InterruptedException
	{
		PaymentObjects pos=new PaymentObjects(webdriver);
		Thread.sleep(3000);
		pos.Admin().click();
		Thread.sleep(3000);

		pos.Payments().click();
		Thread.sleep(3000);

		pos.New().click();
		Thread.sleep(3000);
		
		pos.VoucherType().click();
		pos.VoucherType().sendKeys(Keys.ARROW_DOWN);
		pos.VoucherType().sendKeys(Keys.ENTER);

		//Select s=new Select(webdriver.findElement(By.id("ddlVoucherType")));
		//s.selectByValue("8");
		//Thread.sleep(3000);

		pos.LedgerAccountName().click();
		Thread.sleep(4000);

		pos.SearchLedgername().click();
		pos.SearchLedgername().sendKeys("xis");
		Thread.sleep(3000);

		pos.SearchLedgername().sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		pos.Accountname().click();
		Thread.sleep(3000);

		pos.AccountNameSearch().sendKeys("A - 202 - ANJANA BOGHANI");
		Thread.sleep(3000);

		pos.AccountNameSearch().sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		pos.Amount().sendKeys("50000");
		pos.Amount().sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		
		pos.Narration().sendKeys("Clubhouse");
		Thread.sleep(3000);

		
		Select se=new Select(webdriver.findElement(By.id("ddlPaymentType")));
		se.selectByVisibleText("Cheque HDFC Bank");
		Thread.sleep(3000);

		
		pos.Bankbranch().sendKeys("Ahmedabed Branch");
		Thread.sleep(3000);

		pos.ChequeNo().sendKeys("101");
		Thread.sleep(3000);

		pos.chequeDate().click();
		Thread.sleep(3000);

		pos.SelectDate().click();
		Thread.sleep(3000);
		pos.Save().click();
		Thread.sleep(3000);
		pos.popup().click();
		Thread.sleep(3000);
		
		String LegerName=webdriver.findElement(By.xpath("/html[1]/body[1]/my-app[1]/div[1]/div[1]/paymentlist[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[4]")).getText();
		System.out.println(LegerName);
		Softassert.assertEquals(PaymentLedgerLastAccountName, LegerName);
		Thread.sleep(2000);
		
		String Payment=webdriver.findElement(By.xpath("/html[1]/body[1]/my-app[1]/div[1]/div[1]/paymentlist[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]")).getText();
		System.out.println(Payment);
		Softassert.assertEquals(PaymentAmount, Payment);
		
		Thread.sleep(2000);
		
		
		Thread.sleep(3000);
		pos.Report().click();
		Thread.sleep(3000);
		pos.AccountLedger().click();
		Thread.sleep(6000);
		pos.AccountHeadSelect().click();
		Thread.sleep(3000);
		pos.search().sendKeys("ANJANA BOGHANI");
		Thread.sleep(6000);
		pos.CheckBox().click();
		Thread.sleep(3000);
		pos.Contentbox().click();
		Thread.sleep(3000);
		pos.AccountHeadSelect().click();
		Thread.sleep(3000);
		pos.search().clear();
		Thread.sleep(3000);
		pos.search().sendKeys("Xis");
		Thread.sleep(6000);
		pos.CheckBox().click();
		Thread.sleep(3000);
		pos.Contentbox().click();
		Thread.sleep(3000);

		pos.Genrate().click();
		Thread.sleep(3000);
		
		String Particulars=webdriver.findElement(By.xpath("/html[1]/body[1]/my-app[1]/div[1]/div[1]/accountledgerreport[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[8]/td[5]")).getText();
		System.out.println(Particulars);
		Softassert.assertEquals(PaymentNarration1, Particulars);
		Thread.sleep(3000);
		
		Softassert.assertAll();
		Thread.sleep(10000);
		
		/*pos.FromDate().click();
		Thread.sleep(3000);
		pos.SelectMonth().click();
		Thread.sleep(3000);
		pos.SelectMonth().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		pos.SelectMonth().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		pos.Date().click();
		Thread.sleep(3000);
		pos.ToDate().click();
		Thread.sleep(3000);
		pos.SelectYear().click();
		Thread.sleep(3000);
		pos.SelectYear().sendKeys(Keys.ARROW_UP);
		pos.SelectYear().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		pos.Date().click();*/
		
		/*pos.Configuration().click();
		Thread.sleep(3000);
		pos.Ledger().click();
		Thread.sleep(4000);
		pos.Search().sendKeys("A - 202 - ANJANA BOGHANI");
		Thread.sleep(7000);
	
		pos.Edit().click();
		Thread.sleep(3000);
		
		pos.Accountname().click();
		Thread.sleep(3000);

		pos.AccountNameSearch().sendKeys("kalpesh");
		Thread.sleep(3000);

		pos.AccountNameSearch().sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		pos.Amount().sendKeys("2000");
		pos.Amount().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		pos.EditReason().sendKeys("Testing Purpose");
		
		Thread.sleep(3000);
		pos.Save().click();
		Thread.sleep(3000);

		pos.popup().click();
		Thread.sleep(3000);
		
		pos.Search().sendKeys("kalpesh");
		Thread.sleep(3000);
		
		pos.delete().click();
		Thread.sleep(3000);

		pos.DeletePaymentReason().sendKeys("wrong Payment");
		Thread.sleep(3000);

		pos.delete1().click();
		Thread.sleep(3000);

		pos.Delete2().click();*/
	}

}

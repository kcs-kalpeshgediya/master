package AdminTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import SmarTown.Common;
import SmarTownAdmin.CRDRNotesObjects;

public class CRDRNotesTestCases extends Common {
	public static SoftAssert Softassert=new SoftAssert();
	@Test
	public static void CRDRNotes(WebDriver webdriver) throws InterruptedException
	{
		CRDRNotesObjects cro=new CRDRNotesObjects(webdriver);
		cro.Admin().click();
		Thread.sleep(3000);
		cro.CRDRNotes().click();
		Thread.sleep(3000);
		cro.New().click();
		Thread.sleep(3000);
		Select s=new Select(webdriver.findElement(By.id("ddlVoucherType")));
		s.selectByValue("5");
		Thread.sleep(3000);
		
		cro.LedgerAccountName().click();
		Thread.sleep(3000);
		cro.SearchAccountName().sendKeys("manish G");
		cro.SearchAccountName().sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		cro.DrAmount().sendKeys("4000");
		cro.DrAmount().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		cro.LedgerAccountName().click();
		Thread.sleep(3000);
		cro.SearchAccountName().sendKeys("B - 101 - Chakraborty Sreeti/Debjit Banerjee-Recur");
		cro.SearchAccountName().sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		cro.CrAmount().sendKeys("4000");
		cro.CrAmount().sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		cro.Narration().sendKeys("Prosnal");
		Thread.sleep(3000);
		cro.Save().click();
		Thread.sleep(3000);
		cro.popup().click();
		Thread.sleep(6000);
		
		String 	Amount=webdriver.findElement(By.xpath("/html[1]/body[1]/my-app[1]/div[1]/div[1]/crdrnotelist[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[5]")).getText();
		System.out.println(Amount);
		Softassert.assertEquals(CrDrAmount, Amount);
		Thread.sleep(6000);
		
		cro.Report().click();
		Thread.sleep(3000);
		cro.AccountLedger().click();
		Thread.sleep(6000);
		cro.AccountHeadSelect().click();
		Thread.sleep(3000);
		cro.search().sendKeys("Chakraborty Sreeti/Debjit Banerjee-Recur");
		Thread.sleep(6000);
		cro.CheckBox().click();
		Thread.sleep(3000);
		cro.Contentbox().click();
		Thread.sleep(3000);
		cro.AccountHeadSelect().click();
		Thread.sleep(3000);
		cro.search().clear();
		Thread.sleep(3000);
		cro.search().sendKeys("Manish Gadiya");
		Thread.sleep(6000);
		cro.CheckBox().click();
		Thread.sleep(3000);
		cro.Contentbox().click();
		Thread.sleep(3000);
		
		cro.Genrate().click();
		Thread.sleep(3000);
		String Particulars=webdriver.findElement(By.xpath("/html[1]/body[1]/my-app[1]/div[1]/div[1]/accountledgerreport[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[7]/td[5]")).getText();
		System.out.println(Particulars);
		Softassert.assertEquals(CrDrNarration1, Particulars);
		Thread.sleep(4000);
		
		Softassert.assertAll();
		
		Thread.sleep(10000);
		/*cro.FromDate().click();
		Thread.sleep(3000);
		cro.SelectMonth().click();
		Thread.sleep(3000);
		cro.SelectMonth().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		cro.SelectMonth().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		cro.Date().click();
		Thread.sleep(3000);
		cro.ToDate().click();
		Thread.sleep(3000);
		cro.SelectYear().click();
		Thread.sleep(3000);
		cro.SelectYear().sendKeys(Keys.ARROW_UP);
		cro.SelectYear().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		cro.Date().click();
		Thread.sleep(3000);*/
		
	}
	

}

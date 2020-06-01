package AdminTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import SmarTownAdmin.ReportsObjects;

public class ReportTestcases {
	@Test
	public static void Report(WebDriver webdriver) throws InterruptedException
	{
		ReportsObjects reo=new ReportsObjects(webdriver);
		Thread.sleep(3000);
		reo.Admin().click();
		Thread.sleep(3000);
		reo.Report().click();
		Thread.sleep(3000);
		reo.MemberIdentity().click();
		Thread.sleep(3000);
		Select Tower=new Select(webdriver.findElement(By.id("Tower")));
		Tower.selectByValue("10");
		Thread.sleep(3000);
		Select Unit=new Select(webdriver.findElement(By.id("Unit")));
		Unit.selectByValue("10510");
		Thread.sleep(3000);
		Select Identity =new Select(webdriver.findElement(By.id("Select1")));
		Identity .selectByValue("1");
		Thread.sleep(3000);
		Select Gender=new Select(webdriver.findElement(By.id("Gender")));
		Gender.selectByValue("1");
		Thread.sleep(3000);
		reo.Moblie().sendKeys("8140001516");
		Thread.sleep(3000);
		reo.Search().sendKeys("Kalpesh Gediya");
		Thread.sleep(3000);
		reo.Generate().click();
		Thread.sleep(10000);
		
		reo.Report().click();
		Thread.sleep(4000);
		
	/*	reo.Vehicle().click();
		Thread.sleep(3000);
		Select Tower1=new Select(webdriver.findElement(By.id("Tower")));
		Tower1.selectByValue("10");
		Thread.sleep(3000);
		Select Unit1=new Select(webdriver.findElement(By.id("Unit")));
		Unit1.selectByValue("10510");
		Thread.sleep(3000);
		reo.IdentityName().sendKeys("kalpesh G");
		reo.IdentityName().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Select Vehicle=new Select(webdriver.findElement(By.id("VehicleType")));
		Vehicle.selectByValue("3");
		Thread.sleep(3000);
		
		reo.Search1().sendKeys("Kalpesh Gediya");
		Thread.sleep(3000);
		reo.Generate().click();
		Thread.sleep(10000);*/
		
		reo.Invoice().click();
		Thread.sleep(3000);
		Select Tower2=new Select(webdriver.findElement(By.id("Tower")));
		Tower2.selectByValue("8");
		Thread.sleep(3000);
		Select Unit2=new Select(webdriver.findElement(By.id("Unit")));
		Unit2.selectByValue("284");
		Thread.sleep(3000);
		reo.IdentityName().sendKeys("PREETI");
		reo.IdentityName().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		reo.Tdate().click();
		reo.SelectYear().click();
		reo.SelectYear().sendKeys(Keys.ARROW_DOWN);
		reo.SelectYear().sendKeys(Keys.ARROW_DOWN);
		reo.SelectYear().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		reo.SMonth().click();
		reo.SMonth().sendKeys(Keys.ARROW_UP);
		reo.SMonth().sendKeys(Keys.ARROW_UP);
		reo.SMonth().sendKeys(Keys.ARROW_UP);
		reo.SMonth().sendKeys(Keys.ARROW_UP);
		reo.SMonth().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		reo.Date().click();
		Thread.sleep(3000);
		reo.Generate().click();
		
		Thread.sleep(10000);
		
		/*reo.Report().click();
		Thread.sleep(4000);
		
		reo.Payment().click();
		Thread.sleep(3000);
		Select Acount=new Select(webdriver.findElement(By.id("AccountHead")));
		Acount.selectByValue("1394");
		Thread.sleep(3000);
		Select Voucher=new Select(webdriver.findElement(By.id("VoucherType")));
		Voucher.selectByValue("9");
		Thread.sleep(3000);
		Select Payment=new Select(webdriver.findElement(By.id("PaymentType")));
		Payment.selectByValue("3");
		Thread.sleep(3000);
		Select Paid=new Select(webdriver.findElement(By.id("PaidThrough")));
		Paid.selectByValue("Manual");
		Thread.sleep(3000);
		reo.Generate().click();
		Thread.sleep(10000);
		
		reo.Report().click();
		Thread.sleep(4000);
		
		reo.Receipts().click();
		
		Thread.sleep(3000);
		Select Acount1=new Select(webdriver.findElement(By.id("AccountHead")));
		Acount1.selectByValue("2413");
		Thread.sleep(3000);
		Select Voucher1=new Select(webdriver.findElement(By.id("VoucherType")));
		Voucher1.selectByValue("7");
		Thread.sleep(3000);
		Select Payment1=new Select(webdriver.findElement(By.id("PaymentType")));
		Payment1.selectByValue("17");
		Thread.sleep(3000);
		Select Paid1=new Select(webdriver.findElement(By.id("PaidThrough")));
		Paid1.selectByValue("Manual");
		Thread.sleep(3000);
		reo.Generate().click();
		Thread.sleep(10000);
		
		reo.Report().click();
		Thread.sleep(4000);
		reo.Voucher().click();
		Thread.sleep(3000);
		Select Acount2=new Select(webdriver.findElement(By.id("AccountHead")));
		Acount2.selectByValue("1395");
		Thread.sleep(3000);
		Select Voucher2=new Select(webdriver.findElement(By.id("VoucherType")));
		Voucher2.selectByValue("4");
		Thread.sleep(3000);
		
		reo.Generate().click();
		Thread.sleep(10000);
		
		reo.Report().click();
		Thread.sleep(4000);
		reo.CrDrNotes().click();
		Thread.sleep(3000);
		Select Acount3=new Select(webdriver.findElement(By.id("AccountHead")));
		Acount3.selectByValue("2480");
		Thread.sleep(3000);
		Select Voucher3=new Select(webdriver.findElement(By.id("NoteType")));
		Voucher3.selectByValue("5");
		Thread.sleep(3000);
		reo.Generate().click();
		Thread.sleep(10000);
		
		reo.Report().click();
		Thread.sleep(4000);
		reo.MemberAccount().click();
		Thread.sleep(3000);
		Select Acount4=new Select(webdriver.findElement(By.id("AccountHead")));
		Acount4.selectByValue("1394");
		Thread.sleep(3000);
		reo.Generate().click();
		Thread.sleep(10000);
		
		
		reo.Report().click();
		Thread.sleep(4000);
		reo.AccountLedger().click();
		Thread.sleep(6000);
		reo.AccountHeadSelect().click();
		Thread.sleep(3000);
		reo.search().sendKeys("C - 403 Maintenance");
		Thread.sleep(6000);
		reo.CheckBox().click();
		Thread.sleep(3000);
		reo.Contentbox().click();
		Thread.sleep(3000);
		
		reo.AccountHeadSelect().click();
		Thread.sleep(3000);
		reo.search().clear();
		Thread.sleep(6000);
		reo.search().sendKeys("A - 602 - Shashi ");
		Thread.sleep(6000);
		reo.CheckBox().click();
		Thread.sleep(3000);
		reo.Contentbox().click();
		Thread.sleep(3000);
		
		reo.Generate().click();
		Thread.sleep(10000);
		
		reo.Report().click();
		Thread.sleep(4000);
		reo.Balance().click();
		Thread.sleep(4000);
		reo.Generate().click();
		Thread.sleep(4000);
		reo.Current().click();
		Thread.sleep(4000);
		reo.Sundry().click();
		Thread.sleep(4000);
		reo.Member().click();
		Thread.sleep(4000);
		reo.BankAccount().click();
		Thread.sleep(10000);
		
		reo.Report().click();
		Thread.sleep(4000);
		reo.DayBookReport().click();
		Thread.sleep(4000);
		reo.Generate().click();
		Thread.sleep(10000);
		
		reo.Report().click();
		Thread.sleep(4000);
		reo.TrialBalance().click();
		Thread.sleep(4000);
		reo.Generate().click();
		Thread.sleep(4000);
		
		//reo.Cash().click();
		//Thread.sleep(4000);
		reo.BankAccount().click();
		Thread.sleep(4000);
		reo.Current().click();
		Thread.sleep(4000);
		reo.Member().click();
		Thread.sleep(4000);
		reo.Sundry().click();
		Thread.sleep(4000);
		reo.Driect().click();
		Thread.sleep(4000);
		reo.Maintenance().click();
		Thread.sleep(4000);
		reo.Indirect().click();
		Thread.sleep(4000);
		reo.Repair().click();
		Thread.sleep(4000);
		reo.IndirectIncome().click();
		Thread.sleep(4000);
		reo.Report().click();
		
		reo.profit().click();
		Thread.sleep(4000);
		reo.Generate().click();
		Thread.sleep(4000);
		reo.directIncome().click();
		Thread.sleep(4000);
		reo.Maintance1().click();
		
		reo.Report().click();
		Thread.sleep(4000);
		reo.defultReport().click();
		Thread.sleep(4000);
		reo.Generate().click();
		Thread.sleep(7000);
		
		reo.Report().click();
		Thread.sleep(4000);
		reo.memberColsing().click();
		Thread.sleep(4000);
		
		Select Status=new Select(webdriver.findElement(By.id("ddlStatus")));
		Status.selectByValue("1");
		
		Thread.sleep(4000);
		reo.Generate().click();
		
		Thread.sleep(7000);
		reo.Report().click();
		
		Thread.sleep(4000);
		reo.Suggestion().click();
		Thread.sleep(4000);
		Select S1=new Select(webdriver.findElement(By.id("Tower")));
		S1.selectByValue("8");
		Thread.sleep(4000);
		Select S2=new Select(webdriver.findElement(By.id("Status")));
		S2.selectByValue("1");
		Thread.sleep(4000);
		Select S3=new Select(webdriver.findElement(By.id("ServiceSupportTypeId")));
		S3.selectByValue("10");
		Thread.sleep(4000);
		reo.IdentityName().sendKeys("manish G");
		reo.IdentityName().sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		reo.Generate().click();
		
		Thread.sleep(7000);
		reo.Report().click();
		
		reo.EmailLog().click();
		Thread.sleep(4000);
		reo.IdentityName().sendKeys("MAGAN MATHUR");
		reo.IdentityName().sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		Select Module=new Select(webdriver.findElement(By.id("Module")));
		Module.selectByValue("7");
		Thread.sleep(4000);
		reo.Subjects().click();
		reo.Subjects().sendKeys(Keys.ARROW_DOWN);
		reo.Subjects().sendKeys(Keys.ARROW_DOWN);
		reo.Subjects().sendKeys(Keys.ARROW_DOWN);
		reo.Subjects().sendKeys(Keys.ARROW_DOWN);
		reo.Subjects().sendKeys(Keys.ARROW_DOWN);
		reo.Subjects().sendKeys(Keys.ARROW_DOWN);
		reo.Subjects().sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		Select Status1=new Select(webdriver.findElement(By.id("Status")));
		Status1.selectByValue("0");
		Thread.sleep(4000);
		reo.Generate().click();
		Thread.sleep(7000);
		
		reo.Report().click();
		Thread.sleep(4000);
		reo.SMSlog().click();
		Thread.sleep(4000);
		reo.IdentityName().sendKeys("JAGDISH PRAJAPATI");
		reo.IdentityName().sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		Select Module1=new Select(webdriver.findElement(By.id("Module")));
		Module1.selectByValue("7");
		Thread.sleep(4000);
		Select Status2=new Select(webdriver.findElement(By.id("Status")));
		Status2.selectByValue("0");
		Thread.sleep(4000);
		reo.MoblieNo().sendKeys("9925552348");
		Thread.sleep(4000);
		reo.Generate().click();*/
	}

}

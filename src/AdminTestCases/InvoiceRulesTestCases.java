package AdminTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import SmarTownAdmin.InvoiceRulesObjects;

public class InvoiceRulesTestCases {
	
	public static void Invoice(WebDriver webdriver) throws InterruptedException
	{
		InvoiceRulesObjects ino=new InvoiceRulesObjects(webdriver);
		Thread.sleep(3000);
		ino.Configuration().click();
		Thread.sleep(3000);
		ino.Invoice().click();
		Thread.sleep(3000);
		ino.New().click();
		Thread.sleep(3000);
		
		Select Company=new Select(webdriver.findElement(By.id("CompanyId")));
		Company.selectByValue("1");
		Thread.sleep(3000);
		
		ino.Title().sendKeys("Depandent");
		Thread.sleep(3000);
		ino.Select().click();
		Thread.sleep(3000);
		ino.SelectAll().click();
		Thread.sleep(3000);
		ino.Click().click();
		Thread.sleep(3000);
		ino.StartSqft().click();
		Thread.sleep(3000);
		ino.StartSqft().sendKeys("30");
		Thread.sleep(3000);
		ino.EndSqft().sendKeys("50");
		Thread.sleep(3000);
		ino.Amount().sendKeys("5000");
		Thread.sleep(3000);
		
		Select AccountHead = new Select(webdriver.findElement(By.id("AccountHeadId")));
		AccountHead.selectByValue("1717");
		Thread.sleep(3000);
		
		Select Voucher = new Select(webdriver.findElement(By.id("VoucherTypeId")));
		Voucher.selectByValue("4");
		Thread.sleep(3000);
		
		Select Property = new Select(webdriver.findElement(By.id("PropertyStatusId")));
		Property.selectByValue("1");
		Thread.sleep(3000);
		
		ino.Save().click();
		Thread.sleep(3000);
		ino.Popup().click();
		
		
		
		
		
		
		
		
		
		
	}

}

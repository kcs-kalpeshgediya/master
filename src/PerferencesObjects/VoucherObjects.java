package PerferencesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VoucherObjects {
	
	WebDriver driver;
	@Test
	public VoucherObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Admin=By.xpath("//a[text()='Admin']");
	By Voucher=By.xpath("//span[text()='Voucher']");
	By New=By.xpath("//a[contains(text(),'New')]");
	By VoucherType=By.id("ddlVoucherType");
	By Accountname=By.xpath("//span[text()='Select Ledger Account Name']");
	By AccountSearch=By.className("select2-input");
	By DrAmount=By.id("DrAmount");
	By CrAmount=By.id("CrAmount");
	By Narration=By.id("txtDesc");
	By Save=By.id("btnSave");
	By popup=By.id("popup_ok");
	
	By Report=By.xpath("//span[text()='Reports']");
	By AccountLedger=By.xpath("//span[text()='Account Ledger']");
	By AccountHeadSelect=By.xpath("//button[@class='multiselect dropdown-toggle multiSelect']");
	By search=By.xpath("//input[@placeholder='Search']");
	By CheckBox=By.xpath("//label[contains(text(),'Select all')]");
	By Contentbox=By.className("contentblock");
	/*By FromDate=By.id("FromDate");
	By SelectMonth=By.className("ui-datepicker-month");
	By Date=By.linkText("26");
	By ToDate=By.id("ToDate");
	By SelectYear=By.className("ui-datepicker-year");*/
	By Genrate=By.xpath("//button[contains(text(),'Generate')]");
	
	//By Configuration=By.linkText("Configuration");
	//By Ledger=By.xpath("//span[text()='Ledger']");
	//By Search=By.id("txtsearch");
	
	
	/*By Search=By.id("txtsearch");
	By Edit=By.xpath("/html[1]/body[1]/my-app[1]/div[1]/div[1]/voucherlist[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/a[1]/i[1]");
	By EditReason=By.id("txtEditedResone");
	By Delete=By.className("ecubeicon-garbage-2");
	By VoucherReason=By.id("deleteVoucheReasontxt");
	By Delete1=By.id("btnDeleteVoucher");
	By Delete2=By.id("popup_ok");*/
	
	public WebElement Admin()
	{
		return driver.findElement(Admin);
	}
	public WebElement Voucher()
	{
		return driver.findElement(Voucher);
	}
	public WebElement New()
	{
		return driver.findElement(New);
	}
	public WebElement VoucherType()
	{
		return driver.findElement(VoucherType);
	}
	public WebElement Accountname()
	{
		return driver.findElement(Accountname);
	}
	public WebElement AccountSearch()
	{
		return driver.findElement(AccountSearch);
	}
	public WebElement DrAmount()
	{
		return driver.findElement(DrAmount);
	}
	public WebElement CrAmount()
	{
		return driver.findElement(CrAmount);
	}
	public WebElement Narration()
	{
		return driver.findElement(Narration);
	}
	public WebElement Save()
	{
		return driver.findElement(Save);
	}
	public WebElement popup()
	{
		return driver.findElement(popup);
	}
	public WebElement Report()
	{
		return driver.findElement(Report);
	}
	public WebElement AccountLedger()
	{
		return driver.findElement(AccountLedger);
	}
	public WebElement AccountHeadSelect()
	{
		return driver.findElement(AccountHeadSelect);
	}
	public WebElement search()
	{
		return driver.findElement(search);
	}
	public WebElement CheckBox()
	{
		return driver.findElement(CheckBox);
	}
	public WebElement Contentbox()
	{
		return driver.findElement(Contentbox);
	}
	/*public WebElement FromDate()
	{
		return driver.findElement(FromDate);
	}
	public WebElement SelectMonth()
	{
		return driver.findElement(SelectMonth);
	}
	public WebElement Date()
	{
		return driver.findElement(Date);
	}
	public WebElement ToDate()
	{
		return driver.findElement(ToDate);
	}
	public WebElement SelectYear()
	{
		return driver.findElement(SelectYear);
	}*/
	public WebElement Genrate()
	{
		return driver.findElement(Genrate);
	}
/*	public WebElement Configuration()
	{
		return driver.findElement(Configuration);
	}
	public WebElement Ledger()
	{
		return driver.findElement(Ledger);
	}
	public WebElement Search()
	{
		return driver.findElement(Search);
	}
	
	public WebElement VoucherReason()
	{
		return driver.findElement(VoucherReason);
	}
	public WebElement Delete1()
	{
		return driver.findElement(Delete1);
	}
	public WebElement Delete2()
	{
		return driver.findElement(Delete2);
	}*/
}

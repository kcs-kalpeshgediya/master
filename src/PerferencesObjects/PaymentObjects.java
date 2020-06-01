package PerferencesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PaymentObjects {
	WebDriver driver;
	@Test
	public PaymentObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	By Admin=By.xpath("//a[text()='Admin']");
	By Payments=By.xpath("//span[text()='Payments']");
	By New=By.xpath("//a[@class='btn']");
	By VoucherType=By.id("ddlVoucherType");
	By LedgerAccountName=By.id("s2id_ddlAccountHeadTo");
	By SearchLedgername=By.xpath("/html[1]/body[1]/div[3]/div[1]/input[1]");
	By Accountname=By.xpath("//span[text()='Select Ledger Account Name']");
	By AccountNameSearch=By.xpath("/html[1]/body[1]/div[3]/div[1]/input[1]");
	
	By Amount=By.id("DrAmount");
	
	By Narration=By.id("txtDesc");
	By Bankbranch=By.id("BankBranch");
	By ChequeNo=By.id("txtChqNo");
	By chequeDate=By.id("txtChqDate");
	By SelectDate=By.xpath(" //a[contains(text(),'19')]");
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
	
	/*By Configuration=By.linkText("Configuration");
	By Ledger=By.xpath("//span[text()='Ledger']");
	By Search=By.id("txtsearch");
	
	By Edit=By.xpath("/html[1]/body[1]/my-app[1]/div[1]/div[1]/paymentlist[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/a[1]/i[1]");
	By EditReason=By.id("txtEditedResone");
	By delete=By.className("ecubeicon-garbage-2");
	By DeletePaymentReason=By.id("deletePaymentReasontxt");
	By delete1=By.id("btnDeletePayment");
	By Delete2=By.id("popup_ok");*/
	
	public WebElement Admin()
	{
		return driver.findElement(Admin);
	}
	public WebElement Payments()
	{
		return driver.findElement(Payments);
	}
	public WebElement New()
	{
		return driver.findElement(New);
	}
	public WebElement VoucherType()
	{
		return driver.findElement(VoucherType);
	}
	public WebElement LedgerAccountName()
	{
		return driver.findElement(LedgerAccountName);
	}
	public WebElement SearchLedgername()
	{
		return driver.findElement(SearchLedgername);
	}
	public WebElement Accountname()
	{
		return driver.findElement(Accountname);
	}
	public WebElement AccountNameSearch()
	{
		return driver.findElement(AccountNameSearch);
	}
	public WebElement Amount()
	{
		return driver.findElement(Amount);
	}
	public WebElement Narration()
	{
		return driver.findElement(Narration);
	}
	public WebElement Bankbranch()
	{
		return driver.findElement(Bankbranch);
	}
	public WebElement ChequeNo()
	{
		return driver.findElement(ChequeNo);
	}
	public WebElement chequeDate()
	{
		return driver.findElement(chequeDate);
	}
	public WebElement SelectDate()
	{
		return driver.findElement(SelectDate);
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
	/*
	public WebElement Configuration()
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
	
	public WebElement delete()
	{
		return driver.findElement(delete);
	}
	public WebElement DeletePaymentReason()
	{
		return driver.findElement(DeletePaymentReason);
	}
	public WebElement delete1()
	{
		return driver.findElement(delete1);
	}
	public WebElement Delete2()
	{
		return driver.findElement(Delete2);
	}*/

}

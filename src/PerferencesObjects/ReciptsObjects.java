package PerferencesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ReciptsObjects {
	WebDriver driver;
	@Test
	public ReciptsObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	By Admin=By.xpath("//a[text()='Admin']");
	By Receipts=By.xpath("//span[text()='Receipts']");
	By New=By.xpath("//a[@class='btn']");
	By LedgerAccountName=By.id("s2id_ddlAccountHeadTo");
	By SearchLedgername=By.xpath("/html[1]/body[1]/div[3]/div[1]/input[1]");
	By Accountname=By.xpath("//span[text()='Select Ledger Account Name']");
	By AccountNameSearch=By.xpath("/html[1]/body[1]/div[3]/div[1]/input[1]");
	By Amount=By.id("CrAmount");
	By Narration=By.id("txtDesc");
	
	By PaymentType=By.id("ddlPaymentType");
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
	By Search=By.id("txtsearch");*/
	
	
	/*By Edit=By.xpath("/html[1]/body[1]/my-app[1]/div[1]/div[1]/receiptlist[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/a[1]/i[1]");
	By EditReason=By.id("txtEditedResone");
	By delete=By.className("ecubeicon-garbage-2");
	By ReceiptsReason=By.id("deleteReceiptReasontxt");
	By delete1=By.id("btnDeleteReceipt");
	By Delete2=By.id("popup_ok");*/
	

	public WebElement Admin()
	{
		return driver.findElement(Admin);
	}
	public WebElement Receipts()
	{
		return driver.findElement(Receipts);
	}
	public WebElement New()
	{
		return driver.findElement(New);
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
	public WebElement PaymentType()
	{
		return driver.findElement(PaymentType);
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
	/*public WebElement Configuration()
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
	public WebElement Search()
	{
		return driver.findElement(Search);
	}
	public WebElement Edit()
	{
		return driver.findElement(Edit);
	}
	public WebElement EditReason()
	{
		return driver.findElement(EditReason);
	}
	public WebElement delete()
	{
		return driver.findElement(delete);
	}
	public WebElement ReceiptsReason()
	{
		return driver.findElement(ReceiptsReason);
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

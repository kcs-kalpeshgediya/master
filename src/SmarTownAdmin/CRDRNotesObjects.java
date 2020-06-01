package SmarTownAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CRDRNotesObjects {
	
	
	WebDriver driver;
	@Test
	public CRDRNotesObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	By Admin=By.xpath("//a[text()='Admin']");
	By CRDRNotes=By.xpath("//span[text()='Cr/Dr Notes']");
	By New=By.xpath("//a[@class='btn']");
	
	By LedgerAccountName=By.xpath("//span[contains(text(),'Select Ledger Account Name')]");
	//By LedgerAccountName=By.id("s2id_ddlAccountHeadTo");
	//By Accountname=By.xpath("//span[text()='Select Ledger Account Name']");
	By SearchAccountName=By.className("select2-input");
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
	
	/*By Configuration=By.linkText("Configuration");
	By Ledger=By.xpath("//span[text()='Ledger']");
	By Search=By.id("txtsearch");*/
	
	
	public WebElement Admin()
	{
		return driver.findElement(Admin);
	}
	public WebElement CRDRNotes()
	{
		return driver.findElement(CRDRNotes);
	}
	
	public WebElement New()
	{
		return driver.findElement(New);
	}
	
	public WebElement LedgerAccountName()
	{
		return driver.findElement(LedgerAccountName);
	}
	
	public WebElement SearchAccountName()
	{
		return driver.findElement(SearchAccountName);
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
	}*/
	
}

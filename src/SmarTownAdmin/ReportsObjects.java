package SmarTownAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ReportsObjects {

	WebDriver driver;
	@Test
	public ReportsObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	By Admin=By.xpath("//a[text()='Admin']");
	By Report=By.xpath("//span[text()='Reports']");
	By MemberIdentity=By.xpath("//span[contains(text(),'Member Identity Register')]");
	By Moblie=By.id("mobileNo");
	By Search=By.id("Search");
	By Generate=By.xpath("//button[contains(text(),'Generate')]");
	
	By Vehicle=By.xpath("//span[contains(text(),'Vehicle Register')]");
	By IdentityName=By.id("txtSearchMember");
	By Search1=By.id("SearchCriteria");
	
	By Invoice=By.xpath("//span[contains(text(),'Invoice Register')]");
	By Tdate=By.id("ToDate");
	By SelectYear=By.className("ui-datepicker-year");
	By SMonth=By.className("ui-datepicker-month");
	By Date=By.linkText("26");
	
	By Payment=By.xpath("//span[contains(text(),'Payment Register')]");
	
	By Receipts=By.xpath("//span[contains(text(),'Receipt Register')]");
	
	By Voucher=By.xpath("//span[contains(text(),'Voucher Register')]");
	
	By CrDrNotes=By.xpath("//span[contains(text(),'Credit Debit Notes')]");
	
	By MemberAccount=By.xpath("//span[contains(text(),'Member Account Statement')]");
	
	By AccountLedger=By.xpath("//span[text()='Account Ledger']");
	By AccountHeadSelect=By.xpath("//button[@class='multiselect dropdown-toggle multiSelect']");
	By search=By.xpath("//input[@placeholder='Search']");
	By CheckBox=By.xpath("//label[contains(text(),'Select all')]");
	By Contentbox=By.className("contentblock");
	
	By Balance=By.xpath("//span[contains(text(),'Balance Sheet')]");
	By Current=By.xpath("//div[contains(text(),'Current Liabilities')]");
	By Sundry=By.xpath("//div[contains(text(),'Sundry Creditors')]");
	By Member=By.xpath("//div[contains(text(),'Members Deposit')]");
	By BankAccount=By.xpath("//div[contains(text(),'Bank Accounts')]");
	
	By DayBookReport=By.xpath("//span[contains(text(),'Day Book Report')]");
	
	By TrialBalance=By.xpath("//span[contains(text(),'Trial Balance')]");
	By Cash=By.xpath("//div[@class='balancerow bluetitle collapsed']//div[@class='width60'][contains(text(),'Cash')]");
	By CurrentAssets=By.xpath("//div[contains(text(),'Current Assets')]");
	By Driect=By.xpath("//div[contains(text(),'Direct Incomes')]");
	By Maintenance=By.xpath("//ul[@id='11']//div[@class='width60'][contains(text(),'Maintenance')]");
	By Indirect=By.xpath("//div[contains(text(),'Indirect Expenses')]");
	By Repair=By.xpath("//div[contains(text(),'Repair & Maintenance Exp.')]");
	By IndirectIncome=By.xpath("//div[contains(text(),'Indirect Incomes')]");
	
	By profit=By.xpath("//span[contains(text(),'Profit & Loss A')]");
	By directIncome=By.xpath("//div[contains(text(),'Direct Incomes')]");
	By Maintance1=By.xpath("//div[contains(text(),'Maintenance')]");
	
	By defultReport=By.xpath("//span[contains(text(),'Defaulter Report')]");
	
	By memberColsing=By.xpath("//span[contains(text(),'Member Closing Balance Report')]");
	
	By Suggestion=By.xpath("//span[contains(text(),'Suggestion Register')]");
		
	By EmailLog=By.xpath("//span[contains(text(),'Email Log')]");
	By Subjects=By.id("Subject");
	
	By SMSlog=By.xpath("//span[contains(text(),'SMS Log')]");
	By MoblieNo=By.id("mobileNo");
	//By FromDate=By.id("FromDate");
	//By SelectMonth=By.className("ui-datepicker-month");
	//By Date=By.linkText("26");
	//By ToDate=By.id("ToDate");
	//By SelectYear=By.className("ui-datepicker-year");
	
	public WebElement Admin()
	{
		return driver.findElement(Admin);
	}
	public WebElement Report()
	{
		return driver.findElement(Report);
	}
	public WebElement MemberIdentity()
	{
		return driver.findElement(MemberIdentity);
	}
	public WebElement Moblie()
	{
		return driver.findElement(Moblie);
	}
	public WebElement Search()
	{
		return driver.findElement(Search);
	}
	public WebElement Generate()
	{
		return driver.findElement(Generate);
	}
	
	public WebElement Vehicle()
	{
		return driver.findElement(Vehicle);
	}
	public WebElement IdentityName()
	{
		return driver.findElement(IdentityName);
	}
	public WebElement Search1()
	{
		return driver.findElement(Search1);
	}
	
	
	public WebElement Invoice()
	{
		return driver.findElement(Invoice);
	}
	public WebElement Tdate()
	{
		return driver.findElement(Tdate);
	}
	public WebElement SelectYear()
	{
		return driver.findElement(SelectYear);
	}
	public WebElement SMonth()
	{
		return driver.findElement(SMonth);
	}
	public WebElement Date()
	{
		return driver.findElement(Date);
	}
	
	public WebElement Payment()
	{
		return driver.findElement(Payment);
	}
	public WebElement Receipts()
	{
		return driver.findElement(Receipts);
	}
	public WebElement Voucher()
	{
		return driver.findElement(Voucher);
	}
	public WebElement CrDrNotes()
	{
		return driver.findElement(CrDrNotes);
	}
	public WebElement MemberAccount()
	{
		return driver.findElement(MemberAccount);
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
	public WebElement Balance()
	{
		return driver.findElement(Balance);
	}
	public WebElement Current()
	{
		return driver.findElement(Current);
	}
	public WebElement Sundry()
	{
		return driver.findElement(Sundry);
	}
	public WebElement Member()
	{
		return driver.findElement(Member);
	}
	public WebElement BankAccount()
	{
		return driver.findElement(BankAccount);
	}
	public WebElement DayBookReport()
	{
		return driver.findElement(DayBookReport);
	}
	public WebElement TrialBalance()
	{
		return driver.findElement(TrialBalance);
	}
	public WebElement Cash()
	{
		return driver.findElement(Cash);
	}
	public WebElement CurrentAssets()
	{
		return driver.findElement(CurrentAssets);
	}
	public WebElement Driect()
	{
		return driver.findElement(Driect);
	}
	public WebElement Maintenance()
	{
		return driver.findElement(Maintenance);
	}
	public WebElement Indirect()
	{
		return driver.findElement(Indirect);
	}
	public WebElement Repair()
	{
		return driver.findElement(Repair);
	}
	public WebElement IndirectIncome()
	{
		return driver.findElement(IndirectIncome);
	}
	public WebElement profit()
	{
		return driver.findElement(profit);
	}
	public WebElement directIncome()
	{
		return driver.findElement(directIncome);
	}
	public WebElement Maintance1()
	{
		return driver.findElement(Maintance1);
	}
	public WebElement defultReport()
	{
		return driver.findElement(defultReport);
	}
	public WebElement memberColsing()
	{
		return driver.findElement(memberColsing);
	}
	public WebElement Suggestion()
	{
		return driver.findElement(Suggestion);
	}
	public WebElement EmailLog()
	{
		return driver.findElement(EmailLog);
	}
	public WebElement Subjects()
	{
		return driver.findElement(Subjects);
	}
	public WebElement SMSlog()
	{
		return driver.findElement(SMSlog);
	}
	public WebElement MoblieNo()
	{
		return driver.findElement(MoblieNo);
	}
	

}

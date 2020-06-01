package SmarTown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import AdminTestCases.CRDRNotesTestCases;
import AdminTestCases.CashBankBookTestCases;
import AdminTestCases.CommunicationTestCases;
import AdminTestCases.InvoiceRulesTestCases;
import AdminTestCases.ReportTestcases;
import AdminTestCases.ResidentsAccountsTestCases;
//import AdminTestCases.CRDRNotesTestCases;
import PerferencesTestCases.AccountGroupTestCases;
import PerferencesTestCases.AllotmentZoneTestCases;
import PerferencesTestCases.AllotmentzoneRateTestcases;
import PerferencesTestCases.AllotmentzoneSpaceTestcases;
import PerferencesTestCases.LedgerTestCases;
import PerferencesTestCases.PaymentsTestCases;
import PerferencesTestCases.ReceiptsTestCases;
//import PerferencesTestCases.PaymentsTestCases;
//import PerferencesTestCases.ReceiptsTestCases;
import PerferencesTestCases.ServiceRequestVehicleTestcases;
import PerferencesTestCases.VoucherTestCases;
//import PerferencesTestCases.VoucherTestCases;
import SmarTownAdmin.LoginSmarTown;



public class Base1 {
	
	public static WebDriver webdriver = null;
	
	//SoftAssert softAssert = new SoftAssert();
	@BeforeClass
	public  void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\kalpeshgediya\\backup\\kalpesh\\chromedriver.exe");
		webdriver=new ChromeDriver();	
		//System.setProperty("webdriver.ie.driver","D:\\kalpeshgediya\\IEDriverServer.exe");
		//webdriver=new InternetExplorerDriver();
		//System.setProperty("webdriver.gecko.driver","D:\\kalpeshgediya\\backup\\geckodriver.exe");
	    //webdriver=new FirefoxDriver();

		
		webdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
		
		webdriver.get("http://180.211.99.238:9374/#/");
		//webdriver.get("https://www.facebook.com/");
        
		webdriver.manage().window().maximize();
        
        
		 
        Thread.sleep(2000);
        LoginSmarTown login=new LoginSmarTown(webdriver);
        login.UserName().sendKeys("admin");
      //  Softassert.assertEquals("admin", "admin");
        Thread.sleep(1000);
        login.password().sendKeys("admin123");
        //Softassert.assertEquals("admin123", "admin123");
        Thread.sleep(3000);
        login.Login().click();
        Thread.sleep(3000);
	} 
   /* @Test(priority=1)
	public void AllotMentZone() throws InterruptedException
	{
		AllotmentZoneTestCases.Zone(webdriver);
	}
	@Test(priority=2)
	public void AllotmentSpace() throws InterruptedException
	{
		AllotmentzoneSpaceTestcases.Space(webdriver);
	}
	@Test(priority=3)
	public void AllotmentRate() throws InterruptedException
	{
		AllotmentzoneRateTestcases.Rate(webdriver);
	}
	@Test(priority=4)
	public void Vehicle() throws InterruptedException
	{
		ServiceRequestVehicleTestcases.Vehicle(webdriver);
	}
	@Test(priority=5)
	public void AccountGroup() throws InterruptedException
	{
		AccountGroupTestCases.AccountGroup(webdriver);
	}
	@Test(priority=6)
	public void Ledger() throws InterruptedException
	{
		LedgerTestCases.Ledger(webdriver);
	}*/
    @Test(priority=7)
	public void Voucher() throws InterruptedException
	{
		VoucherTestCases.Voucher(webdriver);
	}/*
	@Test(priority=8)
	public void Receipts() throws InterruptedException
	{
		ReceiptsTestCases.Receipts(webdriver);
	}
	@Test(priority=9)
	public void Payments() throws InterruptedException
	{
		PaymentsTestCases.Payment(webdriver);
	}
	@Test(priority=10)
	public void DRCRNote() throws InterruptedException
	{
		CRDRNotesTestCases.CRDRNotes(webdriver);
	}
	
	@Test(priority=11)
	public void CashBankBook() throws InterruptedException
	{
		CashBankBookTestCases.CashBankBook(webdriver);
	}
	@Test(priority=12)
	public void InvoiceRules() throws InterruptedException
	{
		InvoiceRulesTestCases.Invoice(webdriver);
	}
	@Test(priority=13)
	public void Reports() throws InterruptedException
	{
		ReportTestcases.Report(webdriver);
	}
	/*@Test(priority=12)
	public void Communication() throws InterruptedException
	{
		CommunicationTestCases.Communication(webdriver);
	}/*
	
	
	@Test(priority=15)
	public void ResidentAccount() throws InterruptedException
	{
		ResidentsAccountsTestCases.Ressident(webdriver);
		
	}*/
}

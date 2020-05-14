package SmarTBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import AccountGroupTestCases.ConfiurationAccountGroup;
import AdminTestCases.IdentityTestCases;
import Configuration.LoginSmarTown;
import ConfigurationTestCases.ConfigurationTower;
import DocTypeTestCases.ConfigurationDocType;
import FinancialYearTestCases.ConfigurationFinancialYear;
import IdentityRelationTestcases.ConfigurationIdentityRelation;
import IdentityTypeTestcases.ConfigurationIdentityType;
import LedgerTestCases.ConfigurationLedgerTestCases;
import PayTypeTestCases.PayTypeTestCases;
import TaxMasterTestCases.TaxMasterTestCases;
import UnitTestCases.ConfigurationUnit;
import VehicleTypeTestCases.ConfigurationVehicleType;


public class Base {
	public static WebDriver webdriver = null;
	@BeforeClass
	public  void setup() throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver","E:\\kalpeshgediya\\backup\\chromedriver.exe");
		webdriver=new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver","E:\\kalpesh\\geckodriver.exe");
	    //webdriver=new FirefoxDriver();

		
		//webdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
		
		webdriver.get("http://180.211.99.238:9212/#/");
		//webdriver.get("https://www.facebook.com/");
        
		webdriver.manage().window().maximize();
        
       // SoftAssert softAssert = new SoftAssert();
		 
        Thread.sleep(2000);
        LoginSmarTown login=new LoginSmarTown(webdriver);
        login.UserName().sendKeys("admin");
       // softAssert.assertEquals("admin", "admin");
        Thread.sleep(1000);
        login.password().sendKeys("admin123");
       // softAssert.assertEquals("admin", "Admin123");
        Thread.sleep(3000);
        login.Login().click();
        Thread.sleep(3000);
        
        
       

	}
	@Test(priority=1)
	public void TowerTestcases() throws InterruptedException
	{
		ConfigurationTower.Tower(webdriver);
	}
	@Test(priority=2)
    public void  UnitTestCases() throws InterruptedException
    {
    	ConfigurationUnit.Unit(webdriver);
    }
	@Test(priority=3)
	public void DocTypeTestCAses() throws InterruptedException
	{
		ConfigurationDocType.Doc(webdriver);
	}
	@Test(priority=4)
	public void IdentityType() throws InterruptedException 
	{
		ConfigurationIdentityType.Identity(webdriver);
	}
	@Test(priority=5)
	public void IdentityRelation() throws InterruptedException
	{
		ConfigurationIdentityRelation.IdentityRelation(webdriver);
	}
	@Test(priority=6)
	public void VehicleType() throws InterruptedException
	{
		ConfigurationVehicleType.VehicleType(webdriver);
	}
	@Test(priority=7)
	public void Identitycreate() throws InterruptedException, IOException
	{
		IdentityTestCases.Identity(webdriver);
	}
	/*@Test(priority=7)
	public void FinancialYear() throws InterruptedException
	{
		ConfigurationFinancialYear.Financial(webdriver);
	}
	@Test(priority=8)
	public void TaxMaster() throws InterruptedException
	{
		TaxMasterTestCases.TexMaster(webdriver);
	}
	@Test(priority=10)
	public void PayType() throws InterruptedException
	{
		PayTypeTestCases.Pay(webdriver);
	}
	@Test(priority=11)
	public void AccountGroup() throws InterruptedException
	{
		ConfiurationAccountGroup.AccountGroup(webdriver);
	}
	@Test(priority=12)
	public void Ledger() throws InterruptedException
	{
		ConfigurationLedgerTestCases.Ledger(webdriver);
	}*/
	
}

package AdminTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import SmarTown.Base1;
import SmarTownAdmin.ResidentsAccountObjects;

public class ResidentsAccountsTestCases extends Base1 {
	
	public static void Ressident(WebDriver webdriver) throws InterruptedException
	{
		webdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
		
		
		ResidentsAccountObjects rda=new ResidentsAccountObjects(webdriver);
		Thread.sleep(2000);
		rda.Resident().click();
		Thread.sleep(2000);
		rda.invoice().click();
		Thread.sleep(2000);
		rda.Validate().click();
		Thread.sleep(2000);
		rda.Popup().click();
		Thread.sleep(2000);
	/*	rda.Generate().click();
		Thread.sleep(40000);
		rda.Popup().click();*/
		Thread.sleep(5000);
		rda.InvoiceGeneration().click();
		Thread.sleep(2000);
		rda.Show().click();
		Thread.sleep(5000);
		rda.ValidateRegenerate().click();
		Thread.sleep(100000);
		rda.Popup().click();
		Thread.sleep(2000);
		rda.Authorize().click();
		Thread.sleep(2000);
		rda.Popup().click();
		Thread.sleep(10000);
		rda.Popup().click();
		Thread.sleep(2000);
		rda.Summary().click();
		Thread.sleep(30000);
		rda.History().click();
		Thread.sleep(2000);;
		rda.Show1().click();
		Thread.sleep(7000);
		rda.Proforma().click();
		Thread.sleep(2000);;
		Select s=new Select(webdriver.findElement(By.id("AccountHeadName")));
		s.selectByValue("1720");
		Thread.sleep(2000);
		rda.FixAmount().clear();
		Thread.sleep(2000);
		rda.FixAmount().sendKeys("5000");
		Thread.sleep(2000);
		rda.Date().click();
		Thread.sleep(2000);
		rda.SelectDate().click();
		Thread.sleep(2000);
		rda.Save().click();
		Thread.sleep(2000);
		rda.Popup().click();
		Thread.sleep(2000);
		Select Tower=new Select(webdriver.findElement(By.id("Tower")));
		Tower.selectByValue("16");
		Thread.sleep(2000);
		rda.Go().click();
	}

}

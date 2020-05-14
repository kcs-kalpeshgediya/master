package TaxMasterTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ConfigurationTaxMaster.AddRecordTaxMaster;
import ConfigurationTaxMaster.DeleteRecordTaxMaster;
import ConfigurationTaxMaster.SearchEditTaxMaster;


public class TaxMasterTestCases  {
	@Test
	public static void TexMaster(WebDriver webdriver) throws InterruptedException {
		
		AddRecordTaxMaster atm=new AddRecordTaxMaster(webdriver);
		Thread.sleep(2000);
		atm.Configuration().click();
		Thread.sleep(2000);
		atm.TaxMaster().click();
		Thread.sleep(2000);
		atm.ClickNew().click();
		Thread.sleep(2000);
		atm.Title().sendKeys("GST");
		Thread.sleep(2000);
		atm.Value().sendKeys("20");
		Thread.sleep(2000);
		
		Select s=new Select(webdriver.findElement(By.id("AccountHeadId")));
		s.selectByValue("1720");
		Thread.sleep(2000);
		/*atm.AccountHead().click();
		Thread.sleep(2000);
		atm.AccountHead().sendKeys(Keys.ARROW_DOWN);
		atm.AccountHead().sendKeys(Keys.ARROW_DOWN);
		atm.AccountHead().sendKeys(Keys.ARROW_DOWN);
		atm.AccountHead().sendKeys(Keys.ARROW_DOWN);
		atm.AccountHead().sendKeys(Keys.ENTER);
		Thread.sleep(2000);*/
		atm.Description().sendKeys("For Government Tex");
		Thread.sleep(2000);
		atm.save().click();
		Thread.sleep(2000);
		atm.Popup().click();
		
		SearchEditTaxMaster set=new SearchEditTaxMaster(webdriver);
		Thread.sleep(2000);
		set.Search().sendKeys("GST");
		Thread.sleep(2000);
		set.Edit().click();
		Thread.sleep(2000);
		set.Title().clear();
		Thread.sleep(2000);
		set.Title().sendKeys("Service Tex");
		Thread.sleep(2000);
		set.Value().clear();
		Thread.sleep(2000);
		set.Value().sendKeys("50");
		Thread.sleep(2000);
		set.AccountHead().click();
		set.AccountHead().sendKeys(Keys.ARROW_DOWN);
		set.AccountHead().sendKeys(Keys.ARROW_DOWN);
		set.AccountHead().sendKeys(Keys.ARROW_DOWN);
		set.AccountHead().sendKeys(Keys.ARROW_DOWN);
		set.AccountHead().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		set.Description().clear();
		Thread.sleep(2000);
		set.Description().sendKeys("This is the Service Tax");
		Thread.sleep(2000);
		set.save().click();
		Thread.sleep(2000);
		set.Popup().click();
		
		SearchEditTaxMaster setm=new SearchEditTaxMaster(webdriver);
		Thread.sleep(2000);
		setm.Search().sendKeys("Service");
		
		DeleteRecordTaxMaster dtm=new DeleteRecordTaxMaster(webdriver);
		Thread.sleep(4000);
		dtm.delete().click();
		Thread.sleep(2000);
		dtm.deleted().click();
		Thread.sleep(2000);
		dtm.Delete().click();
		
		SearchEditTaxMaster setms=new SearchEditTaxMaster(webdriver);
		Thread.sleep(2000);
		setms.Search().sendKeys("Service");

}
}
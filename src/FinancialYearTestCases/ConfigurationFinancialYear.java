package FinancialYearTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ConfigurationFinancialYear.AddRecordFinancialYear;
import ConfigurationFinancialYear.SearchEditRecordFinancialYear;


public class ConfigurationFinancialYear{
	@Test
	public static void Financial(WebDriver webdriver) throws InterruptedException {
		
		
		AddRecordFinancialYear Afr=new AddRecordFinancialYear(webdriver);
		Thread.sleep(2000);
		Afr.Configuration().click();
		Thread.sleep(2000);
		Afr.Financial().click();
		Thread.sleep(2000);
		Afr.ClickNew().click();
		Thread.sleep(2000);
		Afr.Title().sendKeys("2027-2028");
		Thread.sleep(2000);
		Afr.StartDate().click();
		Thread.sleep(2000);
		
		Select s=new Select(webdriver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		s.selectByValue("2027");
		
		Thread.sleep(2000);
		Afr.selectDate().click();
		Thread.sleep(2000);
		Afr.EndDate().click();
		Thread.sleep(2000);
		Afr.SelectEndDate().click();
		Thread.sleep(2000);
		Afr.DefultCheckBox().click();
		Thread.sleep(2000);
		Afr.save().click();
		Thread.sleep(2000);
		Afr.Popup().click();
		
		
		SearchEditRecordFinancialYear serf=new SearchEditRecordFinancialYear(webdriver);
		Thread.sleep(2000);
		serf.Search().sendKeys("2027-2028");
		Thread.sleep(2000);
		serf.Edit().click();
		Thread.sleep(2000);
		serf.Title().clear();
		Thread.sleep(2000);
		serf.Title().sendKeys("2028-2029");
		Thread.sleep(2000);
		serf.StartDate().clear();
		Thread.sleep(2000);
		serf.StartDate().click();
		Thread.sleep(2000);
		Select se=new Select(webdriver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		se.selectByValue("2029");
		
		Thread.sleep(2000);
		serf.selectDate().click();
		Thread.sleep(2000);
		serf.EndDate().clear();
		Thread.sleep(2000);
		serf.EndDate().click();
		Thread.sleep(2000);
		serf.SelectEndDate().click();
		Thread.sleep(2000);
		serf.save().click();
		Thread.sleep(2000);
		serf.Popup().click();
		
		SearchEditRecordFinancialYear ser=new SearchEditRecordFinancialYear(webdriver);
		Thread.sleep(2000);
		ser.Search().sendKeys("2028-2029");
}
}

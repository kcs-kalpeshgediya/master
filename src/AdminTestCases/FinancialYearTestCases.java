package AdminTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import SmarTownAdmin.FinancialYearObjects;


public class FinancialYearTestCases {
	
	@Test
	public static void Financial(WebDriver webdriver) throws InterruptedException {
		
		
		FinancialYearObjects fin=new FinancialYearObjects(webdriver);
		Thread.sleep(2000);
		fin.Configuration().click();
		Thread.sleep(2000);
		fin.Financial().click();
		Thread.sleep(2000);
		fin.ClickNew().click();
		Thread.sleep(2000);
		fin.Title().sendKeys("2027-2028");
		Thread.sleep(2000);
		fin.StartDate().click();
		Thread.sleep(2000);
		
		Select s=new Select(webdriver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		s.selectByValue("2027");
		
		Thread.sleep(2000);
		fin.selectDate().click();
		Thread.sleep(2000);
		fin.EndDate().click();
		Thread.sleep(2000);
		fin.SelectEndDate().click();
		Thread.sleep(2000);
		fin.DefultCheckBox().click();
		Thread.sleep(2000);
		fin.save().click();
		Thread.sleep(2000);
		fin.Popup().click();
		
		
	
		Thread.sleep(2000);
		fin.Search().sendKeys("2027-2028");
		Thread.sleep(2000);
		fin.Edit().click();
		Thread.sleep(2000);
		fin.Title().clear();
		Thread.sleep(2000);
		fin.Title().sendKeys("2028-2029");
		Thread.sleep(2000);
		fin.StartDate().clear();
		Thread.sleep(2000);
		fin.StartDate().click();
		Thread.sleep(2000);
		Select se=new Select(webdriver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		se.selectByValue("2029");
		
		Thread.sleep(2000);
		fin.selectDate().click();
		Thread.sleep(2000);
		fin.EndDate().clear();
		Thread.sleep(2000);
		fin.EndDate().click();
		Thread.sleep(2000);
		fin.SelectEndDate().click();
		Thread.sleep(2000);
		fin.save().click();
		Thread.sleep(2000);
		fin.Popup().click();
		
		
		Thread.sleep(2000);
		fin.Search().sendKeys("2028-2029");
	}
}

package PayTypeTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ConfigurationPayType.AddRecordPayType;
import ConfigurationPayType.SearchEditRecordPayType;


public class PayTypeTestCases {
	
	@Test
	public static void Pay(WebDriver webdriver) throws InterruptedException 
	{
		AddRecordPayType apt=new AddRecordPayType(webdriver);
		Thread.sleep(2000);
		apt.Configuration().click();
		Thread.sleep(2000);
		apt.PayType().click();
		Thread.sleep(2000);
		apt.ClickNew().click();
		apt.Name().sendKeys("Google Pay");
		Thread.sleep(2000);
		//apt.Type().click();
		//apt.Type().sendKeys(Keys.ARROW_DOWN);
		Select s=new Select(webdriver.findElement(By.id("ddlType")));
		s.selectByValue("Other");
		Thread.sleep(2000);
		apt.save().click();
		Thread.sleep(2000);
		apt.Popup().click();
		
		SearchEditRecordPayType sep=new SearchEditRecordPayType(webdriver);
		Thread.sleep(2000);
		sep.Search().sendKeys("Google Pay");
		Thread.sleep(2000);
		sep.Edit().click();
		Thread.sleep(2000);
		sep.Name().clear();
		Thread.sleep(2000);
		sep.Name().sendKeys("Amezone Pay");
		Thread.sleep(2000);
		sep.Type().click();
		sep.Type().sendKeys(Keys.ARROW_UP);
		sep.Type().sendKeys(Keys.ARROW_UP);
		Thread.sleep(2000);
		sep.save().click();
		Thread.sleep(2000);
		sep.Popup().click();
		
		SearchEditRecordPayType sept=new SearchEditRecordPayType(webdriver);
		Thread.sleep(2000);
		sept.Search().clear();
		sept.Search().sendKeys("Amezone Pay");
		
	}
	

}

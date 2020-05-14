package ConfigurationFinancialYear;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchEditRecordFinancialYear {
	
	WebDriver driver;
	@Test
	public SearchEditRecordFinancialYear(WebDriver driver)
	{
		this.driver=driver;
	}
    
	
	By Search=By.id("txtsearch");
	By Edit=By.xpath("//i[@class='ecubeicon-edit-1']");
	By Title=By.id("Title");
	By StartDate=By.id("StartDate");
	By selectDate=By.xpath("//a[contains(text(),'25')]");
	By EndDate=By.id("EndDate");
	By SelectEndDate=By.xpath("//a[contains(text(),'28')]");
	By save=By.xpath("//button[@id='btnSave']");
	By Popup=By.id("popup_ok");
	
	public WebElement Search()
	{
		return driver.findElement(Search);
	}
	public WebElement Edit()
	{
		return driver.findElement(Edit);
	}
	public WebElement Title()
	{
		return driver.findElement(Title);
	}
	public WebElement StartDate()
	{
		return driver.findElement(StartDate);
	}
	public WebElement selectDate()
	{
		return driver.findElement(selectDate);
	}
	public WebElement EndDate()
	{
		return driver.findElement(EndDate);
	}
	public WebElement SelectEndDate()
	{
		return driver.findElement(SelectEndDate);
	}
	public WebElement save()
	{
		return driver.findElement(save);
	}
	public WebElement Popup()
	{
		return driver.findElement(Popup);
	}

}

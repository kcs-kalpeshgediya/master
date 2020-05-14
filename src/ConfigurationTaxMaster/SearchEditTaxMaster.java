package ConfigurationTaxMaster;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchEditTaxMaster {
	WebDriver driver;
	@Test
	public SearchEditTaxMaster(WebDriver driver)
	{
		this.driver=driver;
	}
    
	
	By Search=By.id("txtsearch");
	By Edit=By.xpath("//i[@class='ecubeicon-edit-1']");
	By Title=By.id("Title");
	By Value=By.id("Value");
	By AccountHead=By.id("AccountHeadId");
	By Description=By.id("Description");
	By save=By.xpath("//button[@id='btnSave']");
	By Popup=By.xpath("//input[@id='popup_ok']");
	
	
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
	public WebElement Value()
	{
		return driver.findElement(Value);
	}
	public WebElement AccountHead()
	{
		return driver.findElement(AccountHead);
	}
	
	
	
	
	public WebElement Description()
	{
		return driver.findElement(Description);
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

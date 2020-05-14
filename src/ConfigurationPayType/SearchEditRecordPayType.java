package ConfigurationPayType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchEditRecordPayType {
	WebDriver driver;
	@Test
	public SearchEditRecordPayType(WebDriver driver)
	{
		this.driver=driver;
	}
    
	
	By Search=By.id("txtsearch");
	By Edit=By.xpath("//i[@class='ecubeicon-edit-1']");
	By Name=By.id("Name");
	By Type=By.id("ddlType");
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
	public WebElement Name()
	{
		return driver.findElement(Name);
	}
	public WebElement Type()
	{
		return driver.findElement(Type);
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

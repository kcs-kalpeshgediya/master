package PerferencesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LedgerObject {

	WebDriver driver;
	@Test
	public LedgerObject(WebDriver driver)
	{
		this.driver=driver;
	}
	By Configuration=By.linkText("Configuration");
	By Ledger=By.xpath("//span[text()='Ledger']");
	By ClickNew=By.xpath("//a[contains(text(),'New')]");
	By AccountHead=By.id("Name");
	By code=By.id("ShortName");
	By Billingno=By.id("MobileNo");
	By save=By.xpath("//button[text()='Save']");
	By popup=By.id("popup_ok");
	
	
    By Search=By.id("txtsearch");
	By Edit=By.xpath("//i[@class='ecubeicon-edit-1']");
		
	By delete=By.className("ecubeicon-garbage-2");
	By deleted=By.id("popup_ok");
	By Delete=By.xpath("//input[@id='popup_ok']");
	
	
	public WebElement Configuration()
	{
		return driver.findElement(Configuration);
	}
	public WebElement Ledger()
	{
		return driver.findElement(Ledger);
	}
	public WebElement ClickNew()
	{
		return driver.findElement(ClickNew);
	}
	public WebElement AccountHead()
	{
		return driver.findElement(AccountHead);
	}
	public WebElement code()
	{
		return driver.findElement(code);
	}
	public WebElement Billingno()
	{
		return driver.findElement(Billingno);
	}
	public WebElement save()
	{
		return driver.findElement(save);
	}
	public WebElement popup()
	{
		return driver.findElement(popup);
	}
	public WebElement Search()
	{
		return driver.findElement(Search);
	}
	public WebElement Edit()
	{
		return driver.findElement(Edit);
	}
	

	public WebElement delete()
	{
		return driver.findElement(delete);
	}
	public WebElement deleted()
	{
		return driver.findElement(deleted);
	}
	public WebElement Delete()
	{
		return driver.findElement(Delete);
	}


}

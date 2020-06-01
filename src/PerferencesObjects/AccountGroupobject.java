package PerferencesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AccountGroupobject {
	
	WebDriver driver;
	@Test
	public AccountGroupobject(WebDriver driver)
	{
		this.driver=driver;
	}
	By Configuration=By.linkText("Configuration");
	By AccountType=By.xpath("//span[text()='Account Group']");
	By CilckNew=By.xpath("//a[@class='btn']");
	By ParentAccount=By.id("ParentGroup");
	By AccountGroupcode=By.id("GroupCode");
	By AccountHeadgroup=By.id("Name");
	By Save=By.xpath("//button[text()='Save']");
	By Cancel=By.xpath("//button[@title='Cancel']");
	
	By Search=By.id("txtsearch");
	By Edit=By.xpath("//i[@class='ecubeicon-edit-1']");
	By Under=By.id("AccountHeadGroupId");
	By Popup=By.id("popup_ok");
	
	
	By delete=By.className("ecubeicon-garbage-2");
	By deleted=By.id("popup_ok");
	By Delete=By.xpath("//input[@id='popup_ok']");
	
	public WebElement Configuration()
	{
		return driver.findElement(Configuration);
	}
	public WebElement AccountType()
	{
		return driver.findElement(AccountType);
	}
	public WebElement ParentAccount()
	{
		return driver.findElement(ParentAccount);
	}
	public WebElement CilckNew()
	{
		return driver.findElement(CilckNew);
	}
	public WebElement AccountGroupcode()
	{
		return driver.findElement(AccountGroupcode);
	}
	public WebElement AccountHeadgroup()
	{
		return driver.findElement(AccountHeadgroup);
	}
	public WebElement Save()
	{
		return driver.findElement(Save);
	}
	public WebElement Cancel()
	{
		return driver.findElement(Cancel);
	}
	public WebElement Search()
	{
		return driver.findElement(Search);
	}
	public WebElement Edit()
	{
		return driver.findElement(Edit);
	}
		public WebElement Under()
	{
		return driver.findElement(Under);
	}
	public WebElement Popup()
	{
		return driver.findElement(Popup);
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

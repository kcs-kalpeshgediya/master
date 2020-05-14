package ConfigurationAccountGroup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchEditRecordAccountGroup {

	WebDriver driver;
	@Test
	public SearchEditRecordAccountGroup(WebDriver driver)
	{
		this.driver=driver;
	}
    
	
	By Search=By.id("txtsearch");
	By Edit=By.xpath("//i[@class='ecubeicon-edit-1']");
	By ParentAccount=By.id("ParentGroup");
	By Under=By.id("AccountHeadGroupId");
	By AccountGroupcode=By.id("GroupCode");
	By AccountHeadgroup=By.id("Name");
	By Save=By.xpath("//button[text()='Save']");
	By Popup=By.id("popup_ok");
	
	
	
	
	public WebElement Search()
	{
		return driver.findElement(Search);
	}
	public WebElement Edit()
	{
		return driver.findElement(Edit);
	}
	public WebElement ParentAccount()
	{
		return driver.findElement(ParentAccount);
	}
	public WebElement Under()
	{
		return driver.findElement(Under);
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
	public WebElement Popup()
	{
		return driver.findElement(Popup);
	}

}

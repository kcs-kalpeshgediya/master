package ConfigurationAccountGroup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddRecordAccountGroup {
	WebDriver driver;
	@Test
	public AddRecordAccountGroup(WebDriver driver)
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
	

}

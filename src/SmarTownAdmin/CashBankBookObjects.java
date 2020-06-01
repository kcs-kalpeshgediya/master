package SmarTownAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CashBankBookObjects {
	WebDriver driver;
	@Test
	public CashBankBookObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	By Admin=By.xpath("//a[text()='Admin']");
	By CashBankBook=By.xpath("//span[contains(text(),'Cash')]");
	By AccountHead=By.id("AccountHead");
	By Generate=By.id("btnSave");
	
	public WebElement Admin()
	{
		return driver.findElement(Admin);
	}
	public WebElement CashBankBook()
	{
		return driver.findElement(CashBankBook);
	}
	public WebElement AccountHead()
	{
		return driver.findElement(AccountHead);
	}
	public WebElement Generate()
	{
		return driver.findElement(Generate);
	}
}

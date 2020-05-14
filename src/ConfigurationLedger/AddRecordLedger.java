package ConfigurationLedger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddRecordLedger {
	
	WebDriver driver;
	@Test
	public AddRecordLedger(WebDriver driver)
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

	
	
}

package ConfigurationLedger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchEditRecordLedger {
	WebDriver driver;
	@Test
	public SearchEditRecordLedger(WebDriver driver)
	{
		this.driver=driver;
	}
    By Search=By.id("txtsearch");
	By Edit=By.xpath("//i[@class='ecubeicon-edit-1']");
	By AccountHead=By.id("Name");
	By code=By.id("ShortName");
	By Billingno=By.id("MobileNo");
	By save=By.xpath("//button[text()='Save']");
	By popup=By.id("popup_ok");
	
	public WebElement Search()
	{
		return driver.findElement(Search);
	}
	public WebElement Edit()
	{
		return driver.findElement(Edit);
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

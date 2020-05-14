package ConfigurationPayType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddRecordPayType {
	WebDriver driver;
	@Test
	public AddRecordPayType(WebDriver driver)
	{
		this.driver=driver;
	}
	By Configuration=By.linkText("Configuration");
	By PayType=By.xpath("//span[text()='Pay Type']");
	By ClickNew=By.xpath("//a[contains(text(),'New')]");
	By Name=By.id("Name");
	//By Type=By.id("ddlType");
	By save=By.xpath("//button[@id='btnSave']");
	By Popup=By.xpath("//input[@id='popup_ok']");
	
	public WebElement Configuration()
	{
		return driver.findElement(Configuration);
	}
	public WebElement PayType()
	{
		return driver.findElement(PayType);
	}
	public WebElement ClickNew()
	{
		return driver.findElement(ClickNew);
	}
	public WebElement Name()
	{
		return driver.findElement(Name);
	}
	/*public WebElement Type()
	{
		return driver.findElement(Type);
	}*/
	public WebElement save()
	{
		return driver.findElement(save);
	}
	public WebElement Popup()
	{
		return driver.findElement(Popup);
	}
}

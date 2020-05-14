package ConfigurationTaxMaster;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddRecordTaxMaster {
	WebDriver driver;
	@Test
	public AddRecordTaxMaster(WebDriver driver)
	{
		this.driver=driver;
	}
	By Configuration=By.linkText("Configuration");
	By TaxMaster=By.xpath("//span[text()='Tax Master']");
	By ClickNew=By.xpath("//a[@class='btn']");
	
	By Title=By.id("Title");
	By Value=By.id("Value");
	//By AccountHead=By.id("AccountHeadId");
	By Description=By.id("Description");
	By save=By.xpath("//button[@id='btnSave']");
	By Popup=By.xpath("//input[@id='popup_ok']");
	
	public WebElement Configuration()
	{
		return driver.findElement(Configuration);
	}
	public WebElement TaxMaster()
	{
		return driver.findElement(TaxMaster);
	}
	public WebElement ClickNew()
	{
		return driver.findElement(ClickNew);
	}
	public WebElement Title()
	{
		return driver.findElement(Title);
	}
	public WebElement Value()
	{
		return driver.findElement(Value);
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

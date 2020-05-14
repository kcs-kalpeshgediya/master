package ConfigurationDocType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EditRecordDocType {
	
	WebDriver driver;
	@Test
	public EditRecordDocType(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Edit=By.xpath("//i[@class='ecubeicon-edit-1']");
	By Documentname=By.xpath("//input[@id='DocumentName']");
	By save=By.xpath("//button[@id='btnSave']");
	By Popup=By.id("popup_ok");
	
	public WebElement Edit()
	{
		return driver.findElement(Edit);
	}
	public WebElement Documentname()
	{
		return driver.findElement(Documentname);
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

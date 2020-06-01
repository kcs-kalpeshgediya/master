package SmarTownAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class InvoiceRulesObjects {
	
	WebDriver driver;
	@Test
	public InvoiceRulesObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Configuration=By.linkText("Configuration");
	By Invoice=By.xpath("//span[contains(text(),'Invoice Rules')]");
	By New=By.linkText("New");
	By Title=By.id("Title");
	By Select=By.className("caret");
	By SelectAll=By.xpath("//label[contains(text(),'Select all')]");
	By Click=By.xpath("//div[@class='formblock']");
	By StartSqft=By.id("StartSqft");
	By EndSqft=By.id("EndSqft");
	By Amount=By.id("Amount");
	By Save=By.xpath("//div[@class='input-group']//button[@class='btn'][contains(text(),'Save')]");
	By Popup=By.id("popup_ok");
	
	
	public WebElement Configuration()
	{
		return driver.findElement(Configuration);
	}
	public WebElement Invoice()
	{
		return driver.findElement(Invoice);
	}
	public WebElement New()
	{
		return driver.findElement(New);
	}
	public WebElement Title()
	{
		return driver.findElement(Title);
	}
	public WebElement Select()
	{
		return driver.findElement(Select);
	}
	public WebElement SelectAll()
	{
		return driver.findElement(SelectAll);
	}
	public WebElement Click()
	{
		return driver.findElement(Click);
	}
	public WebElement StartSqft()
	{
		return driver.findElement(StartSqft);
	}
	public WebElement EndSqft()
	{
		return driver.findElement(EndSqft);
	}
	public WebElement Amount()
	{
		return driver.findElement(Amount);
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

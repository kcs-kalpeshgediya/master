package SmarTownAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ResidentsAccountObjects {
	WebDriver driver;
	@Test
	public ResidentsAccountObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Resident=By.linkText("Residents Accounts");
	By invoice=By.xpath("//span[contains(text(),'Invoice Validation')]");
	By Validate=By.id("btnSave");
	By Popup=By.id("popup_ok");
	By Generate=By.id("btngenerate");
	By InvoiceGeneration=By.xpath("//span[contains(text(),'Invoice Generation')]");
	By Show=By.id("btnShow");
	By ValidateRegenerate=By.id("btnRegenerate");
	By Authorize=By.id("btnauthorizeall");
	By Summary=By.xpath("//span[contains(text(),'Invoice Summary')]");
	By History=By.xpath("//span[contains(text(),'Invoice History')]");
	By Show1=By.id("btnSave");
	By Proforma=By.xpath("//span[contains(text(),'Proforma Invoice')]");
	By FixAmount=By.id("FixAmount");
	By Date=By.id("InvoiceDate");
	By SelectDate=By.linkText("28");
	By Save=By.id("btnSave");
	By Go=By.id("Go");
	
	public WebElement Resident()
	{
		return driver.findElement(Resident);
	}
	public WebElement invoice()
	{
		return driver.findElement(invoice);
	}
	public WebElement Validate()
	{
		return driver.findElement(Validate);
	}
	public WebElement Popup()
	{
		return driver.findElement(Popup);
	}
	public WebElement Generate()
	{
		return driver.findElement(Generate);
	}
	public WebElement InvoiceGeneration()
	{
		return driver.findElement(InvoiceGeneration);
	}
	public WebElement Show()
	{
		return driver.findElement(Show);
	}
	public WebElement ValidateRegenerate()
	{
		return driver.findElement(ValidateRegenerate);
	}
	public WebElement Authorize()
	{
		return driver.findElement(Authorize);
	}
	public WebElement Summary()
	{
		return driver.findElement(Summary);
	}
	public WebElement History()
	{
		return driver.findElement(History);
	}
	public WebElement Show1()
	{
		return driver.findElement(Show1);
	}
	public WebElement Proforma()
	{
		return driver.findElement(Proforma);
	}
	public WebElement FixAmount()
	{
		return driver.findElement(FixAmount);
	}
	public WebElement Date()
	{
		return driver.findElement(Date);
	}
	public WebElement SelectDate()
	{
		return driver.findElement(SelectDate);
	}
	public WebElement Save()
	{
		return driver.findElement(Save);
	}
	public WebElement Go()
	{
		return driver.findElement(Go);
	}
}

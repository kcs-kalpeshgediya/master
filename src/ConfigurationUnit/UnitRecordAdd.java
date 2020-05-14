package ConfigurationUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UnitRecordAdd {
	
	WebDriver driver;
	@Test
	public UnitRecordAdd(WebDriver driver)
	{
		this.driver=driver;
		
	}
	By Configuration=By.linkText("Configuration");
	By Unit=By.xpath("//span[contains(text(),'Unit')]");
	By ClickNew=By.xpath("//a[@class='btn']");

	By UnitNumber=By.id("UnitNo");
	
	By Floor=By.xpath("//select[@id='Floor']");
	
	By IntercomNo=By.id("IntercomNo");
	// WebElement source=driver.findElement(By.xpath("Floor"));
	By BuildArea=By.id("Area");
	By CarpetArea=By.id("CarpetArea");
	By Manipulation=By.id("ManipulationFactor");
	By CheckBox=By.xpath("//div[8]//div[1]//input[1]");
	By Save=By.className("btn");
	By Popup=By.id("popup_ok");
	
	
	
	
	public WebElement Configuration()
	{
		return driver.findElement(Configuration);
	}
	public WebElement Unit()
	{
		return driver.findElement(Unit);
	}
	public WebElement ClickNew()
	{
		return driver.findElement(ClickNew);
	}
	public WebElement UnitNumber()
	{
		return driver.findElement(UnitNumber);
	}
	public WebElement Floor()
	{
		return driver.findElement(Floor);
	}
	
	
	
	
	
	
	
	public WebElement IntercomNo()
	{
		return driver.findElement(IntercomNo);
	}
	public WebElement BuildArea()
	{
		return driver.findElement(BuildArea);
	}
	public WebElement CarpetArea()
	{
		return driver.findElement(CarpetArea);
	}
	public WebElement Manipulation()
	{
		return driver.findElement(Manipulation);
	}
	public WebElement CheckBox()
	{
		return driver.findElement(CheckBox);
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

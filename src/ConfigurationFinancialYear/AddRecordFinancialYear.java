package ConfigurationFinancialYear;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddRecordFinancialYear {
	WebDriver driver;
	@Test
	public AddRecordFinancialYear(WebDriver driver)
	{
		this.driver=driver;
	}
	By Configuration=By.linkText("Configuration");
	By Financial=By.xpath("//span[text()='Financial Year']");
	By ClickNew=By.xpath("//a[@class='btn']");
	By Title=By.id("Title");
	By StartDate=By.id("StartDate");
	By selectDate=By.xpath("//a[contains(text(),'23')]");
	By EndDate=By.id("EndDate");
	By SelectEndDate=By.xpath("//a[contains(text(),'29')]");//a[contains(text(),'29')]
	By DefultCheckBox=By.xpath("//input[@tabindex='5']");
	By save=By.xpath("//button[@id='btnSave']");
	By Popup=By.id("popup_ok");
	public WebElement Configuration()
	{
		return driver.findElement(Configuration);
	}
	public WebElement Financial()
	{
		return driver.findElement(Financial);
	}
	public WebElement ClickNew()
	{
		return driver.findElement(ClickNew);
	}
	public WebElement Title()
	{
		return driver.findElement(Title);
	}
	public WebElement StartDate()
	{
		return driver.findElement(StartDate);
	}
	public WebElement selectDate()
	{
		return driver.findElement(selectDate);
	}
	public WebElement EndDate()
	{
		return driver.findElement(EndDate);
	}
	public WebElement SelectEndDate()
	{
		return driver.findElement(SelectEndDate);
	}
	public WebElement DefultCheckBox()
	{
		return driver.findElement(DefultCheckBox);
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

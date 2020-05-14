package ConfigurationVehicleType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class AddRecordVehicleType {
	
	WebDriver driver;
	@Test
	public AddRecordVehicleType(WebDriver driver)
	{
		this.driver=driver;
	}
	By Configuration=By.linkText("Configuration");
	By VehicleType=By.xpath("//span[text()='Vehicle Type']");
	By New=By.xpath("//a[@class='btn']");
	By Vehicle=By.id("VehicleTypeName");
	By Description=By.id("Description");
	By save=By.xpath("//button[@tabindex='4']");
	By popup=By.id("popup_ok");
	
	
	public WebElement Configuration()
	{
		return driver.findElement(Configuration);
	}
	public WebElement VehicleType()
	{
		return driver.findElement(VehicleType);
	}
	public WebElement New()
	{
		return driver.findElement(New);
	}
	public WebElement Vehicle()
	{
		return driver.findElement(Vehicle);
	}
	public WebElement Description()
	{
		return driver.findElement(Description);
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

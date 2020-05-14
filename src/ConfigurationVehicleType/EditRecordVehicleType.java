package ConfigurationVehicleType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EditRecordVehicleType {

	
	WebDriver driver;
	@Test
	public EditRecordVehicleType(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Edit=By.xpath("//i[@class='ecubeicon-edit-1']");
	By Vehicle=By.id("VehicleTypeName");
	By Description=By.id("Description");
	By save=By.xpath("//button[@tabindex='4']");
	By popup=By.id("popup_ok");
	
	public WebElement Edit()
	{
		return driver.findElement(Edit);
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

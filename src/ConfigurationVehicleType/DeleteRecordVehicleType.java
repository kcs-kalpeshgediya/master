package ConfigurationVehicleType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteRecordVehicleType {
WebDriver driver;
	
	public DeleteRecordVehicleType(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By delete=By.className("ecubeicon-garbage-2");
	By deleted=By.id("popup_ok");
	By Delete=By.cssSelector("input#popup_ok");
	
	
	public WebElement delete()
	{
		return driver.findElement(delete);
	}
	public WebElement deleted()
	{
		return driver.findElement(deleted);
	}
	public WebElement Delete()
	{
		return driver.findElement(Delete);
	}




}

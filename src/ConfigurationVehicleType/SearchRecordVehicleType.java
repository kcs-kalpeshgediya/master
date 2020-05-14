package ConfigurationVehicleType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchRecordVehicleType {
	WebDriver driver;
	@Test
	public SearchRecordVehicleType(WebDriver driver)
	{
		this.driver=driver;
	}
    
	
	By Search=By.id("txtsearch");
	
	public WebElement Search()
	{
		return driver.findElement(Search);
	}

}

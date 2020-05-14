package ConfigurationUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchRecordUnit {
	WebDriver driver;
	@Test
	public SearchRecordUnit(WebDriver driver)
	{
		this.driver=driver;
	}
    
	
	By Search=By.id("txtsearch");
	
	public WebElement Search()
	{
		return driver.findElement(Search);
	}


}

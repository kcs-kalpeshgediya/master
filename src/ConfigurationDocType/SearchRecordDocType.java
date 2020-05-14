package ConfigurationDocType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchRecordDocType {
	
	WebDriver driver;
	@Test
	public SearchRecordDocType(WebDriver driver)
	{
		this.driver=driver;
	}
    
	
	By Search=By.id("txtsearch");
	
	public WebElement Search()
	{
		return driver.findElement(Search);
	}

}

package ConfigurationIdentityType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchIdentityType {
	
	WebDriver driver;
	@Test
	public SearchIdentityType(WebDriver driver)
	{
		this.driver=driver;
	}
	By Configuration=By.linkText("Configuration");
    By IdentityType=By.xpath("//span[text()='Identity Type']");  
	By Search=By.id("txtsearch");
      
	public WebElement Configuration()
	{
		return driver.findElement(Configuration);
	}
	public WebElement IdentityType()
	{
		return driver.findElement(IdentityType);
	}
	public WebElement Search()
	{
		return driver.findElement(Search);
	}
	
	

}

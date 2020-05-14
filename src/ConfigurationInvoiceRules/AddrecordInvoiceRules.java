package ConfigurationInvoiceRules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddrecordInvoiceRules 
{
	WebDriver driver;
	@Test
	public AddrecordInvoiceRules(WebDriver driver)
	{
		this.driver=driver;
	}
	By Configuration=By.linkText("Configuration");
	By Invoice=By.xpath("//span[text()='Invoice Rules']");
	By save=By.xpath("//button[text()='Save']");
	By popup=By.id("popup_ok");
	
	public WebElement Configuration()
	{
		return driver.findElement(Configuration);
	}
}

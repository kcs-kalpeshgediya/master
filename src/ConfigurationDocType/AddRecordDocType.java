package ConfigurationDocType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddRecordDocType {
	
		WebDriver driver;
		@Test
		public AddRecordDocType(WebDriver driver)
		{
			this.driver=driver;
		}
		By Configuration=By.linkText("Configuration");
		By DocType=By.xpath("//span[contains(text(),'Doc Type')]");
		By ClickNew=By.xpath("//a[@class='btn']");
		By Documentname=By.xpath("//input[@id='DocumentName']");
		By save=By.xpath("//button[@id='btnSave']");
		By Popup=By.id("popup_ok");
		public WebElement Configuration()
		{
			return driver.findElement(Configuration);
		}
		public WebElement DocType()
		{
			return driver.findElement(DocType);
		}
		public WebElement ClickNew()
		{
			return driver.findElement(ClickNew);
		}
		public WebElement Documentname()
		{
			return driver.findElement(Documentname);
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

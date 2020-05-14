package Configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ConfigurationTowerMethods {
	
		WebDriver driver;
		@Test
		public ConfigurationTowerMethods(WebDriver driver)
		{
			this.driver=driver;
		}
		By Configuration=By.linkText("Configuration");
		By Tower=By.xpath("//span[text()='Tower']");
		By New=By.xpath("//a[@class='btn']");
		By TowerName=By.id("TowerName");
		By Initial=By.id("Initial");
		By  Floors=By.id("NoOfFloor");
		By save=By.id("btnSave");
		By popup=By.id("popup_ok");
		
	   
		
		
		
		
		
		
		public WebElement Configuration()
		{
			return driver.findElement(Configuration);
		}
		public WebElement Tower()
		{
			return driver.findElement(Tower);
		}
		public WebElement New()
		{
			return driver.findElement(New);
		}
		
		public WebElement TowerName()
		{
			return driver.findElement(TowerName);
		}
		public WebElement Initial()
		{
			return driver.findElement(Initial);
		}
		public WebElement Floors()
		{
			return driver.findElement(Floors);
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



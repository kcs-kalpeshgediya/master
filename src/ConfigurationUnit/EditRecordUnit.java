package ConfigurationUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EditRecordUnit {
	
		WebDriver driver;
		@Test
		public EditRecordUnit(WebDriver driver)
		{
			this.driver=driver;
		}
		
		By Edit=By.xpath("//i[@class='ecubeicon-edit-1']");
		
		
		By Tower=By.id("Tower");
		
		By UnitNumber=By.id("UnitNo");
		
		By Floor=By.xpath("//select[@id='Floor']");
		
		By IntercomNo=By.id("IntercomNo");
		// WebElement source=driver.findElement(By.xpath("Floor"));
		By BuildArea=By.id("Area");
		By CarpetArea=By.id("CarpetArea");
		By Manipulation=By.id("ManipulationFactor");
		By CheckBox=By.xpath("//div[8]//div[1]//input[1]");
		By Save=By.className("btn");
		By Popup=By.id("popup_ok");
		

		public WebElement Edit()
		{
			return driver.findElement(Edit);
		}
		public WebElement Tower()
		{
			return driver.findElement(Tower);
		}
		public WebElement UnitNumber()
		{
			return driver.findElement(UnitNumber);
		}
		public WebElement Floor()
		{
			return driver.findElement(Floor);
		}
		public WebElement IntercomNo()
		{
			return driver.findElement(IntercomNo);
		}
		public WebElement BuildArea()
		{
			return driver.findElement(BuildArea);
		}
		public WebElement CarpetArea()
		{
			return driver.findElement(CarpetArea);
		}
		public WebElement Manipulation()
		{
			return driver.findElement(Manipulation);
		}
		public WebElement CheckBox()
		{
			return driver.findElement(CheckBox);
		}
		public WebElement Save()
		{
			return driver.findElement(Save);
		}
		public WebElement Popup()
		{
			return driver.findElement(Popup);
		}
		

}

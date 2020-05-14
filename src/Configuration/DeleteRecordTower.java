package Configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteRecordTower {
	 
	WebDriver driver;
		@Test
		public DeleteRecordTower(WebDriver driver)
		{
			this.driver=driver;
		}
	
	By Delete1=By.className("ecubeicon-garbage-2");
	By Delete2=By.id("popup_ok");
	By Delete3=By.id("popup_ok");
	//By Delete3=By.xpath("//input[@id='popup_ok']");
	
	
	public WebElement Delete1()
	{
		return driver.findElement(Delete1);
	}
	public WebElement Delete2()
	{
		return driver.findElement(Delete2);
	}
	public WebElement Delete3()
	{
		return driver.findElement(Delete3);
	}


}

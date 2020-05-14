package Configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchEditRecordTower {
	WebDriver driver;
	@Test
	public SearchEditRecordTower(WebDriver driver)
	{
		this.driver=driver;
	}

	
	
	    By Search=By.id("txtsearch");
	    
	    By Edit=By.xpath("//i[@class='ecubeicon-edit-1']");
		By Towernames=By.id("TowerName");
		By Initials=By.id("Initial");
		By TowerFloors=By.id("NoOfFloor");
		By saves=By.id("btnSave");
		//By popuped=By.xpath("//input[@id='popup_ok']");
		By popup=By.id("popup_ok");
		
		public WebElement Search()
		{
			return driver.findElement(Search);
		}
		public WebElement Edit()
		{
			return driver.findElement(Edit);
		}
		public WebElement Towernames()
		{
			return driver.findElement(Towernames);
		}
		public WebElement Initials()
		{
			return driver.findElement(Initials);
		}
		public WebElement TowerFloors()
		{
			return driver.findElement(TowerFloors);
		}
		public WebElement saves()
		{
			return driver.findElement(saves);
		}
		public WebElement popup()
		{
			return driver.findElement(popup);
		}
		
}

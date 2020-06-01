package PerferencesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class AllotMentZoneObject {
	
	WebDriver driver;
	
	@Test
	public AllotMentZoneObject(WebDriver driver)
	{
		this.driver=driver;
	}
   By Preferences=By.xpath("//a[text()='Preferences']");
   By Allotmentzone=By.xpath("//span[text()='Allotment Zone']");
   By New=By.xpath("//a[@class='btn']");
   By Zonename=By.id("ZoneName");
   By Save=By.id("btnSave");
   By Popup=By.id("popup_ok");
   By Search=By.id("txtsearch");
   By Edit=By.xpath("//i[@class='ecubeicon-edit-1']");
   By Delete=By.xpath("//i[@class='ecubeicon-garbage-2']");
   By Delete1=By.id("popup_ok");
   By Delete2=By.id("popup_ok");
   
   
   
   
   public WebElement Preferences()
   {
	   return driver.findElement(Preferences);
   }
   public WebElement Allotmentzone()
   {
	   return driver.findElement(Allotmentzone);
   }
   public WebElement New()
   {
	   return driver.findElement(New);
   }
   public WebElement Zonename()
   {
	   return driver.findElement(Zonename);
   }
   public WebElement Save()
   {
	   return driver.findElement(Save);
   }
   public WebElement Popup()
   {
	   return driver.findElement(Popup);
   }
   public WebElement Search()
   {
	   return driver.findElement(Search);
   }
   public WebElement Edit()
   {
	   return driver.findElement(Edit);
   }
   public WebElement Delete()
   {
	   return driver.findElement(Delete);
   }
   public WebElement Delete1()
   {
	   return driver.findElement(Delete1);
   }
   public WebElement Delete2()
   {
	   return driver.findElement(Delete2);
   }
	
	
	
	
}

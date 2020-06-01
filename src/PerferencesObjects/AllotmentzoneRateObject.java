package PerferencesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AllotmentzoneRateObject {
	
	WebDriver driver;
	  @Test
	  public AllotmentzoneRateObject(WebDriver driver) 
	  {
		  this.driver=driver;
	  }
	  By Preferences=By.xpath("//a[text()='Preferences']");
	  By Alltotmentrate=By.xpath("//span[text()='Allotment Rate']");
	  By New=By.xpath("//a[@class='btn']");
	  By Type=By.id("Type");
	  By Rate=By.id("Rate");
	  By Save=By.id("btnSave");
	  By Popup=By.id("popup_ok");
	  By Search=By.id("txtsearch");
	  By Edit=By.xpath("//i[@class='ecubeicon-edit-1']");
	  By Delete=By.xpath("//i[@class='ecubeicon-garbage-2']");
	  By Delete1=By.id("popup_ok");
	 
	  
	  public WebElement Preferences()
		{
			return driver.findElement(Preferences);
		}
		public WebElement Alltotmentrate()
		{
			return driver.findElement(Alltotmentrate);
		}
		public WebElement New()
		{
			return driver.findElement(New);
		}
		public WebElement Type()
		{
			return driver.findElement(Type);
		}
		public WebElement Rate()
		{
			return driver.findElement(Rate);
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
	   
}

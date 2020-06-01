package PerferencesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ServiceRequestVehicleObject {
	 WebDriver driver;
	  @Test
	  public ServiceRequestVehicleObject(WebDriver driver) 
	  {
		  this.driver=driver;
	  }
	  By ServiceRequest=By.xpath("//a[text()='Service Request']");
	  
	 //By Vehicle1=By.xpath("//li[@class='active']//span[contains(text(),'Vehicle')]");
	 By Vehicle1=By.xpath("/html[1]/body[1]/my-app[1]/div[1]/div[1]/innerheader[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[7]/div[1]/ul[1]/li[2]/a[1]/span[1]");
	 // By Vehicle1=By.xpath("//li[@class='active']//i[@class='flaticon-car-and-garage']");
	  
	  By New=By.xpath("//a[contains(text(),'New')]");
	  By MemberSearch=By.id("txtMemberSearch");
	  By VehicleNo=By.id("txtVehicleNo");
	  By VehicleType=By.id("ddlVehicleType");
	  By VehicleName=By.id("txtVehicleName");
	  By VehicleUser=By.id("ddlVehicleUser");
	  By Allotmentrate=By.id("ddlAllotmentRate");
	  By Save=By.id("btnVehicleSave");
	  By Popup=By.id("popup_ok");
	  By Cacle=By.id("btnVehicleClear");
	  By Reset=By.id("btnReset");
	  By Search=By.id("txtsearch");
	  By Edit=By.xpath("//i[@class='ecubeicon-edit-1']");
	  By delete=By.xpath("//i[@class='ecubeicon-garbage-2']");
	  By delete1=By.id("popup_ok");
	  By delete2=By.id("popup_ok");
	  
	  public WebElement ServiceRequest()
	  {
		  return driver.findElement(ServiceRequest);
	  }
	  public WebElement Vehicle1()
	  {
		  return driver.findElement(Vehicle1);
	  }
	  public WebElement New()
	  {
		  return driver.findElement(New);
	  }
	  public WebElement MemberSearch()
	  {
		  return driver.findElement(MemberSearch);
	  }
	  public WebElement VehicleNo()
	  {
		  return driver.findElement(VehicleNo);
	  }
	  public WebElement VehicleType()
	  {
		  return driver.findElement(VehicleType);
	  }
	  public WebElement VehicleName()
	  {
		  return driver.findElement(VehicleName);
	  }
	  public WebElement VehicleUser()
	  {
		  return driver.findElement(VehicleUser);
	  }
	  public WebElement Allotmentrate()
	  {
		  return driver.findElement(Allotmentrate);
	  }
	  public WebElement Save()
	  {
		  return driver.findElement(Save);
	  }
	  public WebElement Popup()
	  {
		  return driver.findElement(Popup);
	  }
	  public WebElement Cacle()
	  {
		  return driver.findElement(Cacle);
	  }
	  public WebElement Reset()
	  {
		  return driver.findElement(Reset);
	  }
	  public WebElement Search()
	  {
		  return driver.findElement(Search);
	  }
	  public WebElement Edit()
	  {
		  return driver.findElement(Edit);
	  }
	  public WebElement delete()
	  {
		  return driver.findElement(delete);
	  }
	  public WebElement delete1()
	  {
		  return driver.findElement(delete1);
	  }
	  public WebElement delete2()
	  {
		  return driver.findElement(delete2);
	  }
}

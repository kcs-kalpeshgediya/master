package SmarTownAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PasswordObjects {
	
  WebDriver driver;
  @Test
  public PasswordObjects(WebDriver driver) 
  {
	  this.driver=driver;
  }
	By ServiceRequest=By.xpath("//a[text()='Service Request']");
	By Password=By.xpath("//span[text()='Password']");
	By Searchmember=By.id("txtSearchMember");
	By Newpassword=By.id("txtNewPassword");
	By Confirmpassword=By.id("txtConfirmPassword");
	By Save=By.id("btnsave");
	By Save1=By.id("popup_ok");
	
	
	 
	public WebElement ServiceRequest()
	{
		return driver.findElement(ServiceRequest);
	}
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	public WebElement Searchmember()
	{
		return driver.findElement(Searchmember);
	}
	public WebElement Newpassword()
	{
		return driver.findElement(Newpassword);
	}
	public WebElement Confirmpassword()
	{
		return driver.findElement(Confirmpassword);
	}
	public WebElement Save()
	{
		return driver.findElement(Save);
	}
	public WebElement Save1()
	{
		return driver.findElement(Save1);
	}

}

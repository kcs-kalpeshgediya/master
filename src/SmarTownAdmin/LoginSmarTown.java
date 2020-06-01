package SmarTownAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;




public class LoginSmarTown {
	
	WebDriver driver;
	@Test
	public LoginSmarTown(WebDriver driver)
	{
		this.driver=driver;

     }
	
	By UserName=By.id("txtUserName");
	By password=By.id("txtPwd");
	By Login=By.id("btnSave");
	
	public WebElement UserName()
	{
		return driver.findElement(UserName);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement Login()
	{
		return driver.findElement(Login);
	}

}

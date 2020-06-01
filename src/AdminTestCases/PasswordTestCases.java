package AdminTestCases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import SmarTown.Base1;
import SmarTownAdmin.PasswordObjects;

public class PasswordTestCases extends Base1 {

	@Test
	public void Password() throws InterruptedException
	{
		PasswordObjects pas=new PasswordObjects(webdriver);
		Thread.sleep(3000);
		pas.ServiceRequest().click();
		Thread.sleep(3000);
		pas.Password().click();
		Thread.sleep(3000);
		pas.Searchmember().sendKeys("Kalpesh");
		Thread.sleep(3000);
		pas.Searchmember().sendKeys(Keys.ARROW_DOWN);
		pas.Searchmember().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		pas.Searchmember().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		pas.Newpassword().sendKeys("kalpesh@123");
		Thread.sleep(3000);
		pas.Confirmpassword().sendKeys("kalpesh@123");
		Thread.sleep(3000);
		
		pas.Save().click();
		Thread.sleep(3000);
		pas.Save1().click();
	}
}

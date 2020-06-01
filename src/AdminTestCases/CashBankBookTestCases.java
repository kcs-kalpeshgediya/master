package AdminTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import SmarTownAdmin.CashBankBookObjects;

public class CashBankBookTestCases {
	@Test
	public static void CashBankBook(WebDriver webdriver) throws InterruptedException
	{
		CashBankBookObjects cbo=new CashBankBookObjects(webdriver);
		Thread.sleep(3000);
		cbo.Admin().click();
		Thread.sleep(3000);
		cbo.CashBankBook().click();
		Thread.sleep(3000);
		
		//Select s=new Select(webdriver.findElement(By.id("AccountHead")));
		//s.deselectByValue("1421");
		/*cbo.AccountHead().click();
		Thread.sleep(3000);
	    cbo.AccountHead().sendKeys(Keys.ARROW_DOWN);
		cbo.AccountHead().sendKeys(Keys.ARROW_DOWN);
		cbo.AccountHead().sendKeys(Keys.ARROW_DOWN);
		cbo.AccountHead().sendKeys(Keys.ARROW_DOWN);
		cbo.AccountHead().sendKeys(Keys.ARROW_DOWN);
		cbo.AccountHead().sendKeys(Keys.ARROW_DOWN);
		cbo.AccountHead().sendKeys(Keys.ENTER);*/
		Thread.sleep(3000);
		
		cbo.Generate().click();
		Thread.sleep(7000);
	}

}

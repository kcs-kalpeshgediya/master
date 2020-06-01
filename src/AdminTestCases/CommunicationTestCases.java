package AdminTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import SmarTownAdmin.CommunicationObjects;

public class CommunicationTestCases {
	@Test
	public static void Communication(WebDriver webdriver) throws InterruptedException
	{
		CommunicationObjects com=new CommunicationObjects(webdriver);
		Thread.sleep(3000);
		com.Admin().click();
		Thread.sleep(3000);
		com.Communication().click();
		Thread.sleep(3000);
		com.SearchMember().sendKeys("kalpesh Gediya");
		Thread.sleep(3000);
		com.SearchMember().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		com.search().click();
		Thread.sleep(5000);
		
		com.SMSNotification().click();
		Thread.sleep(3000);
		com.EnterTextSMS().sendKeys("For Testing Purpose");
		Thread.sleep(3000);
		
		com.Send().click();
		Thread.sleep(3000);
		com.Popup().click();
		Thread.sleep(5000);
		com.Clear().click();
		
		
		com.Committee().click();
		Thread.sleep(3000);
		com.SearchMember().sendKeys("La");
		Thread.sleep(3000);
		com.SearchMember().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		com.search().click();
		Thread.sleep(5000);
		
		com.LanguagesOther().click();
		Thread.sleep(3000);
		com.MoblieNotification().click();
		Thread.sleep(3000);
		com.EnterTextMoblie().sendKeys("For Testing Purpose");
		Thread.sleep(3000);
		
		com.Send().click();
		Thread.sleep(3000);
		com.Popup().click();
		Thread.sleep(5000);
		
		/*com.Clear().click();
		
		com.Defultmember().click();
		Thread.sleep(3000);
		com.SearchMember().clear();
		Thread.sleep(3000);
		com.SearchMember().sendKeys("manish G");
		Thread.sleep(3000);
		com.SearchMember().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		com.search().click();
		Thread.sleep(5000);
		
		//com.LanguagesEnglish().click();
		//Thread.sleep(3000);
		com.EmailNotifaction().click();
		Thread.sleep(3000);
		
		
		com.EmailSubject().sendKeys("For Checking purpose");
		Thread.sleep(5000);
		
		 WebElement inputField = webdriver.findElement(By.id("EmailSubject"));
		 inputField.sendKeys(Keys.TAB);
		 Thread.sleep(5000);
		
		 com.EnterTextEmail().sendKeys(Keys.ENTER);
		 Thread.sleep(5000);
		 com.EnterTextEmail().sendKeys("For Testing Purpose");
		 Thread.sleep(3000);
		 com.Send().click();
		 Thread.sleep(3000);
		 com.Popup().click();*/
				
		
		
		
	}
}

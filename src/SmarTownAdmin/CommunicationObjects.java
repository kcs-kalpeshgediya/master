package SmarTownAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CommunicationObjects {
	
	WebDriver driver;
	@Test
	public CommunicationObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	By Admin=By.xpath("//a[text()='Admin']");
	By Communication=By.xpath("//span[contains(text(),'Communication')]");
	By Committee=By.id("CommitteeMembers");
	By Defultmember=By.xpath("/html[1]/body[1]/my-app[1]/div[1]/div[1]/communication[1]/div[1]/div[1]/div[1]/div[1]/input[3]");
	By SearchMember=By.id("txtSearchMember");
	By search=By.xpath("//button[contains(text(),'Search')]");
	By Clear=By.xpath("//button[contains(text(),'Clear')]");
	By LanguagesEnglish=By.id("English");
	By LanguagesOther=By.id("Other");
	By SMSNotification=By.id("chkSMS");
	By EnterTextSMS=By.id("txtSMSNotification");
	By MoblieNotification=By.id("chkMobile");
	By EnterTextMoblie=By.id("txtMobileNotification");
	By EmailNotifaction=By.xpath(" //div[@id='EmailNotification']//input[@class='ng-untouched ng-pristine ng-valid']");
	By EmailSubject=By.id("EmailSubject");
	//By EmailText=By.tagName("p");
	
	//By EmailText=By.xpath("/html[1]/body[1]/p[1]");
	
	
	//By EmailText=By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']");
	
	//By EmailText1=By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//p");
	
	//By EmailText=By.cssSelector("body.cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders:nth-child(2) > p:nth-child(1)");
	By EnterTextEmail=By.xpath("/html[1]");
	
	By Send=By.id("btnsend");
	By Popup=By.id("popup_ok");
	

	public WebElement Admin()
	{
		return driver.findElement(Admin);
	}
	public WebElement Communication()
	{
		return driver.findElement(Communication);
	}
	public WebElement Committee()
	{
		return driver.findElement(Committee);
	}
	public WebElement Defultmember()
	{
		return driver.findElement(Defultmember);
	}
	public WebElement SearchMember()
	{
		return driver.findElement(SearchMember);
	}
	public WebElement search()
	{
		return driver.findElement(search);
	}
	public WebElement Clear()
	{
		return driver.findElement(Clear);
	}
	public WebElement LanguagesEnglish()
	{
		return driver.findElement(LanguagesEnglish);
	}
	public WebElement LanguagesOther()
	{
		return driver.findElement(LanguagesOther);
	}
	public WebElement SMSNotification()
	{
		return driver.findElement(SMSNotification);
	}
	public WebElement EnterTextSMS()
	{
		return driver.findElement(EnterTextSMS);
	}
	public WebElement MoblieNotification()
	{
		return driver.findElement(MoblieNotification);
	}
	public WebElement EnterTextMoblie()
	{
		return driver.findElement(EnterTextMoblie);
	}
	public WebElement EmailNotifaction()
	{
		return driver.findElement(EmailNotifaction);
	}
	public WebElement EmailSubject()
	{
		return driver.findElement(EmailSubject);
	}
	public WebElement EnterTextEmail()
	{
		return driver.findElement(EnterTextEmail);
	}
	/*public WebElement EmailText1()
	{
		return driver.findElement(EmailText1);
	}*/
	public WebElement Send()
	{
		return driver.findElement(Send);
	}
	public WebElement Popup()
	{
		return driver.findElement(Popup);
	}
}

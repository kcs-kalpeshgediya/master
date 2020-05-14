package ConfigurationIdentityRelation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddRecordIdentityRelation {
	WebDriver driver;
	@Test
	public AddRecordIdentityRelation(WebDriver driver)
	{
		this.driver=driver;
	}
	By Configuration=By.linkText("Configuration");
	By IdentityRelation=By.xpath("//span[text()='Identity Relation']");
	By New=By.xpath("//a[@class='btn']");
	By MemberRelation=By.id("txtMemberRelation");
	By DisplayReord =By.id("txtDisplayOrder");
	By IdentityType=By.id("DIdentityType");
	By save=By.id("btnSave");
	By popup=By.id("popup_ok");

	public WebElement Configuration()
	{
		return driver.findElement(Configuration);
	}
	public WebElement IdentityRelation()
	{
		return driver.findElement(IdentityRelation);
	}
	public WebElement New()
	{
		return driver.findElement(New);
	}
	public WebElement MemberRelation()
	{
		return driver.findElement(MemberRelation);
	}
	public WebElement DisplayReord()
	{
		return driver.findElement(DisplayReord);
	}
	public WebElement IdentityType()
	{
		return driver.findElement(IdentityType);
	}
	public WebElement save()
	{
		return driver.findElement(save);
	}
	public WebElement popup()
	{
		return driver.findElement(popup);
	}





}

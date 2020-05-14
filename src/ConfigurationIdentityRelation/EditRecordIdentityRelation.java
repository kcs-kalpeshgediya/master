package ConfigurationIdentityRelation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EditRecordIdentityRelation {

	
	WebDriver driver;
	@Test
	public EditRecordIdentityRelation(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Edit=By.xpath("//i[@class='ecubeicon-edit-1']");
	By MemberRelation=By.id("txtMemberRelation");
	By DisplayReord =By.id("txtDisplayOrder");
	By IdentityType=By.id("DIdentityType");
	By save=By.id("btnSave");
	By popup=By.id("popup_ok");
	
	public WebElement Edit()
	{
		return driver.findElement(Edit);
	}public WebElement MemberRelation()
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

package ConfigurationIdentityType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EditRecordIdentityType {
	
		
		WebDriver driver;
		@Test
		public EditRecordIdentityType(WebDriver driver)
		{
			this.driver=driver;
		}
		
		By Edit=By.xpath("//i[@class='ecubeicon-edit-1']");
		By ResidentProofCheckBox=By.xpath(" //div[@class='row']//div[2]//input[1]");
		By save=By.xpath("//div[@class='input-group']//button[@class='btn'][contains(text(),'Save')]");
		By Popup=By.xpath("//input[@id='popup_ok']");
		public WebElement Edit()
		{
			return driver.findElement(Edit);
		}
		public WebElement ResidentProofCheckBox()
		{
			return driver.findElement(ResidentProofCheckBox);
		}
		public WebElement save()
		{
			return driver.findElement(save);
		}
		public WebElement Popup()
		{
			return driver.findElement(Popup);
		}

		//div[@class='input-group']//button[@class='btn'][contains(text(),'Save')]

}

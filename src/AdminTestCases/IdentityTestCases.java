package AdminTestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import SmartTownAdmin.IdentityOjbect;


public class IdentityTestCases {
	@Test
	public static  void Identity(WebDriver webdriver) throws InterruptedException, IOException
	{
	IdentityOjbect ido=new IdentityOjbect(webdriver);
	Thread.sleep(2000);
	ido.Admin().click();
	Thread.sleep(2000);
	ido.identity().click();
	Thread.sleep(2000);
	ido.New().click();
    Thread.sleep(2000);
    ido.select().click();
    ido.select().sendKeys(Keys.ARROW_DOWN);
    ido.select().sendKeys(Keys.ENTER);
    Thread.sleep(2000);
    ido.Firstname().sendKeys("kalpesh12");
    Thread.sleep(2000);
    ido.lastname().sendKeys("Mahera187");
    Thread.sleep(2000);
	ido.moblieno().sendKeys("6565767564");
	Thread.sleep(2000);
	ido.Email().sendKeys("Chan34@gmail.com");
	Thread.sleep(2000);
	ido.gender().click();
	Thread.sleep(2000);
	Select se=new Select(webdriver.findElement(By.id("BloodGroupId")));
	se.selectByValue("B +");
	Thread.sleep(3000);
	ido.Next().click();
	Thread.sleep(4000);
	ido.popup().click();
	
	IdentityOjbect ion=new IdentityOjbect(webdriver);
	
	Thread.sleep(2000);
	ion.idcategory().click();
	ion.idcategory().sendKeys(Keys.ARROW_DOWN);
	ion.idcategory().sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	
	ion.identityType().click();
	ion.identityType().sendKeys(Keys.ARROW_DOWN);
	ion.identityType().sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	
	ion.Unit().sendKeys("F655");
	ion.Unit().sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	
	ion.fromdate().click();
	ion.selectF().click();
	Thread.sleep(2000);
	
	ion.todate().click();
	ion.selectto().click();
	Thread.sleep(2000);
	
	ion.status().click();
	ion.status().sendKeys(Keys.ARROW_DOWN);
	ion.status().sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	
	Select s=new Select(webdriver.findElement(By.id("AccountHeadName")));
	s.selectByValue("21");
	Thread.sleep(2000);
	
	ion.save().click();
	Thread.sleep(2000);
	
	//ion.Save1().click();
	//Thread.sleep(1000);
	
	ion.Save2().click();
	Thread.sleep(2000);
	
	ion.Next1().click();
	
	IdentityOjbect depan=new IdentityOjbect(webdriver);
	
	Thread.sleep(2000);
	depan.Salutation().click();
	depan.Salutation().sendKeys(Keys.ARROW_DOWN);
	depan.Salutation().sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	
	depan.Dfirstname().sendKeys("Hitesh");
	Thread.sleep(2000);
	
	depan.DIdentityType().click();
	depan.DIdentityType().sendKeys(Keys.ARROW_DOWN);
	depan.DIdentityType().sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	
	depan.Drelation().click();
	depan.Drelation().sendKeys(Keys.ARROW_DOWN);
	depan.Drelation().sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	
	depan.Gender1().click();
	Thread.sleep(2000);
	
	depan.DMoblie().sendKeys("9099743433");
	Thread.sleep(2000);
	
	depan.Dsave().click();
	Thread.sleep(2000);
	depan.Dsave1().click();
	Thread.sleep(2000);
	depan.Dnext().click();
	Thread.sleep(2000);
	
	/*depan.DocumentType().click();
	depan.DocumentType().sendKeys(Keys.ARROW_DOWN);
	depan.DocumentType().sendKeys(Keys.ARROW_DOWN);
	depan.DocumentType().sendKeys(Keys.ARROW_DOWN);
	depan.DocumentType().sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	
	//depan.Fileupload().click();
	//Thread.sleep(3000);
	
	//Runtime.getRuntime().exec("E:\\FileUpload.exe");
	//Thread.sleep(2000);
	depan.Dosave().click();
	Thread.sleep(2000);
	
	//depan.DocumentNot().click();
	//Thread.sleep(2000);
	
	depan.DoSave1().click();
	Thread.sleep(2000);*/

	depan.Finish().click();
	Thread.sleep(2000);
	depan.Finish1().click();

	//IdentityOjbect depan=new IdentityOjbect(webdriver);
	
	Thread.sleep(3000);
	depan.Search().sendKeys("F655");
	Thread.sleep(3000);
	
	
	depan.Edit().click();
	Thread.sleep(2000);
	depan.Firstname().clear();
	Thread.sleep(2000);
	depan.Firstname().sendKeys("Ravish");
	Thread.sleep(2000);
	depan.lastname().clear();
	Thread.sleep(2000);
	depan.lastname().sendKeys("patel");
	Thread.sleep(2000);
	depan.moblieno().clear();
	Thread.sleep(2000);
	depan.moblieno().sendKeys("4242424242");
	Thread.sleep(2000);
	depan.Email().clear();
	Thread.sleep(2000);
	depan.Email().sendKeys("patel345@gmail.com");
	Thread.sleep(2000);
	
	depan.Enext().click();
	Thread.sleep(4000);
	depan.popup().click();
	Thread.sleep(4000);
	depan.Next1().click();
	Thread.sleep(4000);
	depan.Dnext().click();
	Thread.sleep(3000);
	
	depan.Finish().click();
	Thread.sleep(3000);
	//depan.Finish1().click();
	
	
	//Thread.sleep(3000);
	
	depan.Search().sendKeys("F655");
	Thread.sleep(3000);
	}
}

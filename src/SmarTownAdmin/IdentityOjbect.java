package SmarTownAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class IdentityOjbect {

    WebDriver driver;
    @Test
     public IdentityOjbect(WebDriver driver)
    {
    	this.driver=driver;
    }
    
    By Admin=By.xpath("//a[text()='Admin']");
    By identity=By.xpath("//span[text()='Identity ']");
	By New =By.xpath("//a[@class='btn']");
	
	By select=By.id("Salutation");
	By Firstname=By.id("FirstName");
	By lastname=By.id("LastName");
	By moblieno=By.id("MobileNo");
	By Email=By.id("Email");
	By gender=By.id("Male");
	By Next=By.xpath("//div[@id='step1']//button[@class='btn next-step'][contains(text(),'Next')]");
	By popup=By.id("popup_ok");
	
	
	By idcategory=By.id("MembershipType");
	By identityType=By.id("IdentityCategory");
	By Unit=By.id("search");
	By fromdate=By.id("TransactionFromDate");
	By selectF=By.xpath("//a[contains(text(),'10')]"); //a[contains(text(),'10')]
	By todate=By.id("TransactionToDate");
	By selectto=By. xpath("//a[contains(text(),'23')]");//a[contains(text(),'23')]
	By status=By.id("PropertyStatusId");
	By save=By.xpath("//div[@id='step2']//a[@class='btn'][contains(text(),'Save')]");
	By Save1=By.xpath("//input[@id='popup_ok']");
	By Save2=By.id("popup_ok");
	
	By Next1=By.xpath("//ul[@class='list-inline']//button[@class='btn next-step'][contains(text(),'Next')]");
	
	By Salutation=By.id("DSalutation");
	By Dfirstname=By.id("DFirstName");
	By DIdentityType=By.id("DIdentityType");
	By Drelation=By.id("RelationId");
	By Gender1=By.id("DMale");
	By DMoblie=By.id("DMobileNo");
	By Dsave=By.xpath("//div[@class='custom-form']//div[@class='personal-information']//div//a[@class='btn'][contains(text(),'Save')]");
	By Dsave1=By.id("popup_ok");
	By Dnext=By.xpath("//ul[@class='list-inline clearfix']//li[@class='pull-right']//button[@class='btn next-step'][contains(text(),'Next')]");
	
	By DocumentType=By.id("DocumentTypeId");
	
	By Fileupload=By.xpath("//input[@id='DocumentName']");
	
	By Dosave=By.xpath("//div[@class='custom-input-group']//a[@class='btn'][contains(text(),'Save')]");
	
	By DocumentNot=By.id("popup_ok");
	By DoSave1=By.id("popup_ok");
	By Finish=By.xpath("//button[contains(text(),'Finish')]");
	By Finish1=By.id("popup_ok");
	
	By Search=By.id("txtsearch");
	By Edit=By.xpath("//i[@class='ecubeicon-edit-1']");
	
	By Enext=By.xpath("//div[@id='step1']//button[@class='btn next-step'][contains(text(),'Next')]");
	By ESearch=By.xpath("//input[@id='txtsearch']");
public WebElement Admin()
{
	return driver.findElement(Admin);
}
public WebElement identity()
{
	return driver.findElement(identity);
}
public WebElement New()
{
	return driver.findElement(New);
}
public WebElement select()
{
	return driver.findElement(select);
}


public WebElement Firstname()
{
	return driver.findElement(Firstname);
}
public WebElement lastname()
{
	return driver.findElement(lastname);
}
public WebElement moblieno()
{
	return driver.findElement(moblieno);
}
public WebElement Email()
{
	return driver.findElement(Email);
}
public WebElement gender()
{
	return driver.findElement(gender);
}
public WebElement Next()
{
	return driver.findElement(Next);
}
public WebElement popup()
{
	return driver.findElement(popup);
}



public WebElement idcategory()
{
	return driver.findElement(idcategory);
}
public WebElement identityType()
{
	return driver.findElement(identityType);
}
public WebElement Unit()
{
	return driver.findElement(Unit);
}
public WebElement fromdate()
{
	return driver.findElement(fromdate);
}
public WebElement selectF()
{
	return driver.findElement(selectF);
}
public WebElement todate()
{
	return driver.findElement(todate);
}
public WebElement selectto()
{
	return driver.findElement(selectto);
}
public WebElement status()
{
	return driver.findElement(status);
}
public WebElement save()
{
	return driver.findElement(save);
}
public WebElement Save1()
{
	return driver.findElement(Save1);
}
public WebElement Save2()
{
	return driver.findElement(Save2);
}
public WebElement Next1()
{
	return driver.findElement(Next1);
}



public WebElement Salutation()
{
	return driver.findElement(Salutation);
}
public WebElement Dfirstname()
{
	return driver.findElement(Dfirstname);
}
public WebElement DIdentityType()
{
	return driver.findElement(DIdentityType);
}
public WebElement Drelation()
{
	return driver.findElement(Drelation);
}
public WebElement Gender1()
{
	return driver.findElement(Gender1);
}
public WebElement DMoblie()
{
	return driver.findElement(DMoblie);
}
public WebElement Dsave()
{
	return driver.findElement(Dsave);
}
public WebElement Dsave1()
{
	return driver.findElement(Dsave1);
}
public WebElement Dnext()
{
	return driver.findElement(Dnext);
}

public WebElement DocumentType()
{
	return driver.findElement(DocumentType);
}
public WebElement Fileupload()
{
	return driver.findElement(Fileupload);
}

public WebElement Dosave()
{
	return driver.findElement(Dosave);
}

public WebElement DocumentNot()
{
	return driver.findElement(DocumentNot);
}




public WebElement DoSave1()
{
	return driver.findElement(DoSave1);
}

public WebElement Finish()
{
	return driver.findElement(Finish);
}
public WebElement Finish1()
{
	return driver.findElement(Finish1);
}
public WebElement Search()
{
	return driver.findElement(Search);
}
public WebElement Edit()
{
	return driver.findElement(Edit);
}

public WebElement Enext()
{
	return driver.findElement(Enext);
}
public WebElement ESearch()
{
	return driver.findElement(ESearch);
}

}

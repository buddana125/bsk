package qa.com.pageobjects222;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.com.testbase222.TestBase22234;

import qa.com.testbase222.TestBase22234;

public class Usertype_function extends TestBase22234 {
	
	@FindBy(xpath="//i[@class='fa fa-database']")
	WebElement Mast;
	
	@FindBy(xpath="//ul[@class='treeview-menu']/li/a[1]")
	WebElement usertype;
	
	@FindBy(xpath="//div[@class='col-md-6'][2]//a")
	WebElement Addnew;
	
	@FindBy(xpath="//input[@name='TypeName']")
	WebElement Typename;
	
	@FindBy(xpath="//input[@name='TypeCode']")
	WebElement Typecode;
	
	@FindBy(xpath="//div[@class='card-body']//button")
	WebElement save;
	
	@FindBy(xpath="//div[@id='mydatatable_filter']//input")
	WebElement sear;
	
	@FindBy(xpath="//i[@class='fa fa-pencil']")
	WebElement edit;
	
	@FindBy(xpath="//input[@name='TypeName']")
	WebElement Typename2;
	
	@FindBy(xpath="//div[@class='card-body']//button")
	WebElement save2;
	
	@FindBy(xpath="//div[@id='mydatatable_filter']//input")
	WebElement sear2;
	
	@FindBy(xpath="//i[@class='fa fa-trash-o']")
	WebElement dele;
	
	@FindBy(xpath="//div[@class='swal-button-container'][1]//button")
	WebElement yes;
	
	@FindBy(xpath="//i[@class='fa fa-reply mr-2']")
	WebElement Back;
	
	public Usertype_function(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void user() throws Throwable {
		Mast.click();
		usertype.click();
		Thread.sleep(2000);
		Addnew.click();
		Typename.sendKeys("Hari");
		Typecode.sendKeys("1420");
		Thread.sleep(2000);
		save.click();
		sear.sendKeys("1420");
		Thread.sleep(2000);
		edit.click();
		Thread.sleep(2000);
		Typename2.sendKeys("kiran");
		save2.click();
		Thread.sleep(2000);
		sear2.sendKeys("1420");
		Thread.sleep(2000);
		dele.click();
		yes.click();
		Thread.sleep(2000);
		Back.click();
	}

}

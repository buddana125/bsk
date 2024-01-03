package qa.com.pageobjects222;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.com.testbase222.TestBase22234;

public class Category_function extends TestBase22234 {

	@FindBy(xpath="//i[@class='fa fa-database']")
	WebElement Mast;
	
	@FindBy(xpath="//ul[@class='treeview-menu'][1]//li[2]//a[1]")
	WebElement category;
	
	@FindBy(xpath="//div[@class='col-md-6']//i")
	WebElement Addnew;
	
	@FindBy(xpath="//input[@class='form-control']")
	WebElement categoryname;
	
	@FindBy(xpath="//div[@class='card-body']//button")
	WebElement save;
	
	@FindBy(xpath="//div[@class='col-sm-12 col-md-6']//input")
	WebElement search;
	
	@FindBy(xpath="//tr[@class='odd']//button")
	WebElement edit;
	
	@FindBy(xpath="//input[@class='form-control']")
	WebElement ctname;
	
	@FindBy(xpath="//div[@class='card-body']//button")
	WebElement save2;
	
	@FindBy(xpath="//div[@class='col-sm-12 col-md-6']//input")
	WebElement search1;
	
	@FindBy(xpath="//i[@class='fa fa-trash-o']")
	WebElement dele;
	
	@FindBy(xpath="//div[@class='swal-button-container'][1]//button")
	WebElement yes;
	
	@FindBy(xpath="//i[@class='fa fa-reply mr-2']")
	WebElement back;
	
	public Category_function(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void category() throws Throwable {
		
		Mast.click();
		category.click();
		Thread.sleep(2000);
		Addnew.click();
		categoryname.sendKeys("Desktop");
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
		search.sendKeys("Desktop");
		edit.click();
		Thread.sleep(2000);
		ctname.sendKeys("Laptop");
		save2.click();
		Thread.sleep(2000);
		search1.sendKeys("DesktopLaptop");
		dele.click();
		Thread.sleep(2000);
		yes.click();
		back.click();
	}
	}

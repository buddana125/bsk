package qa.com.pageobjects222;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.com.testbase222.TestBase22234;

public class logout_function_H extends TestBase22234{
	
	
	@FindBy(xpath="//a[@class='nav-link']/img")
	WebElement btnimg;
	
	@FindBy(xpath="//i[@class='fa fa-sign-out']")
	WebElement sigout;
	
	public logout_function_H(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void logout() throws Throwable {
		Thread.sleep(3000);
		btnimg.click();
		Thread.sleep(3000);
		sigout.click();
	}

}

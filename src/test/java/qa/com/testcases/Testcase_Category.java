package qa.com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.com.pageobjects222.Category_function;
import qa.com.pageobjects222.login_function222;
import qa.com.pageobjects222.logout_function_H;
import qa.com.testbase222.TestBase22234;

public class Testcase_Category extends TestBase22234 {

	login_function222 lgn;
	Category_function cat;
	logout_function_H lgut;
	
	public Testcase_Category() {
		super();
	}
	@BeforeMethod
	public void setup() {
		set();
		lgn=new login_function222(driver);
		cat=new Category_function(driver);
		lgut=new logout_function_H(driver);
	}
	
	@Test
	public void cate() throws Throwable {
		lgn.valide();
		Thread.sleep(2000);
		cat.category();
		Thread.sleep(2000);
		lgut.logout();
		
	}
}

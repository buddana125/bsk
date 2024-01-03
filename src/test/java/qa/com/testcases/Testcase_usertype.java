package qa.com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.com.pageobjects222.Usertype_function;
import qa.com.pageobjects222.login_function222;
import qa.com.pageobjects222.logout_function_H;
import qa.com.testbase222.TestBase22234;

public class Testcase_usertype extends TestBase22234 {
	
	login_function222 lgn;
	Usertype_function  usr;
	logout_function_H lgot;
	
	public Testcase_usertype() {
		super();
	}
	@BeforeMethod
	public void usersetup() {
		set();
		lgn=new login_function222(driver);
		usr=new Usertype_function(driver);
		lgot=new logout_function_H(driver);
	}
	@Test
	public void usertype() throws Throwable{
		lgn.valide();
		Thread.sleep(2000);
		usr.user();
		Thread.sleep(2000);
		lgot.logout();
	}
	

}

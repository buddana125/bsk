package qa.com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.com.pageobjects222.login_function222;
import qa.com.pageobjects222.logout_function_H;
import qa.com.testbase222.TestBase22234;

public class Testcase_logout_H extends TestBase22234 {

	login_function222 lav;
	logout_function_H  log;
	
	public Testcase_logout_H () {
		super();
	}
	@BeforeMethod
	public void inta() {
		
		set();
		lav=new login_function222(driver);
		log=new logout_function_H(driver);
	}
	@Test
	public void logout() throws Throwable {
		lav.valide();
		log.logout();
	}
}

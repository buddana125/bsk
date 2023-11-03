package qa.com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.com.pageobjects222.login_function222;
import qa.com.pageobjects222.logout_function;
import qa.com.testbase222.TestBase22234;

public class Hari_logout extends TestBase22234{
	
	login_function222 lav;
	logout_function log;
	public Hari_logout() {
		super();
	}
	
	@BeforeMethod
	public void inta() {
		
		set();
		
		 lav=new  login_function222(driver);
		 log=new  logout_function(driver);
	}
	
	@Test
	public void log() throws Throwable {
		lav.valide();
		log.valide1();
	Thread.sleep(3000);
	}
	

}

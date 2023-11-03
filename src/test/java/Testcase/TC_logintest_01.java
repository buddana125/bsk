package Testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Testbase;
import com.qa.pageobject.Loginfunction;

public class TC_logintest_01 extends Testbase {
	Loginfunction lg;

	public TC_logintest_01() {
		super();	
	}
	@BeforeMethod
	public void initilize() {
		Setup();
	 lg=new Loginfunction(driver);
	}
	
	@Test
	public void test() {
		lg.loginpage();
	}
}

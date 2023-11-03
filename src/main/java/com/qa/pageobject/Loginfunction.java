package com.qa.pageobject;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Testbase;

public class Loginfunction extends Testbase{
	
	
	@FindBy(xpath="//input[@type='text']")
	WebElement usr;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pasw;
	
	@FindBy(xpath="//button[@value='1']")
	WebElement login;
	
	public Loginfunction(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
	}
	
	public void loginpage() {
		usr.sendKeys(props.getProperty("username"));
		pasw.sendKeys(props.getProperty("password"));
		login.click();
		
		
	}}


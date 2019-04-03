package com.qa.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class LoginPage extends TestBase {
	
//	page factory
	@FindBy(xpath="//input[@type='email' and @name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password' and @name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit' and text()='Login']")
	WebElement loginButton;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public HomePage Login(String un,String pw){
		username.sendKeys(un);
		password.sendKeys(pw);
		loginButton.click();
		return new HomePage();
	}
	
}

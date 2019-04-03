package com.qa.StepDefination;

import java.io.IOException;

import com.qa.Base.TestBase;
import com.qa.Page.HomePage;
import com.qa.Page.LoginPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	
	@Given("^User launching the a browser$")
	public void user_launching_the_a_browser() throws IOException {
		initialization();
		loginpage= new	LoginPage();
		homepage= new HomePage();
	    
		
	}

	@Given("^User is on Login page$")
	public void user_is_on_Login_page() {
		
	    String loginTitle =loginpage.validateLoginPageTitle();
	    Assert.assertEquals("Login", loginTitle);
	     
		
	}

	@Then("^User logged in$")
	public void user_logged_in() {
		homepage=loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));
		
	}

	@Then("^User is on HomePage$")
	public void user_is_on_HomePage() {
		String Title=homepage.verifyHomePageTitle();
		Assert.assertEquals("Whizdom Trainings", Title);
	}


	@Then("^Close browser$")
	public void close_browser() {
		driver.close();
	}


}

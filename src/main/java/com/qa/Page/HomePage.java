package com.qa.Page;

import com.qa.Base.TestBase;

import junit.framework.Assert;

public class HomePage extends TestBase {
	
	public String verifyHomePageTitle(){
		
		return driver.getTitle();
	}

}

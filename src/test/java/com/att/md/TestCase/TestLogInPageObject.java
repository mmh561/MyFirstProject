package com.att.md.TestCase;

import org.testng.annotations.Test;

import com.att.md.core.TestBase;
import com.att.md.pages.LogInPage;

public class TestLogInPageObject extends TestBase { 
	
	LogInPage logInPage;
	
	@Test
	public void validateLogInUsingValidCredentials() {
		logInPage= new LogInPage();
		logInPage.setDriver(driver);
		logInPage.goToURL();
		logInPage.EnterUserName("Admin");
		
		
	}

}

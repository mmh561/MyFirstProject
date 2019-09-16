package com.att.md.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends PageBase {
	//WebElements
	@FindBy(id="txtUsername") public WebElement userName;
	@FindBy(id="txtPassword") public WebElement password;
	@FindBy(name="Submit") public WebElement SubmitBtn;
	
	//Actions
	
	public void goToURL() {
		mydriver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	public void EnterUserName(String usrName) {
		userName.sendKeys(usrName);
		
	}
	
}

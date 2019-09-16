package com.att.md.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	
	public WebDriver mydriver;
	
	public void setDriver(WebDriver driver) {
		mydriver=driver;
		PageFactory.initElements(driver, this);
		
	}

}

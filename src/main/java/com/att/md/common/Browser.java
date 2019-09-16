package com.att.md.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	
	private static WebDriver driver;
	
	public static WebDriver setBrowser(String browserName) {
		if("chrome".equals(browserName)) {
		return new ChromeDriver();
		}
		else if("firefox".equals(browserName)) {
			return new FirefoxDriver();
		}
		else
			return new InternetExplorerDriver();

	}
	
	public static WebDriver getBrowser() {
		driver=setBrowser(System.getProperty("default.browser"));
		return driver;
	} 
}

package com.att.md.core;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.att.md.common.Browser;
import com.att.md.common.Log;
import com.att.md.common.PropertyLoader;

public class TestBase {
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeTest
	public static void intitTest() throws FileNotFoundException,IOException {
	PropertyLoader.loadProperties();
	driver=Browser.getBrowser();
	logger=Log.setUpLog();
	
	}	
	@AfterTest
	public static void closeBrowser() {
		driver.quit();
	}
	

}

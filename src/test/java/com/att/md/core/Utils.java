package com.att.md.core;

import org.openqa.selenium.By;

public class Utils extends TestBase{
	public static String invalidLogingWarning() {
		return driver.findElement(By.xpath("//*[@id=\"spanMessage\"]")).getText();
	}
	
	public static String actualTextAfterLogin() {
		return driver.findElement(By.id("welcome")).getText();
	}

}

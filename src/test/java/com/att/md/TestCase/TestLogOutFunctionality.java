package com.att.md.TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.att.md.core.Utils;

public class TestLogOutFunctionality extends Utils {

	
	@Test
	public static void validateLogoutFuntionality() throws InterruptedException {
		logger.info("Envoking the url....");
		driver.get(System.getProperty("base.url"));
				
		Thread.sleep(2000);
		logger.info("Entering the password...");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	

	}
	

}

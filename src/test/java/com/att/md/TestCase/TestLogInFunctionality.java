package com.att.md.TestCase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.att.md.core.TestBase;
import com.att.md.core.Utils;

public class TestLogInFunctionality extends Utils{
	
	public void setUp() {
			
	}
	
	@Test(enabled=false)
	public static void testLogInFunctionalityValidCredentials() throws InterruptedException {
		logger.info("Envoking the url....");	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		Assert.assertEquals(actualTextAfterLogin(), "Welcome Admin");		
				
	}
	
	@Test()
	public static void testLogInFunctionalityInvalidCredentials() throws InterruptedException {
			
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		Assert.assertEquals(invalidLogingWarning(), "Invalid credentials");		
				
	}
	


}

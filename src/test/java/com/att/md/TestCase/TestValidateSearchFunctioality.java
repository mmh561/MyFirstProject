package com.att.md.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.att.md.core.TestBase;

public class TestValidateSearchFunctioality extends TestBase {
	
	@Test
	public static void searchFuctionalityValidation() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Linda");
		
		Select selectUserRole= new Select(driver.findElement(By.id("searchSystemUser_userType")));
		
		selectUserRole.selectByIndex(2);
	}
}

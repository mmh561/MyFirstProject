package Selenium;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {
	
	public static Logger logger;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();		
		driver.close();
		
		
//		setupLog4j();
//		logger.info("main method started...");
		
		
		

	}
	
//	public static void setupLog4j() {
//		logger=Logger.getLogger("SeleniumPractice");
//		PropertyConfigurator.configure("Log4j.properties");
//		
//	}

}

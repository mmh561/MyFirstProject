package com.att.md.stepDefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.att.md.common.Browser;
import com.att.md.common.Log;
import com.att.md.common.PropertyLoader;
import com.att.md.core.TestBase;
import com.att.md.pages.LogInPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;

//import cucumber.api.java.Before;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends TestBase{
	
	
	public static WebDriver driver;
	public static Logger logger;
	
	
	@Before
	public static void init() throws FileNotFoundException, IOException {
		
		PropertyLoader.loadProperties();
		driver=Browser.getBrowser();
		logger=Log.setUpLog();
		
	}
	
	
	
	
	@Given("^Open the browser and enter the url$")
	public void open_the_browser_and_enter_the_url() throws Throwable{
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	}
	
	@Given("Enter username")
	public void enter_username() {
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}

	@Given("Enter password")
	public void enter_password() {
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("click the submit button")
	public void click_the_submit_button() {
		driver.findElement(By.name("Submit")).click();

	}

	@When("click welcome button")
	public void click_welcome_button() throws Exception {
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
	}

	@When("click logout button")
	public void click_logout_button() {
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

	}
	@Then("validate the outcomes {string}")
	public void validate_the_outcomes(String expected) {
		
		String actual= driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals("validations", expected , actual);
	    
	}
	
	@Given("Enter Username {string}")
	public void enter_Username(String username) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
	    
	}

	@Given("Enter Password {string}")
	public void enter_Password(String password) {
		driver.findElement(By.id("txtPassword")).sendKeys(password);

	}

	

}

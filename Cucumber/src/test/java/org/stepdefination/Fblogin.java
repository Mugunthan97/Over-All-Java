package org.stepdefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fblogin {
	
	public WebDriver driver;
	
	@Given("To open browswer and launch fb url")
	public void to_open_browswer_and_launch_fb_url() {
	    
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
	}

	@When("To pass invalid username")
	public void to_pass_invalid_username() {
		driver.findElement(By.id("email")).sendKeys("Java@gmail.com");
	  
	}

	@When("To pass invalid password")
	public void to_pass_invalid_password() {
		driver.findElement(By.id("pass")).sendKeys("Java@123");
	  
	}

	@When("User click login btn")
	public void user_click_login_btn() {
		driver.findElement(By.name("login")).click();
	}

	@Then("User take screenshot")
	public void user_take_screenshot() throws Throwable {
		File f=new File("E:\\Eclipse\\Cucumber\\Snaps");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, f);
	    
	}
	

}

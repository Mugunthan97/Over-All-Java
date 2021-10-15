package org.sample;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sample extends BaseClass {
	
	@BeforeClass
	private void open() {
		openBroswer();
		maximize();
		loadUrl("https://www.facebook.com/");
	}
	
	@AfterClass
	private void end() {
		closeBroswer();
	}
	
	@Test
	private void tcl() {
		driver.findElement(By.id("email")).sendKeys("Mugunthan97");
	}
	
		
		

}

package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo extends BaseClass {
	
	public static void main(String[] args) throws Throwable {
		
		openbroswer();
		openUrl("https://en-gb.facebook.com/");
		broswerMaximize();
		snap("FbHomePage");
		WebElement txtusr = driver.findElement(By.id("email"));
		txtusr.sendKeys("Java@gmail.com");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("Java@123");
		
		String gettxt = txtusr.getAttribute("value");
		String getpass = txtpass.getAttribute("value");
		
		System.out.println(gettxt);
		System.out.println(getpass);
		
		snap("Values Enter");
		
		WebElement txtbtn = driver.findElement(By.name("login"));
		txtbtn.click();
		
		Thread.sleep(3000);
		snap("invalidpage");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

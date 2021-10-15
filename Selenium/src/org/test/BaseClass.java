package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void openbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\Selenium\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
	}
	
	public static void maximize() {
		
		driver.manage().window().maximize();
	}
	
	public static void loadurl (String url) {
		driver.get(url);

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

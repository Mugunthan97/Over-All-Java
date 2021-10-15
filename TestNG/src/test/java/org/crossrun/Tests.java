package org.crossrun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sample.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tests extends BaseClass {

	@Parameters("browser")
	@Test
	private void tc1(String Browser) {

		 WebDriver d = openBroswer1(Browser);
		d.get("https://en-gb.facebook.com/");
		WebElement user = d.findElement(By.id("email"));
		user.sendKeys("anbu");
	}

}

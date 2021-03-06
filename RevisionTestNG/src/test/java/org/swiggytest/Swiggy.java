package org.swiggytest;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swiggy extends BaseClass {

	@Test(priority = 1)
	private void SwiggyLogin() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		WebElement mobile = driver.findElement(By.id("mobile"));
		mobile.sendKeys(excelSheet(0, 1));
		driver.findElement(By.xpath("(//a[text()='Login'])[2]")).click();
		driver.close();
	}

	@Test(priority = 2)
	private void SwiggySignup() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.id("mobile")).sendKeys(excelSheet(0, 1));
		driver.findElement(By.id("name")).sendKeys(excelSheet(1, 1));
		driver.findElement(By.id("email")).sendKeys(excelSheet(2, 1));
		driver.findElement(By.id("password")).sendKeys(excelSheet(3, 1));
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		driver.close();
	}

	@Test(priority = 3)
	private void SwiggyLocateMe() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Locate Me']")).click();
		driver.close();
	}

	@Test(priority = 4)
	private void SwiggyFindFood() throws IOException, Throwable {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();

		WebElement Location = driver.findElement(By.id("location"));
		Location.sendKeys(excelSheet(4, 1));
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}

package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebPageHotel extends BaseClass {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		openbroswer();
		broswerMaximize();
		openUrl("https://www.adactinhotelapp.com/");
		WebElement user = driver.findElement(By.id("username"));
		sendvalue(user, username(1,0));
		WebElement pass = driver.findElement(By.id("password"));
		sendvalue(pass, username(1, 1));
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
		WebElement lc = driver.findElement(By.id("location"));
		sendvalue(lc, username(1,2));
		WebElement htl = driver.findElement(By.id("hotels"));
		sendvalue(htl, username(1,3));
		WebElement rmType = driver.findElement(By.id("room_type"));
		sendvalue(rmType, username(1,4));
		WebElement noOfRooms = driver.findElement(By.id("room_nos"));
		sendvalue(rmType, username(1,5));
		WebElement inDate = driver.findElement(By.id("datepick_in"));
		sendvalue(inDate, username(1,6));
		WebElement outDate = driver.findElement(By.id("datepick_out"));
		sendvalue(outDate, username(1,7));
		WebElement aperson = driver.findElement(By.id("adult_room"));
		sendvalue(aperson, username(1,8));
		WebElement cperson = driver.findElement(By.id("child_room"));
		sendvalue(cperson, username(1,9));
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		WebElement fName = driver.findElement(By.id("first_name"));
		sendvalue(fName, username(1,10));
		WebElement lName = driver.findElement(By.id("last_name"));
		sendvalue(lName, username(1,11));
		WebElement address = driver.findElement(By.id("address"));
		sendvalue(address, username(1,12));
		WebElement card = driver.findElement(By.id("cc_num"));
		sendvalue(card, username(1,13));
		WebElement cardType = driver.findElement(By.id("cc_type"));
		sendvalue(cardType, username(1,14));
		WebElement exMonth = driver.findElement(By.id("cc_exp_month"));
		sendvalue(exMonth, username(1,15));
		WebElement exYear = driver.findElement(By.id("cc_exp_year"));
		sendvalue(exYear, username(1,16));
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		sendvalue(cvv, username(1,17));
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(5000);
		WebElement txt = driver.findElement(By.id("order_no"));
		Thread.sleep(3000);
		String text = txt.getAttribute("value");
		System.out.println(text);
		writeexcel(text, 1, 18);
		
		
		
		
		
		
		
		
		
		
		
	}

}

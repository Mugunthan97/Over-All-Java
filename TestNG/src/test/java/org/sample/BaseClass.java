package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	
	public static void open1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	}
	
	public static WebDriver openBroswer1(String browser) {

		if (browser.equals("Chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void closeBroswer() {
		driver.quit();
	}

	public static void fill(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static String get(int row, int cell) throws Exception {

		File f = new File("E:\\Eclipse\\TestNG\\Datas\\Excel.xlsx");
		FileInputStream fInput = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fInput);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);

		int type = c.getCellType();

		String value;

		if (type == 1) {
			value = c.getStringCellValue();
		}

		else if (DateUtil.isCellDateFormatted(c)) {
			Date dateCellValue = c.getDateCellValue();
			SimpleDateFormat d = new SimpleDateFormat("dd-MM-yyyy");
			value = d.format(dateCellValue);
		}

		else {
			double numericCellValue = c.getNumericCellValue();
			long l = (long) numericCellValue;
			value = String.valueOf(l);
		}
		return value;
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void write(int row, int cell, String value) throws Exception {

		File f = new File("E:\\Eclipse\\TestNG\\Datas\\data.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Sheet1");
		Row r = s.createRow(row);
		Cell c = r.createCell(cell);
		FileOutputStream fOut = new FileOutputStream(f);
		c.setCellValue(value);
		w.write(fOut);

	}

	public static void maximize1(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public static void loadUrl2(String url, WebDriver driver) {
		driver.get(url);

	}
	
	public static void snap() throws Exception {
		File desc=new File("E:\\Eclipse\\TestNG\\ScreenShots\\filename.png");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		Files.copy(src, desc);
	}
}

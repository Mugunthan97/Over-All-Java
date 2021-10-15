package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void openBroswer() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void openUrl (String url) {
		driver.get(url);
	}
	
	public static void broswerMaximize() {
		driver.manage().window().maximize();
	}
	
	public static void fill(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public static String excelRead(int row,int cell) throws Exception {
		File f=new File("E:\\Eclipse\\Junit\\Files\\Excel.xlsx");
		FileInputStream fInput=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fInput);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		int type = c.getCellType();
		
		String value;
		if (type==1) {
			 value = c.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date dateCellValue = c.getDateCellValue();
			SimpleDateFormat d=new SimpleDateFormat("dd-MM-yyyy");
			 value = d.format(dateCellValue);
		}
		else {
			double numericCellValue = c.getNumericCellValue();
			long l=(long)numericCellValue;
			 value = String.valueOf(l);
		}
		return value;
	}
	
	public static void btnClick(WebElement element) {
		element.click();

	}
	
	public static void broswerClose() {
		driver.quit();
	}

}

package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public static WebDriver driver;
	
	public static void openbroswer() {
//		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\Selenium\\drivers\\chromedriver.exe");
//		driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
	}
	
	public static void broswerMaximize() {
		driver.manage().window().maximize();
	}
	
	public static void openUrl(String url) {
		driver.get(url);
	}
	
	public static void snap(String filename) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File desination = new File("E:\\Eclipse\\Sample\\Files\\"+filename+".png");
		FileUtils.copyFile(source, desination);
	}
	
	public static void getUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void getPageTittle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void findid(String id) {
		driver.findElement(By.id(id));
	}
	
	public static void findName(String name) {
		driver.findElement(By.id(name));
	}
	
	public static void findxpath(String xpath) {
		driver.findElement(By.xpath(xpath));
	}
	
	public static void sendvalue(WebElement element,String keys) {
		element.sendKeys(keys);
	}
	
	public static void btnclick(WebElement element) {
		element.click();
	}
	
	public static void textGet(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	
	public static void attributeValueGet(WebElement element,String des) {
		String text = element.getAttribute(des);
		System.out.println(text);
	}
	
	public static void moveelement(WebElement element ) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();	
	}
	public static void rightClick(WebElement element)  {
		Actions a=new Actions(driver);
		a.contextClick(element).perform();	}
	
	public static void drag(WebElement source, WebElement target) {
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}
	public static void keyup(WebElement element, String btn) {
		Actions a=new Actions(driver);
		a.keyUp(element, btn).perform();
	}
	
	public static void keydown ( String btn) {
		Actions a=new Actions(driver);
		a.keyUp( btn).perform();
	
	}

	public static void scrollUp(WebElement element ) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}
	
	public static void scrollDown(WebElement element ) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public static void stylebackground(String colourname, WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(colourname, element);	
	}
	
	public static void fontSize(String fontsize, WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(fontsize, element);	
	}
	
	public static void copyFile() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}
	
	public static void coutFile() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	}
	
	public static void pasteFile() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
	
	public static void alertHandle() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public static void sleep(int time) throws InterruptedException {
		Thread.sleep(time);
	}
	public static void windowsHandling() {
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String id : child) {
			if (!parent.equals(id)) {
				driver.switchTo().window(id);
			}}}
	
	public static void nextpage() {
		driver.navigate().forward();
	}
	
	public static void backpage() {
		driver.navigate().back();
	}
	
		public static void reload() {
			driver.navigate().refresh();
		}
		
	public static void dropdownselect(WebElement element,byte id) {
		Select s=new Select(element);
		s.selectByIndex(id);
	}
	public static void sendkeysvalue(WebElement element,String sendkeys) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(sendkeys, element);
	}
	
	public static void frame(int id) {
		driver.switchTo().frame(id);
	}
	
	public static void dropdownselecttext(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
	public static void dropdownselectvalue(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByValue(text);
	}
	
	public static void getAllOptions(WebElement element) {
		Select s=new Select(element);
		s.getAllSelectedOptions();
		}
	
	public static void getoption (WebElement element) {
		Select s=new Select(element);
		s.getOptions();
	}
	
	public static void getFirstSelectedOption (WebElement element) {
		Select s=new Select(element);
		s.getFirstSelectedOption();
	}
	
	public static void waitim(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public static void waitex(WebElement xpath) {
		WebDriverWait w=new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(xpath));
	}
	
	public static void broswerclose() {
		driver.close();
	}
	
	public static void tabclose() {
	driver.quit();
	}
	
	public static void mousedoubleclick(WebElement target) {
		Actions a=new Actions(driver);
		a.doubleClick(target).perform();
		
	}
	public static void alertConfrom() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void alertCancel() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	public static void alertsendkey(String text) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
	}
	
	public static void alertgettext(String text) {
		Alert alert = driver.switchTo().alert();
		alert.getText();
	}
	
	public static void frameelement(WebElement e) {
		driver.switchTo().frame(e);
		}
	
	public static void deselindex(WebElement e, int index) {
		Select s=new Select(e);
		s.deselectByIndex(index);
	
	}
	public static void deselvalue(WebElement e, String value) {
		Select s=new Select(e);
		s.deselectByValue(value);
	
	}
	
	
	public static void deselvistext(WebElement e,String text) {
		Select s=new Select(e);
		s.deselectByVisibleText(text);
	
	}
	public static void deselall(WebElement e) {
		Select s=new Select(e);
		s.deselectAll();
	}
	
	public static String username(int row, int cell) throws IOException {
		
		File f=new File("E:\\Eclipse\\Sample\\ExcelSheet\\Data.xlsx");
		
		FileInputStream input=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(input);
		
		Sheet sh = w.getSheet("Sheet1");
		
		Row r = sh.getRow(row);
		
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
	public static  void writeexcel(String  text , int row ,int cell) throws IOException {
		
		File f=new File("E:\\Eclipse\\Sample\\ExcelSheet\\Data.xlsx");
		FileOutputStream fout=new FileOutputStream(f);
		Workbook w=new XSSFWorkbook();
		
		Sheet sheet = w.getSheet("Sheet1");
		Row r = sheet.createRow(row);
		Cell createCell = r.createCell(cell);
		createCell.setCellValue(text);
		w.write(fout);

	}
	
	

}

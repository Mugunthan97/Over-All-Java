package org.sample;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.repository.Login;
import org.repository.Search;

import junit.framework.Assert;

public class TestCase extends BaseClass {
		
		@BeforeClass
		public static void openChrome() {
			openBroswer();
			broswerMaximize();
			openUrl("https://adactinhotelapp.com/");
		}
		
//		@AfterClass
//		public static void closebroswer() {
//			broswerClose();
//		}
//		
//		@Before
//		public void startTime() {
//			Date d=new Date();
//		}
//		
//		@After
//		public void endTime() {
//			Date d=new Date();
//		}
		
		@Test
		
		// For Login Page 
		public void tc1() throws Exception {
			Login l=new Login();
			fill(l.getUser().get(0), excelRead(1, 0));
			fill(l.getPass().get(0), excelRead(1, 1));
			Assert.assertEquals("Check User", "Kuppuselvi@97", l.getPass().get(0).getAttribute("Value"));
			
			btnClick(l.getBtnLogin().get(0));
		}
		
		@Test
		
		//For Search Page
		public void tc2() throws Exception {
			Search s=new Search();
			fill(s.getLocation().get(0), excelRead(1, 2));
			fill(s.getHotel().get(0), excelRead(1, 3));
			fill(s.getRoomType().get(0), excelRead(1, 4));
			fill(s.getNoOfRoom().get(0), excelRead(1, 5));
			fill(s.getCheckIn().get(0), excelRead(1, 6));
			fill(s.getCheckOut().get(0), excelRead(1, 7));
			fill(s.getAdults().get(0), excelRead(1, 8));
			fill(s.getChild().get(0), excelRead(1, 9));
			btnClick(s.getBtnSubmit().get(0));
		}
		
	@Test
	public void tc3() throws Exception {
		Select se=new Select();
	btnClick(se.getBtnRadio().get(0));
	btnClick(se.getBtnsubmit1().get(0));
	
	}
	
	

}

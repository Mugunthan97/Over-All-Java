package org.suite;

import java.util.Date;

import org.repository.Details;
import org.repository.Login;
import org.repository.OrderId;
import org.repository.Search;
import org.repository.Select;
import org.sample.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample extends BaseClass {
	
	@Test(groups="smoke")
	private void open() {
		open1();
		maximize();
		loadUrl("https://adactinhotelapp.com/");
	}
	
	@AfterClass (enabled=false)
	private void end() {
		closeBroswer();
	}
	
	@BeforeMethod
	private void timeStart() {
		Date d=new Date();
		System.out.println(d);
	}
	
	@AfterMethod
	private void timeEnd() {
		Date d=new Date();
		System.out.println(d);
	}
	
	@Test(groups="smoke")
	private void tc1() throws Exception {
		
		Login l=new Login(driver);
		fill(l.getTxtuser().get(0), get(1, 0));
		fill(l.getTxtpass().get(0), get(1, 1));
		btnClick(l.getBtnSubmit().get(0));
	}
	
	
	@Test(groups="smoke")
	private void tc2() throws Exception {
		
		Search s=new Search(driver);
		
		fill(s.getLocation().get(0), get(1, 2));
		fill(s.getHotel().get(0), get(1, 3));
		fill(s.getRoomType().get(0), get(1, 4));
		fill(s.getNoOfRoom().get(0), get(1, 5));
		fill(s.getCheckIn().get(0), get(1, 6));
		fill(s.getCheckOut().get(0), get(1, 7));
		fill(s.getAdults().get(0), get(1, 8));
		fill(s.getChild().get(0), get(1, 9));
		btnClick(s.getBtnSubmit().get(0));
	}
	
	@Test(groups= {"smoke","regression"})
	private void tc3() {
		
		Select se=new Select(driver);
		
		btnClick(se.getBtnRadio().get(0));
		btnClick(se.getBtnContinue().get(0));
	}
	
	@Test(groups="smoke")
	private void tc4() throws Exception {
		
		Details d=new Details(driver);
		
		fill(d.getNameFirst().get(0), get(1, 10));
		fill(d.getNameLast().get(0), get(1, 11));
		fill(d.getAddress().get(0), get(1, 12));
		fill(d.getCardNo().get(0), get(1, 13));
		fill(d.getCardType().get(0), get(1, 14));
		fill(d.getExMonth().get(0), get(1, 15));
		fill(d.getExYear().get(0), get(1, 16));
		fill(d.getCvv().get(0), get(1, 17));
		btnClick(d.getBtnSubmit().get(0));
		Thread.sleep(7000);
	}
	
	@Test
	private void tc5() throws Exception {
		
		OrderId o=new OrderId(driver);
		
		String value = o.getOrder().getAttribute("value");
		System.out.println(value);
		write(0, 0, value);
	}
	
}

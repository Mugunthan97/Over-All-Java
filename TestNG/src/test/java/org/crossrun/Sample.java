package org.crossrun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.repository.Details;
import org.repository.Login;
import org.repository.OrderId;
import org.repository.Search;
import org.repository.Select;
import org.sample.BaseClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends BaseClass {

	@Parameters({"browser"})
	@Test

	private void tc2(String Browser) throws Exception {
		
	 WebDriver d2 = openBroswer1(Browser);
     loadUrl("https://adactinhotelapp.com/");
     maximize1(d2);
     WebElement de = driver.findElement(By.id("email"));
   
	

		Login l = new Login(d2);
		fill(l.getTxtuser().get(0), get(1, 0));
		fill(l.getTxtpass().get(0), get(1, 1));
		btnClick(l.getBtnSubmit().get(0));

		Search s = new Search(d2);
		fill(s.getLocation().get(0), get(1, 2));
		fill(s.getHotel().get(0), get(1, 3));
		fill(s.getRoomType().get(0), get(1, 4));
		fill(s.getNoOfRoom().get(0), get(1, 5));
		fill(s.getCheckIn().get(0), get(1, 6));
		fill(s.getCheckOut().get(0), get(1, 7));
		fill(s.getAdults().get(0), get(1, 8));
		fill(s.getChild().get(0), get(1, 9));
		btnClick(s.getBtnSubmit().get(0));

		Select se = new Select(d2);
		btnClick(se.getBtnRadio().get(0));
		btnClick(se.getBtnContinue().get(0));

		Details d = new Details(d2);
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

		 OrderId o = new OrderId(d2);
		 String value = o.getOrder().getAttribute("value");
		 System.out.println(value);
		 write(0, 0, value);

	}

}

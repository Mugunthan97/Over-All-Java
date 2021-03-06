package org.dprovider;

import org.repository.Details;
import org.repository.Login;
import org.repository.OrderId;
import org.repository.Search;
import org.repository.Select;
import org.sample.BaseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class dProvider extends BaseClass {

	@DataProvider(name = "adaction")
	public Object[][] data() {
		return new Object[][] {

				{ "Mugunthan97", "Kuppuselvi@97", "London", "Hotel Sunshine", "Double", "8", "10-05-2021", "12-05-2021",
						"2", "2", "Mugunthan", "Kuppusamy", "Velagoundampatty Namakkal-637212", "1234853160479435",
						"VISA", "May", "2027", "057" },
				{ "Mugunthan97", "Kuppuselvi@97", "London", "Hotel Sunshine", "Double", "8", "10-05-2021", "12-05-2021",
					"2", "2", "Mugunthan", "Kuppusamy", "Velagoundampatty Namakkal-637212", "1234853160479435",
					"VISA", "May", "2027", "057" }};
						

	}

	@BeforeClass
	private void open() {
		open1();
		maximize();
	}
	
	@Test (dataProvider="adaction")
	
	private void tcl(String user,String pass,String location,String hotel,String rtype,String noofroom,String chin,String chout,String adult,String child,String name, String lname,String add,String cnum,String cty,String exmon,String exyear,String cvv) throws Exception {
		loadUrl("https://adactinhotelapp.com/");
		Login l=new Login(driver);
		fill(l.getTxtuser().get(0), user);
		fill(l.getTxtpass().get(0), pass);
		btnClick(l.getBtnSubmit().get(0));
		
		Search s=new Search(driver);
		fill(s.getLocation().get(0), location);
		fill(s.getHotel().get(0), hotel);
		fill(s.getRoomType().get(0), rtype);
		fill(s.getNoOfRoom().get(0), noofroom);
		fill(s.getCheckIn().get(0), chin);
		fill(s.getCheckOut().get(0), chout);
		fill(s.getAdults().get(0), adult);
		fill(s.getChild().get(0), child);
		btnClick(s.getBtnSubmit().get(0));
		
		Select se=new Select(driver);
		btnClick(se.getBtnRadio().get(0));
		btnClick(se.getBtnContinue().get(0));
		
		Details d=new Details(driver);
		fill(d.getNameFirst().get(0), name);
		fill(d.getNameLast().get(0), lname);
		fill(d.getAddress().get(0), add);
		fill(d.getCardNo().get(0), cnum);
		fill(d.getCardType().get(0), cty);
		fill(d.getExMonth().get(0), exmon);
		fill(d.getExYear().get(0), exyear);
		fill(d.getCvv().get(0), cvv);
		btnClick(d.getBtnSubmit().get(0));
		Thread.sleep(7000);
		
		OrderId o=new OrderId(driver);
		String value = o.getOrder().getAttribute("value");
		System.out.println(value);
		write(0, 1, value);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
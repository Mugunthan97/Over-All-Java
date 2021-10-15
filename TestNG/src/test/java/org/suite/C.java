package org.suite;

import org.repository.Search;
import org.sample.BaseClass;
import org.testng.annotations.Test;

public class C extends BaseClass{
	
	@Test
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
	
	

}

package org.suite;

import org.junit.Test;
import org.repository.Search;
import org.sample.BaseClass;

public class Tc2 extends BaseClass{

	@Test
	
	//For Search Page
	public void tc22() throws Exception {
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
}

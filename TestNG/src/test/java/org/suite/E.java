package org.suite;

import org.repository.Details;
import org.sample.BaseClass;
import org.testng.annotations.Test;

public class E extends BaseClass {

	@Test
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
}

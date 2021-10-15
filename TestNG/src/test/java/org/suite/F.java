package org.suite;

import org.repository.OrderId;
import org.sample.BaseClass;
import org.testng.annotations.Test;

public class F extends BaseClass {
	

	@Test
	private void tc5() {
		
		OrderId o=new OrderId(driver);
		
		String value = o.getOrder().getAttribute("value");
		System.out.println(value);
	}
	

}

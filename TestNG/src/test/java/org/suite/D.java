package org.suite;

import org.repository.Select;
import org.sample.BaseClass;
import org.testng.annotations.Test;

public class D  extends BaseClass{

	@Test
	private void tc3() {
		
		Select se=new Select(driver);
		
		btnClick(se.getBtnRadio().get(0));
		btnClick(se.getBtnContinue().get(0));
	}
}

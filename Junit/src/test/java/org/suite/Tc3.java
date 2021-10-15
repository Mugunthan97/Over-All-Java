package org.suite;

import org.junit.Test;
import org.sample.BaseClass;
import org.sample.Select;

public class Tc3 extends BaseClass {
	
	@Test
	public void tc3() throws Exception {
		Select se=new Select();
	btnClick(se.getBtnRadio().get(0));
	btnClick(se.getBtnsubmit1().get(0));
	
	}

}

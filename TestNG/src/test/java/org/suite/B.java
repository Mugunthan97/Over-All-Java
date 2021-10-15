package org.suite;

import org.openqa.selenium.WebDriver;
import org.repository.Login;
import org.sample.BaseClass;
import org.testng.annotations.Test;

public class B extends BaseClass{

	

	@Test
	private void tc1(WebDriver driver) throws Exception {
		
		Login l=new Login(driver);
		fill(l.getTxtuser().get(0), get(1, 0));
		fill(l.getTxtpass().get(0), get(1, 1));
		btnClick(l.getBtnSubmit().get(0));
	}
}

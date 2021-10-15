package org.run;

import java.util.Date;
import org.helper.BaseClass;
import org.repository.Fblogin;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Adactin extends BaseClass {
	@BeforeClass
	private void launch() {
		openBrowser();
		launchUrl("https://en-gb.facebook.com/");
		maximize();
	}

	@BeforeMethod
	private void time() {
		Date d = new Date();
	}

	@Test
	private void tc1() throws Throwable {
		
		Fblogin f = new Fblogin();

		fill(f.getTxtemail().get(0), "Java@gmail.com");
		fill(f.getTxtpass().get(0), "java@123");
		btnClick(f.getBtnLogin());
	}

}

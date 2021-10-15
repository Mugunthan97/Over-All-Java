package org.suite;

import org.sample.BaseClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Fb extends BaseClass {

	@Test(dataProvider = "fbHome")

	private void tc1(String name, String last, String ph, String pass, String date, String month, String year) {
		open1();
		maximize();

		loadUrl("https://www.facebook.com/campaign/landing.php?&campaign");
		loginFb l = new loginFb();

		fill(l.getfName(), name);
		fill(l.getlName(), last);
		fill(l.getEmail(), ph);
		fill(l.getPass(), pass);
		fill(l.getDate(), date);
		fill(l.getMonth(), month);
		fill(l.getYear(), year);
		btnClick(l.getGender());
		btnClick(l.getSignup());

	}

	@DataProvider(name = "fbHome")
	public Object[][] data() {
		return new Object[][] {

				{ "Mugunthan", "Kuppusamy", "9543888755", "AbcD@1234", "05", "Aug", "1997" },
				{ "Mukilan", "Kuppusamy", "9944007151", "AbcD@1234", "05", "Aug", "1997" },
				{ "Abc", "cba", "123456789", "Abcd@1250", "05", "Aug", "1997" } };
	}
}
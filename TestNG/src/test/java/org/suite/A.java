package org.suite;

import org.sample.BaseClass;
import org.testng.annotations.Test;

public class A extends BaseClass{
	
	@Test
	private void open() {
		open1();
		maximize();
		loadUrl("https://adactinhotelapp.com/");
	}

}

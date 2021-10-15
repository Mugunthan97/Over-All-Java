package org.stepdefination;

import org.helper.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {

	@Before
	public void befsc() {
		System.out.println("Browser Open");
		openBroswer();
		maximize();
	}

	@After
	public void close(Scenario s) {
		
		if (s.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot) driver;
			byte[] screen = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(screen, "image/png");
		}
		
		System.out.println("Browser Close");
		clse();
	}
}

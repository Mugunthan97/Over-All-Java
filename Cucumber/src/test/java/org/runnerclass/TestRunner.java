package org.runnerclass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmreport.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepdefination", dryRun = false, monochrome = true, strict = true,plugin= {"html:Htmlreport","junit:JunitReport\\failed.xml","json:JsonReport\\freport.json","rerun:E:\\Eclipse\\Cucumber\\Rerun\\failed.txt"})
public class TestRunner  {
	
	@AfterClass
	public static void report() {
		
		JvmReport.generatejvmreport("E:\\Eclipse\\Cucumber\\JsonReport\\freport.json");

	}

}

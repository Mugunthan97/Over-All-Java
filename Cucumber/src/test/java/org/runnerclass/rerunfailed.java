package org.runnerclass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmreport.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@Rerun\\failed.txt",dryRun=false,monochrome=true, glue = "org.stepdefination", plugin= {"rerun:E:\\Eclipse\\Cucumber\\Rerun\\failed.txt"})
public class rerunfailed {
	
	@AfterClass
	public static void report() {
		
		JvmReport.generatejvmreport("E:\\Eclipse\\Cucumber\\JsonReport\\freport.json");

	}

}

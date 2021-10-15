package org.jvmreport;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generatejvmreport(String jsonreportpath) {
		
		//1. Mention the location to save report
		File f=new File("E:\\Eclipse\\Cucumber\\JvmReport");
		
		//2. Add details to he report using configuraion class
		Configuration c= new Configuration(f, "Amazon&Facebook");
		
		c.addClassifications("Plotform Name", "Windows");
		c.addClassifications("Version", "Windows 10");
		c.addClassifications("Browser", "Chrome Browser");
		c.addClassifications("Browser Version", "92.0");
		c.addClassifications("Sprint No", "5");
		
		
		//3. Add json file path inti list<String>
		List<String> l=new ArrayList<String>();
		l.add(jsonreportpath);
		
		//4.create object for rebuilder class
		ReportBuilder rb=new ReportBuilder(l, c);
		
		//5.Using the object call reportgeneraion method
		 rb.generateReports();
		
		
		

	}

}

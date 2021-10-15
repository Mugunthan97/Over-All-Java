package org.test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOperation {
	
public static void main(String[] args) throws IOException {
	
	File f=new File("D:\\java\\text\\abc\\data.txt");
	  
//	  boolean mkdirs = f.mkdirs();
//	  System.out.println(mkdirs);
	  
//	  boolean createNewFile = f.createNewFile();
//	  System.out.println(createNewFile);
	  
	//FileUtils.write(f, "Welcome To java \nWelcome To Selenium \nWelcome To Sql ");  
	  
	  List<String> r = FileUtils.readLines(f);
	 for (int i = 0; i < r.size(); i++) {
		String string = r.get(i);
		System.out.println(string);
	}

  
}
}
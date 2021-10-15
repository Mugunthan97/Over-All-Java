package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("E:\\Eclipse\\RevisionFramework\\Excel\\Data driven.xlsx");
		
		FileInputStream fInput=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fInput);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(0);
		
		Cell cell = r.getCell(0);
		
		System.out.println(cell);
		
		
	}
	

}

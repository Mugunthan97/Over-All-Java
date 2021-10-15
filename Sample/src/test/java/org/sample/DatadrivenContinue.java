package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatadrivenContinue {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("E:\\Eclipse\\Sample\\ExcelSheet\\Datadriven.xlsx");
		
		FileInputStream finput=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(finput);
		
		Sheet sheet = w.getSheet("Details");
		int noOfRows = sheet.getPhysicalNumberOfRows();
		
		for (int i = 0; i < noOfRows; i++) {
			
			Row r = sheet.getRow(i);
			int noOfCell = r.getPhysicalNumberOfCells();
			 
			for (int j = 0; j < noOfCell; j++) {
				
				Cell cell = r.getCell(j);
				int cellType = cell.getCellType();
				
				if (cellType==1) {
					String Value = cell.getStringCellValue();
					System.out.println(Value);
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					
					java.util.Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat d=new SimpleDateFormat("dd-MM-yyyy");
					String value = d.format(dateCellValue);
					System.out.println(value);
				}
				else {
					double numericCellValue = cell.getNumericCellValue();
					long l=(long)numericCellValue;
					String value = String.valueOf(l);
					System.out.println(value);
				}
			}	
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

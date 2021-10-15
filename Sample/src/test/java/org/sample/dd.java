package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dd {

	public static void main(String[] args) throws IOException {

		File f = new File("E:\\Eclipse\\Sample\\ExcelSheet\\Datadriven.xlsx");

		FileInputStream fi = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fi);

		Sheet sheet = w.getSheet("Details");

		Row row = sheet.getRow(1);

		Cell cell = row.getCell(2);

		System.out.println(cell);

	}

}

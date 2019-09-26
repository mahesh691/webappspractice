package com.ExcelDataTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataSending_file {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(".\\\\src\\\\com\\\\ExcellData\\\\dataText.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		Row r=sheet.createRow(1);
		Cell c=r.createCell(1);
		c.setCellValue("is love my country");
		
		FileOutputStream fos = new FileOutputStream(".\\\\src\\\\com\\\\ExcellData\\\\dataText.xlsx");
		workbook.write(fos);
	}

}

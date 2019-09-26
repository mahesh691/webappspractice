package com.ExcelDataTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataGetting_File {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(".\\src\\com\\ExcellData\\dataText.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		Row r=sheet.getRow(1);
		Cell c=r.getCell(0);
		String data=c.getStringCellValue();
		System.out.println(data);
	}

}

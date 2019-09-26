package com.ExcelDataTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataGetting_DataAsign {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("E:\\JavaProgrammes\\WebApplication\\src\\com\\ExcellData\\Data_asign.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int  rowcount=sheet.getLastRowNum();//count the rows in the workboook but it showing rows-1
		
		for(int i=0;i<=rowcount;i++) {
		Row	row=sheet.getRow(i);
		int colcount=row.getLastCellNum();//cells in the rows count exactly
		
		for(int j=0;j<colcount;j++) {
			Cell cell=row.getCell(j);
			
			String data=cell.getStringCellValue(); //getting cell value
			System.out.print(data+" ");
		}
		System.out.println();
		}
	}

}

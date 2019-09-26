package com.ExcelDataTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("E:\\JavaProgrammes\\WebApplication\\src\\com\\ExcellData\\Data_asign.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sheet= wb.getSheet("Sheet3");
		int rc=sheet.getLastRowNum();
		for(int i=0;i<=rc;i++){
		Row r=sheet.getRow(i);
		Cell c=r.getCell(1);
		
		 if(c.getCellType()==CellType.NUMERIC)
		 {
			 c.setCellType(CellType.STRING); 
			 }
		 
		String s=c.getStringCellValue();
		System.out.println(s);
		}		
	}

}

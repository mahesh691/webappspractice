package com.Action_KeywordsScripts2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.Action_Keywords.LoginKeywords;

public class LoginORHRM {

	@Test
	public void login() throws IOException {
		
	LoginKeywords keys=new LoginKeywords();
	
	FileInputStream file = new FileInputStream("E:\\JavaProgrammes\\WebApplication\\src\\com\\Action_Keywords\\OrangeHRMLogINData.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(file);
	XSSFSheet sh= wb.getSheet("Sheet1");
	Row r=null;
	int rowcount=sh.getLastRowNum();
	
	for(int i=1;i<=rowcount;i++) {
		r=sh.getRow(i);
	String	runmode=r.getCell(4).getStringCellValue();
		if(runmode.equals("Y")) {
			
		String keyword=r.getCell(3).getStringCellValue();
		if(keyword.equals("launchBrowser")) {
			keys.launchBrowser();
			
		}else 
			if(keyword.equals("navigate")) {
			keys.navigate();
		}else 
			if(keyword.equals("enterusername")) {
			keys.enterusername();
		}else 
			if(keyword.equals("enterpassword")) {
			keys.enterpassword();
		}else 
			if(keyword.equals("clicklogin")) {
			keys.clicklogin();
		}
	}
}
}
}
package com.ExcelDataTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTourRegister {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		String url="http://newtours.demoaut.com/";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get(url);
		
		WebElement registerlink=driver.findElement(By.linkText("REGISTER"));
		registerlink.click();
		
		FileInputStream file = new FileInputStream("E:\\JavaProgrammes\\WebApplication\\src\\com\\ExcellData\\Data_asign.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sheet= wb.getSheet("Sheet3");
		int rc=sheet.getLastRowNum();
		for(int i=0;i<=rc;i++) {
			Cell cell=sheet.getRow(i).getCell(1);
			String celltext="";
			
			if(cell.getCellType()==CellType.STRING) 
			{
				celltext=cell.getStringCellValue();
				System.out.println(celltext);
				
			}else 
				if(cell.getCellType()==CellType.NUMERIC) 
				{
					cell.setCellType(CellType.STRING);
					celltext=String.valueOf(cell.getStringCellValue());
					System.out.println(celltext);
					
				}else 
					if(cell.getCellType()==CellType.BLANK) 
					{
						celltext="";
					}
	Thread.sleep(2000);
	try {
	WebElement fn=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr["+(i+2)+"]/td[2]/input"));
	fn.sendKeys(celltext);	
	fn.sendKeys(Keys.TAB);
	
	}catch(Exception p) {
		
	}
// 		/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input
//		/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input
//		/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input
		
		
		}// end loop		
		WebElement country=driver.findElement(By.name("country"));
		Select selection= new Select(country);
		selection.selectByVisibleText("INDIA");
		
		driver.findElement(By.name("register")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String expcurrenturl="http://newtours.demoaut.com/create_account_success.php";
		System.out.println(expcurrenturl);
		String actcrrenturl=driver.getCurrentUrl();
		System.out.println(actcrrenturl);
		if(actcrrenturl.contentEquals(expcurrenturl)) {
			System.out.println("successfull registration");
		}else {
			System.out.println("registration failed");
		}
		
		
		}
		
		
	}


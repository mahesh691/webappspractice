package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		String url="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
//		/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a   tagName--tr for rows
		for(int i=0;i<rows.size();i++) {// goto every rows 
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));// tagName td for columns in a row
			for(int j=2;j<cols.size();j++) {
				System.out.print(cols.get(j).getText()+"  ");
			}
			System.out.println();
		}
		driver.close();
	}

}

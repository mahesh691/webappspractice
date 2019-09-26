package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class data {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		String url="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(10000);
// first row  first column property		
//		/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
// last row  last column property	
//		/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]/a
	
		for(int i=1;i<=36;i++) {
			for(int j=1;j<=8;j++) {
				WebElement data=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td["+j+"]"));
			System.out.print(data.getText()+"  ");
			
			}
		}System.out.println();
		
	}

}

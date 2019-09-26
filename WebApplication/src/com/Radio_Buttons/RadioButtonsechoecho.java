package com.Radio_Buttons;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsechoecho {

	public static void main(String[] args) {
		WebDriver driver = null;
		String url="http://echoecho.com/htmlforms10.htm";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get(url);
		
		WebElement radioButtonBlock=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> group1RadioButtons=radioButtonBlock.findElements(By.name("group1"));
//		<input type="radio" name="group1" value="Milk">
//		<input type="radio" name="group1" value="Butter" checked="">
//		<input type="radio" name="group1" value="Cheese">
		int group1RadioButtonsCount=group1RadioButtons.size();	
		System.out.println("The Number of Radio Buttons in the Group1 :"+group1RadioButtonsCount);
		
		List<WebElement> group2RadioButtons=radioButtonBlock.findElements(By.name("group2"));
		int group2RadioButtonsCount=group2RadioButtons.size();	
		System.out.println("The Number of Radio Buttons in the Group2 :"+group2RadioButtonsCount);

		for(int i=0; i<group1RadioButtonsCount; i++) {
			for(int k=0;k<group1RadioButtonsCount;k++) {
				group1RadioButtons.get(i).click();

				System.out.println("the status of the radio button in Group1 :"+group1RadioButtons.get(k).getAttribute("value")+"-"+group1RadioButtons.get(k).isSelected());
			}
			
			for(int k=0;k<group2RadioButtonsCount;k++) {
				group2RadioButtons.get(i).click();
				System.out.println("the status of the radio button in Group2 :"+group2RadioButtons.get(k).getAttribute("value")+"-"+group2RadioButtons.get(k).isSelected());

			}	
		}
		
		driver.quit();
	}

}

package com.Google_Images;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleImage_Title {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =null;
		String url="https://www.google.com";
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get(url);
		System.out.println("opened google page");
		
//		<a class="gb_e" data-pid="2" href="https://www.google.co.in/imghp?hl=en&amp;tab=wi&amp;ogbl">Images</a>
//anchor tag of image link
//		take link text as locator, selector is a Images
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(1000);
		System.out.println("title of google image home page:"+driver.getTitle());
//		<div style="background-size:272px 92px;height:92px;width:272px" title="Google Images" id="hplogo" align="left"><div class="logo-subtext"><span>images</span></div></div>
		try {
			if(driver.findElement(By.id("hplogo")).isDisplayed()==true){
				System.out.println("pass");
			}}
			catch(Exception p) { 
				System.out.println("fail");
			}
		}
		
		
		
	}




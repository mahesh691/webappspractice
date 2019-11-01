package com.PracticeSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class Screenshot extends Base{
@Test
public void gmail() throws IOException {
	driver.get("https://www.gmail.com");
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File fi=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(fi,new File("C:\\\\Users\\\\user\\\\git\\\\repository\\\\myrepository\\\\WebApplication\\\\screenShots\\\\gmail.png"));

}
}

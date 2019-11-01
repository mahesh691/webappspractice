package com.PracticeSelenium;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class HtmlReport {
	ExtentReports report;
	ExtentTest test;
	
@Test
public void test1() {
	
	test=report.createTest("praactice");
	
	System.out.println("reports create test");
	test.pass("printed");
	
}
	
@BeforeSuite
public void  extentReports() {
	ExtentHtmlReporter extent=new ExtentHtmlReporter("C:\\Users\\user\\git\\repository\\myrepository\\WebApplication\\preopers\\OhrmReports.html");
	report=new ExtentReports();
	report.attachReporter(extent);
//Test	=reports.createTest("asd");
		}

}
package com.AutomationPractice;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
	import org.testng.annotations.*;
	import com.aventstack.extentreports.*;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;
	public class ExtentReportExample {
	    ExtentReports extent;
	    ExtentTest test;
  
	    @BeforeSuite
	    public void setupReport() {
	        // Report path
	        ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");

	        // Create ExtentReports object
	        extent = new ExtentReports();
	        extent.attachReporter(spark);

	        // Add system info
	        extent.setSystemInfo("Tester", "Udhaya");
	        extent.setSystemInfo("Browser", "Chrome");
	    }

	    @Test
	    public void passTest() {
	        test = extent.createTest("Pass Test Case");
	        test.pass("This test passed successfully!");
	    }

	    @Test
	    public void failTest() {
	        test = extent.createTest("Fail Test Case");
	        test.fail("This test failed!");
	    }

	    @AfterSuite
	    public void tearDownReport() {
	        extent.flush(); // Write all logs to report
	    }
	}

	



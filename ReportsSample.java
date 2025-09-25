package com.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ReportsSample {
	WebDriver driver;
	ExtentReports extent;// decides where will be the reports store
	ExtentTest test;
	@BeforeSuite
	public void log() {
		ExtentSparkReporter spark=new ExtentSparkReporter
				("test-output/Report1.html");
		
		extent=new ExtentReports();
		extent.attachReporter(spark);
	}
	
	@Test
	public void FailDown() {
		test=extent.createTest("failed test Case...");
		test.fail("This test has failed...");
	}
	@Test
	public void passUp() {
		test=extent.createTest("PassTest Case");
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");

		driver.findElement(By.id("username")).sendKeys("udhaya3099@gmail.com");
		driver.findElement(By.id("password")).sendKeys("U21@dhaya");
		driver.findElement(By.id("login")).click();
		driver.quit();
		test.pass("This test has been passed successfully...");
	}
	@AfterSuite
	public void tearDown() {
		extent.flush();//flush--> write all logs to report
	}

}

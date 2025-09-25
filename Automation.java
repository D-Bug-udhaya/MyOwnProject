package com.AutomationPractice;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Automation {

	@BeforeSuite
	public void durga() {
		System.out.println("A for Apple..");
	}
	
	@BeforeClass
	public void jayaShree() {
		System.out.println("C  for Cat");
	}
	
	@BeforeMethod
	public void alpha() {
		System.out.println("D for dolphin ");
	}
	
	@Test
	public void beta() {
		// TODO Auto-generated method stub
		System.out.println("B indicates Beta");
	}
	
	@Test
	public void gamma() {
		System.out.println("Gamma");
	}

	@AfterMethod
	public void sub() {
		System.out.println("Subtraction");
	}
	
	@AfterClass
	public void multi() {
		System.out.println("Addition");
	}
	
	
	@AfterSuite
	public void endD() {
		System.out.println("Quit");
	}
	
}

package com.AutomationPractice;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	static WebDriver driver;
	@BeforeAll
	public static void start() {
		System.out.println("Started");
	}
	
	@BeforeEach
	public void log() {
		driver=new ChromeDriver();
	}
	
	
	@Test
	public void add() {
		driver.get("https:www.amazon.in");
	}

	@Test
	public void aa() {	
		driver.get("https:www.facebook.com");
		
	}
	
	@Test
	public void bb() {
		driver.get("https:www.flipkart.com");
	}
		
	@AfterEach
	public void logout() {
		driver.close();
	}
	
	@AfterAll
	public static void sign() {
		System.out.println("SignOut");
	}
	

}

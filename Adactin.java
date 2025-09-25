package com.AutomationPractice;

import org.testng.annotations.Test;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Adactin {
static WebDriver driver;
	@Test(invocationCount = 3, threadPoolSize = 2)
	public static void log() {
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");

		driver.findElement(By.id("username")).sendKeys("udhaya3099@gmail.com");
		driver.findElement(By.id("password")).sendKeys("U21@dhaya");
		driver.findElement(By.id("login")).click();
		driver.quit();
	}
	
	@Test(invocationCount = 3, threadPoolSize = 2)
	public static void statement() {
		System.out.println("If log failed i will not run...");
	}
	
	
	
	
}

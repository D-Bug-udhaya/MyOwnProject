package com.AutomationPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Paarameters {
	static RemoteWebDriver driver;
	@Test
	@Parameters({"email","password","browser"})
	public static void login(String em,String pwd,String browser) {
		switch (browser) {
		case "Chrome":
			driver=new ChromeDriver();
			break;
		case "Edge":
			driver=new EdgeDriver();
			break;
		default:
			break;
		}
		
		driver.get("https:www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(em);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
	}
}

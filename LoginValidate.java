package com.AutomationPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class LoginValidate {
	static SoftAssert sa;//sa-->vriable
	static WebDriver driver;
	
	@BeforeMethod
	public static void url() {
		driver=new ChromeDriver();
		driver.get("https:www.facebook.com");
		sa=new SoftAssert();//sa-->object
		
	}
	
	@AfterMethod
	public static void tearDown() {
		driver.quit();
	}
	@Test
	public static void login() {
		//Verification-->Hard assert
		Assert.assertTrue(driver.getTitle().contains("Facebook"), 
				"Verification Failed:Title mismatch");

		//Validate--->Soft assert
		
		sa.assertTrue(driver.findElement(By.id("email")).isDisplayed(),
				"Validatation Failed:Email Field not visible");
		
		sa.assertTrue(driver.findElement(By.id("pass")).isDisplayed(),
				"Validation failed:Password Field not visible");
		
		//1==Log In
		// comparing the value of the attribute "VALUE" in the login button with "Log In"
		
		
		WebElement log = driver.findElement(By.name("login"));	
		sa.assertEquals(log.getAttribute("value"),
				"Log In","Validation failed: Button text mismatch");
		sa.assertAll();//Collect validation results
		
		
		
		
		
	}

}

package com.AutomationPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test; 
public class AdactHome extends BaseClass{
		//WebDriver driver
		//driver.findElement
		@BeforeSuite
		public void launch() {
		launchBrowser("https://adactinhotelapp.com/");
		}
		
		@Test
		public void test() {
		AdactPOM ap=new AdactPOM(driver);
	
		//WebElement user = driver.findElement(By.id("username"));	
		passValue(ap.getUserName(),"Udhaya999");
		passValue(ap.getPwd(),"U21@dhaya");
		clickOnElement(ap.getLog());
		}
		
		@AfterSuite
		public void terDown() {
			quitBrowser();
	
	}

}

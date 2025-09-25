package com.AutomationPractice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.Data1;
public class OrangeLogin{
	@Test(dataProvider = "login",dataProviderClass = Data1.class)
	public void log(String em,String pass) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(em);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.quit();
	}
	@Test(dataProvider = "fblogin",dataProviderClass = Data1.class)
	public void fb(String em,String pwd) {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https:www.facebook.com");
	 driver.findElement(By.name("email")).sendKeys(em);
	 driver.findElement(By.name("pass")).sendKeys(pwd);
	 driver.quit();
	}
	
	
	
	
	
	

}

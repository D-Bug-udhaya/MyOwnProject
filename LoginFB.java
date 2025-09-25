package com.AutomationPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Driver.DataUtils;
import utils.Data1;
public class LoginFB {
	@Test(dataProvider ="getData",dataProviderClass = Data1.class)
	public void log(String email, String pass,String em, String pwd) {
		WebDriver driver=new ChromeDriver();
				driver.get("https:www.facebook.com");
				System.out.println("Email:"+email);
				System.out.println("Passowrd:"+pass);
				driver.findElement(By.id("email")).sendKeys(em);
				driver.findElement(By.id("pass")).sendKeys(pwd);
				System.out.println("Email:"+em);
				System.out.println("Password:"+pwd);
				driver.findElement(By.name("login")).click();
			}
	}


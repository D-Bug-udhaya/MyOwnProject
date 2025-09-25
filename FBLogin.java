package com.AutomationPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class FBLogin {
	RemoteWebDriver driver;
	
	@Parameters({"username","pass","browser"})
	@Test
	void logIn(String em,String pwd,String browser) {
		switch (browser) {
		case "Chrome":
			driver=new ChromeDriver();
			break;
		case "Edge":
		System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\HandOnProject\\AutomationPractice\\Driver\\msedgedriver.exe");
		driver=new EdgeDriver();
		
		System.out.println("Browser Version:"+((EdgeDriver)driver).getCapabilities().getBrowserVersion());

			break;
		default:
			break;
		}
		//WebDriver driver=new ChromeDriver();
		driver.get("https:www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(em);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
	}

}

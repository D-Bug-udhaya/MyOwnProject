package com.AutomationPractice;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class SS {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("u@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("U@123..");
		driver.findElement(By.name("login")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\admin\\HandOnProject\\AutomationPractice\\SS//fbLog.png");
		FileUtils.copyFile(src, des);	
		
		//FileHandler.copy(src,des);
		
		
		
	}

}

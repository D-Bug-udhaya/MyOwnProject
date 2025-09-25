package com.AutomationPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Myntra {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement em = driver.findElement(By.id("email"));
		em.sendKeys("u@gmail.com");//sendkeys--> to pass value 
		//into the textfield
		
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("U@123");
		
		
		WebElement log = driver.findElement(By.name("login"));
		log.click();
	
	}
}

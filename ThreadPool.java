package com.AutomationPractice;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadPool {
	
	  // Example 1: threadPoolSize
    @Test(expectedExceptions = NoSuchElementException.class,timeOut = 10000)
    public void parallelExecutionExample() {
    	WebDriver driver=new ChromeDriver();
    	driver.get("https:www.facebook.com");
    	driver.findElement(By.name("emai")).sendKeys("u@gmail.com");
    	//driver.findElement(By.name("password")).sendKeys("U@1233");
        System.out.println("Executed....");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public static void arithmetic() {
    	int a=10;
    	int b=a/0;
    	System.out.println(b);
    }
   
}


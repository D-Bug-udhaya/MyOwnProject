package com.AutomationPractice;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://cosmocode.io/automation-practice-webtable/");
//	WebElement tab = driver.findElement(By.id("countries"));
//	System.out.println(tab.getText());
	
	WebElement ninth = driver.findElement(By.xpath("//strong[text()='Australia']"));
	System.out.println("9th row 2nd column data:"+ninth.getText());
	
	WebElement tenth = driver.findElement(By.xpath("//table[@id='countries']//tr[10]//td[3]"));
	System.out.println("10th row 3rd column:"+tenth.getText());
	
	List<WebElement> check = driver.findElements(By.xpath("(//input[@type='checkbox'])"));
	
	WebElement ch1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
	ch1.click();
	
	
	WebElement ch2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[9]"));
	ch2.click();
	
	
	WebElement ch3 = driver.findElement(By.xpath("(//input[@type='checkbox'])[45]"));
	ch3.click();
	
	
	WebElement ch4 = driver.findElement(By.xpath("(//input[@type='checkbox'])[36]"));
	ch4.click();
	
	WebElement ch5 = driver.findElement(By.xpath("(//input[@type='checkbox'])[79]"));
	ch5.click();
	
	
	WebElement ch6 = driver.findElement(By.xpath("(//input[@type='checkbox'])[101]"));
	ch6.click();
	
	int count =0,v=0;
	ListIterator<WebElement> w = check.listIterator();
	
	while(w.hasNext()) {
		WebElement ch = w.next();
		ch.click();
		if(ch.isEnabled()) {
			count ++;
		}
		if(ch.isSelected()) {
			v++;
		}		
	}
	System.out.println("Total number of checkboxes enabled:"+count);
	System.out.println("Total number of checkboxes selected:"+v);
}
}

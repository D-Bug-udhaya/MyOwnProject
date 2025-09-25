package com.AutomationPractice;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.reactivex.rxjava3.functions.Action;

public class ClubFactory {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		Actions a = new Actions(driver);
		WebElement bi = driver.findElement(By.xpath("//a[text()='Our Blog ']"));
		a.contextClick(bi).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		WebElement bm = driver.findElement(By.xpath("//a[text()='Help Center']"));
		a.contextClick(bm).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String parent = driver.getWindowHandle();
		System.out.println(parent);	
		Set<String>  child = driver.getWindowHandles();
		System.out.println(child);
	     Iterator<String> i = child.iterator();
		while(i.hasNext()) {
			String ch = i.next();
			if(!parent.equals(ch)) {//home!=ch
			String title = driver.switchTo().window(ch).getTitle();
			System.out.println(title);
			Thread.sleep(3000);
			driver.close();
			}
		}
	}

}

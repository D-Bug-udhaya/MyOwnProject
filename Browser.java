package com.AutomationPractice;
import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class Browser {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();// to open the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// driver.switchTo().alert().accept();

//		List<WebElement> features= driver.findElements(By.xpath("//span[contains(@class,\"oxd\")]"));
//		System.out.println(features);
//
//		
//		for(WebElement w:features) {
//			System.out.println(w.getText());
//		}
		driver.findElement(By.xpath("(//span[contains(@class,\"oxd\")])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Thulasi");
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
		// driver.findElement(By.xpath("(//div[text()='Admin'])[1]")).click();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);

		driver.get("https://www.leafground.com/select.xhtml");
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select s = new Select(dropdown);// selectByIndex,selectByValue,selectByVisibleText
		s.selectByIndex(2);

		Thread.sleep(3000);
		s.selectByVisibleText("Selenium");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\admin\\HandOnProject\\AutomationPractice\\Screenshot//image.png");
		FileUtils.copyFile(src, dest);
		// driver.close();

	}

}

package com.AutomationPractice;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown {
	public static void multiple() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		WebElement car = driver.findElement(By.id("cars"));
		Select s = new Select(car);
		s.selectByIndex(2);

		Thread.sleep(3000);

		s.selectByValue("volvo");

		Thread.sleep(3000);

		s.selectByVisibleText("Audi");

		WebElement fso = s.getFirstSelectedOption();
		System.out.println(fso.getText());
		s.deselectAll();

	}

	public static void main(String[] args) throws InterruptedException {

		multiple();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement course = driver.findElement(By.xpath("(//select[contains"
				+ "(@class,'ui')])[1]"));
		Select s=new Select(course);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByVisibleText("Cypress");
		
		List<WebElement> opt = s.getOptions();	
		for(WebElement w:opt) {
			String text = w.getText();
			System.out.println(text);
		}
	}
}

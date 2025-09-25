package com.AutomationPractice;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class RobotClass {	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.out.println("hai");
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);
		
		r.keyPress(KeyEvent.VK_B);
		r.keyRelease(KeyEvent.VK_B);
		
		r.keyPress(KeyEvent.VK_U);
		r.keyRelease(KeyEvent.VK_U);
		
		r.keyPress(KeyEvent.VK_G);
		r.keyRelease(KeyEvent.VK_G);
		
		
		
	}}
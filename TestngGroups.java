package com.AutomationPractice;
import javax.swing.GroupLayout.Group;
import org.testng.annotations.Test;
public class TestngGroups {
	@Test(groups={"smoke"})
	public static void log() {
		System.out.println("Login");
	}
	
	@Test(groups= {"regression"})
	public static void cart() {
		System.out.println("CHeck Out");
	}
	
	@Test(groups= {"smoke"})
	public static void SignUp() {
		System.out.println("User Registration");
	}
	
	@Test(groups= {"sanity"})
	public static void payment() {
		System.out.println("Transaction");
	}
	@Test(groups= {"regression"})
	public static void Product() {
		System.out.println("List of products");
	}
	
	@Test(groups= {"smoke"})
	public static void SignOut() {
		System.out.println("LogOut");
	}
	

}

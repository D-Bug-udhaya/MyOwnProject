package com.AutomationPractice;
public class ExceptionC {
	public static void main(String[] args) {
		int a=80;
		int b=0;
		try {
		
			throw new OwnException("File is missing!!");
		}	
		catch(Exception ex) {
			System.out.println("Exception occur due to:"+ex.getMessage());
		}
		finally {
			System.out.println("Exception handled!!1");
			System.out.println("HAi");
		}
		}
	}



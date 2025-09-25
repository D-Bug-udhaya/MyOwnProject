package com.AutomationPractice;

class OwnException extends Exception{
	public OwnException(String msg) {//Constructor
		super(msg);
	}
}
public class Main {
	public static void main(String[] args) {
		try {
			throw new OwnException("This is my customized exception");
		
		}catch(Throwable ex) {
			System.out.println(ex.getMessage());
		}
	}
}

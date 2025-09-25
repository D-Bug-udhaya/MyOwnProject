package com.AutomationPractice;

public class Arra {

	
	public static void main(String[] args) {
		int a[][]=new int [4][2];
		System.out.println(a.length);
		a[0][0]=98;
		a[0][1]=98;
		a[1][0]=98;
		a[1][1]=98;
		a[2][0]=98;
		a[2][1]=98;
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				System.out.println(a[i][j]);
			}
		}
		
	}
}

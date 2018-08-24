package com.pojo;

import java.util.Scanner;

public class DemoScanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in) ;
		System.out.println("please enter number");
		int num= s.nextInt();
		System.out.println("please enter number");
		int num1= s.nextInt();
		System.out.println("please enter number");
		int num2= s.nextInt();
		System.out.println(num1+num2);
		
		
	}

}

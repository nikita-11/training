package com.pojo;

import java.util.Scanner;

public class newTestEmployee {
	public static void main (String [] args) {
		Scanner d= new Scanner(System.in) ;
		System.out.println("Enter age");
		int age = Integer.parseInt(d.next());
		System.out.println("Enter name");
		String name = d.next() ;
		System.out.println("Enter Id");
		int Id = Integer.parseInt(d.next());
		System.out.println("Enter Salary");
		int salary = d.nextInt();
		
		Employee emp = new Employee (Id, salary ,age, name) ;
		emp.show() ;
		
		
	}

}

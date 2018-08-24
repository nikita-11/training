package com.pojo;

//import java.util.Arrays;
import java.util.Scanner;

public class Student {
	String name ;
	int[] marks = new int[5];
	int rollno ;
	public Student() {
		
	}
	Scanner s = new Scanner(System.in) ;
	
	public Student(String name1 , int size, int rollno_1) {
		
		name= name1 ;
		rollno = rollno_1;
		//marks = Arrays.copyOf(maze,5) ;
		for(int i=0; i<size;i++) {
			System.out.println("please enter marks:");
			marks[i] = s.nextInt();
			
		}
		
	}
	public void display() {
		System.out.println(name +"\t"+ rollno);
		System.out.println(marks[0] +"\t" + marks[1]+"\t"+ marks[2]+"\t"+marks[3]);
		
	}

}

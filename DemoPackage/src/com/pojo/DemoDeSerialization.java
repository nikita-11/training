package com.pojo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class DemoDeSerialization {public static void main(String[] args) {
	FileInputStream fi ;
		try {
			fi = new FileInputStream("student.txt") ;
			ObjectInputStream tt = new ObjectInputStream(fi) ;
			Object obj = .readObject() ;
			Student1 stu = (Student1) obj ;
			System.out.println(stu.getName() + " " + stu.getTotal());
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
	
}

}


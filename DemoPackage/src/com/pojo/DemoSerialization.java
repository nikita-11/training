package com.pojo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoSerialization {
	public static void main(String[] args) {
		Student1 student = new Student1(12,300,"ABCD") ;
		Student1 student1 = new Student1(12,600,"ACD") ;
			try {
				FileOutputStream fo = new FileOutputStream("student.txt") ;
				ObjectOutputStream oo = new ObjectOutputStream(fo) ;
				oo.writeObject(student) ;
				oo.writeObject(student1) ;
				oo.close() ;
				fo.close();
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 
		
	}

}

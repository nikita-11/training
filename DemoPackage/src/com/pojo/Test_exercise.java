package com.pojo;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Test_exercise {
	public static void main(String[] args) {
		Student1[] students= new Student1[5] ;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		int i = 0 ;
		while(i<5) {
			System.out.println("Enter name");
			try {
				String s = br.readLine() ;
				String f = br.readLine();
				int value1 = Integer.parseInt(f);
				String st = br.readLine();
				int value2 = Integer.parseInt(st);
				Student1 stt = new Student1(value1,value2,s) ;
				students[i] =  stt ;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++ ;
			
			
		}
		try {
			FileOutputStream fo = new FileOutputStream("student1.txt") ;
			ObjectOutputStream oo = new ObjectOutputStream(fo) ;
			oo.writeObject(students) ;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Completed");
		FileInputStream fi ;
		try {
			fi = new FileInputStream("student1.txt") ;
			ObjectInputStream oi = new ObjectInputStream(fi) ;
			Object obj = oi.readObject() ;
			Student1[] stu = (Student1[]) obj ;
			for(int j=0 ; j<4 ;j++) {
				if(stu[j].getRollno()==20) {
					System.out.println(stu[j].getName() +" " + stu[j].getRollno()+" " + stu[j].getTotal());
					
				}
				}
			
			
			
			
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

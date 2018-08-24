package com.pojo;

import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriting {
	public static void main(String[] args) {
		try {
			FileWriter fileW = new FileWriter("abc.txt",true) ;
			fileW.write("Citi,Pune");
			System.out.println("File created and data inserted");
			fileW.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

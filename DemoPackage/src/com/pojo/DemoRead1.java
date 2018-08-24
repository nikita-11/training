package com.pojo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoRead1 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		
//		try {
//			System.out.println("please enter name");
//			String name = br.readLine();
//			System.out.println("you entered+" + name);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			System.out.println("please enter value");
			String s = br.readLine() ;
			int value = Integer.parseInt(s);
			System.out.println("please enter value2");
			String t = br.readLine() ;
			int value2 = Integer.parseInt(t);
			if(value>value2) {
				System.out.println("bigger:" + value);
				
			}
			else {
				System.out.println("bigger:" + value2);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package com.two;

import java.util.ArrayList;

public class DemoArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(new Integer(234)) ;
		list.add(90) ;
		list.add(100) ;
		System.out.println("Number of elements=" + list.size());
		System.out.println(list) ;
		list.add(2,100) ;
		System.out.println(list) ;
		list.remove(0) ;
		System.out.println(list) ;
		list.remove(new Integer(90));
		System.out.println(list) ;
		
		
		
	}

}
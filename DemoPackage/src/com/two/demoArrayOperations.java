package com.two;

import java.util.Arrays;

public class demoArrayOperations {
	public static void main(String [] args) {
		int [] numbers = {123,45,67,232,55,12,786,343,988} ;
//		Arrays.fill(numbers, 0);
//		for(int num : numbers) {
//			System.out.println(num);
//		}
		Arrays.fill(numbers, 1, 3, 100);
		for(int num : numbers) {
			System.out.println(num);
		}
		int [] arr_copy =Arrays.copyOf(numbers, 5) ;
		for(int num : arr_copy) {
			System.out.println(num);
		}
		int  [] numbers_2 = {12,45,7,232,5,12,76,343,98} ;
		boolean data = Arrays.equals(numbers, numbers_2) ;
		if(!data) {
			System.out.println("F");
		}
		System.out.println("ggg");
		Arrays.sort(numbers);
		int index = Arrays.binarySearch(numbers,1211) ;
		System.out.println(index);
		
		
	}
	

}

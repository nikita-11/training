package com.pojo ;

import com.pojo.Person ;
import com.pojo.Employee ;

public class DemoPolymorphism {
	public static void main(String[] args) {
		Person e =new Employee() ;
		((Employee)e).display(10);
	}

}

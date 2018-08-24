package com.pojo;

import java.io.FileOutputStream;
import java.io.Serializable;

public class Student1 implements Serializable {

	private int rollno,total ;
	private String name ;
	public Student1() {
		
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student1(int rollno, int total, String name) {
		super();
		this.rollno = rollno;
		this.total = total;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", total=" + total + ", name=" + name + "]";
	}
	
	

}

package com.pojo;

public class Employee extends Person {
	private double empSalary ;
	private int empId ;
	public Employee() {
		super() ;
		empId= 0 ;
		empSalary = 1000 ;
		
	}
	public Employee(int empId , double empSalary,int age, String name) {
		super(age,name) ;
		this.empId= empId ;
		this.empSalary = empSalary ;
		
	}
	public double getempSalary() {
		return empSalary ;
	}
	public void setempSalary ( double empSalary) {
		this.empSalary = empSalary  ;
	}
//	public String getname() {
//		return empSalary ;
//	}
//	public String setname ( String  empSalary) {
//		this.empSalary = empSalary  ;
//	}
	public int getempId() {
		return empId ;
	}
	public void setempId ( int empId) {
		this.empId = empId  ;
	}
	public void display(int x) {
		super.display();
		
		System.out.println(empId + "\t" + empSalary);
		//System.out.println("Name = " + name);
		display();
	}
	
	public String toString() {
		return super.toString()  +  empId + " " + empSalary;
		}
	
	
}

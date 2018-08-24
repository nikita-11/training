package com.pojo;

public class Person {
	private int age;
	private String name;

	// access specifier return_type fun_name(){ }
	public void display() {
		System.out.println("name:-" + name + "\t" + "Age:-" + age);
	}

	public Person() {
		age = 10;
		name = "ALKA";
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	public Person(int Age, String name) {
		this.age = Age;
		this.name = name;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p = (Person) obj;
		return (p.name.equals(name) && p.age == this.age);
	}

}

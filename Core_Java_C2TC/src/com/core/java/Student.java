package com.core.java;
public class Student {

	String name;
	int roll, age;

	public Student(String name, int roll, int age) {
		this.name = name;
		this.roll = roll;
		this.age = age;

		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("prathamesh", 1, 22);
		Student s2 = new Student("prachi", 2, 22);
		Student s3 = new Student("avi", 3, 34);
		System.out.println(s1.name + " " + s1.roll + " " + s1.age);

		System.out.println(s2.name + " " + s2.roll + " " + s2.age);

		System.out.println(s3.name + " " + s3.roll + " " + s3.age);

	}

}

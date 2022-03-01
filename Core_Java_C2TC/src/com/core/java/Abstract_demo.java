package com.core.java;

public class Abstract_demo {

	public static void main(String[] args) {

		// Test t=new Test();
		// Scooty s=new Scooty();
		// s.NoWheels();

	}

}

abstract class Vehicle {
	public abstract void NoWheels();

	public abstract void m2();
}

abstract class scooty extends Vehicle {
	public void NoWheels() {
		System.out.println(2);
	}
}

package com.programs;

public class M_over2 {

	public void m(Object o) {
		System.out.print("Object class");
	}

	// public void m(StringBuffer b)// ambiguity error
	{
		System.out.print("Object class");
	}

	public void m(String s) {
		System.out.print("String class");
	}

	public static void main(String[] args) {
		M_over2 obj = new M_over2();
		// obj.m(new Object());
		obj.m("Anantika");
		obj.m(null);
	}

}
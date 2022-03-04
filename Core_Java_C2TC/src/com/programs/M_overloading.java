package com.programs;

public class M_overloading {

	public void m() {
		System.out.print("No parameters");
	}

	public void m(int i) {
		System.out.print(" i am integer method");
	}

	public void m(double d) {
		System.out.print("Iam double method");
	}

	public static void main(String[] args) {
		M_overloading obj = new M_overloading();
		obj.m();
		obj.m(6);
		obj.m(5.2);

		obj.m('a');
		obj.m(4l);
		obj.m(3.87f);
		obj.m(3);

	}

}
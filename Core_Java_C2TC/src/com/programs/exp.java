package com.programs;

public class exp {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2 / 0);
			System.out.println(3);
		} catch (ArithmeticException e)

		{
			// System.out.println(4/0);
			System.out.println(e);// content of the object class
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}

}
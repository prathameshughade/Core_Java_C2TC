package com.programs;

public class Exp_2 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2 / 0);
			System.out.println(3);
		}

		catch (NullPointerException e) {
			System.out.println(4 / 0);
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}

}
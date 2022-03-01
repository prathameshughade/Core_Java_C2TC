package com.core.java;
public class Secondforeach {

	public static void main(String[] args) {

		int[][] x = { { 10, 20, 30, 40 }, { 50, 60 } };
		for (int[] x1 : x) {
			for (int[] x2 : x) {
				System.out.println(x[2]);
			}

		}

	}
}
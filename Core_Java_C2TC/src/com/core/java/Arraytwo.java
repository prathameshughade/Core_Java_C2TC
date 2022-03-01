package com.core.java;
public class Arraytwo {

	public static void main(String[] args) {

		int[] arr = new int[3];
		System.out.println(arr[2]);

		double[] ar = new double[3];
		System.out.println(ar[2]);

		byte[][] arrr = new byte[2][3];
		System.out.println(arrr);// reference to the 2d array
		System.out.println(arrr[0]);// reference to 1 ARRAY

		System.out.println(arrr[0][0]);// element on 0,0
	}

}

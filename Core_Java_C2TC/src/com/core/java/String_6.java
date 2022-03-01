package com.core.java;
public class String_6 {

	public static void main(String[] args) {

		StringBuffer s1 = new StringBuffer("Prathamesh");

		StringBuffer s2 = new StringBuffer("Prathamesh");

		System.out.println(s1 == s2);// reference comparison
		System.out.println(s1.equals(s2)); // content comparison

	}

}

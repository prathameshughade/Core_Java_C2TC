package com.core.java;
import java.util.Scanner;

public class Rect {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an width & height:");
		// System.out.println("Enter an height:");

		int width = input.nextInt();
		int height = input.nextInt();

		int area = width * height;
		System.out.println("Area of rectangle=" + area);

	}

}

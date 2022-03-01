
package com.core.java;
import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {

		int num;
		System.out.println("Enter a number:");// reading the keyboard

		Scanner input = new Scanner(System.in);
		num = input.nextInt();// next int for taking input

		if (num % 2 == 0)
			System.out.println("Entered number is even");
		else
			System.out.println("Entered number is odd");
	}

}

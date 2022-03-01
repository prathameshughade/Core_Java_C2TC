package com.core.java;
import java.util.Scanner;

public class Switch_3 {
	
	

		public static void main(String[] args) {

			int x = 10; // byte range is till 127
			System.out.println("enter the number");

			Scanner input = new Scanner(System.in);
			x = input.nextInt();// next int for taking input

			switch (x) {

			default:
				System.out.println("default");
				break;

			case 0:

				System.out.println("0");
				break;

			case 1:
				System.out.println("1");

			case 2:
				System.out.println("2");
				break;

			// case 100+200:
			// System.out.println(300);
			// break;

			}

		}
	}



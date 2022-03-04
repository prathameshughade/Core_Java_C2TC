package com.programs;

import java.util.Scanner;

public class Exception {
	public static void main(String[] args) throws CantVisitgoa {
		int doses;
		System.out.println("Enter the no. of doses");
		Scanner v = new Scanner(System.in);
		doses = v.nextInt();

		if (doses < 2) {

			throw new CantVote("you cannot visit goa");
		} else {

			System.out.println("you can visit goa.....");
		}
	}
}

class CantVisitgoa extends RuntimeException {
	CantVisitgoa(String msg) {
		super(msg);
	}
}
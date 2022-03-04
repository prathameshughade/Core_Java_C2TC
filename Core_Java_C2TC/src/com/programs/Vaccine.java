package com.programs;

import java.util.Scanner;

public class Vaccine {
	public static void main(String[] args) throws CantVisitgoa {// throws is optional for unchecked exceptions, but
																// should use in checked exception
		boolean Vaccination = true;
		System.out.println("Enter the double vaccination status as true/false:-");
		Scanner v = new Scanner(System.in);
		Vaccination = v.nextBoolean();

		if (Vaccination == true) {
			System.out.println("you can visit goa.....");

		} else {

			throw new CantVisitgoa("you cannot visit goa");

		}
	}
}

class CantVisitgoa extends RuntimeException {
	CantVisitgoa(String msg) {
		super(msg);
	}
}
package com.programs;

import java.util.Scanner;

public class CustomizeException {

	public static void main(String[] args) {// throws CantVote{
		int age;
		System.out.println("Enter your age");
		Scanner s = new Scanner(System.in);
		age = s.nextInt();

		if (age < 18) {
			throw new CantVote("you cannot vote.....");
		} else {
			System.out.println("you can happily vote");
		}
	}

}

class CantVote extends RuntimeException {
	CantVote(String msg) {
		super(msg);// used to print the message in throw class
	}
}
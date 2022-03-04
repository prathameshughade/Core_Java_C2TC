package com.programs;

class Birds {
	void fly() {
		System.out.println("flying");
	}
}

class Sparrow extends Birds {
	void chirp() {
		System.out.println("Chirping");
	}
}

class nest extends Sparrow {
	void eat() {
		System.out.println("Eating");
	}
}

class Multi {
	public static void main(String args[]) {
		nest n = new nest();
		n.fly();
		n.chirp();
		n.eat();
	}
}
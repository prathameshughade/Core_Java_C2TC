package com.programs;

class Furniture {
	void chair() {
		System.out.println("use for sitting");
	}
}

class wood extends Furniture {
	void table() {
		System.out.println("multiple uses");
	}
}

class Single {
	public static void main(String args[]) {
		wood w = new wood();
		w.chair();
		w.table();
	}
}
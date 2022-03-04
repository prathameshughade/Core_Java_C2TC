package com.programs;

class Movies {
	void DRstrange() {
		System.out.println("fave one");
	}
}

class Avengers extends Movies {
	void tony() {
		System.out.println("Ironman");
	}
}

class Hulk extends Movies {
	void gamma() {
		System.out.println("Green Beast");
	}
}

class Hierarchical {
	public static void main(String args[]) {
		Avengers a = new Avengers();
		Hulk h = new Hulk();

		a.tony();
		h.gamma();
	}
}
package com.core.java;
public class String_1 {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("Prathamesh");// immutable object
		s.append("Ughade");
		System.out.println(s);

		String p = new String("Prathamesh");
		p.concat("Ughade");
		System.out.println(p);
		System.out.println(p.length());
		System.out.println(p.toLowerCase());
		System.out.println(p.toUpperCase());

		String upper = p.toLowerCase();
		System.out.println(upper);

		String s1 = "MUMBAI";
		System.out.println(s1.equals("mumbai"));// equals is used for comparing

		System.out.println(s1.equalsIgnoreCase("mumbai"));

		System.out.println(s1.replace('M', 'T'));
		// String u=("Prathamesh");//another method
		// u.concat("Ughade");
		// System.out.println(u);

		// System.out.println(p.trim());

		System.out.println(s.substring(5));// will print from second index

		System.out.println(s.substring(2, 6));// end index character is excluded

		// hw

		System.out.println(s1.compareTo(p));
		System.out.println(s1.contentEquals(p));
		System.out.println(s1.endsWith("I"));
		System.out.println(s1.charAt(1));
		System.out.println(s1.trim());
		System.out.println(s1.indexOf("B"));
		System.out.println(s1.startsWith("I"));
		System.out.println(s1.hashCode());
		//System.out.println(s1.repeat(10));

	}

}

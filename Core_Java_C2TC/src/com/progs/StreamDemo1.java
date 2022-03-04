package com.progs;

import java.util.*;

public class StreamDemo1 {

	public static void main(String[] args) {
	List<Integer> orig =List.of(01,45,65,33,44,88,99,655,544,55,45);
	System.out.println(orig);
	
	List<Integer> evenlist= new ArrayList<>();
	
	for (Integer i : orig)
	{
		if (i%2==0)
		{
			evenlist.add(i);
			
		}
	}
	
	System.out.println(evenlist);
	}

}
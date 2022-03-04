package com.progs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamDemo2 {

	public static void main(String[] args) {
		
	
	StreamDemo2<Integer> stream = orig StreamDemo2<>();
	List<Integer> l= stream.filter(i->i<20).collect(Collectors.tolist());
	System.out.println(l);
	}

}
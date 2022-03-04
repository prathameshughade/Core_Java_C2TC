package com.progs;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Stream3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> marks = new ArrayList<Integer>(); 
marks.add(0);
marks.add(29);
marks.add(33);
marks.add(22);
marks.add(12);
marks.add(1);
marks.add(99);

System.out.println("marks are "+marks);

ArrayList<Integer> updatedmarks = (ArrayList<Integer>) marks.stream().map(i->i+5).collect(Collectors.toList()); 
System.out.println("updatedmarks are " +updatedmarks);


long failed= marks.stream().filter(i->i<33).count();
System.out.println("failed are " +failed );

	}

}
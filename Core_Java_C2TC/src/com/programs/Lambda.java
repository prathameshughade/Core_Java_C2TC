package com.programs;

interface Anonymous
{
	void show();
	
}

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous l=()->
		
		{
			System.out.println("Lambda demo");
		};
		l.show();
		}
	}

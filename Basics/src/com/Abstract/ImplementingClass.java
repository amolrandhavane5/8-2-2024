package com.Abstract;

public class ImplementingClass extends A1{
	public ImplementingClass() {
	super(10);
	System.out.println("implementing class constructor");
	}
	
	
	

	public static void main(String[] args) {
		
		ImplementingClass ref=new ImplementingClass();
		ref.m1();
		
		

	}

	@Override
	void m1() {
		System.out.println("Implementation of m1");
		
	}

}

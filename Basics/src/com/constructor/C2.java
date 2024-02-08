package com.constructor;

public class C2 {

	C3 c;
	
	public C2 () {
		c=new C3();
		
	}
	public void m2() {
		c.m3();
		System.out.println("c2-m2");
		
	}
	public static void main(String[] args) {
		C2 ref=new C2();
		ref.m2();

	}

}

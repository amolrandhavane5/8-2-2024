package com.loop;

import abstraction.Parent;

public class Child extends Parent {
	
	

    public Child(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public void marry() {
		
		System.out.println("marry to Raveena");
	}  
    
	public void main(String[]args){
		
		Parent p=new Child(x);
		p.marry();
	
	}

}
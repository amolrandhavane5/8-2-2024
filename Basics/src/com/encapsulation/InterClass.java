package com.encapsulation;

public class InterClass extends Account{
	
	
	public void getData(int validAccNo) {
		
		if (validAccNo==12345) {
					
		System.out.println(super.getBalance(validAccNo));
		}else {
			
			System.out.println("Please eneter valid acc no");
		}
	}

	

}
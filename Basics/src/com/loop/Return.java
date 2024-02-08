package com.loop;

public class Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=12345;
		int reminder=0;
		int reverseNo=0;
		
		while (number!=0) {
			reminder=number%10;
			reverseNo=reverseNo*10+reminder;
			number=number/10;
			
		}
		System.out.println(reverseNo);
	}

}

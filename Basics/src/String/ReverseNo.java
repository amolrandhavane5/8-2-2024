package String;

public class ReverseNo {
	
	public static void main(String[] args) {
		
		int number= 12345;
		int reminder;
		
		while(number>0) {
			
			reminder=number%10;
			number=number/10;
			
			System.out.print(reminder);
		}
	}
}
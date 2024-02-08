package String;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number= 454;
		int originalNumber=number;
		int reminder=0;
		int reverseNumber=0;
		
		while(number>0) {
			
			reminder=number%10;
			reverseNumber=(reverseNumber*10)+reminder;
			number=number/10;
		}
			
		if (originalNumber==reverseNumber) {
		System.out.println(originalNumber+"=>>Number is palindrome");
		}
		else {
		System.out.println(originalNumber+"=>>Number is not palindrome");
		}
	}
}
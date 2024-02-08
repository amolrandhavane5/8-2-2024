package String;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Automation Testing";

		for (int i = s.length() - 1; i >= 0; i--) {

			System.out.print(s.charAt(i));
		}

	}

}
// "Length()" will count the total index number of string(From index 1)
// "charAt(1)" will start from the zero index of String.
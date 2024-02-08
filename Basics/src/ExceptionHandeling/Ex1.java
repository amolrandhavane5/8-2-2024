package ExceptionHandeling;
public class Ex1 {

	public static void main(String[] args) {
		
		
		System.out.println("Hi");
		
		
		try {

			System.out.println(10/0);
			
		}catch(NullPointerException e) { 
			
			System.out.println(e.getClass());
		}
		
		catch(ArithmeticException e) { 
			
			System.out.println(e.getClass());
		}
		
		System.out.println("hello");
			
		

	}

}
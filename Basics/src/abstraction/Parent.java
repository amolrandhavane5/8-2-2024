package abstraction;

 public class Parent {
	
	protected int x;
	 public Parent(int a) {
		 this.x=a;
		 System.out.println("abstract class constructor");
	 }
	 
  public void m1() {
	  
  }
	static void m2() {
		 System.out.println("m2");
	}
	static void m3(int v) {
		 System.out.println("m3");
	}

	public void main(String[] args) {
		m2();
		m3(10);
		

		

	}

	public void marry() {
		// TODO Auto-generated method stub
		
	}

}
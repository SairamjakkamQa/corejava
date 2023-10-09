package may_testing;

public class Methodinvoke {

	void apple() {
		System.out.println("red");
	}
	
	void mango() {
		
	System.out.println("Yellow");	
	apple();
		
	}
	public static void main(String[] args) {
		
		Methodinvoke m=new Methodinvoke();
		m.mango();
		
		
	}
	
	
	
}

package may_testing;

public class Child2 extends Parent1 {

	
	void snake() {
		
		System.out.println("poison");
	}
	
	void dog() {
		
		System.out.println("Pitbull");
		
	}
	
	public static void main(String[] args) {
		
		Parent1 parent=new Child2();
		
		parent.cat();
		
		parent.dog();
		
	
		
		
	}
	

	
	
	
	
}

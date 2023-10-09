package may_testing;

public class Employee {

	int empid;
	String empdomain;
	
	
//	public  Employee(int id,String domain) { //constructor
//		
//		empid=id;
//		empdomain=domain;
//		
//	}
	
	
	
	public Employee() {
		
	}
	
	
	
	void display() {
		
		System.out.println(empid);
		System.out.println(empdomain);
	}
	
	public static void main(String[] args) {
		
		
		Employee emp=new Employee();
		//Employee emp2=new Employee(128, "Nikhil");
		emp.display();
		//emp2.display();
	}
	
	
	
	
	
}

package may_testing;

public class Employe {

	int empid;
	String name;

	public Employe(int empid, String name) {

		this.empid = empid;
		this.name = name;

	}

	
	
	void display() {

		System.out.println(empid + " " + name);
	}

	public static void main(String[] args) {

		Employe emp = new Employe(127, "Rahul");
		emp.display();
	}
}

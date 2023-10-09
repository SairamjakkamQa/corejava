package may_testing;

public class Staticex {

	int empid;
	String empname;
	static String domain;

	public Staticex(int id, String name) {

		empid = id;
		empname = name;

	}
	
	
	public static void display() {
		System.out.println("Hello");
	}

	void show() {
		System.out.println(empid + " " + empname + " " + domain);
	}

	public static void main(String[] args) {

		Staticex st1 = new Staticex(100, "Rahul");
		Staticex st2 = new Staticex(101, "Rahul");
		Staticex st3 = new Staticex(102, "Rahul");
		Staticex st4 = new Staticex(103, "Rahul");
		st1.domain = "Testing";
		st1.show();
		st2.show();
		st3.show();
		st4.show();
		
		display();

	}

}

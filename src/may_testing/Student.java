package may_testing;

public class Student {

	int rollno;
	String name;
	int scholarship;

	public Student(int rollno, String name) { // constructor 1

		this.rollno = rollno;
		this.name = name;

	}

	public Student(int rollno, String name, int scholarship) { // constructor 2

		this(rollno, name); // 1st constructor invoked
		this.scholarship = scholarship;

	}

	void display() {
		System.out.println(rollno + " " + name + " " + scholarship);
	}

	public static void main(String[] args) {

		Student st1 = new Student(127, "sairam");
		Student st2 = new Student(128, "Rahul", 12000);

		st1.display();
		st2.display();

	}

}

package may_testing;

public class DefaultCons {

	int rollno;
	String name;
	long mobilenumber;

	DefaultCons(int rnumber, String Sname) { // constructor

		rollno = rnumber;
		name = Sname;

	}

	DefaultCons(int id, String names, long phone) {

		rollno = id;
		name = names;
		mobilenumber = phone;
	}

	void show() {

		System.out.println(rollno);
		System.out.println(name);
		System.out.println(mobilenumber);
	}

	public static void main(String[] args) {

		DefaultCons df = new DefaultCons(21, "Prathik");
		DefaultCons df2 = new DefaultCons(1, "Ram", 123654789);

		df.show();
		df2.show();
	}

}

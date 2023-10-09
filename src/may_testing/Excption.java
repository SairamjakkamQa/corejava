package may_testing;

public class Excption {

	
	void m1()  {
		
		
		System.out.println("sai");
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("ram");
	}
	
	
	public static void main(String[] args) throws Throwable {

		Excption ex=new Excption();
		ex.m1();
			
	}

}

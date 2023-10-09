package may_testing;

public class Tryy {

	public static void main(String[] args) {

		
		try {
			
			System.out.println(10/0); //exception
			
			System.out.println("organisation");
			
		}
		
		
		catch(Exception e) {
			
			
			e.printStackTrace();
			System.out.println(10/2);
			
			
			
			
		}
		
		finally {
			
			System.out.println("Technology");
		}
		
		
		
	}

}

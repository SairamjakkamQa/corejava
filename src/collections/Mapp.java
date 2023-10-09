package collections;

import java.util.HashMap;

public class Mapp {

	public static void main(String[] args) {

		
		HashMap hm=new HashMap();
		
		HashMap <Integer, String> hm2=new HashMap<Integer, String>();
		
		hm2.put(107, "max");
		
		hm2.put(108, "sammy");
		
		
		hm.put(101,"John");
		
		hm.put(102, "Mike");
		
		hm.put(103, null);
		
		hm.put(104, "jim");
		
		hm.put(105, null);
		
		hm.put(null, "praveen");
		
		hm.putAll(hm2);
		
	
	System.out.println(hm.entrySet());
		
	}

}

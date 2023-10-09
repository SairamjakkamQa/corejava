package collections;

import java.util.HashSet;

public class Hashsett {

	public static void main(String[] args) {

		
		HashSet set1=new HashSet();
		
		set1.add(3);
		
		set1.add(5);
		
		set1.add(7);
		
		set1.add(2);
		
		HashSet set2=new HashSet();
		
		set2.add(2);
		
		set2.add(4);
		
		set2.add(6);
		
		
	//	set1.addAll(set2); //union
		
	//	set1.retainAll(set2); //intersection
		
		set1.removeAll(set2);
		
		
		//System.out.println(set1);
		
		
		for(Object sett:set1) {
			
			System.out.print(sett+" ");
		}
		
		
	}

}

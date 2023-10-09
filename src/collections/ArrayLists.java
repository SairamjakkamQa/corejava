package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {

		
		List li=new ArrayList();
		
		
		li.add("jagadeesh");
		
		
	   ArrayList al=new ArrayList();
	   
	   al.add("ram");
	   
	   al.add(127);
	   
	   al.add("Nikhil");
	   
	   al.add("Srinath");
	   
	   al.add(4, "Raj");
	   
	  
	   al.set(3, "Aman");
	   
	   al.addAll(li);
	   
	   //al.set(2, "chandan");
	   
	 //  al.remove(2);
	   
	  // System.out.println(al);
	   
	  // System.out.println(al);
	   
	
	   
	   for(Object all:al) {
		   
		   System.out.println(all);
		   
	   }
	   
	   
//		Iterator itr=al.iterator();
//		
//		while(itr.hasNext()) {
//			
//			System.out.println(itr.next());
//			
//		}
		
		
		
	}

}

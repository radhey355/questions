package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Lists {

	public static void main(String[] args) {
		
		ArrayList<Object> list= new ArrayList<Object>();
		list.add("A");
		list.add( null);
		list.add(null);
		list.add(null);
		
	   System.out.println(list);
	   
	   ArrayList<Object> list01 = new ArrayList<Object>();
	   list01.add(1);
	   list01.add(2);
	   list01.add(3);
	   list01.add("D");
	   list.addAll(list01);
	   
	   System.out.println(list);
	System.out.println(list.get(1));
	System.out.println("============");
	Set<Object> sel01 = new HashSet<Object>();
	sel01.add(null);
	sel01.add("H");
	sel01.add("H");
	sel01.add(null);
	sel01.add(123);
	sel01.add(456);
	sel01.add(null);
	sel01.add(null);
	sel01.add(null);
	
	System.out.println(sel01);

	}

}

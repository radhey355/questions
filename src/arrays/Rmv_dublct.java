package arrays;

import java.util.HashSet;
import java.util.Set;

public class Rmv_dublct {

	public static void main(String[] args) {
		
		int a[]= {10,20,20,30,40,30,50,60,50,70};
		
		Set hesh= new HashSet();
		
		for(int i=0;i<=a.length-1;i++){
			hesh.add(a[i]);
			
			
		}
		System.out.println(hesh);

	}

}

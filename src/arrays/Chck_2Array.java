package arrays;

import java.util.Arrays;

public class Chck_2Array {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int b[]= {1,2,3,4,5,6,7,8,9,10};
		int c[]= {1,2,3,5,5,6,7,8,81,10};
	
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
	}

}

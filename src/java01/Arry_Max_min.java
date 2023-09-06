package java01;

public class Arry_Max_min {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,6,7,8,9,132,5};
		
		int max=a[0];
		int min=a[0];
		
		for(int num:a) {
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
		}
		System.out.println(max+"  max");
		System.out.println(min+"  min");

	}

}

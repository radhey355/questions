package java01;

public class Swep_No {

	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		
		System.out.println("before sweep");
		System.out.println(a+" "+b);
		
		
		int t=a;
		a=b;
		b=t;
		System.out.println("after swep");
		System.out.println(a+" "+b);
		

	}

}

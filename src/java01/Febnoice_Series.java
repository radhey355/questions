package java01;

public class Febnoice_Series {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=0;i<=5;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}

	}

}

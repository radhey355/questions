package java01;

public class Plindrm_Int {

	public static void main(String[] args) {
		
		int n=151;
		int temp=n;
		int sum=0;
		
		while(n>0) {
			int r=n%10;
			n=n/10;
			sum=(sum*10)+r;
		}
		if(temp==sum) {
		System.out.println(temp+" is palindrome"); 
		}
		else {
			System.out.println(temp+" is not palindrome");
		}
	}

}

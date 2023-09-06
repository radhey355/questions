package java01;

public class Prime1_100 {

	public static void main(String[] args) {
		

		for(int k=1;k<=100;k++) {
		int n=k;
		int count=0;
	
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;	
			}
		}
		if(count==2)
			System.out.println(n+" is prime");
		}

}
}
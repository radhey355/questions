package java01;

public class Prime_sum {

	public static void main(String[] args) {
		
		int sum=0;
		for(int k=0;k<=100;k++) {
			int n=k;
			int count=0;
		
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}
		      }
			if(count==2) {
			sum=sum+n;
		
			}
		}
		System.out.println("sum of prime = "+sum);
		
	}
}

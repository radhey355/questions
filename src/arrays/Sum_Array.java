package arrays;

public class Sum_Array {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,25,30};
		int sum=0;
		
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}

		System.out.println(sum);
	}

}

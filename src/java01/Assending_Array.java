package java01;

public class Assending_Array {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a.length-1;j++) {
				if(a[i]>a[j]) {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
			
		}
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}

	}

}

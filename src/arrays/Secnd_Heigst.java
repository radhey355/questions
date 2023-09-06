package arrays;

public class Secnd_Heigst {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60,70};
		int size=a.length;
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(a[i]<a[j]) {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
			}
		}
		System.out.println(a[size-3]);

	}

}
//Largest no
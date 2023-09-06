package java01;

public class Reverse_String_Norml {

	public static void main(String[] args) {
		
		
		String str="WELCOME";
		String revers="";
		for(int i=str.length()-1;i>=0;i--) {
			revers=revers+str.charAt(i);
		}

		System.out.println(revers);
	}

}

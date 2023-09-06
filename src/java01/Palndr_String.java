package java01;

public class Palndr_String {

	public static void main(String[] args) {
		
		String str="MaDam";
		String revers="";
		for(int i=str.length()-1;i>=0;i--) {
			revers=revers+str.charAt(i);
		}
		if(str.equalsIgnoreCase(revers)) {
			System.out.println(str+" is plindrome");
		}
		else {
			System.out.println(str+" is not palindrome");
		}

	}

}

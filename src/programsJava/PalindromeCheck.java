package programsJava;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "malayalaM";

		s=s.toLowerCase();
		char[] ch =s.toCharArray();
		int flag=0;
		int len= ch.length;

		for(int i=0; i<=(len/2);i++ ) {

			if(ch[i]==ch[(len-1-i)]) {
				//flag=0;
			}
			else {
				flag=1;
				break;
			}
		}

		if(flag==0) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

	}

}

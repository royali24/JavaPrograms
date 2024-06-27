package programsJava;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Royali Roy";
		int len= str.length();
		
		String reverse = "";
		
		for(int i=len-1; i>=0; i--) {
			reverse= reverse + str.charAt(i);
		}
		
		System.out.println(reverse);
	}

}

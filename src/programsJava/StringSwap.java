package programsJava;

public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "Royali";
		String str2 = "Tiwari";


		str1= str1+str2;

		int length = str1.length();
		
		str2 = str1.substring(0, length-str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
	}

}

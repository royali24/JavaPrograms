package programsJava;

public class StringEqualsFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str1= "abc";
		String str2 = "abc";

		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));


		String str3 = new String ("Hello");
		String str4 = new String ("Hello");

		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
	}

}

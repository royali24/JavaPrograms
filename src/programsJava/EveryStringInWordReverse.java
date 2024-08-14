package programsJava;

public class EveryStringInWordReverse {

	public static void main(String[] args) {
		System.out.println("Hello World");

		String str= "Royali Roy";

		String[] s= str.split(" ");

		int length= s.length;  //2

		System.out.println("Total strings: " + length);

		System.out.println("First string: " + s[0]);



		for(int i=0; i<length; i++){
			String rev ="";

			for(int j=(s[i].length())-1; j>=0; j--){
				char[] ch = s[i].toCharArray();

				rev= rev+ ch[j];
			}

			System.out.print(rev+" ");
		}
	}	


}

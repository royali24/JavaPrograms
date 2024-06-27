package programsJava;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "my name is royali roy";
		
		String[] words= str.split(" ");
		
		int len = words.length;
		
		String reverse ="";
		
		for(int i=len-1; i>=0; i--) {
			
			reverse = reverse + words[i]+ " ";
		}
		
		reverse = reverse.trim();
		System.out.println(reverse);
	}

}

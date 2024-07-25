package programsJava;

public class VovelPresenseCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WAP to check if vovel is present is a string
		
		String str1 = "smhdjk skjhdkjs";
		
		char[] ch1 = str1.toCharArray();
		int flag =0;
		
		for(char ch: ch1) {
			if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' ) {
				System.out.println("Vowel present");
				flag=1;
				break;
			}
			
		}
		if(flag==0) {
			System.out.println("Vowel absent");
		}
		
		String str = "anna kournikova";
		if(str.matches(".*[aeiou].*")) {
			System.out.println("Vowel present");	
		}
		else {
			System.out.println("Vowel absent");
		}
	}

}

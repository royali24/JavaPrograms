package programsJava;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= "save";
		String s2 = "Vase";
		
		s1= s1.toLowerCase();
		s2= s2.toLowerCase();
		
		char[] ch_s1= s1.toCharArray();
		char[] ch_s2= s2.toCharArray();
		
		if(ch_s1.length==ch_s2.length) {
			Arrays.sort(ch_s1);
			Arrays.sort(ch_s2);
			
			if(Arrays.equals(ch_s1,ch_s2)) {
				System.out.println("Anagram");
			}
			else
			{
				System.out.println(" not an anagram");
			}
		}
		else {
			System.out.println("String length does not match. hence its not an anagram");
		}
	}

}

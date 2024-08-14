package programsJava;

import java.util.ArrayList;

public class Swap2CharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "ro yali is";//olevyl
		
		
		// split all words into individual strings and store them in string array
		String[] splitted_string = str.split(" ");
		
		//get the count of total strings in array
		int len= splitted_string.length;

		String temp ="";

		
  //x-- loop for string in array --> x[0]: 'ro', x[1] : 'yali', x[2]: 'is'
		for(int x=0; x<len; x++) {
			
			int length = splitted_string[x].length();   //x[0]: 2, x[1] : 4, x[2]: 2
			
			char[] ch= splitted_string[x].toCharArray();  // get all chars of x[0] in a character array. 
			//In next loop get all chars of x[1] in a character array and so on....
			
			
			//now reverse the chars in the character array
			for(int i= 0; i<length; i=i+2) {
				String rev= "";

				for(int j= i; j<=i+1; j++) {

						if(j<length) 
						{

							rev= ch[j]+rev;                   //evo
						}
					}

				temp = temp+rev;
			}
			temp=temp+" ";   //add space for end of each word to create the reverse of actual string
		}
		System.out.println(temp);
	}
}